package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public interface SensorsApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> add(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> add(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataSourcesResult> findDataSources(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> remove(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> remove(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener);
}
