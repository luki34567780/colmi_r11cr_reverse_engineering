package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaj implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final int zaa;
    public final com.google.android.gms.common.api.GoogleApiClient zab;
    public final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zac;
    final /* synthetic */ com.google.android.gms.common.api.internal.zak zad;

    public zaj(com.google.android.gms.common.api.internal.zak zakVar, int i, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zad = zakVar;
        this.zaa = i;
        this.zab = googleApiClient;
        this.zac = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.lang.String valueOf = java.lang.String.valueOf(connectionResult);
        java.lang.String.valueOf(valueOf).length();
        android.util.Log.d("AutoManageHelper", "beginFailureResolution for ".concat(java.lang.String.valueOf(valueOf)));
        this.zad.zah(connectionResult, this.zaa);
    }
}
