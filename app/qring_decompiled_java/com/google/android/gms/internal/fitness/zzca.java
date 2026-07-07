package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzca extends com.google.android.gms.internal.fitness.zza implements android.os.IInterface {
    zzca(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataDeleteRequest);
        zzk(3, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzk zzkVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzkVar);
        zzk(2, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzh zzhVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzhVar);
        zzk(7, zza);
    }

    public final void zzg(com.google.android.gms.fitness.request.DataReadRequest dataReadRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataReadRequest);
        zzk(1, zza);
    }

    public final void zzh(com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataUpdateListenerRegistrationRequest);
        zzk(10, zza);
    }

    public final void zzi(com.google.android.gms.fitness.request.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzsVar);
        zzk(11, zza);
    }

    public final void zzj(com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataUpdateRequest);
        zzk(9, zza);
    }
}
