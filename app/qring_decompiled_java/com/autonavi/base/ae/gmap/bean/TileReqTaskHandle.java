package com.autonavi.base.ae.gmap.bean;

/* loaded from: classes.dex */
public class TileReqTaskHandle {
    long nativeObj;
    int status;
    com.amap.api.maps.model.Tile tile;

    public void finish(com.amap.api.maps.model.Tile tile) {
        this.tile = tile;
    }
}
