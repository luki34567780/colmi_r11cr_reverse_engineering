package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class ColorUtils {
    public static int setAlphaComponent(int i, float f) {
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (((int) ((f * 255.0f) + 0.5f)) << 24);
    }

    public static int setAlphaComponent(int i, int i2) {
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    public static int setBlueComponent(int i, float f) {
        return (i & androidx.core.view.InputDeviceCompat.SOURCE_ANY) | ((int) ((f * 255.0f) + 0.5f));
    }

    public static int setBlueComponent(int i, int i2) {
        return (i & androidx.core.view.InputDeviceCompat.SOURCE_ANY) | i2;
    }

    public static int setGreenComponent(int i, float f) {
        return (i & (-65281)) | (((int) ((f * 255.0f) + 0.5f)) << 8);
    }

    public static int setGreenComponent(int i, int i2) {
        return (i & (-65281)) | (i2 << 8);
    }

    public static int setRedComponent(int i, float f) {
        return (i & (-16711681)) | (((int) ((f * 255.0f) + 0.5f)) << 16);
    }

    public static int setRedComponent(int i, int i2) {
        return (i & (-16711681)) | (i2 << 16);
    }

    private ColorUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getColor(int i) {
        return androidx.core.content.ContextCompat.getColor(com.blankj.utilcode.util.Utils.getApp(), i);
    }

    public static int string2Int(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'colorString' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return android.graphics.Color.parseColor(str);
    }

    public static java.lang.String int2RgbString(int i) {
        java.lang.String hexString = java.lang.Integer.toHexString(i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        return "#" + hexString;
    }

    public static java.lang.String int2ArgbString(int i) {
        java.lang.String hexString = java.lang.Integer.toHexString(i);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        while (hexString.length() < 8) {
            hexString = com.amap.api.col.p0003sl.js.i + hexString;
        }
        return "#" + hexString;
    }

    public static int getRandomColor() {
        return getRandomColor(true);
    }

    public static int getRandomColor(boolean z) {
        return (z ? ((int) (java.lang.Math.random() * 256.0d)) << 24 : androidx.core.view.ViewCompat.MEASURED_STATE_MASK) | ((int) (java.lang.Math.random() * 1.6777216E7d));
    }

    public static boolean isLightColor(int i) {
        return ((((double) android.graphics.Color.red(i)) * 0.299d) + (((double) android.graphics.Color.green(i)) * 0.587d)) + (((double) android.graphics.Color.blue(i)) * 0.114d) >= 127.5d;
    }
}
