package com.realsil.sdk.bbpro.llapt;

/* loaded from: /tmp/dex/classes2.dex */
public final class SetLlAptScenarioChooseResultReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public int a;
    public int b;

    public static class Builder {
        public int a;
        public int b;

        public com.realsil.sdk.bbpro.llapt.SetLlAptScenarioChooseResultReq build() {
            return new com.realsil.sdk.bbpro.llapt.SetLlAptScenarioChooseResultReq(this.a, this.b);
        }

        public com.realsil.sdk.bbpro.llapt.SetLlAptScenarioChooseResultReq.Builder indicator(int i, int i2) {
            this.a = i;
            this.b = i2;
            return this;
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 3128;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3128;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SetLlAptScenarioChooseResultReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format(java.util.Locale.US, "\n\t L(%08X),R(%08X)", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)) + "\n}";
    }

    public SetLlAptScenarioChooseResultReq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        int i = this.a;
        int i2 = this.b;
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), (byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 24) & 255)}).eventId(getEventId()).build();
    }
}
