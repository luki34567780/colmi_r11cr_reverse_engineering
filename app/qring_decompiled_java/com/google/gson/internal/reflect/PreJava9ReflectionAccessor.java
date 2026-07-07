package com.google.gson.internal.reflect;

/* loaded from: /tmp/dex/classes2.dex */
final class PreJava9ReflectionAccessor extends com.google.gson.internal.reflect.ReflectionAccessor {
    PreJava9ReflectionAccessor() {
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(java.lang.reflect.AccessibleObject accessibleObject) {
        accessibleObject.setAccessible(true);
    }
}
