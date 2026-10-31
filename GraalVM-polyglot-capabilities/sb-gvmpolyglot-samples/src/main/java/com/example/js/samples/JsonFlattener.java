package com.example.js.samples;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class JsonFlattener {
    public static void main(String[] args) {
//        String nestedJson = "{"
//                + "\"user\": {"
//                + "    \"id\": 1,"
//                + "    \"name\": \"John Doe\","
//                + "    \"address\": {"
//                + "        \"street\": \"123 Main St\","
//                + "        \"city\": \"Springfield\","
//                + "        \"zipcode\": \"98765\""
//                + "    }"
//                + "}"
//                + "}";
//
//        String script = ""
//                + "function flattenObject(obj, parentKey = '', result = {}) {"
//                + "    for (const [key, value] of Object.entries(obj)) {"
//                + "        const newKey = parentKey ? `${parentKey}_${key}` : key;"
//                + "        if (value && typeof value === 'object' && !Array.isArray(value)) {"
//                + "            flattenObject(value, newKey, result);"
//                + "        } else {"
//                + "            result[newKey] = value;"
//                + "        }"
//                + "    }"
//                + "    return result;"
//                + "}"
//                + "const nested = JSON.parse(nestedJson);"
//                + "const flattened = flattenObject(nested);"
//                + "JSON.stringify(flattened);";

        String nestedJson = """
    {
        "user": {
            "id": 1,
            "name": "John Doe",
            "address": {
                "street": "123 Main St",
                "city": "Springfield",
                "zipcode": "98765"
            }
        }
    }
""";

        String script = """
    function flattenObject(obj, parentKey = '', result = {}) {
        for (const [key, value] of Object.entries(obj)) {
            const newKey = parentKey ? `${parentKey}_${key}` : key;
            if (value && typeof value === 'object' && !Array.isArray(value)) {
                flattenObject(value, newKey, result);
            } else {
                result[newKey] = value;
            }
        }
        return result;
    }
    const nested = JSON.parse(nestedJson);
    const flattened = flattenObject(nested);
    JSON.stringify(flattened);
""";


        try (Context context = Context.create("js")) {
            context.getBindings("js").putMember("nestedJson", nestedJson);
            Value result = context.eval("js", script);
            System.out.println(result.asString());
        }
    }
}
/*
IP
{
  "user": {
    "id": 1,
    "name": "John Doe",
    "address": {
      "street": "123 Main St",
      "city": "Springfield",
      "zipcode": "98765"
    }
  }
}


OP
{"user_id":1,"user_name":"John Doe","user_address_street":"123 Main St","user_address_city":"Springfield","user_address_zipcode":"98765"}


 */