package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    private static final int[] EMPTY_STATE_SET = new int[0];
    public static final android.graphics.Rect INSETS_NONE = new android.graphics.Rect();

    private DrawableUtils() {
    }

    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.Insets opticalInsets = androidx.appcompat.widget.DrawableUtils.Api29Impl.getOpticalInsets(drawable);
            return new android.graphics.Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        }
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            return androidx.appcompat.widget.DrawableUtils.Api18Impl.getOpticalInsets(androidx.core.graphics.drawable.DrawableCompat.unwrap(drawable));
        }
        return INSETS_NONE;
    }

    static void fixDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.String name = drawable.getClass().getName();
        if (android.os.Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            forceDrawableStateChange(drawable);
        } else {
            if (android.os.Build.VERSION.SDK_INT < 29 || android.os.Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                return;
            }
            forceDrawableStateChange(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean canSafelyMutateDrawable(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof android.graphics.drawable.InsetDrawable)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 15 && (drawable instanceof android.graphics.drawable.GradientDrawable)) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 17 && (drawable instanceof android.graphics.drawable.LayerDrawable)) {
            return false;
        }
        if (drawable instanceof android.graphics.drawable.DrawableContainer) {
            android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof android.graphics.drawable.DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (android.graphics.drawable.Drawable drawable2 : ((android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!canSafelyMutateDrawable(drawable2)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof androidx.core.graphics.drawable.WrappedDrawable) {
            return canSafelyMutateDrawable(((androidx.core.graphics.drawable.WrappedDrawable) drawable).getWrappedDrawable());
        }
        if (drawable instanceof androidx.appcompat.graphics.drawable.DrawableWrapper) {
            return canSafelyMutateDrawable(((androidx.appcompat.graphics.drawable.DrawableWrapper) drawable).getWrappedDrawable());
        }
        if (drawable instanceof android.graphics.drawable.ScaleDrawable) {
            return canSafelyMutateDrawable(((android.graphics.drawable.ScaleDrawable) drawable).getDrawable());
        }
        return true;
    }

    private static void forceDrawableStateChange(android.graphics.drawable.Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(CHECKED_STATE_SET);
        } else {
            drawable.setState(EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    static class Api18Impl {
        private static final java.lang.reflect.Field sBottom;
        private static final java.lang.reflect.Method sGetOpticalInsets;
        private static final java.lang.reflect.Field sLeft;
        private static final boolean sReflectionSuccessful;
        private static final java.lang.reflect.Field sRight;
        private static final java.lang.reflect.Field sTop;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = 1
                goto L49
            L2d:
                r7 = r2
                goto L47
            L2f:
                r6 = r2
                goto L46
            L31:
                r6 = r2
                goto L46
            L33:
                r6 = r2
                goto L46
            L35:
                r5 = r2
                goto L3d
            L37:
                r5 = r2
                goto L41
            L39:
                r5 = r2
                goto L45
            L3b:
                r4 = r2
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r2
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r2
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r2
                r8 = 0
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r4
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r5
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r6
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r0
                goto L64
            L58:
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r1
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.Api18Impl.<clinit>():void");
        }

        private Api18Impl() {
        }

        static android.graphics.Rect getOpticalInsets(android.graphics.drawable.Drawable drawable) {
            if (android.os.Build.VERSION.SDK_INT < 29 && sReflectionSuccessful) {
                try {
                    java.lang.Object invoke = sGetOpticalInsets.invoke(drawable, new java.lang.Object[0]);
                    if (invoke != null) {
                        return new android.graphics.Rect(sLeft.getInt(invoke), sTop.getInt(invoke), sRight.getInt(invoke), sBottom.getInt(invoke));
                    }
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                }
            }
            return androidx.appcompat.widget.DrawableUtils.INSETS_NONE;
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.graphics.Insets getOpticalInsets(android.graphics.drawable.Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }
}
