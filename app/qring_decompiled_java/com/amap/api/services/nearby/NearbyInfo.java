package com.amap.api.services.nearby;

/* loaded from: classes.dex */
public class NearbyInfo {
    private java.lang.String a;
    private com.amap.api.services.core.LatLonPoint b;
    private long c;
    private int d;
    private int e;

    public void setUserID(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getUserID() {
        return this.a;
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
        return this.b;
    }

    public void setPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setTimeStamp(long j) {
        this.c = j;
    }

    public long getTimeStamp() {
        return this.c;
    }

    public void setDistance(int i) {
        this.d = i;
    }

    public int getDistance() {
        return this.d;
    }

    public void setDrivingDistance(int i) {
        this.e = i;
    }

    public int getDrivingDistance() {
        return this.e;
    }
}
