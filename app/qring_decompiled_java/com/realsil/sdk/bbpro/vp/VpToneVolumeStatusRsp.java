package com.realsil.sdk.bbpro.vp;

/* loaded from: classes3.dex */
public final class VpToneVolumeStatusRsp {
    public byte leftCurVolumeLevel;
    public int leftMaxVolumeLevel;
    public int leftMinVolumeLevel;
    public byte rightCurVolumeLevel;
    public int rightMaxVolumeLevel;
    public int rightMinVolumeLevel;
    public boolean rwsSyncEnabled;
    public boolean rwsSyncSupported;

    public VpToneVolumeStatusRsp(int i, int i2, byte b, int i3, int i4, byte b2, boolean z, boolean z2) {
        this.leftMinVolumeLevel = i;
        this.leftMaxVolumeLevel = i2;
        this.leftCurVolumeLevel = b;
        this.rightMinVolumeLevel = i3;
        this.rightMaxVolumeLevel = i4;
        this.rightCurVolumeLevel = b2;
        this.rwsSyncSupported = z;
        this.rwsSyncEnabled = z2;
    }

    public static com.realsil.sdk.bbpro.vp.VpToneVolumeStatusRsp parse(byte[] bArr) {
        boolean z;
        boolean z2;
        if (bArr == null || bArr.length < 6) {
            com.realsil.sdk.core.logger.ZLogger.v("invalid packet");
            return null;
        }
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        byte b = bArr[2];
        int i3 = bArr[3] & 255;
        int i4 = bArr[4] & 255;
        byte b2 = bArr[5];
        if (bArr.length < 7 || (bArr[6] & 255) == 255) {
            z = false;
        } else {
            z = true;
            if ((bArr[6] & 1) == 1) {
                z2 = true;
                return new com.realsil.sdk.bbpro.vp.VpToneVolumeStatusRsp(i, i2, b, i3, i4, b2, z, z2);
            }
        }
        z2 = false;
        return new com.realsil.sdk.bbpro.vp.VpToneVolumeStatusRsp(i, i2, b, i3, i4, b2, z, z2);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VpToneVolumeStatusRsp {");
        if (this.rwsSyncSupported) {
            sb.append(java.lang.String.format("\n\trwsSyncEnabled=%b", java.lang.Boolean.valueOf(this.rwsSyncEnabled)));
        } else {
            sb.append(java.lang.String.format("\n\trwsSyncSupported=%b", java.lang.Boolean.FALSE));
        }
        java.util.Locale locale = java.util.Locale.US;
        sb.append(java.lang.String.format(locale, "\n\tL=%d/(%d~%d)", java.lang.Byte.valueOf(this.leftCurVolumeLevel), java.lang.Integer.valueOf(this.leftMinVolumeLevel), java.lang.Integer.valueOf(this.leftMaxVolumeLevel)));
        sb.append(java.lang.String.format(locale, "\n\tR=%d/(%d~%d)", java.lang.Byte.valueOf(this.rightCurVolumeLevel), java.lang.Integer.valueOf(this.rightMinVolumeLevel), java.lang.Integer.valueOf(this.rightMaxVolumeLevel)));
        sb.append("\n}");
        return sb.toString();
    }

    public com.realsil.sdk.bbpro.vp.VpVolumeInfo toVpVolumeInfo() {
        return new com.realsil.sdk.bbpro.vp.VpVolumeInfo(this.leftMinVolumeLevel, this.leftMaxVolumeLevel, this.leftCurVolumeLevel, this.rightMinVolumeLevel, this.rightMaxVolumeLevel, this.rightCurVolumeLevel, this.rwsSyncSupported, this.rwsSyncEnabled);
    }
}
