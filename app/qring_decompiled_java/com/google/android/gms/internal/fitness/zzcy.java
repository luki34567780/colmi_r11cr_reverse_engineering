package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcy implements com.google.android.gms.fitness.BleApi {
    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzct(this, googleApiClient, bleDevice));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.BleDevicesResult> listClaimedBleDevices(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzcv(this, googleApiClient));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzcq(this, googleApiClient, startBleScanRequest, com.google.android.gms.fitness.request.zzc.zza().zzc((com.google.android.gms.fitness.request.BleScanCallback) com.google.android.gms.common.internal.Preconditions.checkNotNull(startBleScanRequest.zza()), googleApiClient.getLooper())));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> stopBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        com.google.android.gms.fitness.request.zze zze = com.google.android.gms.fitness.request.zzc.zza().zze(bleScanCallback, googleApiClient.getLooper());
        return zze == null ? com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzcr(this, googleApiClient, zze));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return unclaimBleDevice(googleApiClient, bleDevice.getAddress());
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzcs(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzcu(this, googleApiClient, str));
    }
}
