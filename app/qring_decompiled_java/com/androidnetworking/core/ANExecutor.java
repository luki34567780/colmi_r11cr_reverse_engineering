package com.androidnetworking.core;

/* loaded from: classes.dex */
public class ANExecutor extends java.util.concurrent.ThreadPoolExecutor {
    private static final int DEFAULT_THREAD_COUNT = 3;

    ANExecutor(int i, java.util.concurrent.ThreadFactory threadFactory) {
        super(i, i, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.PriorityBlockingQueue(), threadFactory);
    }

    void adjustThreadCount(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            setThreadCount(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                setThreadCount(4);
                return;
            } else {
                setThreadCount(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                setThreadCount(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        setThreadCount(3);
                        break;
                    default:
                        setThreadCount(3);
                        break;
                }
                return;
        }
        setThreadCount(2);
    }

    private void setThreadCount(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        com.androidnetworking.core.ANExecutor.AndroidNetworkingFutureTask androidNetworkingFutureTask = new com.androidnetworking.core.ANExecutor.AndroidNetworkingFutureTask((com.androidnetworking.internal.InternalRunnable) runnable);
        execute(androidNetworkingFutureTask);
        return androidNetworkingFutureTask;
    }

    private static final class AndroidNetworkingFutureTask extends java.util.concurrent.FutureTask<com.androidnetworking.internal.InternalRunnable> implements java.lang.Comparable<com.androidnetworking.core.ANExecutor.AndroidNetworkingFutureTask> {
        private final com.androidnetworking.internal.InternalRunnable hunter;

        public AndroidNetworkingFutureTask(com.androidnetworking.internal.InternalRunnable internalRunnable) {
            super(internalRunnable, null);
            this.hunter = internalRunnable;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.androidnetworking.core.ANExecutor.AndroidNetworkingFutureTask androidNetworkingFutureTask) {
            com.androidnetworking.common.Priority priority = this.hunter.getPriority();
            com.androidnetworking.common.Priority priority2 = androidNetworkingFutureTask.hunter.getPriority();
            return priority == priority2 ? this.hunter.sequence - androidNetworkingFutureTask.hunter.sequence : priority2.ordinal() - priority.ordinal();
        }
    }
}
