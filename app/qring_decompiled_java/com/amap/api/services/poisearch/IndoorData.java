package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class IndoorData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.IndoorData> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.poisearch.IndoorData>() { // from class: com.amap.api.services.poisearch.IndoorData.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.IndoorData createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.IndoorData[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.poisearch.IndoorData a(android.os.Parcel parcel) {
            return new com.amap.api.services.poisearch.IndoorData(parcel);
        }

        private static com.amap.api.services.poisearch.IndoorData[] a(int i) {
            return new com.amap.api.services.poisearch.IndoorData[i];
        }
    };
    private java.lang.String a;
    private int b;
    private java.lang.String c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IndoorData(java.lang.String str, int i, java.lang.String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public java.lang.String getPoiId() {
        return this.a;
    }

    public void setPoiId(java.lang.String str) {
        this.a = str;
    }

    public int getFloor() {
        return this.b;
    }

    public void setFloor(int i) {
        this.b = i;
    }

    public java.lang.String getFloorName() {
        return this.c;
    }

    public void setFloorName(java.lang.String str) {
        this.c = str;
    }

    protected IndoorData(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
