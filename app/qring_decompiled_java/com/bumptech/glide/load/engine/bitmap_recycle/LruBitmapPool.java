package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
public class LruBitmapPool implements com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool {
    private static final android.graphics.Bitmap.Config DEFAULT_CONFIG = android.graphics.Bitmap.Config.ARGB_8888;
    private static final java.lang.String TAG = "LruBitmapPool";
    private final java.util.Set<android.graphics.Bitmap.Config> allowedConfigs;
    private long currentSize;
    private int evictions;
    private int hits;
    private final long initialMaxSize;
    private long maxSize;
    private int misses;
    private int puts;
    private final com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy strategy;
    private final com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker tracker;

    private interface BitmapTracker {
        void add(android.graphics.Bitmap bitmap);

        void remove(android.graphics.Bitmap bitmap);
    }

    LruBitmapPool(long j, com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy lruPoolStrategy, java.util.Set<android.graphics.Bitmap.Config> set) {
        this.initialMaxSize = j;
        this.maxSize = j;
        this.strategy = lruPoolStrategy;
        this.allowedConfigs = set;
        this.tracker = new com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.NullBitmapTracker();
    }

    public LruBitmapPool(long j) {
        this(j, getDefaultStrategy(), getDefaultAllowedConfigs());
    }

    public LruBitmapPool(long j, java.util.Set<android.graphics.Bitmap.Config> set) {
        this(j, getDefaultStrategy(), set);
    }

    public long hitCount() {
        return this.hits;
    }

    public long missCount() {
        return this.misses;
    }

    public long evictionCount() {
        return this.evictions;
    }

    public long getCurrentSize() {
        return this.currentSize;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return this.maxSize;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void setSizeMultiplier(float f) {
        this.maxSize = java.lang.Math.round(this.initialMaxSize * f);
        evict();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(android.graphics.Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new java.lang.NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new java.lang.IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.strategy.getSize(bitmap) <= this.maxSize && this.allowedConfigs.contains(bitmap.getConfig())) {
                int size = this.strategy.getSize(bitmap);
                this.strategy.put(bitmap);
                this.tracker.add(bitmap);
                this.puts++;
                this.currentSize += size;
                if (android.util.Log.isLoggable(TAG, 2)) {
                    android.util.Log.v(TAG, "Put bitmap in pool=" + this.strategy.logBitmap(bitmap));
                }
                dump();
                evict();
                return;
            }
            if (android.util.Log.isLoggable(TAG, 2)) {
                android.util.Log.v(TAG, "Reject bitmap from pool, bitmap: " + this.strategy.logBitmap(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.allowedConfigs.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private void evict() {
        trimToSize(this.maxSize);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public android.graphics.Bitmap get(int i, int i2, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        if (dirtyOrNull != null) {
            dirtyOrNull.eraseColor(0);
            return dirtyOrNull;
        }
        return createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public android.graphics.Bitmap getDirty(int i, int i2, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap dirtyOrNull = getDirtyOrNull(i, i2, config);
        return dirtyOrNull == null ? createBitmap(i, i2, config) : dirtyOrNull;
    }

    private static android.graphics.Bitmap createBitmap(int i, int i2, android.graphics.Bitmap.Config config) {
        if (config == null) {
            config = DEFAULT_CONFIG;
        }
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    private static void assertNotHardwareConfig(android.graphics.Bitmap.Config config) {
        if (android.os.Build.VERSION.SDK_INT >= 26 && config == android.graphics.Bitmap.Config.HARDWARE) {
            throw new java.lang.IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private synchronized android.graphics.Bitmap getDirtyOrNull(int i, int i2, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap bitmap;
        assertNotHardwareConfig(config);
        bitmap = this.strategy.get(i, i2, config != null ? config : DEFAULT_CONFIG);
        if (bitmap == null) {
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Missing bitmap=" + this.strategy.logBitmap(i, i2, config));
            }
            this.misses++;
        } else {
            this.hits++;
            this.currentSize -= this.strategy.getSize(bitmap);
            this.tracker.remove(bitmap);
            normalize(bitmap);
        }
        if (android.util.Log.isLoggable(TAG, 2)) {
            android.util.Log.v(TAG, "Get bitmap=" + this.strategy.logBitmap(i, i2, config));
        }
        dump();
        return bitmap;
    }

    private static void normalize(android.graphics.Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        maybeSetPreMultiplied(bitmap);
    }

    private static void maybeSetPreMultiplied(android.graphics.Bitmap bitmap) {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, "clearMemory");
        }
        trimToSize(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void trimMemory(int i) {
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, "trimMemory, level=" + i);
        }
        if (i >= 40 || (android.os.Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            trimToSize(getMaxSize() / 2);
        }
    }

    private synchronized void trimToSize(long j) {
        while (this.currentSize > j) {
            android.graphics.Bitmap removeLast = this.strategy.removeLast();
            if (removeLast == null) {
                if (android.util.Log.isLoggable(TAG, 5)) {
                    android.util.Log.w(TAG, "Size mismatch, resetting");
                    dumpUnchecked();
                }
                this.currentSize = 0L;
                return;
            }
            this.tracker.remove(removeLast);
            this.currentSize -= this.strategy.getSize(removeLast);
            this.evictions++;
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "Evicting bitmap=" + this.strategy.logBitmap(removeLast));
            }
            dump();
            removeLast.recycle();
        }
    }

    private void dump() {
        if (android.util.Log.isLoggable(TAG, 2)) {
            dumpUnchecked();
        }
    }

    private void dumpUnchecked() {
        android.util.Log.v(TAG, "Hits=" + this.hits + ", misses=" + this.misses + ", puts=" + this.puts + ", evictions=" + this.evictions + ", currentSize=" + this.currentSize + ", maxSize=" + this.maxSize + "\nStrategy=" + this.strategy);
    }

    private static com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy getDefaultStrategy() {
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            return new com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy();
        }
        return new com.bumptech.glide.load.engine.bitmap_recycle.AttributeStrategy();
    }

    private static java.util.Set<android.graphics.Bitmap.Config> getDefaultAllowedConfigs() {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(android.graphics.Bitmap.Config.values()));
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(android.graphics.Bitmap.Config.HARDWARE);
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    private static class ThrowingBitmapTracker implements com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker {
        private final java.util.Set<android.graphics.Bitmap> bitmaps = java.util.Collections.synchronizedSet(new java.util.HashSet());

        private ThrowingBitmapTracker() {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(android.graphics.Bitmap bitmap) {
            if (this.bitmaps.contains(bitmap)) {
                throw new java.lang.IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
            }
            this.bitmaps.add(bitmap);
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(android.graphics.Bitmap bitmap) {
            if (!this.bitmaps.contains(bitmap)) {
                throw new java.lang.IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.bitmaps.remove(bitmap);
        }
    }

    private static final class NullBitmapTracker implements com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(android.graphics.Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(android.graphics.Bitmap bitmap) {
        }

        NullBitmapTracker() {
        }
    }
}
