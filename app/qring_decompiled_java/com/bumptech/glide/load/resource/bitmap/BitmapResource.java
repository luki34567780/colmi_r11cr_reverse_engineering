package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapResource implements com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap>, com.bumptech.glide.load.engine.Initializable {
    private final android.graphics.Bitmap bitmap;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public static com.bumptech.glide.load.resource.bitmap.BitmapResource obtain(android.graphics.Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new com.bumptech.glide.load.resource.bitmap.BitmapResource(bitmap, bitmapPool);
    }

    public BitmapResource(android.graphics.Bitmap bitmap, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        this.bitmap = (android.graphics.Bitmap) com.bumptech.glide.util.Preconditions.checkNotNull(bitmap, "Bitmap must not be null");
        this.bitmapPool = (com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool) com.bumptech.glide.util.Preconditions.checkNotNull(bitmapPool, "BitmapPool must not be null");
    }

    public java.lang.Class<android.graphics.Bitmap> getResourceClass() {
        return android.graphics.Bitmap.class;
    }

    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public android.graphics.Bitmap m0get() {
        return this.bitmap;
    }

    public int getSize() {
        return com.bumptech.glide.util.Util.getBitmapByteSize(this.bitmap);
    }

    public void recycle() {
        this.bitmapPool.put(this.bitmap);
    }

    public void initialize() {
        this.bitmap.prepareToDraw();
    }
}
