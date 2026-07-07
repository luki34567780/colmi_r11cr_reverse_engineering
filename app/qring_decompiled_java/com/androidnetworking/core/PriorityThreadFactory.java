package com.androidnetworking.core;

/* loaded from: classes.dex */
public class PriorityThreadFactory implements java.util.concurrent.ThreadFactory {
    private final int mThreadPriority;

    public PriorityThreadFactory(int i) {
        this.mThreadPriority = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(final java.lang.Runnable runnable) {
        return new java.lang.Thread(new java.lang.Runnable() { // from class: com.androidnetworking.core.PriorityThreadFactory.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    android.os.Process.setThreadPriority(com.androidnetworking.core.PriorityThreadFactory.this.mThreadPriority);
                } catch (java.lang.Throwable unused) {
                }
                runnable.run();
            }
        });
    }
}
