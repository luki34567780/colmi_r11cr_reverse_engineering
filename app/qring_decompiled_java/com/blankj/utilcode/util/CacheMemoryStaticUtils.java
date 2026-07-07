package com.blankj.utilcode.util;

/* loaded from: classes.dex */
public final class CacheMemoryStaticUtils {
    private static com.blankj.utilcode.util.CacheMemoryUtils sDefaultCacheMemoryUtils;

    public static void setDefaultCacheMemoryUtils(com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        sDefaultCacheMemoryUtils = cacheMemoryUtils;
    }

    public static void put(java.lang.String str, java.lang.Object obj) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, obj, getDefaultCacheMemoryUtils());
    }

    public static void put(java.lang.String str, java.lang.Object obj, int i) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        put(str, obj, i, getDefaultCacheMemoryUtils());
    }

    public static <T> T get(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) get(str, getDefaultCacheMemoryUtils());
    }

    public static <T> T get(java.lang.String str, T t) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) get(str, t, getDefaultCacheMemoryUtils());
    }

    public static int getCacheCount() {
        return getCacheCount(getDefaultCacheMemoryUtils());
    }

    public static java.lang.Object remove(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return remove(str, getDefaultCacheMemoryUtils());
    }

    public static void clear() {
        clear(getDefaultCacheMemoryUtils());
    }

    public static void put(java.lang.String str, java.lang.Object obj, com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheMemoryUtils.put(str, obj);
    }

    public static void put(java.lang.String str, java.lang.Object obj, int i, com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#3 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheMemoryUtils.put(str, obj, i);
    }

    public static <T> T get(java.lang.String str, com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) cacheMemoryUtils.get(str);
    }

    public static <T> T get(java.lang.String str, T t, com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return (T) cacheMemoryUtils.get(str, t);
    }

    public static int getCacheCount(com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheMemoryUtils.getCacheCount();
    }

    public static java.lang.Object remove(java.lang.String str, com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        java.util.Objects.requireNonNull(str, "Argument 'key' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        return cacheMemoryUtils.remove(str);
    }

    public static void clear(com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils) {
        java.util.Objects.requireNonNull(cacheMemoryUtils, "Argument 'cacheMemoryUtils' of type CacheMemoryUtils (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        cacheMemoryUtils.clear();
    }

    private static com.blankj.utilcode.util.CacheMemoryUtils getDefaultCacheMemoryUtils() {
        com.blankj.utilcode.util.CacheMemoryUtils cacheMemoryUtils = sDefaultCacheMemoryUtils;
        return cacheMemoryUtils != null ? cacheMemoryUtils : com.blankj.utilcode.util.CacheMemoryUtils.getInstance();
    }
}
