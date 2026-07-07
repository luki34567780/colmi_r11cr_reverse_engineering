package com.realsil.sdk.bbpro.equalizer;

/* loaded from: /tmp/dex/classes2.dex */
public final class ResetEqDataReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public int a;
    public int b;
    public int c;
    public int d;

    public static class Builder {
        public int a;
        public int b;
        public int c;
        public int d = 2;

        public Builder(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public com.realsil.sdk.bbpro.equalizer.ResetEqDataReq build() {
            return new com.realsil.sdk.bbpro.equalizer.ResetEqDataReq(this.a, this.b, this.c, this.d);
        }

        public com.realsil.sdk.bbpro.equalizer.ResetEqDataReq.Builder eqBud(int i) {
            if (this.a == 0) {
                this.d = 2;
                return this;
            }
            this.d = i;
            return this;
        }
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 532;
    }

    public int getEqBud() {
        return this.d;
    }

    public int getEqIndex() {
        return this.c;
    }

    public int getEqMode() {
        return this.b;
    }

    public int getEqType() {
        return this.a;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 514;
    }

    public java.lang.String toString() {
        return "ResetEqDataReq {" + java.lang.String.format(java.util.Locale.US, "\neqType=%d,eqMode=%d,eqIndex=%d，eqBud=%d", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)) + "\n}";
    }

    public ResetEqDataReq(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), new byte[]{(byte) (this.a & 255), (byte) (this.b & 255), (byte) (this.c & 255), (byte) (this.d & 255)}).eventId(getEventId()).build();
    }
}
