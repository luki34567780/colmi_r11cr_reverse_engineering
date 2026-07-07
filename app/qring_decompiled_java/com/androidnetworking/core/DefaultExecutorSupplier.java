package com.androidnetworking.core;

/* loaded from: classes.dex */
public class DefaultExecutorSupplier implements com.androidnetworking.core.ExecutorSupplier {
    public static final int DEFAULT_MAX_NUM_THREADS = (java.lang.Runtime.getRuntime().availableProcessors() * 2) + 1;
    private final com.androidnetworking.core.ANExecutor mImmediateNetworkExecutor;
    private final java.util.concurrent.Executor mMainThreadExecutor;
    private final com.androidnetworking.core.ANExecutor mNetworkExecutor;

    public DefaultExecutorSupplier() {
        com.androidnetworking.core.PriorityThreadFactory priorityThreadFactory = new com.androidnetworking.core.PriorityThreadFactory(10);
        this.mNetworkExecutor = new com.androidnetworking.core.ANExecutor(DEFAULT_MAX_NUM_THREADS, priorityThreadFactory);
        this.mImmediateNetworkExecutor = new com.androidnetworking.core.ANExecutor(2, priorityThreadFactory);
        this.mMainThreadExecutor = new com.androidnetworking.core.MainThreadExecutor();
    }

    @Override // com.androidnetworking.core.ExecutorSupplier
    public com.androidnetworking.core.ANExecutor forNetworkTasks() {
        return this.mNetworkExecutor;
    }

    @Override // com.androidnetworking.core.ExecutorSupplier
    public com.androidnetworking.core.ANExecutor forImmediateNetworkTasks() {
        return this.mImmediateNetworkExecutor;
    }

    @Override // com.androidnetworking.core.ExecutorSupplier
    public java.util.concurrent.Executor forMainThreadTasks() {
        return this.mMainThreadExecutor;
    }
}
