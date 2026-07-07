package com.amap.api.services.geocoder;

/* loaded from: classes.dex */
public final class StreetNumber implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.geocoder.StreetNumber> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.geocoder.StreetNumber>() { // from class: com.amap.api.services.geocoder.StreetNumber.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.geocoder.StreetNumber[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.geocoder.StreetNumber createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.geocoder.StreetNumber a(android.os.Parcel parcel) {
            return new com.amap.api.services.geocoder.StreetNumber(parcel, (byte) 0);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private com.amap.api.services.core.LatLonPoint c;
    private java.lang.String d;
    private float e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ StreetNumber(android.os.Parcel parcel, byte b) {
        this(parcel);
    }

    public StreetNumber() {
    }

    public final java.lang.String getStreet() {
        return this.a;
    }

    public final void setStreet(java.lang.String str) {
        this.a = str;
    }

    public final java.lang.String getNumber() {
        return this.b;
    }

    public final void setNumber(java.lang.String str) {
        this.b = str;
    }

    public final com.amap.api.services.core.LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public final void setLatLonPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public final java.lang.String getDirection() {
        return this.d;
    }

    public final void setDirection(java.lang.String str) {
        this.d = str;
    }

    public final float getDistance() {
        return this.e;
    }

    public final void setDistance(float f) {
        this.e = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
    }

    private StreetNumber(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readFloat();
    }
}
