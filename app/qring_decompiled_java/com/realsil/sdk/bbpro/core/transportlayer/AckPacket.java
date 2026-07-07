package com.realsil.sdk.bbpro.core.transportlayer;

/* loaded from: /tmp/dex/classes2.dex */
public class AckPacket {
    public static final byte ACK_STATUS_BUSY = 4;
    public static final byte ACK_STATUS_COMPLETE = 0;
    public static final byte ACK_STATUS_DISALLOW = 1;
    public static final byte ACK_STATUS_PARAMETERS_ERROR = 3;
    public static final byte ACK_STATUS_PROCESS_FAIL = 5;
    public static final byte ACK_STATUS_UNKNOWN_COMMAND = 2;
    public static final byte CMD_SET_STATUS_VERSION_INCOMPATIBLE = 7;
    public short a = 0;
    public byte b = 0;

    public static com.realsil.sdk.bbpro.core.transportlayer.AckPacket builder(byte[] bArr) {
        com.realsil.sdk.bbpro.core.transportlayer.AckPacket ackPacket = new com.realsil.sdk.bbpro.core.transportlayer.AckPacket();
        if (ackPacket.parse(bArr)) {
            return ackPacket;
        }
        return null;
    }

    public static byte[] encode(short s, byte b) {
        return new byte[]{0, 0, (byte) (s & 255), (byte) ((s >> 8) & 255), b};
    }

    public byte getStatus() {
        return this.b;
    }

    public short getToAckId() {
        return this.a;
    }

    public boolean parse(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return false;
        }
        this.a = (short) (((bArr[0] & 255) | (bArr[1] << 8)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER);
        this.b = (byte) (bArr[2] & 255);
        return true;
    }

    public java.lang.String toString() {
        return "ACK {" + java.lang.String.format(java.util.Locale.US, "\n\topcode=0x%04X, status=0x%02X", java.lang.Short.valueOf(this.a), java.lang.Byte.valueOf(this.b)) + "\n}";
    }
}
