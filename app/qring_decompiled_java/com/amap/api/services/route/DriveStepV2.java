package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DriveStepV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DriveStepV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DriveStepV2>() { // from class: com.amap.api.services.route.DriveStepV2.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.DriveStepV2[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DriveStepV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.DriveStepV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DriveStepV2(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.util.List<com.amap.api.services.core.LatLonPoint> d;
    private java.util.List<com.amap.api.services.route.RouteSearchCity> e;
    private java.util.List<com.amap.api.services.route.TMC> f;
    private int g;
    private com.amap.api.services.route.Cost h;
    private com.amap.api.services.route.Navi i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.amap.api.services.route.Navi getNavi() {
        return this.i;
    }

    public void setNavi(com.amap.api.services.route.Navi navi) {
        this.i = navi;
    }

    public com.amap.api.services.route.Cost getCostDetail() {
        return this.h;
    }

    public void setCostDetail(com.amap.api.services.route.Cost cost) {
        this.h = cost;
    }

    public int getStepDistance() {
        return this.g;
    }

    public void setStepDistance(int i) {
        this.g = i;
    }

    public java.lang.String getInstruction() {
        return this.a;
    }

    public void setInstruction(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getOrientation() {
        return this.b;
    }

    public void setOrientation(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getRoad() {
        return this.c;
    }

    public void setRoad(java.lang.String str) {
        this.c = str;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.d;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.d = list;
    }

    public java.util.List<com.amap.api.services.route.RouteSearchCity> getRouteSearchCityList() {
        return this.e;
    }

    public void setRouteSearchCityList(java.util.List<com.amap.api.services.route.RouteSearchCity> list) {
        this.e = list;
    }

    public java.util.List<com.amap.api.services.route.TMC> getTMCs() {
        return this.f;
    }

    public void setTMCs(java.util.List<com.amap.api.services.route.TMC> list) {
        this.f = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeTypedList(this.f);
    }

    public DriveStepV2(android.os.Parcel parcel) {
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = -1;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
        this.e = parcel.createTypedArrayList(com.amap.api.services.route.RouteSearchCity.CREATOR);
        this.f = parcel.createTypedArrayList(com.amap.api.services.route.TMC.CREATOR);
    }

    public DriveStepV2() {
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = -1;
    }
}
