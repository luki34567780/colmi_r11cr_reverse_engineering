package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzad extends com.google.android.gms.internal.location.zzae {
    final /* synthetic */ com.google.android.gms.location.zzbx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzad(com.google.android.gms.internal.location.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.zzbx zzbxVar) {
        super(googleApiClient);
        this.zza = zzbxVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.location.zzbx zzbxVar = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbxVar, "removeGeofencingRequest can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzam) ((com.google.android.gms.internal.location.zzbe) anyClient).getService()).zzm(zzbxVar, new com.google.android.gms.internal.location.zzba(this));
    }
}
