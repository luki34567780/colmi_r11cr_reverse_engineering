package com.bumptech.glide.load.engine.executor;

/* loaded from: /tmp/dex/classes2.dex */
public final class GlideExecutor implements java.util.concurrent.ExecutorService {
    private static final java.lang.String DEFAULT_ANIMATION_EXECUTOR_NAME = "animation";
    private static final java.lang.String DEFAULT_DISK_CACHE_EXECUTOR_NAME = "disk-cache";
    private static final int DEFAULT_DISK_CACHE_EXECUTOR_THREADS = 1;
    private static final java.lang.String DEFAULT_SOURCE_EXECUTOR_NAME = "source";
    private static final java.lang.String DEFAULT_SOURCE_UNLIMITED_EXECUTOR_NAME = "source-unlimited";
    private static final long KEEP_ALIVE_TIME_MS = java.util.concurrent.TimeUnit.SECONDS.toMillis(10);
    private static final int MAXIMUM_AUTOMATIC_THREAD_COUNT = 4;
    private static final java.lang.String TAG = "GlideExecutor";
    private static volatile int bestThreadCount;
    private final java.util.concurrent.ExecutorService delegate;

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newDiskCacheBuilder() {
        return new com.bumptech.glide.load.engine.executor.GlideExecutor.Builder(true).setThreadCount(1).setName(DEFAULT_DISK_CACHE_EXECUTOR_NAME);
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor() {
        return newDiskCacheBuilder().build();
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newDiskCacheBuilder().setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newDiskCacheExecutor(int i, java.lang.String str, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newDiskCacheBuilder().setThreadCount(i).setName(str).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newSourceBuilder() {
        return new com.bumptech.glide.load.engine.executor.GlideExecutor.Builder(false).setThreadCount(calculateBestThreadCount()).setName(DEFAULT_SOURCE_EXECUTOR_NAME);
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor() {
        return newSourceBuilder().build();
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newSourceBuilder().setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newSourceExecutor(int i, java.lang.String str, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newSourceBuilder().setThreadCount(i).setName(str).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newUnlimitedSourceExecutor() {
        return new com.bumptech.glide.load.engine.executor.GlideExecutor(new java.util.concurrent.ThreadPoolExecutor(0, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, KEEP_ALIVE_TIME_MS, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.SynchronousQueue(), new com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory(DEFAULT_SOURCE_UNLIMITED_EXECUTOR_NAME, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT, false)));
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor.Builder newAnimationBuilder() {
        return new com.bumptech.glide.load.engine.executor.GlideExecutor.Builder(true).setThreadCount(calculateBestThreadCount() >= 4 ? 2 : 1).setName(DEFAULT_ANIMATION_EXECUTOR_NAME);
    }

    public static com.bumptech.glide.load.engine.executor.GlideExecutor newAnimationExecutor() {
        return newAnimationBuilder().build();
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.engine.executor.GlideExecutor newAnimationExecutor(int i, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        return newAnimationBuilder().setThreadCount(i).setUncaughtThrowableStrategy(uncaughtThrowableStrategy).build();
    }

    GlideExecutor(java.util.concurrent.ExecutorService executorService) {
        this.delegate = executorService;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return (T) this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.delegate.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        return this.delegate.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    public java.lang.String toString() {
        return this.delegate.toString();
    }

    public static int calculateBestThreadCount() {
        if (bestThreadCount == 0) {
            bestThreadCount = java.lang.Math.min(4, com.bumptech.glide.load.engine.executor.RuntimeCompat.availableProcessors());
        }
        return bestThreadCount;
    }

    public interface UncaughtThrowableStrategy {
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy DEFAULT;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy IGNORE = new com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy() { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.1
            @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
            public void handle(java.lang.Throwable th) {
            }
        };
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy LOG;
        public static final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy THROW;

        void handle(java.lang.Throwable th);

        static {
            com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy = new com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy() { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.2
                @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
                public void handle(java.lang.Throwable th) {
                    if (th == null || !android.util.Log.isLoggable(com.bumptech.glide.load.engine.executor.GlideExecutor.TAG, 6)) {
                        return;
                    }
                    android.util.Log.e(com.bumptech.glide.load.engine.executor.GlideExecutor.TAG, "Request threw uncaught throwable", th);
                }
            };
            LOG = uncaughtThrowableStrategy;
            THROW = new com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy() { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.3
                @Override // com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy
                public void handle(java.lang.Throwable th) {
                    if (th != null) {
                        throw new java.lang.RuntimeException("Request threw uncaught throwable", th);
                    }
                }
            };
            DEFAULT = uncaughtThrowableStrategy;
        }
    }

    private static final class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private static final int DEFAULT_PRIORITY = 9;
        private final java.lang.String name;
        final boolean preventNetworkOperations;
        private int threadNum;
        final com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy;

        DefaultThreadFactory(java.lang.String str, com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy, boolean z) {
            this.name = str;
            this.uncaughtThrowableStrategy = uncaughtThrowableStrategy;
            this.preventNetworkOperations = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread;
            thread = new java.lang.Thread(runnable, "glide-" + this.name + "-thread-" + this.threadNum) { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    android.os.Process.setThreadPriority(9);
                    if (com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory.this.preventNetworkOperations) {
                        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (java.lang.Throwable th) {
                        com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory.this.uncaughtThrowableStrategy.handle(th);
                    }
                }
            };
            this.threadNum = this.threadNum + 1;
            return thread;
        }
    }

    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT = 0;
        private int corePoolSize;
        private int maximumPoolSize;
        private java.lang.String name;
        private final boolean preventNetworkOperations;
        private long threadTimeoutMillis;
        private com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy = com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy.DEFAULT;

        Builder(boolean z) {
            this.preventNetworkOperations = z;
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setThreadTimeoutMillis(long j) {
            this.threadTimeoutMillis = j;
            return this;
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setThreadCount(int i) {
            this.corePoolSize = i;
            this.maximumPoolSize = i;
            return this;
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setUncaughtThrowableStrategy(com.bumptech.glide.load.engine.executor.GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy) {
            this.uncaughtThrowableStrategy = uncaughtThrowableStrategy;
            return this;
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor.Builder setName(java.lang.String str) {
            this.name = str;
            return this;
        }

        public com.bumptech.glide.load.engine.executor.GlideExecutor build() {
            if (android.text.TextUtils.isEmpty(this.name)) {
                throw new java.lang.IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.name);
            }
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(this.corePoolSize, this.maximumPoolSize, this.threadTimeoutMillis, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue(), new com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory(this.name, this.uncaughtThrowableStrategy, this.preventNetworkOperations));
            if (this.threadTimeoutMillis != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new com.bumptech.glide.load.engine.executor.GlideExecutor(threadPoolExecutor);
        }
    }
}
