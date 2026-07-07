package com.amap.api.maps.model.amap3dmodeltile;

import com.amap.api.col.p0003sl.ab;
import com.amap.api.col.p0003sl.df;
import com.amap.api.col.p0003sl.ie;
import com.amap.api.maps.model.Tile;
import com.amap.api.maps.model.TileProvider;

/* loaded from: classes.dex */
public final class AMap3DModelTileProvider implements TileProvider {
    private static final String DEFAULT_URL = "https://lbs-3dtiles-service.amap.com/basemap/tiles/staging?compose=building@1669011850923&compose=tree@1668678765481&z=%d&x=%d&y=%d";
    private int tileSize = 256;
    private String url;

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public final Tile getTile(int i, int i2, int i3) {
        byte[] a = a(i3, i, i2);
        if (a == null) {
            return TileProvider.NO_TILE;
        }
        int i4 = this.tileSize;
        return new Tile(i4, i4, a, false);
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
            return new AMap3DModelRequest(b(i, i2, i3)).makeHttpRequestWithInterrupted();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String b(int i, int i2, int i3) {
        String str = this.url;
        if (str == null) {
            str = DEFAULT_URL;
        }
        return String.format(str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static class AMap3DModelRequest extends df {
        private String baseQueryStr;
        private String baseUrl;

        public AMap3DModelRequest(String str) {
            this.baseUrl = "";
            this.baseQueryStr = "";
            this.isPostFlag = false;
            if (!str.contains("?")) {
                this.baseUrl = str + "?";
                return;
            }
            String[] split = str.split("\\?");
            if (split.length > 1) {
                this.baseUrl = split[0] + "?";
                this.baseQueryStr = split[1];
            }
        }

        @Override // com.amap.api.col.p0003sl.kz
        public String getURL() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.baseQueryStr);
            stringBuffer.append("&key=");
            stringBuffer.append(ie.f(ab.a));
            return this.baseUrl + appendTsScode(stringBuffer.toString());
        }
    }
}
