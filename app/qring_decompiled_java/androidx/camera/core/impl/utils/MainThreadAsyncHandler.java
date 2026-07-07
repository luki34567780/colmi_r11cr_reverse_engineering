package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
public final class MainThreadAsyncHandler {
    private static volatile android.os.Handler sHandler;

    public static android.os.Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (androidx.camera.core.impl.utils.MainThreadAsyncHandler.class) {
            if (sHandler == null) {
                sHandler = androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper());
            }
        }
        return sHandler;
    }

    private MainThreadAsyncHandler() {
    }
}
