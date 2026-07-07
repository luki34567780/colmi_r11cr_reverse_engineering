package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DrivePathV2 extends com.amap.api.services.route.Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DrivePathV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DrivePathV2>() { // from class: com.amap.api.services.route.DrivePathV2.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.DrivePathV2[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DrivePathV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.DrivePathV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DrivePathV2(parcel);
        }
    };
    private java.lang.String a;
    private java.util.List<com.amap.api.services.route.DriveStepV2> b;
    private int c;
    private com.amap.api.services.route.Cost d;
    private com.amap.api.services.route.ElecConsumeInfo e;
    private java.util.List<com.amap.api.services.route.ChargeStationInfo> f;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.amap.api.services.route.ElecConsumeInfo getElecConsumeInfo() {
        return this.e;
    }

    public void setElecConsumeInfo(com.amap.api.services.route.ElecConsumeInfo elecConsumeInfo) {
        this.e = elecConsumeInfo;
    }

    public java.util.List<com.amap.api.services.route.ChargeStationInfo> getChargeStationInfo() {
        return this.f;
    }

    public void setChargeStationInfo(java.util.List<com.amap.api.services.route.ChargeStationInfo> list) {
        this.f = list;
    }

    public com.amap.api.services.route.Cost getCost() {
        return this.d;
    }

    public void setCost(com.amap.api.services.route.Cost cost) {
        this.d = cost;
    }

    public java.lang.String getStrategy() {
        return this.a;
    }

    public void setStrategy(java.lang.String str) {
        this.a = str;
    }

    public java.util.List<com.amap.api.services.route.DriveStepV2> getSteps() {
        return this.b;
    }

    public void setSteps(java.util.List<com.amap.api.services.route.DriveStepV2> list) {
        this.b = list;
    }

    public int getRestriction() {
        return this.c;
    }

    public void setRestriction(int i) {
        this.c = i;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.b);
    }

    public DrivePathV2(android.os.Parcel parcel) {
        super(parcel);
        this.b = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.a = parcel.readString();
        this.b = parcel.createTypedArrayList(com.amap.api.services.route.DriveStepV2.CREATOR);
    }

    public DrivePathV2() {
        this.b = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
    }
}
