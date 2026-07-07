package com.google.zxing.pdf417.decoder;

/* loaded from: /tmp/dex/classes2.dex */
final class DetectionResultRowIndicatorColumn extends com.google.zxing.pdf417.decoder.DetectionResultColumn {
    private final boolean isLeft;

    DetectionResultRowIndicatorColumn(com.google.zxing.pdf417.decoder.BoundingBox boundingBox, boolean z) {
        super(boundingBox);
        this.isLeft = z;
    }

    private void setRowNumbers() {
        for (com.google.zxing.pdf417.decoder.Codeword codeword : getCodewords()) {
            if (codeword != null) {
                codeword.setRowNumberAsRowIndicatorColumn();
            }
        }
    }

    void adjustCompleteIndicatorColumnRowNumbers(com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata) {
        com.google.zxing.pdf417.decoder.Codeword[] codewords = getCodewords();
        setRowNumbers();
        removeIncorrectCodewords(codewords, barcodeMetadata);
        com.google.zxing.pdf417.decoder.BoundingBox boundingBox = getBoundingBox();
        com.google.zxing.ResultPoint topLeft = this.isLeft ? boundingBox.getTopLeft() : boundingBox.getTopRight();
        com.google.zxing.ResultPoint bottomLeft = this.isLeft ? boundingBox.getBottomLeft() : boundingBox.getBottomRight();
        int imageRowToCodewordIndex = imageRowToCodewordIndex((int) topLeft.getY());
        int imageRowToCodewordIndex2 = imageRowToCodewordIndex((int) bottomLeft.getY());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (imageRowToCodewordIndex < imageRowToCodewordIndex2) {
            if (codewords[imageRowToCodewordIndex] != null) {
                com.google.zxing.pdf417.decoder.Codeword codeword = codewords[imageRowToCodewordIndex];
                int rowNumber = codeword.getRowNumber() - i;
                if (rowNumber == 0) {
                    i2++;
                } else {
                    if (rowNumber == 1) {
                        i3 = java.lang.Math.max(i3, i2);
                        i = codeword.getRowNumber();
                    } else if (rowNumber < 0 || codeword.getRowNumber() >= barcodeMetadata.getRowCount() || rowNumber > imageRowToCodewordIndex) {
                        codewords[imageRowToCodewordIndex] = null;
                    } else {
                        if (i3 > 2) {
                            rowNumber *= i3 - 2;
                        }
                        boolean z = rowNumber >= imageRowToCodewordIndex;
                        for (int i4 = 1; i4 <= rowNumber && !z; i4++) {
                            z = codewords[imageRowToCodewordIndex - i4] != null;
                        }
                        if (z) {
                            codewords[imageRowToCodewordIndex] = null;
                        } else {
                            i = codeword.getRowNumber();
                        }
                    }
                    i2 = 1;
                }
            }
            imageRowToCodewordIndex++;
        }
    }

    int[] getRowHeights() {
        int rowNumber;
        com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata = getBarcodeMetadata();
        if (barcodeMetadata == null) {
            return null;
        }
        adjustIncompleteIndicatorColumnRowNumbers(barcodeMetadata);
        int rowCount = barcodeMetadata.getRowCount();
        int[] iArr = new int[rowCount];
        for (com.google.zxing.pdf417.decoder.Codeword codeword : getCodewords()) {
            if (codeword != null && (rowNumber = codeword.getRowNumber()) < rowCount) {
                iArr[rowNumber] = iArr[rowNumber] + 1;
            }
        }
        return iArr;
    }

