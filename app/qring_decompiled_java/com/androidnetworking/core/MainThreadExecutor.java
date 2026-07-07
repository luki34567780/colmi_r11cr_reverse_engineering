package com.androidnetworking.core;

/* loaded from: classes.dex */
public class MainThreadExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.handler.post(runnable);
    }
}
