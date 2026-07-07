package com.amap.api.maps.offlinemap;

/* loaded from: classes.dex */
public class City implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.City> CREATOR = new android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.City>() { // from class: com.amap.api.maps.offlinemap.City.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.offlinemap.City createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.offlinemap.City[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.maps.offlinemap.City a(android.os.Parcel parcel) {
            return new com.amap.api.maps.offlinemap.City(parcel);
        }

        private static com.amap.api.maps.offlinemap.City[] a(int i) {
            return new com.amap.api.maps.offlinemap.City[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public City() {
        this.a = "";
        this.b = "";
        this.e = "";
    }

    public void setCity(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getCity() {
        return this.a;
    }

    public void setCode(java.lang.String str) {
        if (str == null || okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(str)) {
            return;
        }
        this.b = str;
    }

    public java.lang.String getCode() {
        return this.b;
    }

    public java.lang.String getJianpin() {
        return this.c;
    }

    public void setJianpin(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String getPinyin() {
        return this.d;
    }

    public void setPinyin(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getAdcode() {
        return this.e;
    }

    public void setAdcode(java.lang.String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public City(android.os.Parcel parcel) {
        this.a = "";
        this.b = "";
        this.e = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
