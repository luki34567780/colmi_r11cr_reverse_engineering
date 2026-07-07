package com.realsil.sdk.bbpro.profile;

/* loaded from: /tmp/dex/classes2.dex */
public final class SetCfgSettingsReq extends com.realsil.sdk.bbpro.profile.AppReq {
    public byte a;
    public byte[] b;
    public boolean c;

    public static class Builder {
        public byte a;
        public byte[] b;
        public boolean c = false;

        public Builder(byte b) {
            this.a = b;
        }

        public com.realsil.sdk.bbpro.profile.SetCfgSettingsReq.Builder assembleDataLength(boolean z) {
            this.c = z;
            return this;
        }

        public com.realsil.sdk.bbpro.profile.SetCfgSettingsReq build() {
            return new com.realsil.sdk.bbpro.profile.SetCfgSettingsReq(this.a, this.b, this.c);
        }

        public com.realsil.sdk.bbpro.profile.SetCfgSettingsReq.Builder cfgData(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public static byte[] combineSingleDeviceId(java.lang.String str, java.lang.String str2) {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2.getBytes();
        byte[] bArr = new byte[24];
        if (bytes.length <= 12) {
            java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        }
        if (bytes2.length <= 12) {
            java.lang.System.arraycopy(bytes2, 0, bArr, 12, bytes2.length);
        }
        return bArr;
    }

    public static byte[] wrapperDeviceId(java.lang.String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[12];
        if (bytes.length <= 12) {
            java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        }
        return bArr;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode(int i) {
        return encode();
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public short getCommandId() {
        return (short) 18;
    }

    public java.lang.String toString() {
        return java.lang.String.format("SetCfgSettingsReq(0x%04X) {", java.lang.Short.valueOf(getCommandId())) + java.lang.String.format("\n\ttype=0x%02X", java.lang.Byte.valueOf(this.a)) + java.lang.String.format("\n\tdata=%s", com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.b)) + "\n}";
    }

    public SetCfgSettingsReq(byte b, byte[] bArr, boolean z) {
        this.a = b;
        this.b = bArr;
        this.c = z;
    }

    @Override // com.realsil.sdk.bbpro.profile.AppReq
    public com.realsil.sdk.bbpro.core.transportlayer.Command encode() {
        byte[] bArr;
        byte[] bArr2 = this.b;
        int length = bArr2 != null ? bArr2.length : 0;
        if (this.c) {
            bArr = new byte[length + 2];
            bArr[0] = this.a;
            bArr[1] = (byte) (length & 255);
            if (length > 0) {
                java.lang.System.arraycopy(bArr2, 0, bArr, 2, length);
            }
        } else {
            bArr = new byte[length + 1];
            bArr[0] = this.a;
            if (length > 0) {
                java.lang.System.arraycopy(bArr2, 0, bArr, 1, length);
            }
        }
        return new com.realsil.sdk.bbpro.core.transportlayer.Command.Builder().writeType(2).packet(getCommandId(), bArr).eventId(getEventId()).build();
    }
}
