 - mvn -Pnative native:compile


```
Terminating due to java.lang.OutOfMemoryError: GC overhead limit exceeded
```

- use  :

 - mvn -Pnative native:compile "-DbuildArgs=-J-Xmx6g"


```
❯❯ demo  22:07 mvn -Pnative native:compile "-DbuildArgs=-J-Xmx6g"
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> native:0.10.6:compile (default-cli) > package @ demo >>>
[INFO]
[INFO] --- native:0.10.6:add-reachability-metadata (add-reachability-metadata) @ demo ---
[INFO] [graalvm reachability metadata repository for ch.qos.logback:logback-classic:1.5.25]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for ch.qos.logback:logback-classic:1.5.25]: Configuration directory is ch.qos.logback\logback-classic\1.4.9
[INFO] [graalvm reachability metadata repository for com.zaxxer:HikariCP:6.3.3]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for com.zaxxer:HikariCP:6.3.3]: Configuration directory is com.zaxxer\HikariCP\5.0.1
[INFO] [graalvm reachability metadata repository for org.hibernate.orm:hibernate-core:6.6.41.Final]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.hibernate.orm:hibernate-core:6.6.41.Final]: Configuration directory is org.hibernate.orm\hibernate-core\6.6.0.Final
[INFO] [graalvm reachability metadata repository for org.jboss.logging:jboss-logging:3.6.1.Final]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.jboss.logging:jboss-logging:3.6.1.Final]: Configuration directory is org.jboss.logging\jboss-logging\3.5.0.Final
[INFO] [graalvm reachability metadata repository for org.glassfish.jaxb:jaxb-runtime:4.0.6]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.glassfish.jaxb:jaxb-runtime:4.0.6]: Configuration directory is org.glassfish.jaxb\jaxb-runtime\3.0.2
[INFO] [graalvm reachability metadata repository for com.fasterxml.jackson.core:jackson-databind:2.19.4]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for com.fasterxml.jackson.core:jackson-databind:2.19.4]: Configuration directory is com.fasterxml.jackson.core\jackson-databind\2.15.2
[INFO] [graalvm reachability metadata repository for org.apache.tomcat.embed:tomcat-embed-core:10.1.50]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.apache.tomcat.embed:tomcat-embed-core:10.1.50]: Configuration directory is org.apache.tomcat.embed\tomcat-embed-core\10.0.20
[INFO] [graalvm reachability metadata repository for org.postgresql:postgresql:42.7.7]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.postgresql:postgresql:42.7.7]: Configuration directory is org.postgresql\postgresql\42.7.3
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ demo ---
[INFO] Copying 2 resources from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.14.1:compile (default-compile) @ demo ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ demo ---
[INFO] skip non existing resourceDirectory C:\Users\ashfa\Downloads\demo\src\test\resources
[INFO]
[INFO] --- compiler:3.14.1:testCompile (default-testCompile) @ demo ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- surefire:3.5.4:test (default-test) @ demo ---
[WARNING]  Parameter 'systemProperties' is deprecated: Use systemPropertyVariables instead.
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.example.demo.DemoApplicationTests
22:07:05.101 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.demo.DemoApplicationTests]: DemoApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
22:07:05.231 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.demo.DemoApplication for test class com.example.demo.DemoApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.10)

2026-01-29T22:07:05.612+05:30  INFO 16392 --- [demo] [           main] com.example.demo.DemoApplicationTests    : Starting DemoApplicationTests using Java 17.0.18 with PID 16392 (started by ashfa in C:\Users\ashfa\Downloads\demo)
2026-01-29T22:07:05.613+05:30  INFO 16392 --- [demo] [           main] com.example.demo.DemoApplicationTests    : No active profile set, falling back to 1 default profile: "default"
2026-01-29T22:07:06.121+05:30  INFO 16392 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-01-29T22:07:06.209+05:30  INFO 16392 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 77 ms. Found 1 JPA repository interface.
2026-01-29T22:07:06.549+05:30  INFO 16392 --- [demo] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-01-29T22:07:06.604+05:30  INFO 16392 --- [demo] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.41.Final
2026-01-29T22:07:06.639+05:30  INFO 16392 --- [demo] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-01-29T22:07:06.943+05:30  INFO 16392 --- [demo] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-01-29T22:07:06.974+05:30  INFO 16392 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-01-29T22:07:07.075+05:30  INFO 16392 --- [demo] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@15d65fcf
2026-01-29T22:07:07.076+05:30  INFO 16392 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-01-29T22:07:07.112+05:30  WARN 16392 --- [demo] [           main] org.hibernate.orm.deprecation            : HHH90000025: PostgreSQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-01-29T22:07:07.134+05:30  INFO 16392 --- [demo] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
        Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
        Database driver: undefined/unknown
        Database version: 17.0
        Autocommit mode: undefined/unknown
        Isolation level: undefined/unknown
        Minimum pool size: undefined/unknown
        Maximum pool size: undefined/unknown
2026-01-29T22:07:07.761+05:30  INFO 16392 --- [demo] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-01-29T22:07:07.844+05:30  INFO 16392 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-01-29T22:07:08.064+05:30  WARN 16392 --- [demo] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-01-29T22:07:08.407+05:30  INFO 16392 --- [demo] [           main] com.example.demo.DemoApplicationTests    : Started DemoApplicationTests in 3.054 seconds (process running for 3.871)
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.759 s -- in com.example.demo.DemoApplicationTests
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- spring-boot:3.5.10:process-aot (process-aot) @ demo ---

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.10)

2026-01-29T22:07:10.164+05:30  INFO 14680 --- [demo] [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 17.0.18 with PID 14680 (C:\Users\ashfa\Downloads\demo\target\classes started by ashfa in C:\Users\ashfa\Downloads\demo)
2026-01-29T22:07:10.167+05:30  INFO 14680 --- [demo] [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2026-01-29T22:07:11.130+05:30  INFO 14680 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-01-29T22:07:11.219+05:30  INFO 14680 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 74 ms. Found 1 JPA repository interface.
[INFO]
[INFO] --- jar:3.4.2:jar (default-jar) @ demo ---
[INFO] Building jar: C:\Users\ashfa\Downloads\demo\target\demo-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot:3.5.10:repackage (repackage) @ demo ---
[INFO] Replacing main artifact C:\Users\ashfa\Downloads\demo\target\demo-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to C:\Users\ashfa\Downloads\demo\target\demo-0.0.1-SNAPSHOT.jar.original
[INFO]
[INFO] <<< native:0.10.6:compile (default-cli) < package @ demo <<<
[INFO]
[INFO]
[INFO] --- native:0.10.6:compile (default-cli) @ demo ---
[INFO] Found GraalVM installation from JAVA_HOME variable.
[INFO] [graalvm reachability metadata repository for ch.qos.logback:logback-classic:1.5.25]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for ch.qos.logback:logback-classic:1.5.25]: Configuration directory is ch.qos.logback\logback-classic\1.4.9
[INFO] [graalvm reachability metadata repository for com.zaxxer:HikariCP:6.3.3]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for com.zaxxer:HikariCP:6.3.3]: Configuration directory is com.zaxxer\HikariCP\5.0.1
[INFO] [graalvm reachability metadata repository for org.hibernate.orm:hibernate-core:6.6.41.Final]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.hibernate.orm:hibernate-core:6.6.41.Final]: Configuration directory is org.hibernate.orm\hibernate-core\6.6.0.Final
[INFO] [graalvm reachability metadata repository for org.jboss.logging:jboss-logging:3.6.1.Final]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.jboss.logging:jboss-logging:3.6.1.Final]: Configuration directory is org.jboss.logging\jboss-logging\3.5.0.Final
[INFO] [graalvm reachability metadata repository for org.glassfish.jaxb:jaxb-runtime:4.0.6]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.glassfish.jaxb:jaxb-runtime:4.0.6]: Configuration directory is org.glassfish.jaxb\jaxb-runtime\3.0.2
[INFO] [graalvm reachability metadata repository for com.fasterxml.jackson.core:jackson-databind:2.19.4]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for com.fasterxml.jackson.core:jackson-databind:2.19.4]: Configuration directory is com.fasterxml.jackson.core\jackson-databind\2.15.2
[INFO] [graalvm reachability metadata repository for org.apache.tomcat.embed:tomcat-embed-core:10.1.50]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.apache.tomcat.embed:tomcat-embed-core:10.1.50]: Configuration directory is org.apache.tomcat.embed\tomcat-embed-core\10.0.20
[INFO] [graalvm reachability metadata repository for org.postgresql:postgresql:42.7.7]: Configuration directory not found. Trying latest version.
[INFO] [graalvm reachability metadata repository for org.postgresql:postgresql:42.7.7]: Configuration directory is org.postgresql\postgresql\42.7.3
[INFO] Executing: C:\openjdk\graalvm-jdk-17\bin\native-image.cmd @target\tmp\native-image-13265961905172503160.args
========================================================================================================================
GraalVM Native Image: Generating 'demo' (executable)...
========================================================================================================================
For detailed information and explanations on the build output, visit:
https://github.com/oracle/graal/blob/master/docs/reference-manual/native-image/BuildOutput.md
------------------------------------------------------------------------------------------------------------------------
[1/8] Initializing...                                                                                   (21.2s @ 0.22GB)
 Java version: 17.0.18+8-LTS, vendor version: Oracle GraalVM 17.0.18+8.1
 Graal compiler: optimization level: 2, target machine: x86-64-v3, PGO: ML-inferred
 C compiler: cl.exe (microsoft, x64, 19.44.35215)
 Garbage collector: Serial GC (max heap size: 80% of RAM)
 2 user-specific feature(s)
 - org.eclipse.angus.activation.nativeimage.AngusActivationFeature
 - org.springframework.aot.nativex.feature.PreComputeFieldFeature
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
[2/8] Performing analysis...  [*******]                                                                (103.2s @ 2.83GB)
  32,591 (92.93%) of 35,070 types reachable
  52,910 (68.68%) of 77,036 fields reachable
 179,904 (64.96%) of 276,947 methods reachable
   9,617 types, 1,116 fields, and 10,503 methods registered for reflection
      85 types,    78 fields, and    70 methods registered for JNI access
       5 native libraries: crypt32, ncrypt, psapi, version, winhttp
[3/8] Building universe...                                                                              (18.1s @ 2.76GB)
[4/8] Parsing methods...      [*****]                                                                   (24.5s @ 2.43GB)
[5/8] Inlining methods...     [****]                                                                     (3.5s @ 2.24GB)
[6/8] Compiling methods...    [************]                                                           (151.5s @ 4.31GB)
[7/8] Layouting methods...    [*****]                                                                   (26.1s @ 4.57GB)
[8/8] Creating image...       [****]                                                                    (17.3s @ 4.80GB)
  99.66MB (62.67%) for code area:   102,779 compilation units
  58.46MB (36.76%) for image heap:  672,044 objects and 195 resources
 931.08kB ( 0.57%) for other data
 159.04MB in total
------------------------------------------------------------------------------------------------------------------------
Top 10 origins of code area:                                Top 10 object types in image heap:
  22.71MB hibernate-core-6.6.41.Final.jar                     22.43MB byte[] for code metadata
  18.43MB java.base                                            7.62MB byte[] for java.lang.String
   7.44MB svm.jar (Native Image)                               6.30MB java.lang.Class
   5.74MB tomcat-embed-core-10.1.50.jar                        5.16MB java.lang.String
   4.95MB java.xml                                             4.38MB byte[] for general heap data
   3.82MB java.desktop                                         2.22MB byte[] for reflection metadata
   3.43MB spring-data-jpa-3.5.8.jar                            1.49MB com.oracle.svm.core.hub.DynamicHubCompanion
   2.83MB jackson-databind-2.19.4.jar                          1.43MB byte[] for embedded resources
   2.67MB spring-boot-3.5.10.jar                             929.25kB c.o.svm.core.hub.DynamicHub$ReflectionMetadata
   2.59MB spring-core-6.2.15.jar                             704.35kB java.lang.String[]
  24.31MB for 115 more packages                                5.14MB for 5622 more object types
------------------------------------------------------------------------------------------------------------------------
Recommendations:
 PGO:  Use Profile-Guided Optimizations ('--pgo') for improved throughput.
 AWT:  Use the tracing agent to collect metadata for AWT.
 HEAP: Set max heap for improved and more predictable memory usage.
 CPU:  Enable more CPU features with '-march=native' for improved performance.
 QBM:  Use the quick build mode ('-Ob') to speed up builds during development.
------------------------------------------------------------------------------------------------------------------------
                       39.9s (10.7% of total time) in 320 GCs | Peak RSS: 6.38GB | CPU load: 9.82
------------------------------------------------------------------------------------------------------------------------
Produced artifacts:
 C:\Users\ashfa\Downloads\demo\target\awt.dll (jdk_library)
 C:\Users\ashfa\Downloads\demo\target\demo.exe (executable)
 C:\Users\ashfa\Downloads\demo\target\jaas.dll (jdk_library)
 C:\Users\ashfa\Downloads\demo\target\java.dll (jdk_library_shim)
 C:\Users\ashfa\Downloads\demo\target\javaaccessbridge.dll (jdk_library)
 C:\Users\ashfa\Downloads\demo\target\javajpeg.dll (jdk_library)
 C:\Users\ashfa\Downloads\demo\target\jawt.dll (jdk_library)
 C:\Users\ashfa\Downloads\demo\target\jvm.dll (jdk_library_shim)
 C:\Users\ashfa\Downloads\demo\target\lcms.dll (jdk_library)
 C:\Users\ashfa\Downloads\demo\target\w2k_lsa_auth.dll (jdk_library)
========================================================================================================================
Finished generating 'demo' in 6m 8s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  06:33 min
[INFO] Finished at: 2026-01-29T22:13:36+05:30
[INFO] ------------------------------------------------------------------------

```

