package com.amap.api.services.core;

/* loaded from: classes.dex */
public class PoiItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.PoiItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.core.PoiItem>() { // from class: com.amap.api.services.core.PoiItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.core.PoiItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.core.PoiItem[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.core.PoiItem a(android.os.Parcel parcel) {
            return new com.amap.api.services.core.PoiItem(parcel);
        }

        private static com.amap.api.services.core.PoiItem[] a(int i) {
            return new com.amap.api.services.core.PoiItem[i];
        }
    };
    private java.lang.String A;
    private java.lang.String B;
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private int f;
    private final com.amap.api.services.core.LatLonPoint g;
    private final java.lang.String h;
    private final java.lang.String i;
    private com.amap.api.services.core.LatLonPoint j;
    private com.amap.api.services.core.LatLonPoint k;
    private java.lang.String l;
    private java.lang.String m;
    private java.lang.String n;
    private java.lang.String o;
    private java.lang.String p;
    private java.lang.String q;
    private java.lang.String r;
    private boolean s;
    private com.amap.api.services.poisearch.IndoorData t;
    private java.lang.String u;
    private java.lang.String v;
    private java.lang.String w;
    private java.util.List<com.amap.api.services.poisearch.SubPoiItem> x;
    private java.util.List<com.amap.api.services.poisearch.Photo> y;
    private com.amap.api.services.poisearch.PoiItemExtension z;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PoiItem(java.lang.String str, com.amap.api.services.core.LatLonPoint latLonPoint, java.lang.String str2, java.lang.String str3) {
        this.e = "";
        this.f = -1;
        this.x = new java.util.ArrayList();
        this.y = new java.util.ArrayList();
        this.a = str;
        this.g = latLonPoint;
        this.h = str2;
        this.i = str3;
    }

    public java.lang.String getBusinessArea() {
        return this.v;
    }

    public void setBusinessArea(java.lang.String str) {
        this.v = str;
    }

    public java.lang.String getAdName() {
        return this.r;
    }

    public void setAdName(java.lang.String str) {
        this.r = str;
    }

    public java.lang.String getCityName() {
        return this.q;
    }

    public void setCityName(java.lang.String str) {
        this.q = str;
    }

    public java.lang.String getProvinceName() {
        return this.p;
    }

    public void setProvinceName(java.lang.String str) {
        this.p = str;
    }

    public java.lang.String getTypeDes() {
        return this.e;
    }

    public void setTypeDes(java.lang.String str) {
        this.e = str;
    }

    public java.lang.String getTel() {
        return this.b;
    }

    public void setTel(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getAdCode() {
        return this.c;
    }

    public void setAdCode(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String getPoiId() {
        return this.a;
    }

    public int getDistance() {
        return this.f;
    }

    public void setDistance(int i) {
        this.f = i;
    }

    public java.lang.String getTitle() {
        return this.h;
    }

    public java.lang.String getSnippet() {
        return this.i;
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
        return this.g;
    }

    public java.lang.String getCityCode() {
        return this.d;
    }

    public void setCityCode(java.lang.String str) {
        this.d = str;
    }

    public com.amap.api.services.core.LatLonPoint getEnter() {
        return this.j;
    }

    public void setEnter(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.j = latLonPoint;
    }

    public com.amap.api.services.core.LatLonPoint getExit() {
        return this.k;
    }

    public void setExit(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.k = latLonPoint;
    }

    public java.lang.String getWebsite() {
        return this.l;
    }

    public void setWebsite(java.lang.String str) {
        this.l = str;
    }

    public java.lang.String getPostcode() {
        return this.m;
    }

    public void setPostcode(java.lang.String str) {
        this.m = str;
    }

    public java.lang.String getEmail() {
        return this.n;
    }

    public void setEmail(java.lang.String str) {
        this.n = str;
    }

    public java.lang.String getDirection() {
        return this.o;
    }

    public void setDirection(java.lang.String str) {
        this.o = str;
    }

    public void setIndoorMap(boolean z) {
        this.s = z;
    }

    public boolean isIndoorMap() {
        return this.s;
    }

    public void setProvinceCode(java.lang.String str) {
        this.u = str;
    }

    public java.lang.String getProvinceCode() {
        return this.u;
    }

    public void setParkingType(java.lang.String str) {
        this.w = str;
    }

    public java.lang.String getParkingType() {
        return this.w;
    }

    public void setSubPois(java.util.List<com.amap.api.services.poisearch.SubPoiItem> list) {
        this.x = list;
    }

    public java.util.List<com.amap.api.services.poisearch.SubPoiItem> getSubPois() {
        return this.x;
    }

    public com.amap.api.services.poisearch.IndoorData getIndoorData() {
        return this.t;
    }

    public void setIndoorDate(com.amap.api.services.poisearch.IndoorData indoorData) {
        this.t = indoorData;
    }

    public java.util.List<com.amap.api.services.poisearch.Photo> getPhotos() {
        return this.y;
    }

    public void setPhotos(java.util.List<com.amap.api.services.poisearch.Photo> list) {
        this.y = list;
    }

    public com.amap.api.services.poisearch.PoiItemExtension getPoiExtension() {
        return this.z;
    }

    public void setPoiExtension(com.amap.api.services.poisearch.PoiItemExtension poiItemExtension) {
        this.z = poiItemExtension;
    }

    public java.lang.String getTypeCode() {
        return this.A;
    }

    public void setTypeCode(java.lang.String str) {
        this.A = str;
    }

    public java.lang.String getShopID() {
        return this.B;
    }

    public void setShopID(java.lang.String str) {
        this.B = str;
    }

    protected PoiItem(android.os.Parcel parcel) {
        this.e = "";
        this.f = -1;
        this.x = new java.util.ArrayList();
        this.y = new java.util.ArrayList();
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.d = parcel.readString();
        this.j = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.k = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.s = zArr[0];
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readArrayList(com.amap.api.services.poisearch.SubPoiItem.class.getClassLoader());
        this.t = (com.amap.api.services.poisearch.IndoorData) parcel.readValue(com.amap.api.services.poisearch.IndoorData.class.getClassLoader());
        this.y = parcel.createTypedArrayList(com.amap.api.services.poisearch.Photo.CREATOR);
        this.z = (com.amap.api.services.poisearch.PoiItemExtension) parcel.readParcelable(com.amap.api.services.poisearch.PoiItemExtension.class.getClassLoader());
        this.A = parcel.readString();
        this.B = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeValue(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.d);
        parcel.writeValue(this.j);
        parcel.writeValue(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeBooleanArray(new boolean[]{this.s});
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeList(this.x);
        parcel.writeValue(this.t);
        parcel.writeTypedList(this.y);
        parcel.writeParcelable(this.z, i);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.core.PoiItem poiItem = (com.amap.api.services.core.PoiItem) obj;
        java.lang.String str = this.a;
        if (str == null) {
            if (poiItem.a != null) {
                return false;
            }
        } else if (!str.equals(poiItem.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        java.lang.String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public java.lang.String toString() {
        return this.h;
    }
}
