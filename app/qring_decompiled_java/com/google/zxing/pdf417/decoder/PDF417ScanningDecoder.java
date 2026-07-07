package com.google.zxing.pdf417.decoder;

/* loaded from: /tmp/dex/classes2.dex */
public final class PDF417ScanningDecoder {
    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final com.google.zxing.pdf417.decoder.ec.ErrorCorrection errorCorrection = new com.google.zxing.pdf417.decoder.ec.ErrorCorrection();

    private static boolean checkCodewordSkew(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    private static int getNumberOfECCodeWords(int i) {
        return 2 << i;
    }

    private PDF417ScanningDecoder() {
    }

    public static com.google.zxing.common.DecoderResult decode(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4, int i, int i2) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultRowIndicatorColumn;
        int i3;
        int i4;
        int i5;
        com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2 = null;
        com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn3 = null;
        com.google.zxing.pdf417.decoder.DetectionResult detectionResult = null;
        com.google.zxing.pdf417.decoder.BoundingBox boundingBox = new com.google.zxing.pdf417.decoder.BoundingBox(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        for (int i6 = 0; i6 < 2; i6++) {
            if (resultPoint != null) {
                detectionResultRowIndicatorColumn2 = getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint, true, i, i2);
            }
            if (resultPoint3 != null) {
                detectionResultRowIndicatorColumn3 = getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint3, false, i, i2);
            }
            detectionResult = merge(detectionResultRowIndicatorColumn2, detectionResultRowIndicatorColumn3);
            if (detectionResult == null) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            if (i6 == 0 && detectionResult.getBoundingBox() != null && (detectionResult.getBoundingBox().getMinY() < boundingBox.getMinY() || detectionResult.getBoundingBox().getMaxY() > boundingBox.getMaxY())) {
                boundingBox = detectionResult.getBoundingBox();
            } else {
                detectionResult.setBoundingBox(boundingBox);
                break;
            }
        }
        int barcodeColumnCount = detectionResult.getBarcodeColumnCount() + 1;
        detectionResult.setDetectionResultColumn(0, detectionResultRowIndicatorColumn2);
        detectionResult.setDetectionResultColumn(barcodeColumnCount, detectionResultRowIndicatorColumn3);
        boolean z = detectionResultRowIndicatorColumn2 != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= barcodeColumnCount; i9++) {
            int i10 = z ? i9 : barcodeColumnCount - i9;
            if (detectionResult.getDetectionResultColumn(i10) == null) {
                if (i10 == 0 || i10 == barcodeColumnCount) {
                    detectionResultRowIndicatorColumn = new com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn(boundingBox, i10 == 0);
                } else {
                    detectionResultRowIndicatorColumn = new com.google.zxing.pdf417.decoder.DetectionResultColumn(boundingBox);
                }
                detectionResult.setDetectionResultColumn(i10, detectionResultRowIndicatorColumn);
                int i11 = -1;
                int minY = boundingBox.getMinY();
                int i12 = -1;
                while (minY <= boundingBox.getMaxY()) {
                    int startColumn = getStartColumn(detectionResult, i10, minY, z);
                    if (startColumn >= 0 && startColumn <= boundingBox.getMaxX()) {
                        i5 = startColumn;
                    } else if (i12 != i11) {
                        i5 = i12;
                    } else {
                        i3 = i12;
                        i4 = minY;
                        i12 = i3;
                        minY = i4 + 1;
                        i11 = -1;
                    }
                    i3 = i12;
                    int i13 = minY;
                    com.google.zxing.pdf417.decoder.Codeword detectCodeword = detectCodeword(bitMatrix, boundingBox.getMinX(), boundingBox.getMaxX(), z, i5, i13, i7, i8);
                    i4 = i13;
                    if (detectCodeword != null) {
                        detectionResultRowIndicatorColumn.setCodeword(i4, detectCodeword);
                        i7 = java.lang.Math.min(i7, detectCodeword.getWidth());
                        i8 = java.lang.Math.max(i8, detectCodeword.getWidth());
                        i12 = i5;
                        minY = i4 + 1;
                        i11 = -1;
                    }
                    i12 = i3;
                    minY = i4 + 1;
                    i11 = -1;
                }
            }
        }
        return createDecoderResult(detectionResult);
    }

    private static com.google.zxing.pdf417.decoder.DetectionResult merge(com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) throws com.google.zxing.NotFoundException {
        com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata;
        if ((detectionResultRowIndicatorColumn == null && detectionResultRowIndicatorColumn2 == null) || (barcodeMetadata = getBarcodeMetadata(detectionResultRowIndicatorColumn, detectionResultRowIndicatorColumn2)) == null) {
            return null;
        }
        return new com.google.zxing.pdf417.decoder.DetectionResult(barcodeMetadata, com.google.zxing.pdf417.decoder.BoundingBox.merge(adjustBoundingBox(detectionResultRowIndicatorColumn), adjustBoundingBox(detectionResultRowIndicatorColumn2)));
    }

    private static com.google.zxing.pdf417.decoder.BoundingBox adjustBoundingBox(com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn) throws com.google.zxing.NotFoundException {
        int[] rowHeights;
        if (detectionResultRowIndicatorColumn == null || (rowHeights = detectionResultRowIndicatorColumn.getRowHeights()) == null) {
            return null;
        }
        int max = getMax(rowHeights);
        int i = 0;
        int i2 = 0;
        for (int i3 : rowHeights) {
            i2 += max - i3;
            if (i3 > 0) {
                break;
            }
        }
        com.google.zxing.pdf417.decoder.Codeword[] codewords = detectionResultRowIndicatorColumn.getCodewords();
        for (int i4 = 0; i2 > 0 && codewords[i4] == null; i4++) {
            i2--;
        }
        for (int length = rowHeights.length - 1; length >= 0; length--) {
            i += max - rowHeights[length];
            if (rowHeights[length] > 0) {
                break;
            }
        }
        for (int length2 = codewords.length - 1; i > 0 && codewords[length2] == null; length2--) {
            i--;
        }
        return detectionResultRowIndicatorColumn.getBoundingBox().addMissingRows(i2, i, detectionResultRowIndicatorColumn.isLeft());
    }

    private static int getMax(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = java.lang.Math.max(i, i2);
        }
        return i;
    }

    private static com.google.zxing.pdf417.decoder.BarcodeMetadata getBarcodeMetadata(com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) {
        com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata;
        com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata2;
        if (detectionResultRowIndicatorColumn == null || (barcodeMetadata = detectionResultRowIndicatorColumn.getBarcodeMetadata()) == null) {
            if (detectionResultRowIndicatorColumn2 == null) {
                return null;
            }
            return detectionResultRowIndicatorColumn2.getBarcodeMetadata();
        }
        if (detectionResultRowIndicatorColumn2 == null || (barcodeMetadata2 = detectionResultRowIndicatorColumn2.getBarcodeMetadata()) == null || barcodeMetadata.getColumnCount() == barcodeMetadata2.getColumnCount() || barcodeMetadata.getErrorCorrectionLevel() == barcodeMetadata2.getErrorCorrectionLevel() || barcodeMetadata.getRowCount() == barcodeMetadata2.getRowCount()) {
            return barcodeMetadata;
        }
        return null;
    }

    private static com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn getRowIndicatorColumn(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.pdf417.decoder.BoundingBox boundingBox, com.google.zxing.ResultPoint resultPoint, boolean z, int i, int i2) {
        int endX;
        com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = new com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn(boundingBox, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int x = (int) resultPoint.getX();
            for (int y = (int) resultPoint.getY(); y <= boundingBox.getMaxY() && y >= boundingBox.getMinY(); y += i4) {
                com.google.zxing.pdf417.decoder.Codeword detectCodeword = detectCodeword(bitMatrix, 0, bitMatrix.getWidth(), z, x, y, i, i2);
                if (detectCodeword != null) {
                    detectionResultRowIndicatorColumn.setCodeword(y, detectCodeword);
                    if (z) {
                        endX = detectCodeword.getStartX();
                    } else {
                        endX = detectCodeword.getEndX();
                    }
                    x = endX;
                }
            }
            i3++;
        }
        return detectionResultRowIndicatorColumn;
    }

    private static void adjustCodewordCount(com.google.zxing.pdf417.decoder.DetectionResult detectionResult, com.google.zxing.pdf417.decoder.BarcodeValue[][] barcodeValueArr) throws com.google.zxing.NotFoundException {
        com.google.zxing.pdf417.decoder.BarcodeValue barcodeValue = barcodeValueArr[0][1];
        int[] value = barcodeValue.getValue();
        int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * detectionResult.getBarcodeRowCount()) - getNumberOfECCodeWords(detectionResult.getBarcodeECLevel());
        if (value.length != 0) {
            if (value[0] != barcodeColumnCount) {
                barcodeValue.setValue(barcodeColumnCount);
            }
        } else {
            if (barcodeColumnCount <= 0 || barcodeColumnCount > 928) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            barcodeValue.setValue(barcodeColumnCount);
        }
    }

    private static com.google.zxing.common.DecoderResult createDecoderResult(com.google.zxing.pdf417.decoder.DetectionResult detectionResult) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException, com.google.zxing.NotFoundException {
        com.google.zxing.pdf417.decoder.BarcodeValue[][] createBarcodeMatrix = createBarcodeMatrix(detectionResult);
        adjustCodewordCount(detectionResult, createBarcodeMatrix);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int[] iArr = new int[detectionResult.getBarcodeRowCount() * detectionResult.getBarcodeColumnCount()];
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i = 0; i < detectionResult.getBarcodeRowCount(); i++) {
            int i2 = 0;
            while (i2 < detectionResult.getBarcodeColumnCount()) {
                int i3 = i2 + 1;
                int[] value = createBarcodeMatrix[i][i3].getValue();
                int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * i) + i2;
                if (value.length == 0) {
                    arrayList.add(java.lang.Integer.valueOf(barcodeColumnCount));
                } else if (value.length == 1) {
                    iArr[barcodeColumnCount] = value[0];
                } else {
                    arrayList3.add(java.lang.Integer.valueOf(barcodeColumnCount));
                    arrayList2.add(value);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return createDecoderResultFromAmbiguousValues(detectionResult.getBarcodeECLevel(), iArr, com.google.zxing.pdf417.PDF417Common.toIntArray(arrayList), com.google.zxing.pdf417.PDF417Common.toIntArray(arrayList3), iArr2);
    }

    private static com.google.zxing.common.DecoderResult createDecoderResultFromAmbiguousValues(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return decodeCodewords(iArr, i, iArr2);
                } catch (com.google.zxing.ChecksumException unused) {
                    if (length == 0) {
                        throw com.google.zxing.ChecksumException.getChecksumInstance();
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (iArr5[i5] < iArr4[i5].length - 1) {
                            iArr5[i5] = iArr5[i5] + 1;
                            break;
                        }
                        iArr5[i5] = 0;
                        if (i5 == length - 1) {
                            throw com.google.zxing.ChecksumException.getChecksumInstance();
                        }
                        i5++;
                    }
                    i2 = i3;
                }
            } else {
                throw com.google.zxing.ChecksumException.getChecksumInstance();
            }
        }
    }

    private static com.google.zxing.pdf417.decoder.BarcodeValue[][] createBarcodeMatrix(com.google.zxing.pdf417.decoder.DetectionResult detectionResult) {
        int rowNumber;
        com.google.zxing.pdf417.decoder.BarcodeValue[][] barcodeValueArr = (com.google.zxing.pdf417.decoder.BarcodeValue[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.google.zxing.pdf417.decoder.BarcodeValue.class, detectionResult.getBarcodeRowCount(), detectionResult.getBarcodeColumnCount() + 2);
        for (int i = 0; i < barcodeValueArr.length; i++) {
            for (int i2 = 0; i2 < barcodeValueArr[i].length; i2++) {
                barcodeValueArr[i][i2] = new com.google.zxing.pdf417.decoder.BarcodeValue();
            }
        }
        int i3 = 0;
        for (com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn : detectionResult.getDetectionResultColumns()) {
            if (detectionResultColumn != null) {
                for (com.google.zxing.pdf417.decoder.Codeword codeword : detectionResultColumn.getCodewords()) {
                    if (codeword != null && (rowNumber = codeword.getRowNumber()) >= 0 && rowNumber < barcodeValueArr.length) {
                        barcodeValueArr[rowNumber][i3].setValue(codeword.getValue());
                    }
                }
            }
            i3++;
        }
        return barcodeValueArr;
    }

    private static boolean isValidBarcodeColumn(com.google.zxing.pdf417.decoder.DetectionResult detectionResult, int i) {
        return i >= 0 && i <= detectionResult.getBarcodeColumnCount() + 1;
    }

    private static int getStartColumn(com.google.zxing.pdf417.decoder.DetectionResult detectionResult, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        com.google.zxing.pdf417.decoder.Codeword codeword = isValidBarcodeColumn(detectionResult, i4) ? detectionResult.getDetectionResultColumn(i4).getCodeword(i2) : null;
        if (codeword != null) {
            return z ? codeword.getEndX() : codeword.getStartX();
        }
        com.google.zxing.pdf417.decoder.Codeword codewordNearby = detectionResult.getDetectionResultColumn(i).getCodewordNearby(i2);
        if (codewordNearby != null) {
            return z ? codewordNearby.getStartX() : codewordNearby.getEndX();
        }
        if (isValidBarcodeColumn(detectionResult, i4)) {
            codewordNearby = detectionResult.getDetectionResultColumn(i4).getCodewordNearby(i2);
        }
        if (codewordNearby != null) {
            return z ? codewordNearby.getEndX() : codewordNearby.getStartX();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (isValidBarcodeColumn(detectionResult, i)) {
                for (com.google.zxing.pdf417.decoder.Codeword codeword2 : detectionResult.getDetectionResultColumn(i).getCodewords()) {
                    if (codeword2 != null) {
                        return (z ? codeword2.getEndX() : codeword2.getStartX()) + (i3 * i5 * (codeword2.getEndX() - codeword2.getStartX()));
                    }
                }
                i5++;
            } else {
                com.google.zxing.pdf417.decoder.BoundingBox boundingBox = detectionResult.getBoundingBox();
                return z ? boundingBox.getMinX() : boundingBox.getMaxX();
            }
        }
    }

    private static com.google.zxing.pdf417.decoder.Codeword detectCodeword(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int decodedValue;
        int codeword;
        int adjustCodewordStartColumn = adjustCodewordStartColumn(bitMatrix, i, i2, z, i3, i4);
        int[] moduleBitCount = getModuleBitCount(bitMatrix, i, i2, z, adjustCodewordStartColumn, i4);
        if (moduleBitCount == null) {
            return null;
        }
        int sum = com.google.zxing.common.detector.MathUtils.sum(moduleBitCount);
        if (z) {
            i7 = adjustCodewordStartColumn + sum;
        } else {
            for (int i8 = 0; i8 < moduleBitCount.length / 2; i8++) {
                int i9 = moduleBitCount[i8];
                moduleBitCount[i8] = moduleBitCount[(moduleBitCount.length - 1) - i8];
                moduleBitCount[(moduleBitCount.length - 1) - i8] = i9;
            }
            adjustCodewordStartColumn -= sum;
            i7 = adjustCodewordStartColumn;
        }
        if (checkCodewordSkew(sum, i5, i6) && (codeword = com.google.zxing.pdf417.PDF417Common.getCodeword((decodedValue = com.google.zxing.pdf417.decoder.PDF417CodewordDecoder.getDecodedValue(moduleBitCount)))) != -1) {
            return new com.google.zxing.pdf417.decoder.Codeword(adjustCodewordStartColumn, i7, getCodewordBucketNumber(decodedValue), codeword);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[EDGE_INSN: B:17:0x0027->B:18:0x0027 BREAK  A[LOOP:0: B:5:0x000c->B:13:0x000c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] getModuleBitCount(com.google.zxing.common.BitMatrix r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.get(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.getModuleBitCount(com.google.zxing.common.BitMatrix, int, int, boolean, int, int):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int adjustCodewordStartColumn(com.google.zxing.common.BitMatrix r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.get(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.PDF417ScanningDecoder.adjustCodewordStartColumn(com.google.zxing.common.BitMatrix, int, int, boolean, int, int):int");
    }

    private static com.google.zxing.common.DecoderResult decodeCodewords(int[] iArr, int i, int[] iArr2) throws com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        if (iArr.length == 0) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        int i2 = 1 << (i + 1);
        int correctErrors = correctErrors(iArr, iArr2, i2);
        verifyCodewordCount(iArr, i2);
        com.google.zxing.common.DecoderResult decode = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.decode(iArr, java.lang.String.valueOf(i));
        decode.setErrorsCorrected(java.lang.Integer.valueOf(correctErrors));
        decode.setErasures(java.lang.Integer.valueOf(iArr2.length));
        return decode;
    }

    private static int correctErrors(int[] iArr, int[] iArr2, int i) throws com.google.zxing.ChecksumException {
        if ((iArr2 != null && iArr2.length > (i / 2) + 3) || i < 0 || i > 512) {
            throw com.google.zxing.ChecksumException.getChecksumInstance();
        }
        return errorCorrection.decode(iArr, i, iArr2);
    }

    private static void verifyCodewordCount(int[] iArr, int i) throws com.google.zxing.FormatException {
        if (iArr.length < 4) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        int i2 = iArr[0];
        if (i2 > iArr.length) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        if (i2 == 0) {
            if (i < iArr.length) {
                iArr[0] = iArr.length - i;
                return;
            }
            throw com.google.zxing.FormatException.getFormatInstance();
        }
    }

    private static int[] getBitCountForCodeword(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    private static int getCodewordBucketNumber(int i) {
        return getCodewordBucketNumber(getBitCountForCodeword(i));
    }

    private static int getCodewordBucketNumber(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static java.lang.String toString(com.google.zxing.pdf417.decoder.BarcodeValue[][] barcodeValueArr) {
        java.util.Formatter formatter = new java.util.Formatter();
        for (int i = 0; i < barcodeValueArr.length; i++) {
            try {
                formatter.format("Row %2d: ", java.lang.Integer.valueOf(i));
                for (int i2 = 0; i2 < barcodeValueArr[i].length; i2++) {
                    com.google.zxing.pdf417.decoder.BarcodeValue barcodeValue = barcodeValueArr[i][i2];
                    if (barcodeValue.getValue().length == 0) {
                        formatter.format("        ", null);
                    } else {
                        formatter.format("%4d(%2d)", java.lang.Integer.valueOf(barcodeValue.getValue()[0]), barcodeValue.getConfidence(barcodeValue.getValue()[0]));
                    }
                }
                formatter.format("%n", new java.lang.Object[0]);
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
        java.lang.String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
