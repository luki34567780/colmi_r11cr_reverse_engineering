package com.amap.api.location;

/* loaded from: classes.dex */
public class DPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.location.DPoint> CREATOR = new android.os.Parcelable.Creator<com.amap.api.location.DPoint>() { // from class: com.amap.api.location.DPoint.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.location.DPoint createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.location.DPoint[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.location.DPoint a(android.os.Parcel parcel) {
            return new com.amap.api.location.DPoint(parcel);
        }

        private static com.amap.api.location.DPoint[] a(int i) {
            return new com.amap.api.location.DPoint[i];
        }
    };
    private double a;
    private double b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DPoint() {
        this.a = 0.0d;
        this.b = 0.0d;
    }

    public DPoint(double d, double d2) {
        this.a = 0.0d;
        this.b = 0.0d;
        d2 = d2 > 180.0d ? 180.0d : d2;
        d2 = d2 < -180.0d ? -180.0d : d2;
        d = d > 90.0d ? 90.0d : d;
        d = d < -90.0d ? -90.0d : d;
        this.a = d2;
        this.b = d;
    }

    public double getLongitude() {
        return this.a;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        }
        if (d < -180.0d) {
            d = -180.0d;
        }
        this.a = d;
    }

    public double getLatitude() {
        return this.b;
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        }
        if (d < -90.0d) {
            d = -90.0d;
        }
        this.b = d;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.amap.api.location.DPoint)) {
            return false;
        }
        com.amap.api.location.DPoint dPoint = (com.amap.api.location.DPoint) obj;
        return this.b == dPoint.b && this.a == dPoint.a;
    }

    public int hashCode() {
        return java.lang.Double.valueOf((this.b + this.a) * 1000000.0d).intValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
    }

    protected DPoint(android.os.Parcel parcel) {
        this.a = 0.0d;
        this.b = 0.0d;
        this.a = parcel.readDouble();
        this.b = parcel.readDouble();
    }
}
