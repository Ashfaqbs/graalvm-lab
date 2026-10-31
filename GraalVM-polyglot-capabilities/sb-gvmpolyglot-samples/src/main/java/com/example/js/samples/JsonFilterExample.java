package com.example.js.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class JsonFilterExample {
    public static void main(String[] args) {
        String jsonData = """
    [
        {"id": 1, "name": "John", "status": "active"},
        {"id": 2, "name": "Jane", "status": "inactive"},
        {"id": 3, "name": "Alice", "status": "active"}
    ]
""";

        String jsFunction = """
    function filterActiveUsers(jsonString) {
        const users = JSON.parse(jsonString);
        const activeUsers = users.filter(user => user.status === 'active');
        return JSON.stringify(activeUsers);
    }
""";


        try (Context context = Context.create("js")) {
            context.eval("js", jsFunction);
            Value filterFunction = context.getBindings("js").getMember("filterActiveUsers");
            Value result = filterFunction.execute(jsonData);
            System.out.println(result.asString());
        }
    }
}
/*
IP
[
  { "id": 1, "name": "John", "status": "active" },
  { "id": 2, "name": "Jane", "status": "inactive" },
  { "id": 3, "name": "Alice", "status": "active" }
]
 OP
 [
  { "id": 1, "name": "John", "status": "active" },
  { "id": 3, "name": "Alice", "status": "active" }
]  Filtering Out Data
 */