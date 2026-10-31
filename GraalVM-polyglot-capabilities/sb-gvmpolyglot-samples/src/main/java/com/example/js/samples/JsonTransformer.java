package com.example.js.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class JsonTransformer {
    public static void main(String[] args) {
//        String originalJson = "{"
//                + "\"first_name\": \"Jane\","
//                + "\"last_name\": \"Smith\","
//                + "\"age\": 30"
//                + "}";
//
//        String script = ""
//                + "function transform(jsonString) {"
//                + "    const obj = JSON.parse(jsonString);"
//                + "    const transformed = {"
//                + "        full_name: `${obj.first_name} ${obj.last_name}`,"
//                + "        years_old: obj.age"
//                + "    };"
//                + "    return JSON.stringify(transformed);"
//                + "}";


        String originalJson = """
    {
        "first_name": "Jane",
        "last_name": "Smith",
        "age": 30
    }
""";

        String script = """
    function transform(jsonString) {
        const obj = JSON.parse(jsonString);
        const transformed = {
            full_name: `${obj.first_name} ${obj.last_name}`,
            years_old: obj.age
        };
        return JSON.stringify(transformed);
    }
""";


        try (Context context = Context.create("js")) {
            context.getBindings("js").putMember("originalJson", originalJson);
            context.eval("js", script);
            Value transformFunction = context.getBindings("js").getMember("transform");
            Value result = transformFunction.execute(originalJson);
            System.out.println(result.asString());
        }
    }
}
/*
IP

{
  "first_name": "Jane",
  "last_name": "Smith",
  "age": 30
}

OP

{
  "full_name": "Jane Smith",
  "years_old": 30
}

 */