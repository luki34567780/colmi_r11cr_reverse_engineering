package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface TileProvider {
    public static final com.google.android.gms.maps.model.Tile NO_TILE = new com.google.android.gms.maps.model.Tile(-1, -1, null);

    com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3);
}
