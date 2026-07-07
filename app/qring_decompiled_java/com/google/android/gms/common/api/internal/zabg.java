package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zabg {
    private final com.google.android.gms.common.api.internal.zabf zaa;

    protected zabg(com.google.android.gms.common.api.internal.zabf zabfVar) {
        this.zaa = zabfVar;
    }

    protected abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabi zabiVar) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        com.google.android.gms.common.api.internal.zabf zabfVar;
        java.util.concurrent.locks.Lock lock3;
        lock = zabiVar.zai;
        lock.lock();
        try {
            zabfVar = zabiVar.zan;
            if (zabfVar != this.zaa) {
                lock3 = zabiVar.zai;
            } else {
                zaa();
                lock3 = zabiVar.zai;
            }
            lock3.unlock();
        } catch (java.lang.Throwable th) {
            lock2 = zabiVar.zai;
            lock2.unlock();
            throw th;
        }
    }
}
