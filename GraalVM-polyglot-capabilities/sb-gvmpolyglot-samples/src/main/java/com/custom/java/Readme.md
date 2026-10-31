
### Why Java Isn’t a “Guest Language” in GraalVM Polyglot

GraalVM’s polyglot API is designed to allow a host application (written in Java) to dynamically evaluate code written in other languages (such as JavaScript, Python, Ruby, or R). The design rationale is based on the following points:

1. **Java as the Host Language:**  
   In a GraalVM application, Java is already the primary language running on the JVM (or via ahead-of-time compilation using Native Image). Because Java is compiled into bytecode and run by the JVM (or Substrate VM in the native case), it already has a fully optimized and mature runtime system. There is no separate interpreter or guest runtime for Java—the compilation process (using the Java compiler or JShell) is distinct from the dynamic language evaluation process that GraalVM supports for truly dynamic languages.

2. **Different Execution Models:**  
   Guest languages (e.g., JavaScript, Python) in GraalVM are implemented using the Truffle framework. They are interpreted or compiled just-in-time (JIT) within a polyglot context and benefit from the interoperability layer provided by GraalVM. In contrast, Java code is typically compiled ahead of time (or even with the JIT in HotSpot) and executed directly on the JVM. Embedding Java as a guest language would require a separate interpreter or a dynamic compiler that mimics the behavior of the Java compiler, which is not the intended design of GraalVM’s polyglot API.

3. **Separation of Concerns:**  
   The polyglot API aims to bridge languages that have very different execution semantics. Java, being a statically compiled language with a rich ecosystem of build and deployment tools, is best managed using its existing tooling (e.g., javac, JShell, or even dynamic compilation libraries). Dynamic code execution (interpreting code from a string) is a natural fit for languages like JavaScript and Python that are designed for interactive use, whereas Java’s design favors compilation and strong type-checking at compile time.

4. **Historical and Practical Reasons:**  
   GraalVM was developed to overcome limitations in the interoperability between Java and other languages on the JVM. When Oracle announced the deprecation of Nashorn (the JavaScript engine previously bundled with the JDK), one of the goals was to offer a modern polyglot environment that can natively run guest languages alongside Java. Instead of re-implementing Java as an interpreted language within this environment (which would be redundant and could compromise performance), the focus was placed on integrating other dynamic languages that can benefit from GraalVM’s advanced optimization and interoperability features.

---

### Articles and Documentation That Discuss This

- **GraalVM Official Documentation – Embedding Languages:**  
  The [Embedding Languages](https://www.graalvm.org/21.3/reference-manual/embed-languages/) section in the GraalVM Reference Manual explains how guest languages are embedded in a host Java application, and why the model is designed primarily for languages that run on top of Truffle rather than Java itself.

- **GraalVM Polyglot API Overview:**  
  In the GraalVM [Polyglot API documentation](https://www.graalvm.org/reference-manual/polyglot/), you will find that the API is geared towards dynamically evaluating code in languages like JavaScript and Python. The Java language is not listed as one of the supported “guest” languages because it is already the runtime environment.

- **Articles on Java’s Role in GraalVM:**  
  While there isn’t a specific article solely titled “Why Java can’t be evaluated as a guest language in GraalVM,” discussions in developer communities (such as on Stack Overflow and GitHub issues) reinforce the point that Java’s compilation model and runtime are inherently different. For example, discussions on the [GraalVM GitHub repository](https://github.com/oracle/graalvm-demos) and in related blog posts emphasize that dynamic code evaluation for Java is better handled with tools like JShell.

---

### Summary

GraalVM’s polyglot API does not support treating Java as a guest language because Java is already the primary language of the host environment. Java code is compiled and executed using the JVM (or via Native Image) and is not meant to be dynamically interpreted in the same way as languages like JavaScript or Python. Instead, if dynamic evaluation of Java code is needed, the recommended approach is to use the built-in JShell API or other dynamic compilation tools that are designed specifically for Java.

---
