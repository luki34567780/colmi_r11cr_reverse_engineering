package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ThumbnailImageViewTarget<T> extends com.bumptech.glide.request.target.ImageViewTarget<T> {
    protected abstract android.graphics.drawable.Drawable getDrawable(T t);

    public ThumbnailImageViewTarget(android.widget.ImageView imageView) {
        super(imageView);
    }

    @java.lang.Deprecated
    public ThumbnailImageViewTarget(android.widget.ImageView imageView, boolean z) {
        super(imageView, z);
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    protected void setResource(T t) {
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.ImageView) this.view).getLayoutParams();
        android.graphics.drawable.Drawable drawable = getDrawable(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawable = new com.bumptech.glide.request.target.FixedSizeDrawable(drawable, layoutParams.width, layoutParams.height);
        }
        ((android.widget.ImageView) this.view).setImageDrawable(drawable);
    }
}
