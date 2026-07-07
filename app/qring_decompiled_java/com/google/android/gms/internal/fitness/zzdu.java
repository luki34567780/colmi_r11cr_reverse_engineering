package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdu extends com.google.android.gms.internal.fitness.zzam {
    final /* synthetic */ com.google.android.gms.fitness.data.DataType zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdu(com.google.android.gms.internal.fitness.zzea zzeaVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        super(googleApiClient);
        this.zza = dataType;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.fitness.result.ListSubscriptionsResult.zza(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcb) ((com.google.android.gms.internal.fitness.zzar) anyClient).getService()).zzd(new com.google.android.gms.fitness.request.zzae(this.zza, (com.google.android.gms.internal.fitness.zzcg) new com.google.android.gms.internal.fitness.zzdz(this, null)));
    }
}
