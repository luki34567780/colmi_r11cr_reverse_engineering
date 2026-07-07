package com.google.android.gms.internal.p001authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzh extends com.google.android.gms.internal.p001authapiphone.zza implements android.os.IInterface {
    zzh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(com.google.android.gms.internal.p001authapiphone.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzeVar);
        zzb(4, zza);
    }

    public final void zzd(java.lang.String str, com.google.android.gms.internal.p001authapiphone.zzg zzgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzgVar);
        zzb(5, zza);
    }

    public final void zze(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, iStatusCallback);
        zzb(3, zza);
    }

    public final void zzf(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, iStatusCallback);
        zzb(6, zza);
    }

    public final void zzg(com.google.android.gms.internal.p001authapiphone.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzjVar);
        zzb(1, zza);
    }

    public final void zzh(java.lang.String str, com.google.android.gms.internal.p001authapiphone.zzj zzjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzjVar);
        zzb(2, zza);
    }
}
