package com.amap.api.maps.model;

/* loaded from: classes.dex */
public final class GroundOverlayOptions extends com.amap.api.maps.model.BaseOptions implements android.os.Parcelable, java.lang.Cloneable {
    private static final java.lang.String CLASSNAME = "GroundOverlayOptions";
    public static final com.amap.api.maps.model.GroundOverlayOptionsCreator CREATOR = new com.amap.api.maps.model.GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1.0f;
    private final double NF_PI;
    private final double R;
    private float anchorU;
    private float anchorV;
    private float bearing;
    private com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor;
    private float height;
    private boolean isVisible;
    private com.amap.api.maps.model.LatLng latLng;
    private com.amap.api.maps.model.LatLngBounds latlngBounds;
    private final int mVersionCode;
    private com.amap.api.maps.model.LatLng northeast;
    private com.amap.api.maps.model.LatLng southwest;
    private float transparency;
    private float width;
    private float zIndex;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    GroundOverlayOptions(int i, com.amap.api.maps.model.LatLng latLng, float f, float f2, com.amap.api.maps.model.LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.zIndex = 0.0f;
        this.isVisible = true;
        this.transparency = 0.0f;
        this.anchorU = 0.5f;
        this.anchorV = 0.5f;
        this.NF_PI = 0.01745329251994329d;
        this.R = 6371000.79d;
        this.mVersionCode = i;
        this.bitmapDescriptor = com.amap.api.maps.model.BitmapDescriptorFactory.fromBitmap(null);
        this.latLng = latLng;
        this.width = f;
        this.height = f2;
        this.latlngBounds = latLngBounds;
        this.bearing = f3;
        this.zIndex = f4;
        this.isVisible = z;
        this.transparency = f5;
        this.anchorU = f6;
        this.anchorV = f7;
        this.southwest = latLngBounds.southwest;
        this.northeast = latLngBounds.northeast;
        this.type = CLASSNAME;
    }

