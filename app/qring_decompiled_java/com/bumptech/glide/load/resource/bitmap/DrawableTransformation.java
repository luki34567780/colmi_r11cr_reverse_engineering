package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class DrawableTransformation implements com.bumptech.glide.load.Transformation<android.graphics.drawable.Drawable> {
    private final boolean isRequired;
    private final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> wrapped;

    public com.bumptech.glide.load.Transformation<android.graphics.drawable.BitmapDrawable> asBitmapDrawable() {
        return this;
    }

    public DrawableTransformation(com.bumptech.glide.load.Transformation<android.graphics.Bitmap> transformation, boolean z) {
        this.wrapped = transformation;
        this.isRequired = z;
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> transform(android.content.Context context, com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> resource, int i, int i2) {
        com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool = com.bumptech.glide.Glide.get(context).getBitmapPool();
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) resource.get();
        com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> convert = com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter.convert(bitmapPool, drawable, i, i2);
        if (convert == null) {
            if (!this.isRequired) {
                return resource;
            }
            throw new java.lang.IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> transform = this.wrapped.transform(context, convert, i, i2);
        if (transform.equals(convert)) {
            transform.recycle();
            return resource;
        }
        return newDrawableResource(context, transform);
    }

    private com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> newDrawableResource(android.content.Context context, com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> resource) {
        return com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource.obtain(context.getResources(), resource);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.bumptech.glide.load.resource.bitmap.DrawableTransformation) {
            return this.wrapped.equals(((com.bumptech.glide.load.resource.bitmap.DrawableTransformation) obj).wrapped);
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
