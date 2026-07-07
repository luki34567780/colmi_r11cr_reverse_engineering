package androidx.transition;

/* loaded from: classes.dex */
class ViewGroupUtils {
    private static java.lang.reflect.Method sGetChildDrawingOrderMethod = null;
    private static boolean sGetChildDrawingOrderMethodFetched = false;
    private static boolean sTryHiddenSuppressLayout = true;

    static androidx.transition.ViewGroupOverlayImpl getOverlay(android.view.ViewGroup viewGroup) {
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return new androidx.transition.ViewGroupOverlayApi18(viewGroup);
        }
        return androidx.transition.ViewGroupOverlayApi14.createFrom(viewGroup);
    }

    static void suppressLayout(android.view.ViewGroup viewGroup, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (android.os.Build.VERSION.SDK_INT >= 18) {
            hiddenSuppressLayout(viewGroup, z);
        } else {
            androidx.transition.ViewGroupUtilsApi14.suppressLayout(viewGroup, z);
        }
    }

    private static void hiddenSuppressLayout(android.view.ViewGroup viewGroup, boolean z) {
        if (sTryHiddenSuppressLayout) {
            try {
                viewGroup.suppressLayout(z);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenSuppressLayout = false;
            }
        }
    }

    static int getChildDrawingOrder(android.view.ViewGroup viewGroup, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!sGetChildDrawingOrderMethodFetched) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                sGetChildDrawingOrderMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            sGetChildDrawingOrderMethodFetched = true;
        }
        java.lang.reflect.Method method = sGetChildDrawingOrderMethod;
        if (method != null) {
            try {
                return ((java.lang.Integer) method.invoke(viewGroup, java.lang.Integer.valueOf(viewGroup.getChildCount()), java.lang.Integer.valueOf(i))).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
        return i;
    }

    private ViewGroupUtils() {
    }
}
