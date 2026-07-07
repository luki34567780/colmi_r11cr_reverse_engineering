package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DrivePath extends com.amap.api.services.route.Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePath> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DrivePath>() { // from class: com.amap.api.services.route.DrivePath.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.DrivePath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DrivePath createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.DrivePath a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DrivePath(parcel);
        }
    };
    private java.lang.String a;
    private float b;
    private float c;
    private int d;
    private java.util.List<com.amap.api.services.route.DriveStep> e;
    private int f;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getStrategy() {
        return this.a;
    }

    public void setStrategy(java.lang.String str) {
        this.a = str;
    }

    public float getTolls() {
        return this.b;
    }

    public void setTolls(float f) {
        this.b = f;
    }

    public float getTollDistance() {
        return this.c;
    }

    public void setTollDistance(float f) {
        this.c = f;
    }

    public int getTotalTrafficlights() {
        return this.d;
    }

    public void setTotalTrafficlights(int i) {
        this.d = i;
    }

    public java.util.List<com.amap.api.services.route.DriveStep> getSteps() {
        return this.e;
    }

    public void setSteps(java.util.List<com.amap.api.services.route.DriveStep> list) {
        this.e = list;
    }

    public int getRestriction() {
        return this.f;
    }

    public void setRestriction(int i) {
        this.f = i;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeTypedList(this.e);
        parcel.writeInt(this.d);
    }

    public DrivePath(android.os.Parcel parcel) {
        super(parcel);
        this.e = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.e = parcel.createTypedArrayList(com.amap.api.services.route.DriveStep.CREATOR);
        this.d = parcel.readInt();
    }

    public DrivePath() {
        this.e = new java.util.ArrayList();
    }
}
