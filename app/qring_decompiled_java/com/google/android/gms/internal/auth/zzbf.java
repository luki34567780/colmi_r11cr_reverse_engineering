package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbf extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zzb((com.google.android.gms.auth.api.proxy.ProxyResponse) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zzc(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
