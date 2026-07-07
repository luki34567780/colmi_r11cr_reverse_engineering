package androidx.core.widget;

/* loaded from: classes.dex */
public class ImageViewCompat {
    /* JADX WARN: Multi-variable type inference failed */
    public static android.content.res.ColorStateList getImageTintList(android.widget.ImageView imageView) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof androidx.core.widget.TintableImageSourceView) {
            return ((androidx.core.widget.TintableImageSourceView) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setImageTintList(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (android.os.Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        if (imageView instanceof androidx.core.widget.TintableImageSourceView) {
            ((androidx.core.widget.TintableImageSourceView) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView imageView) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof androidx.core.widget.TintableImageSourceView) {
            return ((androidx.core.widget.TintableImageSourceView) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setImageTintMode(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (android.os.Build.VERSION.SDK_INT != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
            return;
        }
        if (imageView instanceof androidx.core.widget.TintableImageSourceView) {
            ((androidx.core.widget.TintableImageSourceView) imageView).setSupportImageTintMode(mode);
        }
    }

    private ImageViewCompat() {
    }
}
