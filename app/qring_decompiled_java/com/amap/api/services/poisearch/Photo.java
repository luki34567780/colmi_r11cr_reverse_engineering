package com.amap.api.services.poisearch;

/* loaded from: classes.dex */
public final class Photo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.poisearch.Photo> CREATOR = new android.os.Parcelable.Creator<com.amap.api.services.poisearch.Photo>() { // from class: com.amap.api.services.poisearch.Photo.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amap.api.services.poisearch.Photo[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amap.api.services.poisearch.Photo createFromParcel(android.os.Parcel parcel) {
            return a(parcel);
        }

        private static com.amap.api.services.poisearch.Photo a(android.os.Parcel parcel) {
            return new com.amap.api.services.poisearch.Photo(parcel);
        }
    };
    private java.lang.String a;
    private java.lang.String b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Photo() {
    }

    public Photo(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final java.lang.String getTitle() {
        return this.a;
    }

    public final void setTitle(java.lang.String str) {
        this.a = str;
    }

    public final java.lang.String getUrl() {
        return this.b;
    }

    public final void setUrl(java.lang.String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public Photo(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
