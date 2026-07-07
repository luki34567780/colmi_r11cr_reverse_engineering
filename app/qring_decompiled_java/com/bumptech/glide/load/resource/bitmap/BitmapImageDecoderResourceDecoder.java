package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class BitmapImageDecoderResourceDecoder extends com.bumptech.glide.load.resource.ImageDecoderResourceDecoder<android.graphics.Bitmap> {
    private static final java.lang.String TAG = "BitmapImageDecoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool = new com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter();

    @Override // com.bumptech.glide.load.resource.ImageDecoderResourceDecoder
    protected com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.graphics.ImageDecoder.Source source, int i, int i2, android.graphics.ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws java.io.IOException {
        android.graphics.Bitmap decodeBitmap = android.graphics.ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (android.util.Log.isLoggable(TAG, 2)) {
            android.util.Log.v(TAG, "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new com.bumptech.glide.load.resource.bitmap.BitmapResource(decodeBitmap, this.bitmapPool);
    }
}
