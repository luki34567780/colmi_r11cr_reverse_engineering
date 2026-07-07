package com.google.zxing.oned;

/* loaded from: /tmp/dex/classes2.dex */
final class UPCEANExtension2Support {
    private final int[] decodeMiddleCounters = new int[4];
    private final java.lang.StringBuilder decodeRowStringBuffer = new java.lang.StringBuilder();

    UPCEANExtension2Support() {
    }

    com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, int[] iArr) throws com.google.zxing.NotFoundException {
        java.lang.StringBuilder sb = this.decodeRowStringBuffer;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        java.lang.String sb2 = sb.toString();
        java.util.Map<com.google.zxing.ResultMetadataType, java.lang.Object> parseExtensionString = parseExtensionString(sb2);
        float f = i;
        com.google.zxing.Result result = new com.google.zxing.Result(sb2, null, new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint((iArr[0] + iArr[1]) / 2.0f, f), new com.google.zxing.ResultPoint(decodeMiddle, f)}, com.google.zxing.BarcodeFormat.UPC_EAN_EXTENSION);
        if (parseExtensionString != null) {
            result.putAllMetadata(parseExtensionString);
        }
        return result;
    }

    private int decodeMiddle(com.google.zxing.common.BitArray bitArray, int[] iArr, java.lang.StringBuilder sb) throws com.google.zxing.NotFoundException {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < size; i3++) {
            int decodeDigit = com.google.zxing.oned.UPCEANReader.decodeDigit(bitArray, iArr2, i, com.google.zxing.oned.UPCEANReader.L_AND_G_PATTERNS);
            sb.append((char) ((decodeDigit % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (decodeDigit >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = bitArray.getNextUnset(bitArray.getNextSet(i));
            }
        }
        if (sb.length() != 2) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        if (java.lang.Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static java.util.Map<com.google.zxing.ResultMetadataType, java.lang.Object> parseExtensionString(java.lang.String str) {
        if (str.length() != 2) {
            return null;
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.zxing.ResultMetadataType.class);
        enumMap.put((java.util.EnumMap) com.google.zxing.ResultMetadataType.ISSUE_NUMBER, (com.google.zxing.ResultMetadataType) java.lang.Integer.valueOf(str));
        return enumMap;
    }
}
