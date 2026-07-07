package com.luck.picture.lib.magical;

/* loaded from: /tmp/dex/classes2.dex */
public class ViewParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.luck.picture.lib.magical.ViewParams> CREATOR = new android.os.Parcelable.Creator<com.luck.picture.lib.magical.ViewParams>() { // from class: com.luck.picture.lib.magical.ViewParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.luck.picture.lib.magical.ViewParams createFromParcel(android.os.Parcel parcel) {
            return new com.luck.picture.lib.magical.ViewParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.luck.picture.lib.magical.ViewParams[] newArray(int i) {
            return new com.luck.picture.lib.magical.ViewParams[i];
        }
    };
    public int height;
    public int left;
    public int top;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLeft() {
        return this.left;
    }

    public void setLeft(int i) {
        this.left = i;
    }

    public int getTop() {
        return this.top;
    }

    public void setTop(int i) {
        this.top = i;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.left);
        parcel.writeInt(this.top);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public ViewParams() {
    }

    protected ViewParams(android.os.Parcel parcel) {
        this.left = parcel.readInt();
        this.top = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
