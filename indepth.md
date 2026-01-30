# GraalVM Native Image: A Technical Deep Dive

This document outlines the technical process behind GraalVM Native Image, explaining how it compiles a Java application into a standalone executable that does not require a traditional JVM for execution.

## The Shift from JIT to AOT

In a standard JVM environment, our application runs via Just-In-Time (JIT) compilation. The JVM loads bytecode (`.class` files), interprets it, and then compiles frequently executed "hot" methods into optimized machine code at runtime. This process is dynamic and happens while the application is running.

GraalVM Native Image flips this model on its head. It performs Ahead-Of-Time (AOT) compilation, moving the compilation and optimization work from runtime to build time.

## The Core Principle: The Closed-World Assumption

The entire process is built on the "closed-world assumption." At build time, the Native Image builder assumes it knows everything about the application:

- All bytecode that will ever be executed.
- All classes, methods, and fields that are reachable.
- All resources, proxy definitions, and reflection targets.

If something isn't discoverable through static analysis at build time, it won't be included in the final executable. This is a fundamental constraint and trade-off for the benefits we gain.

## The Native Image Build Process: A Step-by-Step Flow

Here’s a breakdown of what happens when we trigger a native build (e.g., with `mvnw native:compile`).

```
[Java Source] -> [javac] -> [Java Bytecode] -> [GraalVM Native Image Builder] -> [Native Executable]
```

The magic happens inside the **Native Image Builder**.

### 1. Static Analysis and Reachability

The process starts from the main entry points of our application (typically the `main` method). The builder performs a sophisticated static analysis, traversing the bytecode to determine every piece of code that is "reachable."

- It follows every method call.
- It identifies every class that is instantiated.
- It tracks every field that is accessed.

Any code that is not reachable from an entry point is considered dead code and is eliminated. This is the first major step in reducing the final binary size.

### 2. Handling the Dynamic Parts of Java

The closed-world assumption clashes with Java's dynamic features. Static analysis alone cannot determine:

- **Reflection:** Which classes, methods, or fields will be accessed via `Class.forName()` or `Method.invoke()`.
- **Dynamic Proxies:** Interfaces that will be implemented at runtime.
- **Resources:** `.properties` files or other resources loaded from the classpath.
- **JNI (Java Native Interface):** Calls to native C/C++ libraries.

To solve this, we must provide the builder with configuration files. Frameworks like Spring Boot, Quarkus, and Micronaut are instrumental here because their build plugins automatically generate most of this configuration for us by analyzing our code and its dependencies. Without this automation, we would have to supply these hints manually.

### 3. Ahead-of-Time (AOT) Compilation

Once the builder has a complete picture of all reachable code and the necessary dynamic feature configurations, it begins compilation.

- The Graal compiler (the same one used for JIT in GraalVM's JDK mode) compiles the Java bytecode directly into platform-specific machine code (e.g., x86-64 assembly).
- This is not a 1:1 translation. The compiler performs aggressive optimizations, such as inlining, escape analysis, and dead code elimination, based on the complete "world view" it has.

### 4. Heap Snapshotting and Pre-initialization

For extremely fast startup, the Native Image builder pre-initializes parts of our application at build time.

- It runs the static initializers for all reachable classes.
- This creates a partial heap containing initialized objects, static data, and other application state.
- This pre-initialized heap is then saved as a "heap snapshot" directly into the data section of the final executable.

When the executable starts, instead of running classloaders and static initializers, the OS simply maps this data section into memory. The application effectively resumes from a pre-warmed state, which is a primary reason for the near-instant startup.

### 5. The Substrate VM: The "JVM" Replacement

The compiled application code is not alone in the executable. It is bundled with a minimal, purpose-built runtime called the **Substrate VM (SVM)**. The SVM is the replacement for a full-blown JVM and provides essential runtime services:

- **Memory Management:** A garbage collector (GC). We can choose from different GC implementations depending on our latency and throughput needs.
- **Thread Scheduling:** A system for managing application threads.
- **Signal Handling:** For interacting with the underlying operating system.
- **JNI Support:** If our application uses native libraries.

The Substrate VM is highly optimized and contains only the components necessary to run the compiled application code. It does not include an interpreter or a JIT compiler, which dramatically reduces its memory footprint and complexity compared to a traditional JVM.

### 6. Linking and Executable Generation

In the final step, the builder takes all the components and links them together:

- The AOT-compiled application code.
- The AOT-compiled code from all dependencies (JDK libraries included).
- The Substrate VM runtime components.
- The heap snapshot.
- Any other required static assets or resources.

The result is a single, self-contained, platform-native executable (like a C++ or Go binary) that can be run directly by the operating system.

## Runtime Behavior vs. Traditional JVM

| Aspect          | Traditional JVM                                       | GraalVM Native Executable                               |
|-----------------|-------------------------------------------------------|---------------------------------------------------------|
| **Startup**     | Slow. Involves class loading, verification, interpretation, and JIT warmup. | Fast. OS loads the executable, maps the heap, and runs. |
| **Memory Usage**| High. Includes JVM, JIT compiler, profiling data, and class metadata. | Low. Minimal Substrate VM and no runtime compiler overhead. |
| **Deployment**  | Requires a JVM on the target machine.                   | Standalone. No external dependencies needed.            |
| **Build Time**  | Fast. `javac` is quick.                               | Slow. Static analysis and AOT compilation are intensive. |
| **Performance** | Excellent peak throughput after JIT warmup. Can re-optimize at runtime. | Good throughput. Cannot re-optimize at runtime. Peak performance may be lower than a fully warmed-up JIT. |
| **Debugging**   | Mature ecosystem of tools (JMX, JVMTI agents).       | Requires native debuggers (like GDB) and has different tooling. |

## Conclusion

GraalVM Native Image offers a powerful alternative to the traditional JVM deployment model. By shifting the workload from runtime to build time, it creates highly optimized, fast-starting, and resource-efficient executables. This is achieved through a combination of a closed-world static analysis, ahead-of-time compilation, and the inclusion of a minimal Substrate VM for essential runtime services. The trade-off is a more constrained, less dynamic execution environment and a longer build process, but for many modern applications like microservices and serverless functions, the benefits are compelling.
