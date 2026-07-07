package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapDrawableDecoder<DataType> implements com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.drawable.BitmapDrawable> {
    private final com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> decoder;
    private final android.content.res.Resources resources;

    public BitmapDrawableDecoder(android.content.Context context, com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> resourceDecoder) {
        this(context.getResources(), resourceDecoder);
    }

    @java.lang.Deprecated
    public BitmapDrawableDecoder(android.content.res.Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> resourceDecoder) {
        this(resources, resourceDecoder);
    }

    public BitmapDrawableDecoder(android.content.res.Resources resources, com.bumptech.glide.load.ResourceDecoder<DataType, android.graphics.Bitmap> resourceDecoder) {
        this.resources = (android.content.res.Resources) com.bumptech.glide.util.Preconditions.checkNotNull(resources);
        this.decoder = (com.bumptech.glide.load.ResourceDecoder) com.bumptech.glide.util.Preconditions.checkNotNull(resourceDecoder);
    }

    public boolean handles(DataType datatype, com.bumptech.glide.load.Options options) throws java.io.IOException {
        return this.decoder.handles(datatype, options);
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> decode(DataType datatype, int i, int i2, com.bumptech.glide.load.Options options) throws java.io.IOException {
        return com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource.obtain(this.resources, (com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap>) this.decoder.decode(datatype, i, i2, options));
    }
}
