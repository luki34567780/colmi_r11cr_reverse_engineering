package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zabb implements com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status> {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ com.google.android.gms.common.api.GoogleApiClient zac;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zad;

    zabb(com.google.android.gms.common.api.internal.zabe zabeVar, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult, boolean z, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        this.zad = zabeVar;
        this.zaa = statusPendingResult;
        this.zab = z;
        this.zac = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(com.google.android.gms.common.api.Status status) {
        android.content.Context context;
        com.google.android.gms.common.api.Status status2 = status;
        context = this.zad.zan;
        com.google.android.gms.auth.api.signin.internal.Storage.getInstance(context).zac();
        if (status2.isSuccess() && this.zad.isConnected()) {
            com.google.android.gms.common.api.internal.zabe zabeVar = this.zad;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.zaa.setResult(status2);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}
