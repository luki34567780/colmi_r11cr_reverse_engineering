package org.greenrobot.eventbus.android;

/* loaded from: classes3.dex */
public class AndroidDependenciesDetector {
    private static final java.lang.String ANDROID_COMPONENTS_IMPLEMENTATION_CLASS_NAME = "org.greenrobot.eventbus.android.AndroidComponentsImpl";

    public static boolean isAndroidSDKAvailable() {
        try {
            return java.lang.Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]) != null;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean areAndroidComponentsAvailable() {
        try {
            java.lang.Class.forName(ANDROID_COMPONENTS_IMPLEMENTATION_CLASS_NAME);
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public static org.greenrobot.eventbus.android.AndroidComponents instantiateAndroidComponents() {
        try {
            return (org.greenrobot.eventbus.android.AndroidComponents) java.lang.Class.forName(ANDROID_COMPONENTS_IMPLEMENTATION_CLASS_NAME).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
