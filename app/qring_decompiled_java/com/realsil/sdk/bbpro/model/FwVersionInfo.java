package com.realsil.sdk.bbpro.model;

/* loaded from: /tmp/dex/classes2.dex */
public class FwVersionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.FwVersionInfo> CREATOR = new android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.FwVersionInfo>() { // from class: com.realsil.sdk.bbpro.model.FwVersionInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.FwVersionInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.model.FwVersionInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.FwVersionInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.model.FwVersionInfo[i];
        }
    };
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;

    public FwVersionInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            parcel.writeBlob(this.a);
            parcel.writeBlob(this.b);
            parcel.writeBlob(this.c);
            parcel.writeBlob(this.d);
            parcel.writeBlob(this.e);
            parcel.writeBlob(this.f);
            return;
        }
        parcel.writeByteArray(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByteArray(this.e);
        parcel.writeByteArray(this.f);
    }

    public FwVersionInfo(byte[] bArr) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int length = bArr.length;
        if (length >= 6) {
            wrap.get(this.a);
        }
        if (length >= 10) {
            wrap.get(this.b);
        }
        if (length >= 26) {
            wrap.get(this.c);
        }
        if (length >= 32) {
            wrap.get(this.d);
        }
        if (length >= 36) {
            wrap.get(this.e);
        }
        if (length >= 40) {
            wrap.get(this.f);
        }
    }

    public FwVersionInfo(android.os.Parcel parcel) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.a = parcel.readBlob();
            this.b = parcel.readBlob();
            this.c = parcel.readBlob();
            this.d = parcel.readBlob();
            this.e = parcel.readBlob();
            this.f = parcel.readBlob();
            return;
        }
        this.a = parcel.createByteArray();
        this.b = parcel.createByteArray();
        this.c = parcel.createByteArray();
        this.d = parcel.createByteArray();
        this.e = parcel.createByteArray();
        this.f = parcel.createByteArray();
    }
}
