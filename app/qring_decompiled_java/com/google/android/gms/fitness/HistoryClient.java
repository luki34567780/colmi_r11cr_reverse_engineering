package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class HistoryClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.fitness.HistoryApi zzb = new com.google.android.gms.internal.fitness.zzds();

    HistoryClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzaj.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> deleteData(com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzb.deleteData(asGoogleApiClient(), dataDeleteRequest));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> insertData(com.google.android.gms.fitness.data.DataSet dataSet) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzb.insertData(asGoogleApiClient(), dataSet));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataSet> readDailyTotal(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzb.readDailyTotal(asGoogleApiClient(), dataType), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zzk
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                int i = com.google.android.gms.fitness.HistoryClient.zza;
                return (com.google.android.gms.fitness.data.DataSet) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.fitness.result.DailyTotalResult) result).getTotal());
            }
        });
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataSet> readDailyTotalFromLocalDevice(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzb.readDailyTotalFromLocalDevice(asGoogleApiClient(), dataType), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zzl
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                int i = com.google.android.gms.fitness.HistoryClient.zza;
                return (com.google.android.gms.fitness.data.DataSet) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.fitness.result.DailyTotalResult) result).getTotal());
            }
        });
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.result.DataReadResponse> readData(com.google.android.gms.fitness.request.DataReadRequest dataReadRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(zzb.readData(asGoogleApiClient(), dataReadRequest), new com.google.android.gms.fitness.result.DataReadResponse());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> registerDataUpdateListener(com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzb.registerDataUpdateListener(asGoogleApiClient(), dataUpdateListenerRegistrationRequest));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unregisterDataUpdateListener(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzb.unregisterDataUpdateListener(asGoogleApiClient(), pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> updateData(com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzb.updateData(asGoogleApiClient(), dataUpdateRequest));
    }

    protected HistoryClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzaj.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
