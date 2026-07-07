package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class NumberUtils {
    private static final java.lang.ThreadLocal<java.text.DecimalFormat> DF_THREAD_LOCAL = new java.lang.ThreadLocal<java.text.DecimalFormat>() { // from class: com.blankj.utilcode.util.NumberUtils.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.DecimalFormat initialValue() {
            return (java.text.DecimalFormat) java.text.NumberFormat.getInstance();
        }
    };

    public static java.text.DecimalFormat getSafeDecimalFormat() {
        return DF_THREAD_LOCAL.get();
    }

    private NumberUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static java.lang.String format(float f, int i) {
        return format(f, false, 1, i, true);
    }

    public static java.lang.String format(float f, int i, boolean z) {
        return format(f, false, 1, i, z);
    }

    public static java.lang.String format(float f, int i, int i2, boolean z) {
        return format(f, false, i, i2, z);
    }

    public static java.lang.String format(float f, boolean z, int i) {
        return format(f, z, 1, i, true);
    }

    public static java.lang.String format(float f, boolean z, int i, boolean z2) {
        return format(f, z, 1, i, z2);
    }

    public static java.lang.String format(float f, boolean z, int i, int i2, boolean z2) {
        return format(float2Double(f), z, i, i2, z2);
    }

    public static java.lang.String format(double d, int i) {
        return format(d, false, 1, i, true);
    }

    public static java.lang.String format(double d, int i, boolean z) {
        return format(d, false, 1, i, z);
    }

    public static java.lang.String format(double d, int i, int i2, boolean z) {
        return format(d, false, i, i2, z);
    }

    public static java.lang.String format(double d, boolean z, int i) {
        return format(d, z, 1, i, true);
    }

    public static java.lang.String format(double d, boolean z, int i, boolean z2) {
        return format(d, z, 1, i, z2);
    }

    public static java.lang.String format(double d, boolean z, int i, int i2, boolean z2) {
        java.text.DecimalFormat safeDecimalFormat = getSafeDecimalFormat();
        safeDecimalFormat.setGroupingUsed(z);
        safeDecimalFormat.setRoundingMode(z2 ? java.math.RoundingMode.HALF_UP : java.math.RoundingMode.DOWN);
        safeDecimalFormat.setMinimumIntegerDigits(i);
        safeDecimalFormat.setMinimumFractionDigits(i2);
        safeDecimalFormat.setMaximumFractionDigits(i2);
        return safeDecimalFormat.format(d);
    }

    public static double float2Double(float f) {
        return new java.math.BigDecimal(java.lang.String.valueOf(f)).doubleValue();
    }
}
