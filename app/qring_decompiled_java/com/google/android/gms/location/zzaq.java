package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzaq extends com.google.android.gms.location.zzaw {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ com.google.android.gms.location.FusedLocationProviderClient zzb;

    zzaq(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zzb = fusedLocationProviderClient;
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
        if (zzb()) {
            com.google.android.gms.location.zzar zzarVar = new com.google.android.gms.location.zzar(this.zzb, taskCompletionSource);
            com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey = this.zza.getListenerKey();
            if (listenerKey != null) {
                zzbeVar.zzy(listenerKey, zzarVar);
            }
        }
    }
}
