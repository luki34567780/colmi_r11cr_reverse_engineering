package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public class PoiItemExtension implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.PoiItemExtension> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.poisearch.PoiItemExtension>() { // from class: com.amap.api.services.poisearch.PoiItemExtension.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.PoiItemExtension createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.PoiItemExtension[] newArray(int i) {
            return a(i);
        }

        private static com.amap.api.services.poisearch.PoiItemExtension a(android.os.Parcel parcel) {
            return new com.amap.api.services.poisearch.PoiItemExtension(parcel);
        }

        private static com.amap.api.services.poisearch.PoiItemExtension[] a(int i) {
            return new com.amap.api.services.poisearch.PoiItemExtension[i];
        }
    };
    private java.lang.String a;
    private java.lang.String b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PoiItemExtension(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public java.lang.String getOpentime() {
        return this.a;
    }

    public java.lang.String getmRating() {
        return this.b;
    }

    protected PoiItemExtension(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
