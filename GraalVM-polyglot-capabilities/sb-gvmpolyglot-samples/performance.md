Sample OP observed:
````
C:\Users\ashfa\.jdks\openjdk-23.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.1.1\lib\idea_rt.jar=50948:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.1.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\ashfa\Downloads\sb-gvmpolyglot-samples\target\classes;C:\Users\ashfa\.m2\repository\org\graalvm\polyglot\polyglot\24.1.2\polyglot-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\sdk\collections\24.1.2\collections-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\sdk\nativeimage\24.1.2\nativeimage-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\sdk\word\24.1.2\word-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\js\js-language\24.1.2\js-language-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\regex\regex\24.1.2\regex-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\truffle\truffle-api\24.1.2\truffle-api-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\shadowed\icu4j\24.1.2\icu4j-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\truffle\truffle-runtime\24.1.2\truffle-runtime-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\sdk\jniutils\24.1.2\jniutils-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\graalvm\truffle\truffle-compiler\24.1.2\truffle-compiler-24.1.2.jar;C:\Users\ashfa\.m2\repository\org\json\json\20250107\json-20250107.jar;C:\Users\ashfa\.m2\repository\org\springframework\boot\spring-boot-starter\3.4.2\spring-boot-starter-3.4.2.jar;C:\Users\ashfa\.m2\repository\org\springframework\boot\spring-boot\3.4.2\spring-boot-3.4.2.jar;C:\Users\ashfa\.m2\repository\org\springframework\spring-context\6.2.2\spring-context-6.2.2.jar;C:\Users\ashfa\.m2\repository\org\springframework\spring-aop\6.2.2\spring-aop-6.2.2.jar;C:\Users\ashfa\.m2\repository\org\springframework\spring-beans\6.2.2\spring-beans-6.2.2.jar;C:\Users\ashfa\.m2\repository\org\springframework\spring-expression\6.2.2\spring-expression-6.2.2.jar;C:\Users\ashfa\.m2\repository\io\micrometer\micrometer-observation\1.14.3\micrometer-observation-1.14.3.jar;C:\Users\ashfa\.m2\repository\io\micrometer\micrometer-commons\1.14.3\micrometer-commons-1.14.3.jar;C:\Users\ashfa\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.4.2\spring-boot-autoconfigure-3.4.2.jar;C:\Users\ashfa\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.4.2\spring-boot-starter-logging-3.4.2.jar;C:\Users\ashfa\.m2\repository\ch\qos\logback\logback-classic\1.5.16\logback-classic-1.5.16.jar;C:\Users\ashfa\.m2\repository\ch\qos\logback\logback-core\1.5.16\logback-core-1.5.16.jar;C:\Users\ashfa\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.24.3\log4j-to-slf4j-2.24.3.jar;C:\Users\ashfa\.m2\repository\org\apache\logging\log4j\log4j-api\2.24.3\log4j-api-2.24.3.jar;C:\Users\ashfa\.m2\repository\org\slf4j\jul-to-slf4j\2.0.16\jul-to-slf4j-2.0.16.jar;C:\Users\ashfa\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\ashfa\.m2\repository\org\springframework\spring-core\6.2.2\spring-core-6.2.2.jar;C:\Users\ashfa\.m2\repository\org\springframework\spring-jcl\6.2.2\spring-jcl-6.2.2.jar;C:\Users\ashfa\.m2\repository\org\yaml\snakeyaml\2.3\snakeyaml-2.3.jar;C:\Users\ashfa\.m2\repository\org\springframework\boot\spring-boot-configuration-processor\3.4.2\spring-boot-configuration-processor-3.4.2.jar;C:\Users\ashfa\.m2\repository\org\projectlombok\lombok\1.18.36\lombok-1.18.36.jar;C:\Users\ashfa\.m2\repository\org\slf4j\slf4j-api\2.0.16\slf4j-api-2.0.16.jar com.example.js.samples.StudentAverageCalculator

