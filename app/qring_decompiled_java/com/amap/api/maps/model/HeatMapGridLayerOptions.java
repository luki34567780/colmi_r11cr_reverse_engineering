package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class HeatMapGridLayerOptions extends com.amap.api.maps.model.BaseOptions {
    public static final int TYPE_GRID = 1;
    public static final int TYPE_HEXAGON = 2;
    public static final int TYPE_NORMAL = 0;
    private java.util.List<com.amap.api.maps.model.ColorLatLng> mData;
    private float maxZoom = 20.0f;
    private float minZoom = 3.0f;
    private float zIndex = 0.0f;
    private boolean isVisible = true;
    private int mType = 2;
    private boolean isPointsUpdated = false;

    public HeatMapGridLayerOptions() {
        this.type = "HeatMapGridLayerOptions";
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions data(java.util.List<com.amap.api.maps.model.ColorLatLng> list) {
        this.mData = list;
        this.isPointsUpdated = true;
        return this;
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions maxZoom(float f) {
        this.maxZoom = f;
        return this;
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions minZoom(float f) {
        this.minZoom = f;
        return this;
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions type(int i) {
        this.mType = i;
        return this;
    }

    public com.amap.api.maps.model.HeatMapGridLayerOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public java.util.List<com.amap.api.maps.model.ColorLatLng> getData() {
        return this.mData;
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public float getMinZoom() {
        return this.minZoom;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public int getType() {
        return this.mType;
    }

    public boolean isVisible() {
        return this.isVisible;
    }
}
