package com.google.zxing.aztec;

/* loaded from: /tmp/dex/classes2.dex */
public final class AztecWriter implements com.google.zxing.Writer {
    @Override // com.google.zxing.Writer
    public com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.google.zxing.Writer
    public com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        java.nio.charset.Charset charset;
        int i3;
        int i4;
        java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.ISO_8859_1;
        if (map != null) {
            if (map.containsKey(com.google.zxing.EncodeHintType.CHARACTER_SET)) {
                charset2 = java.nio.charset.Charset.forName(map.get(com.google.zxing.EncodeHintType.CHARACTER_SET).toString());
            }
            int parseInt = map.containsKey(com.google.zxing.EncodeHintType.ERROR_CORRECTION) ? java.lang.Integer.parseInt(map.get(com.google.zxing.EncodeHintType.ERROR_CORRECTION).toString()) : 33;
            if (map.containsKey(com.google.zxing.EncodeHintType.AZTEC_LAYERS)) {
                charset = charset2;
                i3 = parseInt;
                i4 = java.lang.Integer.parseInt(map.get(com.google.zxing.EncodeHintType.AZTEC_LAYERS).toString());
                return encode(str, barcodeFormat, i, i2, charset, i3, i4);
            }
            charset = charset2;
            i3 = parseInt;
        } else {
            charset = charset2;
            i3 = 33;
        }
        i4 = 0;
        return encode(str, barcodeFormat, i, i2, charset, i3, i4);
    }

    private static com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.nio.charset.Charset charset, int i3, int i4) {
        if (barcodeFormat != com.google.zxing.BarcodeFormat.AZTEC) {
            throw new java.lang.IllegalArgumentException("Can only encode AZTEC, but got ".concat(java.lang.String.valueOf(barcodeFormat)));
        }
        return renderResult(com.google.zxing.aztec.encoder.Encoder.encode(str.getBytes(charset), i3, i4), i, i2);
    }

    private static com.google.zxing.common.BitMatrix renderResult(com.google.zxing.aztec.encoder.AztecCode aztecCode, int i, int i2) {
        com.google.zxing.common.BitMatrix matrix = aztecCode.getMatrix();
        if (matrix == null) {
            throw new java.lang.IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int max = java.lang.Math.max(i, width);
        int max2 = java.lang.Math.max(i2, height);
        int min = java.lang.Math.min(max / width, max2 / height);
        int i3 = (max - (width * min)) / 2;
        int i4 = (max2 - (height * min)) / 2;
        com.google.zxing.common.BitMatrix bitMatrix = new com.google.zxing.common.BitMatrix(max, max2);
        int i5 = 0;
        while (i5 < height) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < width) {
                if (matrix.get(i7, i5)) {
                    bitMatrix.setRegion(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bitMatrix;
    }
}
