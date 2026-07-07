package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzaj extends com.google.android.gms.internal.fitness.zze {
    public static final com.google.android.gms.common.api.Api.ClientKey zze;
    public static final com.google.android.gms.common.api.Api zzf;
    public static final com.google.android.gms.common.api.Api zzg;
    public static final int zzh = 59;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zze = clientKey;
        zzf = new com.google.android.gms.common.api.Api("Fitness.API", new com.google.android.gms.internal.fitness.zzad(null), clientKey);
        zzg = new com.google.android.gms.common.api.Api("Fitness.CLIENT", new com.google.android.gms.internal.fitness.zzag(0 == true ? 1 : 0), clientKey);
    }

    /* synthetic */ zzaj(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.internal.fitness.zzai zzaiVar) {
        super(context, looper, zzh, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzca ? (com.google.android.gms.internal.fitness.zzca) queryLocalInterface : new com.google.android.gms.internal.fitness.zzca(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zze, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.fitness.HistoryApi";
    }
}
