package androidx.core.app;

/* loaded from: classes.dex */
public final class BundleCompat {

    static class BundleCompatBaseImpl {
        private static final java.lang.String TAG = "BundleCompatBaseImpl";
        private static java.lang.reflect.Method sGetIBinderMethod;
        private static boolean sGetIBinderMethodFetched;
        private static java.lang.reflect.Method sPutIBinderMethod;
        private static boolean sPutIBinderMethodFetched;

        private BundleCompatBaseImpl() {
        }

        public static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
            if (!sGetIBinderMethodFetched) {
                try {
                    java.lang.reflect.Method method = android.os.Bundle.class.getMethod("getIBinder", java.lang.String.class);
                    sGetIBinderMethod = method;
                    method.setAccessible(true);
                } catch (java.lang.NoSuchMethodException e) {
                    android.util.Log.i(TAG, "Failed to retrieve getIBinder method", e);
                }
                sGetIBinderMethodFetched = true;
            }
            java.lang.reflect.Method method2 = sGetIBinderMethod;
            if (method2 != null) {
                try {
                    return (android.os.IBinder) method2.invoke(bundle, str);
                } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.i(TAG, "Failed to invoke getIBinder via reflection", e2);
                    sGetIBinderMethod = null;
                }
            }
            return null;
        }

        public static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
            if (!sPutIBinderMethodFetched) {
                try {
                    java.lang.reflect.Method method = android.os.Bundle.class.getMethod("putIBinder", java.lang.String.class, android.os.IBinder.class);
                    sPutIBinderMethod = method;
                    method.setAccessible(true);
                } catch (java.lang.NoSuchMethodException e) {
                    android.util.Log.i(TAG, "Failed to retrieve putIBinder method", e);
                }
                sPutIBinderMethodFetched = true;
            }
            java.lang.reflect.Method method2 = sPutIBinderMethod;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.i(TAG, "Failed to invoke putIBinder via reflection", e2);
                    sPutIBinderMethod = null;
                }
            }
        }
    }

    private BundleCompat() {
    }

    public static android.os.IBinder getBinder(android.os.Bundle bundle, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return androidx.core.app.BundleCompat.BundleCompatBaseImpl.getBinder(bundle, str);
    }

    public static void putBinder(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            androidx.core.app.BundleCompat.BundleCompatBaseImpl.putBinder(bundle, str, iBinder);
        }
    }
}
