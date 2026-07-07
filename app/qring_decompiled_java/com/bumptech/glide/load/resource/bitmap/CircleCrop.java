package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class CircleCrop extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private static final java.lang.String ID = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    private static final byte[] ID_BYTES = ID.getBytes(CHARSET);
    private static final int VERSION = 1;

    public int hashCode() {
        return 1101716364;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected android.graphics.Bitmap transform(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2) {
        return com.bumptech.glide.load.resource.bitmap.TransformationUtils.circleCrop(bitmapPool, bitmap, i, i2);
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof com.bumptech.glide.load.resource.bitmap.CircleCrop;
    }

    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
