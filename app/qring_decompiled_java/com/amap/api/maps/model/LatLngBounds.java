package com.amap.api.maps.model;

/* loaded from: classes.dex */
public final class LatLngBounds implements android.os.Parcelable {
    private static final java.lang.String CLASSNAME = "LatLngBounds";
    public static final com.amap.api.maps.model.LatLngBoundsCreator CREATOR = new com.amap.api.maps.model.LatLngBoundsCreator();
    private final int mVersionCode;
    public final com.amap.api.maps.model.LatLng northeast;
    public final com.amap.api.maps.model.LatLng southwest;

    /* JADX INFO: Access modifiers changed from: private */
    public static double c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    LatLngBounds(int i, com.amap.api.maps.model.LatLng latLng, com.amap.api.maps.model.LatLng latLng2) {
        boolean z;
        try {
        } catch (java.lang.Throwable th) {
            android.util.Log.e(CLASSNAME, "the structure parameters are illegal!");
            th.printStackTrace();
            z = false;
        }
        if (latLng == null) {
            throw new com.amap.api.maps.model.RuntimeRemoteException("null southwest");
        }
        if (latLng2 == null) {
            throw new com.amap.api.maps.model.RuntimeRemoteException("null northeast");
        }
        if (latLng2.latitude < latLng.latitude) {
            throw new com.amap.api.maps.model.RuntimeRemoteException("southern latitude exceeds northern latitude (" + latLng.latitude + " > " + latLng2.latitude + ")");
        }
        z = true;
        this.mVersionCode = z ? i : 0;
        this.southwest = z ? latLng : null;
        this.northeast = z ? latLng2 : null;
    }

    public LatLngBounds(com.amap.api.maps.model.LatLng latLng, com.amap.api.maps.model.LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    final int a() {
        return this.mVersionCode;
    }

    public static com.amap.api.maps.model.LatLngBounds.Builder builder() {
        return new com.amap.api.maps.model.LatLngBounds.Builder();
    }

    public final boolean contains(com.amap.api.maps.model.LatLng latLng) {
        if (latLng == null) {
            return false;
        }
        if (this.northeast != null && this.southwest != null) {
            return a(latLng.latitude) && b(latLng.longitude);
        }
        android.util.Log.e(CLASSNAME, "current LatLngBounds is invalid, please check the structure parameters are legal");
        return false;
    }

    public final boolean contains(com.amap.api.maps.model.LatLngBounds latLngBounds) {
        return latLngBounds != null && contains(latLngBounds.southwest) && contains(latLngBounds.northeast);
    }

    public final boolean intersects(com.amap.api.maps.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return false;
        }
        if (this.northeast != null && this.southwest != null) {
            return a(latLngBounds) || latLngBounds.a(this);
        }
        android.util.Log.e(CLASSNAME, "current LatLngBounds is invalid, please check the structure parameters are legal");
        return false;
    }

    private boolean a(com.amap.api.maps.model.LatLngBounds latLngBounds) {
        com.amap.api.maps.model.LatLng latLng;
        if (latLngBounds != null && (latLng = latLngBounds.northeast) != null && latLngBounds.southwest != null) {
            double d = ((latLng.longitude + latLngBounds.southwest.longitude) - this.northeast.longitude) - this.southwest.longitude;
            double d2 = ((this.northeast.longitude - this.southwest.longitude) + latLngBounds.northeast.longitude) - latLngBounds.southwest.longitude;
            double d3 = ((latLngBounds.northeast.latitude + latLngBounds.southwest.latitude) - this.northeast.latitude) - this.southwest.latitude;
            double d4 = ((this.northeast.latitude - this.southwest.latitude) + latLngBounds.northeast.latitude) - latLngBounds.southwest.latitude;
            if (java.lang.Math.abs(d) < d2 && java.lang.Math.abs(d3) < d4) {
                return true;
            }
        }
        return false;
    }

