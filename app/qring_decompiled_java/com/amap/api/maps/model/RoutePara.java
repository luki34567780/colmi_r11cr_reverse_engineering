package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class RoutePara {
    private java.lang.String endName;
    private com.amap.api.maps.model.LatLng endPoint;
    private java.lang.String startName;
    private com.amap.api.maps.model.LatLng startPoint;
    private int drivingRouteStyle = 0;
    private int transitRouteStyle = 0;

    public int getDrivingRouteStyle() {
        return this.drivingRouteStyle;
    }

    public void setDrivingRouteStyle(int i) {
        if (i < 0 || i >= 9) {
            return;
        }
        this.drivingRouteStyle = i;
    }

    public int getTransitRouteStyle() {
        return this.transitRouteStyle;
    }

    public void setTransitRouteStyle(int i) {
        if (i < 0 || i >= 6) {
            return;
        }
        this.transitRouteStyle = i;
    }

    public com.amap.api.maps.model.LatLng getStartPoint() {
        return this.startPoint;
    }

    public void setStartPoint(com.amap.api.maps.model.LatLng latLng) {
        this.startPoint = latLng;
    }

    public com.amap.api.maps.model.LatLng getEndPoint() {
        return this.endPoint;
    }

    public void setEndPoint(com.amap.api.maps.model.LatLng latLng) {
        this.endPoint = latLng;
    }

    public java.lang.String getEndName() {
        return this.endName;
    }

    public void setEndName(java.lang.String str) {
        this.endName = str;
    }

    public java.lang.String getStartName() {
        return this.startName;
    }

    public void setStartName(java.lang.String str) {
        this.startName = str;
    }
}
