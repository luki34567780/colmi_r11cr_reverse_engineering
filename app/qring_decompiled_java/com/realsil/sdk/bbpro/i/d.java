package com.realsil.sdk.bbpro.i;

/* loaded from: /tmp/dex/classes2.dex */
public final class d extends com.realsil.sdk.bbpro.profile.AppReq {

    public static class b {
        public com.realsil.sdk.bbpro.i.d a() {
            return new com.realsil.sdk.bbpro.i.d();
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 3585;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3584;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetGamingModeStatusReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + "\n}";
    }

    public d() {
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), null).eventId(getEventId()).build();
    }
}
