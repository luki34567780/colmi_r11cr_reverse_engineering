package com.amap.api.services.route;

/* loaded from: classes.dex */
public class ElecConsumeInfo {
    private int a;
    private int b;
    private com.amap.api.services.core.LatLonPoint c;
    private java.util.List<java.lang.Integer> d = new java.util.ArrayList();

    public int getConsumeEnergy() {
        return this.a;
    }

    public void setConsumeEnergy(int i) {
        this.a = i;
    }

    public int getRunOutStepIndex() {
        return this.b;
    }

    public void setRunOutStepIndex(int i) {
        this.b = i;
    }

    public com.amap.api.services.core.LatLonPoint getRunOutPoint() {
        return this.c;
    }

    public void setRunOutPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public java.util.List<java.lang.Integer> getLeftEnergy() {
        return this.d;
    }

    public void setLeftEnergy(java.util.List<java.lang.Integer> list) {
        this.d = list;
    }
}
