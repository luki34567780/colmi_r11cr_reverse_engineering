package com.amap.api.services.route;

/* loaded from: classes.dex */
public class ChargeStationInfo {
    private int a;
    private com.amap.api.services.core.LatLonPoint b;
    private com.amap.api.services.core.LatLonPoint c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public int getStepIndex() {
        return this.a;
    }

    public void setStepIndex(int i) {
        this.a = i;
    }

    public com.amap.api.services.core.LatLonPoint getShowPoint() {
        return this.b;
    }

    public void setShowPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public com.amap.api.services.core.LatLonPoint getProjectivePoint() {
        return this.c;
    }

    public void setProjectivePoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public java.lang.String getPoiId() {
        return this.d;
    }

    public void setPoiId(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getName() {
        return this.e;
    }

    public void setName(java.lang.String str) {
        this.e = str;
    }

    public java.lang.String getBrandName() {
        return this.f;
    }

    public void setBrandName(java.lang.String str) {
        this.f = str;
    }

    public int getMaxPower() {
        return this.g;
    }

    public void setMaxPower(int i) {
        this.g = i;
    }

    public int getChargePercent() {
        return this.h;
    }

    public void setChargePercent(int i) {
        this.h = i;
    }

    public int getChargeTime() {
        return this.i;
    }

    public void setChargeTime(int i) {
        this.i = i;
    }

    public int getRemainingCapacity() {
        return this.j;
    }

    public void setRemainingCapacity(int i) {
        this.j = i;
    }

    public int getVoltage() {
        return this.k;
    }

    public void setVoltage(int i) {
        this.k = i;
    }

    public int getAmperage() {
        return this.l;
    }

    public void setAmperage(int i) {
        this.l = i;
    }
}
