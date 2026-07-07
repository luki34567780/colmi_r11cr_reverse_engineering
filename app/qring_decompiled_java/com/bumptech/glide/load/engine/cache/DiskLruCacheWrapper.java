package com.bumptech.glide.load.engine.cache;

/* loaded from: classes.dex */
public class DiskLruCacheWrapper implements com.bumptech.glide.load.engine.cache.DiskCache {
    private static final int APP_VERSION = 1;
    private static final java.lang.String TAG = "DiskLruCacheWrapper";
    private static final int VALUE_COUNT = 1;
    private static com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper wrapper;
    private final java.io.File directory;
    private com.bumptech.glide.disklrucache.DiskLruCache diskLruCache;
    private final long maxSize;
    private final com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker writeLocker = new com.bumptech.glide.load.engine.cache.DiskCacheWriteLocker();
    private final com.bumptech.glide.load.engine.cache.SafeKeyGenerator safeKeyGenerator = new com.bumptech.glide.load.engine.cache.SafeKeyGenerator();

    @java.lang.Deprecated
    public static synchronized com.bumptech.glide.load.engine.cache.DiskCache get(java.io.File file, long j) {
        com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper diskLruCacheWrapper;
        synchronized (com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper.class) {
            if (wrapper == null) {
                wrapper = new com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper(file, j);
            }
            diskLruCacheWrapper = wrapper;
        }
        return diskLruCacheWrapper;
    }

    public static com.bumptech.glide.load.engine.cache.DiskCache create(java.io.File file, long j) {
        return new com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper(file, j);
    }

    @java.lang.Deprecated
    protected DiskLruCacheWrapper(java.io.File file, long j) {
        this.directory = file;
        this.maxSize = j;
    }

    private synchronized com.bumptech.glide.disklrucache.DiskLruCache getDiskCache() throws java.io.IOException {
        if (this.diskLruCache == null) {
            this.diskLruCache = com.bumptech.glide.disklrucache.DiskLruCache.open(this.directory, 1, 1, this.maxSize);
        }
        return this.diskLruCache;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public java.io.File get(com.bumptech.glide.load.Key key) {
        java.lang.String safeKey = this.safeKeyGenerator.getSafeKey(key);
        if (android.util.Log.isLoggable(TAG, 2)) {
            android.util.Log.v(TAG, "Get: Obtained: " + safeKey + " for for Key: " + key);
        }
        try {
            com.bumptech.glide.disklrucache.DiskLruCache.Value value = getDiskCache().get(safeKey);
            if (value != null) {
                return value.getFile(0);
            }
            return null;
        } catch (java.io.IOException e) {
            if (!android.util.Log.isLoggable(TAG, 5)) {
                return null;
            }
            android.util.Log.w(TAG, "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void put(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.cache.DiskCache.Writer writer) {
        com.bumptech.glide.disklrucache.DiskLruCache diskCache;
        java.lang.String safeKey = this.safeKeyGenerator.getSafeKey(key);
        this.writeLocker.acquire(safeKey);
        try {
            if (android.util.Log.isLoggable(TAG, 2)) {
                android.util.Log.v(TAG, "Put: Obtained: " + safeKey + " for for Key: " + key);
            }
            try {
                diskCache = getDiskCache();
            } catch (java.io.IOException e) {
                if (android.util.Log.isLoggable(TAG, 5)) {
                    android.util.Log.w(TAG, "Unable to put to disk cache", e);
                }
            }
            if (diskCache.get(safeKey) != null) {
                return;
            }
            com.bumptech.glide.disklrucache.DiskLruCache.Editor edit = diskCache.edit(safeKey);
            if (edit == null) {
                throw new java.lang.IllegalStateException("Had two simultaneous puts for: " + safeKey);
            }
            try {
                if (writer.write(edit.getFile(0))) {
                    edit.commit();
                }
                edit.abortUnlessCommitted();
            } catch (java.lang.Throwable th) {
                edit.abortUnlessCommitted();
                throw th;
            }
        } finally {
            this.writeLocker.release(safeKey);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public void delete(com.bumptech.glide.load.Key key) {
        try {
            getDiskCache().remove(this.safeKeyGenerator.getSafeKey(key));
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable(TAG, 5)) {
                android.util.Log.w(TAG, "Unable to delete from disk cache", e);
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public synchronized void clear() {
        try {
            try {
                getDiskCache().delete();
            } catch (java.io.IOException e) {
                if (android.util.Log.isLoggable(TAG, 5)) {
                    android.util.Log.w(TAG, "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
        } finally {
            resetDiskCache();
        }
    }

    private synchronized void resetDiskCache() {
        this.diskLruCache = null;
    }
}
