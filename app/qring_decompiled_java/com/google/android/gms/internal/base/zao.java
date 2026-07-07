package com.google.android.gms.internal.base;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zao implements com.google.android.gms.internal.base.zam {
    private zao() {
    }

    /* synthetic */ zao(com.google.android.gms.internal.base.zan zanVar) {
    }

    @Override // com.google.android.gms.internal.base.zam
    public final java.util.concurrent.ExecutorService zaa(java.util.concurrent.ThreadFactory threadFactory, int i) {
        return zac(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.base.zam
    public final java.util.concurrent.ExecutorService zab(int i, int i2) {
        return zac(4, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.zam
    public final java.util.concurrent.ExecutorService zac(int i, java.util.concurrent.ThreadFactory threadFactory, int i2) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
