package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
public abstract class DiskCacheStrategy {
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy ALL = new com.bumptech.glide.load.engine.DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.1
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isDataCacheable(com.bumptech.glide.load.DataSource dataSource) {
            return dataSource == com.bumptech.glide.load.DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isResourceCacheable(boolean z, com.bumptech.glide.load.DataSource dataSource, com.bumptech.glide.load.EncodeStrategy encodeStrategy) {
            return (dataSource == com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE || dataSource == com.bumptech.glide.load.DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy NONE = new com.bumptech.glide.load.engine.DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.2
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedData() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedResource() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isDataCacheable(com.bumptech.glide.load.DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isResourceCacheable(boolean z, com.bumptech.glide.load.DataSource dataSource, com.bumptech.glide.load.EncodeStrategy encodeStrategy) {
            return false;
        }
    };
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy DATA = new com.bumptech.glide.load.engine.DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.3
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedResource() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isResourceCacheable(boolean z, com.bumptech.glide.load.DataSource dataSource, com.bumptech.glide.load.EncodeStrategy encodeStrategy) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isDataCacheable(com.bumptech.glide.load.DataSource dataSource) {
            return (dataSource == com.bumptech.glide.load.DataSource.DATA_DISK_CACHE || dataSource == com.bumptech.glide.load.DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy RESOURCE = new com.bumptech.glide.load.engine.DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.4
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedData() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isDataCacheable(com.bumptech.glide.load.DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isResourceCacheable(boolean z, com.bumptech.glide.load.DataSource dataSource, com.bumptech.glide.load.EncodeStrategy encodeStrategy) {
            return (dataSource == com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE || dataSource == com.bumptech.glide.load.DataSource.MEMORY_CACHE) ? false : true;
        }
    };
    public static final com.bumptech.glide.load.engine.DiskCacheStrategy AUTOMATIC = new com.bumptech.glide.load.engine.DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.5
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isDataCacheable(com.bumptech.glide.load.DataSource dataSource) {
            return dataSource == com.bumptech.glide.load.DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public boolean isResourceCacheable(boolean z, com.bumptech.glide.load.DataSource dataSource, com.bumptech.glide.load.EncodeStrategy encodeStrategy) {
            return ((z && dataSource == com.bumptech.glide.load.DataSource.DATA_DISK_CACHE) || dataSource == com.bumptech.glide.load.DataSource.LOCAL) && encodeStrategy == com.bumptech.glide.load.EncodeStrategy.TRANSFORMED;
        }
    };

    public abstract boolean decodeCachedData();

    public abstract boolean decodeCachedResource();

    public abstract boolean isDataCacheable(com.bumptech.glide.load.DataSource dataSource);

    public abstract boolean isResourceCacheable(boolean z, com.bumptech.glide.load.DataSource dataSource, com.bumptech.glide.load.EncodeStrategy encodeStrategy);
}
