package com.bumptech.glide.load.resource.gif;

/* loaded from: /tmp/dex/classes2.dex */
public class GifDrawableEncoder implements com.bumptech.glide.load.ResourceEncoder<com.bumptech.glide.load.resource.gif.GifDrawable> {
    private static final java.lang.String TAG = "GifEncoder";

    public com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(com.bumptech.glide.load.Options options) {
        return com.bumptech.glide.load.EncodeStrategy.SOURCE;
    }

    public boolean encode(com.bumptech.glide.load.engine.Resource<com.bumptech.glide.load.resource.gif.GifDrawable> resource, java.io.File file, com.bumptech.glide.load.Options options) {
        try {
            com.bumptech.glide.util.ByteBufferUtil.toFile(((com.bumptech.glide.load.resource.gif.GifDrawable) resource.get()).getBuffer(), file);
            return true;
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable(TAG, 5)) {
                android.util.Log.w(TAG, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
