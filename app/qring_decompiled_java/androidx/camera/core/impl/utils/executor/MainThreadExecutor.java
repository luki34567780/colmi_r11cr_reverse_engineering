package androidx.camera.core.impl.utils.executor;

/* loaded from: classes.dex */
final class MainThreadExecutor {
    private static volatile java.util.concurrent.ScheduledExecutorService sInstance;

    private MainThreadExecutor() {
    }

    static java.util.concurrent.ScheduledExecutorService getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (androidx.camera.core.impl.utils.executor.MainThreadExecutor.class) {
            if (sInstance == null) {
                sInstance = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        }
        return sInstance;
    }
}
