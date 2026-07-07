package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RideRouteResultV2 extends com.amap.api.services.route.RouteResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RideRouteResultV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RideRouteResultV2>() { // from class: com.amap.api.services.route.RideRouteResultV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RideRouteResultV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RideRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.RideRouteResultV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.RideRouteResultV2(parcel);
        }

        private static com.amap.api.services.route.RideRouteResultV2[] a(int i) {
            return new com.amap.api.services.route.RideRouteResultV2[i];
        }
    };
    private java.util.List<com.amap.api.services.route.RidePath> a;
    private com.amap.api.services.route.RouteSearchV2.RideRouteQuery b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.amap.api.services.route.RidePath> getPaths() {
        return this.a;
    }

    public void setPaths(java.util.List<com.amap.api.services.route.RidePath> list) {
        this.a = list;
    }

    public com.amap.api.services.route.RouteSearchV2.RideRouteQuery getRideQuery() {
        return this.b;
    }

    public void setRideQuery(com.amap.api.services.route.RouteSearchV2.RideRouteQuery rideRouteQuery) {
        this.b = rideRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public RideRouteResultV2(android.os.Parcel parcel) {
        super(parcel);
        this.a = new java.util.ArrayList();
        this.a = parcel.createTypedArrayList(com.amap.api.services.route.RidePath.CREATOR);
        this.b = (com.amap.api.services.route.RouteSearchV2.RideRouteQuery) parcel.readParcelable(com.amap.api.services.route.RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    public RideRouteResultV2() {
        this.a = new java.util.ArrayList();
    }
}
