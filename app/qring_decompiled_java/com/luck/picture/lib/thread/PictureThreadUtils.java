package com.luck.picture.lib.thread;

/* loaded from: /tmp/dex/classes2.dex */
public final class PictureThreadUtils {
    private static final byte TYPE_CACHED = -2;
    private static final byte TYPE_CPU = -8;
    private static final byte TYPE_IO = -4;
    private static final byte TYPE_SINGLE = -1;
    private static java.util.concurrent.Executor sDeliver;
    private static final android.os.Handler HANDLER = new android.os.Handler(android.os.Looper.getMainLooper());
    private static final java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.concurrent.ExecutorService>> TYPE_PRIORITY_POOLS = new java.util.HashMap();
    private static final java.util.Map<com.luck.picture.lib.thread.PictureThreadUtils.Task, java.util.concurrent.ExecutorService> TASK_POOL_MAP = new java.util.concurrent.ConcurrentHashMap();
    private static final int CPU_COUNT = java.lang.Runtime.getRuntime().availableProcessors();
    private static final java.util.Timer TIMER = new java.util.Timer();

    public static boolean isInUiThread() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static android.os.Handler getMainHandler() {
        return HANDLER;
    }

    public static void runOnUiThread(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public static void runOnUiThreadDelayed(java.lang.Runnable runnable, long j) {
        HANDLER.postDelayed(runnable, j);
    }

    public static java.util.concurrent.ExecutorService getFixedPool(int i) {
        return getPoolByTypeAndPriority(i);
    }

    public static java.util.concurrent.ExecutorService getFixedPool(int i, int i2) {
        return getPoolByTypeAndPriority(i, i2);
    }

    public static java.util.concurrent.ExecutorService getSinglePool() {
        return getPoolByTypeAndPriority(-1);
    }

    public static java.util.concurrent.ExecutorService getSinglePool(int i) {
        return getPoolByTypeAndPriority(-1, i);
    }

    public static java.util.concurrent.ExecutorService getCachedPool() {
        return getPoolByTypeAndPriority(-2);
    }

    public static java.util.concurrent.ExecutorService getCachedPool(int i) {
        return getPoolByTypeAndPriority(-2, i);
    }

    public static java.util.concurrent.ExecutorService getIoPool() {
        return getPoolByTypeAndPriority(-4);
    }

    public static java.util.concurrent.ExecutorService getIoPool(int i) {
        return getPoolByTypeAndPriority(-4, i);
    }

    public static java.util.concurrent.ExecutorService getCpuPool() {
        return getPoolByTypeAndPriority(-8);
    }

    public static java.util.concurrent.ExecutorService getCpuPool(int i) {
        return getPoolByTypeAndPriority(-8, i);
    }

    public static <T> void executeByFixed(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task) {
        execute(getPoolByTypeAndPriority(i), task);
    }

    public static <T> void executeByFixed(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, int i2) {
        execute(getPoolByTypeAndPriority(i, i2), task);
    }

    public static <T> void executeByFixedWithDelay(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(i), task, j, timeUnit);
    }

