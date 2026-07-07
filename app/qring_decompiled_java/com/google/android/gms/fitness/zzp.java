package com.google.android.gms.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzp implements com.google.android.gms.common.api.internal.RemoteCall {
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zza;
    final /* synthetic */ com.google.android.gms.fitness.request.SensorRequest zzb;

    zzp(com.google.android.gms.fitness.SensorsClient sensorsClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.fitness.request.SensorRequest sensorRequest) {
        this.zza = listenerHolder;
        this.zzb = sensorRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcc) ((com.google.android.gms.internal.fitness.zzaz) obj).getService()).zze(new com.google.android.gms.fitness.request.zzak(this.zzb, com.google.android.gms.fitness.request.zzah.zza().zzb(this.zza), null, com.google.android.gms.internal.fitness.zzes.zzc((com.google.android.gms.tasks.TaskCompletionSource) obj2)));
    }
}
