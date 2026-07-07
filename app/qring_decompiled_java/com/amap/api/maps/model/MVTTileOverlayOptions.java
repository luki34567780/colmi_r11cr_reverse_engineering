package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class MVTTileOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.model.MVTTileOverlayOptions> CREATOR = new android.os.Parcelable.Creator<com.amap.api.maps.model.MVTTileOverlayOptions>() { // from class: com.amap.api.maps.model.MVTTileOverlayOptions.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.model.MVTTileOverlayOptions createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.model.MVTTileOverlayOptions[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.maps.model.MVTTileOverlayOptions a(android.os.Parcel parcel) {
            com.amap.api.maps.model.TileProvider tileProvider = (com.amap.api.maps.model.TileProvider) parcel.readValue(com.amap.api.maps.model.TileProvider.class.getClassLoader());
            com.amap.api.maps.model.MVTTileOverlayOptions mVTTileOverlayOptions = new com.amap.api.maps.model.MVTTileOverlayOptions(parcel.readString(), parcel.readString(), parcel.readString());
            if (tileProvider != null) {
                mVTTileOverlayOptions.setTileProvider(tileProvider);
            }
            return mVTTileOverlayOptions;
        }

        private static com.amap.api.maps.model.MVTTileOverlayOptions[] a(int i) {
            return new com.amap.api.maps.model.MVTTileOverlayOptions[i];
        }
    };
    private java.lang.String layerId;
    private com.amap.api.maps.model.TileProvider tileProvider;
    private com.autonavi.base.ae.gmap.bean.TileProviderInner tileProviderInner;
    private boolean visible;
    private float zIndex;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MVTTileOverlayOptions(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.type = "MVTTileOverlayOptions";
        com.amap.api.maps.model.MVTTileProvider mVTTileProvider = new com.amap.api.maps.model.MVTTileProvider(str, str2, str3);
        this.tileProvider = mVTTileProvider;
        this.tileProviderInner = new com.autonavi.base.ae.gmap.bean.TileProviderInner(mVTTileProvider);
        this.layerId = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeValue(this.tileProviderInner);
    }

    public void setTileProvider(com.amap.api.maps.model.TileProvider tileProvider) {
        this.tileProvider = tileProvider;
    }

    public com.autonavi.base.ae.gmap.bean.TileProviderInner getTileProviderInner() {
        return this.tileProviderInner;
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

    public static class Builder {
        private java.lang.String id;
        private java.lang.String key;
        private java.lang.String url;
        private float zIndex = 0.0f;
        private boolean visible = true;

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder url(java.lang.String str) {
            this.url = str;
            return this;
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder key(java.lang.String str) {
            this.key = str;
            return this;
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder id(java.lang.String str) {
            this.id = str;
            return this;
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder zIndex(float f) {
            this.zIndex = f;
            return this;
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions.Builder visible(boolean z) {
            this.visible = z;
            return this;
        }

        public com.amap.api.maps.model.MVTTileOverlayOptions build() {
            com.amap.api.maps.model.MVTTileOverlayOptions mVTTileOverlayOptions = new com.amap.api.maps.model.MVTTileOverlayOptions(this.url, this.key, this.id);
            mVTTileOverlayOptions.setZIndex(this.zIndex);
            mVTTileOverlayOptions.setVisible(this.visible);
            return mVTTileOverlayOptions;
        }
    }
}
