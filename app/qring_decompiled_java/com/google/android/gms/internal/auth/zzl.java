package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzl extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.AccountChangeEventsResponse) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR));
        return true;
    }
}
