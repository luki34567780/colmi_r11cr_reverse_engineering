package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class ResourceBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<android.net.Uri, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder drawableDecoder;

    public ResourceBitmapDecoder(com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder resourceDrawableDecoder, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        this.drawableDecoder = resourceDrawableDecoder;
        this.bitmapPool = bitmapPool;
    }

    public boolean handles(android.net.Uri uri, com.bumptech.glide.load.Options options) {
        return "android.resource".equals(uri.getScheme());
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.net.Uri uri, int i, int i2, com.bumptech.glide.load.Options options) {
        com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode = this.drawableDecoder.decode(uri, i, i2, options);
        if (decode == null) {
            return null;
        }
        return com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter.convert(this.bitmapPool, (android.graphics.drawable.Drawable) decode.get(), i, i2);
    }
}
