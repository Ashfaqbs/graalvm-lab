package com.custom.java.util;

import javax.tools.*;
import java.util.Arrays;

public class DynamicCodeCompiler {
    public Class<?> compileAndLoad(String className, String sourceCode) throws Exception {
        // Get the Java compiler
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            throw new RuntimeException("Compiler not available");
        }

        // Create a file manager and diagnostic collector
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        StandardJavaFileManager standardFileManager = compiler.getStandardFileManager(diagnostics, null, null);

        // Create a memory file manager
        try (MemoryJavaFileManager fileManager = new MemoryJavaFileManager(standardFileManager)) {
            // Create a source file object
            JavaFileObject sourceFile = new MemoryJavaFileObject(className, sourceCode);

            // Compilation units
            Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(sourceFile);

            // Compilation task
            JavaCompiler.CompilationTask task = compiler.getTask(
                    null,
                    fileManager,
                    diagnostics,
                    null,
                    null,
                    compilationUnits
            );

            // Perform compilation
            boolean success = task.call();
            if (!success) {
                StringBuilder sb = new StringBuilder();
                for (Diagnostic<?> diagnostic : diagnostics.getDiagnostics()) {
                    sb.append(diagnostic.toString()).append("\n");
                }
                throw new RuntimeException("Compilation failed:\n" + sb.toString());
            }

            // Get the compiled class
            byte[] classBytes = fileManager.getClassBytes(className);

            // Create a class loader and load the class
            MemoryClassLoader classLoader = new MemoryClassLoader(className, classBytes);
            return classLoader.loadClass(className);
        }
    }
}