package com.example.py.samples;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PythonInJava2 {

    public static void main(String[] args) {
        // Path to the Python script
        Path scriptPath = Paths.get("sb-gvmpolyglot-samples/src/main/resources/py/printpy.py");


        // Create a polyglot context
        try (Context context = Context.create()) {
            // Read the Python script content
            String scriptContent = Files.readString(scriptPath);

            // Execute the Python script
            context.eval(Source.newBuilder("python", scriptContent, scriptPath.toString()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