output :

```
❯❯ demo  22:15 ls .\target\


    Directory: C:\Users\ashfa\Downloads\demo\target


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----

-a----         1/29/2026  10:07 PM       53044040 demo-0.0.1-SNAPSHOT.jar
-a----         1/29/2026  10:13 PM      166760448 demo.exe


❯❯ demo  22:15
```

App run :


```
❯❯ demo  22:15 cd .\target\
❯❯ target  22:16 .\demo.exe

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.10)

2026-01-29T22:16:43.926+05:30  INFO 44892 --- [demo] [           main] com.example.demo.DemoApplication         : Starting AOT-processed DemoApplication using Java 17.0.18 with PID 44892 (C:\Users\ashfa\Downloads\demo\target\demo.exe started by ashfa in C:\Users\ashfa\Downloads\demo\target)
2026-01-29T22:16:43.926+05:30  INFO 44892 --- [demo] [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2026-01-29T22:16:44.009+05:30  INFO 44892 --- [demo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-01-29T22:16:44.010+05:30  INFO 44892 --- [demo] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-01-29T22:16:44.011+05:30  INFO 44892 --- [demo] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.50]
2026-01-29T22:16:44.017+05:30  INFO 44892 --- [demo] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-01-29T22:16:44.017+05:30  INFO 44892 --- [demo] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 91 ms
2026-01-29T22:16:44.027+05:30  INFO 44892 --- [demo] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-01-29T22:16:44.028+05:30  INFO 44892 --- [demo] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.41.Final
2026-01-29T22:16:44.029+05:30  INFO 44892 --- [demo] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-01-29T22:16:44.032+05:30  INFO 44892 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-01-29T22:16:44.062+05:30  INFO 44892 --- [demo] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@75c14b2c
2026-01-29T22:16:44.063+05:30  INFO 44892 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-01-29T22:16:44.083+05:30  WARN 44892 --- [demo] [           main] org.hibernate.orm.deprecation            : HHH90000025: PostgreSQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-01-29T22:16:44.085+05:30  INFO 44892 --- [demo] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
        Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
        Database driver: undefined/unknown
        Database version: 17.0
        Autocommit mode: undefined/unknown
        Isolation level: undefined/unknown
        Minimum pool size: undefined/unknown
        Maximum pool size: undefined/unknown
2026-01-29T22:16:44.093+05:30  INFO 44892 --- [demo] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-01-29T22:16:44.153+05:30  INFO 44892 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-01-29T22:16:44.165+05:30  WARN 44892 --- [demo] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-01-29T22:16:44.206+05:30  INFO 44892 --- [demo] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2026-01-29T22:16:44.207+05:30  INFO 44892 --- [demo] [           main] com.example.demo.DemoApplication         : Started DemoApplication in 0.292 seconds (process running for 0.297)
2026-01-29T22:17:06.540+05:30  INFO 44892 --- [demo] [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-01-29T22:17:06.540+05:30  INFO 44892 --- [demo] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-01-29T22:17:06.540+05:30  INFO 44892 --- [demo] [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
Hibernate:
    select
        ue1_0.id,
        ue1_0.date_of_birth,
        ue1_0.email,
        ue1_0.first_name,
        ue1_0.gender,
        ue1_0.last_name,
        ue1_0.mobile_number
    from
        public.users ue1_0

```



