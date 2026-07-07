package com.amap.api.services.route;

/* loaded from: classes.dex */
public class Path implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.Path> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.Path>() { // from class: com.amap.api.services.route.Path.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.Path[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.Path createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.Path a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.Path(parcel);
        }
    };
    private float a;
    private long b;
    private java.util.List<com.amap.api.services.core.LatLonPoint> c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.amap.api.services.core.LatLonPoint> getPolyline() {
        return this.c;
    }

    public void setPolyline(java.util.List<com.amap.api.services.core.LatLonPoint> list) {
        this.c = list;
    }

    public float getDistance() {
        return this.a;
    }

    public void setDistance(float f) {
        this.a = f;
    }

    public long getDuration() {
        return this.b;
    }

    public void setDuration(long j) {
        this.b = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeLong(this.b);
        parcel.writeTypedList(this.c);
    }

    public Path(android.os.Parcel parcel) {
        this.c = new java.util.ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.readLong();
        this.c = parcel.createTypedArrayList(com.amap.api.services.core.LatLonPoint.CREATOR);
    }

    public Path() {
        this.c = new java.util.ArrayList();
    }
}
