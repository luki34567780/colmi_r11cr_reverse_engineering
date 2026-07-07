package androidx.camera.core.impl.utils.executor;

/* loaded from: classes.dex */
final class IoExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor sExecutor;
    private final java.util.concurrent.ExecutorService mIoService = java.util.concurrent.Executors.newFixedThreadPool(2, new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.IoExecutor.1
        private static final java.lang.String THREAD_NAME_STEM = "CameraX-camerax_io_%d";
        private final java.util.concurrent.atomic.AtomicInteger mThreadId = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r) {
            java.lang.Thread thread = new java.lang.Thread(r);
            thread.setName(java.lang.String.format(java.util.Locale.US, THREAD_NAME_STEM, java.lang.Integer.valueOf(this.mThreadId.getAndIncrement())));
            return thread;
        }
    });

    IoExecutor() {
    }

    static java.util.concurrent.Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (androidx.camera.core.impl.utils.executor.IoExecutor.class) {
            if (sExecutor == null) {
                sExecutor = new androidx.camera.core.impl.utils.executor.IoExecutor();
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        this.mIoService.execute(command);
    }
}
