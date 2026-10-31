package com.example.py.samples;

import org.graalvm.polyglot.Context;

public class PythonInJava {
    public static void main(String[] args) {
        try (Context context = Context.create()) {
            context.eval("python", "print('Hello from GraalPy!')");
        }
    }
}

/*
OP
The following cause was found: JVMCI is not enabled for this JVM. Enable JVMCI using -XX:+EnableJVMCI.
For more information see: https://www.graalvm.org/latest/reference-manual/embed-languages/#runtime-optimization-support.
To disable this warning use the '--engine.WarnInterpreterOnly=false' option or the '-Dpolyglot.engine.WarnInterpreterOnly=false' system property.
Hello from GraalPy!


OP for print('Hello from GraalPy!'

[To redirect Truffle log output to a file use one of the following options:
* '--log.file=<path>' if the option is passed using a guest language launcher.
* '-Dpolyglot.log.file=<path>' if the option is passed using the host Java launcher.
* Configure logging using the polyglot embedding API.]
[engine] WARNING: The polyglot engine uses a fallback runtime that does not support runtime compilation to native code.
Execution without runtime compilation will negatively impact the guest application performance.
The following cause was found: JVMCI is not enabled for this JVM. Enable JVMCI using -XX:+EnableJVMCI.
For more information see: https://www.graalvm.org/latest/reference-manual/embed-languages/#runtime-optimization-support.
To disable this warning use the '--engine.WarnInterpreterOnly=false' option or the '-Dpolyglot.engine.WarnInterpreterOnly=false' system property.
Exception in thread "main" SyntaxError: '(' was never closed
	at org.graalvm.polyglot.Context.eval(Context.java:428)
	at com.example.py.samples.PythonInJava.main(PythonInJava.java:8)

Process finished with exit code 1

 */