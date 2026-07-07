package com.amap.api.maps.model;

/* loaded from: classes.dex */
public interface TileProvider {
    public static final com.amap.api.maps.model.Tile NO_TILE = com.amap.api.maps.model.Tile.obtain(-1, -1, null);

    com.amap.api.maps.model.Tile getTile(int i, int i2, int i3);

    int getTileHeight();

    int getTileWidth();
}
