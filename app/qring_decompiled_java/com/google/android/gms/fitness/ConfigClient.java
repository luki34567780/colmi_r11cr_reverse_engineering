package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class ConfigClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.fitness.ConfigApi zzb = new com.google.android.gms.internal.fitness.zzde();

    ConfigClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzu.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataType> createCustomDataType(com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzb.createCustomDataType(asGoogleApiClient(), dataTypeCreateRequest), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zze
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                int i = com.google.android.gms.fitness.ConfigClient.zza;
                return (com.google.android.gms.fitness.data.DataType) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.fitness.result.DataTypeResult) result).getDataType());
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> disableFit() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzb.disableFit(asGoogleApiClient()));
    }

    @java.lang.Deprecated
    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataType> readDataType(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzb.readDataType(asGoogleApiClient(), str), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zzd
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                int i = com.google.android.gms.fitness.ConfigClient.zza;
                return (com.google.android.gms.fitness.data.DataType) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.fitness.result.DataTypeResult) result).getDataType());
            }
        });
    }

    protected ConfigClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzu.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
