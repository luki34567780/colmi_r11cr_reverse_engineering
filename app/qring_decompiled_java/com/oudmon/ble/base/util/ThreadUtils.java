package com.oudmon.ble.base.util;

/* loaded from: /tmp/dex/classes2.dex */
public class ThreadUtils {
    private static final java.util.concurrent.ScheduledExecutorService mExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    private static final java.util.HashMap<com.oudmon.ble.base.util.ThreadUtils.TimeTask, java.util.concurrent.ScheduledFuture> mRunnableCache = new java.util.HashMap<>();
    private static final java.lang.Object mLock = new java.lang.Object();

    public static void postDelay(com.oudmon.ble.base.util.ThreadUtils.TimeTask timeTask, long j) {
        synchronized (mLock) {
            cancel(timeTask);
            mRunnableCache.put(timeTask, mExecutor.schedule(timeTask, j, java.util.concurrent.TimeUnit.MILLISECONDS));
        }
    }

    public static void cancel(com.oudmon.ble.base.util.ThreadUtils.TimeTask timeTask) {
        cancel(timeTask, false);
    }

    public static void cancel(com.oudmon.ble.base.util.ThreadUtils.TimeTask timeTask, boolean z) {
        synchronized (mLock) {
            java.util.HashMap<com.oudmon.ble.base.util.ThreadUtils.TimeTask, java.util.concurrent.ScheduledFuture> hashMap = mRunnableCache;
            java.util.concurrent.ScheduledFuture scheduledFuture = hashMap.get(timeTask);
            if (scheduledFuture != null) {
                scheduledFuture.cancel(z);
                hashMap.remove(timeTask);
            }
        }
    }

    public static abstract class TimeTask implements java.lang.Runnable {
        protected abstract void task();

        @Override // java.lang.Runnable
        public void run() {
            task();
            com.oudmon.ble.base.util.ThreadUtils.mRunnableCache.remove(this);
        }
    }
}
