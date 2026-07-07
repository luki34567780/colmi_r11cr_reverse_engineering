package com.amap.api.services.core;

/* loaded from: classes.dex */
public class PoiItemV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.PoiItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.core.PoiItem>() { // from class: com.amap.api.services.core.PoiItemV2.1
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
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private final com.amap.api.services.core.LatLonPoint e;
    private final java.lang.String f;
    private final java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private java.lang.String j;
    private java.lang.String k;
    private java.lang.String l;
    private java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> m;
    private com.amap.api.services.poisearch.Business n;
    private com.amap.api.services.poisearch.IndoorDataV2 o;
    private com.amap.api.services.poisearch.PoiNavi p;
    private java.util.List<com.amap.api.services.poisearch.Photo> q;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PoiItemV2(java.lang.String str, com.amap.api.services.core.LatLonPoint latLonPoint, java.lang.String str2, java.lang.String str3) {
        this.d = "";
        this.m = new java.util.ArrayList();
        this.q = new java.util.ArrayList();
        this.a = str;
        this.e = latLonPoint;
        this.f = str2;
        this.g = str3;
    }

    public java.lang.String getAdName() {
        return this.k;
    }

    public void setAdName(java.lang.String str) {
        this.k = str;
    }

    public java.lang.String getCityName() {
        return this.j;
    }

    public void setCityName(java.lang.String str) {
        this.j = str;
    }

    public java.lang.String getProvinceName() {
        return this.i;
    }

    public void setProvinceName(java.lang.String str) {
        this.i = str;
    }

    public java.lang.String getTypeDes() {
        return this.d;
    }

    public void setTypeDes(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getAdCode() {
        return this.b;
    }

    public void setAdCode(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getPoiId() {
        return this.a;
    }

    public java.lang.String getTitle() {
        return this.f;
    }

    public java.lang.String getSnippet() {
        return this.g;
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
        return this.e;
    }

    public java.lang.String getCityCode() {
        return this.c;
    }

    public void setCityCode(java.lang.String str) {
        this.c = str;
    }

    public void setProvinceCode(java.lang.String str) {
        this.l = str;
    }

    public java.lang.String getProvinceCode() {
        return this.l;
    }

    public java.lang.String getTypeCode() {
        return this.h;
    }

    public void setTypeCode(java.lang.String str) {
        this.h = str;
    }

    public void setSubPois(java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> list) {
        this.m = list;
    }

    public java.util.List<com.amap.api.services.poisearch.SubPoiItemV2> getSubPois() {
        return this.m;
    }

    public void setBusiness(com.amap.api.services.poisearch.Business business) {
        this.n = business;
    }

    public com.amap.api.services.poisearch.Business getBusiness() {
        return this.n;
    }

    public void setIndoorData(com.amap.api.services.poisearch.IndoorDataV2 indoorDataV2) {
        this.o = indoorDataV2;
    }

    public com.amap.api.services.poisearch.IndoorDataV2 getIndoorData() {
        return this.o;
    }

    public void setPoiNavi(com.amap.api.services.poisearch.PoiNavi poiNavi) {
        this.p = poiNavi;
    }

    public com.amap.api.services.poisearch.PoiNavi getPoiNavi() {
        return this.p;
    }

    public java.util.List<com.amap.api.services.poisearch.Photo> getPhotos() {
        return this.q;
    }

    public void setPhotos(java.util.List<com.amap.api.services.poisearch.Photo> list) {
        this.q = list;
    }

    protected PoiItemV2(android.os.Parcel parcel) {
        this.d = "";
        this.m = new java.util.ArrayList();
        this.q = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.d = parcel.readString();
        this.e = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.c = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.h = parcel.readString();
        this.m = parcel.readArrayList(com.amap.api.services.poisearch.SubPoiItemV2.class.getClassLoader());
        this.n = (com.amap.api.services.poisearch.Business) parcel.readValue(com.amap.api.services.poisearch.Business.class.getClassLoader());
        this.o = (com.amap.api.services.poisearch.IndoorDataV2) parcel.readValue(com.amap.api.services.poisearch.IndoorDataV2.class.getClassLoader());
        this.p = (com.amap.api.services.poisearch.PoiNavi) parcel.readValue(com.amap.api.services.poisearch.PoiNavi.class.getClassLoader());
        this.q = parcel.createTypedArrayList(com.amap.api.services.poisearch.Photo.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeValue(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.c);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.h);
        parcel.writeList(this.m);
        parcel.writeValue(this.n);
        parcel.writeValue(this.o);
        parcel.writeValue(this.p);
        parcel.writeTypedList(this.q);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.core.PoiItemV2 poiItemV2 = (com.amap.api.services.core.PoiItemV2) obj;
        java.lang.String str = this.a;
        if (str == null) {
            if (poiItemV2.a != null) {
                return false;
            }
        } else if (!str.equals(poiItemV2.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        java.lang.String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public java.lang.String toString() {
        return this.f;
    }
}
