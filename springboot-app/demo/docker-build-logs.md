
```

❯❯ demo  22:21 mvn -Pnative spring-boot:build-image
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> spring-boot:3.5.10:build-image (default-cli) > package @ demo >>>
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
22:21:12.815 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.demo.DemoApplicationTests]: DemoApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
22:21:12.927 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.demo.DemoApplication for test class com.example.demo.DemoApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::               (v3.5.10)

2026-01-29T22:21:13.387+05:30  INFO 30044 --- [demo] [           main] com.example.demo.DemoApplicationTests    : Starting DemoApplicationTests using Java 17.0.18 with PID 30044 (started by ashfa in C:\Users\ashfa\Downloads\demo)
2026-01-29T22:21:13.388+05:30  INFO 30044 --- [demo] [           main] com.example.demo.DemoApplicationTests    : No active profile set, falling back to 1 default profile: "default"
2026-01-29T22:21:13.971+05:30  INFO 30044 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-01-29T22:21:14.024+05:30  INFO 30044 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 44 ms. Found 1 JPA repository interface.
2026-01-29T22:21:14.370+05:30  INFO 30044 --- [demo] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-01-29T22:21:14.429+05:30  INFO 30044 --- [demo] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.41.Final
2026-01-29T22:21:14.468+05:30  INFO 30044 --- [demo] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-01-29T22:21:14.798+05:30  INFO 30044 --- [demo] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-01-29T22:21:14.835+05:30  INFO 30044 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-01-29T22:21:14.946+05:30  INFO 30044 --- [demo] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@38f502fc
2026-01-29T22:21:14.947+05:30  INFO 30044 --- [demo] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-01-29T22:21:14.977+05:30  WARN 30044 --- [demo] [           main] org.hibernate.orm.deprecation            : HHH90000025: PostgreSQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-01-29T22:21:15.000+05:30  INFO 30044 --- [demo] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
        Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
        Database driver: undefined/unknown
        Database version: 17.0
        Autocommit mode: undefined/unknown
        Isolation level: undefined/unknown
        Minimum pool size: undefined/unknown
        Maximum pool size: undefined/unknown
2026-01-29T22:21:15.723+05:30  INFO 30044 --- [demo] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-01-29T22:21:15.808+05:30  INFO 30044 --- [demo] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-01-29T22:21:16.098+05:30  WARN 30044 --- [demo] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-01-29T22:21:16.506+05:30  INFO 30044 --- [demo] [           main] com.example.demo.DemoApplicationTests    : Started DemoApplicationTests in 3.434 seconds (process running for 4.358)
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.238 s -- in com.example.demo.DemoApplicationTests
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

2026-01-29T22:21:18.389+05:30  INFO 36384 --- [demo] [           main] com.example.demo.DemoApplication         : Starting DemoApplication using Java 17.0.18 with PID 36384 (C:\Users\ashfa\Downloads\demo\target\classes started by ashfa in C:\Users\ashfa\Downloads\demo)
2026-01-29T22:21:18.392+05:30  INFO 36384 --- [demo] [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2026-01-29T22:21:19.150+05:30  INFO 36384 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-01-29T22:21:19.215+05:30  INFO 36384 --- [demo] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 53 ms. Found 1 JPA repository interface.
[INFO]
[INFO] --- jar:3.4.2:jar (default-jar) @ demo ---
[INFO] Building jar: C:\Users\ashfa\Downloads\demo\target\demo-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot:3.5.10:repackage (repackage) @ demo ---
[INFO] Replacing main artifact C:\Users\ashfa\Downloads\demo\target\demo-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to C:\Users\ashfa\Downloads\demo\target\demo-0.0.1-SNAPSHOT.jar.original
[INFO]
[INFO] <<< spring-boot:3.5.10:build-image (default-cli) < package @ demo <<<
[INFO]
[INFO]
[INFO] --- spring-boot:3.5.10:build-image (default-cli) @ demo ---
[INFO] Building image 'docker.io/library/demo:0.0.1-SNAPSHOT'
[INFO]
[INFO]  > Pulling builder image 'docker.io/paketobuildpacks/builder-noble-java-tiny:latest' 100%
[INFO]  > Pulled builder image 'paketobuildpacks/builder-noble-java-tiny@sha256:3047a8cae7dcf1e06d0a395008355029cba20dc7d85eedf77671cb64e53648e8'
[INFO]  > Pulling run image 'docker.io/paketobuildpacks/ubuntu-noble-run-tiny:0.0.48' for platform 'linux/amd64' 100%
[INFO]  > Pulled run image 'paketobuildpacks/ubuntu-noble-run-tiny@sha256:393153a37feac45de83530ee5e5d9f44645a8faba6d669a4f006fc371069d479'
[INFO]  > Executing lifecycle version v0.21.1
[INFO]  > Using build cache volume 'pack-cache-5cbe5692dbc4.build'
[INFO]
[INFO]  > Running creator
[INFO]     [creator]     ===> ANALYZING
[INFO]     [creator]     Restoring data for SBOM from previous image
[INFO]     [creator]     ===> DETECTING
[INFO]     [creator]     target distro name/version labels not found, reading /etc/os-release file
[INFO]     [creator]     6 of 15 buildpacks participating
[INFO]     [creator]     paketo-buildpacks/ca-certificates   3.11.0
[INFO]     [creator]     paketo-buildpacks/bellsoft-liberica 11.5.2
[INFO]     [creator]     paketo-buildpacks/syft              2.28.1
[INFO]     [creator]     paketo-buildpacks/executable-jar    6.14.0
[INFO]     [creator]     paketo-buildpacks/spring-boot       5.35.0
[INFO]     [creator]     paketo-buildpacks/native-image      5.17.0
[INFO]     [creator]     ===> RESTORING
[INFO]     [creator]     Restoring metadata for "paketo-buildpacks/ca-certificates:helper" from app image
[INFO]     [creator]     Restoring metadata for "paketo-buildpacks/bellsoft-liberica:native-image-svm" from cache
[INFO]     [creator]     Restoring metadata for "paketo-buildpacks/syft:syft" from cache
[INFO]     [creator]     Restoring metadata for "paketo-buildpacks/native-image:native-image" from cache
[INFO]     [creator]     Restoring data for "paketo-buildpacks/bellsoft-liberica:native-image-svm" from cache
[INFO]     [creator]     Restoring data for "paketo-buildpacks/syft:syft" from cache
[INFO]     [creator]     Restoring data for "paketo-buildpacks/native-image:native-image" from cache
[INFO]     [creator]     Restoring data for SBOM from cache
[INFO]     [creator]     ===> BUILDING
[INFO]     [creator]     target distro name/version labels not found, reading /etc/os-release file
[INFO]     [creator]
[INFO]     [creator]     Paketo Buildpack for CA Certificates 3.11.0
[INFO]     [creator]       https://github.com/paketo-buildpacks/ca-certificates
[INFO]     [creator]       Build Configuration:
[INFO]     [creator]         $BP_EMBED_CERTS                    false  Embed certificates into the image
[INFO]     [creator]         $BP_ENABLE_RUNTIME_CERT_BINDING    true   Deprecated: Enable/disable certificate helper layer to add certs at runtime
[INFO]     [creator]         $BP_RUNTIME_CERT_BINDING_DISABLED  false  Disable certificate helper layer to add certs at runtime
[INFO]     [creator]       Launch Helper: Reusing cached layer
[INFO]     [creator]
[INFO]     [creator]     Paketo Buildpack for BellSoft Liberica 11.5.2
[INFO]     [creator]       https://github.com/paketo-buildpacks/bellsoft-liberica
[INFO]     [creator]       Build Configuration:
[INFO]     [creator]         $BP_JVM_JLINK_ARGS           --no-man-pages --no-header-files --strip-debug --compress=1  configure custom link arguments (--output must be omitted)
[INFO]     [creator]         $BP_JVM_JLINK_ENABLED        false                                                        enables running jlink tool to generate custom JRE
[INFO]     [creator]         $BP_JVM_TYPE                 JRE                                                          the JVM type - JDK or JRE
[INFO]     [creator]         $BP_JVM_VERSION              21                                                           the Java version
[INFO]     [creator]       Launch Configuration:
[INFO]     [creator]         $BPL_DEBUG_ENABLED           false                                                        enables Java remote debugging support
[INFO]     [creator]         $BPL_DEBUG_PORT              8000                                                         configure the remote debugging port
[INFO]     [creator]         $BPL_DEBUG_SUSPEND           false                                                        configure whether to suspend execution until a debugger has attached
[INFO]     [creator]         $BPL_HEAP_DUMP_PATH                                                                       write heap dumps on error to this path
[INFO]     [creator]         $BPL_JAVA_NMT_ENABLED        true                                                         enables Java Native Memory Tracking (NMT)
[INFO]     [creator]         $BPL_JAVA_NMT_LEVEL          summary                                                      configure level of NMT, summary or detail
[INFO]     [creator]         $BPL_JFR_ARGS                                                                             configure custom Java Flight Recording (JFR) arguments
[INFO]     [creator]         $BPL_JFR_ENABLED             false                                                        enables Java Flight Recording (JFR)
[INFO]     [creator]         $BPL_JMX_ENABLED             false                                                        enables Java Management Extensions (JMX)
[INFO]     [creator]         $BPL_JMX_PORT                5000                                                         configure the JMX port
[INFO]     [creator]         $BPL_JVM_HEAD_ROOM           0                                                            the headroom in memory calculation
[INFO]     [creator]         $BPL_JVM_LOADED_CLASS_COUNT  35% of classes                                               the number of loaded classes in memory calculation
[INFO]     [creator]         $BPL_JVM_THREAD_COUNT        250                                                          the number of threads in memory calculation
[INFO]     [creator]         $JAVA_TOOL_OPTIONS                                                                        the JVM launch flags
[INFO]     [creator]         Using Java version 17 extracted from MANIFEST.MF
[INFO]     [creator]       BellSoft Liberica NIK 17.0.17: Reusing cached layer
[INFO]     [creator]
[INFO]     [creator]     Paketo Buildpack for Syft 2.28.1
[INFO]     [creator]       https://github.com/paketo-buildpacks/syft
[INFO]     [creator]
[INFO]     [creator]     Paketo Buildpack for Executable JAR 6.14.0
[INFO]     [creator]       https://github.com/paketo-buildpacks/executable-jar
[INFO]     [creator]       Class Path: Contributing to layer
[INFO]     [creator]         Writing env/CLASSPATH.delim
[INFO]     [creator]         Writing env/CLASSPATH.prepend
[INFO]     [creator]       Process types:
[INFO]     [creator]         executable-jar: java org.springframework.boot.loader.launch.JarLauncher (direct)
[INFO]     [creator]         task:           java org.springframework.boot.loader.launch.JarLauncher (direct)
[INFO]     [creator]         web:            java org.springframework.boot.loader.launch.JarLauncher (direct)
[INFO]     [creator]
[INFO]     [creator]     Paketo Buildpack for Spring Boot 5.35.0
[INFO]     [creator]       https://github.com/paketo-buildpacks/spring-boot
[INFO]     [creator]       Build Configuration:
[INFO]     [creator]         $BPL_JVM_AOTCACHE_ENABLED            false  whether to enable Spring AOT Cache optimizations at runtime
[INFO]     [creator]         $BPL_JVM_CDS_ENABLED                 false  whether to enable CDS optimizations at runtime
[INFO]     [creator]         $BPL_SPRING_AOT_ENABLED              false  whether to enable Spring AOT at runtime
[INFO]     [creator]         $BP_JVM_AOTCACHE_ENABLED             false  whether to enable Spring AOT Cache & perform JVM training run
[INFO]     [creator]         $BP_JVM_CDS_ENABLED                  false  whether to enable CDS & perform JVM training run
[INFO]     [creator]         $BP_SPRING_AOT_ENABLED               false  whether to enable Spring AOT
[INFO]     [creator]         $BP_SPRING_CLOUD_BINDINGS_DISABLED   false  whether to contribute Spring Boot cloud bindings support
[INFO]     [creator]         $BP_SPRING_CLOUD_BINDINGS_VERSION    1      default version of Spring Cloud Bindings library to contribute
[INFO]     [creator]         $BP_UNPACK_LAYOUT_ONLY               false  whether to unpack (-Djarmode=tools [...] extract) the Spring Boot archive and run it in extracted mode
[INFO]     [creator]       Launch Configuration:
[INFO]     [creator]         $BPL_SPRING_CLOUD_BINDINGS_DISABLED  false  whether to auto-configure Spring Boot environment properties from bindings
[INFO]     [creator]         $BPL_SPRING_CLOUD_BINDINGS_ENABLED   true   Deprecated - whether to auto-configure Spring Boot environment properties from bindings
[INFO]     [creator]     Java Major version from the JRE: 17
[INFO]     [creator]       Class Path: Contributing to layer
[INFO]     [creator]         Writing env.build/CLASSPATH.append
[INFO]     [creator]         Writing env.build/CLASSPATH.delim
[INFO]     [creator]       Image labels:
[INFO]     [creator]         org.opencontainers.image.title
[INFO]     [creator]         org.opencontainers.image.version
[INFO]     [creator]         org.springframework.boot.version
[INFO]     [creator]
[INFO]     [creator]     Paketo Buildpack for Native Image 5.17.0
[INFO]     [creator]       https://github.com/paketo-buildpacks/native-image
[INFO]     [creator]       Build Configuration:
[INFO]     [creator]         $BP_BINARY_COMPRESSION_METHOD          Compression mechanism used to reduce binary size. Options: `none` (default), `upx` or `gzexe`
[INFO]     [creator]         $BP_NATIVE_IMAGE                       enable native image build
[INFO]     [creator]         $BP_NATIVE_IMAGE_BUILD_ARGUMENTS       arguments to pass to the native-image command
[INFO]     [creator]         $BP_NATIVE_IMAGE_BUILD_ARGUMENTS_FILE  a file with arguments to pass to the native-image command
[INFO]     [creator]         $BP_NATIVE_IMAGE_BUILT_ARTIFACT        the built application artifact explicitly, required if building from a JAR
[INFO]     [creator]       Native Image: Contributing to layer
[INFO]     [creator]         Executing native-image --no-fallback -H:Name=/layers/paketo-buildpacks_native-image/native-image/com.example.demo.DemoApplication -cp /workspace:/workspace/BOOT-INF/classes:/workspace/BOOT-INF/lib/spring-boot-3.5.10.jar:/workspace/BOOT-INF/lib/spring-boot-autoconfigure-3.5.10.jar:/workspace/BOOT-INF/lib/logback-classic-1.5.25.jar:/workspace/BOOT-INF/lib/logback-core-1.5.25.jar:/workspace/BOOT-INF/lib/log4j-to-slf4j-2.24.3.jar:/workspace/BOOT-INF/lib/log4j-api-2.24.3.jar:/workspace/BOOT-INF/lib/jul-to-slf4j-2.0.17.jar:/workspace/BOOT-INF/lib/jakarta.annotation-api-2.1.1.jar:/workspace/BOOT-INF/lib/snakeyaml-2.4.jar:/workspace/BOOT-INF/lib/HikariCP-6.3.3.jar:/workspace/BOOT-INF/lib/spring-jdbc-6.2.15.jar:/workspace/BOOT-INF/lib/hibernate-core-6.6.41.Final.jar:/workspace/BOOT-INF/lib/jakarta.persistence-api-3.1.0.jar:/workspace/BOOT-INF/lib/jakarta.transaction-api-2.0.1.jar:/workspace/BOOT-INF/lib/jboss-logging-3.6.1.Final.jar:/workspace/BOOT-INF/lib/hibernate-commons-annotations-7.0.3.Final.jar:/workspace/BOOT-INF/lib/jandex-3.2.0.jar:/workspace/BOOT-INF/lib/classmate-1.7.3.jar:/workspace/BOOT-INF/lib/byte-buddy-1.17.8.jar:/workspace/BOOT-INF/lib/jaxb-runtime-4.0.6.jar:/workspace/BOOT-INF/lib/jaxb-core-4.0.6.jar:/workspace/BOOT-INF/lib/angus-activation-2.0.3.jar:/workspace/BOOT-INF/lib/txw2-4.0.6.jar:/workspace/BOOT-INF/lib/istack-commons-runtime-4.1.2.jar:/workspace/BOOT-INF/lib/jakarta.inject-api-2.0.1.jar:/workspace/BOOT-INF/lib/antlr4-runtime-4.13.0.jar:/workspace/BOOT-INF/lib/spring-data-jpa-3.5.8.jar:/workspace/BOOT-INF/lib/spring-data-commons-3.5.8.jar:/workspace/BOOT-INF/lib/spring-orm-6.2.15.jar:/workspace/BOOT-INF/lib/spring-context-6.2.15.jar:/workspace/BOOT-INF/lib/spring-aop-6.2.15.jar:/workspace/BOOT-INF/lib/spring-tx-6.2.15.jar:/workspace/BOOT-INF/lib/spring-beans-6.2.15.jar:/workspace/BOOT-INF/lib/slf4j-api-2.0.17.jar:/workspace/BOOT-INF/lib/spring-aspects-6.2.15.jar:/workspace/BOOT-INF/lib/aspectjweaver-1.9.25.1.jar:/workspace/BOOT-INF/lib/jackson-databind-2.19.4.jar:/workspace/BOOT-INF/lib/jackson-annotations-2.19.4.jar:/workspace/BOOT-INF/lib/jackson-core-2.19.4.jar:/workspace/BOOT-INF/lib/jackson-datatype-jdk8-2.19.4.jar:/workspace/BOOT-INF/lib/jackson-datatype-jsr310-2.19.4.jar:/workspace/BOOT-INF/lib/jackson-module-parameter-names-2.19.4.jar:/workspace/BOOT-INF/lib/tomcat-embed-core-10.1.50.jar:/workspace/BOOT-INF/lib/tomcat-embed-el-10.1.50.jar:/workspace/BOOT-INF/lib/tomcat-embed-websocket-10.1.50.jar:/workspace/BOOT-INF/lib/spring-web-6.2.15.jar:/workspace/BOOT-INF/lib/micrometer-observation-1.15.8.jar:/workspace/BOOT-INF/lib/micrometer-commons-1.15.8.jar:/workspace/BOOT-INF/lib/spring-webmvc-6.2.15.jar:/workspace/BOOT-INF/lib/spring-expression-6.2.15.jar:/workspace/BOOT-INF/lib/postgresql-42.7.7.jar:/workspace/BOOT-INF/lib/checker-qual-3.49.3.jar:/workspace/BOOT-INF/lib/jakarta.xml.bind-api-4.0.4.jar:/workspace/BOOT-INF/lib/jakarta.activation-api-2.1.4.jar:/workspace/BOOT-INF/lib/spring-core-6.2.15.jar:/workspace/BOOT-INF/lib/spring-jcl-6.2.15.jar:/workspace/BOOT-INF/lib/spring-boot-jarmode-tools-3.5.10.jar com.example.demo.DemoApplication
[INFO]     [creator]     ================================================================================
[INFO]     [creator]     GraalVM Native Image: Generating 'com.example.demo.DemoApplication' (executable)...
[INFO]     [creator]     ================================================================================
[INFO]     [creator]     For detailed information and explanations on the build output, visit:
[INFO]     [creator]     https://github.com/oracle/graal/blob/master/docs/reference-manual/native-image/BuildOutput.md
[INFO]     [creator]     --------------------------------------------------------------------------------
[INFO]     [creator]     Warning: Method com.zaxxer.hikari.HikariConfig.getScheduledExecutorService() not found.
[INFO]     [creator]     Warning: Method com.zaxxer.hikari.HikariConfig.isInitializationFailFast() not found.
[INFO]     [creator]     Warning: Method com.zaxxer.hikari.HikariConfig.isJdbc4ConnectionTest() not found.
[INFO]     [creator]     Warning: Method com.zaxxer.hikari.HikariConfig.setInitializationFailFast(boolean) not found.
[INFO]     [creator]     Warning: Method com.zaxxer.hikari.HikariConfig.setJdbc4ConnectionTest(boolean) not found.
[INFO]     [creator]     Warning: Method com.zaxxer.hikari.HikariConfig.setScheduledExecutorService(ScheduledThreadPoolExecutor) not found.
[INFO]     [creator]     Warning: Could not resolve class bitronix.tm.TransactionManagerServices for reflection configuration. Reason: java.lang.ClassNotFoundException: bitronix.tm.TransactionManagerServices.
[INFO]     [creator]     Warning: Could not resolve class com.arjuna.ats.jta.TransactionManager for reflection configuration. Reason: java.lang.ClassNotFoundException: com.arjuna.ats.jta.TransactionManager.
[INFO]     [creator]     Warning: Could not resolve class com.atomikos.icatch.jta.UserTransactionManager for reflection configuration. Reason: java.lang.ClassNotFoundException: com.atomikos.icatch.jta.UserTransactionManager.
[INFO]     [creator]     Warning: Could not resolve class com.ibm.ejs.jts.jta.JTSXA for reflection configuration. Reason: java.lang.ClassNotFoundException: com.ibm.ejs.jts.jta.JTSXA.
[INFO]     [creator]     Warning: Could not resolve class com.ibm.ejs.jts.jta.TransactionManagerFactory for reflection configuration. Reason: java.lang.ClassNotFoundException: com.ibm.ejs.jts.jta.TransactionManagerFactory.
[INFO]     [creator]     Warning: Could not resolve class com.ibm.icu.text.Collator for reflection configuration. Reason: java.lang.ClassNotFoundException: com.ibm.icu.text.Collator.
[INFO]     [creator]     Warning: Could not resolve class com.ibm.icu.text.Collator for reflection configuration. Reason: java.lang.ClassNotFoundException: com.ibm.icu.text.Collator.
[INFO]     [creator]     Warning: Could not resolve class com.ibm.tx.jta.TransactionManagerFactory for reflection configuration. Reason: java.lang.ClassNotFoundException: com.ibm.tx.jta.TransactionManagerFactory.
[INFO]     [creator]     Warning: Could not resolve class com.ibm.ws.Transaction.TransactionManagerFactory for reflection configuration. Reason: java.lang.ClassNotFoundException: com.ibm.ws.Transaction.TransactionManagerFactory.
[INFO]     [creator]     Warning: Could not resolve class jakarta.enterprise.inject.spi.BeanManager for reflection configuration. Reason: java.lang.ClassNotFoundException: jakarta.enterprise.inject.spi.BeanManager.
[INFO]     [creator]     Warning: Could not resolve class jakarta.validation.ConstraintViolation for reflection configuration. Reason: java.lang.ClassNotFoundException: jakarta.validation.ConstraintViolation.
[INFO]     [creator]     Warning: Could not resolve class oracle.jdbc.OracleConnection for reflection configuration. Reason: java.lang.ClassNotFoundException: oracle.jdbc.OracleConnection.
[INFO]     [creator]     Warning: Could not resolve class org.h2.Driver for reflection configuration. Reason: java.lang.ClassNotFoundException: org.h2.Driver.
[INFO]     [creator]     Warning: Could not register method org.hibernate.boot.beanvalidation.TypeSafeActivator.activate(ActivationContext) for reflection. Reason: java.lang.NoClassDefFoundError: jakarta/validation/ValidatorFactory.
[INFO]     [creator]     Warning: Could not resolve class org.jboss.logmanager.LogManager for reflection configuration. Reason: java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager.
[INFO]     [creator]     Warning: Could not resolve class org.jboss.logmanager.LogManager for reflection configuration. Reason: java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager.
[INFO]     [creator]     Warning: Could not resolve class org.jboss.logmanager.LogManager for reflection configuration. Reason: java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager.
[INFO]     [creator]     Warning: Could not resolve class org.jboss.logmanager.LogManager for reflection configuration. Reason: java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager.
[INFO]     [creator]     Warning: Could not resolve class org.objectweb.jonas_tm.Current for reflection configuration. Reason: java.lang.ClassNotFoundException: org.objectweb.jonas_tm.Current.
[INFO]     [creator]     Warning: Could not resolve class org.objectweb.jotm.Current for reflection configuration. Reason: java.lang.ClassNotFoundException: org.objectweb.jotm.Current.
[INFO]     [creator]     Warning: Could not resolve class org.wildfly.transaction.client.ContextTransactionManager for reflection configuration. Reason: java.lang.ClassNotFoundException: org.wildfly.transaction.client.ContextTransactionManager.
[INFO]     [creator]     Warning: Could not resolve class org.jboss.logmanager.LogManager for reflection configuration. Reason: java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager.
[INFO]     [creator]     Warning: Method ch.qos.logback.core.FileAppender.valueOf(String) not found.
[INFO]     [creator]     Warning: Method ch.qos.logback.core.Layout.valueOf(String) not found.
[INFO]     [creator]     Warning: Method ch.qos.logback.core.rolling.RollingPolicy.valueOf(String) not found.
[INFO]     [creator]     Warning: Method ch.qos.logback.core.rolling.TriggeringPolicy.valueOf(String) not found.
[INFO]     [creator]     Warning: Method ch.qos.logback.core.spi.ContextAware.valueOf(String) not found.
[INFO]     [creator]     Warning: Could not resolve class javax.inject.Inject for reflection configuration. Reason: java.lang.ClassNotFoundException: javax.inject.Inject.
[INFO]     [creator]     Warning: Could not resolve class javax.inject.Qualifier for reflection configuration. Reason: java.lang.ClassNotFoundException: javax.inject.Qualifier.
[INFO]     [creator]     Warning: Could not resolve class javax.money.MonetaryAmount for reflection configuration. Reason: java.lang.ClassNotFoundException: javax.money.MonetaryAmount.
[INFO]     [creator]     Warning: Could not resolve class kotlin.Metadata for reflection configuration. Reason: java.lang.ClassNotFoundException: kotlin.Metadata.
[INFO]     [creator]     Warning: Could not resolve class kotlin.reflect.full.KClasses for reflection configuration. Reason: java.lang.ClassNotFoundException: kotlin.reflect.full.KClasses.
[INFO]     [creator]     Warning: Could not resolve class org.eclipse.core.runtime.FileLocator for reflection configuration. Reason: java.lang.ClassNotFoundException: org.eclipse.core.runtime.FileLocator.
[INFO]     [creator]     Warning: Could not resolve class org.hibernate.service.jta.platform.internal.NoJtaPlatform for reflection configuration. Reason: java.lang.ClassNotFoundException: org.hibernate.service.jta.platform.internal.NoJtaPlatform.
[INFO]     [creator]     Warning: Could not resolve class org.reactivestreams.Publisher for reflection configuration. Reason: java.lang.ClassNotFoundException: org.reactivestreams.Publisher.
[INFO]     [creator]     Warning: Could not resolve class org.springframework.data.web.config.SpringDataJacksonConfiguration$PageModule$PlainPageSerializationWarning for reflection configuration. Reason: java.lang.ClassNotFoundException: org.springframework.data.web.config.SpringDataJacksonConfiguration$PageModule$PlainPageSerializationWarning.
[INFO]     [creator]     [1/8] Initializing...                                            (8.7s @ 0.29GB)
[INFO]     [creator]      Java version: 17.0.17+12-LTS, vendor version: Liberica-NIK-23.0.10-1
[INFO]     [creator]      Graal compiler: optimization level: 2, target machine: x86-64-v3
[INFO]     [creator]      C compiler: gcc (linux, x86_64, 13.3.0)
[INFO]     [creator]      Garbage collector: Serial GC (max heap size: 80% of RAM)
[INFO]     [creator]      2 user-specific feature(s)
[INFO]     [creator]      - org.eclipse.angus.activation.nativeimage.AngusActivationFeature
[INFO]     [creator]      - org.springframework.aot.nativex.feature.PreComputeFieldFeature
[INFO]     [creator]     SLF4J(W): No SLF4J providers were found.
[INFO]     [creator]     SLF4J(W): Defaulting to no-operation (NOP) logger implementation
[INFO]     [creator]     SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
[INFO]     [creator]     [2/8] Performing analysis...  [*******]                         (98.3s @ 2.56GB)
[INFO]     [creator]       32,848 (92.98%) of 35,327 types reachable
[INFO]     [creator]       53,842 (68.61%) of 78,474 fields reachable
[INFO]     [creator]      163,719 (62.60%) of 261,521 methods reachable
[INFO]     [creator]        9,654 types, 1,116 fields, and 10,511 methods registered for reflection
[INFO]     [creator]          133 types,   216 fields, and   118 methods registered for JNI access
[INFO]     [creator]            4 native libraries: dl, pthread, rt, z
[INFO]     [creator]     [3/8] Building universe...                                      (13.9s @ 3.33GB)
[INFO]     [creator]     [4/8] Parsing methods...      [***]                              (9.9s @ 2.30GB)
[INFO]     [creator]     [5/8] Inlining methods...     [***]                              (4.1s @ 1.90GB)
[INFO]     [creator]     [6/8] Compiling methods...    [*******]                         (58.5s @ 2.38GB)
[INFO]     [creator]     [7/8] Layouting methods...    [****]                            (12.8s @ 3.34GB)
[INFO]     [creator]     [8/8] Creating image...       [****]                            (14.6s @ 2.80GB)
[INFO]     [creator]       76.22MB (53.13%) for code area:   108,719 compilation units
[INFO]     [creator]       61.04MB (42.56%) for image heap:  641,249 objects and 277 resources
[INFO]     [creator]        6.19MB ( 4.31%) for other data
[INFO]     [creator]      143.44MB in total
[INFO]     [creator]     --------------------------------------------------------------------------------
[INFO]     [creator]     Top 10 origins of code area:            Top 10 object types in image heap:
[INFO]     [creator]       16.07MB h.6.41.Final.jar                16.97MB byte[] for code metadata
[INFO]     [creator]       13.92MB java.base                        8.10MB java.lang.Class
[INFO]     [creator]        4.79MB tomcat-embed-core-10.1.50.jar    6.38MB java.lang.String
[INFO]     [creator]        4.62MB java.desktop                     6.24MB byte[] for java.lang.String
[INFO]     [creator]        4.08MB java.xml                         5.13MB byte[] for general heap data
[INFO]     [creator]        2.75MB jdk.proxy4                       2.76MB c.o.s.c.h.DynamicHubCompanion
[INFO]     [creator]        2.60MB spring-data-jpa-3.5.8.jar        2.44MB byte[] for embedded resources
[INFO]     [creator]        2.17MB jackson-databind-2.19.4.jar      2.06MB byte[] for reflection metadata
[INFO]     [creator]        2.07MB postgresql-42.7.7.jar            1.25MB java.lang.String[]
[INFO]     [creator]        1.82MB spring-boot-3.5.10.jar           1.14MB c.o.s.c.h.DynamicHu~onMetadata
[INFO]     [creator]       20.54MB for 113 more packages            8.21MB for 5761 more object types
[INFO]     [creator]     --------------------------------------------------------------------------------
[INFO]     [creator]     Recommendations:
[INFO]     [creator]      HEAP: Set max heap for improved and more predictable memory usage.
[INFO]     [creator]      CPU:  Enable more CPU features with '-march=native' for improved performance.
[INFO]     [creator]     --------------------------------------------------------------------------------
[INFO]     [creator]       33.0s (14.7% of total time) in 209 GCs | Peak RSS: 5.49GB | CPU load: 10.93
[INFO]     [creator]     --------------------------------------------------------------------------------
[INFO]     [creator]     Produced artifacts:
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/com.example.demo.DemoApplication (executable)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libawt.so (jdk_library)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libawt_headless.so (jdk_library)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libawt_xawt.so (jdk_library)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libfontmanager.so (jdk_library)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libfreetype.so (jdk_library)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libjava.so (jdk_library_shim)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libjavajpeg.so (jdk_library)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/libjvm.so (jdk_library_shim)
[INFO]     [creator]      /layers/paketo-buildpacks_native-image/native-image/liblcms.so (jdk_library)
[INFO]     [creator]     ================================================================================
[INFO]     [creator]     Finished generating 'com.example.demo.DemoApplication' in 3m 43s.
[INFO]     [creator]       Removing bytecode
[INFO]     [creator]       Process types:
[INFO]     [creator]         native-image: ./com.example.demo.DemoApplication (direct)
[INFO]     [creator]         task:         ./com.example.demo.DemoApplication (direct)
[INFO]     [creator]         web:          ./com.example.demo.DemoApplication (direct)
[INFO]     [creator]     ===> EXPORTING
[INFO]     [creator]     Reusing layer 'paketo-buildpacks/ca-certificates:helper'
[INFO]     [creator]     Reusing layer 'paketo-buildpacks/executable-jar:classpath'
[INFO]     [creator]     Adding layer 'buildpacksio/lifecycle:launch.sbom'
[INFO]     [creator]     Added 1/1 app layer(s)
[INFO]     [creator]     Reusing layer 'buildpacksio/lifecycle:launcher'
[INFO]     [creator]     Reusing layer 'buildpacksio/lifecycle:config'
[INFO]     [creator]     Reusing layer 'buildpacksio/lifecycle:process-types'
[INFO]     [creator]     Adding label 'io.buildpacks.lifecycle.metadata'
[INFO]     [creator]     Adding label 'io.buildpacks.build.metadata'
[INFO]     [creator]     Adding label 'io.buildpacks.project.metadata'
[INFO]     [creator]     Adding label 'org.opencontainers.image.title'
[INFO]     [creator]     Adding label 'org.opencontainers.image.version'
[INFO]     [creator]     Adding label 'org.springframework.boot.version'
[INFO]     [creator]     Setting default process type 'web'
[INFO]     [creator]     Saving docker.io/library/demo:0.0.1-SNAPSHOT...
[INFO]     [creator]     *** Images (9a4b5e32b1b9):
[INFO]     [creator]           docker.io/library/demo:0.0.1-SNAPSHOT
[INFO]     [creator]     Reusing cache layer 'paketo-buildpacks/bellsoft-liberica:native-image-svm'
[INFO]     [creator]     Adding cache layer 'paketo-buildpacks/bellsoft-liberica:native-image-svm'
[INFO]     [creator]     Reusing cache layer 'paketo-buildpacks/syft:syft'
[INFO]     [creator]     Adding cache layer 'paketo-buildpacks/syft:syft'
[INFO]     [creator]     Adding cache layer 'paketo-buildpacks/native-image:native-image'
[INFO]     [creator]     Reusing cache layer 'buildpacksio/lifecycle:cache.sbom'
[INFO]     [creator]     Adding cache layer 'buildpacksio/lifecycle:cache.sbom'
[INFO]
[INFO] Successfully built image 'docker.io/library/demo:0.0.1-SNAPSHOT'
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  04:29 min
[INFO] Finished at: 2026-01-29T22:25:39+05:30
[INFO] ------------------------------------------------------------------------
❯❯ demo  22:25 docker images  | findstr  demo
WARNING: This output is designed for human readability. For machine-readable output, please use --format.
demo:0.0.1-SNAPSHOT                                                                                     9a4b5e32b1b9        189MB             0B
❯❯ demo  22:26 docker images
                                                                                                                                                    i Info →   U  In Use
IMAGE                                                                                                   ID             DISK USAGE   CONTENT SIZE   EXTRA                                                                                ea87a4eb03be        658MB             0B
demo:0.0.1-SNAPSHOT                                                                                     9a4b5e32b1b9        189MB             0B



```
