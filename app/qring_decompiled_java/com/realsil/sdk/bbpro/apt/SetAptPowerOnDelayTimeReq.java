package com.realsil.sdk.bbpro.apt;

/* loaded from: /tmp/dex/classes2.dex */
public final class SetAptPowerOnDelayTimeReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public int time;

    public static class Builder {
        public int a;

        public Builder(int i) {
            this.a = i;
        }

        public com.realsil.sdk.bbpro.apt.SetAptPowerOnDelayTimeReq build() {
            return new com.realsil.sdk.bbpro.apt.SetAptPowerOnDelayTimeReq(this.a);
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 3130;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3129;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SetAptPowerOnDelayTimeReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format(java.util.Locale.US, "\n\ttime=0x%02X(%d)", java.lang.Integer.valueOf(this.time), java.lang.Integer.valueOf(this.time)) + "\n}";
    }

    public SetAptPowerOnDelayTimeReq(int i) {
        this.time = i;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{(byte) this.time}).eventId(getEventId()).build();
    }
}
