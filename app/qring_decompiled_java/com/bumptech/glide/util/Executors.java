package com.bumptech.glide.util;

/* loaded from: /tmp/dex/classes2.dex */
public final class Executors {
    private static final java.util.concurrent.Executor MAIN_THREAD_EXECUTOR = new java.util.concurrent.Executor() { // from class: com.bumptech.glide.util.Executors.1
        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            com.bumptech.glide.util.Util.postOnUiThread(runnable);
        }
    };
    private static final java.util.concurrent.Executor DIRECT_EXECUTOR = new java.util.concurrent.Executor() { // from class: com.bumptech.glide.util.Executors.2
        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            runnable.run();
        }
    };

    private Executors() {
    }

    public static java.util.concurrent.Executor mainThreadExecutor() {
        return MAIN_THREAD_EXECUTOR;
    }

    public static java.util.concurrent.Executor directExecutor() {
        return DIRECT_EXECUTOR;
    }

    public static void shutdownAndAwaitTermination(java.util.concurrent.ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            if (executorService.awaitTermination(5L, java.util.concurrent.TimeUnit.SECONDS)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, java.util.concurrent.TimeUnit.SECONDS)) {
            } else {
                throw new java.lang.RuntimeException("Failed to shutdown");
            }
        } catch (java.lang.InterruptedException e) {
            executorService.shutdownNow();
            java.lang.Thread.currentThread().interrupt();
            throw new java.lang.RuntimeException(e);
        }
    }
}
