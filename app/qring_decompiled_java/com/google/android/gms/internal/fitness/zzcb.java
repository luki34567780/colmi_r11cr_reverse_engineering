package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcb extends com.google.android.gms.internal.fitness.zza implements android.os.IInterface {
    zzcb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.zzae zzaeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzaeVar);
        zzk(3, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzbd zzbdVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzbdVar);
        zzk(1, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzbh zzbhVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzbhVar);
        zzk(2, zza);
    }
}
