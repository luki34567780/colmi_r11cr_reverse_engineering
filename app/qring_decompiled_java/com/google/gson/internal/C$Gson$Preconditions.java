package com.google.gson.internal;

/* renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* loaded from: /tmp/dex/classes2.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }
}
