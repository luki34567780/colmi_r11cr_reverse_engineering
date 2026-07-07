package com.qcwireless.qcwatch.ui.base.view.pop;

/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/view/pop/Utils;", "", "()V", "checkDeviceHasNavigationBar", "", "context", "Landroid/content/Context;", "dp2px", "", "dipValue", "getNavigationBarHeight", "activity", "Landroid/app/Activity;", "getScreenHeight", "getScreenSize", "", "getScreenWidth", "getStatusBarHeight", "getWindowSize", "sp2px", "spValue", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class Utils {
    public static final com.qcwireless.qcwatch.ui.base.view.pop.Utils INSTANCE = new com.qcwireless.qcwatch.ui.base.view.pop.Utils();

    private Utils() {
    }

    public final int getScreenWidth(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final int getScreenHeight(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final int[] getScreenSize(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public final int getStatusBarHeight(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.R$dimen");
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
            java.lang.Object newInstance = cls.newInstance();
            java.lang.reflect.Field field = cls.getField("status_bar_height");
            kotlin.jvm.internal.Intrinsics.checkNotNull(field);
            return context.getResources().getDimensionPixelSize(java.lang.Integer.parseInt(field.get(newInstance).toString()));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final int[] getWindowSize(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        int[] screenSize = getScreenSize(activity);
        return new int[]{screenSize[0], screenSize[1]};
    }

    private final boolean checkDeviceHasNavigationBar(android.content.Context context) {
        java.lang.Object invoke;
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            invoke = cls.getMethod("get", java.lang.String.class).invoke(cls, "qemu.hw.mainkeys");
        } catch (java.lang.Exception unused) {
        }
        if (invoke == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        java.lang.String str = (java.lang.String) invoke;
        if (kotlin.jvm.internal.Intrinsics.areEqual("1", str)) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("0", str)) {
            return true;
        }
        return z;
    }

    public final int getNavigationBarHeight(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.content.res.Resources resources = activity.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public final int dp2px(android.content.Context context, int dipValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (int) android.util.TypedValue.applyDimension(1, dipValue, context.getResources().getDisplayMetrics());
    }

    public final int sp2px(android.content.Context context, int spValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((spValue * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
