package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class GLTFOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {
    public static final com.amap.api.maps.model.GLTFOverlayOptionsCreator CREATOR = new com.amap.api.maps.model.GLTFOverlayOptionsCreator();
    private int currentAnimationIndex;
    private com.amap.api.maps.model.BitmapDescriptor infoWindowView;
    private boolean isClick;
    private boolean isClickable;
    private boolean isDraggable;
    private boolean isGlbFormat;
    private double mAltitude;
    private com.amap.api.maps.model.LatLng mLatLng;
    private byte[] mModelData;
    private double mScale;
    private java.util.List<com.amap.api.maps.model.GLTFResourceIterm> mUriResources;
    private double mXDegree;
    private double mYDegree;
    private double mZDegree;
    private float maxZoom;
    private float minZoom;
    private java.lang.String title;
    private float zIndex;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GLTFOverlayOptions() {
        this.mLatLng = new com.amap.api.maps.model.LatLng(0.0d, 0.0d);
        this.mZDegree = 0.0d;
        this.mXDegree = 0.0d;
        this.mYDegree = 0.0d;
        this.mAltitude = 0.0d;
        this.mScale = 1.0d;
        this.mUriResources = new java.util.ArrayList();
        this.isClickable = false;
        this.isDraggable = false;
        this.isClick = false;
        this.currentAnimationIndex = 0;
        this.minZoom = 3.0f;
        this.maxZoom = 20.0f;
        this.isGlbFormat = false;
        this.zIndex = 0.0f;
        this.type = "GLTFOverlayOptions";
    }

    GLTFOverlayOptions(com.amap.api.maps.model.LatLng latLng, double d, double d2, java.lang.String str, java.util.List<com.amap.api.maps.model.GLTFResourceIterm> list) {
        this.mLatLng = new com.amap.api.maps.model.LatLng(0.0d, 0.0d);
        this.mZDegree = 0.0d;
        this.mXDegree = 0.0d;
        this.mYDegree = 0.0d;
        this.mAltitude = 0.0d;
        this.mScale = 1.0d;
        this.mUriResources = new java.util.ArrayList();
        this.isClickable = false;
        this.isDraggable = false;
        this.isClick = false;
        this.currentAnimationIndex = 0;
        this.minZoom = 3.0f;
        this.maxZoom = 20.0f;
        this.isGlbFormat = false;
        this.zIndex = 0.0f;
        this.mLatLng = latLng;
        this.mAltitude = d;
        this.mScale = d2;
        if (str != null) {
            this.mModelData = str.getBytes();
        } else {
            this.mModelData = "".getBytes();
        }
        this.mUriResources = list;
    }

    public com.amap.api.maps.model.GLTFOverlayOptions latLng(com.amap.api.maps.model.LatLng latLng) {
        this.mLatLng = latLng;
        return this;
    }

    public com.amap.api.maps.model.GLTFOverlayOptions rotationDegree(double d, double d2, double d3) {
        this.mXDegree = d;
        this.mYDegree = d2;
        this.mZDegree = d3;
        return this;
    }

    public com.amap.api.maps.model.GLTFOverlayOptions altitude(double d) {
        this.mAltitude = d;
        return this;
    }

    public com.amap.api.maps.model.GLTFOverlayOptions scale(double d) {
        this.mScale = d;
        return this;
    }

    public com.amap.api.maps.model.GLTFOverlayOptions modelData(byte[] bArr) {
        if (bArr != null) {
            this.mModelData = bArr;
        }
        return this;
    }

    public void glbFormat(boolean z) {
        this.isGlbFormat = z;
    }

    public boolean isGlbFormat() {
        return this.isGlbFormat;
    }

    public com.amap.api.maps.model.GLTFOverlayOptions uriResources(java.util.List<com.amap.api.maps.model.GLTFResourceIterm> list) {
        this.mUriResources = list;
        return this;
    }

    public com.amap.api.maps.model.LatLng getLatLng() {
        return this.mLatLng;
    }

    public double getZDegree() {
        return this.mZDegree;
    }

    public double getXDegree() {
        return this.mXDegree;
    }

    public double getYDegree() {
        return this.mYDegree;
    }

    public double getAltitude() {
        return this.mAltitude;
    }

    public double getScale() {
        return this.mScale;
    }

    public byte[] getModelData() {
        return this.mModelData;
    }

    public java.util.List<com.amap.api.maps.model.GLTFResourceIterm> getUriResources() {
        return this.mUriResources;
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
    }

    public boolean isClickable() {
        return this.isClickable;
    }

    public void setDraggable(boolean z) {
        this.isDraggable = z;
    }

    public boolean isDraggable() {
        return this.isDraggable;
    }

    public void infoWindowView(com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.infoWindowView = bitmapDescriptor;
    }

    public com.amap.api.maps.model.BitmapDescriptor getInfoWindowView() {
        return this.infoWindowView;
    }

    public void tapClick() {
        this.isClick = !this.isClick;
    }

    public boolean isInfoWindowShow() {
        return this.isClick;
    }

    public void setCurrentAnimationIndex(int i) {
        this.currentAnimationIndex = i;
    }

    public int getCurrentAnimationIndex() {
        return this.currentAnimationIndex;
    }

    public void setZoomRange(float f, float f2) {
        this.minZoom = f;
        this.maxZoom = f2;
    }

    public float getMinZoom() {
        return this.minZoom;
    }

    public float getMaxZoom() {
        return this.maxZoom;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public void setZIndex(float f) {
        this.zIndex = f;
    }

    protected GLTFOverlayOptions(android.os.Parcel parcel) {
        this.mLatLng = new com.amap.api.maps.model.LatLng(0.0d, 0.0d);
        this.mZDegree = 0.0d;
        this.mXDegree = 0.0d;
        this.mYDegree = 0.0d;
        this.mAltitude = 0.0d;
        this.mScale = 1.0d;
        this.mUriResources = new java.util.ArrayList();
        this.isClickable = false;
        this.isDraggable = false;
        this.isClick = false;
        this.currentAnimationIndex = 0;
        this.minZoom = 3.0f;
        this.maxZoom = 20.0f;
        this.isGlbFormat = false;
        this.zIndex = 0.0f;
        this.mLatLng = (com.amap.api.maps.model.LatLng) parcel.readParcelable(com.amap.api.maps.model.LatLng.class.getClassLoader());
        this.mZDegree = parcel.readDouble();
        this.mXDegree = parcel.readDouble();
        this.mYDegree = parcel.readDouble();
        this.mAltitude = parcel.readDouble();
        this.mScale = parcel.readDouble();
        parcel.readByteArray(this.mModelData);
        this.mUriResources = parcel.readArrayList(com.amap.api.maps.model.GLTFResourceIterm.class.getClassLoader());
        boolean[] zArr = new boolean[3];
        parcel.readBooleanArray(zArr);
        this.isClickable = zArr[0];
        this.isDraggable = zArr[1];
        this.isGlbFormat = zArr[2];
        this.infoWindowView = (com.amap.api.maps.model.BitmapDescriptor) parcel.readParcelable(com.amap.api.maps.model.BitmapDescriptor.class.getClassLoader());
        this.title = parcel.readString();
        this.currentAnimationIndex = parcel.readInt();
        this.minZoom = parcel.readFloat();
        this.maxZoom = parcel.readFloat();
        this.zIndex = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.mLatLng, i);
        parcel.writeDouble(this.mZDegree);
        parcel.writeDouble(this.mXDegree);
        parcel.writeDouble(this.mYDegree);
        parcel.writeDouble(this.mAltitude);
        parcel.writeDouble(this.mScale);
        parcel.writeByteArray(this.mModelData);
        parcel.writeList(this.mUriResources);
        parcel.writeBooleanArray(new boolean[]{this.isClickable, this.isDraggable, this.isGlbFormat});
        com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor = this.infoWindowView;
        if (bitmapDescriptor != null) {
            parcel.writeParcelable(bitmapDescriptor, i);
        }
        java.lang.String str = this.title;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.currentAnimationIndex);
        parcel.writeFloat(this.minZoom);
        parcel.writeFloat(this.maxZoom);
        parcel.writeFloat(this.zIndex);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.amap.api.maps.model.GLTFOverlayOptions m187clone() {
        try {
            super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            e.printStackTrace();
        }
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = new com.amap.api.maps.model.GLTFOverlayOptions();
        gLTFOverlayOptions.mLatLng = this.mLatLng.m189clone();
        gLTFOverlayOptions.mZDegree = this.mZDegree;
        gLTFOverlayOptions.mXDegree = this.mXDegree;
        gLTFOverlayOptions.mYDegree = this.mYDegree;
        gLTFOverlayOptions.mAltitude = this.mAltitude;
        gLTFOverlayOptions.mScale = this.mScale;
        gLTFOverlayOptions.mModelData = this.mModelData;
        gLTFOverlayOptions.mUriResources = this.mUriResources;
        gLTFOverlayOptions.isClickable = this.isClickable;
        gLTFOverlayOptions.isDraggable = this.isDraggable;
        com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor = this.infoWindowView;
        if (bitmapDescriptor != null) {
            gLTFOverlayOptions.infoWindowView = bitmapDescriptor.m185clone();
        }
        java.lang.String str = this.title;
        if (str != null) {
            gLTFOverlayOptions.title = str;
        }
        gLTFOverlayOptions.currentAnimationIndex = this.currentAnimationIndex;
        gLTFOverlayOptions.minZoom = this.minZoom;
        gLTFOverlayOptions.maxZoom = this.maxZoom;
        gLTFOverlayOptions.isGlbFormat = this.isGlbFormat;
        gLTFOverlayOptions.zIndex = this.zIndex;
        return gLTFOverlayOptions;
    }
}
