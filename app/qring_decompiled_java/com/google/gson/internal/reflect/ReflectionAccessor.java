package com.google.gson.internal.reflect;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ReflectionAccessor {
    private static final com.google.gson.internal.reflect.ReflectionAccessor instance;

    public abstract void makeAccessible(java.lang.reflect.AccessibleObject accessibleObject);

    static {
        instance = com.google.gson.internal.JavaVersion.getMajorJavaVersion() < 9 ? new com.google.gson.internal.reflect.PreJava9ReflectionAccessor() : new com.google.gson.internal.reflect.UnsafeReflectionAccessor();
    }

    public static com.google.gson.internal.reflect.ReflectionAccessor getInstance() {
        return instance;
    }
}
