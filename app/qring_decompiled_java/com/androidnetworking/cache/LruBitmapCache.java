package com.androidnetworking.cache;

/* loaded from: classes.dex */
public class LruBitmapCache extends com.androidnetworking.cache.LruCache<java.lang.String, android.graphics.Bitmap> implements com.androidnetworking.internal.ANImageLoader.ImageCache {
    public LruBitmapCache(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidnetworking.cache.LruCache
    public int sizeOf(java.lang.String str, android.graphics.Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    @Override // com.androidnetworking.internal.ANImageLoader.ImageCache
    public android.graphics.Bitmap getBitmap(java.lang.String str) {
        return get(str);
    }

    @Override // com.androidnetworking.internal.ANImageLoader.ImageCache
    public void evictBitmap(java.lang.String str) {
        remove(str);
    }

    @Override // com.androidnetworking.internal.ANImageLoader.ImageCache
    public void evictAllBitmap() {
        evictAll();
    }

    @Override // com.androidnetworking.internal.ANImageLoader.ImageCache
    public void putBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        put(str, bitmap);
    }
}
