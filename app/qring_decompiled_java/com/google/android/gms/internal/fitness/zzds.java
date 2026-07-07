package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzds implements com.google.android.gms.fitness.HistoryApi {
    private final com.google.android.gms.common.api.PendingResult zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType, boolean z) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdp(this, googleApiClient, dataType, z));
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> deleteData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdj(this, googleApiClient, dataDeleteRequest));
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> insertData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSet dataSet) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSet, "Must set the data set");
        com.google.android.gms.common.internal.Preconditions.checkState(!dataSet.getDataPoints().isEmpty(), "Cannot use an empty data set");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSet.getDataSource().zza(), "Must set the app package name for the data source");
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdi(this, googleApiClient, dataSet, false));
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DailyTotalResult> readDailyTotal(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        return zza(googleApiClient, dataType, false);
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DailyTotalResult> readDailyTotalFromLocalDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        return zza(googleApiClient, dataType, true);
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataReadResult> readData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataReadRequest dataReadRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdn(this, googleApiClient, dataReadRequest));
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerDataUpdateListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdl(this, googleApiClient, dataUpdateListenerRegistrationRequest));
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterDataUpdateListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzdm(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.fitness.HistoryApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> updateData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataUpdateRequest.getDataSet(), "Must set the data set");
        com.google.android.gms.common.internal.Preconditions.checkNotZero(dataUpdateRequest.zzb(), "Must set a non-zero value for startTimeMillis/startTime");
        com.google.android.gms.common.internal.Preconditions.checkNotZero(dataUpdateRequest.zza(), "Must set a non-zero value for endTimeMillis/endTime");
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdk(this, googleApiClient, dataUpdateRequest));
    }
}
