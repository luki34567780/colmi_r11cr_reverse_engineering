package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzo implements com.google.android.gms.common.api.internal.RemoteCall {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;

    zzo(com.google.android.gms.fitness.SensorsClient sensorsClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        com.google.android.gms.internal.fitness.zzaz zzazVar = (com.google.android.gms.internal.fitness.zzaz) obj;
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
        com.google.android.gms.fitness.request.zzaj zzd = com.google.android.gms.fitness.request.zzah.zza().zzd(this.zza);
        if (zzd == null) {
            taskCompletionSource.setResult(false);
        } else {
            ((com.google.android.gms.internal.fitness.zzcc) zzazVar.getService()).zzf(new com.google.android.gms.fitness.request.zzan((com.google.android.gms.fitness.data.zzv) zzd, (android.app.PendingIntent) null, (com.google.android.gms.internal.fitness.zzcp) com.google.android.gms.internal.fitness.zzes.zze(taskCompletionSource)));
        }
    }
}
