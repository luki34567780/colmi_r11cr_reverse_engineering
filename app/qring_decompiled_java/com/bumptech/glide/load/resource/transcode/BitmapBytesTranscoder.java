package com.bumptech.glide.load.resource.transcode;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapBytesTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, byte[]> {
    private final android.graphics.Bitmap.CompressFormat compressFormat;
    private final int quality;

    public BitmapBytesTranscoder() {
        this(android.graphics.Bitmap.CompressFormat.JPEG, 100);
    }

    public BitmapBytesTranscoder(android.graphics.Bitmap.CompressFormat compressFormat, int i) {
        this.compressFormat = compressFormat;
        this.quality = i;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public com.bumptech.glide.load.engine.Resource<byte[]> transcode(com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> resource, com.bumptech.glide.load.Options options) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ((android.graphics.Bitmap) resource.get()).compress(this.compressFormat, this.quality, byteArrayOutputStream);
        resource.recycle();
        return new com.bumptech.glide.load.resource.bytes.BytesResource(byteArrayOutputStream.toByteArray());
    }
}
