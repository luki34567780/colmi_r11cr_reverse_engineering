package com.autonavi.base.ae.gmap.bean;

/* loaded from: classes.dex */
public interface TileSourceProvider extends com.amap.api.maps.model.TileProvider {
    void cancel(com.autonavi.base.ae.gmap.bean.TileSourceReq tileSourceReq);

    com.amap.api.maps.model.Tile getTile(com.autonavi.base.ae.gmap.bean.TileSourceReq tileSourceReq);
}
