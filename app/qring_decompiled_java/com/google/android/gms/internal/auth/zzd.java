package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzd extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.internal.auth.zzf {
    zzd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zzd(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.auth.zzc.zzc(zza, bundle);
        android.os.Parcel zzb = zzb(2, zza);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(zzb, android.os.Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zze(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzc(zza, account);
        zza.writeString(str);
        com.google.android.gms.internal.auth.zzc.zzc(zza, bundle);
        android.os.Parcel zzb = zzb(5, zza);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(zzb, android.os.Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zzf(android.accounts.Account account) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzc(zza, account);
        android.os.Parcel zzb = zzb(7, zza);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(zzb, android.os.Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zzg(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzb = zzb(8, zza);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(zzb, android.os.Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final com.google.android.gms.auth.AccountChangeEventsResponse zzh(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzc(zza, accountChangeEventsRequest);
        android.os.Parcel zzb = zzb(3, zza);
        com.google.android.gms.auth.AccountChangeEventsResponse accountChangeEventsResponse = (com.google.android.gms.auth.AccountChangeEventsResponse) com.google.android.gms.internal.auth.zzc.zza(zzb, com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR);
        zzb.recycle();
        return accountChangeEventsResponse;
    }
}