[To redirect Truffle log output to a file use one of the following options:
* '--log.file=<path>' if the option is passed using a guest language launcher.
* '-Dpolyglot.log.file=<path>' if the option is passed using the host Java launcher.
* Configure logging using the polyglot embedding API.]
[engine] WARNING: The polyglot engine uses a fallback runtime that does not support runtime compilation to native code.
Execution without runtime compilation will negatively impact the guest application performance.
The following cause was found: JVMCI is not enabled for this JVM. Enable JVMCI using -XX:+EnableJVMCI.
For more information see: https://www.graalvm.org/latest/reference-manual/embed-languages/#runtime-optimization-support.
To disable this warning use the '--engine.WarnInterpreterOnly=false' option or the '-Dpolyglot.engine.WarnInterpreterOnly=false' system property.


OP
{"students":[{"id":101,"name":"Tom","average_score":84.33},{"id":102,"name":"Emma","average_score":88.33}]}
````



The output we encountered includes warnings indicating that the GraalVM polyglot engine is operating in a mode that doesn't support runtime compilation to native code, which can adversely affect performance. This situation arises because the Java Virtual Machine Compiler Interface (JVMCI) is not enabled in our current JVM configuration.

**Understanding the Warning:**

The warning message suggests that the polyglot engine is using a fallback runtime without support for runtime compilation to native code. This fallback mode can lead to suboptimal performance for guest applications. The primary cause is that JVMCI is not enabled in our JVM. JVMCI is a privileged, low-level interface to the JVM that allows a compiler written in Java to be used by the JVM as a dynamic compiler. Enabling JVMCI allows the Graal compiler to function as the Just-In-Time (JIT) compiler, enhancing performance. citeturn0search7

**Steps to Resolve:**

1. **Enable JVMCI:**

   To enable JVMCI, we need to pass the `-XX:+EnableJVMCI` option to the JVM. This can be done by adding the following argument when running our Java application:

   ```bash
   java -XX:+EnableJVMCI -cp our-application.jar com.ourApp.ourMainClass
   ```

   This command enables the JVMCI interface, allowing the JVM to utilize the Graal compiler for runtime compilation. citeturn0search1

2. **Enable the Graal JIT Compiler:**

   In addition to enabling JVMCI, we should also enable the Graal JIT compiler by adding the `-XX:+UseGraalJIT` option:

   ```bash
   java -XX:+EnableJVMCI -XX:+UseGraalJIT -cp our-application.jar com.ourApp.ourMainClass
   ```

   This configuration ensures that the Graal JIT compiler is used as the top-tier compiler, providing optimized performance for our application. citeturn0search1

3. **Suppressing the Warning (Optional):**

   If we prefer to suppress the warning message without enabling JVMCI, we can disable the warning by setting the `polyglot.engine.WarnInterpreterOnly` system property to `false`:

   ```bash
   java -Dpolyglot.engine.WarnInterpreterOnly=false -cp our-application.jar com.ourApp.ourMainClass
   ```

   However, be aware that suppressing the warning does not address the underlying performance implications. It's generally recommended to enable JVMCI and the Graal JIT compiler to achieve optimal performance. citeturn0search2

**Additional Considerations:**

- **Ensure Compatibility:** Verify that our JVM version is compatible with GraalVM and supports JVMCI. GraalVM includes a version of the HotSpot JVM that supports JVMCI. citeturn0search7

- **Logging Configuration:** To redirect Truffle log output to a file, we can use the `-Dpolyglot.log.file=<path>` system property when launching our Java application:

  ```bash
  java -Dpolyglot.log.file=graalvm.log -cp our-application.jar com.ourApp.ourMainClass
  ```

  This configuration directs the log output to the specified file, helping we manage and review logs more effectively

By following these steps, we can enable runtime compilation to native code in the GraalVM polyglot engine, thereby improving the performance of our Java application that executes JavaScript code. 