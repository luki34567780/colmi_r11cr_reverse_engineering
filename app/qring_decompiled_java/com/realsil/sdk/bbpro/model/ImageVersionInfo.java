package com.realsil.sdk.bbpro.model;

/* loaded from: /tmp/dex/classes2.dex */
public class ImageVersionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.ImageVersionInfo> CREATOR = new android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.ImageVersionInfo>() { // from class: com.realsil.sdk.bbpro.model.ImageVersionInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.ImageVersionInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.model.ImageVersionInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.ImageVersionInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.model.ImageVersionInfo[i];
        }
    };
    public byte[] a;

    public ImageVersionInfo() {
        this.a = new byte[4];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getFormattedVersion() {
        byte[] bArr = this.a;
        return (bArr == null || bArr.length < 4) ? com.realsil.sdk.core.utility.DataConverter.bytes2Hex(bArr) : java.lang.String.format(java.util.Locale.US, "%d.%d.%d.%d", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(this.a[1]), java.lang.Byte.valueOf(this.a[2]), java.lang.Byte.valueOf(this.a[3]));
    }

    public byte[] getImageVersion() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            parcel.writeBlob(this.a);
        } else {
            parcel.writeByteArray(this.a);
        }
    }

    public ImageVersionInfo(byte[] bArr) {
        this.a = new byte[4];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        wrap.get();
        if (bArr.length >= 4) {
            wrap.get(this.a);
        }
    }

    public ImageVersionInfo(android.os.Parcel parcel) {
        this.a = new byte[4];
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.a = parcel.readBlob();
        } else {
            this.a = parcel.createByteArray();
        }
    }
}
