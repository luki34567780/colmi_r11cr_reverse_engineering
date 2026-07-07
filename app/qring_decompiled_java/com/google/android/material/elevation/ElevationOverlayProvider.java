package com.google.android.material.elevation;

/* loaded from: /tmp/dex/classes2.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(android.content.Context context) {
        this.elevationOverlayEnabled = com.google.android.material.resources.MaterialAttributes.resolveBoolean(context, com.google.android.material.R.attr.elevationOverlayEnabled, false);
        this.elevationOverlayColor = com.google.android.material.color.MaterialColors.getColor(context, com.google.android.material.R.attr.elevationOverlayColor, 0);
        this.colorSurface = com.google.android.material.color.MaterialColors.getColor(context, com.google.android.material.R.attr.colorSurface, 0);
        this.displayDensity = context.getResources().getDisplayMetrics().density;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, android.view.View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(f + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return compositeOverlayIfNeeded(this.colorSurface, f);
    }

    public int compositeOverlayIfNeeded(int i, float f, android.view.View view) {
        return compositeOverlayIfNeeded(i, f + getParentAbsoluteElevation(view));
    }

    public int compositeOverlayIfNeeded(int i, float f) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i)) ? compositeOverlay(i, f) : i;
    }

    public int compositeOverlay(int i, float f, android.view.View view) {
        return compositeOverlay(i, f + getParentAbsoluteElevation(view));
    }

    public int compositeOverlay(int i, float f) {
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        return androidx.core.graphics.ColorUtils.setAlphaComponent(com.google.android.material.color.MaterialColors.layer(androidx.core.graphics.ColorUtils.setAlphaComponent(i, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction), android.graphics.Color.alpha(i));
    }

    public int calculateOverlayAlpha(float f) {
        return java.lang.Math.round(calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        if (this.displayDensity <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return java.lang.Math.min(((((float) java.lang.Math.log1p(f / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public float getParentAbsoluteElevation(android.view.View view) {
        return com.google.android.material.internal.ViewUtils.getParentAbsoluteElevation(view);
    }

    private boolean isThemeSurfaceColor(int i) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, 255) == this.colorSurface;
    }
}
