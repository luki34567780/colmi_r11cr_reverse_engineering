package com.amap.api.services.route;

/* loaded from: classes.dex */
public class TruckStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TruckStep> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.TruckStep>() { // from class: com.amap.api.services.route.TruckStep.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TruckStep createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TruckStep[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.TruckStep a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.TruckStep(parcel);
        }

        private static com.amap.api.services.route.TruckStep[] a(int i) {
            return new com.amap.api.services.route.TruckStep[i];
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

    public TruckStep() {
    }

    protected TruckStep(android.os.Parcel parcel) {
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

    public void setInstruction(java.lang.String str) {
        this.a = str;
    }

    public void setOrientation(java.lang.String str) {
        this.b = str;
    }

    public void setRoad(java.lang.String str) {
        this.c = str;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    public void setDistance(float f) {
        this.e = f;
    }

    public void setTollDistance(float f) {
        this.f = f;
    }

    public void setTollRoad(java.lang.String str) {
        this.g = str;
    }

    public void setDuration(float f) {
        this.h = f;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.i = list;
    }

    public void setAction(java.lang.String str) {
        this.j = str;
    }

    public void setAssistantAction(java.lang.String str) {
        this.k = str;
    }

    public void setRouteSearchCityList(java.util.List<com.amap.api.services.route.RouteSearchCity> list) {
        this.l = list;
    }

    public void setTMCs(java.util.List<com.amap.api.services.route.TMC> list) {
        this.m = list;
    }

    public java.lang.String getInstruction() {
        return this.a;
    }

    public java.lang.String getOrientation() {
        return this.b;
    }

    public java.lang.String getRoad() {
        return this.c;
    }

    public float getTolls() {
        return this.d;
    }

    public float getDistance() {
        return this.e;
    }

    public float getTollDistance() {
        return this.f;
    }

    public java.lang.String getTollRoad() {
        return this.g;
    }

    public float getDuration() {
        return this.h;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.i;
    }

    public java.lang.String getAction() {
        return this.j;
    }

    public java.lang.String getAssistantAction() {
        return this.k;
    }

    public java.util.List<com.amap.api.services.route.RouteSearchCity> getRouteSearchCityList() {
        return this.l;
    }

    public java.util.List<com.amap.api.services.route.TMC> getTMCs() {
        return this.m;
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
}
