package com.bumptech.glide.load.engine.cache;

/* loaded from: classes.dex */
public interface DiskCache {

    public interface Factory {
        public static final java.lang.String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
        public static final int DEFAULT_DISK_CACHE_SIZE = 262144000;

        com.bumptech.glide.load.engine.cache.DiskCache build();
    }

    public interface Writer {
        boolean write(java.io.File file);
    }

    void clear();

    void delete(com.bumptech.glide.load.Key key);

    java.io.File get(com.bumptech.glide.load.Key key);

    void put(com.bumptech.glide.load.Key key, com.bumptech.glide.load.engine.cache.DiskCache.Writer writer);
}
