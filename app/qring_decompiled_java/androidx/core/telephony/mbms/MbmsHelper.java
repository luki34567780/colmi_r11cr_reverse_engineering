package androidx.core.telephony.mbms;

/* loaded from: classes.dex */
public final class MbmsHelper {
    private MbmsHelper() {
    }

    public static java.lang.CharSequence getBestNameForService(android.content.Context context, android.telephony.mbms.ServiceInfo serviceInfo) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        android.os.LocaleList locales = context.getResources().getConfiguration().getLocales();
        int size = serviceInfo.getNamedContentLocales().size();
        if (size == 0) {
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[size];
        int i = 0;
        java.util.Iterator<java.util.Locale> it = serviceInfo.getNamedContentLocales().iterator();
        while (it.hasNext()) {
            strArr[i] = it.next().toLanguageTag();
            i++;
        }
        java.util.Locale firstMatch = locales.getFirstMatch(strArr);
        if (firstMatch == null) {
            return null;
        }
        return serviceInfo.getNameForLocale(firstMatch);
    }
}
