package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdx extends com.google.android.gms.internal.fitness.zzap {
    final /* synthetic */ com.google.android.gms.fitness.data.DataSource zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdx(com.google.android.gms.internal.fitness.zzea zzeaVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource) {
        super(googleApiClient);
        this.zza = dataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcb) ((com.google.android.gms.internal.fitness.zzar) anyClient).getService()).zzf(new com.google.android.gms.fitness.request.zzbh(null, this.zza, new com.google.android.gms.internal.fitness.zzes(this)));
    }
}
