package com.bumptech.glide.load.engine.cache;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class ExternalCacheDiskCacheFactory extends com.bumptech.glide.load.engine.cache.DiskLruCacheFactory {
    public ExternalCacheDiskCacheFactory(android.content.Context context) {
        this(context, com.bumptech.glide.load.engine.cache.DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, com.bumptech.glide.load.engine.cache.DiskCache.Factory.DEFAULT_DISK_CACHE_SIZE);
    }

    public ExternalCacheDiskCacheFactory(android.content.Context context, int i) {
        this(context, com.bumptech.glide.load.engine.cache.DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, i);
    }

    public ExternalCacheDiskCacheFactory(final android.content.Context context, final java.lang.String str, int i) {
        super(new com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory.1
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public java.io.File getCacheDirectory() {
                java.io.File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null) {
                    return null;
                }
                return str != null ? new java.io.File(externalCacheDir, str) : externalCacheDir;
            }
        }, i);
    }
}
