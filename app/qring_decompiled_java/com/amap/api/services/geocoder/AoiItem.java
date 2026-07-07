package com.amap.api.services.geocoder;

/* loaded from: classes.dex */
public class AoiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.geocoder.AoiItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.geocoder.AoiItem>() { // from class: com.amap.api.services.geocoder.AoiItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.geocoder.AoiItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.geocoder.AoiItem[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.geocoder.AoiItem a(android.os.Parcel parcel) {
            return new com.amap.api.services.geocoder.AoiItem(parcel);
        }

        private static com.amap.api.services.geocoder.AoiItem[] a(int i) {
            return new com.amap.api.services.geocoder.AoiItem[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private com.amap.api.services.core.LatLonPoint d;
    private java.lang.Float e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AoiItem() {
    }

    public java.lang.String getAoiId() {
        return this.a;
    }

    public java.lang.String getAoiName() {
        return this.b;
    }

    public java.lang.String getAdCode() {
        return this.c;
    }

    public com.amap.api.services.core.LatLonPoint getAoiCenterPoint() {
        return this.d;
    }

    public java.lang.Float getAoiArea() {
        return this.e;
    }

    public void setId(java.lang.String str) {
        this.a = str;
    }

    public void setName(java.lang.String str) {
        this.b = str;
    }

    public void setAdcode(java.lang.String str) {
        this.c = str;
    }

    public void setLocation(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public void setArea(java.lang.Float f) {
        this.e = f;
    }

    public AoiItem(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.e = java.lang.Float.valueOf(parcel.readFloat());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeFloat(this.e.floatValue());
    }
}
