package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DrivePlanPath implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePlanPath> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DrivePlanPath>() { // from class: com.amap.api.services.route.DrivePlanPath.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.DrivePlanPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DrivePlanPath createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.DrivePlanPath a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DrivePlanPath(parcel);
        }
    };
    float a;
    int b;
    private java.util.List<com.amap.api.services.route.DrivePlanStep> c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.a;
    }

    public void setDistance(float f) {
        this.a = f;
    }

    public float getTrafficLights() {
        return this.b;
    }

    public void setTrafficLights(int i) {
        this.b = i;
    }

    public java.util.List<com.amap.api.services.route.DrivePlanStep> getSteps() {
        return this.c;
    }

    public void setSteps(java.util.List<com.amap.api.services.route.DrivePlanStep> list) {
        this.c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
        parcel.writeTypedList(this.c);
    }

    public DrivePlanPath(android.os.Parcel parcel) {
        this.c = new java.util.ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
        this.c = parcel.createTypedArrayList(com.amap.api.services.route.DrivePlanStep.CREATOR);
    }

    public DrivePlanPath() {
        this.c = new java.util.ArrayList();
    }
}
