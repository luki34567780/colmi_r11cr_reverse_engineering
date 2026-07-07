package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzax extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzay {
    public zzax() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzb = zzb();
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzd(parcel2, zzb);
        return true;
    }
}