# Understanding the Maven Native Build Log

---

## 1) What we asked Maven to do

We ran:

```
mvn -Pnative native:compile -DbuildArgs=-J-Xmx6g
```

In simple terms, we told Maven:

* build the application normally
* run Spring Boot’s AOT processing
* then invoke GraalVM `native-image`
* give the native-image builder more heap so it doesn’t choke during compilation

This is **not one step**. It’s a pipeline.

---

## 2) High-level build flow (mental model)

Think of the build as:

1. Prepare metadata for native image (reflection, proxies, resources)
2. Build + test JVM version (sanity check)
3. Run Spring AOT (generate optimized wiring)
4. Package the app
5. Run GraalVM native-image (analysis → compilation → binary)
6. Produce `.exe`

Now let’s map that mental model to the logs.

---

## 3) Reachability metadata phase (first time)

```
--- native:add-reachability-metadata ---
Configuration directory not found. Trying latest version.
```

What we see here:

* GraalVM needs configuration for libraries that use reflection and proxies
* Instead of writing JSON by hand, the plugin downloads **reachability metadata**
* Our dependency versions (Hibernate, Jackson, Tomcat, Hikari, Postgres driver) don’t have an exact metadata match
* The plugin falls back to the closest compatible version

This is expected.

From a developer point of view:

