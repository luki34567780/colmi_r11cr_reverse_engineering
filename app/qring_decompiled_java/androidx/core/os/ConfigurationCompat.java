package androidx.core.os;

/* loaded from: classes.dex */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    public static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration configuration) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? androidx.core.os.LocaleListCompat.wrap(configuration.getLocales()) : androidx.core.os.LocaleListCompat.create(configuration.locale);
    }
}
