package com.example.js.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class OrderTransformer {
    public static void main(String[] args) {
//        String originalJson = "{"
//                + "\"order\": {"
//                + "    \"order_id\": \"ORD12345\","
//                + "    \"items\": ["
//                + "        { \"product_id\": \"A1\", \"quantity\": 2, \"price\": 10 },"
//                + "        { \"product_id\": \"B2\", \"quantity\": 1, \"price\": 20 }"
//                + "    ]"
//                + "}"
//                + "}";
//
//        String script = ""
//                + "function transformOrder(jsonString) {"
//                + "    const data = JSON.parse(jsonString);"
//                + "    const order = data.order;"
//                + "    const total_quantity = order.items.reduce((sum, item) => sum + item.quantity, 0);"
//                + "    const total_amount = order.items.reduce((sum, item) => sum + (item.quantity * item.price), 0);"
//                + "    const transformed = {"
//                + "        order_id: order.order_id,"
//                + "        total_quantity: total_quantity,"
//                + "        total_amount: total_amount"
//                + "    };"
//                + "    return JSON.stringify(transformed);"
//                + "}";

        String originalJson = """
    {
        "order": {
            "order_id": "ORD12345",
            "items": [
                { "product_id": "A1", "quantity": 2, "price": 10 },
                { "product_id": "B2", "quantity": 1, "price": 20 }
            ]
        }
    }
""";

        String script = """
    function transformOrder(jsonString) {
        const data = JSON.parse(jsonString);
        const order = data.order;
        const total_quantity = order.items.reduce((sum, item) => sum + item.quantity, 0);
        const total_amount = order.items.reduce((sum, item) => sum + (item.quantity * item.price), 0);
        const transformed = {
            order_id: order.order_id,
            total_quantity: total_quantity,
            total_amount: total_amount
        };
        return JSON.stringify(transformed);
    }
""";


        try (Context context = Context.create("js")) {
            context.getBindings("js").putMember("originalJson", originalJson);
            context.eval("js", script);
            Value transformFunction = context.getBindings("js").getMember("transformOrder");
            Value result = transformFunction.execute(originalJson);
            System.out.println(result.asString());
        }
    }
}
/*

IP
{
  "order": {
    "order_id": "ORD12345",
    "items": [
      { "product_id": "A1", "quantity": 2, "price": 10 },
      { "product_id": "B2", "quantity": 1, "price": 20 }
    ]
  }
}

OP


 {
  "order_id": "ORD12345",
  "total_quantity": 3,
  "total_amount": 40
}
 */