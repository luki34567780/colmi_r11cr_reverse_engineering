package com.luck.picture.lib.language;

/* loaded from: /tmp/dex/classes2.dex */
public class LocaleTransform {
    public static java.util.Locale getLanguage(int i) {
        switch (i) {
            case 1:
                return java.util.Locale.TRADITIONAL_CHINESE;
            case 2:
                return java.util.Locale.ENGLISH;
            case 3:
                return java.util.Locale.KOREA;
            case 4:
                return java.util.Locale.GERMANY;
            case 5:
                return java.util.Locale.FRANCE;
            case 6:
                return java.util.Locale.JAPAN;
            case 7:
                return new java.util.Locale("vi");
            case 8:
                return new java.util.Locale("es", "ES");
            case 9:
                return new java.util.Locale("pt", "PT");
            case 10:
                return new java.util.Locale("ar", "AE");
            case 11:
                return new java.util.Locale("ru", "rRU");
            case 12:
                return new java.util.Locale("cs", "rCZ");
            case 13:
                return new java.util.Locale("kk", "rKZ");
            default:
                return java.util.Locale.CHINESE;
        }
    }
}
