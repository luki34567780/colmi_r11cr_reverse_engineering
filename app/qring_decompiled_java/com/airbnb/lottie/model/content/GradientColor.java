package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class GradientColor {
    private final int[] colors;
    private final float[] positions;

    public GradientColor(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    public float[] getPositions() {
        return this.positions;
    }

    public int[] getColors() {
        return this.colors;
    }

    public int getSize() {
        return this.colors.length;
    }

    public void lerp(com.airbnb.lottie.model.content.GradientColor gradientColor, com.airbnb.lottie.model.content.GradientColor gradientColor2, float f) {
        if (gradientColor.colors.length != gradientColor2.colors.length) {
            throw new java.lang.IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + gradientColor.colors.length + " vs " + gradientColor2.colors.length + ")");
        }
        for (int i = 0; i < gradientColor.colors.length; i++) {
            this.positions[i] = com.airbnb.lottie.utils.MiscUtils.lerp(gradientColor.positions[i], gradientColor2.positions[i], f);
            this.colors[i] = com.airbnb.lottie.utils.GammaEvaluator.evaluate(f, gradientColor.colors[i], gradientColor2.colors[i]);
        }
    }
}
