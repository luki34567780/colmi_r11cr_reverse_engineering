package com.amap.api.services.auto;

/* loaded from: classes.dex */
public class Meta implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Meta> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Meta>() { // from class: com.amap.api.services.auto.Meta.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.Meta createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.Meta[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.auto.Meta a(android.os.Parcel parcel) {
            return new com.amap.api.services.auto.Meta(parcel);
        }

        private static com.amap.api.services.auto.Meta[] a(int i) {
            return new com.amap.api.services.auto.Meta[i];
        }
    };
    public java.lang.String listBizType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Meta() {
    }

    protected Meta(android.os.Parcel parcel) {
        this.listBizType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.listBizType);
    }
}
