package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public class EqIndex {
    public static final int INVALID_INDEX = 255;
    public static final boolean VDBG = false;
    public com.realsil.sdk.bbpro.equalizer.AudioEq audioEq;
    public int eqBud;
    public byte[] eqData;
    public byte[] eqInfo;
    public int eqType;
    public int index;
    public int mode;
    public boolean modified;
    public java.lang.String nickName;
    public byte sampleRate;

    public EqIndex(int i, java.lang.String str, boolean z, byte b, byte[] bArr) {
        this.eqBud = 2;
        this.eqType = 0;
        this.index = i;
        this.nickName = str;
        this.modified = z;
        this.sampleRate = b;
        this.eqData = bArr;
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex a(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length < 3) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        byte b = bArr[0];
        int i2 = bArr[1] & 255;
        byte b2 = bArr[2];
        if (bArr.length < i2 + 2 || i2 - 1 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "invalid eqData, packet.length=%d, eqDataLen=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2)));
            return null;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 3, bArr2, 0, i);
        return new com.realsil.sdk.bbpro.equalizer.EqIndex(b, java.lang.String.format(java.util.Locale.US, "EQ %d", java.lang.Byte.valueOf(b)), true, b2, bArr2);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex b(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length < 6) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        int i2 = ((bArr[4] << 8) | (bArr[3] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        byte b4 = bArr[5];
        if (bArr.length < i2 + 5 || i2 - 1 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "invalid eqData, packet.length=%d, eqDataLen=0X%04x(%d)", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i2)));
            return null;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 6, bArr2, 0, i);
        return new com.realsil.sdk.bbpro.equalizer.EqIndex(b, java.lang.String.format(java.util.Locale.US, "EQ %d", java.lang.Byte.valueOf(b)), true, b4, bArr2);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex c(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length < 7) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        java.lang.String format = b2 == 1 ? java.lang.String.format(java.util.Locale.US, "Gaming Mode EQ %d", java.lang.Byte.valueOf(b)) : b2 == 2 ? java.lang.String.format(java.util.Locale.US, "ANC Mode EQ %d", java.lang.Byte.valueOf(b)) : java.lang.String.format(java.util.Locale.US, "Normal Mode EQ %d", java.lang.Byte.valueOf(b));
        int i2 = ((bArr[5] << 8) | (bArr[4] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        byte b5 = bArr[6];
        if (bArr.length < i2 + 6 || i2 - 1 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "invalid eqData, packet.length=%d, eqDataLen=0X%04x(%d)", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i2)));
            return null;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 7, bArr2, 0, i);
        return new com.realsil.sdk.bbpro.equalizer.EqIndex(b2, b, format, true, b5, bArr2);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex d(byte[] bArr) {
        int i;
        com.realsil.sdk.bbpro.equalizer.AudioEq audioEq;
        if (bArr == null || bArr.length < 7) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        java.lang.String format = b2 == 1 ? java.lang.String.format(java.util.Locale.US, "Gaming EQ %d", java.lang.Byte.valueOf(b)) : b2 == 2 ? java.lang.String.format(java.util.Locale.US, "ANC EQ %d", java.lang.Byte.valueOf(b)) : java.lang.String.format(java.util.Locale.US, "Normal EQ %d", java.lang.Byte.valueOf(b));
        int i2 = ((bArr[5] << 8) | (bArr[4] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        byte b5 = bArr[6];
        if (bArr.length < i2 + 6 || i2 - 1 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "invalid eqData, packet.length=%d, eqDataLen=0X%04x(%d)", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i2)));
            return null;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 7, bArr2, 0, i);
        com.realsil.sdk.bbpro.equalizer.EqParameterInfo parse = com.realsil.sdk.bbpro.equalizer.EqParameterInfo.parse(bArr2);
        if (parse != null) {
            com.realsil.sdk.core.logger.ZLogger.v(parse.toString());
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq(parse.stageNum, parse.globalGain, parse.samplingFreqIndex, parse.accuracy, parse.freq, parse.q, parse.gains, parse.biquadType, null);
        } else {
            com.realsil.sdk.core.logger.ZLogger.d("invalid EqParameterInfo");
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq();
        }
        return new com.realsil.sdk.bbpro.equalizer.EqIndex(0, b2, b, format, true, b5, null, bArr2, audioEq);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex e(byte[] bArr) {
        int i;
        com.realsil.sdk.bbpro.equalizer.AudioEq audioEq;
        if (bArr == null || bArr.length < 8) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        java.lang.String format = b2 == 1 ? java.lang.String.format(java.util.Locale.US, "Gaming EQ %d", java.lang.Byte.valueOf(b)) : b2 == 2 ? java.lang.String.format(java.util.Locale.US, "ANC EQ %d", java.lang.Byte.valueOf(b)) : java.lang.String.format(java.util.Locale.US, "Normal EQ %d", java.lang.Byte.valueOf(b));
        int i2 = ((bArr[5] << 8) | (bArr[4] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        byte b5 = bArr[6];
        if (bArr.length < i2 + 6 || i2 - 1 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "invalid eqData, packet.length=%d, eqDataLen=0x%04x(%d)", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i2)));
            return null;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 7, bArr2, 0, i);
        com.realsil.sdk.bbpro.equalizer.EqParameterInfo parseV11 = com.realsil.sdk.bbpro.equalizer.EqParameterInfo.parseV11(bArr2);
        if (parseV11 != null) {
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq(parseV11.stageNum, parseV11.globalGain, parseV11.samplingFreqIndex, parseV11.accuracy, parseV11.freq, parseV11.q, parseV11.gains, parseV11.biquadType, null);
        } else {
            com.realsil.sdk.core.logger.ZLogger.d("invalid EqParameterInfo");
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq();
        }
        return new com.realsil.sdk.bbpro.equalizer.EqIndex(0, b2, b, format, true, b5, null, bArr2, audioEq);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex f(byte[] bArr) {
        int i;
        com.realsil.sdk.bbpro.equalizer.AudioEq audioEq;
        if (bArr == null || bArr.length < 8) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        byte b5 = bArr[4];
        java.lang.String format = b2 == 0 ? b3 == 1 ? java.lang.String.format(java.util.Locale.US, "Gaming EQ %d", java.lang.Byte.valueOf(b)) : b3 == 2 ? java.lang.String.format(java.util.Locale.US, "ANC EQ %d", java.lang.Byte.valueOf(b)) : java.lang.String.format(java.util.Locale.US, "Normal EQ %d", java.lang.Byte.valueOf(b)) : java.lang.String.format(java.util.Locale.US, "APT EQ %d", java.lang.Byte.valueOf(b));
        int i2 = ((bArr[5] & 255) | (bArr[6] << 8)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        byte b6 = bArr[7];
        if (bArr.length < i2 + 6 || i2 - 1 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "invalid eqData, packet.length=%d, eqDataLen=0x%04x(%d)", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i2)));
            return null;
        }
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 8, bArr2, 0, i);
        com.realsil.sdk.bbpro.equalizer.EqParameterInfo parseV11 = com.realsil.sdk.bbpro.equalizer.EqParameterInfo.parseV11(bArr2);
        if (parseV11 != null) {
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq(parseV11.stageNum, parseV11.globalGain, parseV11.samplingFreqIndex, parseV11.accuracy, parseV11.freq, parseV11.q, parseV11.gains, parseV11.biquadType, null);
        } else {
            com.realsil.sdk.core.logger.ZLogger.v("invalid EqParameterInfo");
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq();
        }
        return new com.realsil.sdk.bbpro.equalizer.EqIndex(b2, b3, b, format, true, b6, null, bArr2, audioEq);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex g(byte[] bArr) {
        int i;
        byte[] bArr2;
        com.realsil.sdk.bbpro.equalizer.AudioEq audioEq;
        if (bArr == null || bArr.length < 8) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        byte b5 = bArr[4];
        byte b6 = bArr[5];
        java.lang.String format = b3 == 0 ? b4 == 1 ? java.lang.String.format(java.util.Locale.US, "Gaming EQ %d", java.lang.Byte.valueOf(b)) : b4 == 2 ? java.lang.String.format(java.util.Locale.US, "ANC EQ %d", java.lang.Byte.valueOf(b)) : java.lang.String.format(java.util.Locale.US, "Normal EQ %d", java.lang.Byte.valueOf(b)) : java.lang.String.format(java.util.Locale.US, "APT EQ %d", java.lang.Byte.valueOf(b));
        int i2 = ((bArr[7] << 8) | (bArr[6] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        byte b7 = bArr[8];
        if (bArr.length < i2 + 6 || i2 - 1 <= 0) {
            com.realsil.sdk.core.logger.ZLogger.d(java.lang.String.format(java.util.Locale.US, "invalid eqData, packet.length=%d, eqDataLen=0x%04x(%d)", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i2)));
            return null;
        }
        byte[] bArr3 = new byte[i];
        java.lang.System.arraycopy(bArr, 9, bArr3, 0, i);
        com.realsil.sdk.bbpro.equalizer.EqParameterInfo parseV11 = com.realsil.sdk.bbpro.equalizer.EqParameterInfo.parseV11(bArr3);
        if (parseV11 != null) {
            bArr2 = bArr3;
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq(parseV11.stageNum, parseV11.globalGain, parseV11.samplingFreqIndex, parseV11.accuracy, parseV11.freq, parseV11.q, parseV11.gains, parseV11.biquadType, null);
        } else {
            bArr2 = bArr3;
            com.realsil.sdk.core.logger.ZLogger.v("invalid EqParameterInfo");
            audioEq = new com.realsil.sdk.bbpro.equalizer.AudioEq();
        }
        return new com.realsil.sdk.bbpro.equalizer.EqIndex(b2, b3, b4, b, format, true, b7, null, bArr2, audioEq);
    }

    public static com.realsil.sdk.bbpro.equalizer.EqIndex parse(int i, byte[] bArr) {
        return (i == 2 || i == 3) ? b(bArr) : (i == 4 || i == 5) ? c(bArr) : i == 256 ? d(bArr) : i == 257 ? e(bArr) : i == 258 ? f(bArr) : i >= 512 ? g(bArr) : a(bArr);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.realsil.sdk.bbpro.equalizer.EqIndex)) {
            return false;
        }
        com.realsil.sdk.bbpro.equalizer.EqIndex eqIndex = (com.realsil.sdk.bbpro.equalizer.EqIndex) obj;
        return this.eqType == eqIndex.eqType && this.mode == eqIndex.mode && this.index == eqIndex.index;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EqIndex {");
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\neqType=%d, eqMode=%d, index=%d, nickname=%s, sampleRate=0x%02X", java.lang.Integer.valueOf(this.eqType), java.lang.Integer.valueOf(this.mode), java.lang.Integer.valueOf(this.index), this.nickName, java.lang.Byte.valueOf(this.sampleRate)));
        byte[] bArr = this.eqData;
        if (bArr != null) {
            sb.append(java.lang.String.format(locale, "\neqData=(%d)%s", java.lang.Integer.valueOf(bArr.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.eqData)));
        }
        byte[] bArr2 = this.eqInfo;
        if (bArr2 != null) {
            sb.append(java.lang.String.format(locale, "\neqInfo=(%d)%s", java.lang.Integer.valueOf(bArr2.length), com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.eqInfo)));
        }
        if (this.audioEq != null) {
            sb.append("\n\t" + this.audioEq.toString());
        }
        sb.append("\n}");
        return sb.toString();
    }

    public EqIndex(int i, int i2, java.lang.String str, boolean z, byte b, byte[] bArr) {
        this.eqBud = 2;
        this.eqType = 0;
        this.mode = i;
        this.index = i2;
        this.nickName = str;
        this.modified = z;
        this.sampleRate = b;
        this.eqData = bArr;
    }

    public EqIndex(int i, int i2, int i3, java.lang.String str, boolean z, byte b, byte[] bArr, byte[] bArr2, com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        this(2, i, i2, i3, str, z, b, bArr, bArr2, audioEq);
    }

    public EqIndex(int i, int i2, int i3, int i4, java.lang.String str, boolean z, byte b, byte[] bArr, byte[] bArr2, com.realsil.sdk.bbpro.equalizer.AudioEq audioEq) {
        this.eqBud = i;
        this.eqType = i2;
        this.mode = i3;
        this.index = i4;
        this.nickName = str;
        this.modified = z;
        this.sampleRate = b;
        this.eqData = bArr;
        this.eqInfo = bArr2;
        this.audioEq = audioEq;
    }
}
