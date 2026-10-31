package com.example.js.samples;

import org.graalvm.polyglot.*;
import java.io.IOException;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
public class JavaJavaScriptJSONIntegration {
    public static void main(String[] args) {

        // JSON data
        String jsonData = """
    [
        {"id": 1, "name": "Alice", "marks": 85},
        {"id": 2, "name": "Bob", "marks": 75},
        {"id": 3, "name": "Charlie", "marks": 90},
        {"id": 4, "name": "David", "marks": 60}
    ]
""";

// JavaScript code to filter JSON data
        String script = """
    const students = JSON.parse(jsonData);
    const highScorers = students.filter(student => student.marks > 80);
    JSON.stringify(highScorers);
""";

        // Create a context for JavaScript execution
        try (Context context = Context.create("js")) {
        // Bind the JSON data to the JavaScript context
        context.getBindings("js").putMember("jsonData", jsonData);

        // Execute the script and get the result
        Value result = context.eval("js", script);

        // Print the result
        System.out.println(result.asString());
    }
}
}
/*
[{"id":1,"name":"Alice","marks":85},{"id":3,"name":"Charlie","marks":90}]

 */