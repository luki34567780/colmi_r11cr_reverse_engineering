package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class GoalsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.GoalsApi zza = new com.google.android.gms.internal.fitness.zzdh();

    GoalsClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzab.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Goal>> readCurrentGoals(com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza.readCurrentGoals(asGoogleApiClient(), goalsReadRequest), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zzj
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                return ((com.google.android.gms.fitness.result.GoalsResult) result).getGoals();
            }
        });
    }

    protected GoalsClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzab.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
