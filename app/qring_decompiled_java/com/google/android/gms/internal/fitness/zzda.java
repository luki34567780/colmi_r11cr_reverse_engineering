package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzda extends com.google.android.gms.internal.fitness.zzp {
    final /* synthetic */ java.lang.String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzda(com.google.android.gms.internal.fitness.zzde zzdeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super(googleApiClient);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.DataTypeResult(status, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzby) ((com.google.android.gms.internal.fitness.zzu) anyClient).getService()).zzf(new com.google.android.gms.fitness.request.zzp(this.zza, (com.google.android.gms.internal.fitness.zzbt) new com.google.android.gms.internal.fitness.zzdd(this, null)));
    }
}
