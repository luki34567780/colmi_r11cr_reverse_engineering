package com.realsil.sdk.core.utility;

/* loaded from: classes3.dex */
public final class DataConverter {
    public static void copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i) throws java.io.IOException {
        if (inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return android.os.Build.VERSION.SDK_INT >= 19 ? java.util.Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static byte[] hex2BigBytes(java.lang.String str) {
        if (com.realsil.sdk.core.utility.StringUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        int i = length / 2;
        byte[] bArr = new byte[i];
        java.lang.String upperCase = str.toUpperCase();
        char[] charArray = upperCase.toCharArray();
        if (length % 2 == 1) {
            return null;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if ((charArray[i2] < '0' || charArray[i2] > '9') && (charArray[i2] < 'A' || charArray[i2] > 'F')) {
                return null;
            }
        }
        for (int i3 = 0; i3 < length; i3 += 2) {
            bArr[(i - (i3 / 2)) - 1] = (byte) (java.lang.Character.digit(upperCase.charAt(i3 + 1), 16) + (java.lang.Character.digit(upperCase.charAt(i3), 16) << 4));
        }
        return bArr;
    }

    public static byte[] hex2Bytes(java.lang.String str) {
        if (com.realsil.sdk.core.utility.StringUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            java.lang.String upperCase = str.toUpperCase();
            char[] charArray = upperCase.toCharArray();
            if (length % 2 == 1) {
                return null;
            }
            for (int i = 0; i < length; i++) {
                if ((charArray[i] < '0' || charArray[i] > '9') && (charArray[i] < 'A' || charArray[i] > 'F')) {
                    return null;
                }
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                bArr[i2 / 2] = (byte) ((java.lang.Character.digit(upperCase.charAt(i2), 16) << 4) + java.lang.Character.digit(upperCase.charAt(i2 + 1), 16));
            }
            return bArr;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.String hex2Str(java.lang.String str) {
        if (com.realsil.sdk.core.utility.StringUtils.isEmpty(str)) {
            return "";
        }
        java.lang.String upperCase = str.toUpperCase();
        char[] charArray = upperCase.toCharArray();
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        if (upperCase.length() % 2 == 1) {
            return "";
        }
        for (int i = 0; i < upperCase.length(); i++) {
            if ((charArray[i] < '0' || charArray[i] > '9') && (charArray[i] < 'A' || charArray[i] > 'F')) {
                return "";
            }
        }
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (("0123456789ABCDEF".indexOf(charArray[i3 + 1]) + ("0123456789ABCDEF".indexOf(charArray[i3]) * 16)) & 255);
        }
        return new java.lang.String(bArr);
    }

    public static int littleEndianByteArrayToInt(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        if (length == 0) {
            return 0;
        }
        for (int i2 = length - 1; i2 >= 0; i2--) {
            i += unsignedByteToInt(bArr[i2]) << (i2 * 8);
        }
        return i;
    }

    public static byte[] reverse(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr2[i] = bArr[length];
            i++;
        }
        return bArr2;
    }

    public static void safeCloseStream(java.io.InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("Error closing stream: ");
            a.append(th.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a.toString());
        }
    }

    public static java.lang.String str2Hex(java.lang.String str) {
        if (com.realsil.sdk.core.utility.StringUtils.isEmpty(str)) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        for (byte b : str.getBytes()) {
            sb.append(charArray[(b & com.realsil.sdk.bbpro.params.Mmi.AU_MMI_START_ROLESWAP) >> 4]);
            sb.append(charArray[b & 15]);
            sb.append(' ');
        }
        return sb.toString().trim();
    }

    public static java.lang.String str2Unicode(java.lang.String str) throws java.lang.Exception {
        if (com.realsil.sdk.core.utility.StringUtils.isEmpty(str)) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            java.lang.String hexString = java.lang.Integer.toHexString(charAt);
            if (charAt > 128) {
                sb.append("\\u" + hexString);
            } else {
                sb.append("\\u00" + hexString);
            }
        }
        return sb.toString();
    }

    public static java.lang.String unicode2Str(java.lang.String str) {
        if (com.realsil.sdk.core.utility.StringUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length() / 6;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (i < length) {
            int i2 = i * 6;
            i++;
            java.lang.String substring = str.substring(i2, i * 6);
            java.lang.String str2 = substring.substring(2, 4) + "00";
            sb.append(new java.lang.String(java.lang.Character.toChars(java.lang.Integer.valueOf(substring.substring(4), 16).intValue() + java.lang.Integer.valueOf(str2, 16).intValue())));
        }
        return sb.toString();
    }

    public static int unsignedByteToInt(byte b) {
        return b & 255;
    }

    public static java.lang.String bytes2Str(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    public static java.lang.String ellipsize(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (str.length() < 3) {
            return str;
        }
        return str.charAt(0) + "⋯" + str.charAt(str.length() - 1);
    }

    public static byte[] str2Bytes(java.lang.String str) {
        if (str == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        try {
            return str.getBytes("US-ASCII");
        } catch (java.io.UnsupportedEncodingException e) {
            com.realsil.sdk.core.logger.ZLogger.w(e.toString());
            return bArr;
        }
    }

    public static java.lang.String bytes2Hex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        for (byte b : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase().trim();
    }

    public static java.lang.String bytes2HexWithSeparate(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        for (byte b : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            sb.append(" ");
        }
        return sb.toString().toUpperCase().trim();
    }

    public static void safeCloseStream(java.io.OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder a = com.realsil.sdk.core.a.a.a("Error closing stream: ");
            a.append(th.toString());
            com.realsil.sdk.core.logger.ZLogger.w(a.toString());
        }
    }
}
