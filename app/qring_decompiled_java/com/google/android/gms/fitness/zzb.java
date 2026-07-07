package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzb implements com.google.android.gms.common.api.internal.RemoteCall {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;

    zzb(com.google.android.gms.fitness.BleClient bleClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        com.google.android.gms.internal.fitness.zzm zzmVar = (com.google.android.gms.internal.fitness.zzm) obj;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
        com.google.android.gms.fitness.request.zze zzd = com.google.android.gms.fitness.request.zzc.zza().zzd(this.zza);
        if (zzd == null) {
            taskCompletionSource.setResult(false);
        } else {
            ((com.google.android.gms.internal.fitness.zzbx) zzmVar.getService()).zzg(new com.google.android.gms.fitness.request.zzbb((com.google.android.gms.fitness.request.zzab) zzd, (com.google.android.gms.internal.fitness.zzcp) com.google.android.gms.internal.fitness.zzes.zze(taskCompletionSource)));
        }
    }
}
