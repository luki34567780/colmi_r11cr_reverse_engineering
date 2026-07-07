package com.realsil.sdk.bbpro.llapt;

/* loaded from: /tmp/dex/classes2.dex */
public final class GetLlAptScenarioChooseInfoReq extends com.realsil.sdk.bbpro.profile.AppReq {

    public static class Builder {
        public com.realsil.sdk.bbpro.llapt.GetLlAptScenarioChooseInfoReq build() {
            return new com.realsil.sdk.bbpro.llapt.GetLlAptScenarioChooseInfoReq();
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 3126;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 3126;
    }

    public java.lang.String toString() {
        return java.lang.String.format("GetLlAptBrightnessInfoReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + "\n}";
    }

    public GetLlAptScenarioChooseInfoReq() {
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), null).eventId(getEventId()).build();
    }
}
