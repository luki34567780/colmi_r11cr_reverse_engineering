package com.amap.api.fence;

/* loaded from: classes.dex */
public class PoiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.fence.PoiItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.fence.PoiItem>() { // from class: com.amap.api.fence.PoiItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.fence.PoiItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.fence.PoiItem[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.fence.PoiItem a(android.os.Parcel parcel) {
            return new com.amap.api.fence.PoiItem(parcel);
        }

        private static com.amap.api.fence.PoiItem[] a(int i) {
            return new com.amap.api.fence.PoiItem[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private double f;
    private double g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;
    private java.lang.String k;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getLatitude() {
        return this.f;
    }

    public void setLatitude(double d) {
        this.f = d;
    }

    public double getLongitude() {
        return this.g;
    }

    public void setLongitude(double d) {
        this.g = d;
    }

    public java.lang.String getPoiId() {
        return this.b;
    }

    public void setPoiId(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getPoiType() {
        return this.c;
    }

    public void setPoiType(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String getTypeCode() {
        return this.d;
    }

    public void setTypeCode(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getAddress() {
        return this.e;
    }

    public void setAddress(java.lang.String str) {
        this.e = str;
    }

    public java.lang.String getTel() {
        return this.h;
    }

    public void setTel(java.lang.String str) {
        this.h = str;
    }

    public java.lang.String getProvince() {
        return this.i;
    }

    public void setProvince(java.lang.String str) {
        this.i = str;
    }

    public java.lang.String getCity() {
        return this.j;
    }

    public void setCity(java.lang.String str) {
        this.j = str;
    }

    public java.lang.String getAdname() {
        return this.k;
    }

    public java.lang.String getPoiName() {
        return this.a;
    }

    public void setPoiName(java.lang.String str) {
        this.a = str;
    }

    public void setAdname(java.lang.String str) {
        this.k = str;
    }

    public static android.os.Parcelable.Creator<com.amap.api.fence.PoiItem> getCreator() {
        return CREATOR;
    }

    public PoiItem() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
    }

    protected PoiItem(android.os.Parcel parcel) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readDouble();
        this.g = parcel.readDouble();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
    }
}
