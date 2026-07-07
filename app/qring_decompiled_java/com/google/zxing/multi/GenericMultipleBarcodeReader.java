package com.google.zxing.multi;

/* loaded from: /tmp/dex/classes2.dex */
public final class GenericMultipleBarcodeReader implements com.google.zxing.multi.MultipleBarcodeReader {
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final com.google.zxing.Reader delegate;

    public GenericMultipleBarcodeReader(com.google.zxing.Reader reader) {
        this.delegate = reader;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public com.google.zxing.Result[] decodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public com.google.zxing.Result[] decodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        return (com.google.zxing.Result[]) arrayList.toArray(new com.google.zxing.Result[arrayList.size()]);
    }

    private void doDecodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map, java.util.List<com.google.zxing.Result> list, int i, int i2, int i3) {
        boolean z;
        float f;
        float f2;
        int i4;
        int i5;
        if (i3 > 4) {
            return;
        }
        try {
            com.google.zxing.Result decode = this.delegate.decode(binaryBitmap, map);
            java.util.Iterator<com.google.zxing.Result> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getText().equals(decode.getText())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                list.add(translateResultPoints(decode, i, i2));
            }
            com.google.zxing.ResultPoint[] resultPoints = decode.getResultPoints();
            if (resultPoints == null || resultPoints.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f3 = width;
            float f4 = height;
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (com.google.zxing.ResultPoint resultPoint : resultPoints) {
                if (resultPoint != null) {
                    float x = resultPoint.getX();
                    float y = resultPoint.getY();
                    if (x < f3) {
                        f3 = x;
                    }
                    if (y < f4) {
                        f4 = y;
                    }
                    if (x > f5) {
                        f5 = x;
                    }
                    if (y > f6) {
                        f6 = y;
                    }
                }
            }
            if (f3 > 100.0f) {
                f = f5;
                f2 = f4;
                i4 = height;
                i5 = width;
                doDecodeMultiple(binaryBitmap.crop(0, 0, (int) f3, height), map, list, i, i2, i3 + 1);
            } else {
                f = f5;
                f2 = f4;
                i4 = height;
                i5 = width;
            }
            if (f2 > 100.0f) {
                doDecodeMultiple(binaryBitmap.crop(0, 0, i5, (int) f2), map, list, i, i2, i3 + 1);
            }
            float f7 = f;
            if (f7 < i5 - 100) {
                int i6 = (int) f7;
                doDecodeMultiple(binaryBitmap.crop(i6, 0, i5 - i6, i4), map, list, i + i6, i2, i3 + 1);
            }
            if (f6 < i4 - 100) {
                int i7 = (int) f6;
                doDecodeMultiple(binaryBitmap.crop(0, i7, i5, i4 - i7), map, list, i, i2 + i7, i3 + 1);
            }
        } catch (com.google.zxing.ReaderException unused) {
        }
    }

    private static com.google.zxing.Result translateResultPoints(com.google.zxing.Result result, int i, int i2) {
        com.google.zxing.ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        com.google.zxing.ResultPoint[] resultPointArr = new com.google.zxing.ResultPoint[resultPoints.length];
        for (int i3 = 0; i3 < resultPoints.length; i3++) {
            com.google.zxing.ResultPoint resultPoint = resultPoints[i3];
            if (resultPoint != null) {
                resultPointArr[i3] = new com.google.zxing.ResultPoint(resultPoint.getX() + i, resultPoint.getY() + i2);
            }
        }
        com.google.zxing.Result result2 = new com.google.zxing.Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }
}
