package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IAccountAccessor {
    zzv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() throws android.os.RemoteException {
        android.os.Parcel zzB = zzB(2, zza());
        android.accounts.Account account = (android.accounts.Account) com.google.android.gms.internal.common.zzc.zza(zzB, android.accounts.Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
