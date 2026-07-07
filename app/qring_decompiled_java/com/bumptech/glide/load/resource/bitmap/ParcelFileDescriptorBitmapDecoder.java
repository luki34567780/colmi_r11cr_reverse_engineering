package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class ParcelFileDescriptorBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<android.os.ParcelFileDescriptor, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.resource.bitmap.Downsampler downsampler;

    public ParcelFileDescriptorBitmapDecoder(com.bumptech.glide.load.resource.bitmap.Downsampler downsampler) {
        this.downsampler = downsampler;
    }

    public boolean handles(android.os.ParcelFileDescriptor parcelFileDescriptor, com.bumptech.glide.load.Options options) {
        return this.downsampler.handles(parcelFileDescriptor);
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.os.ParcelFileDescriptor parcelFileDescriptor, int i, int i2, com.bumptech.glide.load.Options options) throws java.io.IOException {
        return this.downsampler.decode(parcelFileDescriptor, i, i2, options);
    }
}
