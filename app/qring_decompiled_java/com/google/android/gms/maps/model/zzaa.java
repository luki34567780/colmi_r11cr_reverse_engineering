package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzaa implements com.google.android.gms.maps.model.TileProvider {
    final /* synthetic */ com.google.android.gms.maps.model.TileOverlayOptions zza;
    private final com.google.android.gms.internal.maps.zzam zzb;

    zzaa(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) {
        com.google.android.gms.internal.maps.zzam zzamVar;
        this.zza = tileOverlayOptions;
        zzamVar = tileOverlayOptions.zza;
        this.zzb = zzamVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzb.zzb(i, i2, i3);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }
}
