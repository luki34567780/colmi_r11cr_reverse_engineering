package com.androidnetworking.core;

/* loaded from: classes.dex */
public interface ExecutorSupplier {
    com.androidnetworking.core.ANExecutor forImmediateNetworkTasks();

    java.util.concurrent.Executor forMainThreadTasks();

    com.androidnetworking.core.ANExecutor forNetworkTasks();
}
