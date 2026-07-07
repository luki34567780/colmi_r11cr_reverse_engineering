package com.amap.api.services.route;

/* loaded from: classes.dex */
public class WalkPath extends com.amap.api.services.route.Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.WalkPath> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.WalkPath>() { // from class: com.amap.api.services.route.WalkPath.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.WalkPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.WalkPath createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.WalkPath a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.WalkPath(parcel);
        }
    };
    private java.util.List<com.amap.api.services.route.WalkStep> a;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.amap.api.services.route.WalkStep> getSteps() {
        return this.a;
    }

    public void setSteps(java.util.List<com.amap.api.services.route.WalkStep> list) {
        this.a = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
    }

    public WalkPath(android.os.Parcel parcel) {
        super(parcel);
        this.a = new java.util.ArrayList();
        this.a = parcel.createTypedArrayList(com.amap.api.services.route.WalkStep.CREATOR);
    }

    public WalkPath() {
        this.a = new java.util.ArrayList();
    }
}
