package com.qcwireless.qc_utils.bytes;

/* loaded from: /tmp/dex/classes2.dex */
public class DataTransferUtils {
    public static int enableWeek(int i) {
        return i & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4;
    }

    public static byte[] intToBytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] shortToBytes(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static java.lang.String getHexString(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (bArr != null) {
            for (byte b : bArr) {
                java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = '0' + hexString;
                }
                sb.append(hexString);
            }
        }
        return sb.toString();
    }

    public static int bytesToInt(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int byte2Int(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static short bytesToShort(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static int arrays2Int(byte[] bArr) {
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        if (bArr.length == 2) {
            return bytesToInt(bArr);
        }
        if (bArr.length == 4) {
            return bytesToInt(bArr, 0);
        }
        return -1;
    }

    public static int bytesToInt(byte[] bArr) {
        int i;
        int i2;
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        if (bArr.length == 4) {
            i = (bArr[0] & 255) | ((bArr[1] << 8) & 65280) | ((bArr[2] << 16) & 16711680);
            i2 = (bArr[3] << 24) & (-16777216);
        } else if (bArr.length == 2) {
            i = bArr[0] & 255;
            i2 = (bArr[1] << 8) & 65280;
        } else {
            if (bArr.length != 3) {
                return 0;
            }
            i = (bArr[0] & 255) | ((bArr[1] << 8) & 65280);
            i2 = (bArr[2] << 16) & 16711680;
        }
        return i | i2;
    }

    public static float bytes2Float(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(bytesToInt(bArr, i));
    }
}
