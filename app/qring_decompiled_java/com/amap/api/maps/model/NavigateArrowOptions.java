package com.amap.api.maps.model;

/* loaded from: classes.dex */
public final class NavigateArrowOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {
    public static final com.amap.api.maps.model.NavigateArrowOptionsCreator CREATOR = new com.amap.api.maps.model.NavigateArrowOptionsCreator();
    java.lang.String a;
    private float width = 10.0f;
    private int topColor = android.graphics.Color.argb(221, 87, 235, 204);
    private int sideColor = android.graphics.Color.argb(170, 0, 172, 146);
    private float zIndex = 0.0f;
    private boolean isVisible = true;
    private boolean is3DModel = false;
    private int arrowLineInnerResId = 111;
    private int arrowLineOuterResId = com.autonavi.amap.mapcore.AMapEngineUtils.ARROW_LINE_OUTER_TEXTURE_ID;
    private int arrowLineShadowResId = com.autonavi.amap.mapcore.AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID;
    private final java.util.List<com.amap.api.maps.model.LatLng> points = new java.util.ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NavigateArrowOptions() {
        this.type = "NavigateArrowOptions";
    }

    public final com.amap.api.maps.model.NavigateArrowOptions add(com.amap.api.maps.model.LatLng latLng) {
        this.points.add(latLng);
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions add(com.amap.api.maps.model.LatLng... latLngArr) {
        this.points.addAll(java.util.Arrays.asList(latLngArr));
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions addAll(java.lang.Iterable<com.amap.api.maps.model.LatLng> iterable) {
        java.util.Iterator<com.amap.api.maps.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.points.add(it.next());
        }
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions width(float f) {
        this.width = f;
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions topColor(int i) {
        this.topColor = i;
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions sideColor(int i) {
        this.sideColor = i;
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public final com.amap.api.maps.model.NavigateArrowOptions set3DModel(boolean z) {
        this.is3DModel = z;
        return this;
    }

    public final java.util.List<com.amap.api.maps.model.LatLng> getPoints() {
        return this.points;
    }

    public final float getWidth() {
        return this.width;
    }

    public final int getTopColor() {
        return this.topColor;
    }

    public final int getSideColor() {
        return this.sideColor;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final boolean is3DModel() {
        return this.is3DModel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedList(this.points);
        parcel.writeFloat(this.width);
        parcel.writeInt(this.topColor);
        parcel.writeInt(this.sideColor);
        parcel.writeFloat(this.zIndex);
        parcel.writeByte(this.isVisible ? (byte) 1 : (byte) 0);
        parcel.writeString(this.a);
        parcel.writeByte(this.is3DModel ? (byte) 1 : (byte) 0);
    }

    public final void setPoints(java.util.List<com.amap.api.maps.model.LatLng> list) {
        java.util.List<com.amap.api.maps.model.LatLng> list2;
        if (list == null || (list2 = this.points) == list) {
            return;
        }
        try {
            list2.clear();
            this.points.addAll(list);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.amap.api.maps.model.NavigateArrowOptions m192clone() {
        try {
            super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            e.printStackTrace();
        }
        com.amap.api.maps.model.NavigateArrowOptions navigateArrowOptions = new com.amap.api.maps.model.NavigateArrowOptions();
        navigateArrowOptions.points.addAll(this.points);
        navigateArrowOptions.width = this.width;
        navigateArrowOptions.topColor = this.topColor;
        navigateArrowOptions.sideColor = this.sideColor;
        navigateArrowOptions.zIndex = this.zIndex;
        navigateArrowOptions.isVisible = this.isVisible;
        navigateArrowOptions.is3DModel = this.is3DModel;
        navigateArrowOptions.a = this.a;
        navigateArrowOptions.arrowLineInnerResId = this.arrowLineInnerResId;
        navigateArrowOptions.arrowLineOuterResId = this.arrowLineOuterResId;
        navigateArrowOptions.arrowLineShadowResId = this.arrowLineShadowResId;
        return navigateArrowOptions;
    }
}
