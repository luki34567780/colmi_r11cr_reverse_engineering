package com.realsil.sdk.bbpro.anc;

/* loaded from: /tmp/dex/classes2.dex */
public final class SetAncScenarioChooseResultReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public int a;
    public int b;

    public static class Builder {
        public int a;
        public int b;

        public com.realsil.sdk.bbpro.anc.SetAncScenarioChooseResultReq build() {
            return new com.realsil.sdk.bbpro.anc.SetAncScenarioChooseResultReq(this.a, this.b);
        }

        public com.realsil.sdk.bbpro.anc.SetAncScenarioChooseResultReq.Builder indicator(int i, int i2) {
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
        return (short) 3142;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3142;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SetAncScenarioChooseResultReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format(java.util.Locale.US, "\n\t L(%d),R(%d)", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)) + "\n}";
    }

    public SetAncScenarioChooseResultReq(int i, int i2) {
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
