package com.google.android.gms.internal.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzak extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzam {
    zzak(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final com.google.android.gms.maps.model.Tile zzb(int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        android.os.Parcel zzH = zzH(1, zza);
        com.google.android.gms.maps.model.Tile tile = (com.google.android.gms.maps.model.Tile) com.google.android.gms.internal.maps.zzc.zza(zzH, com.google.android.gms.maps.model.Tile.CREATOR);
        zzH.recycle();
        return tile;
    }
}
