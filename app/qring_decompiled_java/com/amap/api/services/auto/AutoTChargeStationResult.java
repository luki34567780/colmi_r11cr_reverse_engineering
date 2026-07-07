package com.amap.api.services.auto;

/* loaded from: classes.dex */
public class AutoTChargeStationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTChargeStationResult> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.AutoTChargeStationResult>() { // from class: com.amap.api.services.auto.AutoTChargeStationResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.AutoTChargeStationResult createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.AutoTChargeStationResult[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.auto.AutoTChargeStationResult a(android.os.Parcel parcel) {
            return new com.amap.api.services.auto.AutoTChargeStationResult(parcel);
        }

        private static com.amap.api.services.auto.AutoTChargeStationResult[] a(int i) {
            return new com.amap.api.services.auto.AutoTChargeStationResult[i];
        }
    };
    public com.amap.api.services.auto.Classify classify;
    public int code;
    public com.amap.api.services.auto.ListData listData;
    public com.amap.api.services.auto.Lqii lqii;
    public java.lang.String message;
    public com.amap.api.services.auto.Meta meta;
    public java.lang.String originJson;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AutoTChargeStationResult() {
    }

    protected AutoTChargeStationResult(android.os.Parcel parcel) {
        this.code = parcel.readInt();
        this.message = parcel.readString();
        this.classify = (com.amap.api.services.auto.Classify) parcel.readParcelable(com.amap.api.services.auto.Classify.class.getClassLoader());
        this.listData = (com.amap.api.services.auto.ListData) parcel.readParcelable(com.amap.api.services.auto.ListData.class.getClassLoader());
        this.lqii = (com.amap.api.services.auto.Lqii) parcel.readParcelable(com.amap.api.services.auto.Lqii.class.getClassLoader());
        this.meta = (com.amap.api.services.auto.Meta) parcel.readParcelable(com.amap.api.services.auto.Meta.class.getClassLoader());
        this.originJson = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
        parcel.writeParcelable(this.classify, i);
        parcel.writeParcelable(this.listData, i);
        parcel.writeParcelable(this.lqii, i);
        parcel.writeParcelable(this.meta, i);
        parcel.writeString(this.originJson);
    }
}
