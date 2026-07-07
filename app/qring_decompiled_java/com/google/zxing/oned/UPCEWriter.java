package com.google.zxing.oned;

/* loaded from: /tmp/dex/classes2.dex */
public final class UPCEWriter extends com.google.zxing.oned.UPCEANWriter {
    private static final int CODE_WIDTH = 51;

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) throws com.google.zxing.WriterException {
        if (barcodeFormat != com.google.zxing.BarcodeFormat.UPC_E) {
            throw new java.lang.IllegalArgumentException("Can only encode UPC_E, but got ".concat(java.lang.String.valueOf(barcodeFormat)));
        }
        return super.encode(str, barcodeFormat, i, i2, map);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(java.lang.String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + com.google.zxing.oned.UPCEANReader.getStandardUPCEANChecksum(com.google.zxing.oned.UPCEReader.convertUPCEtoUPCA(str));
            } catch (com.google.zxing.FormatException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!com.google.zxing.oned.UPCEANReader.checkStandardUPCEANChecksum(str)) {
                    throw new java.lang.IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (com.google.zxing.FormatException unused) {
                throw new java.lang.IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new java.lang.IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(java.lang.String.valueOf(length)));
        }
        int digit = java.lang.Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new java.lang.IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = com.google.zxing.oned.UPCEReader.NUMSYS_AND_CHECK_DIGIT_PATTERNS[digit][java.lang.Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int appendPattern = appendPattern(zArr, 0, com.google.zxing.oned.UPCEANReader.START_END_PATTERN, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = java.lang.Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            appendPattern += appendPattern(zArr, appendPattern, com.google.zxing.oned.UPCEANReader.L_AND_G_PATTERNS[digit2], false);
        }
        appendPattern(zArr, appendPattern, com.google.zxing.oned.UPCEANReader.END_PATTERN, false);
        return zArr;
    }
}
