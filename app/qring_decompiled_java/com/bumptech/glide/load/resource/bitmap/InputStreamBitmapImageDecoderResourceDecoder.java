package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class InputStreamBitmapImageDecoderResourceDecoder implements com.bumptech.glide.load.ResourceDecoder<java.io.InputStream, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.resource.bitmap.BitmapImageDecoderResourceDecoder wrapped = new com.bumptech.glide.load.resource.bitmap.BitmapImageDecoderResourceDecoder();

    public boolean handles(java.io.InputStream inputStream, com.bumptech.glide.load.Options options) throws java.io.IOException {
        return true;
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(java.io.InputStream inputStream, int i, int i2, com.bumptech.glide.load.Options options) throws java.io.IOException {
        return this.wrapped.decode(android.graphics.ImageDecoder.createSource(com.bumptech.glide.util.ByteBufferUtil.fromStream(inputStream)), i, i2, options);
    }
}
