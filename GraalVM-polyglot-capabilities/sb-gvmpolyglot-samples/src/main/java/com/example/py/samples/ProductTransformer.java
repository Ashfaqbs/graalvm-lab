package com.example.py.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class ProductTransformer {
    public static void main(String[] args) {
        // Original JSON data as a string
        String jsonData = """
                {
                    "product_id": "P12345",
                    "name": "Wireless Headphones",
                    "description": "High-quality Bluetooth headphones with noise cancellation",
                    "price": 99.99,
                    "quantity_in_stock": 150,
                    "manufacturer": "TechCorp",
                    "category": "Electronics",
                    "specifications": {
                        "color": "Black",
                        "battery_life": "20 hours",
                        "bluetooth_version": "5.0"
                    },
                    "tags": ["headphones", "wireless", "electronics"]
                }
                """;

// Python code to transform JSON data
        String pythonCode = """
import json

# Load JSON data
data = json.loads(jsonData)

# Create transformed data
transformed_data = {
    'product_id': data['product_id'],
    'product_name': data['name'],
    'product_description': data['description'],
    'regular_price': data['price'],
    'sale_price': data['price'] * 0.9,  # Assuming a 10% discount for sale price
    'inventory_count': data['quantity_in_stock'],
    'manufacturer': data['manufacturer'],
    'product_category': data['category'],
    'color': data['specifications']['color'],
    'battery_life': data['specifications']['battery_life'],
    'bluetooth_version': data['specifications']['bluetooth_version'],
    'product_tags': data['tags']
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

{
  "product_id": "P12345",
  "name": "Wireless Headphones",
  "description": "High-quality Bluetooth headphones with noise cancellation",
  "price": 99.99,
  "quantity_in_stock": 150,
  "manufacturer": "TechCorp",
  "category": "Electronics",
  "specifications": {
    "color": "Black",
    "battery_life": "20 hours",
    "bluetooth_version": "5.0"
  },
  "tags": ["headphones", "wireless", "electronics"]
}
to
{
  "product_id": "P12345",
  "product_name": "Wireless Headphones",
  "product_description": "High-quality Bluetooth headphones with noise cancellation",
  "regular_price": 99.99,
  "sale_price": 89.99,
  "inventory_count": 150,
  "manufacturer": "TechCorp",
  "product_category": "Electronics",
  "color": "Black",
  "battery_life": "20 hours",
  "bluetooth_version": "5.0",
  "product_tags": ["headphones", "wireless", "electronics"]
}



Transformed JSON: {"product_id": "P12345", "product_name": "Wireless Headphones", "product_description": "High-quality Bluetooth headphones with noise cancellation", "regular_price": 99.99, "sale_price": 89.991, "inventory_count": 150, "manufacturer": "TechCorp", "product_category": "Electronics", "color": "Black", "battery_life": "20 hours", "bluetooth_version": "5.0", "product_tags": ["headphones", "wireless", "electronics"]}

 */
