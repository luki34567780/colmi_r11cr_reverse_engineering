package com.google.android.material.color;

/* loaded from: /tmp/dex/classes2.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    private MaterialColors() {
    }

    public static int getColor(android.view.View view, int i) {
        return com.google.android.material.resources.MaterialAttributes.resolveOrThrow(view, i);
    }

    public static int getColor(android.content.Context context, int i, java.lang.String str) {
        return com.google.android.material.resources.MaterialAttributes.resolveOrThrow(context, i, str);
    }

    public static int getColor(android.view.View view, int i, int i2) {
        return getColor(view.getContext(), i, i2);
    }

    public static int getColor(android.content.Context context, int i, int i2) {
        android.util.TypedValue resolve = com.google.android.material.resources.MaterialAttributes.resolve(context, i);
        return resolve != null ? resolve.data : i2;
    }

    public static int layer(android.view.View view, int i, int i2) {
        return layer(view, i, i2, 1.0f);
    }

    public static int layer(android.view.View view, int i, int i2, float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    public static int layer(int i, int i2, float f) {
        return layer(i, androidx.core.graphics.ColorUtils.setAlphaComponent(i2, java.lang.Math.round(android.graphics.Color.alpha(i2) * f)));
    }

    public static int layer(int i, int i2) {
        return androidx.core.graphics.ColorUtils.compositeColors(i2, i);
    }

    public static int compositeARGBWithAlpha(int i, int i2) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, (android.graphics.Color.alpha(i) * i2) / 255);
    }
}
