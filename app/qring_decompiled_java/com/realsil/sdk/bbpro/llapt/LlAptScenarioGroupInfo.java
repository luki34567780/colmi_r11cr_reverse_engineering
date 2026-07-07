package com.realsil.sdk.bbpro.llapt;

/* loaded from: /tmp/dex/classes2.dex */
public final class LlAptScenarioGroupInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo> CREATOR = new com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo.a();
    public static final byte INVALID_SCENARIO = -1;
    public int a;
    public byte[] b;

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo[] newArray(int i) {
            return new com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo[i];
        }
    }

    public LlAptScenarioGroupInfo(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public static com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo builder(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr.length < 1) {
            return null;
        }
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        if (length > 0) {
            bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 1, bArr2, 0, length);
        }
        return new com.realsil.sdk.bbpro.llapt.LlAptScenarioGroupInfo(i, bArr2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getGroupNum() {
        return this.a;
    }

    public byte[] getGroupSenario() {
        return this.b;
    }

    public byte getSenario(int i) {
        byte[] bArr = this.b;
        if (bArr != null && i >= 0 && i <= bArr.length) {
            return bArr[i];
        }
        return (byte) 0;
    }

    public boolean isSenarioSupported() {
        byte[] bArr = this.b;
        return bArr != null && bArr.length > 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LlAptScenarioGroupInfo{");
        sb.append("\n\tgroupNum=" + this.a);
        sb.append("\n\tgroupScenario=" + com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.b));
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByteArray(this.b);
    }

    public LlAptScenarioGroupInfo(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.createByteArray();
    }
}
