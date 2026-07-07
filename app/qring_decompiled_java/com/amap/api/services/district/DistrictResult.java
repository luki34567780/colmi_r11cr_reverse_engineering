package com.amap.api.services.district;

/* loaded from: classes.dex */
public final class DistrictResult implements android.os.Parcelable {
    public android.os.Parcelable.Creator<com.amap.api.services.district.DistrictResult> CREATOR;
    private com.amap.api.services.district.DistrictSearchQuery a;
    private java.util.ArrayList<com.amap.api.services.district.DistrictItem> b;
    private int c;
    private com.amap.api.services.core.AMapException d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DistrictResult(com.amap.api.services.district.DistrictSearchQuery districtSearchQuery, java.util.ArrayList<com.amap.api.services.district.DistrictItem> arrayList) {
        this.b = new java.util.ArrayList<>();
        this.CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.district.DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.district.DistrictResult createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.district.DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.district.DistrictResult a(android.os.Parcel parcel) {
                return new com.amap.api.services.district.DistrictResult(parcel);
            }

            private static com.amap.api.services.district.DistrictResult[] a(int i) {
                return new com.amap.api.services.district.DistrictResult[i];
            }
        };
        this.a = districtSearchQuery;
        this.b = arrayList;
    }

    public DistrictResult() {
        this.b = new java.util.ArrayList<>();
        this.CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.district.DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.district.DistrictResult createFromParcel(android.os.Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.district.DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.district.DistrictResult a(android.os.Parcel parcel) {
                return new com.amap.api.services.district.DistrictResult(parcel);
            }

            private static com.amap.api.services.district.DistrictResult[] a(int i) {
                return new com.amap.api.services.district.DistrictResult[i];
            }
        };
    }

    public final java.util.ArrayList<com.amap.api.services.district.DistrictItem> getDistrict() {
        return this.b;
    }

    public final void setDistrict(java.util.ArrayList<com.amap.api.services.district.DistrictItem> arrayList) {
        this.b = arrayList;
    }

    public final com.amap.api.services.district.DistrictSearchQuery getQuery() {
        return this.a;
    }

    public final void setQuery(com.amap.api.services.district.DistrictSearchQuery districtSearchQuery) {
        this.a = districtSearchQuery;
    }

    public final int getPageCount() {
        return this.c;
    }

    public final void setPageCount(int i) {
        this.c = i;
    }

    public final com.amap.api.services.core.AMapException getAMapException() {
        return this.d;
    }

    public final void setAMapException(com.amap.api.services.core.AMapException aMapException) {
        this.d = aMapException;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }

    protected DistrictResult(android.os.Parcel parcel) {
        this.b = new java.util.ArrayList<>();
        this.CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.district.DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.district.DistrictResult createFromParcel(android.os.Parcel parcel2) {
                return a(parcel2);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.amap.api.services.district.DistrictResult[] newArray(int i) {
                return a(i);
            }

            private static com.amap.api.services.district.DistrictResult a(android.os.Parcel parcel2) {
                return new com.amap.api.services.district.DistrictResult(parcel2);
            }

            private static com.amap.api.services.district.DistrictResult[] a(int i) {
                return new com.amap.api.services.district.DistrictResult[i];
            }
        };
        this.a = (com.amap.api.services.district.DistrictSearchQuery) parcel.readParcelable(com.amap.api.services.district.DistrictSearchQuery.class.getClassLoader());
        this.b = parcel.createTypedArrayList(com.amap.api.services.district.DistrictItem.CREATOR);
    }

    public final int hashCode() {
        com.amap.api.services.district.DistrictSearchQuery districtSearchQuery = this.a;
        int hashCode = ((districtSearchQuery == null ? 0 : districtSearchQuery.hashCode()) + 31) * 31;
        java.util.ArrayList<com.amap.api.services.district.DistrictItem> arrayList = this.b;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.district.DistrictResult districtResult = (com.amap.api.services.district.DistrictResult) obj;
        com.amap.api.services.district.DistrictSearchQuery districtSearchQuery = this.a;
        if (districtSearchQuery == null) {
            if (districtResult.a != null) {
                return false;
            }
        } else if (!districtSearchQuery.equals(districtResult.a)) {
            return false;
        }
        java.util.ArrayList<com.amap.api.services.district.DistrictItem> arrayList = this.b;
        if (arrayList == null) {
            if (districtResult.b != null) {
                return false;
            }
        } else if (!arrayList.equals(districtResult.b)) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        return "DistrictResult [mDisQuery=" + this.a + ", mDistricts=" + this.b + "]";
    }
}
