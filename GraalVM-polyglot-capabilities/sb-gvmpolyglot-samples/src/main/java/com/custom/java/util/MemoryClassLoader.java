package com.custom.java.util;

public class MemoryClassLoader extends ClassLoader {
    private final String className;
    private final byte[] classBytes;

    public MemoryClassLoader(String className, byte[] classBytes) {
        this.className = className;
        this.classBytes = classBytes;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (name.equals(className)) {
            return defineClass(className, classBytes, 0, classBytes.length);
        }
        throw new ClassNotFoundException(name);
    }
}
