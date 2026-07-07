package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CloseUtils {
    private CloseUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static void closeIO(java.io.Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (java.io.Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void closeIOQuietly(java.io.Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (java.io.Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (java.io.IOException unused) {
                }
            }
        }
    }
}
