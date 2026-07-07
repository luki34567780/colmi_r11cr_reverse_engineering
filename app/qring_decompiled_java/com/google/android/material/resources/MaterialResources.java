package com.google.android.material.resources;

/* loaded from: /tmp/dex/classes2.dex */
public class MaterialResources {
    private MaterialResources() {
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int color;
        int resourceId;
        android.content.res.ColorStateList colorStateList;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        if (android.os.Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i, -1)) != -1) {
            return android.content.res.ColorStateList.valueOf(color);
        }
        return typedArray.getColorStateList(i);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, androidx.appcompat.widget.TintTypedArray tintTypedArray, int i) {
        int color;
        int resourceId;
        android.content.res.ColorStateList colorStateList;
        if (tintTypedArray.hasValue(i) && (resourceId = tintTypedArray.getResourceId(i, 0)) != 0 && (colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        if (android.os.Build.VERSION.SDK_INT <= 15 && (color = tintTypedArray.getColor(i, -1)) != -1) {
            return android.content.res.ColorStateList.valueOf(color);
        }
        return tintTypedArray.getColorStateList(i);
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        android.graphics.drawable.Drawable drawable;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawable;
    }

    public static com.google.android.material.resources.TextAppearance getTextAppearance(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new com.google.android.material.resources.TextAppearance(context, resourceId);
    }

    public static int getDimensionPixelSize(android.content.Context context, android.content.res.TypedArray typedArray, int i, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    static int getIndexWithValue(android.content.res.TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
