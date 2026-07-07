package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zabu implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks, com.google.android.gms.common.api.internal.zacs {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final com.google.android.gms.common.api.Api.Client zab;
    private final com.google.android.gms.common.api.internal.ApiKey<?> zac;
    private com.google.android.gms.common.internal.IAccountAccessor zad = null;
    private java.util.Set<com.google.android.gms.common.api.Scope> zae = null;
    private boolean zaf = false;

    public zabu(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.Api.Client client, com.google.android.gms.common.api.internal.ApiKey<?> apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zag() {
        com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor;
        if (!this.zaf || (iAccountAccessor = this.zad) == null) {
            return;
        }
        this.zab.getRemoteService(iAccountAccessor, this.zae);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa.zat.post(new com.google.android.gms.common.api.internal.zabt(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zae(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.Map map;
        map = this.zaa.zap;
        com.google.android.gms.common.api.internal.zabq zabqVar = (com.google.android.gms.common.api.internal.zabq) map.get(this.zac);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zaf(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        if (iAccountAccessor == null || set == null) {
            android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new java.lang.Exception());
            zae(new com.google.android.gms.common.ConnectionResult(4));
        } else {
            this.zad = iAccountAccessor;
            this.zae = set;
            zag();
        }
    }
}