    private void adjustIncompleteIndicatorColumnRowNumbers(com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata) {
        com.google.zxing.pdf417.decoder.BoundingBox boundingBox = getBoundingBox();
        com.google.zxing.ResultPoint topLeft = this.isLeft ? boundingBox.getTopLeft() : boundingBox.getTopRight();
        com.google.zxing.ResultPoint bottomLeft = this.isLeft ? boundingBox.getBottomLeft() : boundingBox.getBottomRight();
        int imageRowToCodewordIndex = imageRowToCodewordIndex((int) bottomLeft.getY());
        com.google.zxing.pdf417.decoder.Codeword[] codewords = getCodewords();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int imageRowToCodewordIndex2 = imageRowToCodewordIndex((int) topLeft.getY()); imageRowToCodewordIndex2 < imageRowToCodewordIndex; imageRowToCodewordIndex2++) {
            if (codewords[imageRowToCodewordIndex2] != null) {
                com.google.zxing.pdf417.decoder.Codeword codeword = codewords[imageRowToCodewordIndex2];
                codeword.setRowNumberAsRowIndicatorColumn();
                int rowNumber = codeword.getRowNumber() - i;
                if (rowNumber == 0) {
                    i2++;
                } else {
                    if (rowNumber == 1) {
                        i3 = java.lang.Math.max(i3, i2);
                        i = codeword.getRowNumber();
                    } else if (codeword.getRowNumber() >= barcodeMetadata.getRowCount()) {
                        codewords[imageRowToCodewordIndex2] = null;
                    } else {
                        i = codeword.getRowNumber();
                    }
                    i2 = 1;
                }
            }
        }
    }

    com.google.zxing.pdf417.decoder.BarcodeMetadata getBarcodeMetadata() {
        com.google.zxing.pdf417.decoder.Codeword[] codewords = getCodewords();
        com.google.zxing.pdf417.decoder.BarcodeValue barcodeValue = new com.google.zxing.pdf417.decoder.BarcodeValue();
        com.google.zxing.pdf417.decoder.BarcodeValue barcodeValue2 = new com.google.zxing.pdf417.decoder.BarcodeValue();
        com.google.zxing.pdf417.decoder.BarcodeValue barcodeValue3 = new com.google.zxing.pdf417.decoder.BarcodeValue();
        com.google.zxing.pdf417.decoder.BarcodeValue barcodeValue4 = new com.google.zxing.pdf417.decoder.BarcodeValue();
        for (com.google.zxing.pdf417.decoder.Codeword codeword : codewords) {
            if (codeword != null) {
                codeword.setRowNumberAsRowIndicatorColumn();
                int value = codeword.getValue() % 30;
                int rowNumber = codeword.getRowNumber();
                if (!this.isLeft) {
                    rowNumber += 2;
                }
                int i = rowNumber % 3;
                if (i == 0) {
                    barcodeValue2.setValue((value * 3) + 1);
                } else if (i == 1) {
                    barcodeValue4.setValue(value / 3);
                    barcodeValue3.setValue(value % 3);
                } else if (i == 2) {
                    barcodeValue.setValue(value + 1);
                }
            }
        }
        if (barcodeValue.getValue().length == 0 || barcodeValue2.getValue().length == 0 || barcodeValue3.getValue().length == 0 || barcodeValue4.getValue().length == 0 || barcodeValue.getValue()[0] <= 0 || barcodeValue2.getValue()[0] + barcodeValue3.getValue()[0] < 3 || barcodeValue2.getValue()[0] + barcodeValue3.getValue()[0] > 90) {
            return null;
        }
        com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata = new com.google.zxing.pdf417.decoder.BarcodeMetadata(barcodeValue.getValue()[0], barcodeValue2.getValue()[0], barcodeValue3.getValue()[0], barcodeValue4.getValue()[0]);
        removeIncorrectCodewords(codewords, barcodeMetadata);
        return barcodeMetadata;
    }

    private void removeIncorrectCodewords(com.google.zxing.pdf417.decoder.Codeword[] codewordArr, com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata) {
        for (int i = 0; i < codewordArr.length; i++) {
            com.google.zxing.pdf417.decoder.Codeword codeword = codewordArr[i];
            if (codewordArr[i] != null) {
                int value = codeword.getValue() % 30;
                int rowNumber = codeword.getRowNumber();
                if (rowNumber > barcodeMetadata.getRowCount()) {
                    codewordArr[i] = null;
                } else {
                    if (!this.isLeft) {
                        rowNumber += 2;
                    }
                    int i2 = rowNumber % 3;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            if (value / 3 != barcodeMetadata.getErrorCorrectionLevel() || value % 3 != barcodeMetadata.getRowCountLowerPart()) {
                                codewordArr[i] = null;
                            }
                        } else if (i2 == 2 && value + 1 != barcodeMetadata.getColumnCount()) {
                            codewordArr[i] = null;
                        }
                    } else if ((value * 3) + 1 != barcodeMetadata.getRowCountUpperPart()) {
                        codewordArr[i] = null;
                    }
                }
            }
        }
    }

    boolean isLeft() {
        return this.isLeft;
    }

    @Override // com.google.zxing.pdf417.decoder.DetectionResultColumn
    public java.lang.String toString() {
        return "IsLeft: " + this.isLeft + '\n' + super.toString();
    }
}
