package com.realsil.sdk.bbpro.c;

/* loaded from: /tmp/dex/classes2.dex */
public class b extends com.realsil.sdk.bbpro.core.transportlayer.EventPacket {
    public short a;
    public short b;

    public static com.realsil.sdk.bbpro.c.b a(byte[] bArr) {
        com.realsil.sdk.bbpro.c.b bVar = new com.realsil.sdk.bbpro.c.b();
        if (bVar.parse(bArr)) {
            return bVar;
        }
        return null;
    }

    @Override // com.realsil.sdk.bbpro.core.transportlayer.EventPacket
    public boolean parse(byte[] bArr) {
        if (!super.parse(bArr)) {
            return false;
        }
        int i = this.paramsLen;
        if (i > 1) {
            byte[] bArr2 = this.mEventParams;
            this.a = (short) ((bArr2[0] & 255) | ((bArr2[1] << 8) & 65280));
        }
        if (i > 1) {
            byte[] bArr3 = this.mEventParams;
            this.b = (short) (((bArr3[3] << 8) & 65280) | (bArr3[2] & 255));
        }
        return true;
    }

    @Override // com.realsil.sdk.bbpro.core.transportlayer.EventPacket
    public java.lang.String toString() {
        return java.lang.String.format("currentIndex=0x%04X, supportedIndex=0x%04X ", java.lang.Short.valueOf(this.a), java.lang.Short.valueOf(this.b));
    }
}
