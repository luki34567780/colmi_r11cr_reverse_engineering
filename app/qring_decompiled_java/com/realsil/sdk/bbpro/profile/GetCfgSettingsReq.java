package com.realsil.sdk.bbpro.profile;

/* loaded from: /tmp/dex/classes2.dex */
public final class GetCfgSettingsReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public byte a;

    public static class Builder {
        public byte a;

        public Builder(byte b) {
            this.a = b;
        }

        public com.realsil.sdk.bbpro.profile.GetCfgSettingsReq build() {
            return new com.realsil.sdk.bbpro.profile.GetCfgSettingsReq(this.a);
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 23;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 24;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetCfgSettingsReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format("\n\ttype=0x%02X", java.lang.Byte.valueOf(this.a)) + "\n}";
    }

    public GetCfgSettingsReq(byte b) {
        this.a = b;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{this.a}).eventId(getEventId()).build();
    }
}
