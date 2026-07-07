package com.realsil.sdk.bbpro.spatialaudio;

/* loaded from: /tmp/dex/classes2.dex */
public final class SetSpatialAudioReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public static final byte SPATIAL_AUDIO_CLOSE = 0;
    public static final byte SPATIAL_AUDIO_NO_CHANGE = 2;
    public static final byte SPATIAL_AUDIO_OPEN = 1;
    public byte a;

    public static class Builder {
        public byte a;

        public com.realsil.sdk.bbpro.spatialaudio.SetSpatialAudioReq build() {
            return new com.realsil.sdk.bbpro.spatialaudio.SetSpatialAudioReq(this.a);
        }

        public com.realsil.sdk.bbpro.spatialaudio.SetSpatialAudioReq.Builder mode(byte b) {
            this.a = b;
            return this;
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 534;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SetSpatialAudioReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format("\n\tmode=0x%02X", java.lang.Byte.valueOf(this.a)) + "\n}";
    }

    public SetSpatialAudioReq(byte b) {
        this.a = b;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{this.a}).eventId(getEventId()).build();
    }
}
