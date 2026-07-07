package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public class DrawableThumbnailImageViewTarget extends com.bumptech.glide.request.target.ThumbnailImageViewTarget<android.graphics.drawable.Drawable> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public android.graphics.drawable.Drawable getDrawable(android.graphics.drawable.Drawable drawable) {
        return drawable;
    }

    public DrawableThumbnailImageViewTarget(android.widget.ImageView imageView) {
        super(imageView);
    }

    @java.lang.Deprecated
    public DrawableThumbnailImageViewTarget(android.widget.ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
