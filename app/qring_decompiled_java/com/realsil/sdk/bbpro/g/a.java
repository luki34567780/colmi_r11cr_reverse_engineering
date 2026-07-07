package com.realsil.sdk.bbpro.g;

/* loaded from: /tmp/dex/classes2.dex */
public final class a extends com.realsil.sdk.bbpro.profile.AppReq {
    public byte a;

    public static class b {
        public byte a;

        public b(byte b) {
            this.a = b;
        }

        public com.realsil.sdk.bbpro.g.a a() {
            return new com.realsil.sdk.bbpro.g.a(this.a);
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 3106;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3106;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetLlAptInfoReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format(java.util.Locale.US, "\n\tType=0x%02x", java.lang.Byte.valueOf(this.a)) + "\n}";
    }

    public a(byte b2) {
        this.a = b2;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{this.a}).eventId(getEventId()).build();
    }
}
