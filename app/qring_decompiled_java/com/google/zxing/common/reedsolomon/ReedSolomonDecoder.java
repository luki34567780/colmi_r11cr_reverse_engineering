package com.google.zxing.common.reedsolomon;

/* loaded from: /tmp/dex/classes2.dex */
public final class ReedSolomonDecoder {
    private final com.google.zxing.common.reedsolomon.GenericGF field;

    public ReedSolomonDecoder(com.google.zxing.common.reedsolomon.GenericGF genericGF) {
        this.field = genericGF;
    }

    public void decode(int[] iArr, int i) throws com.google.zxing.common.reedsolomon.ReedSolomonException {
        com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly = new com.google.zxing.common.reedsolomon.GenericGFPoly(this.field, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            com.google.zxing.common.reedsolomon.GenericGF genericGF = this.field;
            int evaluateAt = genericGFPoly.evaluateAt(genericGF.exp(genericGF.getGeneratorBase() + i2));
            iArr2[(i - 1) - i2] = evaluateAt;
            if (evaluateAt != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        com.google.zxing.common.reedsolomon.GenericGFPoly[] runEuclideanAlgorithm = runEuclideanAlgorithm(this.field.buildMonomial(i, 1), new com.google.zxing.common.reedsolomon.GenericGFPoly(this.field, iArr2), i);
        com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly2 = runEuclideanAlgorithm[0];
        com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly3 = runEuclideanAlgorithm[1];
        int[] findErrorLocations = findErrorLocations(genericGFPoly2);
        int[] findErrorMagnitudes = findErrorMagnitudes(genericGFPoly3, findErrorLocations);
        for (int i3 = 0; i3 < findErrorLocations.length; i3++) {
            int length = (iArr.length - 1) - this.field.log(findErrorLocations[i3]);
            if (length < 0) {
                throw new com.google.zxing.common.reedsolomon.ReedSolomonException("Bad error location");
            }
            iArr[length] = com.google.zxing.common.reedsolomon.GenericGF.addOrSubtract(iArr[length], findErrorMagnitudes[i3]);
        }
    }

    private com.google.zxing.common.reedsolomon.GenericGFPoly[] runEuclideanAlgorithm(com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly, com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly2, int i) throws com.google.zxing.common.reedsolomon.ReedSolomonException {
        if (genericGFPoly.getDegree() < genericGFPoly2.getDegree()) {
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly2;
        }
        com.google.zxing.common.reedsolomon.GenericGFPoly zero = this.field.getZero();
        com.google.zxing.common.reedsolomon.GenericGFPoly one = this.field.getOne();
        do {
            com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly3 = genericGFPoly2;
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly3;
            com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly4 = one;
            com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly5 = zero;
            zero = genericGFPoly4;
            if (genericGFPoly.getDegree() >= i / 2) {
                if (genericGFPoly.isZero()) {
                    throw new com.google.zxing.common.reedsolomon.ReedSolomonException("r_{i-1} was zero");
                }
                com.google.zxing.common.reedsolomon.GenericGFPoly zero2 = this.field.getZero();
                int inverse = this.field.inverse(genericGFPoly.getCoefficient(genericGFPoly.getDegree()));
                while (genericGFPoly2.getDegree() >= genericGFPoly.getDegree() && !genericGFPoly2.isZero()) {
                    int degree = genericGFPoly2.getDegree() - genericGFPoly.getDegree();
                    int multiply = this.field.multiply(genericGFPoly2.getCoefficient(genericGFPoly2.getDegree()), inverse);
                    zero2 = zero2.addOrSubtract(this.field.buildMonomial(degree, multiply));
                    genericGFPoly2 = genericGFPoly2.addOrSubtract(genericGFPoly.multiplyByMonomial(degree, multiply));
                }
                one = zero2.multiply(zero).addOrSubtract(genericGFPoly5);
            } else {
                int coefficient = zero.getCoefficient(0);
                if (coefficient == 0) {
                    throw new com.google.zxing.common.reedsolomon.ReedSolomonException("sigmaTilde(0) was zero");
                }
                int inverse2 = this.field.inverse(coefficient);
                return new com.google.zxing.common.reedsolomon.GenericGFPoly[]{zero.multiply(inverse2), genericGFPoly.multiply(inverse2)};
            }
        } while (genericGFPoly2.getDegree() < genericGFPoly.getDegree());
        throw new java.lang.IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    private int[] findErrorLocations(com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly) throws com.google.zxing.common.reedsolomon.ReedSolomonException {
        int degree = genericGFPoly.getDegree();
        int i = 0;
        if (degree == 1) {
            return new int[]{genericGFPoly.getCoefficient(1)};
        }
        int[] iArr = new int[degree];
        for (int i2 = 1; i2 < this.field.getSize() && i < degree; i2++) {
            if (genericGFPoly.evaluateAt(i2) == 0) {
                iArr[i] = this.field.inverse(i2);
                i++;
            }
        }
        if (i == degree) {
            return iArr;
        }
        throw new com.google.zxing.common.reedsolomon.ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] findErrorMagnitudes(com.google.zxing.common.reedsolomon.GenericGFPoly genericGFPoly, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int inverse = this.field.inverse(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int multiply = this.field.multiply(iArr[i3], inverse);
                    i2 = this.field.multiply(i2, (multiply & 1) == 0 ? multiply | 1 : multiply & (-2));
                }
            }
            iArr2[i] = this.field.multiply(genericGFPoly.evaluateAt(inverse), this.field.inverse(i2));
            if (this.field.getGeneratorBase() != 0) {
                iArr2[i] = this.field.multiply(iArr2[i], inverse);
            }
        }
        return iArr2;
    }
}
