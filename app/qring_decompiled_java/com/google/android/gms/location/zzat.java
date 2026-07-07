package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzat extends com.google.android.gms.internal.location.zzan {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzat(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(com.google.android.gms.common.api.Status status, android.location.Location location) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, location, this.zza);
    }
}
