package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.auth.account.zze {
    zzc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzd(com.google.android.gms.auth.account.zzb zzbVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzbVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zze(com.google.android.gms.auth.account.zzb zzbVar, android.accounts.Account account) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzbVar);
        com.google.android.gms.internal.auth.zzc.zzc(zza, account);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzf(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzb(zza, z);
        zzc(1, zza);
    }
}
