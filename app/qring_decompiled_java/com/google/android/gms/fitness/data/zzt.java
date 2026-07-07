package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzt extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.fitness.data.zzv {
    zzt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.data.IDataSourceListener");
    }

    @Override // com.google.android.gms.fitness.data.zzv
    public final void zzd(com.google.android.gms.fitness.data.DataPoint dataPoint) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataPoint);
        zzl(1, zza);
    }
}
