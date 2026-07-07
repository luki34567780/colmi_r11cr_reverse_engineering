package com.amap.api.services.route;

/* loaded from: classes.dex */
public class TimeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.route.TimeInfo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.route.TimeInfo>() { // from class: com.amap.api.services.route.TimeInfo.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.route.TimeInfo[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.route.TimeInfo createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.route.TimeInfo a(android.os.Parcel parcel) {
            return new com.amap.api.services.route.TimeInfo(parcel);
        }
    };
    private long a;
    private java.util.List<com.amap.api.services.route.TimeInfosElement> b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getStartTime() {
        return this.a;
    }

    public void setStartTime(long j) {
        this.a = j;
    }

    public java.util.List<com.amap.api.services.route.TimeInfosElement> getElements() {
        return this.b;
    }

    public void setElements(java.util.List<com.amap.api.services.route.TimeInfosElement> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeTypedList(this.b);
    }

    public TimeInfo(android.os.Parcel parcel) {
        this.b = new java.util.ArrayList();
        this.a = parcel.readInt();
        this.b = parcel.createTypedArrayList(com.amap.api.services.route.TimeInfosElement.CREATOR);
    }

    public TimeInfo() {
        this.b = new java.util.ArrayList();
    }
}
