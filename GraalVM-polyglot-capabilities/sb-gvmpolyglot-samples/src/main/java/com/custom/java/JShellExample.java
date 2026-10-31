package com.custom.java;

import jdk.jshell.JShell;
import jdk.jshell.SnippetEvent;
import java.util.List;

public class JShellExample {
    public static void main(String[] args) {
        try (JShell jshell = JShell.create()) {
            // Evaluate a code snippet stored in a string
            List<SnippetEvent> events = jshell.eval("System.out.println(\"Hello from JShell!\");");
            // Optionally, process events to capture output or errors.
        }
    }
}

/*
Hello from JShell!
 */