package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzeh extends com.google.android.gms.internal.fitness.zzbf {
    final /* synthetic */ com.google.android.gms.fitness.request.SessionInsertRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeh(com.google.android.gms.internal.fitness.zzep zzepVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest) {
        super(googleApiClient);
        this.zza = sessionInsertRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcd) ((com.google.android.gms.internal.fitness.zzbh) anyClient).getService()).zzd(new com.google.android.gms.fitness.request.SessionInsertRequest(this.zza, new com.google.android.gms.internal.fitness.zzes(this)));
    }
}
