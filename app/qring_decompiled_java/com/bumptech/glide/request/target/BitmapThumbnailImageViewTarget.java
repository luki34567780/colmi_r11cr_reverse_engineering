package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapThumbnailImageViewTarget extends com.bumptech.glide.request.target.ThumbnailImageViewTarget<android.graphics.Bitmap> {
    public BitmapThumbnailImageViewTarget(android.widget.ImageView imageView) {
        super(imageView);
    }

    @java.lang.Deprecated
    public BitmapThumbnailImageViewTarget(android.widget.ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public android.graphics.drawable.Drawable getDrawable(android.graphics.Bitmap bitmap) {
        return new android.graphics.drawable.BitmapDrawable(((android.widget.ImageView) this.view).getResources(), bitmap);
    }
}
