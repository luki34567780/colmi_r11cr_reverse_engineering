package com.amap.api.maps.model;

/* loaded from: classes.dex */
public final class MVTTileProvider implements com.amap.api.maps.model.TileProvider {
    private java.lang.String id;
    private java.lang.String key;
    private int tileSize = 256;
    private java.lang.String url;

    public MVTTileProvider(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.url = str;
        this.key = str2;
        this.id = str3;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final com.amap.api.maps.model.Tile getTile(int i, int i2, int i3) {
        byte[] a2 = a(i3, i, i2);
        if (a2 == null) {
            return com.amap.api.maps.model.TileProvider.NO_TILE;
        }
        int i4 = this.tileSize;
        return new com.amap.api.maps.model.Tile(i4, i4, a2, false);
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileWidth() {
        return this.tileSize;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final int getTileHeight() {
        return this.tileSize;
    }

    private byte[] a(int i, int i2, int i3) {
        try {
            return new com.amap.api.maps.model.MVTTileProvider.a(a(i, i2, i3, this.tileSize)).makeHttpRequestWithInterrupted();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private java.lang.String a(int i, int i2, int i3, int i4) {
        return java.lang.String.format(this.url + "?z=%d&x=%d&y=%d&size=%d&key=" + this.key + "&id=" + this.id, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
    }

    private class a extends com.amap.api.col.p0003sl.df {
        java.lang.String a;

        public a(java.lang.String str) {
            this.isPostFlag = false;
            this.a = str;
        }

        @Override // com.amap.api.col.p0003sl.kz
        public final java.lang.String getURL() {
            return this.a;
        }
    }
}
