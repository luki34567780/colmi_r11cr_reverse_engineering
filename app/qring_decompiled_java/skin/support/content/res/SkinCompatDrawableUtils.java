package skin.support.content.res;

/* loaded from: classes3.dex */
class SkinCompatDrawableUtils {
    private static final java.lang.String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";

    SkinCompatDrawableUtils() {
    }

    static void fixDrawable(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT == 21 && VECTOR_DRAWABLE_CLAZZ_NAME.equals(drawable.getClass().getName())) {
            fixVectorDrawableTinting(drawable);
        }
    }

    public static boolean canSafelyMutateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
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
            for (android.graphics.drawable.Drawable drawable3 : ((android.graphics.drawable.DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!canSafelyMutateDrawable(drawable3)) {
                    return false;
                }
            }
            return true;
        }
        if (skin.support.utils.SkinCompatVersionUtils.isV4DrawableWrapper(drawable)) {
            return canSafelyMutateDrawable(skin.support.utils.SkinCompatVersionUtils.getV4DrawableWrapperWrappedDrawable(drawable));
        }
        if (skin.support.utils.SkinCompatVersionUtils.isV4WrappedDrawable(drawable)) {
            return canSafelyMutateDrawable(skin.support.utils.SkinCompatVersionUtils.getV4WrappedDrawableWrappedDrawable(drawable));
        }
        if (skin.support.utils.SkinCompatVersionUtils.isV7DrawableWrapper(drawable)) {
            return canSafelyMutateDrawable(skin.support.utils.SkinCompatVersionUtils.getV7DrawableWrapperWrappedDrawable(drawable));
        }
        if (!(drawable instanceof android.graphics.drawable.ScaleDrawable) || (drawable2 = ((android.graphics.drawable.ScaleDrawable) drawable).getDrawable()) == null) {
            return true;
        }
        return canSafelyMutateDrawable(drawable2);
    }

    private static void fixVectorDrawableTinting(android.graphics.drawable.Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(skin.support.content.res.SkinCompatThemeUtils.CHECKED_STATE_SET);
        } else {
            drawable.setState(skin.support.content.res.SkinCompatThemeUtils.EMPTY_STATE_SET);
        }
        drawable.setState(state);
    }
}
