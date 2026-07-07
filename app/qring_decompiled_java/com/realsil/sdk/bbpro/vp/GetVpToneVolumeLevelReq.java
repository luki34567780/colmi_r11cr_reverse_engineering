package com.realsil.sdk.bbpro.vp;

/* loaded from: classes3.dex */
public final class GetVpToneVolumeLevelReq extends com.realsil.sdk.bbpro.profile.AppReq {

    public static class Builder {
        public com.realsil.sdk.bbpro.vp.GetVpToneVolumeLevelReq build() {
            return new com.realsil.sdk.bbpro.vp.GetVpToneVolumeLevelReq();
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 530;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 521;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetVpToneVolumeLevelReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + "\n}";
    }

    public GetVpToneVolumeLevelReq() {
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), null).eventId(getEventId()).build();
    }
}
