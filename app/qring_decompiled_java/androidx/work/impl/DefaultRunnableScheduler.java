package androidx.work.impl;

/* loaded from: classes.dex */
public class DefaultRunnableScheduler implements androidx.work.RunnableScheduler {
    private final android.os.Handler mHandler;

    public DefaultRunnableScheduler() {
        this.mHandler = androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper());
    }

    public DefaultRunnableScheduler(android.os.Handler handler) {
        this.mHandler = handler;
    }

    public android.os.Handler getHandler() {
        return this.mHandler;
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long delayInMillis, java.lang.Runnable runnable) {
        this.mHandler.postDelayed(runnable, delayInMillis);
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(java.lang.Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
}
