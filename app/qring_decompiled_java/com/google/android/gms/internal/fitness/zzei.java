package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzei extends com.google.android.gms.internal.fitness.zzbc {
    final /* synthetic */ com.google.android.gms.fitness.request.SessionReadRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzei(com.google.android.gms.internal.fitness.zzep zzepVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest) {
        super(googleApiClient);
        this.zza = sessionReadRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.SessionReadResult(new java.util.ArrayList(), new java.util.ArrayList(), status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcd) ((com.google.android.gms.internal.fitness.zzbh) anyClient).getService()).zze(new com.google.android.gms.fitness.request.SessionReadRequest(this.zza, new com.google.android.gms.internal.fitness.zzem(this, null)));
    }
}
