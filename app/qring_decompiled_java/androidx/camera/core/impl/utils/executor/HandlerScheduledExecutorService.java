package androidx.camera.core.impl.utils.executor;

/* loaded from: classes.dex */
final class HandlerScheduledExecutorService extends java.util.concurrent.AbstractExecutorService implements java.util.concurrent.ScheduledExecutorService {
    private static java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService> sThreadLocalInstance = new java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.1
        @Override // java.lang.ThreadLocal
        public java.util.concurrent.ScheduledExecutorService initialValue() {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                return androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
            }
            if (android.os.Looper.myLooper() != null) {
                return new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(android.os.Looper.myLooper()));
            }
            return null;
        }
    };
    private final android.os.Handler mHandler;

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    HandlerScheduledExecutorService(android.os.Handler handler) {
        this.mHandler = handler;
    }

    static java.util.concurrent.ScheduledExecutorService currentThreadExecutor() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = sThreadLocalInstance.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException("Current thread has no looper!");
        }
        androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService handlerScheduledExecutorService = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(myLooper));
        sThreadLocalInstance.set(handlerScheduledExecutorService);
        return handlerScheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> schedule(final java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit) {
        return schedule(new java.util.concurrent.Callable<java.lang.Void>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.2
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() {
                command.run();
                return null;
            }
        }, delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + java.util.concurrent.TimeUnit.MILLISECONDS.convert(delay, unit);
        androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture handlerScheduledFuture = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture(this.mHandler, uptimeMillis, callable);
        return this.mHandler.postAtTime(handlerScheduledFuture, uptimeMillis) ? handlerScheduledFuture : androidx.camera.core.impl.utils.futures.Futures.immediateFailedScheduledFuture(createPostFailedException());
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        if (!this.mHandler.post(command)) {
            throw createPostFailedException();
        }
    }

    private java.util.concurrent.RejectedExecutionException createPostFailedException() {
        return new java.util.concurrent.RejectedExecutionException(this.mHandler + " is shutting down");
    }

    private static class HandlerScheduledFuture<V> implements java.util.concurrent.RunnableScheduledFuture<V> {
        final java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V>> mCompleter = new java.util.concurrent.atomic.AtomicReference<>(null);
        private final com.google.common.util.concurrent.ListenableFuture<V> mDelegate;
        private final long mRunAtMillis;
        private final java.util.concurrent.Callable<V> mTask;

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        HandlerScheduledFuture(final android.os.Handler handler, long runAtMillis, final java.util.concurrent.Callable<V> task) {
            this.mRunAtMillis = runAtMillis;
            this.mTask = task;
            this.mDelegate = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer) throws java.util.concurrent.RejectedExecutionException {
                    completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this.mCompleter.getAndSet(null) != null) {
                                handler.removeCallbacks(androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this);
                            }
                        }
                    }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                    androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this.mCompleter.set(completer);
                    return "HandlerScheduledFuture-" + task.toString();
                }
            });
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit unit) {
            return unit.convert(this.mRunAtMillis - java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override // java.lang.Comparable
        public int compareTo(java.util.concurrent.Delayed o) {
            return java.lang.Long.compare(getDelay(java.util.concurrent.TimeUnit.MILLISECONDS), o.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer andSet = this.mCompleter.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.set(this.mTask.call());
                } catch (java.lang.Exception e) {
                    andSet.setException(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            return this.mDelegate.cancel(mayInterruptIfRunning);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.mDelegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.mDelegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            return this.mDelegate.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            return this.mDelegate.get(timeout, unit);
        }
    }
}
