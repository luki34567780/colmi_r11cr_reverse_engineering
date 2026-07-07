package com.qcwireless.qcwatch.base.utils;

/* compiled from: MetricUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001¨\u0006\u000f"}, d2 = {"cmToIn", "", "cm", "getWholeText", "", "text", "byteCount", "kgToLbs", "kg", "kmToIn", "", "km", "kmToInRoundUp", "lbsToKg", "lbs", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MetricUtilsKt {
    public static final float kmToIn(float f) {
        return f * 0.6213712f;
    }

    public static final int cmToIn(int i) {
        return kotlin.math.MathKt.roundToInt(i / 2.54d);
    }

    public static final int kgToLbs(int i) {
        return kotlin.math.MathKt.roundToInt(new java.math.BigDecimal(i * 2.2046226d).floatValue());
    }

    public static final int lbsToKg(int i) {
        return kotlin.math.MathKt.roundToInt(new java.math.BigDecimal(i * 0.45359d).floatValue());
    }

    public static final float kmToInRoundUp(float f) {
        return new java.math.BigDecimal(f * 0.6213712d).setScale(2, 4).floatValue();
    }

    public static final java.lang.String getWholeText(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        try {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("utf-8");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            if (bytes.length > i) {
                char[] charArray = str.toCharArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
                int length = charArray.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = 0;
                        break;
                    }
                    char c = charArray[i2];
                    int i4 = 1;
                    if (!(c >= 0 && c < 128)) {
                        if (128 > c || c >= 2048) {
                            i4 = 0;
                        }
                        i4 = i4 != 0 ? 2 : 3;
                    }
                    i3 += i4;
                    if (i3 > i) {
                        break;
                    }
                    i2++;
                }
                return new java.lang.String(charArray, 0, i2);
            }
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        return str;
    }
}
