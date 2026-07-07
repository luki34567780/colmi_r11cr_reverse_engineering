package com.google.android.gms.fitness.service;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzd implements com.google.android.gms.fitness.service.SensorEventDispatcher {
    private final com.google.android.gms.fitness.data.zzv zza;

    zzd(com.google.android.gms.fitness.data.zzv zzvVar) {
        this.zza = (com.google.android.gms.fitness.data.zzv) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar);
    }

    @Override // com.google.android.gms.fitness.service.SensorEventDispatcher
    public final void publish(com.google.android.gms.fitness.data.DataPoint dataPoint) throws android.os.RemoteException {
        dataPoint.zzd();
        this.zza.zzd(dataPoint);
    }

    @Override // com.google.android.gms.fitness.service.SensorEventDispatcher
    public final void publish(java.util.List<com.google.android.gms.fitness.data.DataPoint> list) throws android.os.RemoteException {
        for (com.google.android.gms.fitness.data.DataPoint dataPoint : list) {
            dataPoint.zzd();
            this.zza.zzd(dataPoint);
        }
    }
}
