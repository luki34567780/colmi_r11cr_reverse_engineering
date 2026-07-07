package com.bumptech.glide.util;

/* loaded from: /tmp/dex/classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t) {
        return (T) checkNotNull(t, "Argument must not be null");
    }

    public static <T> T checkNotNull(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    public static java.lang.String checkNotEmpty(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T extends java.util.Collection<Y>, Y> T checkNotEmpty(T t) {
        if (t.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Must not be empty.");
        }
        return t;
    }
}
