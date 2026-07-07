package com.realsil.sdk.bbpro.multilink;

/* loaded from: /tmp/dex/classes2.dex */
public class MultilinkInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.multilink.MultilinkInfo> CREATOR = new com.realsil.sdk.bbpro.multilink.MultilinkInfo.a();
    public int a;

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.multilink.MultilinkInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.multilink.MultilinkInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.multilink.MultilinkInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.multilink.MultilinkInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.multilink.MultilinkInfo[i];
        }
    }

    public MultilinkInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnNum() {
        return this.a;
    }

    public void setConnNum(int i) {
        this.a = i;
    }

    public java.lang.String toString() {
        return "MultilinkInfo {" + java.lang.String.format(java.util.Locale.US, "\n\tconnNum=%d", java.lang.Integer.valueOf(this.a)) + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public MultilinkInfo(android.os.Parcel parcel) {
        this.a = parcel.readInt();
    }
}
