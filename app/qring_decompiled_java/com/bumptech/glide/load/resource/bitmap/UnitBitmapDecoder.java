package com.bumptech.glide.load.resource.bitmap;

/* loaded from: /tmp/dex/classes2.dex */
public final class UnitBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<android.graphics.Bitmap, android.graphics.Bitmap> {
    public boolean handles(android.graphics.Bitmap bitmap, com.bumptech.glide.load.Options options) {
        return true;
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(android.graphics.Bitmap bitmap, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder.NonOwnedBitmapResource(bitmap);
    }

    private static final class NonOwnedBitmapResource implements com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> {
        private final android.graphics.Bitmap bitmap;

        public void recycle() {
        }

        NonOwnedBitmapResource(android.graphics.Bitmap bitmap) {
            this.bitmap = bitmap;
        }

        public java.lang.Class<android.graphics.Bitmap> getResourceClass() {
            return android.graphics.Bitmap.class;
        }

        /* renamed from: get, reason: merged with bridge method [inline-methods] */
        public android.graphics.Bitmap m2get() {
            return this.bitmap;
        }

        public int getSize() {
            return com.bumptech.glide.util.Util.getBitmapByteSize(this.bitmap);
        }
    }
}
