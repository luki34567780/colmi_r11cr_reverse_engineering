package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzeb extends com.google.android.gms.internal.fitness.zzau {
    final /* synthetic */ com.google.android.gms.fitness.request.DataSourcesRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(com.google.android.gms.internal.fitness.zzee zzeeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) {
        super(googleApiClient);
        this.zza = dataSourcesRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.DataSourcesResult(java.util.Collections.emptyList(), status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcc) ((com.google.android.gms.internal.fitness.zzaz) anyClient).getService()).zzd(new com.google.android.gms.fitness.request.DataSourcesRequest(this.zza, new com.google.android.gms.internal.fitness.zzf(this)));
    }
}
