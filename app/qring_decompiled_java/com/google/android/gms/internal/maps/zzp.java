package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzp extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzr {
    zzp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(1, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zze() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(2, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(6, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final java.util.List zzg() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(3, zza());
        java.util.ArrayList<android.os.IBinder> createBinderArrayList = zzH.createBinderArrayList();
        zzH.recycle();
        return createBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final boolean zzh(com.google.android.gms.internal.maps.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzrVar);
        android.os.Parcel zzH = zzH(5, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final boolean zzi() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(4, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }
}
