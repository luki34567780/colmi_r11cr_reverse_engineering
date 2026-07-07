package com.bumptech.glide.load.engine.prefill;

/* loaded from: /tmp/dex/classes2.dex */
final class BitmapPreFillRunner implements java.lang.Runnable {
    static final int BACKOFF_RATIO = 4;
    static final long INITIAL_BACKOFF_MS = 40;
    static final long MAX_DURATION_MS = 32;
    static final java.lang.String TAG = "PreFillRunner";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock clock;
    private long currentDelay;
    private final android.os.Handler handler;
    private boolean isCancelled;
    private final com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private final java.util.Set<com.bumptech.glide.load.engine.prefill.PreFillType> seenTypes;
    private final com.bumptech.glide.load.engine.prefill.PreFillQueue toPrefill;
    private static final com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock DEFAULT_CLOCK = new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock();
    static final long MAX_BACKOFF_MS = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);

    public BitmapPreFillRunner(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.engine.cache.MemoryCache memoryCache, com.bumptech.glide.load.engine.prefill.PreFillQueue preFillQueue) {
        this(bitmapPool, memoryCache, preFillQueue, DEFAULT_CLOCK, new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    BitmapPreFillRunner(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, com.bumptech.glide.load.engine.cache.MemoryCache memoryCache, com.bumptech.glide.load.engine.prefill.PreFillQueue preFillQueue, com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock clock, android.os.Handler handler) {
        this.seenTypes = new java.util.HashSet();
        this.currentDelay = INITIAL_BACKOFF_MS;
        this.bitmapPool = bitmapPool;
        this.memoryCache = memoryCache;
        this.toPrefill = preFillQueue;
        this.clock = clock;
        this.handler = handler;
    }

    public void cancel() {
        this.isCancelled = true;
    }

    boolean allocate() {
        android.graphics.Bitmap createBitmap;
        long now = this.clock.now();
        while (!this.toPrefill.isEmpty() && !isGcDetected(now)) {
            com.bumptech.glide.load.engine.prefill.PreFillType remove = this.toPrefill.remove();
            if (!this.seenTypes.contains(remove)) {
                this.seenTypes.add(remove);
                createBitmap = this.bitmapPool.getDirty(remove.getWidth(), remove.getHeight(), remove.getConfig());
            } else {
                createBitmap = android.graphics.Bitmap.createBitmap(remove.getWidth(), remove.getHeight(), remove.getConfig());
            }
            int bitmapByteSize = com.bumptech.glide.util.Util.getBitmapByteSize(createBitmap);
            if (getFreeMemoryCacheBytes() >= bitmapByteSize) {
                this.memoryCache.put(new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.UniqueKey(), com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(createBitmap, this.bitmapPool));
            } else {
                this.bitmapPool.put(createBitmap);
            }
            if (android.util.Log.isLoggable(TAG, 3)) {
                android.util.Log.d(TAG, "allocated [" + remove.getWidth() + "x" + remove.getHeight() + "] " + remove.getConfig() + " size: " + bitmapByteSize);
            }
        }
        return (this.isCancelled || this.toPrefill.isEmpty()) ? false : true;
    }

    private boolean isGcDetected(long j) {
        return this.clock.now() - j >= MAX_DURATION_MS;
    }

    private long getFreeMemoryCacheBytes() {
        return this.memoryCache.getMaxSize() - this.memoryCache.getCurrentSize();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (allocate()) {
            this.handler.postDelayed(this, getNextDelay());
        }
    }

    private long getNextDelay() {
        long j = this.currentDelay;
        this.currentDelay = java.lang.Math.min(4 * j, MAX_BACKOFF_MS);
        return j;
    }

    private static final class UniqueKey implements com.bumptech.glide.load.Key {
        UniqueKey() {
        }

        public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static class Clock {
        Clock() {
        }

        long now() {
            return android.os.SystemClock.currentThreadTimeMillis();
        }
    }
}
