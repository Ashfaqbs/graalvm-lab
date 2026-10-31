package com.custom.java.util;

import javax.tools.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class MemoryJavaFileManager extends ForwardingJavaFileManager<StandardJavaFileManager> {
    private Map<String, ByteArrayOutputStream> classBytes = new HashMap<>();

    public MemoryJavaFileManager(StandardJavaFileManager fileManager) {
        super(fileManager);
    }

    @Override
    public JavaFileObject getJavaFileForOutput(Location location, String className, JavaFileObject.Kind kind, FileObject sibling) {
        if (kind == JavaFileObject.Kind.CLASS) {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            classBytes.put(className, outputStream);
            return new SimpleJavaFileObject(URI.create("byte:///" + className.replace('.', '/') + kind.extension), kind) {
                @Override
                public OutputStream openOutputStream() {
                    return outputStream;
                }
            };
        }
        return null;
    }

    public byte[] getClassBytes(String className) {
        return classBytes.get(className).toByteArray();
    }
}