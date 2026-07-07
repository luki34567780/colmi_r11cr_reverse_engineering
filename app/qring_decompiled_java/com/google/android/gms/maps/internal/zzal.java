package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzal extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzam {
    public zzal() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.LatLng.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzc(parcel);
        zzb(latLng);
        parcel2.writeNoException();
        return true;
    }
}
