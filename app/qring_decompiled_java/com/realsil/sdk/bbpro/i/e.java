package com.realsil.sdk.bbpro.i;

/* loaded from: /tmp/dex/classes2.dex */
public final class e extends com.realsil.sdk.bbpro.profile.AppReq {
    public int a;
    public int b;

    public static class b {
        public int a;
        public int b;

        public com.realsil.sdk.bbpro.i.e.b a(int i) {
            this.a = i;
            return this;
        }

        public com.realsil.sdk.bbpro.i.e.b b(int i) {
            this.b = i;
            return this;
        }

        public com.realsil.sdk.bbpro.i.e a() {
            return new com.realsil.sdk.bbpro.i.e(this.a, this.b);
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 12;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 17;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SyncCmdSetVersionReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format("\n\tcmdSetVersion=0x%04X, eqSpecVersion=0x%04X", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)) + "\n}";
    }

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        int i = this.a;
        int i2 = this.b;
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{0, (byte) ((i >> 8) & 255), (byte) (i & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)}).eventId(getEventId()).build();
    }
}
