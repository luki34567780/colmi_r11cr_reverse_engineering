package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class ColorLatLng {
    private int color;
    private java.util.List<com.amap.api.maps.model.LatLng> latLngs;

    public ColorLatLng(java.util.List<com.amap.api.maps.model.LatLng> list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.latLngs = arrayList;
        arrayList.clear();
        this.latLngs.addAll(list);
        this.color = i;
    }

    public int getColor() {
        return this.color;
    }

    public java.util.List<com.amap.api.maps.model.LatLng> getLatLngs() {
        return this.latLngs;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.amap.api.maps.model.ColorLatLng colorLatLng = (com.amap.api.maps.model.ColorLatLng) obj;
            if (this.color == colorLatLng.color && java.util.Objects.equals(this.latLngs, colorLatLng.latLngs)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.latLngs, java.lang.Integer.valueOf(this.color));
    }

    public java.lang.String toString() {
        return "ColorLatLng{latLngs=" + this.latLngs + ", color=" + this.color + '}';
    }
}
