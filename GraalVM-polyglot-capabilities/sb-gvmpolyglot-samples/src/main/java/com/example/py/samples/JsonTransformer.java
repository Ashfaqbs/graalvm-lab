package com.example.py.samples;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class JsonTransformer {
    public static void main(String[] args) {
        String jsonData = """
[
    {"id": 1, "name": "John", "status": "active"},
    {"id": 2, "name": "Jane", "status": "inactive"},
    {"id": 3, "name": "Alice", "status": "active"}
]
""";

// Python code to filter JSON data
        String pythonCode = """
import json
data = json.loads(jsonData)
filtered_data = [item for item in data if item['status'] == 'active']
json.dumps(filtered_data)
""";


        // Create a polyglot context and execute the Python code
        try (Context context = Context.newBuilder("python")
                .allowAllAccess(true)
                .build()) {
            context.getBindings("python").putMember("jsonData", jsonData);
            Value result = context.eval("python", pythonCode);
            String filteredJson = result.asString();
            System.out.println("Filtered JSON: " + filteredJson);
        }
    }
}
/*
OP
Filtered JSON: [{"id": 1, "name": "John", "status": "active"}, {"id": 3, "name": "Alice", "status": "active"}]

 */