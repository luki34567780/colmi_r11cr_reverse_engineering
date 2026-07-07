package skin.support.content.res;

/* loaded from: classes3.dex */
public class SkinCompatThemeUtils {
    private static final java.lang.ThreadLocal<android.util.TypedValue> TL_TYPED_VALUE = new java.lang.ThreadLocal<>();
    static final int[] DISABLED_STATE_SET = {-16842910};
    static final int[] ENABLED_STATE_SET = {android.R.attr.state_enabled};
    static final int[] WINDOW_FOCUSED_STATE_SET = {android.R.attr.state_window_focused};
    static final int[] FOCUSED_STATE_SET = {android.R.attr.state_focused};
    static final int[] ACTIVATED_STATE_SET = {android.R.attr.state_activated};
    static final int[] ACCELERATED_STATE_SET = {android.R.attr.state_accelerated};
    static final int[] HOVERED_STATE_SET = {android.R.attr.state_hovered};
    static final int[] DRAG_CAN_ACCEPT_STATE_SET = {android.R.attr.state_drag_can_accept};
    static final int[] DRAG_HOVERED_STATE_SET = {android.R.attr.state_drag_hovered};
    static final int[] PRESSED_STATE_SET = {android.R.attr.state_pressed};
    static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};
    static final int[] SELECTED_STATE_SET = {android.R.attr.state_selected};
    static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET = {-16842919, -16842908};
    static final int[] EMPTY_STATE_SET = new int[0];
    private static final int[] TEMP_ARRAY = new int[1];

    public static int getTextColorPrimaryResId(android.content.Context context) {
        return getResId(context, new int[]{android.R.attr.textColorPrimary});
    }

    public static int getWindowBackgroundResId(android.content.Context context) {
        return getResId(context, new int[]{android.R.attr.windowBackground});
    }

    static int getResId(android.content.Context context, int[] iArr) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int getThemeAttrColor(android.content.Context context, int i) {
        int[] iArr = TEMP_ARRAY;
        iArr[0] = i;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                return skin.support.content.res.SkinCompatResources.getColor(context, resourceId);
            }
            return 0;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static android.content.res.ColorStateList getThemeAttrColorStateList(android.content.Context context, int i) {
        int[] iArr = TEMP_ARRAY;
        iArr[0] = i;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                return skin.support.content.res.SkinCompatResources.getColorStateList(context, resourceId);
            }
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int getDisabledThemeAttrColor(android.content.Context context, int i) {
        android.content.res.ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(DISABLED_STATE_SET, themeAttrColorStateList.getDefaultColor());
        }
        android.util.TypedValue typedValue = getTypedValue();
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        return getThemeAttrColor(context, i, typedValue.getFloat());
    }

    private static android.util.TypedValue getTypedValue() {
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = TL_TYPED_VALUE;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    static int getThemeAttrColor(android.content.Context context, int i, float f) {
        return skin.support.graphics.ColorUtils.setAlphaComponent(getThemeAttrColor(context, i), java.lang.Math.round(android.graphics.Color.alpha(r0) * f));
    }
}
