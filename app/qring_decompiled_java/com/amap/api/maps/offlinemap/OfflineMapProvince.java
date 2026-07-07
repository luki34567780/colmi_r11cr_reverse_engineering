package com.amap.api.maps.offlinemap;

/* loaded from: classes.dex */
public class OfflineMapProvince extends com.amap.api.maps.offlinemap.Province {
    public static final android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.OfflineMapProvince> CREATOR = new android.os.Parcelable.Creator<com.amap.api.maps.offlinemap.OfflineMapProvince>() { // from class: com.amap.api.maps.offlinemap.OfflineMapProvince.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.offlinemap.OfflineMapProvince createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.maps.offlinemap.OfflineMapProvince[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.maps.offlinemap.OfflineMapProvince a(android.os.Parcel parcel) {
            return new com.amap.api.maps.offlinemap.OfflineMapProvince(parcel);
        }

        private static com.amap.api.maps.offlinemap.OfflineMapProvince[] a(int i) {
            return new com.amap.api.maps.offlinemap.OfflineMapProvince[i];
        }
    };
    private java.lang.String a;
    private int b;
    private long c;
    private java.lang.String d;
    private int e;
    private java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> f;

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public OfflineMapProvince() {
        this.b = 6;
        this.e = 0;
    }

    public java.lang.String getUrl() {
        return this.a;
    }

    public void setUrl(java.lang.String str) {
        this.a = str;
    }

    public int getState() {
        return this.b;
    }

    public void setState(int i) {
        this.b = i;
    }

    public long getSize() {
        return this.c;
    }

    public void setSize(long j) {
        this.c = j;
    }

    public java.lang.String getVersion() {
        return this.d;
    }

    public void setVersion(java.lang.String str) {
        this.d = str;
    }

    public int getcompleteCode() {
        return this.e;
    }

    public void setCompleteCode(int i) {
        this.e = i;
    }

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeTypedList(this.f);
    }

    public java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getCityList() {
        java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> arrayList = this.f;
        return arrayList == null ? new java.util.ArrayList<>() : arrayList;
    }

    public java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> getDownloadedCityList() {
        java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> arrayList2 = this.f;
        if (arrayList2 == null) {
            return arrayList;
        }
        java.util.Iterator<com.amap.api.maps.offlinemap.OfflineMapCity> it = arrayList2.iterator();
        while (it.hasNext()) {
            com.amap.api.maps.offlinemap.OfflineMapCity next = it.next();
            if (next.getState() != 6) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void setCityList(java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> arrayList) {
        this.f = arrayList;
    }

    public OfflineMapProvince(android.os.Parcel parcel) {
        super(parcel);
        this.b = 6;
        this.e = 0;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readLong();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.createTypedArrayList(com.amap.api.maps.offlinemap.OfflineMapCity.CREATOR);
    }
}
