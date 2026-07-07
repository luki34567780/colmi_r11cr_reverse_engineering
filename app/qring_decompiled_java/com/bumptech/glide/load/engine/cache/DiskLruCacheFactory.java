package com.bumptech.glide.load.engine.cache;

/* loaded from: classes.dex */
public class DiskLruCacheFactory implements com.bumptech.glide.load.engine.cache.DiskCache.Factory {
    private final com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter cacheDirectoryGetter;
    private final long diskCacheSize;

    public interface CacheDirectoryGetter {
        java.io.File getCacheDirectory();
    }

    public DiskLruCacheFactory(final java.lang.String str, long j) {
        this(new com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.1
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public java.io.File getCacheDirectory() {
                return new java.io.File(str);
            }
        }, j);
    }

    public DiskLruCacheFactory(final java.lang.String str, final java.lang.String str2, long j) {
        this(new com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.2
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public java.io.File getCacheDirectory() {
                return new java.io.File(str, str2);
            }
        }, j);
    }

    public DiskLruCacheFactory(com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter cacheDirectoryGetter, long j) {
        this.diskCacheSize = j;
        this.cacheDirectoryGetter = cacheDirectoryGetter;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public com.bumptech.glide.load.engine.cache.DiskCache build() {
        java.io.File cacheDirectory = this.cacheDirectoryGetter.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper.create(cacheDirectory, this.diskCacheSize);
        }
        return null;
    }
}
