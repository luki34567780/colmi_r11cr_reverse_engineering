package com.amap.api.services.route;

/* loaded from: classes.dex */
public class WalkRouteResultV2 extends com.amap.api.services.route.RouteResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.WalkRouteResultV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.WalkRouteResultV2>() { // from class: com.amap.api.services.route.WalkRouteResultV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.WalkRouteResultV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.WalkRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.WalkRouteResultV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.WalkRouteResultV2(parcel);
        }

        private static com.amap.api.services.route.WalkRouteResultV2[] a(int i) {
            return new com.amap.api.services.route.WalkRouteResultV2[i];
        }
    };
    private java.util.List<com.amap.api.services.route.WalkPath> a;
    private com.amap.api.services.route.RouteSearchV2.WalkRouteQuery b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.amap.api.services.route.WalkPath> getPaths() {
        return this.a;
    }

    public void setPaths(java.util.List<com.amap.api.services.route.WalkPath> list) {
        this.a = list;
    }

    public com.amap.api.services.route.RouteSearchV2.WalkRouteQuery getWalkQuery() {
        return this.b;
    }

    public void setWalkQuery(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery walkRouteQuery) {
        this.b = walkRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public WalkRouteResultV2(android.os.Parcel parcel) {
        super(parcel);
        this.a = new java.util.ArrayList();
        this.a = parcel.createTypedArrayList(com.amap.api.services.route.WalkPath.CREATOR);
        this.b = (com.amap.api.services.route.RouteSearchV2.WalkRouteQuery) parcel.readParcelable(com.amap.api.services.route.RouteSearchV2.WalkRouteQuery.class.getClassLoader());
    }

    public WalkRouteResultV2() {
        this.a = new java.util.ArrayList();
    }
}
