package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RouteResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RouteResult> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RouteResult>() { // from class: com.amap.api.services.route.RouteResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RouteResult createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RouteResult[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.RouteResult a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.RouteResult(parcel);
        }

        private static com.amap.api.services.route.RouteResult[] a(int i) {
            return new com.amap.api.services.route.RouteResult[i];
        }
    };
    private com.amap.api.services.core.LatLonPoint a;
    private com.amap.api.services.core.LatLonPoint b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.amap.api.services.core.LatLonPoint getStartPos() {
        return this.a;
    }

    public void setStartPos(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.a = latLonPoint;
    }

    public com.amap.api.services.core.LatLonPoint getTargetPos() {
        return this.b;
    }

    public void setTargetPos(com.amap.api.services.core.LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public RouteResult(android.os.Parcel parcel) {
        this.a = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
        this.b = (com.amap.api.services.core.LatLonPoint) parcel.readParcelable(com.amap.api.services.core.LatLonPoint.class.getClassLoader());
    }

    public RouteResult() {
    }
}
