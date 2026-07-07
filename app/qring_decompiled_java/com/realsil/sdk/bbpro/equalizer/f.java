package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class f extends com.realsil.sdk.bbpro.profile.AppReq {
    public int a;

    public static class b {
        public int a;

        public com.realsil.sdk.bbpro.equalizer.f.b a(int i) {
            this.a = i;
            return this;
        }

        public com.realsil.sdk.bbpro.equalizer.f a() {
            return new com.realsil.sdk.bbpro.equalizer.f(this.a);
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 528;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 520;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetEqBasicInfo {");
        int i = this.a;
        if ((i & 255) != 255) {
            sb.append(java.lang.String.format(java.util.Locale.US, "\n\tmode=0x%02X", java.lang.Integer.valueOf(i)));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public f(int i) {
        this.a = i;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        int i = this.a & 255;
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), i != 255 ? new byte[]{(byte) i} : null).eventId(getEventId()).build();
    }
}
