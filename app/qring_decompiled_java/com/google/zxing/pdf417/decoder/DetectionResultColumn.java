package com.google.zxing.pdf417.decoder;

/* loaded from: /tmp/dex/classes2.dex */
class DetectionResultColumn {
    private static final int MAX_NEARBY_DISTANCE = 5;
    private final com.google.zxing.pdf417.decoder.BoundingBox boundingBox;
    private final com.google.zxing.pdf417.decoder.Codeword[] codewords;

    DetectionResultColumn(com.google.zxing.pdf417.decoder.BoundingBox boundingBox) {
        this.boundingBox = new com.google.zxing.pdf417.decoder.BoundingBox(boundingBox);
        this.codewords = new com.google.zxing.pdf417.decoder.Codeword[(boundingBox.getMaxY() - boundingBox.getMinY()) + 1];
    }

    final com.google.zxing.pdf417.decoder.Codeword getCodewordNearby(int i) {
        com.google.zxing.pdf417.decoder.Codeword codeword;
        com.google.zxing.pdf417.decoder.Codeword codeword2;
        com.google.zxing.pdf417.decoder.Codeword codeword3 = getCodeword(i);
        if (codeword3 != null) {
            return codeword3;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int imageRowToCodewordIndex = imageRowToCodewordIndex(i) - i2;
            if (imageRowToCodewordIndex >= 0 && (codeword2 = this.codewords[imageRowToCodewordIndex]) != null) {
                return codeword2;
            }
            int imageRowToCodewordIndex2 = imageRowToCodewordIndex(i) + i2;
            com.google.zxing.pdf417.decoder.Codeword[] codewordArr = this.codewords;
            if (imageRowToCodewordIndex2 < codewordArr.length && (codeword = codewordArr[imageRowToCodewordIndex2]) != null) {
                return codeword;
            }
        }
        return null;
    }

    final int imageRowToCodewordIndex(int i) {
        return i - this.boundingBox.getMinY();
    }

    final void setCodeword(int i, com.google.zxing.pdf417.decoder.Codeword codeword) {
        this.codewords[imageRowToCodewordIndex(i)] = codeword;
    }

    final com.google.zxing.pdf417.decoder.Codeword getCodeword(int i) {
        return this.codewords[imageRowToCodewordIndex(i)];
    }

    final com.google.zxing.pdf417.decoder.BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    final com.google.zxing.pdf417.decoder.Codeword[] getCodewords() {
        return this.codewords;
    }

    public java.lang.String toString() {
        java.util.Formatter formatter = new java.util.Formatter();
        try {
            int i = 0;
            for (com.google.zxing.pdf417.decoder.Codeword codeword : this.codewords) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", java.lang.Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(codeword.getRowNumber()), java.lang.Integer.valueOf(codeword.getValue()));
                    i++;
                }
            }
            java.lang.String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    formatter.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