* This metadata is *best effort*
* If native build or runtime fails later, this is often the first suspect

---

## 4) Normal Maven lifecycle (resources → compile → test)

```
--- compiler:compile ---
--- surefire:test ---
Running DemoApplicationTests
```

At this stage:

* We are still in **normal JVM land**
* Code is compiled as bytecode
* Tests run using the regular JVM
* Spring Boot starts fully (JPA, Hibernate, Hikari, Postgres)

Why this matters:

* Native compilation is expensive
* We want to fail fast if the app is broken
* Passing tests here means the functional baseline is correct

---

## 5) Spring Boot AOT processing

```
--- spring-boot:process-aot ---
Starting DemoApplication using Java 17
Bootstrapping Spring Data JPA repositories
```

This is a **critical transition point**.

What Spring is doing here:

* Starting the application in a special AOT mode
* Discovering beans, configurations, repositories
* Generating AOT-optimized classes
* Recording runtime hints (reflection, proxies, resources)
* Freezing a lot of “dynamic” Spring behavior into generated code

After this step:

* Spring will no longer rely on runtime classpath scanning in the native executable
* The application becomes much more static and predictable

This is where Spring adapts itself to GraalVM’s closed-world model.

---

## 6) Jar packaging still happens

```
--- jar ---
--- spring-boot:repackage ---
```

