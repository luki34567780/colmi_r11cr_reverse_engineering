package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RideStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RideStep> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RideStep>() { // from class: com.amap.api.services.route.RideStep.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RideStep createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RideStep[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.RideStep a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.RideStep(parcel);
        }

        private static com.amap.api.services.route.RideStep[] a(int i) {
            return new com.amap.api.services.route.RideStep[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private float d;
    private float e;
    private java.util.List<com.amap.api.services.core.LatLonPoint> f;
    private java.lang.String g;
    private java.lang.String h;
    private int i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RideStep() {
        this.f = new java.util.ArrayList();
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

    public float getDuration() {
        return this.e;
    }

    public void setDuration(float f) {
        this.e = f;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.f;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.f = list;
    }

    public java.lang.String getAction() {
        return this.g;
    }

    public void setAction(java.lang.String str) {
        this.g = str;
    }

    public java.lang.String getAssistantAction() {
        return this.h;
    }

    public void setAssistantAction(java.lang.String str) {
        this.h = str;
    }

    public int getRoadType() {
        return this.i;
    }

    public void setRoadType(int i) {
        this.i = i;
    }

    protected RideStep(android.os.Parcel parcel) {
        this.f = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeTypedList(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
