package androidx.camera.core;

/* loaded from: classes.dex */
class CameraExecutor implements java.util.concurrent.Executor {
    private static final int DEFAULT_CORE_THREADS = 1;
    private static final int DEFAULT_MAX_THREADS = 1;
    private static final java.util.concurrent.ThreadFactory THREAD_FACTORY = new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.CameraExecutor.1
        private static final java.lang.String THREAD_NAME_STEM = "CameraX-core_camera_%d";
        private final java.util.concurrent.atomic.AtomicInteger mThreadId = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName(java.lang.String.format(java.util.Locale.US, THREAD_NAME_STEM, java.lang.Integer.valueOf(this.mThreadId.getAndIncrement())));
            return thread;
        }
    };
    private final java.lang.Object mExecutorLock = new java.lang.Object();
    private java.util.concurrent.ThreadPoolExecutor mThreadPoolExecutor = createExecutor();

    CameraExecutor() {
    }

    void init(androidx.camera.core.impl.CameraFactory cameraFactory) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        androidx.core.util.Preconditions.checkNotNull(cameraFactory);
        synchronized (this.mExecutorLock) {
            if (this.mThreadPoolExecutor.isShutdown()) {
                this.mThreadPoolExecutor = createExecutor();
            }
            threadPoolExecutor = this.mThreadPoolExecutor;
        }
        int max = java.lang.Math.max(1, cameraFactory.getAvailableCameraIds().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    void deinit() {
        synchronized (this.mExecutorLock) {
            if (!this.mThreadPoolExecutor.isShutdown()) {
                this.mThreadPoolExecutor.shutdown();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        androidx.core.util.Preconditions.checkNotNull(runnable);
        synchronized (this.mExecutorLock) {
            this.mThreadPoolExecutor.execute(runnable);
        }
    }

    private static java.util.concurrent.ThreadPoolExecutor createExecutor() {
        return new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), THREAD_FACTORY);
    }
}