    public GroundOverlayOptions() {
        this.zIndex = 0.0f;
        this.isVisible = true;
        this.transparency = 0.0f;
        this.anchorU = 0.5f;
        this.anchorV = 0.5f;
        this.NF_PI = 0.01745329251994329d;
        this.R = 6371000.79d;
        this.mVersionCode = 1;
        this.type = CLASSNAME;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions image(com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.bitmapDescriptor = bitmapDescriptor;
        return this;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions anchor(float f, float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        if (this.latlngBounds != null) {
            a();
        } else if (this.latLng != null) {
            b();
        }
        return this;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions position(com.amap.api.maps.model.LatLng latLng, float f) {
        if (this.latlngBounds != null) {
            android.util.Log.w(CLASSNAME, "Position has already been set using positionFromBounds");
        }
        if (latLng == null) {
            android.util.Log.w(CLASSNAME, "Location must be specified");
        }
        if (f <= 0.0f) {
            android.util.Log.w(CLASSNAME, "Width must be non-negative");
        }
        return a(latLng, f, f);
    }

    public final com.amap.api.maps.model.GroundOverlayOptions position(com.amap.api.maps.model.LatLng latLng, float f, float f2) {
        if (this.latlngBounds != null) {
            android.util.Log.w(CLASSNAME, "Position has already been set using positionFromBounds");
        }
        if (latLng == null) {
            android.util.Log.w(CLASSNAME, "Location must be specified");
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            android.util.Log.w(CLASSNAME, "Width and Height must be non-negative");
        }
        return a(latLng, f, f2);
    }

    private com.amap.api.maps.model.GroundOverlayOptions a(com.amap.api.maps.model.LatLng latLng, float f, float f2) {
        this.latLng = latLng;
        this.width = f;
        this.height = f2;
        b();
        return this;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions positionFromBounds(com.amap.api.maps.model.LatLngBounds latLngBounds) {
        this.latlngBounds = latLngBounds;
        this.southwest = latLngBounds.southwest;
        this.northeast = latLngBounds.northeast;
        a();
        return this;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions bearing(float f) {
        this.bearing = f;
        return this;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public final com.amap.api.maps.model.GroundOverlayOptions transparency(float f) {
        if (f < 0.0f) {
            android.util.Log.w(CLASSNAME, "Transparency must be in the range [0..1]");
            f = 0.0f;
        }
        this.transparency = f;
        return this;
    }

    public final com.amap.api.maps.model.BitmapDescriptor getImage() {
        return this.bitmapDescriptor;
    }

    public final com.amap.api.maps.model.LatLng getLocation() {
        return this.latLng;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final com.amap.api.maps.model.LatLngBounds getBounds() {
        return this.latlngBounds;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    public final float getTransparency() {
        return this.transparency;
    }

    public final float getAnchorU() {
        return this.anchorU;
    }

    public final float getAnchorV() {
        return this.anchorV;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mVersionCode);
        parcel.writeParcelable(this.bitmapDescriptor, i);
        parcel.writeParcelable(this.latLng, i);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
        parcel.writeParcelable(this.latlngBounds, i);
        parcel.writeFloat(this.bearing);
        parcel.writeFloat(this.zIndex);
        parcel.writeByte(this.isVisible ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.transparency);
        parcel.writeFloat(this.anchorU);
        parcel.writeFloat(this.anchorV);
    }

    private void a() {
        if (this.southwest == null || this.northeast == null) {
            return;
        }
        com.amap.api.maps.model.LatLng latLng = new com.amap.api.maps.model.LatLng(this.southwest.latitude + ((1.0f - this.anchorV) * (this.northeast.latitude - this.southwest.latitude)), this.southwest.longitude + (this.anchorU * (this.northeast.longitude - this.southwest.longitude)));
        this.latLng = latLng;
        this.width = (float) (java.lang.Math.cos(latLng.latitude * 0.01745329251994329d) * 6371000.79d * (this.northeast.longitude - this.southwest.longitude) * 0.01745329251994329d);
        this.height = (float) ((this.northeast.latitude - this.southwest.latitude) * 6371000.79d * 0.01745329251994329d);
    }

    private void b() {
        com.amap.api.maps.model.LatLng latLng = this.latLng;
        if (latLng == null) {
            return;
        }
        double cos = this.width / ((java.lang.Math.cos(latLng.latitude * 0.01745329251994329d) * 6371000.79d) * 0.01745329251994329d);
        double d = this.height / 111194.94043265979d;
        try {
            com.amap.api.maps.model.LatLngBounds latLngBounds = new com.amap.api.maps.model.LatLngBounds(new com.amap.api.maps.model.LatLng(this.latLng.latitude - ((1.0f - this.anchorV) * d), this.latLng.longitude - (this.anchorU * cos)), new com.amap.api.maps.model.LatLng(this.latLng.latitude + (this.anchorV * d), this.latLng.longitude + ((1.0f - this.anchorU) * cos)));
            this.latlngBounds = latLngBounds;
            this.southwest = latLngBounds.southwest;
            this.northeast = this.latlngBounds.northeast;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.amap.api.maps.model.GroundOverlayOptions m188clone() {
        try {
            super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            e.printStackTrace();
        }
        com.amap.api.maps.model.GroundOverlayOptions groundOverlayOptions = new com.amap.api.maps.model.GroundOverlayOptions();
        groundOverlayOptions.bitmapDescriptor = this.bitmapDescriptor;
        groundOverlayOptions.latLng = this.latLng;
        groundOverlayOptions.width = this.width;
        groundOverlayOptions.height = this.height;
        groundOverlayOptions.latlngBounds = this.latlngBounds;
        groundOverlayOptions.bearing = this.bearing;
        groundOverlayOptions.zIndex = this.zIndex;
        groundOverlayOptions.isVisible = this.isVisible;
        groundOverlayOptions.transparency = this.transparency;
        groundOverlayOptions.anchorU = this.anchorU;
        groundOverlayOptions.anchorV = this.anchorV;
        groundOverlayOptions.southwest = this.southwest;
        groundOverlayOptions.northeast = this.northeast;
        return groundOverlayOptions;
    }
}
