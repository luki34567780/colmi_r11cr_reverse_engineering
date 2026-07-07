package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public interface ConfigApi {
    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> createCustomDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableFit(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> readDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);
}
