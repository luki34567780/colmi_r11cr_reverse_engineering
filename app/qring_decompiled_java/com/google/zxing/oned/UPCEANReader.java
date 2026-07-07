package com.google.zxing.oned;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class UPCEANReader extends com.google.zxing.oned.OneDReader {
    static final int[][] L_AND_G_PATTERNS;
    static final int[][] L_PATTERNS;
    private static final float MAX_AVG_VARIANCE = 0.48f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;
    static final int[] START_END_PATTERN = {1, 1, 1};
    static final int[] MIDDLE_PATTERN = {1, 1, 1, 1, 1};
    static final int[] END_PATTERN = {1, 1, 1, 1, 1, 1};
    private final java.lang.StringBuilder decodeRowStringBuffer = new java.lang.StringBuilder(20);
    private final com.google.zxing.oned.UPCEANExtensionSupport extensionReader = new com.google.zxing.oned.UPCEANExtensionSupport();
    private final com.google.zxing.oned.EANManufacturerOrgSupport eanManSupport = new com.google.zxing.oned.EANManufacturerOrgSupport();

    protected abstract int decodeMiddle(com.google.zxing.common.BitArray bitArray, int[] iArr, java.lang.StringBuilder sb) throws com.google.zxing.NotFoundException;

    abstract com.google.zxing.BarcodeFormat getBarcodeFormat();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        L_PATTERNS = iArr;
        int[][] iArr2 = new int[20][];
        L_AND_G_PATTERNS = iArr2;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = L_PATTERNS[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            L_AND_G_PATTERNS[i] = iArr4;
        }
    }

    protected UPCEANReader() {
    }

    static int[] findStartGuardPattern(com.google.zxing.common.BitArray bitArray) throws com.google.zxing.NotFoundException {
        int[] iArr = new int[START_END_PATTERN.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = START_END_PATTERN;
            java.util.Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = findGuardPattern(bitArray, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = bitArray.isRange(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        return decodeRow(i, bitArray, findStartGuardPattern(bitArray), map);
    }

    public com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, int[] iArr, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        int i2;
        java.lang.String lookupCountryIdentifier;
        com.google.zxing.ResultPointCallback resultPointCallback = map == null ? null : (com.google.zxing.ResultPointCallback) map.get(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new com.google.zxing.ResultPoint((iArr[0] + iArr[1]) / 2.0f, i));
        }
        java.lang.StringBuilder sb = this.decodeRowStringBuffer;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new com.google.zxing.ResultPoint(decodeMiddle, i));
        }
        int[] decodeEnd = decodeEnd(bitArray, decodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new com.google.zxing.ResultPoint((decodeEnd[0] + decodeEnd[1]) / 2.0f, i));
        }
        int i3 = decodeEnd[1];
        int i4 = (i3 - decodeEnd[0]) + i3;
        if (i4 >= bitArray.getSize() || !bitArray.isRange(i3, i4, false)) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        if (!checkChecksum(sb2)) {
            throw com.google.zxing.ChecksumException.getChecksumInstance();
        }
        com.google.zxing.BarcodeFormat barcodeFormat = getBarcodeFormat();
        float f = i;
        com.google.zxing.Result result = new com.google.zxing.Result(sb2, null, new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint((iArr[1] + iArr[0]) / 2.0f, f), new com.google.zxing.ResultPoint((decodeEnd[1] + decodeEnd[0]) / 2.0f, f)}, barcodeFormat);
        try {
            com.google.zxing.Result decodeRow = this.extensionReader.decodeRow(i, bitArray, decodeEnd[1]);
            result.putMetadata(com.google.zxing.ResultMetadataType.UPC_EAN_EXTENSION, decodeRow.getText());
            result.putAllMetadata(decodeRow.getResultMetadata());
            result.addResultPoints(decodeRow.getResultPoints());
            i2 = decodeRow.getText().length();
        } catch (com.google.zxing.ReaderException unused) {
            i2 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(com.google.zxing.DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length = iArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    z = false;
                    break;
                }
                if (i2 == iArr2[i5]) {
                    break;
                }
                i5++;
            }
            if (!z) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
        }
        if ((barcodeFormat == com.google.zxing.BarcodeFormat.EAN_13 || barcodeFormat == com.google.zxing.BarcodeFormat.UPC_A) && (lookupCountryIdentifier = this.eanManSupport.lookupCountryIdentifier(sb2)) != null) {
            result.putMetadata(com.google.zxing.ResultMetadataType.POSSIBLE_COUNTRY, lookupCountryIdentifier);
        }
        return result;
    }

    boolean checkChecksum(java.lang.String str) throws com.google.zxing.FormatException {
        return checkStandardUPCEANChecksum(str);
    }

    static boolean checkStandardUPCEANChecksum(java.lang.CharSequence charSequence) throws com.google.zxing.FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return getStandardUPCEANChecksum(charSequence.subSequence(0, i)) == java.lang.Character.digit(charSequence.charAt(i), 10);
    }

    static int getStandardUPCEANChecksum(java.lang.CharSequence charSequence) throws com.google.zxing.FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    int[] decodeEnd(com.google.zxing.common.BitArray bitArray, int i) throws com.google.zxing.NotFoundException {
        return findGuardPattern(bitArray, i, false, START_END_PATTERN);
    }

    static int[] findGuardPattern(com.google.zxing.common.BitArray bitArray, int i, boolean z, int[] iArr) throws com.google.zxing.NotFoundException {
        return findGuardPattern(bitArray, i, z, iArr, new int[iArr.length]);
    }

    private static int[] findGuardPattern(com.google.zxing.common.BitArray bitArray, int i, boolean z, int[] iArr, int[] iArr2) throws com.google.zxing.NotFoundException {
        int size = bitArray.getSize();
        int nextUnset = z ? bitArray.getNextUnset(i) : bitArray.getNextSet(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = nextUnset;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (patternMatchVariance(iArr2, iArr, MAX_INDIVIDUAL_VARIANCE) < MAX_AVG_VARIANCE) {
                        return new int[]{i3, nextUnset};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    java.lang.System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            nextUnset++;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    static int decodeDigit(com.google.zxing.common.BitArray bitArray, int[] iArr, int i, int[][] iArr2) throws com.google.zxing.NotFoundException {
        recordPattern(bitArray, i, iArr);
        int length = iArr2.length;
        float f = MAX_AVG_VARIANCE;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float patternMatchVariance = patternMatchVariance(iArr, iArr2[i3], MAX_INDIVIDUAL_VARIANCE);
            if (patternMatchVariance < f) {
                i2 = i3;
                f = patternMatchVariance;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }
}
