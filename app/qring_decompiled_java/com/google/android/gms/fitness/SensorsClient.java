package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class SensorsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.SensorsApi zza = new com.google.android.gms.internal.fitness.zzee();

    SensorsClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzaz.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> add(com.google.android.gms.fitness.request.SensorRequest sensorRequest, android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.add(asGoogleApiClient(), sensorRequest, pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.DataSource>> findDataSources(com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza.findDataSources(asGoogleApiClient(), dataSourcesRequest), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zzn
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                return ((com.google.android.gms.fitness.result.DataSourcesResult) result).getDataSources();
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> remove(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.remove(asGoogleApiClient(), pendingIntent));
    }

    protected SensorsClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzaz.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> add(com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener = registerListener(onDataPointListener, "OnDataPointListener");
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(registerListener).register(new com.google.android.gms.fitness.zzp(this, registerListener, sensorRequest)).unregister(new com.google.android.gms.fitness.zzo(this, registerListener)).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> remove(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(onDataPointListener, "OnDataPointListener"));
    }
}
