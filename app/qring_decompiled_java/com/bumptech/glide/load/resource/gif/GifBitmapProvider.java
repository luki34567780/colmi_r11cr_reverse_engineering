package com.bumptech.glide.load.resource.gif;

/* loaded from: /tmp/dex/classes2.dex */
public final class GifBitmapProvider implements com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider {
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public GifBitmapProvider(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        this(bitmapPool, null);
    }

    public GifBitmapProvider(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) {
        this.bitmapPool = bitmapPool;
        this.arrayPool = arrayPool;
    }

    public android.graphics.Bitmap obtain(int i, int i2, android.graphics.Bitmap.Config config) {
        return this.bitmapPool.getDirty(i, i2, config);
    }

    public void release(android.graphics.Bitmap bitmap) {
        this.bitmapPool.put(bitmap);
    }

    public byte[] obtainByteArray(int i) {
        com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool = this.arrayPool;
        if (arrayPool == null) {
            return new byte[i];
        }
        return (byte[]) arrayPool.get(i, byte[].class);
    }

    public void release(byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool = this.arrayPool;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(bArr);
    }

    public int[] obtainIntArray(int i) {
        com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool = this.arrayPool;
        if (arrayPool == null) {
            return new int[i];
        }
        return (int[]) arrayPool.get(i, int[].class);
    }

    public void release(int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool = this.arrayPool;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(iArr);
    }
}
