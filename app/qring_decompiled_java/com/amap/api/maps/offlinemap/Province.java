package com.amap.api.maps.offlinemap;

/* loaded from: classes.dex */
public class Province implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.Province> CREATOR = new android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.Province>() { // from class: com.amap.api.maps.offlinemap.Province.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.offlinemap.Province createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.offlinemap.Province[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.maps.offlinemap.Province a(android.os.Parcel parcel) {
            return new com.amap.api.maps.offlinemap.Province(parcel);
        }

        private static com.amap.api.maps.offlinemap.Province[] a(int i) {
            return new com.amap.api.maps.offlinemap.Province[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Province() {
        this.a = "";
        this.d = "";
    }

    public java.lang.String getProvinceName() {
        return this.a;
    }

    public java.lang.String getJianpin() {
        return this.b;
    }

    public java.lang.String getPinyin() {
        return this.c;
    }

    public void setProvinceName(java.lang.String str) {
        this.a = str;
    }

    public void setJianpin(java.lang.String str) {
        this.b = str;
    }

    public void setPinyin(java.lang.String str) {
        this.c = str;
    }

    public void setProvinceCode(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getProvinceCode() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public Province(android.os.Parcel parcel) {
        this.a = "";
        this.d = "";
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
