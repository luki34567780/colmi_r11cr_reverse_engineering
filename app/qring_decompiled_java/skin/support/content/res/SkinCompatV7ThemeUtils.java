package skin.support.content.res;

/* loaded from: classes3.dex */
public class SkinCompatV7ThemeUtils {
    private static final int[] APPCOMPAT_COLOR_PRIMARY_ATTRS = {androidx.appcompat.R.attr.colorPrimary};
    private static final int[] APPCOMPAT_COLOR_PRIMARY_DARK_ATTRS = {androidx.appcompat.R.attr.colorPrimaryDark};
    private static final int[] APPCOMPAT_COLOR_ACCENT_ATTRS = {androidx.appcompat.R.attr.colorAccent};

    public static int getColorPrimaryResId(android.content.Context context) {
        return skin.support.content.res.SkinCompatThemeUtils.getResId(context, APPCOMPAT_COLOR_PRIMARY_ATTRS);
    }

    public static int getColorPrimaryDarkResId(android.content.Context context) {
        return skin.support.content.res.SkinCompatThemeUtils.getResId(context, APPCOMPAT_COLOR_PRIMARY_DARK_ATTRS);
    }

    public static int getColorAccentResId(android.content.Context context) {
        return skin.support.content.res.SkinCompatThemeUtils.getResId(context, APPCOMPAT_COLOR_ACCENT_ATTRS);
    }
}
