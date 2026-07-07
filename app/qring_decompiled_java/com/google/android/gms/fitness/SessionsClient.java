package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class SessionsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.SessionsApi zza = new com.google.android.gms.internal.fitness.zzep();

    SessionsClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzbh.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> insertSession(com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.insertSession(asGoogleApiClient(), sessionInsertRequest));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.result.SessionReadResponse> readSession(com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(zza.readSession(asGoogleApiClient(), sessionReadRequest), new com.google.android.gms.fitness.result.SessionReadResponse());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> registerForSessions(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.registerForSessions(asGoogleApiClient(), pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> startSession(com.google.android.gms.fitness.data.Session session) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.startSession(asGoogleApiClient(), session));
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Session>> stopSession(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza.stopSession(asGoogleApiClient(), str), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zzq
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                return ((com.google.android.gms.fitness.result.SessionStopResult) result).getSessions();
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unregisterForSessions(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.unregisterForSessions(asGoogleApiClient(), pendingIntent));
    }

    protected SessionsClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzbh.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
