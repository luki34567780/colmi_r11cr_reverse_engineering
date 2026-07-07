package com.google.zxing.aztec.encoder;

/* loaded from: /tmp/dex/classes2.dex */
final class SimpleToken extends com.google.zxing.aztec.encoder.Token {
    private final short bitCount;
    private final short value;

    SimpleToken(com.google.zxing.aztec.encoder.Token token, int i, int i2) {
        super(token);
        this.value = (short) i;
        this.bitCount = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    void appendTo(com.google.zxing.common.BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public java.lang.String toString() {
        short s = this.value;
        short s2 = this.bitCount;
        return "<" + java.lang.Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.bitCount)).substring(1) + '>';
    }
}
