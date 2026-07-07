package com.amap.api.services.road;

/* loaded from: classes.dex */
public class Road implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.road.Road> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.road.Road>() { // from class: com.amap.api.services.road.Road.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.road.Road[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.road.Road createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.road.Road a(android.os.Parcel parcel) {
            return new com.amap.api.services.road.Road(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private float d;
    private java.lang.String e;
    private com.amap.api.services.core.LatLonPoint f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Road() {
    }

    public Road(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public void setId(java.lang.String str) {
        this.a = str;
    }

    public void setName(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getCityCode() {
        return this.c;
    }

    public void setCityCode(java.lang.String str) {
        this.c = str;
    }

    public float getRoadWidth() {
        return this.d;
    }

    public void setRoadWidth(float f) {
        this.d = f;
    }

    public java.lang.String getType() {
        return this.e;
    }

    public void setType(java.lang.String str) {
        this.e = str;
    }

    public com.amap.api.services.core.LatLonPoint getCenterPoint() {
        return this.f;
    }

    public void setCenterPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.f = latLonPoint;
    }

    public java.lang.String getId() {
        return this.a;
    }

    public java.lang.String getName() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeValue(this.f);
    }

    protected Road(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
    }
}
