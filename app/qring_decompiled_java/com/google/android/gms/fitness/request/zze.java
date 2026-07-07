package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zze extends com.google.android.gms.fitness.request.zzaa {
    private final com.google.android.gms.common.api.internal.ListenerHolder zza;

    @Override // com.google.android.gms.fitness.request.zzab
    public final void zzb(com.google.android.gms.fitness.data.BleDevice bleDevice) {
        this.zza.notifyListener(new com.google.android.gms.fitness.request.zza(this, bleDevice));
    }

    @Override // com.google.android.gms.fitness.request.zzab
    public final void zzc() {
        this.zza.notifyListener(new com.google.android.gms.fitness.request.zzb(this));
    }

    public final void zzd() {
        this.zza.clear();
    }
}
