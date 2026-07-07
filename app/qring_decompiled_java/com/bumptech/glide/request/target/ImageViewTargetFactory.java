package com.bumptech.glide.request.target;

/* loaded from: /tmp/dex/classes2.dex */
public class ImageViewTargetFactory {
    public <Z> com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, Z> buildTarget(android.widget.ImageView imageView, java.lang.Class<Z> cls) {
        if (android.graphics.Bitmap.class.equals(cls)) {
            return new com.bumptech.glide.request.target.BitmapImageViewTarget(imageView);
        }
        if (android.graphics.drawable.Drawable.class.isAssignableFrom(cls)) {
            return new com.bumptech.glide.request.target.DrawableImageViewTarget(imageView);
        }
        throw new java.lang.IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
