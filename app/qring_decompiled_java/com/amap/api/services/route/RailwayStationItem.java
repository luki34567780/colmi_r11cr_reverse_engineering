package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RailwayStationItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RailwayStationItem> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RailwayStationItem>() { // from class: com.amap.api.services.route.RailwayStationItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RailwayStationItem createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RailwayStationItem[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.RailwayStationItem a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.RailwayStationItem(parcel);
        }

        private static com.amap.api.services.route.RailwayStationItem[] a(int i) {
            return new com.amap.api.services.route.RailwayStationItem[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private com.amap.api.services.core.LatLonPoint c;
    private java.lang.String d;
    private java.lang.String e;
    private boolean f;
    private boolean g;
    private float h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RailwayStationItem() {
        this.f = false;
        this.g = false;
    }

    public java.lang.String getID() {
        return this.a;
    }

    public java.lang.String getName() {
        return this.b;
    }

    public com.amap.api.services.core.LatLonPoint getLocation() {
        return this.c;
    }

    public java.lang.String getAdcode() {
        return this.d;
    }

    public java.lang.String getTime() {
        return this.e;
    }

    public boolean isStart() {
        return this.f;
    }

    public boolean isEnd() {
        return this.g;
    }

    public float getWait() {
        return this.h;
    }

    public void setID(java.lang.String str) {
        this.a = str;
    }

    public void setName(java.lang.String str) {
        this.b = str;
    }

    public void setLocation(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setAdcode(java.lang.String str) {
        this.d = str;
    }

    public void setTime(java.lang.String str) {
        this.e = str;
    }

    public void setisStart(boolean z) {
        this.f = z;
    }

    public void setisEnd(boolean z) {
        this.g = z;
    }

    public void setWait(float f) {
        this.h = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeBooleanArray(new boolean[]{this.f, this.g});
        parcel.writeFloat(this.h);
    }

    protected RailwayStationItem(android.os.Parcel parcel) {
        this.f = false;
        this.g = false;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.f = zArr[0];
        this.g = zArr[1];
        this.h = parcel.readFloat();
    }
}