    public static <T> void executeByFixedWithDelay(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i2) {
        executeWithDelay(getPoolByTypeAndPriority(i, i2), task, j, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i), task, 0L, j, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i2) {
        executeAtFixedRate(getPoolByTypeAndPriority(i, i2), task, 0L, j, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i), task, j, j2, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(int i, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i2) {
        executeAtFixedRate(getPoolByTypeAndPriority(i, i2), task, j, j2, timeUnit);
    }

    public static <T> void executeBySingle(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task) {
        execute(getPoolByTypeAndPriority(-1), task);
    }

    public static <T> void executeBySingle(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, int i) {
        execute(getPoolByTypeAndPriority(-1, i), task);
    }

    public static <T> void executeBySingleWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-1), task, j, timeUnit);
    }

    public static <T> void executeBySingleWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeWithDelay(getPoolByTypeAndPriority(-1, i), task, j, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), task, 0L, j, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i), task, 0L, j, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), task, j, j2, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i), task, j, j2, timeUnit);
    }

    public static <T> void executeByCached(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task) {
        execute(getPoolByTypeAndPriority(-2), task);
    }

    public static <T> void executeByCached(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, int i) {
        execute(getPoolByTypeAndPriority(-2, i), task);
    }

    public static <T> void executeByCachedWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-2), task, j, timeUnit);
    }

    public static <T> void executeByCachedWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeWithDelay(getPoolByTypeAndPriority(-2, i), task, j, timeUnit);
    }

    public static <T> void executeByCachedAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), task, 0L, j, timeUnit);
    }

    public static <T> void executeByCachedAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i), task, 0L, j, timeUnit);
    }

    public static <T> void executeByCachedAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), task, j, j2, timeUnit);
    }

    public static <T> void executeByCachedAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i), task, j, j2, timeUnit);
    }

    public static <T> void executeByIo(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task) {
        execute(getPoolByTypeAndPriority(-4), task);
    }

    public static <T> void executeByIo(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, int i) {
        execute(getPoolByTypeAndPriority(-4, i), task);
    }

    public static <T> void executeByIoWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-4), task, j, timeUnit);
    }

    public static <T> void executeByIoWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeWithDelay(getPoolByTypeAndPriority(-4, i), task, j, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), task, 0L, j, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i), task, 0L, j, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), task, j, j2, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i), task, j, j2, timeUnit);
    }

    public static <T> void executeByCpu(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task) {
        execute(getPoolByTypeAndPriority(-8), task);
    }

    public static <T> void executeByCpu(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, int i) {
        execute(getPoolByTypeAndPriority(-8, i), task);
    }

    public static <T> void executeByCpuWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-8), task, j, timeUnit);
    }

    public static <T> void executeByCpuWithDelay(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeWithDelay(getPoolByTypeAndPriority(-8, i), task, j, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), task, 0L, j, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i), task, 0L, j, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), task, j, j2, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i), task, j, j2, timeUnit);
    }

    public static <T> void executeByCustom(java.util.concurrent.ExecutorService executorService, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task) {
        execute(executorService, task);
    }

    public static <T> void executeByCustomWithDelay(java.util.concurrent.ExecutorService executorService, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeWithDelay(executorService, task, j, timeUnit);
    }

    public static <T> void executeByCustomAtFixRate(java.util.concurrent.ExecutorService executorService, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(executorService, task, 0L, j, timeUnit);
    }

    public static <T> void executeByCustomAtFixRate(java.util.concurrent.ExecutorService executorService, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        executeAtFixedRate(executorService, task, j, j2, timeUnit);
    }

    public static void cancel(com.luck.picture.lib.thread.PictureThreadUtils.Task task) {
        if (task == null) {
            return;
        }
        task.cancel();
    }

    public static void cancel(com.luck.picture.lib.thread.PictureThreadUtils.Task... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return;
        }
        for (com.luck.picture.lib.thread.PictureThreadUtils.Task task : taskArr) {
            if (task != null) {
                task.cancel();
            }
        }
    }

    public static void cancel(java.util.List<com.luck.picture.lib.thread.PictureThreadUtils.Task> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (com.luck.picture.lib.thread.PictureThreadUtils.Task task : list) {
            if (task != null) {
                task.cancel();
            }
        }
    }

    public static void cancel(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util) {
            for (java.util.Map.Entry<com.luck.picture.lib.thread.PictureThreadUtils.Task, java.util.concurrent.ExecutorService> entry : TASK_POOL_MAP.entrySet()) {
                if (entry.getValue() == executorService) {
                    cancel(entry.getKey());
                }
            }
            return;
        }
        android.util.Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
    }

    public static void setDeliver(java.util.concurrent.Executor executor) {
        sDeliver = executor;
    }

    private static <T> void execute(java.util.concurrent.ExecutorService executorService, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task) {
        execute(executorService, task, 0L, 0L, null);
    }

    private static <T> void executeWithDelay(java.util.concurrent.ExecutorService executorService, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, java.util.concurrent.TimeUnit timeUnit) {
        execute(executorService, task, j, 0L, timeUnit);
    }

    private static <T> void executeAtFixedRate(java.util.concurrent.ExecutorService executorService, com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        execute(executorService, task, j, j2, timeUnit);
    }

    private static <T> void execute(final java.util.concurrent.ExecutorService executorService, final com.luck.picture.lib.thread.PictureThreadUtils.Task<T> task, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.util.Map<com.luck.picture.lib.thread.PictureThreadUtils.Task, java.util.concurrent.ExecutorService> map = TASK_POOL_MAP;
        synchronized (map) {
            if (map.get(task) != null) {
                android.util.Log.e("ThreadUtils", "Task can only be executed once.");
                return;
            }
            map.put(task, executorService);
            if (j2 != 0) {
                task.setSchedule(true);
                TIMER.scheduleAtFixedRate(new java.util.TimerTask() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        executorService.execute(task);
                    }
                }, timeUnit.toMillis(j), timeUnit.toMillis(j2));
            } else if (j == 0) {
                executorService.execute(task);
            } else {
                TIMER.schedule(new java.util.TimerTask() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        executorService.execute(task);
                    }
                }, timeUnit.toMillis(j));
            }
        }
    }

    private static java.util.concurrent.ExecutorService getPoolByTypeAndPriority(int i) {
        return getPoolByTypeAndPriority(i, 5);
    }

    private static java.util.concurrent.ExecutorService getPoolByTypeAndPriority(int i, int i2) {
        java.util.concurrent.ExecutorService executorService;
        java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.util.concurrent.ExecutorService>> map = TYPE_PRIORITY_POOLS;
        synchronized (map) {
            java.util.Map<java.lang.Integer, java.util.concurrent.ExecutorService> map2 = map.get(java.lang.Integer.valueOf(i));
            if (map2 == null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                executorService = com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util.createPool(i, i2);
                concurrentHashMap.put(java.lang.Integer.valueOf(i2), executorService);
                map.put(java.lang.Integer.valueOf(i), concurrentHashMap);
            } else {
                executorService = map2.get(java.lang.Integer.valueOf(i2));
                if (executorService == null) {
                    executorService = com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util.createPool(i, i2);
                    map2.put(java.lang.Integer.valueOf(i2), executorService);
                }
            }
        }
        return executorService;
    }

    static final class ThreadPoolExecutor4Util extends java.util.concurrent.ThreadPoolExecutor {
        private final java.util.concurrent.atomic.AtomicInteger mSubmittedCount;
        private com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util mWorkQueue;

        /* JADX INFO: Access modifiers changed from: private */
        public static java.util.concurrent.ExecutorService createPool(int i, int i2) {
            if (i == -8) {
                return new com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util(com.luck.picture.lib.thread.PictureThreadUtils.CPU_COUNT + 1, (com.luck.picture.lib.thread.PictureThreadUtils.CPU_COUNT * 2) + 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util(true), new com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory("cpu", i2));
            }
            if (i == -4) {
                return new com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util((com.luck.picture.lib.thread.PictureThreadUtils.CPU_COUNT * 2) + 1, (com.luck.picture.lib.thread.PictureThreadUtils.CPU_COUNT * 2) + 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util(), new com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory("io", i2));
            }
            if (i == -2) {
                return new com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util(0, com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4, 60L, java.util.concurrent.TimeUnit.SECONDS, new com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util(true), new com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory("cached", i2));
            }
            if (i == -1) {
                return new com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util(), new com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory("single", i2));
            }
            return new com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util(i, i, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util(), new com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory("fixed(" + i + ")", i2));
        }

        ThreadPoolExecutor4Util(int i, int i2, long j, java.util.concurrent.TimeUnit timeUnit, com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util linkedBlockingQueue4Util, java.util.concurrent.ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.mSubmittedCount = new java.util.concurrent.atomic.AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.mWorkQueue = linkedBlockingQueue4Util;
        }

        private int getSubmittedCount() {
            return this.mSubmittedCount.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
            this.mSubmittedCount.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.mSubmittedCount.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (java.util.concurrent.RejectedExecutionException unused) {
                android.util.Log.e("ThreadUtils", "This will not happen!");
                this.mWorkQueue.offer(runnable);
            } catch (java.lang.Throwable unused2) {
                this.mSubmittedCount.decrementAndGet();
            }
        }
    }

    private static final class LinkedBlockingQueue4Util extends java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> {
        private int mCapacity;
        private volatile com.luck.picture.lib.thread.PictureThreadUtils.ThreadPoolExecutor4Util mPool;

        LinkedBlockingQueue4Util() {
            this.mCapacity = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }

        LinkedBlockingQueue4Util(boolean z) {
            this.mCapacity = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (z) {
                this.mCapacity = 0;
            }
        }

        LinkedBlockingQueue4Util(int i) {
            this.mCapacity = com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.mCapacity = i;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(java.lang.Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer((com.luck.picture.lib.thread.PictureThreadUtils.LinkedBlockingQueue4Util) runnable);
            }
            return false;
        }
    }

    static final class UtilsThreadFactory extends java.util.concurrent.atomic.AtomicLong implements java.util.concurrent.ThreadFactory {
        private static final java.util.concurrent.atomic.AtomicInteger POOL_NUMBER = new java.util.concurrent.atomic.AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final java.lang.String namePrefix;
        private final int priority;

        UtilsThreadFactory(java.lang.String str, int i) {
            this(str, i, false);
        }

        UtilsThreadFactory(java.lang.String str, int i, boolean z) {
            this.namePrefix = str + "-pool-" + POOL_NUMBER.getAndIncrement() + "-thread-";
            this.priority = i;
            this.isDaemon = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, this.namePrefix + getAndIncrement()) { // from class: com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        super.run();
                    } catch (java.lang.Throwable th) {
                        android.util.Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                    }
                }
            };
            thread.setDaemon(this.isDaemon);
            thread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.UtilsThreadFactory.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(java.lang.Thread thread2, java.lang.Throwable th) {
                    java.lang.System.out.println(th);
                }
            });
            thread.setPriority(this.priority);
            return thread;
        }
    }

    public static abstract class SimpleTask<T> extends com.luck.picture.lib.thread.PictureThreadUtils.Task<T> {
        @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
        public void onCancel() {
            android.util.Log.e("ThreadUtils", "onCancel: " + java.lang.Thread.currentThread());
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
        public void onFail(java.lang.Throwable th) {
            android.util.Log.e("ThreadUtils", "onFail: ", th);
        }
    }

    public static abstract class Task<T> implements java.lang.Runnable {
        private static final int CANCELLED = 4;
        private static final int COMPLETING = 3;
        private static final int EXCEPTIONAL = 2;
        private static final int INTERRUPTED = 5;
        private static final int NEW = 0;
        private static final int RUNNING = 1;
        private static final int TIMEOUT = 6;
        private java.util.concurrent.Executor deliver;
        private volatile boolean isSchedule;
        private com.luck.picture.lib.thread.PictureThreadUtils.Task.OnTimeoutListener mTimeoutListener;
        private long mTimeoutMillis;
        private java.util.Timer mTimer;
        private volatile java.lang.Thread runner;
        private final java.util.concurrent.atomic.AtomicInteger state = new java.util.concurrent.atomic.AtomicInteger(0);

        public interface OnTimeoutListener {
            void onTimeout();
        }

        public abstract T doInBackground() throws java.lang.Throwable;

        public abstract void onCancel();

        public abstract void onFail(java.lang.Throwable th);

        public abstract void onSuccess(T t);

        @Override // java.lang.Runnable
        public void run() {
            if (this.isSchedule) {
                if (this.runner == null) {
                    if (!this.state.compareAndSet(0, 1)) {
                        return;
                    }
                    this.runner = java.lang.Thread.currentThread();
                    if (this.mTimeoutListener != null) {
                        android.util.Log.w("ThreadUtils", "Scheduled task doesn't support timeout.");
                    }
                } else if (this.state.get() != 1) {
                    return;
                }
            } else {
                if (!this.state.compareAndSet(0, 1)) {
                    return;
                }
                this.runner = java.lang.Thread.currentThread();
                if (this.mTimeoutListener != null) {
                    java.util.Timer timer = new java.util.Timer();
                    this.mTimer = timer;
                    timer.schedule(new java.util.TimerTask() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            if (com.luck.picture.lib.thread.PictureThreadUtils.Task.this.isDone() || com.luck.picture.lib.thread.PictureThreadUtils.Task.this.mTimeoutListener == null) {
                                return;
                            }
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.timeout();
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.mTimeoutListener.onTimeout();
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onDone();
                        }
                    }, this.mTimeoutMillis);
                }
            }
            try {
                final T doInBackground = doInBackground();
                if (this.isSchedule) {
                    if (this.state.get() != 1) {
                        return;
                    }
                    getDeliver().execute(new java.lang.Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onSuccess(doInBackground);
                        }
                    });
                } else if (this.state.compareAndSet(1, 3)) {
                    getDeliver().execute(new java.lang.Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onSuccess(doInBackground);
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onDone();
                        }
                    });
                }
            } catch (java.lang.InterruptedException unused) {
                this.state.compareAndSet(4, 5);
            } catch (java.lang.Throwable th) {
                if (this.state.compareAndSet(1, 2)) {
                    getDeliver().execute(new java.lang.Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.4
                        @Override // java.lang.Runnable
                        public void run() {
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onFail(th);
                            com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onDone();
                        }
                    });
                }
            }
        }

        public void cancel() {
            cancel(true);
        }

        public void cancel(boolean z) {
            synchronized (this.state) {
                if (this.state.get() > 1) {
                    return;
                }
                this.state.set(4);
                if (z && this.runner != null) {
                    this.runner.interrupt();
                }
                getDeliver().execute(new java.lang.Runnable() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.Task.5
                    @Override // java.lang.Runnable
                    public void run() {
                        com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onCancel();
                        com.luck.picture.lib.thread.PictureThreadUtils.Task.this.onDone();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void timeout() {
            synchronized (this.state) {
                if (this.state.get() > 1) {
                    return;
                }
                this.state.set(6);
                if (this.runner != null) {
                    this.runner.interrupt();
                }
            }
        }

        public boolean isCanceled() {
            return this.state.get() >= 4;
        }

        public boolean isDone() {
            return this.state.get() > 1;
        }

        public com.luck.picture.lib.thread.PictureThreadUtils.Task<T> setDeliver(java.util.concurrent.Executor executor) {
            this.deliver = executor;
            return this;
        }

        public com.luck.picture.lib.thread.PictureThreadUtils.Task<T> setTimeout(long j, com.luck.picture.lib.thread.PictureThreadUtils.Task.OnTimeoutListener onTimeoutListener) {
            this.mTimeoutMillis = j;
            this.mTimeoutListener = onTimeoutListener;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedule(boolean z) {
            this.isSchedule = z;
        }

        private java.util.concurrent.Executor getDeliver() {
            java.util.concurrent.Executor executor = this.deliver;
            return executor == null ? com.luck.picture.lib.thread.PictureThreadUtils.getGlobalDeliver() : executor;
        }

        protected void onDone() {
            com.luck.picture.lib.thread.PictureThreadUtils.TASK_POOL_MAP.remove(this);
            java.util.Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
                this.mTimeoutListener = null;
            }
        }
    }

    public static class SyncValue<T> {
        private T mValue;
        private java.util.concurrent.CountDownLatch mLatch = new java.util.concurrent.CountDownLatch(1);
        private java.util.concurrent.atomic.AtomicBoolean mFlag = new java.util.concurrent.atomic.AtomicBoolean();

        public void setValue(T t) {
            if (this.mFlag.compareAndSet(false, true)) {
                this.mValue = t;
                this.mLatch.countDown();
            }
        }

        public T getValue() {
            if (!this.mFlag.get()) {
                try {
                    this.mLatch.await();
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return this.mValue;
        }

        public T getValue(long j, java.util.concurrent.TimeUnit timeUnit, T t) {
            if (!this.mFlag.get()) {
                try {
                    this.mLatch.await(j, timeUnit);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                    return t;
                }
            }
            return this.mValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.concurrent.Executor getGlobalDeliver() {
        if (sDeliver == null) {
            sDeliver = new java.util.concurrent.Executor() { // from class: com.luck.picture.lib.thread.PictureThreadUtils.3
                @Override // java.util.concurrent.Executor
                public void execute(java.lang.Runnable runnable) {
                    com.luck.picture.lib.thread.PictureThreadUtils.runOnUiThread(runnable);
                }
            };
        }
        return sDeliver;
    }
}
