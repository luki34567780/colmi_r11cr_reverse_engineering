package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbx extends com.google.android.gms.internal.fitness.zza implements android.os.IInterface {
    zzbx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.zzf zzfVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzfVar);
        zzk(3, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzac zzacVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzacVar);
        zzk(5, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, startBleScanRequest);
        zzk(1, zza);
    }

    public final void zzg(com.google.android.gms.fitness.request.zzbb zzbbVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzbbVar);
        zzk(2, zza);
    }

    public final void zzh(com.google.android.gms.fitness.request.zzbf zzbfVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzbfVar);
        zzk(4, zza);
    }
}
