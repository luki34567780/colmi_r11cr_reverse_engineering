package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RouteRailwayItem extends com.amap.api.services.route.Railway implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteRailwayItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteRailwayItem>() { // from class: com.amap.api.services.route.RouteRailwayItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RouteRailwayItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RouteRailwayItem[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.RouteRailwayItem a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.RouteRailwayItem(parcel);
        }

        private static com.amap.api.services.route.RouteRailwayItem[] a(int i) {
            return new com.amap.api.services.route.RouteRailwayItem[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private float c;
    private java.lang.String d;
    private com.amap.api.services.route.RailwayStationItem e;
    private com.amap.api.services.route.RailwayStationItem f;
    private java.util.List<com.amap.api.services.route.RailwayStationItem> g;
    private java.util.List<com.amap.api.services.route.Railway> h;
    private java.util.List<com.amap.api.services.route.RailwaySpace> i;

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteRailwayItem() {
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
    }

    public java.lang.String getTime() {
        return this.a;
    }

    public java.lang.String getTrip() {
        return this.b;
    }

    public float getDistance() {
        return this.c;
    }

    public java.lang.String getType() {
        return this.d;
    }

    public com.amap.api.services.route.RailwayStationItem getDeparturestop() {
        return this.e;
    }

    public com.amap.api.services.route.RailwayStationItem getArrivalstop() {
        return this.f;
    }

    public java.util.List<com.amap.api.services.route.RailwayStationItem> getViastops() {
        return this.g;
    }

    public java.util.List<com.amap.api.services.route.Railway> getAlters() {
        return this.h;
    }

    public java.util.List<com.amap.api.services.route.RailwaySpace> getSpaces() {
        return this.i;
    }

    public void setTime(java.lang.String str) {
        this.a = str;
    }

    public void setTrip(java.lang.String str) {
        this.b = str;
    }

    public void setDistance(float f) {
        this.c = f;
    }

    public void setType(java.lang.String str) {
        this.d = str;
    }

    public void setDeparturestop(com.amap.api.services.route.RailwayStationItem railwayStationItem) {
        this.e = railwayStationItem;
    }

    public void setArrivalstop(com.amap.api.services.route.RailwayStationItem railwayStationItem) {
        this.f = railwayStationItem;
    }

    public void setViastops(java.util.List<com.amap.api.services.route.RailwayStationItem> list) {
        this.g = list;
    }

    public void setAlters(java.util.List<com.amap.api.services.route.Railway> list) {
        this.h = list;
    }

    public void setSpaces(java.util.List<com.amap.api.services.route.RailwaySpace> list) {
        this.i = list;
    }

    protected RouteRailwayItem(android.os.Parcel parcel) {
        super(parcel);
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readFloat();
        this.d = parcel.readString();
        this.e = (com.amap.api.services.route.RailwayStationItem) parcel.readParcelable(com.amap.api.services.route.RailwayStationItem.class.getClassLoader());
        this.f = (com.amap.api.services.route.RailwayStationItem) parcel.readParcelable(com.amap.api.services.route.RailwayStationItem.class.getClassLoader());
        this.g = parcel.createTypedArrayList(com.amap.api.services.route.RailwayStationItem.CREATOR);
        this.h = parcel.createTypedArrayList(com.amap.api.services.route.Railway.CREATOR);
        this.i = parcel.createTypedArrayList(com.amap.api.services.route.RailwaySpace.CREATOR);
    }

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeFloat(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.i);
    }
}
