package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class LazyBitmapDrawableResource implements com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable>, com.bumptech.glide.load.engine.Initializable {
    private final com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> bitmapResource;
    private final android.content.res.Resources resources;

    @java.lang.Deprecated
    public static com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource obtain(android.content.Context context, android.graphics.Bitmap bitmap) {
        return (com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource) obtain(context.getResources(), com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(bitmap, com.bumptech.glide.Glide.get(context).getBitmapPool()));
    }

    @java.lang.Deprecated
    public static com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource obtain(android.content.res.Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap) {
        return (com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource) obtain(resources, com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(bitmap, bitmapPool));
    }

    public static com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> obtain(android.content.res.Resources resources, com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource(resources, resource);
    }

    private LazyBitmapDrawableResource(android.content.res.Resources resources, com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> resource) {
        this.resources = (android.content.res.Resources) com.bumptech.glide.util.Preconditions.checkNotNull(resources);
        this.bitmapResource = (com.bumptech.glide.load.engine.Resource) com.bumptech.glide.util.Preconditions.checkNotNull(resource);
    }

    public java.lang.Class<android.graphics.drawable.BitmapDrawable> getResourceClass() {
        return android.graphics.drawable.BitmapDrawable.class;
    }

    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public android.graphics.drawable.BitmapDrawable m1get() {
        return new android.graphics.drawable.BitmapDrawable(this.resources, (android.graphics.Bitmap) this.bitmapResource.get());
    }

    public int getSize() {
        return this.bitmapResource.getSize();
    }

    public void recycle() {
        this.bitmapResource.recycle();
    }

    public void initialize() {
        com.bumptech.glide.load.engine.Initializable initializable = this.bitmapResource;
        if (initializable instanceof com.bumptech.glide.load.engine.Initializable) {
            initializable.initialize();
        }
    }
}
