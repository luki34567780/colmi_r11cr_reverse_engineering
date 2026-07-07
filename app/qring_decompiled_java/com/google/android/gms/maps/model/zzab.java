package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzab extends com.google.android.gms.internal.maps.zzal {
    final /* synthetic */ com.google.android.gms.maps.model.TileProvider zza;

    zzab(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions, com.google.android.gms.maps.model.TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzam
    public final com.google.android.gms.maps.model.Tile zzb(int i, int i2, int i3) {
        return this.zza.getTile(i, i2, i3);
    }
}
