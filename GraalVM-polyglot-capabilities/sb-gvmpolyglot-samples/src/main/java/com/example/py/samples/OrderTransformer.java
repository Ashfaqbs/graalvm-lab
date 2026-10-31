package com.example.py.samples;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class OrderTransformer {
    public static void main(String[] args) {
        String jsonData = """
                {
                    "order_id": "12345",
                    "customer": {
                        "name": "John Doe",
                        "address": {
                            "line1": "123 Main St",
                            "city": "Springfield",
                            "state": "IL",
                            "zip": "62701"
                        },
                        "email": "johndoe@example.com"
                    },
                    "items": [
                        {
                            "product_id": "P001",
                            "name": "Laptop",
                            "quantity": 1,
                            "price": 1200
                        },
                        {
                            "product_id": "P002",
                            "name": "Mouse",
                            "quantity": 1,
                            "price": 25
                        }
                    ],
                    "order_date": "2025-02-11T14:35:00",
                    "payment_status": "Paid"
                }
                """;

        String pythonCode = """
import json
from datetime import datetime

# Load JSON data
data = json.loads(jsonData)

# Transform address
address = data['customer']['address']
destination_address = f"{address['line1']}, {address['city']}, {address['state']} {address['zip']}"

# Transform items
items = [
    {
        'sku': item['product_id'],
        'name': item['name'],
        'quantity': item['quantity'],
        'item_price': item['price']
    }
    for item in data['items']
]

# Transform date
order_date = datetime.strptime(data['order_date'], '%Y-%m-%dT%H:%M:%S')
shipment_date = order_date.strftime('%m/%d/%Y')

# Create transformed data
transformed_data = {
    'shipment_id': data['order_id'],
    'destination_address': destination_address,
    'items': items,
    'shipment_date': shipment_date,
    'payment_status': data['payment_status']
}

# Convert transformed data back to JSON
json.dumps(transformed_data)
""";


        // Create a polyglot context and execute the Python code
        try (Context context = Context.newBuilder("python")
                .allowAllAccess(true)
                .build()) {
            context.getBindings("python").putMember("jsonData", jsonData);
            Value result = context.eval("python", pythonCode);
            String transformedJson = result.asString();
            System.out.println("Transformed JSON: " + transformedJson);
        }
    }
}
/*
Example
IP
#### Input JSON (Original format)

json
{
  "order_id": "12345",
  "customer": {
    "name": "John Doe",
    "address": {
      "line1": "123 Main St",
      "city": "Springfield",
      "state": "IL",
      "zip": "62701"
    },
    "email": "johndoe@example.com"
  },
  "items": [
    {
      "product_id": "P001",
      "name": "Laptop",
      "quantity": 1,
      "price": 1200
    },
    {
      "product_id": "P002",
      "name": "Mouse",
      "quantity": 1,
      "price": 25
    }
  ],
  "order_date": "2025-02-11T14:35:00",
  "payment_status": "Paid"
}


OP
json
{
  "shipment_id": "12345",
  "destination_address": "123 Main St, Springfield, IL 62701",
  "items": [
    {
      "sku": "P001",
      "name": "Laptop",
      "quantity": 1,
      "item_price": 1200
    },
    {
      "sku": "P002",
      "name": "Mouse",
      "quantity": 1,
      "item_price": 25
    }
  ],
  "shipment_date": "02/11/2025",
  "payment_status": "Paid"
}

Code OP
Transformed JSON: {"shipment_id": "12345", "destination_address": "123 Main St, Springfield, IL 62701", "items": [{"sku": "P001", "name": "Laptop", "quantity": 1, "item_price": 1200}, {"sku": "P002", "name": "Mouse", "quantity": 1, "item_price": 25}], "shipment_date": "02/11/2025", "payment_status": "Paid"}

 */