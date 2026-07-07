package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DriveStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DriveStep> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DriveStep>() { // from class: com.amap.api.services.route.DriveStep.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.DriveStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DriveStep createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.DriveStep a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DriveStep(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private float d;
    private float e;
    private float f;
    private java.lang.String g;
    private float h;
    private java.util.List<com.amap.api.services.core.LatLonPoint> i;
    private java.lang.String j;
    private java.lang.String k;
    private java.util.List<com.amap.api.services.route.RouteSearchCity> l;
    private java.util.List<com.amap.api.services.route.TMC> m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public float getDistance() {
        return this.d;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public float getTolls() {
        return this.e;
    }

    public void setTolls(float f) {
        this.e = f;
    }

    public float getTollDistance() {
        return this.f;
    }

    public void setTollDistance(float f) {
        this.f = f;
    }

    public java.lang.String getTollRoad() {
        return this.g;
    }

    public void setTollRoad(java.lang.String str) {
        this.g = str;
    }

    public float getDuration() {
        return this.h;
    }

    public void setDuration(float f) {
        this.h = f;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.i;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.i = list;
    }

    public java.lang.String getAction() {
        return this.j;
    }

    public void setAction(java.lang.String str) {
        this.j = str;
    }

    public java.lang.String getAssistantAction() {
        return this.k;
    }

    public void setAssistantAction(java.lang.String str) {
        this.k = str;
    }

    public java.util.List<com.amap.api.services.route.RouteSearchCity> getRouteSearchCityList() {
        return this.l;
    }

    public void setRouteSearchCityList(java.util.List<com.amap.api.services.route.RouteSearchCity> list) {
        this.l = list;
    }

    public java.util.List<com.amap.api.services.route.TMC> getTMCs() {
        return this.m;
    }

    public void setTMCs(java.util.List<com.amap.api.services.route.TMC> list) {
        this.m = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeString(this.g);
        parcel.writeFloat(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeTypedList(this.l);
        parcel.writeTypedList(this.m);
    }

    public DriveStep(android.os.Parcel parcel) {
        this.i = new java.util.ArrayList();
        this.l = new java.util.ArrayList();
        this.m = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.g = parcel.readString();
        this.h = parcel.readFloat();
        this.i = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.createTypedArrayList(com.amap.api.services.route.RouteSearchCity.CREATOR);
        this.m = parcel.createTypedArrayList(com.amap.api.services.route.TMC.CREATOR);
    }

    public DriveStep() {
        this.i = new java.util.ArrayList();
        this.l = new java.util.ArrayList();
        this.m = new java.util.ArrayList();
    }
}