Even though we want a native binary:

* Maven still produces the fat Spring Boot jar
* This jar is useful for JVM runs and debugging
* Native compilation uses compiled classes + dependencies, not the jar itself

So seeing the jar is expected.

---

## 7) Native compilation really begins

```
--- native:compile ---
Found GraalVM installation from JAVA_HOME
Executing: native-image.cmd ...
```

Now we leave Maven/Spring territory and enter **GraalVM territory**.

From here on:

* Everything is about static analysis and machine code generation
* No JVM assumptions anymore

---

## 8) Native-image phase breakdown (the 8 steps)

### [1/8] Initializing

```
Java version: 17
C compiler: cl.exe
2 user-specific feature(s)
```

What’s happening:

* GraalVM initializes its compiler infrastructure
* Detects OS, CPU, C compiler
* Loads build-time features (Spring AOT hooks, activation features)
* Logging warnings here are about the build tool itself, not our app

---

### [2/8] Performing analysis (the closed world)

```
32,591 types reachable
179,904 methods reachable
9,617 types registered for reflection
```

This is the heart of native-image.

What happens here:

* GraalVM starts from `main()`
* It walks the entire call graph
* Only reachable code is kept
* Reflection and JNI registrations are merged in
* Everything else is discarded

From a developer lens:

* “Reachable” ≠ “on the classpath”
* Hibernate and Spring pull in a lot of reachable code even for small apps
* Reflection count in the thousands is normal for JPA apps

