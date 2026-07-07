package com.amap.api.services.auto;

/* loaded from: classes.dex */
public class Lqii implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Lqii> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.auto.Lqii>() { // from class: com.amap.api.services.auto.Lqii.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.Lqii createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.auto.Lqii[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.auto.Lqii a(android.os.Parcel parcel) {
            return new com.amap.api.services.auto.Lqii(parcel);
        }

        private static com.amap.api.services.auto.Lqii[] a(int i) {
            return new com.amap.api.services.auto.Lqii[i];
        }
    };
    public java.lang.String categoryBrandRecognitionResult;
    public java.lang.String changeQueryTip;
    public java.lang.String expandRangeTip;
    public java.lang.String isCurrentCity;
    public java.lang.String isUserCity;
    public java.lang.String queryCateResult;
    public java.lang.String suggestContent;
    public java.lang.String targetViewCity;
    public java.lang.String totalhits;
    public java.lang.String viewRegion;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Lqii() {
    }

    protected Lqii(android.os.Parcel parcel) {
        this.categoryBrandRecognitionResult = parcel.readString();
        this.changeQueryTip = parcel.readString();
        this.expandRangeTip = parcel.readString();
        this.isCurrentCity = parcel.readString();
        this.isUserCity = parcel.readString();
        this.queryCateResult = parcel.readString();
        this.suggestContent = parcel.readString();
        this.targetViewCity = parcel.readString();
        this.totalhits = parcel.readString();
        this.viewRegion = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.categoryBrandRecognitionResult);
        parcel.writeString(this.changeQueryTip);
        parcel.writeString(this.expandRangeTip);
        parcel.writeString(this.isCurrentCity);
        parcel.writeString(this.isUserCity);
        parcel.writeString(this.queryCateResult);
        parcel.writeString(this.suggestContent);
        parcel.writeString(this.targetViewCity);
        parcel.writeString(this.totalhits);
        parcel.writeString(this.viewRegion);
    }
}
