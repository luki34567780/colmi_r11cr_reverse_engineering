package com.realsil.sdk.bbpro.anc;

/* loaded from: /tmp/dex/classes2.dex */
public final class ClearAncScenarioChooseResultReq extends com.realsil.sdk.bbpro.profile.AppReq {

    public static class Builder {
        public com.realsil.sdk.bbpro.anc.ClearAncScenarioChooseResultReq build() {
            return new com.realsil.sdk.bbpro.anc.ClearAncScenarioChooseResultReq();
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
        return java.lang.String.format("ClearAncScenarioChooseResultReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + "\n}";
    }

    public ClearAncScenarioChooseResultReq() {
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), null).eventId(getEventId()).build();
    }
}
