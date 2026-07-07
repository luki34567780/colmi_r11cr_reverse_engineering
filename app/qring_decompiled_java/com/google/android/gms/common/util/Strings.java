package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class Strings {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    public static java.lang.String emptyToNull(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEmptyOrWhitespace(java.lang.String str) {
        return str == null || str.trim().isEmpty();
    }
}
