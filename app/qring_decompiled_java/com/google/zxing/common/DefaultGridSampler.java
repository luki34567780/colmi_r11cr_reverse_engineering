package com.google.zxing.common;

/* loaded from: /tmp/dex/classes2.dex */
public final class DefaultGridSampler extends com.google.zxing.common.GridSampler {
    @Override // com.google.zxing.common.GridSampler
    public com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws com.google.zxing.NotFoundException {
        return sampleGrid(bitMatrix, i, i2, com.google.zxing.common.PerspectiveTransform.quadrilateralToQuadrilateral(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // com.google.zxing.common.GridSampler
    public com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, com.google.zxing.common.PerspectiveTransform perspectiveTransform) throws com.google.zxing.NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        com.google.zxing.common.BitMatrix bitMatrix2 = new com.google.zxing.common.BitMatrix(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            perspectiveTransform.transformPoints(fArr);
            checkAndNudgePoints(bitMatrix, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (bitMatrix.get((int) fArr[i6], (int) fArr[i6 + 1])) {
                        bitMatrix2.set(i6 / 2, i4);
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
            }
        }
        return bitMatrix2;
    }
}
