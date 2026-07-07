package com.amap.api.services.route;

/* loaded from: classes.dex */
public class TaxiItemV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TaxiItemV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.TaxiItemV2>() { // from class: com.amap.api.services.route.TaxiItemV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TaxiItemV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TaxiItemV2[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.TaxiItemV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.TaxiItemV2(parcel);
        }

        private static com.amap.api.services.route.TaxiItemV2[] a(int i) {
            return new com.amap.api.services.route.TaxiItemV2[i];
        }
    };
    private com.amap.api.services.core.LatLonPoint a;
    private com.amap.api.services.core.LatLonPoint b;
    private float c;
    private float d;
    private java.lang.String e;
    private java.lang.String f;
    private float g;
    private java.util.List<com.amap.api.services.core.LatLonPoint> h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TaxiItemV2() {
        this.h = new java.util.ArrayList();
    }

    public com.amap.api.services.core.LatLonPoint getOrigin() {
        return this.a;
    }

    public com.amap.api.services.core.LatLonPoint getDestination() {
        return this.b;
    }

    public float getDistance() {
        return this.c;
    }

    public float getDuration() {
        return this.d;
    }

    public java.lang.String getmSname() {
        return this.e;
    }

    public java.lang.String getmTname() {
        return this.f;
    }

    public void setOrigin(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.a = latLonPoint;
    }

    public void setDestination(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setDistance(float f) {
        this.c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setSname(java.lang.String str) {
        this.e = str;
    }

    public void setTname(java.lang.String str) {
        this.f = str;
    }

    public float getPrice() {
        return this.g;
    }

    public void setPrice(float f) {
        this.g = f;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.h;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.h = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeFloat(this.g);
        parcel.writeTypedList(this.h);
    }

    protected TaxiItemV2(android.os.Parcel parcel) {
        this.h = new java.util.ArrayList();
        this.a = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.b = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readFloat();
        this.h = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
    }
}
