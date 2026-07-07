package com.realsil.sdk.bbpro.anc;

/* loaded from: /tmp/dex/classes2.dex */
public final class SetAncScenarioChooseTryReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public static final byte LL_APT_OFF = 0;
    public static final byte LL_APT_ON = 1;
    public byte a;
    public int b;
    public byte c;
    public int d;

    public static class Builder {
        public byte a;
        public int b;
        public byte c;
        public int d;

        public com.realsil.sdk.bbpro.anc.SetAncScenarioChooseTryReq build() {
            return new com.realsil.sdk.bbpro.anc.SetAncScenarioChooseTryReq(this.a, this.b, this.c, this.d);
        }

        public com.realsil.sdk.bbpro.anc.SetAncScenarioChooseTryReq.Builder lch(byte b, int i) {
            this.a = b;
            this.b = i;
            return this;
        }

        public com.realsil.sdk.bbpro.anc.SetAncScenarioChooseTryReq.Builder rch(byte b, int i) {
            this.c = b;
            this.d = i;
            return this;
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 3141;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3141;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SetAncScenarioChooseTryReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format(java.util.Locale.US, "\n\tL=0x%02x-%d,R=0x%02x-%d)", java.lang.Byte.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Byte.valueOf(this.c), java.lang.Integer.valueOf(this.d)) + "\n}";
    }

    public SetAncScenarioChooseTryReq(byte b, int i, byte b2, int i2) {
        this.a = b;
        this.b = i;
        this.c = b2;
        this.d = i2;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{this.a, (byte) this.b, this.c, (byte) this.d}).eventId(getEventId()).build();
    }
}
