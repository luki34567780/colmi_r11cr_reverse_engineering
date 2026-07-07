package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class MultiPointItem {
    private java.lang.String customerId = null;
    private com.autonavi.amap.mapcore.IPoint iPoint;
    private com.amap.api.maps.model.LatLng latLng;
    private java.lang.Object object;
    private java.lang.String snippet;
    private java.lang.String title;

    private MultiPointItem() {
    }

    public MultiPointItem(com.amap.api.maps.model.LatLng latLng) {
        this.latLng = latLng;
    }

    public com.amap.api.maps.model.LatLng getLatLng() {
        return this.latLng;
    }

    public void setLatLng(com.amap.api.maps.model.LatLng latLng) {
        this.latLng = latLng;
    }

    public java.lang.String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(java.lang.String str) {
        this.customerId = str;
    }

    public java.lang.String getSnippet() {
        return this.snippet;
    }

    public void setSnippet(java.lang.String str) {
        this.snippet = str;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public void setTitle(java.lang.String str) {
        this.title = str;
    }

    public com.autonavi.amap.mapcore.IPoint getIPoint() {
        return this.iPoint;
    }

    public void setIPoint(com.autonavi.amap.mapcore.IPoint iPoint) {
        this.iPoint = iPoint;
    }

    public java.lang.Object getObject() {
        return this.object;
    }

    public void setObject(java.lang.Object obj) {
        this.object = obj;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.amap.api.maps.model.MultiPointItem)) {
            return false;
        }
        if (this.customerId != null) {
            com.amap.api.maps.model.MultiPointItem multiPointItem = (com.amap.api.maps.model.MultiPointItem) obj;
            if (multiPointItem.getCustomerId() != null) {
                return this.customerId.equals(multiPointItem.getCustomerId());
            }
        }
        return super.equals(obj);
    }
}
