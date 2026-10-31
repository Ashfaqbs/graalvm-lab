package com.example.js.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class StudentAverageCalculator {
    public static void main(String[] args) {
//        String jsonData = "{"
//                + "\"students\": ["
//                + "    { \"id\": 101, \"name\": \"Tom\", \"scores\": [85, 90, 78] },"
//                + "    { \"id\": 102, \"name\": \"Emma\", \"scores\": [92, 88, 85] }"
//                + "]"
//                + "}";
//
//        String jsFunction = ""
//                + "function calculateAverageScores(jsonString) {"
//                + "    const data = JSON.parse(jsonString);"
//                + "    const updatedStudents = data.students.map(student => {"
//                + "        const totalScore = student.scores.reduce((sum, score) => sum + score, 0);"
//                + "        const averageScore = totalScore / student.scores.length;"
//                + "        return {"
//                + "            id: student.id,"
//                + "            name: student.name,"
//                + "            average_score: parseFloat(averageScore.toFixed(2))"
//                + "        };"
//                + "    });"
//                + "    return JSON.stringify({ students: updatedStudents });"
//                + "}";

        String jsonData = """
    {
        "students": [
            { "id": 101, "name": "Tom", "scores": [85, 90, 78] },
            { "id": 102, "name": "Emma", "scores": [92, 88, 85] }
        ]
    }
""";

        String jsFunction = """
    function calculateAverageScores(jsonString) {
        const data = JSON.parse(jsonString);
        const updatedStudents = data.students.map(student => {
            const totalScore = student.scores.reduce((sum, score) => sum + score, 0);
            const averageScore = totalScore / student.scores.length;
            return {
                id: student.id,
                name: student.name,
                average_score: parseFloat(averageScore.toFixed(2))
            };
        });
        return JSON.stringify({ students: updatedStudents });
    }
""";


        try (Context context = Context.create("js")) {
            context.eval("js", jsFunction);
            Value calculateFunction = context.getBindings("js").getMember("calculateAverageScores");
            Value result = calculateFunction.execute(jsonData);
            System.out.println(result.asString());
        }
    }
    /*
IP

    {
  "students": [
    { "id": 101, "name": "Tom", "scores": [85, 90, 78] },
    { "id": 102, "name": "Emma", "scores": [92, 88, 85] }
  ]
}


 OP

 {
  "students": [
    { "id": 101, "name": "Tom", "average_score": 84.33 },
    { "id": 102, "name": "Emma", "average_score": 88.33 }
  ]
}
     */
}
