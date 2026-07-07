package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdp extends com.google.android.gms.internal.fitness.zzae {
    final /* synthetic */ com.google.android.gms.fitness.data.DataType zza;
    final /* synthetic */ boolean zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdp(com.google.android.gms.internal.fitness.zzds zzdsVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType, boolean z) {
        super(googleApiClient);
        this.zza = dataType;
        this.zzb = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.fitness.data.DataType dataType = this.zza;
        com.google.android.gms.fitness.data.DataSource.Builder builder = new com.google.android.gms.fitness.data.DataSource.Builder();
        builder.setType(1);
        builder.setDataType(dataType);
        return new com.google.android.gms.fitness.result.DailyTotalResult(status, com.google.android.gms.fitness.data.DataSet.builder(builder.build()).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzca) ((com.google.android.gms.internal.fitness.zzaj) anyClient).getService()).zzf(new com.google.android.gms.fitness.request.zzh((com.google.android.gms.internal.fitness.zzbk) new com.google.android.gms.internal.fitness.zzdo(this), this.zza, this.zzb));
    }
}
