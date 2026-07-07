package com.amap.api.services.district;

/* loaded from: classes.dex */
public class DistrictSearchQuery implements android.os.Parcelable, java.lang.Cloneable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.district.DistrictSearchQuery> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.district.DistrictSearchQuery>() { // from class: com.amap.api.services.district.DistrictSearchQuery.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.district.DistrictSearchQuery createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.district.DistrictSearchQuery[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.district.DistrictSearchQuery a(android.os.Parcel parcel) {
            com.amap.api.services.district.DistrictSearchQuery districtSearchQuery = new com.amap.api.services.district.DistrictSearchQuery();
            districtSearchQuery.setKeywords(parcel.readString());
            districtSearchQuery.setKeywordsLevel(parcel.readString());
            districtSearchQuery.setPageNum(parcel.readInt());
            districtSearchQuery.setPageSize(parcel.readInt());
            districtSearchQuery.setShowChild(parcel.readByte() == 1);
            districtSearchQuery.setShowBoundary(parcel.readByte() == 1);
            districtSearchQuery.setShowBusinessArea(parcel.readByte() == 1);
            districtSearchQuery.setSubDistrict(parcel.readInt());
            return districtSearchQuery;
        }

        private static com.amap.api.services.district.DistrictSearchQuery[] a(int i) {
            return new com.amap.api.services.district.DistrictSearchQuery[i];
        }
    };
    public static final java.lang.String KEYWORDS_BUSINESS = "biz_area";
    public static final java.lang.String KEYWORDS_CITY = "city";
    public static final java.lang.String KEYWORDS_COUNTRY = "country";
    public static final java.lang.String KEYWORDS_DISTRICT = "district";
    public static final java.lang.String KEYWORDS_PROVINCE = "province";
    private int a;
    private int b;
    private java.lang.String c;
    private java.lang.String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setShowBoundary(boolean z) {
        this.g = z;
    }

    public boolean isShowBoundary() {
        return this.g;
    }

    public DistrictSearchQuery() {
        this.a = 1;
        this.b = 20;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
    }

    public DistrictSearchQuery(java.lang.String str, java.lang.String str2, int i) {
        this.a = 1;
        this.b = 20;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
        this.c = str;
        this.d = str2;
        this.a = i;
    }

    public DistrictSearchQuery(java.lang.String str, java.lang.String str2, int i, boolean z, int i2) {
        this(str, str2, i);
        this.e = z;
        this.b = i2;
    }

    public int getPageNum() {
        int i = this.a;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public void setPageNum(int i) {
        this.a = i;
    }

    public int getPageSize() {
        return this.b;
    }

    public void setPageSize(int i) {
        this.b = i;
    }

    public java.lang.String getKeywords() {
        return this.c;
    }

    public void setKeywords(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String getKeywordsLevel() {
        return this.d;
    }

    public void setKeywordsLevel(java.lang.String str) {
        this.d = str;
    }

    public boolean isShowChild() {
        return this.e;
    }

    public void setShowChild(boolean z) {
        this.e = z;
    }

    public int getSubDistrict() {
        return this.h;
    }

    public void setSubDistrict(int i) {
        this.h = i;
    }

    public boolean isShowBusinessArea() {
        return this.f;
    }

    public void setShowBusinessArea(boolean z) {
        this.f = z;
    }

    public boolean checkLevels() {
        java.lang.String str = this.d;
        if (str == null) {
            return false;
        }
        return str.trim().equals(KEYWORDS_COUNTRY) || this.d.trim().equals(KEYWORDS_PROVINCE) || this.d.trim().equals(KEYWORDS_CITY) || this.d.trim().equals(KEYWORDS_DISTRICT) || this.d.trim().equals(KEYWORDS_BUSINESS);
    }

    public boolean checkKeyWords() {
        java.lang.String str = this.c;
        return (str == null || str.trim().equalsIgnoreCase("")) ? false : true;
    }

    public int hashCode() {
        int i = ((this.g ? 1231 : 1237) + 31) * 31;
        java.lang.String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.d;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.a) * 31) + this.b) * 31) + (this.e ? 1231 : 1237)) * 31) + this.h;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.amap.api.services.district.DistrictSearchQuery districtSearchQuery = (com.amap.api.services.district.DistrictSearchQuery) obj;
        if (this.g != districtSearchQuery.g) {
            return false;
        }
        java.lang.String str = this.c;
        if (str == null) {
            if (districtSearchQuery.c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.c)) {
            return false;
        }
        return this.a == districtSearchQuery.a && this.b == districtSearchQuery.b && this.e == districtSearchQuery.e && this.h == districtSearchQuery.h;
    }

    public boolean weakEquals(com.amap.api.services.district.DistrictSearchQuery districtSearchQuery) {
        if (this == districtSearchQuery) {
            return true;
        }
        if (districtSearchQuery == null) {
            return false;
        }
        java.lang.String str = this.c;
        if (str == null) {
            if (districtSearchQuery.c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.c)) {
            return false;
        }
        return this.b == districtSearchQuery.b && this.e == districtSearchQuery.e && this.g == districtSearchQuery.g && this.h == districtSearchQuery.h;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.amap.api.services.district.DistrictSearchQuery m201clone() {
        try {
            super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            com.amap.api.col.p0003sl.fn.a(e, "DistrictSearchQuery", "clone");
        }
        com.amap.api.services.district.DistrictSearchQuery districtSearchQuery = new com.amap.api.services.district.DistrictSearchQuery();
        districtSearchQuery.setKeywords(this.c);
        districtSearchQuery.setKeywordsLevel(this.d);
        districtSearchQuery.setPageNum(this.a);
        districtSearchQuery.setPageSize(this.b);
        districtSearchQuery.setShowChild(this.e);
        districtSearchQuery.setSubDistrict(this.h);
        districtSearchQuery.setShowBoundary(this.g);
        districtSearchQuery.setShowBusinessArea(this.f);
        return districtSearchQuery;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.h);
    }
}
