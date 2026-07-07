package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzah extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzaj {
    zzah(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzd() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(13, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(5, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(9, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final java.lang.String zzg() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(3, zza());
        java.lang.String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzh() throws android.os.RemoteException {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzi() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzj(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, z);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzk(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzl(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, z);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzm(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzn(com.google.android.gms.internal.maps.zzaj zzajVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzajVar);
        android.os.Parcel zzH = zzH(8, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzo() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(11, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzp() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(7, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }
}
