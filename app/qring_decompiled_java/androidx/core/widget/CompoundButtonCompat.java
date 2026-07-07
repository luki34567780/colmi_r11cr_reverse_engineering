package androidx.core.widget;

/* loaded from: classes.dex */
public final class CompoundButtonCompat {
    private static final java.lang.String TAG = "CompoundButtonCompat";
    private static java.lang.reflect.Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    private CompoundButtonCompat() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setButtonTintList(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof androidx.core.widget.TintableCompoundButton) {
            ((androidx.core.widget.TintableCompoundButton) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton compoundButton) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof androidx.core.widget.TintableCompoundButton) {
            return ((androidx.core.widget.TintableCompoundButton) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setButtonTintMode(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof androidx.core.widget.TintableCompoundButton) {
            ((androidx.core.widget.TintableCompoundButton) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton compoundButton) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintMode();
        }
        if (compoundButton instanceof androidx.core.widget.TintableCompoundButton) {
            return ((androidx.core.widget.TintableCompoundButton) compoundButton).getSupportButtonTintMode();
        }
        return null;
    }

    public static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton compoundButton) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!sButtonDrawableFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = android.widget.CompoundButton.class.getDeclaredField("mButtonDrawable");
                sButtonDrawableField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e) {
                android.util.Log.i(TAG, "Failed to retrieve mButtonDrawable field", e);
            }
            sButtonDrawableFieldFetched = true;
        }
        java.lang.reflect.Field field = sButtonDrawableField;
        if (field != null) {
            try {
                return (android.graphics.drawable.Drawable) field.get(compoundButton);
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.i(TAG, "Failed to get button drawable via reflection", e2);
                sButtonDrawableField = null;
            }
        }
        return null;
    }
}
