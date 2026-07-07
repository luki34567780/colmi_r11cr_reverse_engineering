package com.realsil.sdk.bbpro.vp;

/* loaded from: classes3.dex */
public final class VpToneVolumeLevelSetRsp {
    public byte leftCurVolumeLevel;
    public int leftMaxVolumeLevel;
    public int leftMinVolumeLevel;
    public byte rightCurVolumeLevel;
    public int rightMaxVolumeLevel;
    public int rightMinVolumeLevel;
    public boolean rwsSyncEnabled;
    public boolean rwsSyncSupported;
    public int status;

    public VpToneVolumeLevelSetRsp(int i, int i2, int i3, byte b, int i4, int i5, byte b2, boolean z, boolean z2) {
        this.status = i;
        this.leftMinVolumeLevel = i2;
        this.leftMaxVolumeLevel = i3;
        this.leftCurVolumeLevel = b;
        this.rightMinVolumeLevel = i4;
        this.rightMaxVolumeLevel = i5;
        this.rightCurVolumeLevel = b2;
        this.rwsSyncSupported = z;
        this.rwsSyncEnabled = z2;
    }

    public static com.realsil.sdk.bbpro.vp.VpToneVolumeLevelSetRsp parse(byte[] bArr) {
        boolean z;
        if (bArr == null || bArr.length < 7) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        boolean z2 = false;
        byte b = bArr[0];
        int i = bArr[1] & 255;
        int i2 = bArr[2] & 255;
        byte b2 = bArr[3];
        int i3 = bArr[4] & 255;
        int i4 = bArr[5] & 255;
        byte b3 = bArr[6];
        if (bArr.length >= 8 && (bArr[7] & 255) != 255) {
            z2 = true;
            if ((bArr[7] & 1) == 1) {
                z = true;
                return new com.realsil.sdk.bbpro.vp.VpToneVolumeLevelSetRsp(b, i, i2, b2, i3, i4, b3, z2, z);
            }
        }
        z = false;
        return new com.realsil.sdk.bbpro.vp.VpToneVolumeLevelSetRsp(b, i, i2, b2, i3, i4, b3, z2, z);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "VpToneVolumeLevelSetRsp { status=0x%02X", java.lang.Integer.valueOf(this.status)));
        if (this.rwsSyncSupported) {
            sb.append(java.lang.String.format("\n\trwsSyncEnabled=%b", java.lang.Boolean.valueOf(this.rwsSyncEnabled)));
        } else {
            sb.append(java.lang.String.format("\n\trwsSyncSupported=%b", java.lang.Boolean.FALSE));
        }
        sb.append(java.lang.String.format(locale, "\n\tL=%d/(%d~%d)", java.lang.Byte.valueOf(this.leftCurVolumeLevel), java.lang.Integer.valueOf(this.leftMinVolumeLevel), java.lang.Integer.valueOf(this.leftMaxVolumeLevel)));
        sb.append(java.lang.String.format(locale, "\n\tR=%d/(%d~%d)", java.lang.Byte.valueOf(this.rightCurVolumeLevel), java.lang.Integer.valueOf(this.rightMinVolumeLevel), java.lang.Integer.valueOf(this.rightMaxVolumeLevel)));
        sb.append("\n}");
        return sb.toString();
    }

    public com.realsil.sdk.bbpro.vp.VpVolumeInfo toVpVolumeInfo() {
        return new com.realsil.sdk.bbpro.vp.VpVolumeInfo(this.leftMinVolumeLevel, this.leftMaxVolumeLevel, this.leftCurVolumeLevel, this.rightMinVolumeLevel, this.rightMaxVolumeLevel, this.rightCurVolumeLevel, this.rwsSyncSupported, this.rwsSyncEnabled);
    }
}
