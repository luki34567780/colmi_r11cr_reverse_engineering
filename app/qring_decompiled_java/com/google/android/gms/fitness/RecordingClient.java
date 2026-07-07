package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class RecordingClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.RecordingApi zza = new com.google.android.gms.internal.fitness.zzea();

    RecordingClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzar.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Subscription>> listSubscriptions() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza.listSubscriptions(asGoogleApiClient()), com.google.android.gms.fitness.zzm.zza);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.fitness.data.DataSource dataSource) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.subscribe(asGoogleApiClient(), dataSource));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.fitness.data.DataSource dataSource) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.unsubscribe(asGoogleApiClient(), dataSource));
    }

    protected RecordingClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzar.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Subscription>> listSubscriptions(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza.listSubscriptions(asGoogleApiClient(), dataType), com.google.android.gms.fitness.zzm.zza);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.subscribe(asGoogleApiClient(), dataType));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.unsubscribe(asGoogleApiClient(), dataType));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.fitness.data.Subscription subscription) {
        com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe;
        com.google.android.gms.fitness.RecordingApi recordingApi = zza;
        com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        if (subscription.getDataType() == null) {
            unsubscribe = ((com.google.android.gms.internal.fitness.zzea) recordingApi).unsubscribe(asGoogleApiClient, (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(subscription.getDataSource()));
        } else {
            unsubscribe = ((com.google.android.gms.internal.fitness.zzea) recordingApi).unsubscribe(asGoogleApiClient, (com.google.android.gms.fitness.data.DataType) com.google.android.gms.common.internal.Preconditions.checkNotNull(subscription.getDataType()));
        }
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(unsubscribe);
    }
}
