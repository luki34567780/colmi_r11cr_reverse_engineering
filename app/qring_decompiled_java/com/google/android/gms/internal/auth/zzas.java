package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzas extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zzh((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 2:
                zzf((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzv) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzv.CREATOR));
                return true;
            case 3:
                zzg((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzn) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzn.CREATOR));
                return true;
            case 4:
                zze();
                return true;
            case 5:
                zzd((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 6:
                zzb(parcel.createByteArray());
                return true;
            case 7:
                zzc((com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
