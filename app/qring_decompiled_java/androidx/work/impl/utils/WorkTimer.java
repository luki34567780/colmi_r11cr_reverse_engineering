package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class WorkTimer {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkTimer");
    private final java.util.concurrent.ThreadFactory mBackgroundThreadFactory;
    private final java.util.concurrent.ScheduledExecutorService mExecutorService;
    final java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> mListeners;
    final java.lang.Object mLock;
    final java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> mTimerMap;

    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(java.lang.String workSpecId);
    }

    public WorkTimer() {
        java.util.concurrent.ThreadFactory threadFactory = new java.util.concurrent.ThreadFactory() { // from class: androidx.work.impl.utils.WorkTimer.1
            private int mThreadsCreated = 0;

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable r) {
                java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(r);
                newThread.setName("WorkManager-WorkTimer-thread-" + this.mThreadsCreated);
                this.mThreadsCreated = this.mThreadsCreated + 1;
                return newThread;
            }
        };
        this.mBackgroundThreadFactory = threadFactory;
        this.mTimerMap = new java.util.HashMap();
        this.mListeners = new java.util.HashMap();
        this.mLock = new java.lang.Object();
        this.mExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(threadFactory);
    }

    public void startTimer(final java.lang.String workSpecId, long processingTimeMillis, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener listener) {
        synchronized (this.mLock) {
            androidx.work.Logger.get().debug(TAG, java.lang.String.format("Starting timer for %s", workSpecId), new java.lang.Throwable[0]);
            stopTimer(workSpecId);
            androidx.work.impl.utils.WorkTimer.WorkTimerRunnable workTimerRunnable = new androidx.work.impl.utils.WorkTimer.WorkTimerRunnable(this, workSpecId);
            this.mTimerMap.put(workSpecId, workTimerRunnable);
            this.mListeners.put(workSpecId, listener);
            this.mExecutorService.schedule(workTimerRunnable, processingTimeMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public void stopTimer(final java.lang.String workSpecId) {
        synchronized (this.mLock) {
            if (this.mTimerMap.remove(workSpecId) != null) {
                androidx.work.Logger.get().debug(TAG, java.lang.String.format("Stopping timer for %s", workSpecId), new java.lang.Throwable[0]);
                this.mListeners.remove(workSpecId);
            }
        }
    }

    public void onDestroy() {
        if (this.mExecutorService.isShutdown()) {
            return;
        }
        this.mExecutorService.shutdownNow();
    }

    public synchronized java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.WorkTimerRunnable> getTimerMap() {
        return this.mTimerMap;
    }

    public synchronized java.util.Map<java.lang.String, androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener> getListeners() {
        return this.mListeners;
    }

    public java.util.concurrent.ScheduledExecutorService getExecutorService() {
        return this.mExecutorService;
    }

    public static class WorkTimerRunnable implements java.lang.Runnable {
        static final java.lang.String TAG = "WrkTimerRunnable";
        private final java.lang.String mWorkSpecId;
        private final androidx.work.impl.utils.WorkTimer mWorkTimer;

        WorkTimerRunnable(androidx.work.impl.utils.WorkTimer workTimer, java.lang.String workSpecId) {
            this.mWorkTimer = workTimer;
            this.mWorkSpecId = workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.mWorkTimer.mLock) {
                if (this.mWorkTimer.mTimerMap.remove(this.mWorkSpecId) != null) {
                    androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener remove = this.mWorkTimer.mListeners.remove(this.mWorkSpecId);
                    if (remove != null) {
                        remove.onTimeLimitExceeded(this.mWorkSpecId);
                    }
                } else {
                    androidx.work.Logger.get().debug(TAG, java.lang.String.format("Timer with %s is already marked as complete.", this.mWorkSpecId), new java.lang.Throwable[0]);
                }
            }
        }
    }
}
