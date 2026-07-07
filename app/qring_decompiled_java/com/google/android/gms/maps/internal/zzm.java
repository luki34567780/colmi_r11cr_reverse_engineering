package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.zzn {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.maps.model.CameraPosition cameraPosition = (com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcel, com.google.android.gms.maps.model.CameraPosition.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzc(parcel);
        zzb(cameraPosition);
        parcel2.writeNoException();
        return true;
    }
}
