package com.amap.api.services.route;

/* loaded from: classes.dex */
public class District implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.District> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.District>() { // from class: com.amap.api.services.route.District.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.District[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.District createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.District a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.District(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getDistrictName() {
        return this.a;
    }

    public void setDistrictName(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String getDistrictAdcode() {
        return this.b;
    }

    public void setDistrictAdcode(java.lang.String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public District(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public District() {
    }
}
