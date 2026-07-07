package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzau extends com.google.android.gms.location.zzav {
    private final com.google.android.gms.location.zzaf zza;

    public zzau(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.location.zzaf zzafVar, byte[] bArr) {
        super(taskCompletionSource);
        this.zza = zzafVar;
    }

    @Override // com.google.android.gms.location.zzav, com.google.android.gms.internal.location.zzai
    public final void zzc() {
        com.google.android.gms.location.zzaf zzafVar = this.zza;
        com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient = zzafVar.zza;
        com.google.android.gms.location.zzaw zzawVar = zzafVar.zzb;
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolder = zzafVar.zzc;
        zzawVar.zza(false);
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey != null) {
            fusedLocationProviderClient.doUnregisterEventListener(listenerKey);
        }
    }
}
