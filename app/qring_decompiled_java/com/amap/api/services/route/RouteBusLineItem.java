package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RouteBusLineItem extends com.amap.api.services.busline.BusLineItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteBusLineItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteBusLineItem>() { // from class: com.amap.api.services.route.RouteBusLineItem.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.RouteBusLineItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RouteBusLineItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.RouteBusLineItem a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.RouteBusLineItem(parcel);
        }
    };
    private com.amap.api.services.busline.BusStationItem a;
    private com.amap.api.services.busline.BusStationItem b;
    private java.util.List<com.amap.api.services.core.LatLonPoint> c;
    private int d;
    private java.util.List<com.amap.api.services.busline.BusStationItem> e;
    private float f;

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.amap.api.services.busline.BusStationItem getDepartureBusStation() {
        return this.a;
    }

    public void setDepartureBusStation(com.amap.api.services.busline.BusStationItem busStationItem) {
        this.a = busStationItem;
    }

    public com.amap.api.services.busline.BusStationItem getArrivalBusStation() {
        return this.b;
    }

    public void setArrivalBusStation(com.amap.api.services.busline.BusStationItem busStationItem) {
        this.b = busStationItem;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.c;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.c = list;
    }

    public int getPassStationNum() {
        return this.d;
    }

    public void setPassStationNum(int i) {
        this.d = i;
    }

    public java.util.List<com.amap.api.services.busline.BusStationItem> getPassStations() {
        return this.e;
    }

    public void setPassStations(java.util.List<com.amap.api.services.busline.BusStationItem> list) {
        this.e = list;
    }

    public float getDuration() {
        return this.f;
    }

    public void setDuration(float f) {
        this.f = f;
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeTypedList(this.c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeFloat(this.f);
    }

    public RouteBusLineItem(android.os.Parcel parcel) {
        super(parcel);
        this.c = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.a = (com.amap.api.services.busline.BusStationItem) parcel.readParcelable(com.amap.api.services.busline.BusStationItem.class.getClassLoader());
        this.b = (com.amap.api.services.busline.BusStationItem) parcel.readParcelable(com.amap.api.services.busline.BusStationItem.class.getClassLoader());
        this.c = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(com.amap.api.services.busline.BusStationItem.CREATOR);
        this.f = parcel.readFloat();
    }

    public RouteBusLineItem() {
        this.c = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        com.amap.api.services.busline.BusStationItem busStationItem = this.b;
        int hashCode2 = (hashCode + (busStationItem == null ? 0 : busStationItem.hashCode())) * 31;
        com.amap.api.services.busline.BusStationItem busStationItem2 = this.a;
        return hashCode2 + (busStationItem2 != null ? busStationItem2.hashCode() : 0);
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.route.RouteBusLineItem routeBusLineItem = (com.amap.api.services.route.RouteBusLineItem) obj;
        com.amap.api.services.busline.BusStationItem busStationItem = this.b;
        if (busStationItem == null) {
            if (routeBusLineItem.b != null) {
                return false;
            }
        } else if (!busStationItem.equals(routeBusLineItem.b)) {
            return false;
        }
        com.amap.api.services.busline.BusStationItem busStationItem2 = this.a;
        if (busStationItem2 == null) {
            if (routeBusLineItem.a != null) {
                return false;
            }
        } else if (!busStationItem2.equals(routeBusLineItem.a)) {
            return false;
        }
        return true;
    }
}
