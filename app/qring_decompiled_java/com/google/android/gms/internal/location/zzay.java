package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzay extends com.google.android.gms.location.zzbh {
    private final com.google.android.gms.common.api.internal.ListenerHolder zza;

    zzay(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zzd(com.google.android.gms.location.LocationAvailability locationAvailability) {
        this.zza.notifyListener(new com.google.android.gms.internal.location.zzax(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzbi
    public final void zze(com.google.android.gms.location.LocationResult locationResult) {
        this.zza.notifyListener(new com.google.android.gms.internal.location.zzaw(this, locationResult));
    }
}
