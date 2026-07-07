package com.oudmon.ble.base.communication.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class CRC16 {
    public static int calcCrc16(byte[] bArr) {
        if (bArr.length == 0) {
            return com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        }
        int i = com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
        for (byte b : bArr) {
            i ^= b & 255;
            for (int i2 = 0; i2 < 8; i2++) {
                i = (i & 1) != 0 ? (i >> 1) ^ 40961 : i >> 1;
            }
        }
        return i & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
    }
}
