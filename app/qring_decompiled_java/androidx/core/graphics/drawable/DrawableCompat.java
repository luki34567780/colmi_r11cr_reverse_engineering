package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public final class DrawableCompat {
    private static final java.lang.String TAG = "DrawableCompat";
    private static java.lang.reflect.Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static java.lang.reflect.Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    @java.lang.Deprecated
    public static void jumpToCurrentState(android.graphics.drawable.Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(android.graphics.drawable.Drawable drawable, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static boolean isAutoMirrored(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void setHotspot(android.graphics.drawable.Drawable drawable, float f, float f2) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void setHotspotBounds(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setTint(android.graphics.drawable.Drawable drawable, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof androidx.core.graphics.drawable.TintAwareDrawable) {
            ((androidx.core.graphics.drawable.TintAwareDrawable) drawable).setTint(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setTintList(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof androidx.core.graphics.drawable.TintAwareDrawable) {
            ((androidx.core.graphics.drawable.TintAwareDrawable) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setTintMode(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof androidx.core.graphics.drawable.TintAwareDrawable) {
            ((androidx.core.graphics.drawable.TintAwareDrawable) drawable).setTintMode(mode);
        }
    }

    public static int getAlpha(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static void applyTheme(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean canApplyTheme(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void clearColorFilter(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.DrawableContainer.DrawableContainerState drawableContainerState;
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof android.graphics.drawable.InsetDrawable) {
                clearColorFilter(((android.graphics.drawable.InsetDrawable) drawable).getDrawable());
                return;
            }
            if (drawable instanceof androidx.core.graphics.drawable.WrappedDrawable) {
                clearColorFilter(((androidx.core.graphics.drawable.WrappedDrawable) drawable).getWrappedDrawable());
                return;
            }
            if (!(drawable instanceof android.graphics.drawable.DrawableContainer) || (drawableContainerState = (android.graphics.drawable.DrawableContainer.DrawableContainerState) ((android.graphics.drawable.DrawableContainer) drawable).getConstantState()) == null) {
                return;
            }
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.graphics.drawable.Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    clearColorFilter(child);
                }
            }
            return;
        }
        drawable.clearColorFilter();
    }

    public static void inflate(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static android.graphics.drawable.Drawable wrap(android.graphics.drawable.Drawable drawable) {
        return android.os.Build.VERSION.SDK_INT >= 23 ? drawable : android.os.Build.VERSION.SDK_INT >= 21 ? !(drawable instanceof androidx.core.graphics.drawable.TintAwareDrawable) ? new androidx.core.graphics.drawable.WrappedDrawableApi21(drawable) : drawable : !(drawable instanceof androidx.core.graphics.drawable.TintAwareDrawable) ? new androidx.core.graphics.drawable.WrappedDrawableApi14(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends android.graphics.drawable.Drawable> T unwrap(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof androidx.core.graphics.drawable.WrappedDrawable ? (T) ((androidx.core.graphics.drawable.WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static boolean setLayoutDirection(android.graphics.drawable.Drawable drawable, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            if (!sSetLayoutDirectionMethodFetched) {
                try {
                    java.lang.reflect.Method declaredMethod = android.graphics.drawable.Drawable.class.getDeclaredMethod("setLayoutDirection", java.lang.Integer.TYPE);
                    sSetLayoutDirectionMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.NoSuchMethodException e) {
                    android.util.Log.i(TAG, "Failed to retrieve setLayoutDirection(int) method", e);
                }
                sSetLayoutDirectionMethodFetched = true;
            }
            java.lang.reflect.Method method = sSetLayoutDirectionMethod;
            if (method != null) {
                try {
                    method.invoke(drawable, java.lang.Integer.valueOf(i));
                    return true;
                } catch (java.lang.Exception e2) {
                    android.util.Log.i(TAG, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    sSetLayoutDirectionMethod = null;
                }
            }
        }
        return false;
    }

    public static int getLayoutDirection(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            if (!sGetLayoutDirectionMethodFetched) {
                try {
                    java.lang.reflect.Method declaredMethod = android.graphics.drawable.Drawable.class.getDeclaredMethod("getLayoutDirection", new java.lang.Class[0]);
                    sGetLayoutDirectionMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.NoSuchMethodException e) {
                    android.util.Log.i(TAG, "Failed to retrieve getLayoutDirection() method", e);
                }
                sGetLayoutDirectionMethodFetched = true;
            }
            java.lang.reflect.Method method = sGetLayoutDirectionMethod;
            if (method != null) {
                try {
                    return ((java.lang.Integer) method.invoke(drawable, new java.lang.Object[0])).intValue();
                } catch (java.lang.Exception e2) {
                    android.util.Log.i(TAG, "Failed to invoke getLayoutDirection() via reflection", e2);
                    sGetLayoutDirectionMethod = null;
                }
            }
        }
        return 0;
    }

    private DrawableCompat() {
    }
}
