package androidx.core.os;

/* loaded from: classes.dex */
public class BuildCompat {

    public @interface PrereleaseSdkCheck {
    }

    private BuildCompat() {
    }

    protected static boolean isAtLeastPreReleaseCodename(java.lang.String str, java.lang.String str2) {
        return !"REL".equals(str2) && str2.compareTo(str) >= 0;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastN() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastNMR1() {
        return android.os.Build.VERSION.SDK_INT >= 25;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastO() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastOMR1() {
        return android.os.Build.VERSION.SDK_INT >= 27;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastP() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastQ() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastR() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isAtLeastS() {
        return android.os.Build.VERSION.SDK_INT >= 31 || isAtLeastPreReleaseCodename(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, android.os.Build.VERSION.CODENAME);
    }

    public static boolean isAtLeastT() {
        return isAtLeastPreReleaseCodename(androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, android.os.Build.VERSION.CODENAME);
    }
}
