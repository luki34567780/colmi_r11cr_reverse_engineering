package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzp extends com.google.android.gms.internal.auth.zza implements android.os.IInterface {
    zzp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback, com.google.android.gms.internal.auth.zzbw zzbwVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, iStatusCallback);
        com.google.android.gms.internal.auth.zzc.zzc(zza, zzbwVar);
        zzc(2, zza);
    }

    public final void zze(com.google.android.gms.internal.auth.zzm zzmVar, com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzmVar);
        com.google.android.gms.internal.auth.zzc.zzc(zza, accountChangeEventsRequest);
        zzc(4, zza);
    }

    public final void zzf(com.google.android.gms.internal.auth.zzo zzoVar, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzoVar);
        com.google.android.gms.internal.auth.zzc.zzc(zza, account);
        zza.writeString(str);
        com.google.android.gms.internal.auth.zzc.zzc(zza, bundle);
        zzc(1, zza);
    }

    public final void zzg(com.google.android.gms.internal.auth.zzk zzkVar, android.accounts.Account account) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzkVar);
        com.google.android.gms.internal.auth.zzc.zzc(zza, account);
        zzc(6, zza);
    }

    public final void zzh(com.google.android.gms.internal.auth.zzk zzkVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzkVar);
        zza.writeString(str);
        zzc(3, zza);
    }
}
