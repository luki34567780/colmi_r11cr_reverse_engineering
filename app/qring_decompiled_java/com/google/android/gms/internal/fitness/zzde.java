package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzde implements com.google.android.gms.fitness.ConfigApi {
    @Override // com.google.android.gms.fitness.ConfigApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> createCustomDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzcz(this, googleApiClient, dataTypeCreateRequest));
    }

    @Override // com.google.android.gms.fitness.ConfigApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableFit(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzdb(this, googleApiClient));
    }

    @Override // com.google.android.gms.fitness.ConfigApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> readDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzda(this, googleApiClient, str));
    }
}
