package com.google.common.util.concurrent;

/* loaded from: /tmp/dex/classes2.dex */
public interface ListenableFuture<V> extends java.util.concurrent.Future<V> {
    void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor);
}
