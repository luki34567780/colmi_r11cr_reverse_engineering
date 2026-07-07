package com.amap.api.maps.model.amap3dmodeltile;

/* loaded from: classes.dex */
public class AMap3DModelTileOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions> CREATOR = new android.os.Parcelable.Creator<com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions>() { // from class: com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions a(android.os.Parcel parcel) {
            com.amap.api.maps.model.TileProvider tileProvider = (com.amap.api.maps.model.TileProvider) parcel.readValue(com.amap.api.maps.model.TileProvider.class.getClassLoader());
            java.util.ArrayList readArrayList = parcel.readArrayList(com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor.class.getClassLoader());
            java.util.ArrayList readArrayList2 = parcel.readArrayList(com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions.class.getClassLoader());
            com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions aMap3DModelTileOverlayOptions = new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions();
            if (tileProvider != null) {
                aMap3DModelTileOverlayOptions.setTileProvider(tileProvider);
            }
            boolean[] zArr = new boolean[1];
            parcel.readBooleanArray(zArr);
            aMap3DModelTileOverlayOptions.setVisible(zArr[0]);
            aMap3DModelTileOverlayOptions.setZIndex(parcel.readFloat());
            aMap3DModelTileOverlayOptions.setCustomBuildingColors(readArrayList);
            aMap3DModelTileOverlayOptions.setCustomBuildingMaterialOptions(readArrayList2);
            return aMap3DModelTileOverlayOptions;
        }

        private static com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions[] a(int i) {
            return new com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions[i];
        }
    };
    private com.amap.api.maps.model.TileProvider tileProvider;
    private com.autonavi.base.ae.gmap.bean.TileProviderInner tileProviderInner;
    private float zIndex = 0.0f;
    private boolean visible = true;
    private java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> customBuildingColors = new java.util.ArrayList();
    private java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> customBuildingMaterialOptions = new java.util.ArrayList();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AMap3DModelTileOverlayOptions() {
        this.type = "AMap3DModelTileOverlayOptions";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeValue(this.tileProviderInner);
        parcel.writeBooleanArray(new boolean[]{this.visible});
        parcel.writeFloat(this.zIndex);
        parcel.writeList(this.customBuildingColors);
        parcel.writeList(this.customBuildingMaterialOptions);
    }

    public void setTileProvider(com.amap.api.maps.model.TileProvider tileProvider) {
        this.tileProvider = tileProvider;
        this.tileProviderInner = new com.autonavi.base.ae.gmap.bean.TileProviderInner(tileProvider);
    }

    public com.autonavi.base.ae.gmap.bean.TileProviderInner getTileProviderInner() {
        return this.tileProviderInner;
    }

    public void setCustomBuildingColors(java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> list) {
        this.customBuildingColors = list;
    }

    public java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingColor> getCustomBuildingColors() {
        return this.customBuildingColors;
    }

    public void setCustomBuildingMaterialOptions(java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> list) {
        this.customBuildingMaterialOptions = list;
    }

    public java.util.List<com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildingMaterialOptions> getCustomBuildingMaterialOptions() {
        return this.customBuildingMaterialOptions;
    }

    public void setZIndex(float f) {
        this.zIndex = f;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }

    public boolean visible() {
        return this.visible;
    }
}
