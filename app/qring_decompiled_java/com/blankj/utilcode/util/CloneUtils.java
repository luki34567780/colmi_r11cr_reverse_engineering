package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CloneUtils {
    private CloneUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static <T> T deepClone(T t, java.lang.reflect.Type type) {
        try {
            return (T) com.blankj.utilcode.util.UtilsBridge.fromJson(com.blankj.utilcode.util.UtilsBridge.toJson(t), type);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
