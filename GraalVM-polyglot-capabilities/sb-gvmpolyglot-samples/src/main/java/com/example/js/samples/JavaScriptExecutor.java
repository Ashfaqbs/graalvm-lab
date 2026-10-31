package com.example.js.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class JavaScriptExecutor {
    public static void main(String[] args) {
        // Create a context for JavaScript execution
        try (Context context = Context.create("js")) {
            // JavaScript code to execute
            String script = "const message = 'Hello from JavaScript!'; message;";

            // Execute the script and get the result
            Value result = context.eval("js", script);

            // Print the result
            System.out.println(result.asString());
        }
    }
}
