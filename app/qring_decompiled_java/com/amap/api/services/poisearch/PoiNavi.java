package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class PoiNavi implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.PoiNavi> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.poisearch.PoiNavi>() { // from class: com.amap.api.services.poisearch.PoiNavi.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.poisearch.PoiNavi[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.PoiNavi createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.poisearch.PoiNavi a(android.os.Parcel parcel) {
            return new com.amap.api.services.poisearch.PoiNavi(parcel);
        }
    };
    private java.lang.String a;
    private com.amap.api.services.core.LatLonPoint b;
    private com.amap.api.services.core.LatLonPoint c;
    private java.lang.String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PoiNavi() {
    }

    public PoiNavi(java.lang.String str, com.amap.api.services.core.LatLonPoint latLonPoint, com.amap.api.services.core.LatLonPoint latLonPoint2, java.lang.String str2) {
        this.a = str;
        this.b = latLonPoint;
        this.c = latLonPoint2;
        this.d = str2;
    }

    public java.lang.String getNaviPoiID() {
        return this.a;
    }

    public void setNaviPoiID(java.lang.String str) {
        this.a = str;
    }

    public com.amap.api.services.core.LatLonPoint getEnter() {
        return this.b;
    }

    public void setEnter(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public com.amap.api.services.core.LatLonPoint getExit() {
        return this.c;
    }

    public void setExit(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public java.lang.String getGridCode() {
        return this.d;
    }

    public void setGridCode(java.lang.String str) {
        this.d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeValue(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
    }

    public PoiNavi(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.c = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
    }
}
