package com.bumptech.glide.load.resource.gif;

/* loaded from: /tmp/dex/classes2.dex */
public final class GifFrameResourceDecoder implements com.bumptech.glide.load.ResourceDecoder<com.bumptech.glide.gifdecoder.GifDecoder, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public boolean handles(com.bumptech.glide.gifdecoder.GifDecoder gifDecoder, com.bumptech.glide.load.Options options) {
        return true;
    }

    public GifFrameResourceDecoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        this.bitmapPool = bitmapPool;
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(com.bumptech.glide.gifdecoder.GifDecoder gifDecoder, int i, int i2, com.bumptech.glide.load.Options options) {
        return com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(gifDecoder.getNextFrame(), this.bitmapPool);
    }
}
