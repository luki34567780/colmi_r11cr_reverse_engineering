package com.realsil.sdk.bbpro.vp;

/* loaded from: classes3.dex */
public final class SetVpToneVolumeLevelReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public int a;
    public int b;
    public boolean rwsSyncEnabled;
    public boolean rwsSyncSupported;

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 529;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 522;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.format("SetVpToneVolumeLevelReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())));
        if (this.rwsSyncSupported) {
            sb.append(java.lang.String.format("\n\trwsSyncEnabled=%b", java.lang.Boolean.valueOf(this.rwsSyncEnabled)));
        } else {
            sb.append(java.lang.String.format("\n\trwsSyncSupported=%b", java.lang.Boolean.FALSE));
        }
        sb.append(java.lang.String.format(java.util.Locale.US, "\n\tL=%d,R=%d", java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b)));
        sb.append("\n}");
        return sb.toString();
    }

    public static class Builder {
        public int a;
        public int b;
        public boolean c = false;
        public boolean d = false;

        public com.realsil.sdk.bbpro.vp.SetVpToneVolumeLevelReq build() {
            return new com.realsil.sdk.bbpro.vp.SetVpToneVolumeLevelReq(this.a, this.b, this.c, this.d);
        }

        public com.realsil.sdk.bbpro.vp.SetVpToneVolumeLevelReq.Builder leftChannelVolumeLevel(int i) {
            this.a = i;
            return this;
        }

        public com.realsil.sdk.bbpro.vp.SetVpToneVolumeLevelReq.Builder rightChannelVolumeLevel(int i) {
            this.b = i;
            return this;
        }

        public com.realsil.sdk.bbpro.vp.SetVpToneVolumeLevelReq.Builder rwsSyncEnabled(boolean z) {
            this.c = true;
            this.d = z;
            return this;
        }

        public com.realsil.sdk.bbpro.vp.SetVpToneVolumeLevelReq.Builder volumeLevel(int i) {
            this.a = i;
            this.b = i;
            return this;
        }

        public com.realsil.sdk.bbpro.vp.SetVpToneVolumeLevelReq.Builder volumeLevel(int i, int i2) {
            this.a = i;
            this.b = i2;
            return this;
        }
    }

    public SetVpToneVolumeLevelReq(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.rwsSyncSupported = z;
        this.rwsSyncEnabled = z2;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), !this.rwsSyncSupported ? new byte[]{(byte) (this.a & 255), (byte) (this.b & 255)} : new byte[]{(byte) (this.a & 255), (byte) (this.b & 255), this.rwsSyncEnabled}).eventId(getEventId()).build();
    }
}
