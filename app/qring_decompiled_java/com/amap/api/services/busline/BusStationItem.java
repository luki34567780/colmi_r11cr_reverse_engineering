package com.amap.api.services.busline;

/* loaded from: classes.dex */
public class BusStationItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.busline.BusStationItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.busline.BusStationItem>() { // from class: com.amap.api.services.busline.BusStationItem.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.busline.BusStationItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.busline.BusStationItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.busline.BusStationItem a(android.os.Parcel parcel) {
            return new com.amap.api.services.busline.BusStationItem(parcel, (byte) 0);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private com.amap.api.services.core.LatLonPoint c;
    private java.lang.String d;
    private java.lang.String e;
    private java.util.List<com.amap.api.services.busline.BusLineItem> f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ BusStationItem(android.os.Parcel parcel, byte b) {
        this(parcel);
    }

    public BusStationItem() {
        this.f = new java.util.ArrayList();
    }

    public java.lang.String getBusStationId() {
        return this.a;
    }

    public void setBusStationId(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getBusStationName() {
        return this.b;
    }

    public void setBusStationName(java.lang.String str) {
        this.b = str;
    }

    public com.amap.api.services.core.LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public void setLatLonPoint(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public java.lang.String getCityCode() {
        return this.d;
    }

    public void setCityCode(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String getAdCode() {
        return this.e;
    }

    public void setAdCode(java.lang.String str) {
        this.e = str;
    }

    public java.util.List<com.amap.api.services.busline.BusLineItem> getBusLineItems() {
        return this.f;
    }

    public void setBusLineItems(java.util.List<com.amap.api.services.busline.BusLineItem> list) {
        this.f = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.busline.BusStationItem busStationItem = (com.amap.api.services.busline.BusStationItem) obj;
        java.lang.String str = this.a;
        if (str == null) {
            if (busStationItem.a != null) {
                return false;
            }
        } else if (!str.equals(busStationItem.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        java.lang.String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public java.lang.String toString() {
        return "BusStationName: " + this.b + " LatLonPoint: " + this.c.toString() + " BusLines: " + a(this.f) + " CityCode: " + this.d + " AdCode: " + this.e;
    }

    private static java.lang.String a(java.util.List<com.amap.api.services.busline.BusLineItem> list) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).getBusLineName());
                if (i < list.size() - 1) {
                    stringBuffer.append(com.king.zxing.util.LogUtils.VERTICAL);
                }
            }
        }
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.a);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeList(this.f);
    }

    private BusStationItem(android.os.Parcel parcel) {
        this.f = new java.util.ArrayList();
        this.b = parcel.readString();
        this.a = parcel.readString();
        this.c = (com.amap.api.services.core.LatLonPoint) parcel.readValue(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readArrayList(com.amap.api.services.busline.BusLineItem.class.getClassLoader());
    }
}
