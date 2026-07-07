package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zabt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabu zab;

    zabt(com.google.android.gms.common.api.internal.zabu zabuVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zab = zabuVar;
        this.zaa = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        com.google.android.gms.common.api.internal.ApiKey apiKey;
        com.google.android.gms.common.api.Api.Client client;
        com.google.android.gms.common.api.Api.Client client2;
        com.google.android.gms.common.api.Api.Client client3;
        com.google.android.gms.common.api.Api.Client client4;
        com.google.android.gms.common.api.internal.zabu zabuVar = this.zab;
        map = zabuVar.zaa.zap;
        apiKey = zabuVar.zac;
        com.google.android.gms.common.api.internal.zabq zabqVar = (com.google.android.gms.common.api.internal.zabq) map.get(apiKey);
        if (zabqVar == null) {
            return;
        }
        if (!this.zaa.isSuccess()) {
            zabqVar.zar(this.zaa, null);
            return;
        }
        this.zab.zaf = true;
        client = this.zab.zab;
        if (client.requiresSignIn()) {
            this.zab.zag();
            return;
        }
        try {
            com.google.android.gms.common.api.internal.zabu zabuVar2 = this.zab;
            client3 = zabuVar2.zab;
            client4 = zabuVar2.zab;
            client3.getRemoteService(null, client4.getScopesForConnectionlessNonSignIn());
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            client2 = this.zab.zab;
            client2.disconnect("Failed to get service from broker.");
            zabqVar.zar(new com.google.android.gms.common.ConnectionResult(10), null);
        }
    }
}
