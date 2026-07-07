package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class AdaptScreenUtils {
    private static java.util.List<java.lang.reflect.Field> sMetricsFields;

    private AdaptScreenUtils() {
        throw new java.lang.UnsupportedOperationException("u can't instantiate me...");
    }

    public static android.content.res.Resources adaptWidth(android.content.res.Resources resources, int i) {
        java.util.Objects.requireNonNull(resources, "Argument 'resources' of type Resources (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        applyDisplayMetrics(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i);
        java.util.Objects.requireNonNull(resources, "Detected an attempt to return null from a method com.blankj.utilcode.util.AdaptScreenUtils.adaptWidth() marked by @androidx.annotation.NonNull");
        return resources;
    }

    public static android.content.res.Resources adaptHeight(android.content.res.Resources resources, int i) {
        java.util.Objects.requireNonNull(resources, "Argument 'resources' of type Resources (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        android.content.res.Resources adaptHeight = adaptHeight(resources, i, false);
        java.util.Objects.requireNonNull(adaptHeight, "Detected an attempt to return null from a method com.blankj.utilcode.util.AdaptScreenUtils.adaptHeight() marked by @androidx.annotation.NonNull");
        return adaptHeight;
    }

    public static android.content.res.Resources adaptHeight(android.content.res.Resources resources, int i, boolean z) {
        java.util.Objects.requireNonNull(resources, "Argument 'resources' of type Resources (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        applyDisplayMetrics(resources, ((resources.getDisplayMetrics().heightPixels + (z ? getNavBarHeight(resources) : 0)) * 72.0f) / i);
        java.util.Objects.requireNonNull(resources, "Detected an attempt to return null from a method com.blankj.utilcode.util.AdaptScreenUtils.adaptHeight() marked by @androidx.annotation.NonNull");
        return resources;
    }

    private static int getNavBarHeight(android.content.res.Resources resources) {
        java.util.Objects.requireNonNull(resources, "Argument 'resources' of type Resources (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static android.content.res.Resources closeAdapt(android.content.res.Resources resources) {
        java.util.Objects.requireNonNull(resources, "Argument 'resources' of type Resources (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        applyDisplayMetrics(resources, android.content.res.Resources.getSystem().getDisplayMetrics().density * 72.0f);
        java.util.Objects.requireNonNull(resources, "Detected an attempt to return null from a method com.blankj.utilcode.util.AdaptScreenUtils.closeAdapt() marked by @androidx.annotation.NonNull");
        return resources;
    }

    public static int pt2Px(float f) {
        return (int) (((f * com.blankj.utilcode.util.Utils.getApp().getResources().getDisplayMetrics().xdpi) / 72.0f) + 0.5d);
    }

    public static int px2Pt(float f) {
        return (int) (((f * 72.0f) / com.blankj.utilcode.util.Utils.getApp().getResources().getDisplayMetrics().xdpi) + 0.5d);
    }

    private static void applyDisplayMetrics(android.content.res.Resources resources, float f) {
        java.util.Objects.requireNonNull(resources, "Argument 'resources' of type Resources (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        resources.getDisplayMetrics().xdpi = f;
        com.blankj.utilcode.util.Utils.getApp().getResources().getDisplayMetrics().xdpi = f;
        applyOtherDisplayMetrics(resources, f);
    }

    static java.lang.Runnable getPreLoadRunnable() {
        return new java.lang.Runnable() { // from class: com.blankj.utilcode.util.AdaptScreenUtils.1
            @Override // java.lang.Runnable
            public void run() {
                com.blankj.utilcode.util.AdaptScreenUtils.preLoad();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void preLoad() {
        applyDisplayMetrics(android.content.res.Resources.getSystem(), android.content.res.Resources.getSystem().getDisplayMetrics().xdpi);
    }

    private static void applyOtherDisplayMetrics(android.content.res.Resources resources, float f) {
        if (sMetricsFields == null) {
            sMetricsFields = new java.util.ArrayList();
            java.lang.Class<?> cls = resources.getClass();
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            while (declaredFields != null && declaredFields.length > 0) {
                for (java.lang.reflect.Field field : declaredFields) {
                    if (field.getType().isAssignableFrom(android.util.DisplayMetrics.class)) {
                        field.setAccessible(true);
                        android.util.DisplayMetrics metricsFromField = getMetricsFromField(resources, field);
                        if (metricsFromField != null) {
                            sMetricsFields.add(field);
                            metricsFromField.xdpi = f;
                        }
                    }
                }
                cls = cls.getSuperclass();
                if (cls == null) {
                    return;
                } else {
                    declaredFields = cls.getDeclaredFields();
                }
            }
            return;
        }
        applyMetricsFields(resources, f);
    }

    private static void applyMetricsFields(android.content.res.Resources resources, float f) {
        java.util.Iterator<java.lang.reflect.Field> it = sMetricsFields.iterator();
        while (it.hasNext()) {
            try {
                android.util.DisplayMetrics displayMetrics = (android.util.DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f;
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static android.util.DisplayMetrics getMetricsFromField(android.content.res.Resources resources, java.lang.reflect.Field field) {
        try {
            return (android.util.DisplayMetrics) field.get(resources);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
