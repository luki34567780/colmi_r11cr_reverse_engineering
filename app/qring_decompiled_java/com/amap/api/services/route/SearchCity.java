package com.amap.api.services.route;

/* loaded from: classes.dex */
public class SearchCity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.SearchCity> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.SearchCity>() { // from class: com.amap.api.services.route.SearchCity.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.SearchCity[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.SearchCity createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.SearchCity a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.SearchCity(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getSearchCityName() {
        return this.a;
    }

    public void setSearchCityName(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getSearchCitycode() {
        return this.b;
    }

    public void setSearchCitycode(java.lang.String str) {
        this.b = str;
    }

    public java.lang.String getSearchCityAdCode() {
        return this.c;
    }

    public void setSearchCityhAdCode(java.lang.String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public SearchCity(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public SearchCity() {
    }
}
