package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbb extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzbc {
    public zzbb() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.maps.zzc.zza(parcel, android.location.Location.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzc(parcel);
        zzb(location);
        parcel2.writeNoException();
        return true;
    }
}
