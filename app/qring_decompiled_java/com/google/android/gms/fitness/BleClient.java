package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class BleClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.BleApi zza;

    static {
        zza = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2() ? new com.google.android.gms.internal.fitness.zzcy() : new com.google.android.gms.internal.fitness.zzet();
    }

    BleClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzm.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> claimBleDevice(com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.claimBleDevice(asGoogleApiClient(), bleDevice));
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.BleDevice>> listClaimedBleDevices() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zza.listClaimedBleDevices(asGoogleApiClient()), new com.google.android.gms.common.internal.PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.fitness.zza
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
                return ((com.google.android.gms.fitness.result.BleDevicesResult) result).getClaimedBleDevices();
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> startBleScan(java.util.List<com.google.android.gms.fitness.data.DataType> list, int i, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(com.google.android.gms.internal.fitness.zzet.zza));
        }
        com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener = registerListener(bleScanCallback, "BleScanCallback");
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(registerListener).register(new com.google.android.gms.fitness.zzc(this, registerListener, list, i)).unregister(new com.google.android.gms.fitness.zzb(this, registerListener)).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> stopBleScan(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        return !com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2() ? com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(com.google.android.gms.internal.fitness.zzet.zza)) : doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(bleScanCallback, "BleScanCallback"));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unclaimBleDevice(com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.unclaimBleDevice(asGoogleApiClient(), bleDevice));
    }

    protected BleClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions>) com.google.android.gms.internal.fitness.zzm.zzg, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> claimBleDevice(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.claimBleDevice(asGoogleApiClient(), str));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unclaimBleDevice(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zza.unclaimBleDevice(asGoogleApiClient(), str));
    }
}
