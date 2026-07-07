package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzee implements com.google.android.gms.fitness.SensorsApi {
    private final com.google.android.gms.common.api.PendingResult zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.data.zzv zzvVar, android.app.PendingIntent pendingIntent) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzec(this, googleApiClient, sensorRequest, zzvVar, pendingIntent));
    }

    private final com.google.android.gms.common.api.PendingResult zzb(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.zzv zzvVar, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzed(this, googleApiClient, zzvVar, pendingIntent));
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> add(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, android.app.PendingIntent pendingIntent) {
        return zza(googleApiClient, sensorRequest, null, pendingIntent);
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataSourcesResult> findDataSources(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzeb(this, googleApiClient, dataSourcesRequest));
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> remove(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return zzb(googleApiClient, null, pendingIntent);
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> add(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        return zza(googleApiClient, sensorRequest, com.google.android.gms.fitness.request.zzah.zza().zzc(onDataPointListener, googleApiClient.getLooper()), null);
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> remove(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        com.google.android.gms.fitness.request.zzaj zze = com.google.android.gms.fitness.request.zzah.zza().zze(onDataPointListener, googleApiClient.getLooper());
        return zze == null ? com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient) : zzb(googleApiClient, zze, null);
    }
}
