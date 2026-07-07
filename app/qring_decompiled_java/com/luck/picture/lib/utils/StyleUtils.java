package com.luck.picture.lib.utils;

/* loaded from: /tmp/dex/classes2.dex */
public class StyleUtils {
    private static final int INVALID = 0;

    public static boolean checkSizeValidity(int i) {
        return i > 0;
    }

    public static boolean checkStyleValidity(int i) {
        return i != 0;
    }

    public static boolean checkTextValidity(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str);
    }

    public static boolean checkTextFormatValidity(java.lang.String str) {
        return java.util.regex.Pattern.compile("\\([^)]*\\)").matcher(str).find();
    }

    public static boolean checkTextTwoFormatValidity(java.lang.String str) {
        int i = 0;
        while (java.util.regex.Pattern.compile("%[^%]*\\d").matcher(str).find()) {
            i++;
        }
        return i >= 2;
    }

    public static boolean checkArrayValidity(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    public static android.graphics.ColorFilter getColorFilter(android.content.Context context, int i) {
        return androidx.core.graphics.BlendModeColorFilterCompat.createBlendModeColorFilterCompat(androidx.core.content.ContextCompat.getColor(context, i), androidx.core.graphics.BlendModeCompat.SRC_ATOP);
    }
}
