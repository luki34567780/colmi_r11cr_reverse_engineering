package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class HeatMapItem {
    private com.amap.api.maps.model.LatLng center;
    private int[] indexes;
    private double intensity;

    public com.amap.api.maps.model.LatLng getCenter() {
        return this.center;
    }

    public void setCenter(double d, double d2) {
        this.center = new com.amap.api.maps.model.LatLng(d, d2);
    }

    public double getIntensity() {
        return this.intensity;
    }

    public void setIntensity(double d) {
        this.intensity = d;
    }

    public int[] getIndexes() {
        return this.indexes;
    }

    public void setIndexes(int[] iArr) {
        this.indexes = iArr;
    }
}
