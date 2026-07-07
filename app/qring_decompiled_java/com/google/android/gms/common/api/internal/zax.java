package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zax implements com.google.android.gms.common.api.internal.zabz {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaa zaa;

    /* synthetic */ zax(com.google.android.gms.common.api.internal.zaaa zaaaVar, com.google.android.gms.common.api.internal.zaw zawVar) {
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            this.zaa.zaj = connectionResult;
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(android.os.Bundle bundle) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        lock = this.zaa.zam;
        lock.lock();
        try {
            com.google.android.gms.common.api.internal.zaaa.zao(this.zaa, bundle);
            this.zaa.zaj = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            com.google.android.gms.common.api.internal.zaaa.zap(this.zaa);
        } finally {
            lock2 = this.zaa.zam;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        boolean z2;
        java.util.concurrent.locks.Lock lock3;
        com.google.android.gms.common.ConnectionResult connectionResult;
        com.google.android.gms.common.ConnectionResult connectionResult2;
        com.google.android.gms.common.api.internal.zabi zabiVar;
        lock = this.zaa.zam;
        lock.lock();
        try {
            com.google.android.gms.common.api.internal.zaaa zaaaVar = this.zaa;
            z2 = zaaaVar.zal;
            if (!z2) {
                connectionResult = zaaaVar.zak;
                if (connectionResult != null) {
                    connectionResult2 = zaaaVar.zak;
                    if (connectionResult2.isSuccess()) {
                        this.zaa.zal = true;
                        zabiVar = this.zaa.zae;
                        zabiVar.onConnectionSuspended(i);
                        lock3 = this.zaa.zam;
                        lock3.unlock();
                    }
                }
            }
            this.zaa.zal = false;
            com.google.android.gms.common.api.internal.zaaa.zan(this.zaa, i, z);
            lock3 = this.zaa.zam;
            lock3.unlock();
        } catch (java.lang.Throwable th) {
            lock2 = this.zaa.zam;
            lock2.unlock();
            throw th;
        }
    }
}
