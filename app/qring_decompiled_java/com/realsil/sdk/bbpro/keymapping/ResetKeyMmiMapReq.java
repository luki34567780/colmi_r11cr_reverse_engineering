package com.realsil.sdk.bbpro.keymapping;

/* loaded from: /tmp/dex/classes2.dex */
public final class ResetKeyMmiMapReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public static final byte BUD_TYPE_ALL = 3;
    public static final byte BUD_TYPE_LCH = 1;
    public static final byte BUD_TYPE_RCH = 2;
    public static final byte BUD_TYPE_RESERVE = -1;
    public static final byte BUD_TYPE_STEREO = 0;
    public byte a;

    public static java.util.List<com.realsil.sdk.bbpro.model.KeyMmiSettings> decodeKeyMmiSettings(byte[] bArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (bArr != null && bArr.length > 0) {
            int i = bArr[0] & 255;
            if (bArr.length >= (i * 4) + 1) {
                for (int i2 = 0; i2 < i; i2++) {
                    com.realsil.sdk.bbpro.model.KeyMmiSettings keyMmiSettings = new com.realsil.sdk.bbpro.model.KeyMmiSettings();
                    int i3 = i2 * 4;
                    keyMmiSettings.setBud(bArr[i3 + 1]);
                    keyMmiSettings.setScenario(bArr[i3 + 2]);
                    keyMmiSettings.setClickType(bArr[i3 + 3]);
                    keyMmiSettings.setMmiIndex(bArr[i3 + 4]);
                    arrayList.add(keyMmiSettings);
                }
            }
        }
        return arrayList;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 1799;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getEventId() {
        return (short) 1795;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.format("ResetKeyMmiMapReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())));
        byte b = this.a;
        if (b != -1) {
            sb.append(java.lang.String.format("\n\tbudType=0x%02X", java.lang.Byte.valueOf(b)));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static class Builder {
        public byte a;

        public Builder() {
            this.a = (byte) -1;
        }

        public com.realsil.sdk.bbpro.keymapping.ResetKeyMmiMapReq build() {
            return new com.realsil.sdk.bbpro.keymapping.ResetKeyMmiMapReq(this.a);
        }

        public Builder(byte b) {
            this.a = b;
        }
    }

    public ResetKeyMmiMapReq(byte b) {
        this.a = b;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        byte b = this.a;
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), b != -1 ? new byte[]{b} : null).eventId(getEventId()).build();
    }
}
