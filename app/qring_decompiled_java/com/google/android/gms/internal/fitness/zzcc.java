package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcc extends com.google.android.gms.internal.fitness.zza implements android.os.IInterface {
    zzcc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataSourcesRequest);
        zzk(1, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzak zzakVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzakVar);
        zzk(2, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzan zzanVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzanVar);
        zzk(3, zza);
    }
}
