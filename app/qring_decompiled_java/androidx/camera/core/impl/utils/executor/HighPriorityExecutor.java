package androidx.camera.core.impl.utils.executor;

/* loaded from: classes.dex */
final class HighPriorityExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor sExecutor;
    private final java.util.concurrent.ExecutorService mHighPriorityService = java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.HighPriorityExecutor.1
        private static final java.lang.String THREAD_NAME = "CameraX-camerax_high_priority";

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r) {
            java.lang.Thread thread = new java.lang.Thread(r);
            thread.setPriority(10);
            thread.setName(THREAD_NAME);
            return thread;
        }
    });

    HighPriorityExecutor() {
    }

    static java.util.concurrent.Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (androidx.camera.core.impl.utils.executor.HighPriorityExecutor.class) {
            if (sExecutor == null) {
                sExecutor = new androidx.camera.core.impl.utils.executor.HighPriorityExecutor();
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        this.mHighPriorityService.execute(command);
    }
}
