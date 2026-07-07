package com.amap.api.services.help;

/* loaded from: classes.dex */
public class Tip implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.help.Tip> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.help.Tip>() { // from class: com.amap.api.services.help.Tip.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.help.Tip[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.help.Tip createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.help.Tip a(android.os.Parcel parcel) {
            return new com.amap.api.services.help.Tip(parcel, (byte) 0);
        }
    };
    private java.lang.String a;
    private com.amap.api.services.core.LatLonPoint b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ Tip(android.os.Parcel parcel, byte b) {
        this(parcel);
    }

    public Tip() {
        this.h = "";
    }

    public java.lang.String getPoiID() {
        return this.a;
    }

    public void setID(java.lang.String str) {
        this.a = str;
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
        return this.b;
    }

    public void setPostion(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public java.lang.String getName() {
        return this.c;
    }

    public void setName(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String getDistrict() {
        return this.d;
    }

    public void setDistrict(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getAdcode() {
        return this.e;
    }

    public void setAdcode(java.lang.String str) {
        this.e = str;
    }

    public java.lang.String getAddress() {
        return this.f;
    }

    public void setAddress(java.lang.String str) {
        this.f = str;
    }

    public void setTypeCode(java.lang.String str) {
        this.g = str;
    }

    public java.lang.String getTypeCode() {
        return this.g;
    }

    public java.lang.String toString() {
        return "name:" + this.c + " district:" + this.d + " adcode:" + this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeValue(this.b);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    private Tip(android.os.Parcel parcel) {
        this.h = "";
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.a = parcel.readString();
        this.b = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
}
