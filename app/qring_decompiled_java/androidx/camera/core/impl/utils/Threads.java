package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
public final class Threads {
    private Threads() {
    }

    public static boolean isMainThread() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static void checkMainThread() {
        androidx.core.util.Preconditions.checkState(isMainThread(), "Not in application's main thread");
    }

    public static void checkBackgroundThread() {
        androidx.core.util.Preconditions.checkState(isBackgroundThread(), "In application's main thread");
    }
}
