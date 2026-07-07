package com.realsil.sdk.bbpro.vendor;

/* loaded from: classes3.dex */
public final class GetFwVersionReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public static final byte TYPE_OTA_PRIMARY_FW_VERSION = 2;
    public static final byte TYPE_OTA_SECONDARY_FW_VERSION = 3;
    public static final byte TYPE_PRIMARY_FW_VERSION = 0;
    public static final byte TYPE_PRIMARY_UI_OTA_VERSION = 4;
    public static final byte TYPE_SECONDARY_FW_VERSION = 1;
    public static final byte TYPE_SECONDARY_UI_OTA_VERSION = 5;
    public byte a;

    public static class Builder {
        public byte a;

        public Builder(byte b) {
            this.a = b;
        }

        public com.realsil.sdk.bbpro.vendor.GetFwVersionReq build() {
            return new com.realsil.sdk.bbpro.vendor.GetFwVersionReq(this.a);
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 776;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 2313;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetFwVersionReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format("\n\ttype=0x%02X", java.lang.Byte.valueOf(this.a)) + "\n}";
    }

    public GetFwVersionReq(byte b) {
        this.a = b;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{this.a}).eventId(getEventId()).build();
    }
}
