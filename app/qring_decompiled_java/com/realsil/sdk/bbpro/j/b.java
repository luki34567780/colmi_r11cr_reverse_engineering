package com.realsil.sdk.bbpro.j;

/* loaded from: /tmp/dex/classes2.dex */
public final class b {
    public byte a;
    public com.realsil.sdk.bbpro.model.FwVersionInfo b;
    public com.realsil.sdk.bbpro.model.FwVersionInfo c;
    public com.realsil.sdk.bbpro.model.OtaFwVersionInfo d;
    public com.realsil.sdk.bbpro.model.OtaFwVersionInfo e;
    public com.realsil.sdk.bbpro.model.ImageVersionInfo f;
    public com.realsil.sdk.bbpro.model.ImageVersionInfo g;

    public b(byte b) {
        this.a = b;
    }

    public static com.realsil.sdk.bbpro.j.b a(byte[] bArr) {
        if ((bArr != null ? bArr.length : 0) < 1) {
            return null;
        }
        byte b = bArr[0];
        com.realsil.sdk.bbpro.j.b bVar = new com.realsil.sdk.bbpro.j.b(b);
        if (b == 0) {
            bVar.b = new com.realsil.sdk.bbpro.model.FwVersionInfo(bArr);
        } else if (b == 1) {
            bVar.c = new com.realsil.sdk.bbpro.model.FwVersionInfo(bArr);
        } else if (b == 2) {
            bVar.d = new com.realsil.sdk.bbpro.model.OtaFwVersionInfo(bArr);
        } else if (b == 3) {
            bVar.e = new com.realsil.sdk.bbpro.model.OtaFwVersionInfo(bArr);
        } else if (b == 4) {
            bVar.f = new com.realsil.sdk.bbpro.model.ImageVersionInfo(bArr);
        } else if (b == 5) {
            bVar.g = new com.realsil.sdk.bbpro.model.ImageVersionInfo(bArr);
        }
        return bVar;
    }

    public java.lang.String toString() {
        com.realsil.sdk.bbpro.model.ImageVersionInfo imageVersionInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FwVersionInfo{");
        sb.append(java.lang.String.format("type=0x%02X", java.lang.Byte.valueOf(this.a)));
        byte b = this.a;
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            if (b == 4) {
                com.realsil.sdk.bbpro.model.ImageVersionInfo imageVersionInfo2 = this.f;
                if (imageVersionInfo2 != null) {
                    sb.append(imageVersionInfo2.getFormattedVersion());
                }
            } else if (b == 5 && (imageVersionInfo = this.g) != null) {
                sb.append(imageVersionInfo.getFormattedVersion());
            }
        }
        sb.append("\n}");
        return sb.toString();
    }
}
