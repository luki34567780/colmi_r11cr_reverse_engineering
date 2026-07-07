package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzb((android.accounts.Account) com.google.android.gms.internal.auth.zzc.zza(parcel, android.accounts.Account.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zzc(com.google.android.gms.internal.auth.zzc.zze(parcel));
        }
        return true;
    }
}
