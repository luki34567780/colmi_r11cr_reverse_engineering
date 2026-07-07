package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzby extends com.google.android.gms.internal.fitness.zza implements android.os.IInterface {
    zzby(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataTypeCreateRequest);
        zzk(1, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.zzv zzvVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzvVar);
        zzk(22, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzpVar);
        zzk(2, zza);
    }
}
