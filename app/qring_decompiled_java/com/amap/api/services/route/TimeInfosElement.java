package com.amap.api.services.route;

/* loaded from: classes.dex */
public class TimeInfosElement implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TimeInfosElement> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.TimeInfosElement>() { // from class: com.amap.api.services.route.TimeInfosElement.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.TimeInfosElement[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TimeInfosElement createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.TimeInfosElement a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.TimeInfosElement(parcel);
        }
    };
    int a;
    float b;
    float c;
    int d;
    private java.util.List<com.amap.api.services.route.TMC> e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getPathindex() {
        return this.a;
    }

    public void setPathindex(int i) {
        this.a = i;
    }

    public float getDuration() {
        return this.b;
    }

    public void setDuration(float f) {
        this.b = f;
    }

    public float getTolls() {
        return this.c;
    }

    public void setTolls(float f) {
        this.c = f;
    }

    public int getRestriction() {
        return this.d;
    }

    public void setRestriction(int i) {
        this.d = i;
    }

    public void setTMCs(java.util.List<com.amap.api.services.route.TMC> list) {
        this.e = list;
    }

    public java.util.List<com.amap.api.services.route.TMC> getTMCs() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
    }

    public TimeInfosElement(android.os.Parcel parcel) {
        this.e = new java.util.ArrayList();
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(com.amap.api.services.route.TMC.CREATOR);
    }

    public TimeInfosElement() {
        this.e = new java.util.ArrayList();
    }
}
