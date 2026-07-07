package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public class Rotate extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private static final java.lang.String ID = "com.bumptech.glide.load.resource.bitmap.Rotate";
    private static final byte[] ID_BYTES = ID.getBytes(CHARSET);
    private final int degreesToRotate;

    public Rotate(int i) {
        this.degreesToRotate = i;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected android.graphics.Bitmap transform(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2) {
        return com.bumptech.glide.load.resource.bitmap.TransformationUtils.rotateImage(bitmap, this.degreesToRotate);
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.bumptech.glide.load.resource.bitmap.Rotate) && this.degreesToRotate == ((com.bumptech.glide.load.resource.bitmap.Rotate) obj).degreesToRotate;
    }

    public int hashCode() {
        return com.bumptech.glide.util.Util.hashCode(-950519196, com.bumptech.glide.util.Util.hashCode(this.degreesToRotate));
    }

    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
        messageDigest.update(java.nio.ByteBuffer.allocate(4).putInt(this.degreesToRotate).array());
    }
}
