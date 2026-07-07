package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapImageViewTarget extends com.bumptech.glide.request.target.ImageViewTarget<android.graphics.Bitmap> {
    public BitmapImageViewTarget(android.widget.ImageView imageView) {
        super(imageView);
    }

    @java.lang.Deprecated
    public BitmapImageViewTarget(android.widget.ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public void setResource(android.graphics.Bitmap bitmap) {
        ((android.widget.ImageView) this.view).setImageBitmap(bitmap);
    }
}
