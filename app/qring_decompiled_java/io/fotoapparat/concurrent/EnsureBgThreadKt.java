package io.fotoapparat.concurrent;

/* compiled from: ensureBgThread.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"ensureBackgroundThread", "", "fotoapparat_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class EnsureBgThreadKt {
    public static final void ensureBackgroundThread() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalThreadStateException("Operation should not run from main thread.");
        }
    }
}
