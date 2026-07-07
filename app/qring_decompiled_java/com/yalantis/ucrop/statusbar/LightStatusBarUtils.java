package com.yalantis.ucrop.statusbar;

/* loaded from: classes3.dex */
public class LightStatusBarUtils {
    public static void setLightStatusBarAboveAPI23(android.app.Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            setLightStatusBar(activity, z, z2, z3, z4);
        }
    }

    public static void setLightStatusBar(android.app.Activity activity, boolean z) {
        setLightStatusBar(activity, false, false, false, z);
    }

    public static void setLightStatusBar(android.app.Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
        int lightStatausBarAvailableRomType = com.yalantis.ucrop.statusbar.RomUtils.getLightStatausBarAvailableRomType();
        if (lightStatausBarAvailableRomType == 1) {
            if (com.yalantis.ucrop.statusbar.RomUtils.getMIUIVersionCode() >= 7) {
                setAndroidNativeLightStatusBar(activity, z, z2, z3, z4);
                return;
            } else {
                setMIUILightStatusBar(activity, z, z2, z3, z4);
                return;
            }
        }
        if (lightStatausBarAvailableRomType == 2) {
            setFlymeLightStatusBar(activity, z, z2, z3, z4);
        } else {
            if (lightStatausBarAvailableRomType != 3) {
                return;
            }
            setAndroidNativeLightStatusBar(activity, z, z2, z3, z4);
        }
    }

    private static boolean setMIUILightStatusBar(android.app.Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
        initStatusBarStyle(activity, z, z2);
        java.lang.Class<?> cls = activity.getWindow().getClass();
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            java.lang.reflect.Method method = cls.getMethod("setExtraFlags", java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            android.view.Window window = activity.getWindow();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(z4 ? i : 0);
            objArr[1] = java.lang.Integer.valueOf(i);
            method.invoke(window, objArr);
            return true;
        } catch (java.lang.Exception unused) {
            setAndroidNativeLightStatusBar(activity, z, z2, z3, z4);
            return false;
        }
    }

    private static boolean setFlymeLightStatusBar(android.app.Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        if (activity == null) {
            return false;
        }
        initStatusBarStyle(activity, z, z2);
        try {
            android.view.WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            java.lang.reflect.Field declaredField = android.view.WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            java.lang.reflect.Field declaredField2 = android.view.WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z4 ? i | i2 : (~i) & i2);
            activity.getWindow().setAttributes(attributes);
            try {
                if (com.yalantis.ucrop.statusbar.RomUtils.getFlymeVersion() < 7) {
                    return true;
                }
                setAndroidNativeLightStatusBar(activity, z, z2, z3, z4);
                return true;
            } catch (java.lang.Exception unused) {
                setAndroidNativeLightStatusBar(activity, z, z2, z3, z4);
                return z5;
            }
        } catch (java.lang.Exception unused2) {
            z5 = false;
        }
    }

    private static void setAndroidNativeLightStatusBar(android.app.Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
        try {
            if (z3) {
                android.view.Window window = activity.getWindow();
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    if (z && z2) {
                        if (z4 && android.os.Build.VERSION.SDK_INT >= 23) {
                            window.getDecorView().setSystemUiVisibility(8448);
                        } else {
                            window.getDecorView().setSystemUiVisibility(256);
                        }
                    } else if (z || z2) {
                        if (z || !z2) {
                            return;
                        }
                        if (z4 && android.os.Build.VERSION.SDK_INT >= 23) {
                            window.getDecorView().setSystemUiVisibility(9472);
                        } else {
                            window.getDecorView().setSystemUiVisibility(com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING);
                        }
                    } else if (z4 && android.os.Build.VERSION.SDK_INT >= 23) {
                        window.getDecorView().setSystemUiVisibility(9472);
                    } else {
                        window.getDecorView().setSystemUiVisibility(com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING);
                    }
                }
            } else {
                android.view.View decorView = activity.getWindow().getDecorView();
                if (z4 && android.os.Build.VERSION.SDK_INT >= 23) {
                    decorView.setSystemUiVisibility(8192);
                } else {
                    decorView.setSystemUiVisibility(0);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private static void initStatusBarStyle(android.app.Activity activity, boolean z, boolean z2) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            if (z && z2) {
                activity.getWindow().getDecorView().setSystemUiVisibility(256);
                return;
            }
            if (!z && !z2) {
                activity.getWindow().getDecorView().setSystemUiVisibility(com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING);
            } else {
                if (z || !z2) {
                    return;
                }
                activity.getWindow().getDecorView().setSystemUiVisibility(com.realsil.sdk.core.bluetooth.impl.BluetoothClassImpl.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING);
            }
        }
    }
}
