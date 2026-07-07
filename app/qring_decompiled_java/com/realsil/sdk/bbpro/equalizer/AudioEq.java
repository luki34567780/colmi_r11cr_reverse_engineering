package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class AudioEq implements android.os.Parcelable {
    public static final int ALL_EQ_TYPE = 8;
    public static final int ALL_PASS_FILTER = 7;
    public static final int BANDPASS_FILTER = 5;
    public static final int BANDREJECT_FILTER = 6;
    public static final int HIGHPASS_FILTER = 4;
    public static final int LOWPASS_FILTER = 3;
    public static final int MAX_DB_VALUE = 12;
    public static final int MAX_EQ_STAGE_NUM = 10;
    public static final int MIN_DB_VALUE = -12;
    public static final int PARSE_EQ_DATA_LENGTH = 212;
    public static final int PEAK_FILTER = 0;
    public static final int SEND_EQ_DATA_LENGTH = 204;
    public static final int SHELVING_HP_FILTER = 2;
    public static final int SHELVING_LP_FILTER = 1;
    public static final int SW_EQ_DATA_LENGTH = 208;
    public int a;
    public double b;
    public int c;
    public int d;
    public double[] e;
    public double[] f;
    public double[] g;
    public int[] h;
    public byte[] i;
    public static final double[] FREQ = {32.0d, 64.0d, 125.0d, 250.0d, 500.0d, 1000.0d, 2000.0d, 4000.0d, 8000.0d, 16000.0d};
    public static final double[] Q = {2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d, 2.0d};
    public static final double[] GAIN_FLAT = {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d};
    public static final int[] BIQUAD_TYPE = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final android.os.Parcelable.Creator<com.realsil.sdk.bbpro.equalizer.AudioEq> CREATOR = new com.realsil.sdk.bbpro.equalizer.AudioEq.a();

    public class a implements android.os.Parcelable.Creator<com.realsil.sdk.bbpro.equalizer.AudioEq> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.equalizer.AudioEq createFromParcel(android.os.Parcel parcel) {
            return new com.realsil.sdk.bbpro.equalizer.AudioEq(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.realsil.sdk.bbpro.equalizer.AudioEq[] newArray(int i) {
            return new com.realsil.sdk.bbpro.equalizer.AudioEq[i];
        }
    }

    public AudioEq() {
        this.a = 10;
        this.b = 0.0d;
        this.c = 3;
        this.e = FREQ;
        this.f = Q;
        this.g = GAIN_FLAT;
        this.h = BIQUAD_TYPE;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int[] getBiquadType() {
        return this.h;
    }

    public double[] getFreq() {
        return this.e;
    }

    public double[] getGains() {
        return this.g;
    }

    public double getGlobalGain() {
        return this.b;
    }

    public double[] getQ() {
        return this.f;
    }

    public int getSampleRate() {
        return this.c;
    }

    public int getStageNum() {
        return this.a;
    }

    public int getStateNum() {
        return this.a;
    }

    public void setBiquadType(int[] iArr) {
        this.h = iArr;
    }

    public void setFreq(double[] dArr) {
        this.e = dArr;
    }

    public void setGains(double[] dArr) {
        this.g = dArr;
    }

    public void setGlobalGain(double d) {
        this.b = d;
    }

    public void setQ(double[] dArr) {
        this.f = dArr;
    }

    public void setSampleRate(int i) {
        this.c = i;
    }

    public void setStageNum(int i) {
        this.a = i;
    }

    public void setStateNum(int i) {
        this.a = i;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AudioEq {");
        byte[] bArr = this.i;
        if (bArr != null) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\neqData=(%d)%s", java.lang.Integer.valueOf(bArr.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.i)));
        }
        sb.append(java.lang.String.format(java.util.Locale.US, "\n\tStageNum=%d, globalGain=%f, sampleRate=%d, accuracy=%d", java.lang.Integer.valueOf(this.a), java.lang.Double.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)));
        sb.append("\n\tFreq=" + java.util.Arrays.toString(this.e));
        sb.append("\n\tGain=" + java.util.Arrays.toString(this.g));
        sb.append("\n\tQ=" + java.util.Arrays.toString(this.f));
        sb.append("\n\tbiquadType=" + java.util.Arrays.toString(this.h));
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeDouble(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeDoubleArray(this.e);
        parcel.writeDoubleArray(this.f);
        parcel.writeDoubleArray(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeByteArray(this.i);
    }

    public AudioEq(double[] dArr, double[] dArr2, double[] dArr3) {
        this.a = 10;
        this.b = 0.0d;
        this.c = 3;
        this.h = BIQUAD_TYPE;
        this.e = dArr;
        this.f = dArr2;
        this.g = dArr3;
    }

    public AudioEq(int i, double[] dArr, double[] dArr2, double[] dArr3) {
        this.b = 0.0d;
        this.c = 3;
        this.h = BIQUAD_TYPE;
        this.a = i;
        this.e = dArr;
        this.f = dArr2;
        this.g = dArr3;
    }

    public AudioEq(int i, double d, int i2, int i3, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr) {
        this(i, d, i2, i3, dArr, dArr2, dArr3, iArr, null);
    }

    public AudioEq(int i, double d, int i2, int i3, double[] dArr, double[] dArr2, double[] dArr3, int[] iArr, byte[] bArr) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = dArr;
        this.f = dArr2;
        this.g = dArr3;
        this.h = iArr;
        this.i = bArr;
    }

    public AudioEq(android.os.Parcel parcel) {
        this.a = 10;
        this.b = 0.0d;
        this.c = 3;
        this.e = FREQ;
        this.f = Q;
        this.g = GAIN_FLAT;
        this.h = BIQUAD_TYPE;
        this.a = parcel.readInt();
        this.b = parcel.readDouble();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.createDoubleArray();
        this.f = parcel.createDoubleArray();
        this.g = parcel.createDoubleArray();
        this.h = parcel.createIntArray();
        this.i = parcel.createByteArray();
    }
}
