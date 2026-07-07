package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DistanceResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DistanceResult> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DistanceResult>() { // from class: com.amap.api.services.route.DistanceResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DistanceResult createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DistanceResult[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.DistanceResult a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DistanceResult(parcel);
        }

        private static com.amap.api.services.route.DistanceResult[] a(int i) {
            return new com.amap.api.services.route.DistanceResult[i];
        }
    };
    private com.amap.api.services.route.DistanceSearch.DistanceQuery a;
    private java.util.List<com.amap.api.services.route.DistanceItem> b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DistanceResult() {
        this.b = null;
    }

    protected DistanceResult(android.os.Parcel parcel) {
        this.b = null;
        this.b = parcel.createTypedArrayList(com.amap.api.services.route.DistanceItem.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
    }

    public void setDistanceQuery(com.amap.api.services.route.DistanceSearch.DistanceQuery distanceQuery) {
        this.a = distanceQuery;
    }

    public com.amap.api.services.route.DistanceSearch.DistanceQuery getDistanceQuery() {
        return this.a;
    }

    public java.util.List<com.amap.api.services.route.DistanceItem> getDistanceResults() {
        return this.b;
    }

    public void setDistanceResults(java.util.List<com.amap.api.services.route.DistanceItem> list) {
        this.b = list;
    }
}
