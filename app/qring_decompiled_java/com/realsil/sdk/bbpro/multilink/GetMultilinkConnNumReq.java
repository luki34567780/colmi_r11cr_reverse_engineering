package com.realsil.sdk.bbpro.multilink;

/* loaded from: /tmp/dex/classes2.dex */
public final class GetMultilinkConnNumReq extends com.realsil.sdk.bbpro.profile.AppReq {

    public static class Builder {
        public com.realsil.sdk.bbpro.multilink.GetMultilinkConnNumReq build() {
            return new com.realsil.sdk.bbpro.multilink.GetMultilinkConnNumReq();
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 789;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 789;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetMultilinkConnNumReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + "\n}";
    }

    public GetMultilinkConnNumReq() {
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), null).eventId(getEventId()).build();
    }
}
