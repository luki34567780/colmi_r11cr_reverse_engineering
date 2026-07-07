package com.google.android.gms.internal.p002authapiphone;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes2.dex */
public abstract class zzf extends com.google.android.gms.internal.p002authapiphone.zzb implements com.google.android.gms.internal.p002authapiphone.zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // com.google.android.gms.internal.p002authapiphone.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p002authapiphone.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), com.google.android.gms.internal.p002authapiphone.zzc.zzc(parcel));
        return true;
    }
}
