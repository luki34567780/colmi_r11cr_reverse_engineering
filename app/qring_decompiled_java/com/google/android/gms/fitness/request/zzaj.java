package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzaj extends com.google.android.gms.fitness.data.zzu {
    private final com.google.android.gms.common.api.internal.ListenerHolder zza;

    public final void zzc() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.fitness.data.zzv
    public final void zzd(com.google.android.gms.fitness.data.DataPoint dataPoint) {
        this.zza.notifyListener(new com.google.android.gms.fitness.request.zzag(this, dataPoint));
    }
}
