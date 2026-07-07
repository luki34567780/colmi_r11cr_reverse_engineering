package skin.support.utils;

/* loaded from: classes3.dex */
public final class SkinCompatVersionUtils {
    private static final java.lang.String TAG = "SkinCompatUtils";
    private static java.lang.Class<?> sV4DrawableWrapperClass;
    private static java.lang.reflect.Method sV4DrawableWrapperGetM;
    private static java.lang.reflect.Method sV4DrawableWrapperSetM;
    private static java.lang.Class<?> sV4WrappedDrawableClass;
    private static java.lang.reflect.Method sV4WrappedDrawableGetM;
    private static java.lang.reflect.Method sV4WrappedDrawableSetM;
    private static java.lang.Class<?> sV7DrawableWrapperClass;
    private static java.lang.reflect.Method sV7DrawableWrapperGetM;
    private static java.lang.reflect.Method sV7DrawableWrapperSetM;

    static {
        try {
            sV4WrappedDrawableClass = java.lang.Class.forName("android.support.v4.graphics.drawable.WrappedDrawable");
        } catch (java.lang.ClassNotFoundException unused) {
            if (skin.support.utils.Slog.DEBUG) {
                skin.support.utils.Slog.i(TAG, "hasV4WrappedDrawable = false");
            }
        }
        try {
            sV4DrawableWrapperClass = java.lang.Class.forName("android.support.v4.graphics.drawable.DrawableWrapper");
        } catch (java.lang.ClassNotFoundException unused2) {
            if (skin.support.utils.Slog.DEBUG) {
                skin.support.utils.Slog.i(TAG, "hasV4DrawableWrapper = false");
            }
        }
        try {
            sV7DrawableWrapperClass = java.lang.Class.forName("android.support.v7.graphics.drawable.DrawableWrapper");
        } catch (java.lang.ClassNotFoundException unused3) {
            if (skin.support.utils.Slog.DEBUG) {
                skin.support.utils.Slog.i(TAG, "hasV7DrawableWrapper = false");
            }
        }
    }

    public static boolean hasV4WrappedDrawable() {
        return sV4WrappedDrawableClass != null;
    }

    public static boolean isV4WrappedDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.Class<?> cls = sV4WrappedDrawableClass;
        return cls != null && cls.isAssignableFrom(drawable.getClass());
    }

    public static android.graphics.drawable.Drawable getV4WrappedDrawableWrappedDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.Class<?> cls = sV4WrappedDrawableClass;
        if (cls != null) {
            if (sV4WrappedDrawableGetM == null) {
                try {
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("getWrappedDrawable", new java.lang.Class[0]);
                    sV4WrappedDrawableGetM = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.Exception unused) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "getV4WrappedDrawableWrappedDrawable No Such Method");
                    }
                }
            }
            java.lang.reflect.Method method = sV4WrappedDrawableGetM;
            if (method != null) {
                try {
                    return (android.graphics.drawable.Drawable) method.invoke(drawable, new java.lang.Object[0]);
                } catch (java.lang.Exception e) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "getV4WrappedDrawableWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
        return drawable;
    }

    public static void setV4WrappedDrawableWrappedDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        java.lang.Class<?> cls = sV4WrappedDrawableClass;
        if (cls != null) {
            if (sV4WrappedDrawableSetM == null) {
                try {
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setWrappedDrawable", android.graphics.drawable.Drawable.class);
                    sV4WrappedDrawableSetM = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.Exception unused) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "setV4WrappedDrawableWrappedDrawable No Such Method");
                    }
                }
            }
            java.lang.reflect.Method method = sV4WrappedDrawableSetM;
            if (method != null) {
                try {
                    method.invoke(drawable, drawable2);
                } catch (java.lang.Exception e) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "setV4WrappedDrawableWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
    }

    public static boolean hasV4DrawableWrapper() {
        return sV4DrawableWrapperClass != null;
    }

    public static boolean isV4DrawableWrapper(android.graphics.drawable.Drawable drawable) {
        java.lang.Class<?> cls = sV4DrawableWrapperClass;
        return cls != null && cls.isAssignableFrom(drawable.getClass());
    }

    public static android.graphics.drawable.Drawable getV4DrawableWrapperWrappedDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.Class<?> cls = sV4DrawableWrapperClass;
        if (cls != null) {
            if (sV4DrawableWrapperGetM == null) {
                try {
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("getWrappedDrawable", new java.lang.Class[0]);
                    sV4DrawableWrapperGetM = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.Exception unused) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "getV4DrawableWrapperWrappedDrawable No Such Method");
                    }
                }
            }
            java.lang.reflect.Method method = sV4DrawableWrapperGetM;
            if (method != null) {
                try {
                    return (android.graphics.drawable.Drawable) method.invoke(drawable, new java.lang.Object[0]);
                } catch (java.lang.Exception e) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "getV4DrawableWrapperWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
        return drawable;
    }

    public static void setV4DrawableWrapperWrappedDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        java.lang.Class<?> cls = sV4DrawableWrapperClass;
        if (cls != null) {
            if (sV4DrawableWrapperSetM == null) {
                try {
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setWrappedDrawable", android.graphics.drawable.Drawable.class);
                    sV4DrawableWrapperSetM = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.Exception unused) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "setV4DrawableWrapperWrappedDrawable No Such Method");
                    }
                }
            }
            java.lang.reflect.Method method = sV4DrawableWrapperSetM;
            if (method != null) {
                try {
                    method.invoke(drawable, drawable2);
                } catch (java.lang.Exception e) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "setV4DrawableWrapperWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
    }

    public static boolean hasV7DrawableWrapper() {
        return sV7DrawableWrapperClass != null;
    }

    public static boolean isV7DrawableWrapper(android.graphics.drawable.Drawable drawable) {
        java.lang.Class<?> cls = sV7DrawableWrapperClass;
        return cls != null && cls.isAssignableFrom(drawable.getClass());
    }

    public static android.graphics.drawable.Drawable getV7DrawableWrapperWrappedDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.Class<?> cls = sV7DrawableWrapperClass;
        if (cls != null) {
            if (sV7DrawableWrapperGetM == null) {
                try {
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("getWrappedDrawable", new java.lang.Class[0]);
                    sV7DrawableWrapperGetM = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.Exception unused) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "getV7DrawableWrapperWrappedDrawable No Such Method");
                    }
                }
            }
            java.lang.reflect.Method method = sV7DrawableWrapperGetM;
            if (method != null) {
                try {
                    return (android.graphics.drawable.Drawable) method.invoke(drawable, new java.lang.Object[0]);
                } catch (java.lang.Exception e) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "getV7DrawableWrapperWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
        return drawable;
    }

    public static void setV7DrawableWrapperWrappedDrawable(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        java.lang.Class<?> cls = sV7DrawableWrapperClass;
        if (cls != null) {
            if (sV7DrawableWrapperSetM == null) {
                try {
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("setWrappedDrawable", android.graphics.drawable.Drawable.class);
                    sV7DrawableWrapperSetM = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.Exception unused) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "setV7DrawableWrapperWrappedDrawable No Such Method");
                    }
                }
            }
            java.lang.reflect.Method method = sV7DrawableWrapperSetM;
            if (method != null) {
                try {
                    method.invoke(drawable, drawable2);
                } catch (java.lang.Exception e) {
                    if (skin.support.utils.Slog.DEBUG) {
                        skin.support.utils.Slog.i(TAG, "setV7DrawableWrapperWrappedDrawable invoke error: " + e);
                    }
                }
            }
        }
    }
}
