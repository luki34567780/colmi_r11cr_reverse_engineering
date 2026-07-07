package com.amap.api.services.route;

/* loaded from: classes.dex */
public class RailwaySpace implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.RailwaySpace> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.RailwaySpace>() { // from class: com.amap.api.services.route.RailwaySpace.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RailwaySpace createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.RailwaySpace[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.route.RailwaySpace a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.RailwaySpace(parcel);
        }

        private static com.amap.api.services.route.RailwaySpace[] a(int i) {
            return new com.amap.api.services.route.RailwaySpace[i];
        }
    };
    private java.lang.String a;
    private float b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RailwaySpace(java.lang.String str, float f) {
        this.a = str;
        this.b = f;
    }

    public java.lang.String getCode() {
        return this.a;
    }

    public float getCost() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
    }

    protected RailwaySpace(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readFloat();
    }
}
