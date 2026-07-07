package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzet implements com.google.android.gms.fitness.BleApi {
    public static final com.google.android.gms.common.api.Status zza = new com.google.android.gms.common.api.Status(com.google.android.gms.fitness.FitnessStatusCodes.UNSUPPORTED_PLATFORM);

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zza, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.BleDevicesResult> listClaimedBleDevices(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.common.api.PendingResults.immediateFailedResult(com.google.android.gms.fitness.result.BleDevicesResult.zza(zza), googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zza, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> stopBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zza, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zza, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zza, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zza, googleApiClient);
    }
}