---

### [3/8] Building universe

This step constructs GraalVM’s internal model of:

* types
* methods
* fields
* heap objects

No optimizations yet, just structure.

---

### [4/8] Parsing methods

Bytecode is parsed into GraalVM’s intermediate representation.

This is similar to how a JVM JIT parses methods, but done **once**, not at runtime.

---

### [5/8] Inlining methods

Classic compiler optimization:

* inline small/hot methods
* reduce call overhead
* expose more optimization opportunities

---

### [6/8] Compiling methods (the heavy part)

```
(151.5s @ 4.31GB)
```

This is actual machine code generation.

What we see:

* Most memory consumption happens here
* CPU load increases
* This is why native builds are slow compared to JVM builds

---

### [7/8] Layouting methods

Compiled code is:

* placed into executable sections
* addresses resolved
* final memory layout prepared

---

### [8/8] Creating the image

```
159.04MB in total
Top origins: hibernate-core, tomcat, spring, jackson
Produced demo.exe
```

At this point:

* Code area = compiled machine code
* Image heap = pre-initialized objects (strings, metadata, reflection info)
* Native executable and supporting DLLs are written

Hibernate dominating size is normal for JPA apps.

---

## 9) Why we see both `.jar` and `.exe`

```
demo-0.0.1-SNAPSHOT.jar
demo.exe
```

Meaning:

* `.jar` = portable JVM artifact
* `.exe` = platform-specific native artifact

They serve different purposes and can coexist.

---

## 10) What changes when we run the native app

```
Starting AOT-processed DemoApplication
Root WebApplicationContext: initialization completed in 91 ms
Started DemoApplication in 0.292 seconds
```

Key differences we observe:

* Spring context initialization is extremely fast
* No heavy classpath scanning at runtime
* Bean wiring is mostly precomputed
* Tomcat, Hibernate, and Hikari still do real runtime work (network, DB metadata)

Native does **not** remove runtime IO — it removes runtime discovery.

---

## 11) DispatcherServlet initialization on first request

```
Initializing DispatcherServlet
Completed initialization in 0 ms
```

This happens because:

* Servlet initialization is lazy
* It’s triggered on first HTTP request
* Initialization is fast because wiring is already done

---

## 12) Final mental model we should keep

* JVM app = dynamic, reflective, flexible
* Native app = static, precomputed, predictable
* Spring AOT is the bridge between the two
* GraalVM enforces the closed-world assumption
* The logs clearly show the transition from “dynamic JVM world” to “static native world”

That’s exactly what this build demonstrated end-to-end.
