package com.custom.java;

import com.custom.java.util.DynamicCodeCompiler;

public class JavaStringExecutor {
    public static void main(String[] args) {
        // The Java code we want to execute as a string
        String javaCodeString = "public class DynamicClass {" + "    public static int add(int a, int b) {" + "        return a + b;" + "    }" + "    public static String getMessage() {" + "        return \"Hello from dynamic Java code!\";" + "    }" + "}";

        try {
            // Create a dynamic code compiler
            DynamicCodeCompiler compiler = new DynamicCodeCompiler();

            // Compile and load the class
            Class<?> dynamicClass = compiler.compileAndLoad("DynamicClass", javaCodeString);

            // Execute methods using reflection
            int result = (int) dynamicClass.getMethod("add", int.class, int.class).invoke(null, 5, 3);
            String message = (String) dynamicClass.getMethod("getMessage").invoke(null);

            System.out.println("Result of add(5, 3): " + result);
            System.out.println("Message: " + message);

        } catch (Exception e) {
            System.err.println("Error executing Java code: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
/*
OP
Result of add(5, 3): 8
Message: Hello from dynamic Java code!
 */