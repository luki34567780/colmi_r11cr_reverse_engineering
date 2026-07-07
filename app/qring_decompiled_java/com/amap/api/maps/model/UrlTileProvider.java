package com.amap.api.maps.model;

/* loaded from: classes.dex */
public abstract class UrlTileProvider implements com.amap.api.maps.model.TileProvider {
    private final int height;
    private final int width;

    public abstract java.net.URL getTileUrl(int i, int i2, int i3);

    public UrlTileProvider(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final com.amap.api.maps.model.Tile getTile(int i, int i2, int i3) {
        java.net.URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return NO_TILE;
        }
        try {
            return com.amap.api.maps.model.Tile.obtain(this.width, this.height, a(tileUrl.openStream()));
        } catch (java.io.IOException e) {
            com.amap.api.maps.model.Tile tile = NO_TILE;
            e.printStackTrace();
            return tile;
        }
    }

    private static byte[] a(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static long a(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileWidth() {
        return this.width;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileHeight() {
        return this.height;
    }
}
