package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapDrawableEncoder implements com.bumptech.glide.load.ResourceEncoder<android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.ResourceEncoder<android.graphics.Bitmap> encoder;

    public BitmapDrawableEncoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.ResourceEncoder<android.graphics.Bitmap> resourceEncoder) {
        this.bitmapPool = bitmapPool;
        this.encoder = resourceEncoder;
    }

    public boolean encode(com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> resource, java.io.File file, com.bumptech.glide.load.Options options) {
        return this.encoder.encode(new com.bumptech.glide.load.resource.bitmap.BitmapResource(((android.graphics.drawable.BitmapDrawable) resource.get()).getBitmap(), this.bitmapPool), file, options);
    }

    public com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(com.bumptech.glide.load.Options options) {
        return this.encoder.getEncodeStrategy(options);
    }
}
