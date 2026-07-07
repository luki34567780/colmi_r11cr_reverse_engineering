package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Asserts {
    private Asserts() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static void checkMainThread(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.Thread.currentThread());
        java.lang.String valueOf2 = java.lang.String.valueOf(android.os.Looper.getMainLooper().getThread());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 57 + java.lang.String.valueOf(valueOf2).length());
        sb.append("checkMainThread: current thread ");
        sb.append(valueOf);
        sb.append(" IS NOT the main thread ");
        sb.append(valueOf2);
        sb.append("!");
        android.util.Log.e("Asserts", sb.toString());
        throw new java.lang.IllegalStateException(str);
    }

    public static void checkNotMainThread(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.Thread.currentThread());
        java.lang.String valueOf2 = java.lang.String.valueOf(android.os.Looper.getMainLooper().getThread());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 56 + java.lang.String.valueOf(valueOf2).length());
        sb.append("checkNotMainThread: current thread ");
        sb.append(valueOf);
        sb.append(" IS the main thread ");
        sb.append(valueOf2);
        sb.append("!");
        android.util.Log.e("Asserts", sb.toString());
        throw new java.lang.IllegalStateException(str);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("null reference");
        }
    }

    public static void checkNull(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.IllegalArgumentException("non-null reference");
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj2));
        }
    }

    public static void checkState(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
