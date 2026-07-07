package com.amap.api.services.route;

/* loaded from: classes.dex */
public class DriveRouteResultV2 extends com.amap.api.services.route.RouteResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.DriveRouteResultV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.DriveRouteResultV2>() { // from class: com.amap.api.services.route.DriveRouteResultV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DriveRouteResultV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.DriveRouteResultV2[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.DriveRouteResultV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.DriveRouteResultV2(parcel);
        }

        private static com.amap.api.services.route.DriveRouteResultV2[] a(int i) {
            return new com.amap.api.services.route.DriveRouteResultV2[i];
        }
    };
    private float a;
    private java.util.List<com.amap.api.services.route.DrivePathV2> b;
    private com.amap.api.services.route.RouteSearchV2.DriveRouteQuery c;

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

    public java.util.List<com.amap.api.services.route.DrivePathV2> getPaths() {
        return this.b;
    }

    public void setPaths(java.util.List<com.amap.api.services.route.DrivePathV2> list) {
        this.b = list;
    }

    public com.amap.api.services.route.RouteSearchV2.DriveRouteQuery getDriveQuery() {
        return this.c;
    }

    public void setDriveQuery(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery driveRouteQuery) {
        this.c = driveRouteQuery;
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public DriveRouteResultV2(android.os.Parcel parcel) {
        super(parcel);
        this.b = new java.util.ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.createTypedArrayList(com.amap.api.services.route.DrivePathV2.CREATOR);
        this.c = (com.amap.api.services.route.RouteSearchV2.DriveRouteQuery) parcel.readParcelable(com.amap.api.services.route.RouteSearchV2.DriveRouteQuery.class.getClassLoader());
    }

    public DriveRouteResultV2() {
        this.b = new java.util.ArrayList();
    }
}
