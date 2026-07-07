package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
class zzav extends com.google.android.gms.internal.location.zzah {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzav(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(zzaaVar.getStatus(), this.zza);
    }

    public void zzc() {
    }
}