    public final com.amap.api.maps.model.LatLngBounds including(com.amap.api.maps.model.LatLng latLng) {
        com.amap.api.maps.model.LatLng latLng2;
        double d;
        if (latLng == null) {
            return this;
        }
        if (this.northeast == null || (latLng2 = this.southwest) == null) {
            android.util.Log.e(CLASSNAME, "current LatLngBounds is invalid, please check the structure parameters are legal");
            return this;
        }
        double min = java.lang.Math.min(latLng2.latitude, latLng.latitude);
        double max = java.lang.Math.max(this.northeast.latitude, latLng.latitude);
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        double d4 = latLng.longitude;
        try {
            if (!b(d4)) {
                if (c(d3, d4) >= d(d2, d4)) {
                    d = d4;
                    return new com.amap.api.maps.model.LatLngBounds(new com.amap.api.maps.model.LatLng(min, d3, false), new com.amap.api.maps.model.LatLng(max, d, false));
                }
                d3 = d4;
            }
            return new com.amap.api.maps.model.LatLngBounds(new com.amap.api.maps.model.LatLng(min, d3, false), new com.amap.api.maps.model.LatLng(max, d, false));
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return this;
        }
        d = d2;
    }

    private boolean a(double d) {
        return this.southwest.latitude <= d && d <= this.northeast.latitude;
    }

    private boolean b(double d) {
        return this.southwest.longitude <= this.northeast.longitude ? this.southwest.longitude <= d && d <= this.northeast.longitude : this.southwest.longitude <= d || d <= this.northeast.longitude;
    }

    public final int hashCode() {
        return com.amap.api.col.p0003sl.dx.a(new java.lang.Object[]{this.southwest, this.northeast});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.amap.api.maps.model.LatLngBounds)) {
            return false;
        }
        com.amap.api.maps.model.LatLngBounds latLngBounds = (com.amap.api.maps.model.LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public final java.lang.String toString() {
        return com.amap.api.col.p0003sl.dx.a(com.amap.api.col.p0003sl.dx.a("southwest", this.southwest), com.amap.api.col.p0003sl.dx.a("northeast", this.northeast));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.amap.api.maps.model.LatLngBoundsCreator.a(this, parcel, i);
    }

    public static final class Builder {
        private double mSouth = Double.POSITIVE_INFINITY;
        private double mNorth = Double.NEGATIVE_INFINITY;
        private double mWest = Double.NaN;
        private double mEast = Double.NaN;

        public final com.amap.api.maps.model.LatLngBounds.Builder include(com.amap.api.maps.model.LatLng latLng) {
            if (latLng == null) {
                return this;
            }
            this.mSouth = java.lang.Math.min(this.mSouth, latLng.latitude);
            this.mNorth = java.lang.Math.max(this.mNorth, latLng.latitude);
            double d = latLng.longitude;
            if (java.lang.Double.isNaN(this.mWest)) {
                this.mWest = d;
            } else {
                if (!a(d)) {
                    if (com.amap.api.maps.model.LatLngBounds.c(this.mWest, d) < com.amap.api.maps.model.LatLngBounds.d(this.mEast, d)) {
                        this.mWest = d;
                    }
                }
                return this;
            }
            this.mEast = d;
            return this;
        }

        private boolean a(double d) {
            double d2 = this.mWest;
            double d3 = this.mEast;
            return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
        }

        public final com.amap.api.maps.model.LatLngBounds build() {
            if (java.lang.Double.isNaN(this.mWest)) {
                android.util.Log.w(com.amap.api.maps.model.LatLngBounds.CLASSNAME, "no included points");
                return null;
            }
            double d = this.mWest;
            double d2 = this.mEast;
            if (d > d2) {
                this.mWest = d2;
                this.mEast = d;
            }
            double d3 = this.mSouth;
            double d4 = this.mNorth;
            if (d3 > d4) {
                this.mSouth = d4;
                this.mNorth = d3;
            }
            return new com.amap.api.maps.model.LatLngBounds(new com.amap.api.maps.model.LatLng(this.mSouth, this.mWest, false), new com.amap.api.maps.model.LatLng(this.mNorth, this.mEast, false));
        }
    }
}
