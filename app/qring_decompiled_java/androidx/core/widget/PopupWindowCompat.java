package androidx.core.widget;

/* loaded from: classes.dex */
public final class PopupWindowCompat {
    private static final java.lang.String TAG = "PopupWindowCompatApi21";
    private static java.lang.reflect.Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static java.lang.reflect.Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static java.lang.reflect.Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    private PopupWindowCompat() {
    }

    public static void showAsDropDown(android.widget.PopupWindow popupWindow, android.view.View view, int i, int i2, int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            androidx.core.widget.PopupWindowCompat.Api19Impl.showAsDropDown(popupWindow, view, i, i2, i3);
            return;
        }
        if ((androidx.core.view.GravityCompat.getAbsoluteGravity(i3, androidx.core.view.ViewCompat.getLayoutDirection(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public static void setOverlapAnchor(android.widget.PopupWindow popupWindow, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.core.widget.PopupWindowCompat.Api23Impl.setOverlapAnchor(popupWindow, z);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            if (!sOverlapAnchorFieldAttempted) {
                try {
                    java.lang.reflect.Field declaredField = android.widget.PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    sOverlapAnchorField = declaredField;
                    declaredField.setAccessible(true);
                } catch (java.lang.NoSuchFieldException e) {
                    android.util.Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                sOverlapAnchorFieldAttempted = true;
            }
            java.lang.reflect.Field field = sOverlapAnchorField;
            if (field != null) {
                try {
                    field.set(popupWindow, java.lang.Boolean.valueOf(z));
                } catch (java.lang.IllegalAccessException e2) {
                    android.util.Log.i(TAG, "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    public static boolean getOverlapAnchor(android.widget.PopupWindow popupWindow) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.widget.PopupWindowCompat.Api23Impl.getOverlapAnchor(popupWindow);
        }
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (!sOverlapAnchorFieldAttempted) {
            try {
                java.lang.reflect.Field declaredField = android.widget.PopupWindow.class.getDeclaredField("mOverlapAnchor");
                sOverlapAnchorField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            sOverlapAnchorFieldAttempted = true;
        }
        java.lang.reflect.Field field = sOverlapAnchorField;
        if (field == null) {
            return false;
        }
        try {
            return ((java.lang.Boolean) field.get(popupWindow)).booleanValue();
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.i(TAG, "Could not get overlap anchor field in PopupWindow", e2);
            return false;
        }
    }

    public static void setWindowLayoutType(android.widget.PopupWindow popupWindow, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.core.widget.PopupWindowCompat.Api23Impl.setWindowLayoutType(popupWindow, i);
            return;
        }
        if (!sSetWindowLayoutTypeMethodAttempted) {
            try {
                java.lang.reflect.Method declaredMethod = android.widget.PopupWindow.class.getDeclaredMethod("setWindowLayoutType", java.lang.Integer.TYPE);
                sSetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.Exception unused) {
            }
            sSetWindowLayoutTypeMethodAttempted = true;
        }
        java.lang.reflect.Method method = sSetWindowLayoutTypeMethod;
        if (method != null) {
            try {
                method.invoke(popupWindow, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    public static int getWindowLayoutType(android.widget.PopupWindow popupWindow) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.widget.PopupWindowCompat.Api23Impl.getWindowLayoutType(popupWindow);
        }
        if (!sGetWindowLayoutTypeMethodAttempted) {
            try {
                java.lang.reflect.Method declaredMethod = android.widget.PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new java.lang.Class[0]);
                sGetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.Exception unused) {
            }
            sGetWindowLayoutTypeMethodAttempted = true;
        }
        java.lang.reflect.Method method = sGetWindowLayoutTypeMethod;
        if (method != null) {
            try {
                return ((java.lang.Integer) method.invoke(popupWindow, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception unused2) {
            }
        }
        return 0;
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setOverlapAnchor(android.widget.PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        static boolean getOverlapAnchor(android.widget.PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static void setWindowLayoutType(android.widget.PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        static int getWindowLayoutType(android.widget.PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void showAsDropDown(android.widget.PopupWindow popupWindow, android.view.View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }
}
