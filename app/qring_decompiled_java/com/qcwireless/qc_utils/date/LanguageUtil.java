package com.qcwireless.qc_utils.date;

/* loaded from: /tmp/dex/classes2.dex */
public class LanguageUtil {
    public static java.lang.String localLanguage = "fr";

    public static boolean changeDateFormat() {
        return localLanguage.contains(java.util.Locale.getDefault().getLanguage());
    }

    public static boolean isChina() {
        return java.util.Locale.getDefault().getLanguage().contains("zh");
    }
}
