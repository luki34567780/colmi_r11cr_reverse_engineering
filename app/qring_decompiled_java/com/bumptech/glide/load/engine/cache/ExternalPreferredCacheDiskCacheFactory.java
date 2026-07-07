package com.bumptech.glide.load.engine.cache;

/* loaded from: classes.dex */
public final class ExternalPreferredCacheDiskCacheFactory extends com.bumptech.glide.load.engine.cache.DiskLruCacheFactory {
    public ExternalPreferredCacheDiskCacheFactory(android.content.Context context) {
        this(context, com.bumptech.glide.load.engine.cache.DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public ExternalPreferredCacheDiskCacheFactory(android.content.Context context, long j) {
        this(context, com.bumptech.glide.load.engine.cache.DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j);
    }

    public ExternalPreferredCacheDiskCacheFactory(final android.content.Context context, final java.lang.String str, long j) {
        super(new com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory.1
            private java.io.File getInternalCacheDirectory() {
                java.io.File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new java.io.File(cacheDir, str) : cacheDir;
            }

            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public java.io.File getCacheDirectory() {
                java.io.File externalCacheDir;
                java.io.File internalCacheDirectory = getInternalCacheDirectory();
                return ((internalCacheDirectory == null || !internalCacheDirectory.exists()) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? str != null ? new java.io.File(externalCacheDir, str) : externalCacheDir : internalCacheDirectory;
            }
        }, j);
    }
}
