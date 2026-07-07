package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class SubPoiItemV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.SubPoiItemV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.poisearch.SubPoiItemV2>() { // from class: com.amap.api.services.poisearch.SubPoiItemV2.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.poisearch.SubPoiItemV2[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.SubPoiItemV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.poisearch.SubPoiItemV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.poisearch.SubPoiItemV2(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private com.amap.api.services.core.LatLonPoint c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SubPoiItemV2(java.lang.String str, com.amap.api.services.core.LatLonPoint latLonPoint, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.c = latLonPoint;
        this.b = str2;
        this.d = str3;
    }

    public SubPoiItemV2(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }

    public java.lang.String getPoiId() {
        return this.a;
    }

    public void setPoiId(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getTitle() {
        return this.b;
    }

    public void setTitle(java.lang.String str) {
        this.b = str;
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public void setLatLonPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public java.lang.String getSnippet() {
        return this.d;
    }

    public void setSnippet(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getSubTypeDes() {
        return this.e;
    }

    public void setSubTypeDes(java.lang.String str) {
        this.e = str;
    }

    public java.lang.String getTypeCode() {
        return this.f;
    }

    public void setTypeCode(java.lang.String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
