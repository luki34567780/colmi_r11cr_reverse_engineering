package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzc implements com.google.android.gms.common.api.internal.RemoteCall {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ java.util.List zzb;
    final /* synthetic */ int zzc;

    zzc(com.google.android.gms.fitness.BleClient bleClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, java.util.List list, int i) {
        this.zza = listenerHolder;
        this.zzb = list;
        this.zzc = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbx) ((com.google.android.gms.internal.fitness.zzm) obj).getService()).zzf(new com.google.android.gms.fitness.request.StartBleScanRequest(this.zzb, (com.google.android.gms.fitness.request.zzab) com.google.android.gms.fitness.request.zzc.zza().zzb(this.zza), this.zzc, (com.google.android.gms.internal.fitness.zzcp) com.google.android.gms.internal.fitness.zzes.zzc((com.google.android.gms.tasks.TaskCompletionSource) obj2)));
    }
}
