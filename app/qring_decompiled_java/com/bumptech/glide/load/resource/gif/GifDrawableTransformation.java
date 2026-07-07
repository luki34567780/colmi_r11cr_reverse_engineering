package com.bumptech.glide.load.resource.gif;

/* loaded from: /tmp/dex/classes2.dex */
public class GifDrawableTransformation implements com.bumptech.glide.load.Transformation<com.bumptech.glide.load.resource.gif.GifDrawable> {
    private final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> wrapped;

    public GifDrawableTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation) {
        this.wrapped = (com.bumptech.glide.load.Transformation) com.bumptech.glide.util.Preconditions.checkNotNull(transformation);
    }

    public com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> transform(android.content.Context context, com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> resource, int i, int i2) {
        com.bumptech.glide.load.resource.gif.GifDrawable gifDrawable = (com.bumptech.glide.load.resource.gif.GifDrawable) resource.get();
        com.bumptech.glide.load.resource.bitmap.BitmapResource bitmapResource = new com.bumptech.glide.load.resource.bitmap.BitmapResource(gifDrawable.getFirstFrame(), com.bumptech.glide.Glide.get(context).getBitmapPool());
        com.bumptech.glide.load.engine.Resource transform = this.wrapped.transform(context, bitmapResource, i, i2);
        if (!bitmapResource.equals(transform)) {
            bitmapResource.recycle();
        }
        gifDrawable.setFrameTransformation(this.wrapped, (android.graphics.Bitmap) transform.get());
        return resource;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.bumptech.glide.load.resource.gif.GifDrawableTransformation) {
            return this.wrapped.equals(((com.bumptech.glide.load.resource.gif.GifDrawableTransformation) obj).wrapped);
        }
        return false;
    }

    public int hashCode() {
        return this.wrapped.hashCode();
    }

    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
        this.wrapped.updateDiskCacheKey(messageDigest);
    }
}
