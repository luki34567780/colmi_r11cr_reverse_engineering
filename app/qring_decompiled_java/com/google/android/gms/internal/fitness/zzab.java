package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzab extends com.google.android.gms.internal.fitness.zze {
    public static final com.google.android.gms.common.api.Api.ClientKey zze;
    public static final com.google.android.gms.common.api.Api zzf;
    public static final com.google.android.gms.common.api.Api zzg;
    public static final int zzh = 127;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zze = clientKey;
        zzf = new com.google.android.gms.common.api.Api("Fitness.GOALS_API", new com.google.android.gms.internal.fitness.zzw(null), clientKey);
        zzg = new com.google.android.gms.common.api.Api("Fitness.GOALS_CLIENT", new com.google.android.gms.internal.fitness.zzz(0 == true ? 1 : 0), clientKey);
    }

    /* synthetic */ zzab(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.internal.fitness.zzaa zzaaVar) {
        super(context, looper, zzh, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbz ? (com.google.android.gms.internal.fitness.zzbz) queryLocalInterface : new com.google.android.gms.internal.fitness.zzbz(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zze, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.fitness.GoalsApi";
    }
}
