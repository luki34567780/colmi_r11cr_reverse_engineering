package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class b extends com.realsil.sdk.bbpro.profile.AppReq {

    /* renamed from: com.realsil.sdk.bbpro.equalizer.b$b, reason: collision with other inner class name */
    public static class C0037b {
        public com.realsil.sdk.bbpro.equalizer.b a() {
            return new com.realsil.sdk.bbpro.equalizer.b();
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 513;
    }

    public java.lang.String toString() {
        return "EnableEqReq {\n}";
    }

    public b() {
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), null).eventId(getEventId()).build();
    }
}
