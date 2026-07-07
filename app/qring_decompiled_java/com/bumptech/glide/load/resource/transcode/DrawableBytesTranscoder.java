package com.bumptech.glide.load.resource.transcode;

/* loaded from: /tmp/dex/classes2.dex */
public final class DrawableBytesTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.drawable.Drawable, byte[]> {
    private final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, byte[]> bitmapBytesTranscoder;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.resource.transcode.ResourceTranscoder<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> gifDrawableBytesTranscoder;

    /* JADX WARN: Multi-variable type inference failed */
    private static com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> toGifDrawableResource(com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> resource) {
        return resource;
    }

    public DrawableBytesTranscoder(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, byte[]> resourceTranscoder, com.bumptech.glide.load.resource.transcode.ResourceTranscoder<com.bumptech.glide.load.resource.gif.GifDrawable, byte[]> resourceTranscoder2) {
        this.bitmapPool = bitmapPool;
        this.bitmapBytesTranscoder = resourceTranscoder;
        this.gifDrawableBytesTranscoder = resourceTranscoder2;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public com.bumptech.glide.load.engine.Resource<byte[]> transcode(com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> resource, com.bumptech.glide.load.Options options) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) resource.get();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return this.bitmapBytesTranscoder.transcode(com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap(), this.bitmapPool), options);
        }
        if (drawable instanceof com.bumptech.glide.load.resource.gif.GifDrawable) {
            return this.gifDrawableBytesTranscoder.transcode(toGifDrawableResource(resource), options);
        }
        return null;
    }
}
