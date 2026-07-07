package com.amap.api.services.route;

/* loaded from: classes.dex */
public class TaxiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TaxiItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.TaxiItem>() { // from class: com.amap.api.services.route.TaxiItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TaxiItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TaxiItem[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.TaxiItem a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.TaxiItem(parcel);
        }

        private static com.amap.api.services.route.TaxiItem[] a(int i) {
            return new com.amap.api.services.route.TaxiItem[i];
        }
    };
    private com.amap.api.services.core.LatLonPoint a;
    private com.amap.api.services.core.LatLonPoint b;
    private float c;
    private float d;
    private java.lang.String e;
    private java.lang.String f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TaxiItem() {
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

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    protected TaxiItem(android.os.Parcel parcel) {
        this.a = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.b = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
