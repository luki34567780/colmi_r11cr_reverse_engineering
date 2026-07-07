package com.realsil.sdk.bbpro.model;

/* loaded from: /tmp/dex/classes2.dex */
public class OtaFwVersionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.OtaFwVersionInfo> CREATOR = new android.os.Parcelable.Creator<com.realsil.sdk.bbpro.model.OtaFwVersionInfo>() { // from class: com.realsil.sdk.bbpro.model.OtaFwVersionInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.OtaFwVersionInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.model.OtaFwVersionInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.realsil.sdk.bbpro.model.OtaFwVersionInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.model.OtaFwVersionInfo[i];
        }
    };
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    public OtaFwVersionInfo(byte[] bArr) {
        this.a = new byte[4];
        this.b = new byte[4];
        this.c = new byte[4];
        this.d = new byte[4];
        this.e = new byte[4];
        this.f = new byte[4];
        this.g = new byte[4];
        this.h = new byte[4];
        this.i = new byte[4];
        this.j = new byte[12];
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int length = bArr.length;
        if (length >= 5) {
            wrap.get(this.a);
        }
        if (length >= 9) {
            wrap.get(this.b);
        }
        if (length >= 13) {
            wrap.get(this.c);
        }
        if (length >= 17) {
            wrap.get(this.d);
        }
        if (length >= 21) {
            wrap.get(this.e);
        }
        if (length >= 25) {
            wrap.get(this.f);
        }
        if (length >= 29) {
            wrap.get(this.g);
        }
        if (length >= 33) {
            wrap.get(this.h);
        }
        if (length >= 37) {
            wrap.get(this.i);
        }
        if (length >= 49) {
            wrap.get(this.j);
        }
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
            parcel.writeBlob(this.g);
            parcel.writeBlob(this.h);
            parcel.writeBlob(this.i);
            parcel.writeBlob(this.j);
            return;
        }
        parcel.writeByteArray(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeByteArray(this.d);
        parcel.writeByteArray(this.e);
        parcel.writeByteArray(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeByteArray(this.h);
        parcel.writeByteArray(this.i);
        parcel.writeByteArray(this.j);
    }

    public OtaFwVersionInfo(android.os.Parcel parcel) {
        this.a = new byte[4];
        this.b = new byte[4];
        this.c = new byte[4];
        this.d = new byte[4];
        this.e = new byte[4];
        this.f = new byte[4];
        this.g = new byte[4];
        this.h = new byte[4];
        this.i = new byte[4];
        this.j = new byte[12];
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.a = parcel.readBlob();
            this.b = parcel.readBlob();
            this.c = parcel.readBlob();
            this.d = parcel.readBlob();
            this.e = parcel.readBlob();
            this.f = parcel.readBlob();
            this.g = parcel.readBlob();
            this.h = parcel.readBlob();
            this.i = parcel.readBlob();
            this.j = parcel.readBlob();
            return;
        }
        this.a = parcel.createByteArray();
        this.b = parcel.createByteArray();
        this.c = parcel.createByteArray();
        this.d = parcel.createByteArray();
        this.e = parcel.createByteArray();
        this.f = parcel.createByteArray();
        this.g = parcel.createByteArray();
        this.h = parcel.createByteArray();
        this.i = parcel.createByteArray();
        this.j = parcel.createByteArray();
    }
}
