package com.androidnetworking.core;

/* loaded from: classes.dex */
public class Core {
    private static com.androidnetworking.core.Core sInstance;
    private final com.androidnetworking.core.ExecutorSupplier mExecutorSupplier = new com.androidnetworking.core.DefaultExecutorSupplier();

    private Core() {
    }

    public static com.androidnetworking.core.Core getInstance() {
        if (sInstance == null) {
            synchronized (com.androidnetworking.core.Core.class) {
                if (sInstance == null) {
                    sInstance = new com.androidnetworking.core.Core();
                }
            }
        }
        return sInstance;
    }

    public com.androidnetworking.core.ExecutorSupplier getExecutorSupplier() {
        return this.mExecutorSupplier;
    }

    public static void shutDown() {
        if (sInstance != null) {
            sInstance = null;
        }
    }
}
