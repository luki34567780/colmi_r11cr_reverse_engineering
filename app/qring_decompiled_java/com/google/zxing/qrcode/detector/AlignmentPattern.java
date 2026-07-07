package com.google.zxing.qrcode.detector;

/* loaded from: /tmp/dex/classes2.dex */
public final class AlignmentPattern extends com.google.zxing.ResultPoint {
    private final float estimatedModuleSize;

    AlignmentPattern(float f, float f2, float f3) {
        super(f, f2);
        this.estimatedModuleSize = f3;
    }

    boolean aboutEquals(float f, float f2, float f3) {
        if (java.lang.Math.abs(f2 - getY()) > f || java.lang.Math.abs(f3 - getX()) > f) {
            return false;
        }
        float abs = java.lang.Math.abs(f - this.estimatedModuleSize);
        return abs <= 1.0f || abs <= this.estimatedModuleSize;
    }

    com.google.zxing.qrcode.detector.AlignmentPattern combineEstimate(float f, float f2, float f3) {
        return new com.google.zxing.qrcode.detector.AlignmentPattern((getX() + f2) / 2.0f, (getY() + f) / 2.0f, (this.estimatedModuleSize + f3) / 2.0f);
    }
}
