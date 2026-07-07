package com.amap.api.services.core;

/* loaded from: classes.dex */
public class LatLonPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.LatLonPoint> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.core.LatLonPoint>() { // from class: com.amap.api.services.core.LatLonPoint.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.core.LatLonPoint createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.core.LatLonPoint[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.core.LatLonPoint a(android.os.Parcel parcel) {
            return new com.amap.api.services.core.LatLonPoint(parcel);
        }

        private static com.amap.api.services.core.LatLonPoint[] a(int i) {
            return new com.amap.api.services.core.LatLonPoint[i];
        }
    };
    private double a;
    private double b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public double getLongitude() {
        return this.b;
    }

    public void setLongitude(double d) {
        this.b = d;
    }

    public double getLatitude() {
        return this.a;
    }

    public void setLatitude(double d) {
        this.a = d;
    }

    public com.amap.api.services.core.LatLonPoint copy() {
        return new com.amap.api.services.core.LatLonPoint(this.a, this.b);
    }

    public int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.b);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.core.LatLonPoint latLonPoint = (com.amap.api.services.core.LatLonPoint) obj;
        return java.lang.Double.doubleToLongBits(this.a) == java.lang.Double.doubleToLongBits(latLonPoint.a) && java.lang.Double.doubleToLongBits(this.b) == java.lang.Double.doubleToLongBits(latLonPoint.b);
    }

    public java.lang.String toString() {
        return this.a + "," + this.b;
    }

    protected LatLonPoint(android.os.Parcel parcel) {
        this.a = parcel.readDouble();
        this.b = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
    }
}
