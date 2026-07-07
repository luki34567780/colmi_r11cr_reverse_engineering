package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zacy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.Result zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zab;

    zacy(com.google.android.gms.common.api.internal.zada zadaVar, com.google.android.gms.common.api.Result result) {
        this.zab = zadaVar;
        this.zaa = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zacz zaczVar;
        com.google.android.gms.common.api.internal.zacz zaczVar2;
        java.lang.ref.WeakReference weakReference;
        com.google.android.gms.common.api.GoogleApiClient googleApiClient;
        java.lang.ref.WeakReference weakReference2;
        com.google.android.gms.common.api.ResultTransform resultTransform;
        com.google.android.gms.common.api.internal.zacz zaczVar3;
        com.google.android.gms.common.api.internal.zacz zaczVar4;
        java.lang.ref.WeakReference weakReference3;
        try {
            try {
                com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(true);
                resultTransform = this.zab.zaa;
                com.google.android.gms.common.api.PendingResult onSuccess = ((com.google.android.gms.common.api.ResultTransform) com.google.android.gms.common.internal.Preconditions.checkNotNull(resultTransform)).onSuccess(this.zaa);
                com.google.android.gms.common.api.internal.zada zadaVar = this.zab;
                zaczVar3 = zadaVar.zah;
                zaczVar4 = zadaVar.zah;
                zaczVar3.sendMessage(zaczVar4.obtainMessage(0, onSuccess));
                com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(false);
                com.google.android.gms.common.api.internal.zada zadaVar2 = this.zab;
                com.google.android.gms.common.api.internal.zada.zan(this.zaa);
                weakReference3 = this.zab.zag;
                googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) weakReference3.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.common.api.internal.zada zadaVar3 = this.zab;
                zaczVar = zadaVar3.zah;
                zaczVar2 = zadaVar3.zah;
                zaczVar.sendMessage(zaczVar2.obtainMessage(1, e));
                com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(false);
                com.google.android.gms.common.api.internal.zada zadaVar4 = this.zab;
                com.google.android.gms.common.api.internal.zada.zan(this.zaa);
                weakReference = this.zab.zag;
                googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) weakReference.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.zab);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(false);
            com.google.android.gms.common.api.internal.zada zadaVar5 = this.zab;
            com.google.android.gms.common.api.internal.zada.zan(this.zaa);
            weakReference2 = this.zab.zag;
            com.google.android.gms.common.api.GoogleApiClient googleApiClient2 = (com.google.android.gms.common.api.GoogleApiClient) weakReference2.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.zab);
            }
            throw th;
        }
    }
}
