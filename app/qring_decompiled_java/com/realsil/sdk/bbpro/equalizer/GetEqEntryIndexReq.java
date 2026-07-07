package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class GetEqEntryIndexReq {
    public int a;
    public int b;

    public static class Builder {
        public int a;
        public int b;

        public Builder(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq build() {
            return new com.realsil.sdk.bbpro.equalizer.GetEqEntryIndexReq(this.a, this.b);
        }
    }

    public byte[] encode(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            return i >= 4 ? com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 518, new byte[]{(byte) this.b}) : this.b == 1 ? com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 3587) : com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 518);
        }
        if (i2 == 1) {
            return com.realsil.sdk.bbpro.core.protocol.CommandContract.buildPacket((short) 524);
        }
        return null;
    }

    public int getEqMode() {
        return this.b;
    }

    public int getEqType() {
        return this.a;
    }

    public java.lang.String toString() {
        return "GetEqEntryIndexReq {" + java.lang.String.format(java.util.Locale.US, "\neqType=%d,eqMode=%d", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)) + "\n}";
    }

    public GetEqEntryIndexReq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
