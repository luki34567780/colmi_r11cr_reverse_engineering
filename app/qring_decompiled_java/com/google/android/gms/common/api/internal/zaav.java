package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zaav implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zab;

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        com.google.android.gms.common.api.internal.zabi zabiVar;
        java.util.concurrent.locks.Lock lock3;
        lock = this.zab.zab;
        lock.lock();
        try {
            try {
                if (java.lang.Thread.interrupted()) {
                    lock3 = this.zab.zab;
                } else {
                    zaa();
                    lock3 = this.zab.zab;
                }
            } catch (java.lang.RuntimeException e) {
                zabiVar = this.zab.zaa;
                zabiVar.zam(e);
                lock3 = this.zab.zab;
            }
            lock3.unlock();
        } catch (java.lang.Throwable th) {
            lock2 = this.zab.zab;
            lock2.unlock();
            throw th;
        }
    }

    protected abstract void zaa();
}
