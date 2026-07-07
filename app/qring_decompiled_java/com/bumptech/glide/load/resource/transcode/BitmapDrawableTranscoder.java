package com.bumptech.glide.load.resource.transcode;

/* loaded from: /tmp/dex/classes2.dex */
public class BitmapDrawableTranscoder implements com.bumptech.glide.load.resource.transcode.ResourceTranscoder<android.graphics.Bitmap, android.graphics.drawable.BitmapDrawable> {
    private final android.content.res.Resources resources;

    public BitmapDrawableTranscoder(android.content.Context context) {
        this(context.getResources());
    }

    @java.lang.Deprecated
    public BitmapDrawableTranscoder(android.content.res.Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        this(resources);
    }

    public BitmapDrawableTranscoder(android.content.res.Resources resources) {
        this.resources = (android.content.res.Resources) com.bumptech.glide.util.Preconditions.checkNotNull(resources);
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.BitmapDrawable> transcode(com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> resource, com.bumptech.glide.load.Options options) {
        return com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource.obtain(this.resources, resource);
    }
}
