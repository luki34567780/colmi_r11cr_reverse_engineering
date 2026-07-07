package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaal implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaaw> zaa;
    private final com.google.android.gms.common.api.Api<?> zab;
    private final boolean zac;

    public zaal(com.google.android.gms.common.api.internal.zaaw zaawVar, com.google.android.gms.common.api.Api<?> api, boolean z) {
        this.zaa = new java.lang.ref.WeakReference<>(zaawVar);
        this.zab = api;
        this.zac = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.api.internal.zabi zabiVar;
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        boolean zaG;
        boolean zaH;
        java.util.concurrent.locks.Lock lock3;
        com.google.android.gms.common.api.internal.zaaw zaawVar = this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        zabiVar = zaawVar.zaa;
        com.google.android.gms.common.internal.Preconditions.checkState(myLooper == zabiVar.zag.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.zab;
        lock.lock();
        try {
            zaG = zaawVar.zaG(0);
            if (zaG) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.zaE(connectionResult, this.zab, this.zac);
                }
                zaH = zaawVar.zaH();
                if (zaH) {
                    zaawVar.zaF();
                }
                lock3 = zaawVar.zab;
            } else {
                lock3 = zaawVar.zab;
            }
            lock3.unlock();
        } catch (java.lang.Throwable th) {
            lock2 = zaawVar.zab;
            lock2.unlock();
            throw th;
        }
    }
}
