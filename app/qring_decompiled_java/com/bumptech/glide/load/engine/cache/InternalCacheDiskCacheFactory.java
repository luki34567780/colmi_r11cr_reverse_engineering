package com.bumptech.glide.load.engine.cache;

/* loaded from: classes.dex */
public final class InternalCacheDiskCacheFactory extends com.bumptech.glide.load.engine.cache.DiskLruCacheFactory {
    public InternalCacheDiskCacheFactory(android.content.Context context) {
        this(context, com.bumptech.glide.load.engine.cache.DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public InternalCacheDiskCacheFactory(android.content.Context context, long j) {
        this(context, com.bumptech.glide.load.engine.cache.DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j);
    }

    public InternalCacheDiskCacheFactory(final android.content.Context context, final java.lang.String str, long j) {
        super(new com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory.1
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public java.io.File getCacheDirectory() {
                java.io.File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new java.io.File(cacheDir, str) : cacheDir;
            }
        }, j);
    }
}
