package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class GetEqInfoReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public static final byte QUERY_TYPE_EQ_ENTRY_NUMBER = 1;
    public static final byte QUERY_TYPE_EQ_STATE = 0;
    public byte a;

    public static class Builder {
        public byte a;

        public Builder(byte b) {
            this.a = b;
        }

        public com.realsil.sdk.bbpro.equalizer.GetEqInfoReq build() {
            return new com.realsil.sdk.bbpro.equalizer.GetEqInfoReq(this.a);
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 512;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 512;
    }

    public byte getQueryType() {
        return this.a;
    }

    public java.lang.String toString() {
        return "GetEqInfoReq {" + java.lang.String.format(java.util.Locale.US, "\nqueryType=%d", java.lang.Byte.valueOf(this.a)) + "\n}";
    }

    public GetEqInfoReq(byte b) {
        this.a = b;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{this.a}).eventId(getEventId()).build();
    }
}
