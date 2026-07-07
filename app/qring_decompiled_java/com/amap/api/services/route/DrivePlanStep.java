package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DrivePlanStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePlanStep> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DrivePlanStep>() { // from class: com.amap.api.services.route.DrivePlanStep.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.DrivePlanStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DrivePlanStep createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.DrivePlanStep a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DrivePlanStep(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private float c;
    private boolean d;
    private java.util.List<com.amap.api.services.core.LatLonPoint> e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getRoad() {
        return this.a;
    }

    public void setAdCode(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getAdCode() {
        return this.b;
    }

    public void setRoad(java.lang.String str) {
        this.a = str;
    }

    public float getDistance() {
        return this.c;
    }

    public void setDistance(float f) {
        this.c = f;
    }

    public boolean getToll() {
        return this.d;
    }

    public void setToll(boolean z) {
        this.d = z;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.e;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.e = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeFloat(this.c);
        parcel.writeTypedList(this.e);
    }

    public DrivePlanStep(android.os.Parcel parcel) {
        this.e = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readFloat();
        this.d = parcel.readInt() == 1;
        this.c = parcel.readFloat();
        this.e = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
    }

    public DrivePlanStep() {
        this.e = new java.util.ArrayList();
    }
}
