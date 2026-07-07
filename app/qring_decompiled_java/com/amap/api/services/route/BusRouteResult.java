package com.amap.api.services.route;

/* loaded from: classes.dex */
public class BusRouteResult extends com.amap.api.services.route.RouteResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.BusRouteResult> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.BusRouteResult>() { // from class: com.amap.api.services.route.BusRouteResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.BusRouteResult createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.BusRouteResult[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.BusRouteResult a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.BusRouteResult(parcel);
        }

        private static com.amap.api.services.route.BusRouteResult[] a(int i) {
            return new com.amap.api.services.route.BusRouteResult[i];
        }
    };
    private float a;
    private java.util.List<com.amap.api.services.route.BusPath> b;
    private com.amap.api.services.route.RouteSearch.BusRouteQuery c;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getTaxiCost() {
        return this.a;
    }

    public void setTaxiCost(float f) {
        this.a = f;
    }

    public java.util.List<com.amap.api.services.route.BusPath> getPaths() {
        return this.b;
    }

    public void setPaths(java.util.List<com.amap.api.services.route.BusPath> list) {
        this.b = list;
    }

    public com.amap.api.services.route.RouteSearch.BusRouteQuery getBusQuery() {
        return this.c;
    }

    public void setBusQuery(com.amap.api.services.route.RouteSearch.BusRouteQuery busRouteQuery) {
        this.c = busRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public BusRouteResult(android.os.Parcel parcel) {
        super(parcel);
        this.b = new java.util.ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.createTypedArrayList(com.amap.api.services.route.BusPath.CREATOR);
        this.c = (com.amap.api.services.route.RouteSearch.BusRouteQuery) parcel.readParcelable(com.amap.api.services.route.RouteSearch.BusRouteQuery.class.getClassLoader());
    }

    public BusRouteResult() {
        this.b = new java.util.ArrayList();
    }
}
