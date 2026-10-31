package com.example.py.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class EmployeeDataTransformer {
    public static void main(String[] args) {
        // Original JSON data as a string
        String jsonData = """
{
    "employee_id": "E00123",
    "first_name": "Jane",
    "last_name": "Smith",
    "dob": "1985-06-15",
    "hire_date": "2010-09-23",
    "job_title": "Software Engineer",
    "department": "Engineering",
    "salary": 95000,
    "annual_bonus": 5000,
    "bank_account": {
        "bank_name": "BigBank",
        "account_number": "1234567890",
        "routing_number": "987654321"
    },
    "employment_status": "Full-Time"
}
""";

// Python code to transform JSON data
        String pythonCode = """
import json

# Load JSON data
data = json.loads(jsonData)

# Create transformed data
transformed_data = {
    'employee_id': data['employee_id'],
    'full_name': f"{data['first_name']} {data['last_name']}",
    'date_of_birth': data['dob'],
    'hire_date': data['hire_date'],
    'job_title': data['job_title'],
    'department': data['department'],
    'salary': round(data['salary'] / 12, 2),
    'bonus': data['annual_bonus'],
    'bank_name': data['bank_account']['bank_name'],
    'account_number': data['bank_account']['account_number'],
    'routing_number': data['bank_account']['routing_number'],
    'employment_status': 'FT' if data['employment_status'] == 'Full-Time' else 'PT'
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
  "employee_id": "E00123",
  "first_name": "Jane",
  "last_name": "Smith",
  "dob": "1985-06-15",
  "hire_date": "2010-09-23",
  "job_title": "Software Engineer",
  "department": "Engineering",
  "salary": 95000,
  "annual_bonus": 5000,
  "bank_account": {
    "bank_name": "BigBank",
    "account_number": "1234567890",
    "routing_number": "987654321"
  },
  "employment_status": "Full-Time"
}  to {
  "employee_id": "E00123",
  "full_name": "Jane Smith",
  "date_of_birth": "1985-06-15",
  "hire_date": "2010-09-23",
  "job_title": "Software Engineer",
  "department": "Engineering",
  "salary": 7916.67,
  "bonus": 5000,
  "bank_name": "BigBank",
  "account_number": "1234567890",
  "routing_number": "987654321",
  "employment_status": "FT"
}

Transformed JSON: {"employee_id": "E00123", "full_name": "Jane Smith", "date_of_birth": "1985-06-15", "hire_date": "2010-09-23", "job_title": "Software Engineer", "department": "Engineering", "salary": 7916.67, "bonus": 5000, "bank_name": "BigBank", "account_number": "1234567890", "routing_number": "987654321", "employment_status": "FT"}


 */