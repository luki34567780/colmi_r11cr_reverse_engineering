package com.gyf.immersionbar;

/* loaded from: /tmp/dex/classes2.dex */
class SpecialBarFontUtils {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static java.lang.reflect.Method mSetStatusBarColorIcon;
    private static java.lang.reflect.Method mSetStatusBarDarkIcon;
    private static java.lang.reflect.Field mStatusBarColorFiled;

    static int toGrey(int i) {
        return (((((i & 16711680) >> 16) * 38) + (((65280 & i) >> 8) * 75)) + ((i & 255) * 15)) >> 7;
    }

    SpecialBarFontUtils() {
    }

    static {
        try {
            mSetStatusBarColorIcon = android.app.Activity.class.getMethod("setStatusBarDarkIcon", java.lang.Integer.TYPE);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        try {
            mSetStatusBarDarkIcon = android.app.Activity.class.getMethod("setStatusBarDarkIcon", java.lang.Boolean.TYPE);
        } catch (java.lang.NoSuchMethodException unused2) {
        }
        try {
            mStatusBarColorFiled = android.view.WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (java.lang.NoSuchFieldException unused3) {
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = android.view.View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused4) {
        }
    }

    static boolean isBlackColor(int i, int i2) {
        return toGrey(i) < i2;
    }

    public static void setStatusBarDarkIcon(android.app.Activity activity, int i) {
        java.lang.reflect.Method method = mSetStatusBarColorIcon;
        if (method != null) {
            try {
                method.invoke(activity, java.lang.Integer.valueOf(i));
                return;
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
                return;
            } catch (java.lang.reflect.InvocationTargetException e2) {
                e2.printStackTrace();
                return;
            }
        }
        boolean isBlackColor = isBlackColor(i, 50);
        if (mStatusBarColorFiled != null) {
            setStatusBarDarkIcon(activity, isBlackColor, isBlackColor);
            setStatusBarDarkIcon(activity.getWindow(), i);
        } else {
            setStatusBarDarkIcon(activity, isBlackColor);
        }
    }

    public static void setStatusBarDarkIcon(android.view.Window window, int i) {
        try {
            setStatusBarColor(window, i);
            if (android.os.Build.VERSION.SDK_INT > 22) {
                setStatusBarDarkIcon(window.getDecorView(), true);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void setStatusBarDarkIcon(android.app.Activity activity, boolean z) {
        setStatusBarDarkIcon(activity, z, true);
    }

    private static boolean changeMeizuFlag(android.view.WindowManager.LayoutParams layoutParams, java.lang.String str, boolean z) {
        try {
            java.lang.reflect.Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i = declaredField.getInt(layoutParams);
            java.lang.reflect.Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i2 = declaredField2.getInt(layoutParams);
            int i3 = z ? i | i2 : (~i) & i2;
            if (i2 == i3) {
                return false;
            }
            declaredField2.setInt(layoutParams, i3);
            return true;
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (java.lang.IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        } catch (java.lang.NoSuchFieldException e3) {
            e3.printStackTrace();
            return false;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static void setStatusBarDarkIcon(android.view.View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility;
        } else {
            i = (~SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) & systemUiVisibility;
        }
        if (i != systemUiVisibility) {
            view.setSystemUiVisibility(i);
        }
    }

    private static void setStatusBarColor(android.view.Window window, int i) {
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        java.lang.reflect.Field field = mStatusBarColorFiled;
        if (field != null) {
            try {
                if (field.getInt(attributes) != i) {
                    mStatusBarColorFiled.set(attributes, java.lang.Integer.valueOf(i));
                    window.setAttributes(attributes);
                }
            } catch (java.lang.IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void setStatusBarDarkIcon(android.view.Window window, boolean z) {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            changeMeizuFlag(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
        } else {
            setStatusBarDarkIcon(window.getDecorView(), z);
            setStatusBarColor(window, 0);
        }
    }

    private static void setStatusBarDarkIcon(android.app.Activity activity, boolean z, boolean z2) {
        java.lang.reflect.Method method = mSetStatusBarDarkIcon;
        if (method == null) {
            if (z2) {
                setStatusBarDarkIcon(activity.getWindow(), z);
                return;
            }
            return;
        }
        try {
            method.invoke(activity, java.lang.Boolean.valueOf(z));
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    static void setMIUIBarDark(android.view.Window window, java.lang.String str, boolean z) {
        if (window != null) {
            java.lang.Class<?> cls = window.getClass();
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField(str).getInt(cls2);
                java.lang.reflect.Method method = cls.getMethod("setExtraFlags", java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                if (z) {
                    method.invoke(window, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, java.lang.Integer.valueOf(i));
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
