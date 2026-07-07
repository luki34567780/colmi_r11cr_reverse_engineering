package com.amap.api.services.core;

/* loaded from: classes.dex */
public class LatLonSharePoint extends com.amap.api.services.core.LatLonPoint implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.core.LatLonSharePoint> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.core.LatLonSharePoint>() { // from class: com.amap.api.services.core.LatLonSharePoint.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.core.LatLonSharePoint createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.core.LatLonSharePoint[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.core.LatLonSharePoint a(android.os.Parcel parcel) {
            return new com.amap.api.services.core.LatLonSharePoint(parcel);
        }

        private static com.amap.api.services.core.LatLonSharePoint[] a(int i) {
            return new com.amap.api.services.core.LatLonSharePoint[i];
        }
    };
    private java.lang.String a;

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonSharePoint(double d, double d2, java.lang.String str) {
        super(d, d2);
        this.a = str;
    }

    public java.lang.String getSharePointName() {
        return this.a;
    }

    public void setSharePointName(java.lang.String str) {
        this.a = str;
    }

    protected LatLonSharePoint(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        java.lang.String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.core.LatLonSharePoint latLonSharePoint = (com.amap.api.services.core.LatLonSharePoint) obj;
        java.lang.String str = this.a;
        if (str == null) {
            if (latLonSharePoint.a != null) {
                return false;
            }
        } else if (!str.equals(latLonSharePoint.a)) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public java.lang.String toString() {
        return super.toString() + "," + this.a;
    }
}
