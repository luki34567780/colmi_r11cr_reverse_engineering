package io.reactivex.internal.schedulers;

/* loaded from: classes3.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    static final java.lang.String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS;
    static final java.lang.String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    static final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> PURGE_THREAD = new java.util.concurrent.atomic.AtomicReference<>();
    static final java.util.Map<java.util.concurrent.ScheduledThreadPoolExecutor, java.lang.Object> POOLS = new java.util.concurrent.ConcurrentHashMap();

    private SchedulerPoolFactory() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    static {
        io.reactivex.internal.schedulers.SchedulerPoolFactory.SystemPropertyAccessor systemPropertyAccessor = new io.reactivex.internal.schedulers.SchedulerPoolFactory.SystemPropertyAccessor();
        boolean booleanProperty = getBooleanProperty(true, PURGE_ENABLED_KEY, true, true, systemPropertyAccessor);
        PURGE_ENABLED = booleanProperty;
        PURGE_PERIOD_SECONDS = getIntProperty(booleanProperty, PURGE_PERIOD_SECONDS_KEY, 1, 1, systemPropertyAccessor);
        start();
    }

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    static void tryStart(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> atomicReference = PURGE_THREAD;
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, new io.reactivex.internal.schedulers.RxThreadFactory("RxSchedulerPurge"));
            if (atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                io.reactivex.internal.schedulers.SchedulerPoolFactory.ScheduledTask scheduledTask = new io.reactivex.internal.schedulers.SchedulerPoolFactory.ScheduledTask();
                int i = PURGE_PERIOD_SECONDS;
                newScheduledThreadPool.scheduleAtFixedRate(scheduledTask, i, i, java.util.concurrent.TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    public static void shutdown() {
        java.util.concurrent.ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    static int getIntProperty(boolean z, java.lang.String str, int i, int i2, io.reactivex.functions.Function<java.lang.String, java.lang.String> function) {
        if (!z) {
            return i2;
        }
        try {
            java.lang.String apply = function.apply(str);
            return apply == null ? i : java.lang.Integer.parseInt(apply);
        } catch (java.lang.Throwable unused) {
            return i;
        }
    }

    static boolean getBooleanProperty(boolean z, java.lang.String str, boolean z2, boolean z3, io.reactivex.functions.Function<java.lang.String, java.lang.String> function) {
        if (!z) {
            return z3;
        }
        try {
            java.lang.String apply = function.apply(str);
            return apply == null ? z2 : "true".equals(apply);
        } catch (java.lang.Throwable unused) {
            return z2;
        }
    }

    static final class SystemPropertyAccessor implements io.reactivex.functions.Function<java.lang.String, java.lang.String> {
        SystemPropertyAccessor() {
        }

        @Override // io.reactivex.functions.Function
        public java.lang.String apply(java.lang.String str) throws java.lang.Exception {
            return java.lang.System.getProperty(str);
        }
    }

    public static java.util.concurrent.ScheduledExecutorService create(java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory);
        tryPutIntoPool(PURGE_ENABLED, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    static void tryPutIntoPool(boolean z, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor)) {
            POOLS.put((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static final class ScheduledTask implements java.lang.Runnable {
        ScheduledTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.Iterator it = new java.util.ArrayList(io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS.keySet()).iterator();
            while (it.hasNext()) {
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (java.util.concurrent.ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    io.reactivex.internal.schedulers.SchedulerPoolFactory.POOLS.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
