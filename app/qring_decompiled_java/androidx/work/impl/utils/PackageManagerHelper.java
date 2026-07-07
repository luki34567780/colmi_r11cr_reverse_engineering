package androidx.work.impl.utils;

/* loaded from: classes.dex */
public class PackageManagerHelper {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    public static void setComponentEnabled(android.content.Context context, java.lang.Class<?> klazz, boolean enabled) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.String str = TAG;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = klazz.getName();
            objArr[1] = enabled ? "enabled" : "disabled";
            logger.debug(str, java.lang.String.format("%s %s", objArr), new java.lang.Throwable[0]);
        } catch (java.lang.Exception e) {
            androidx.work.Logger logger2 = androidx.work.Logger.get();
            java.lang.String str2 = TAG;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = klazz.getName();
            objArr2[1] = enabled ? "enabled" : "disabled";
            logger2.debug(str2, java.lang.String.format("%s could not be %s", objArr2), e);
        }
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context context, java.lang.Class<?> klazz) {
        return isComponentExplicitlyEnabled(context, klazz.getName());
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context context, java.lang.String className) {
        return context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(context, className)) == 1;
    }
}
