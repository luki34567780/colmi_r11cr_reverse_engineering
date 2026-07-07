package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbt extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IProjectionDelegate {
    zzbt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.maps.model.LatLng fromScreenLocation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        android.os.Parcel zzH = zzH(1, zza);
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(zzH, com.google.android.gms.maps.model.LatLng.CREATOR);
        zzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(3, zza());
        com.google.android.gms.maps.model.VisibleRegion visibleRegion = (com.google.android.gms.maps.model.VisibleRegion) com.google.android.gms.internal.maps.zzc.zza(zzH, com.google.android.gms.maps.model.VisibleRegion.CREATOR);
        zzH.recycle();
        return visibleRegion;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper toScreenLocation(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        android.os.Parcel zzH = zzH(2, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzH.readStrongBinder());
        zzH.recycle();
        return asInterface;
    }
}
