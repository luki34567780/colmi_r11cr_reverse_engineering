package com.amap.api.services.nearby;

/* loaded from: classes.dex */
public class UploadInfo {
    private int a = 1;
    private java.lang.String b;
    private com.amap.api.services.core.LatLonPoint c;

    public void setPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
        return this.c;
    }

    public void setUserID(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getUserID() {
        return this.b;
    }

    public int getCoordType() {
        return this.a;
    }

    public void setCoordType(int i) {
        if (i != 0 && i != 1) {
            this.a = 1;
        } else {
            this.a = i;
        }
    }
}
