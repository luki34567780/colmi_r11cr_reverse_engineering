package androidx.transition;

/* loaded from: classes.dex */
class ImageViewUtils {
    private static java.lang.reflect.Field sDrawMatrixField = null;
    private static boolean sDrawMatrixFieldFetched = false;
    private static boolean sTryHiddenAnimateTransform = true;

    static void animateTransform(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix == null) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            hiddenAnimateTransform(imageView, matrix);
            return;
        }
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            android.graphics.Matrix matrix2 = null;
            fetchDrawMatrixField();
            java.lang.reflect.Field field = sDrawMatrixField;
            if (field != null) {
                try {
                    android.graphics.Matrix matrix3 = (android.graphics.Matrix) field.get(imageView);
                    if (matrix3 == null) {
                        try {
                            matrix2 = new android.graphics.Matrix();
                            sDrawMatrixField.set(imageView, matrix2);
                        } catch (java.lang.IllegalAccessException unused) {
                        }
                    }
                    matrix2 = matrix3;
                } catch (java.lang.IllegalAccessException unused2) {
                }
            }
            if (matrix2 != null) {
                matrix2.set(matrix);
            }
            imageView.invalidate();
        }
    }

    private static void hiddenAnimateTransform(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (sTryHiddenAnimateTransform) {
            try {
                imageView.animateTransform(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenAnimateTransform = false;
            }
        }
    }

    private static void fetchDrawMatrixField() {
        if (sDrawMatrixFieldFetched) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = android.widget.ImageView.class.getDeclaredField("mDrawMatrix");
            sDrawMatrixField = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.NoSuchFieldException unused) {
        }
        sDrawMatrixFieldFetched = true;
    }

    private ImageViewUtils() {
    }
}
