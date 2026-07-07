package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zze extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.zzf {
    zze(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(9, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zze() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zzbVar;
        android.os.Parcel zzH = zzH(4, zza());
        android.os.IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            zzbVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            zzbVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate ? (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzb(readStrongBinder);
        }
        zzH.recycle();
        return zzbVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IMapFragmentDelegate zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IMapFragmentDelegate zzkVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        android.os.Parcel zzH = zzH(2, zza);
        android.os.IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            zzkVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            zzkVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IMapFragmentDelegate ? (com.google.android.gms.maps.internal.IMapFragmentDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzk(readStrongBinder);
        }
        zzH.recycle();
        return zzkVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IMapViewDelegate zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IMapViewDelegate zzlVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zze(zza, googleMapOptions);
        android.os.Parcel zzH = zzH(3, zza);
        android.os.IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            zzlVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            zzlVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IMapViewDelegate ? (com.google.android.gms.maps.internal.IMapViewDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzl(readStrongBinder);
        }
        zzH.recycle();
        return zzlVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzbxVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        android.os.Parcel zzH = zzH(8, zza);
        android.os.IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            zzbxVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate ? (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzbx(readStrongBinder);
        }
        zzH.recycle();
        return zzbxVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzbyVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewPanoramaOptions);
        android.os.Parcel zzH = zzH(7, zza);
        android.os.IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            zzbyVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            zzbyVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate ? (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzby(readStrongBinder);
        }
        zzH.recycle();
        return zzbyVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.internal.maps.zzi zzj() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(5, zza());
        com.google.android.gms.internal.maps.zzi zzb = com.google.android.gms.internal.maps.zzh.zzb(zzH.readStrongBinder());
        zzH.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zza.writeInt(i);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zza.writeInt(i);
        zzc(10, zza);
    }
}
