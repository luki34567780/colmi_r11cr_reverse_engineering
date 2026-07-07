package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzbd extends com.google.android.gms.internal.location.zzap {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    public zzbd(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzaq
    public final void zzb(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}
