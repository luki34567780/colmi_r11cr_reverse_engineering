package com.realsil.sdk.bbpro.core.transportlayer;

/* loaded from: /tmp/dex/classes2.dex */
public class EventPacket {
    public int a;
    public byte[] mEventParams;
    public int paramsLen = 0;

    public static com.realsil.sdk.bbpro.core.transportlayer.EventPacket builderPacket(byte[] bArr) {
        com.realsil.sdk.bbpro.core.transportlayer.EventPacket eventPacket = new com.realsil.sdk.bbpro.core.transportlayer.EventPacket();
        if (eventPacket.parse(bArr)) {
            return eventPacket;
        }
        return null;
    }

    public int getEventId() {
        return this.a;
    }

    public byte[] getEventParams() {
        return this.mEventParams;
    }

    public boolean parse(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return false;
        }
        this.a = ((bArr[1] << 8) | (bArr[0] & 255)) & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        int length = bArr.length - 2;
        this.paramsLen = length;
        if (length > 0) {
            byte[] bArr2 = new byte[length];
            this.mEventParams = bArr2;
            java.lang.System.arraycopy(bArr, 2, bArr2, 0, length);
        } else {
            this.mEventParams = null;
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Event{");
        sb.append(java.lang.String.format(java.util.Locale.US, "eventId=0x%04X", java.lang.Integer.valueOf(this.a)));
        sb.append("\n\tparams: " + com.realsil.sdk.core.utility.DataConverter.bytes2Hex(this.mEventParams));
        sb.append("\n}");
        return sb.toString();
    }
}
