package com.oudmon.ble.base.communication.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class ByteUtil {
    protected static final char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static byte[] byteToBitArray(int i) {
        return new byte[]{(byte) ((i >> 7) & 1), (byte) ((i >> 6) & 1), (byte) ((i >> 5) & 1), (byte) ((i >> 4) & 1), (byte) ((i >> 3) & 1), (byte) ((i >> 2) & 1), (byte) ((i >> 1) & 1), (byte) ((i >> 0) & 1)};
    }

    public static int byteToInt(byte b) {
        return b & 255;
    }

    public static int hiword(int i) {
        return i >>> 8;
    }

    public static byte int2byte(int i) {
        return (byte) (i & 255);
    }

    public static int loword(int i) {
        return i & com.realsil.sdk.audioconnect.localplayback.LocalPlaybackTransferEngine.MAX_SEQUENCE_NUMBER;
    }

    public static byte[] intToByte(int i, int i2) {
        if (i2 == 1) {
            byte[] bArr = new byte[i2];
            bArr[0] = (byte) (i & 255);
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = (byte) (i & 255);
        bArr2[1] = (byte) ((65280 & i) >> 8);
        bArr2[2] = (byte) ((16711680 & i) >> 16);
        bArr2[3] = (byte) ((i & (-16777216)) >> 24);
        return bArr2;
    }

    public static float[] bytesToFloats(byte[] bArr, int i, boolean z) {
        if (bArr == null) {
            return null;
        }
        float[] fArr = new float[i / 4];
        if (z) {
            java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.BIG_ENDIAN).asFloatBuffer().get(fArr);
        } else {
            java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(fArr);
        }
        return fArr;
    }

    public static short[] bytesToShorts(byte[] bArr, int i, boolean z) {
        if (bArr == null) {
            return null;
        }
        short[] sArr = new short[i / 2];
        if (z) {
            java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.BIG_ENDIAN).asShortBuffer().get(sArr);
        } else {
            java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        }
        return sArr;
    }

    public static java.lang.String byteToBit(byte b) {
        return "" + ((int) ((byte) ((b >> 7) & 1))) + ((int) ((byte) ((b >> 6) & 1))) + ((int) ((byte) ((b >> 5) & 1))) + ((int) ((byte) ((b >> 4) & 1))) + ((int) ((byte) ((b >> 3) & 1))) + ((int) ((byte) ((b >> 2) & 1))) + ((int) ((byte) ((b >> 1) & 1))) + ((int) ((byte) ((b >> 0) & 1)));
    }

    public static int bytes2IntIncludeSignBit(byte[] bArr) {
        int i;
        byte b;
        if (bArr.length == 1) {
            return bArr[0];
        }
        if (bArr.length == 4) {
            i = (bArr[3] << 24) | ((bArr[2] << 24) >>> 8) | ((bArr[1] << 24) >>> 16);
            b = bArr[0];
        } else if (bArr.length == 2) {
            i = bArr[1] << 8;
            b = bArr[0];
        } else {
            if (bArr.length != 3) {
                return 0;
            }
            i = (bArr[2] << 16) | ((bArr[1] << 24) >>> 16);
            b = bArr[0];
        }
        return i | ((b << 24) >>> 24);
    }

    public static byte[] getBooleanArray(byte b) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (b & 1);
            b = (byte) (b >> 1);
        }
        return bArr;
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

    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        java.lang.System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int bytesToIntForVersion(byte[] bArr) {
        int i;
        int i2;
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        if (bArr.length == 4) {
            i = (bArr[3] & 255) | ((bArr[2] << 8) & 65280) | ((bArr[1] << 16) & 16711680);
            i2 = (bArr[0] << 24) & (-16777216);
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

    public static byte[] intToByteBig(int i, int i2) {
        if (i2 == 1) {
            byte[] bArr = new byte[i2];
            bArr[0] = (byte) (i & 255);
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        bArr2[0] = (byte) ((i >>> 24) & 255);
        bArr2[1] = (byte) ((i >>> 16) & 255);
        bArr2[2] = (byte) ((i >>> 8) & 255);
        bArr2[3] = (byte) (i & 255);
        return bArr2;
    }

    public static int bytesToIntBig(byte[] bArr) {
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        return (bArr[3] & 255) | ((((((bArr[0] & 255) << 8) | (bArr[1] & 255)) << 8) | (bArr[2] & 255)) << 8);
    }

    public static java.lang.String bytesToString(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append(java.lang.String.format("%02X", java.lang.Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static java.lang.String bytesToStringFormat(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append(java.lang.String.format("%01X", java.lang.Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static java.lang.String binaryString2hexString(java.lang.String str) {
        if (str == null || str.equals("") || str.length() % 8 != 0) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < str.length(); i += 4) {
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                int i4 = i + i3;
                i2 += java.lang.Integer.parseInt(str.substring(i4, i4 + 1)) << ((4 - i3) - 1);
            }
            stringBuffer.append(java.lang.Integer.toHexString(i2));
        }
        return stringBuffer.toString();
    }

    public static java.lang.String byteArrayToString(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static java.lang.String byteArraySubToString(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            if (sb.toString().length() >= 200) {
                break;
            }
        }
        return sb.toString();
    }

    public static java.lang.String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String bytesToString1(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append(java.lang.String.format("%02X ", java.lang.Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static byte[] hexToBytes(java.lang.String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        java.lang.String lowerCase = str.toLowerCase();
        int length = lowerCase.length() / 2;
        char[] charArray = lowerCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int indexOf = "0123456789abcdef".indexOf(charArray[i2]) << 4;
            int indexOf2 = "0123456789abcdef".indexOf(charArray[i2 + 1]);
            if (indexOf == -1 || indexOf2 == -1) {
                return null;
            }
            bArr[i] = (byte) (indexOf2 | indexOf);
        }
        return bArr;
    }

    public static java.lang.String byteAsciiToChar(int... iArr) {
        java.lang.String str = "";
        for (int i : iArr) {
            str = str + ((char) i);
        }
        return str;
    }

    public static java.lang.String unicodeByteToStr(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.Character.valueOf((char) 0);
        for (int i = 0; i < bArr.length; i += 2) {
            int i2 = i + 1;
            java.lang.Character valueOf = bArr[i2] == 0 ? java.lang.Character.valueOf((char) bArr[i]) : java.lang.Character.valueOf((char) (bArr[i2] | ((bArr[i] << 8) & 65280)));
            if (valueOf.charValue() == 0) {
                break;
            }
            stringBuffer.append(valueOf);
        }
        return stringBuffer.toString();
    }
}
