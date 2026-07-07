package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class Mask {
    private final boolean inverted;
    private final com.airbnb.lottie.model.content.Mask.MaskMode maskMode;
    private final com.airbnb.lottie.model.animatable.AnimatableShapeValue maskPath;
    private final com.airbnb.lottie.model.animatable.AnimatableIntegerValue opacity;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(com.airbnb.lottie.model.content.Mask.MaskMode maskMode, com.airbnb.lottie.model.animatable.AnimatableShapeValue animatableShapeValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.maskMode = maskMode;
        this.maskPath = animatableShapeValue;
        this.opacity = animatableIntegerValue;
        this.inverted = z;
    }

    public com.airbnb.lottie.model.content.Mask.MaskMode getMaskMode() {
        return this.maskMode;
    }

    public com.airbnb.lottie.model.animatable.AnimatableShapeValue getMaskPath() {
        return this.maskPath;
    }

    public com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOpacity() {
        return this.opacity;
    }

    public boolean isInverted() {
        return this.inverted;
    }
}
