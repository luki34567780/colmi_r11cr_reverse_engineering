package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class BuildingOverlayOptions extends com.amap.api.maps.model.BaseOptions {
    private int[] buildingLatlngsPoints;
    private float zindex;
    private int buildingHeight = -1;
    private int buildingHeightScale = 1;
    private int buildingTopColor = -7829368;
    private int buildingSideColor = -7829368;
    private boolean isVisible = true;
    private java.util.List<com.amap.api.maps.model.LatLng> buildingLatlngs = new java.util.ArrayList();

    public float getZIndex() {
        return this.zindex;
    }

    public void setZIndex(float f) {
        this.zindex = f;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingHeightScale(int i) {
        this.buildingHeightScale = i;
        return this;
    }

    public int getBuildingHeightScale() {
        return this.buildingHeightScale;
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingTopColor(int i) {
        this.buildingTopColor = i;
        return this;
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingSideColor(int i) {
        this.buildingSideColor = i;
        return this;
    }

    public int getBuildingSideColor() {
        return this.buildingSideColor;
    }

    public int getBuildingTopColor() {
        return this.buildingTopColor;
    }

    public com.amap.api.maps.model.BuildingOverlayOptions setBuildingHeight(int i) {
        this.buildingHeight = i;
        return this;
    }

    public int getBuildingHeight() {
        return this.buildingHeight;
    }

    public java.util.List<com.amap.api.maps.model.LatLng> getBuildingLatlngs() {
        return this.buildingLatlngs;
    }

    public synchronized int[] getPoints() {
        java.util.List<com.amap.api.maps.model.LatLng> list = this.buildingLatlngs;
        if (list == null || list.size() <= 0) {
            return new int[0];
        }
        int[] iArr = new int[this.buildingLatlngs.size() * 2];
        int i = 0;
        for (int i2 = 0; i2 < this.buildingLatlngs.size(); i2++) {
            com.amap.api.maps.model.LatLng latLng = this.buildingLatlngs.get(i2);
            if (latLng != null) {
                android.graphics.Point latLongToPixels = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(latLng.latitude, latLng.longitude, 20);
                int i3 = i + 1;
                iArr[i] = latLongToPixels.x;
                i = i3 + 1;
                iArr[i3] = latLongToPixels.y;
            }
        }
        return iArr;
    }

    public synchronized com.amap.api.maps.model.BuildingOverlayOptions setBuildingLatlngs(java.util.List<com.amap.api.maps.model.LatLng> list) {
        this.buildingLatlngs = list;
        if (list != null && list.size() > 0) {
            this.buildingLatlngsPoints = new int[list.size() * 2];
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                com.amap.api.maps.model.LatLng latLng = list.get(i);
                android.graphics.Point latLongToPixels = com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(latLng.latitude, latLng.longitude, 20);
                int i3 = i2 + 1;
                this.buildingLatlngsPoints[i2] = latLongToPixels.x;
                int i4 = i3 + 1;
                this.buildingLatlngsPoints[i3] = latLongToPixels.y;
                i++;
                i2 = i4;
            }
        }
        return this;
    }
}
