package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcd extends com.google.android.gms.internal.fitness.zza implements android.os.IInterface {
    zzcd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, sessionInsertRequest);
        zzk(3, zza);
    }

    public final void zze(com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, sessionReadRequest);
        zzk(4, zza);
    }

    public final void zzf(com.google.android.gms.fitness.request.zzar zzarVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzarVar);
        zzk(5, zza);
    }

    public final void zzg(com.google.android.gms.fitness.request.zzat zzatVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzatVar);
        zzk(1, zza);
    }

    public final void zzh(com.google.android.gms.fitness.request.zzav zzavVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzavVar);
        zzk(2, zza);
    }

    public final void zzi(com.google.android.gms.fitness.request.zzax zzaxVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, zzaxVar);
        zzk(6, zza);
    }
}
