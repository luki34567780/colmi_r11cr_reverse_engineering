package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzae extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzag {
    zzae(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzA(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, z);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzB(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzC(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzD(com.google.android.gms.internal.maps.zzag zzagVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzagVar);
        android.os.Parcel zzH = zzH(15, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzE() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(18, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzF() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(14, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final boolean zzG() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(12, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzH);
        zzH.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final float zzd() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(6, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(10, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(8, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final int zzg() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(24, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final int zzh() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(16, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(28, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzH.readStrongBinder());
        zzH.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final com.google.android.gms.maps.model.Cap zzj() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(22, zza());
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) com.google.android.gms.internal.maps.zzc.zza(zzH, com.google.android.gms.maps.model.Cap.CREATOR);
        zzH.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final com.google.android.gms.maps.model.Cap zzk() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(20, zza());
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) com.google.android.gms.internal.maps.zzc.zza(zzH, com.google.android.gms.maps.model.Cap.CREATOR);
        zzH.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(2, zza());
        java.lang.String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final java.util.List zzm() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(26, zza());
        java.util.ArrayList createTypedArrayList = zzH.createTypedArrayList(com.google.android.gms.maps.model.PatternItem.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final java.util.List zzn() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(4, zza());
        java.util.ArrayList createTypedArrayList = zzH.createTypedArrayList(com.google.android.gms.maps.model.LatLng.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final java.util.List zzo() throws android.os.RemoteException {
        android.os.Parcel zzH = zzH(30, zza());
        java.util.ArrayList createTypedArrayList = zzH.createTypedArrayList(com.google.android.gms.maps.model.StyleSpan.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzp() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzq(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, z);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzr(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzs(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, cap);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzt(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, z);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzu(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzv(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzw(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzx(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzy(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, cap);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(27, zza);
    }
}
