package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class IndoorDataV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.IndoorDataV2> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.poisearch.IndoorDataV2>() { // from class: com.amap.api.services.poisearch.IndoorDataV2.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.IndoorDataV2 createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.IndoorDataV2[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.poisearch.IndoorDataV2 a(android.os.Parcel parcel) {
            return new com.amap.api.services.poisearch.IndoorDataV2(parcel);
        }

        private static com.amap.api.services.poisearch.IndoorDataV2[] a(int i) {
            return new com.amap.api.services.poisearch.IndoorDataV2[i];
        }
    };
    private boolean a;
    private java.lang.String b;
    private int c;
    private java.lang.String d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IndoorDataV2(boolean z, java.lang.String str, int i, java.lang.String str2) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    public void setIndoorMap(boolean z) {
        this.a = z;
    }

    public boolean isIndoorMap() {
        return this.a;
    }

    public java.lang.String getPoiId() {
        return this.b;
    }

    public void setPoiId(java.lang.String str) {
        this.b = str;
    }

    public int getFloor() {
        return this.c;
    }

    public void setFloor(int i) {
        this.c = i;
    }

    public java.lang.String getFloorName() {
        return this.d;
    }

    public void setFloorName(java.lang.String str) {
        this.d = str;
    }

    protected IndoorDataV2(android.os.Parcel parcel) {
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.a = zArr[0];
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBooleanArray(new boolean[]{this.a});
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}
