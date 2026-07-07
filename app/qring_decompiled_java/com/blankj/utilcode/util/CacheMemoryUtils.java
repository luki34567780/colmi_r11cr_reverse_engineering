package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CacheMemoryUtils implements com.blankj.utilcode.constant.CacheConstants {
    private static final java.util.Map<java.lang.String, com.blankj.utilcode.util.CacheMemoryUtils> CACHE_MAP = new java.util.HashMap();
    private static final int DEFAULT_MAX_COUNT = 256;
    private final java.lang.String mCacheKey;
    private final androidx.collection.LruCache<java.lang.String, com.blankj.utilcode.util.CacheMemoryUtils.CacheValue> mMemoryCache;

    public static com.blankj.utilcode.util.CacheMemoryUtils getInstance() {
        return getInstance(256);
    }

    public static com.blankj.utilcode.util.CacheMemoryUtils getInstance(int i) {
        return getInstance(java.lang.String.valueOf(i), i);
    }

    public static com.blankj.utilcode.util.CacheMemoryUtils getInstance(java.lang.String str, int i) {
        java.util.Map<java.lang.String, com.blankj.utilcode.util.CacheMemoryUtils> map = CACHE_MAP;
        com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils = map.get(str);
        if (cacheMemoryUtils == null) {
            synchronized (com.blankj.utilcode.util.CacheMemoryUtils.class) {
                cacheMemoryUtils = map.get(str);
                if (cacheMemoryUtils == null) {
                    cacheMemoryUtils = new com.blankj.utilcode.util.CacheMemoryUtils(str, new androidx.collection.LruCache(i));
                    map.put(str, cacheMemoryUtils);
                }
            }
        }
        return cacheMemoryUtils;
    }

    private CacheMemoryUtils(java.lang.String str, androidx.collection.LruCache<java.lang.String, com.blankj.utilcode.util.CacheMemoryUtils.CacheValue> lruCache) {
        this.mCacheKey = str;
        this.mMemoryCache = lruCache;
    }

    public java.lang.String toString() {
        return this.mCacheKey + "@" + java.lang.Integer.toHexString(hashCode());
    }

    public void put(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, obj, -1);
    }

    public void put(java.lang.String str, java.lang.Object obj, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        if (obj == null) {
            return;
        }
        this.mMemoryCache.put(str, new com.blankj.utilcode.util.CacheMemoryUtils.CacheValue(i < 0 ? -1L : java.lang.System.currentTimeMillis() + (i * 1000), obj));
    }

    public <T> T get(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) get(str, null);
    }

    public <T> T get(java.lang.String str, T t) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        com.blankj.utilcode.util.CacheMemoryUtils.CacheValue cacheValue = this.mMemoryCache.get(str);
        if (cacheValue == null) {
            return t;
        }
        if (cacheValue.dueTime == -1 || cacheValue.dueTime >= java.lang.System.currentTimeMillis()) {
            return (T) cacheValue.value;
        }
        this.mMemoryCache.remove(str);
        return t;
    }

    public int getCacheCount() {
        return this.mMemoryCache.size();
    }

    public java.lang.Object remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        com.blankj.utilcode.util.CacheMemoryUtils.CacheValue remove = this.mMemoryCache.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.value;
    }

    public void clear() {
        this.mMemoryCache.evictAll();
    }

    private static final class CacheValue {
        long dueTime;
        java.lang.Object value;

        CacheValue(long j, java.lang.Object obj) {
            this.dueTime = j;
            this.value = obj;
        }
    }
}
