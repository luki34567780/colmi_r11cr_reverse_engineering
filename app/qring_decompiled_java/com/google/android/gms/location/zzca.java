package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzca implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzca(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        com.google.android.gms.location.LocationSettingsResult locationSettingsResult = (com.google.android.gms.location.LocationSettingsResult) obj;
        com.google.android.gms.common.api.Status status = locationSettingsResult.getStatus();
        if (status.isSuccess()) {
            this.zza.setResult(new com.google.android.gms.location.LocationSettingsResponse(locationSettingsResult));
        } else if (status.hasResolution()) {
            this.zza.setException(new com.google.android.gms.common.api.ResolvableApiException(status));
        } else {
            this.zza.setException(new com.google.android.gms.common.api.ApiException(status));
        }
    }
}
