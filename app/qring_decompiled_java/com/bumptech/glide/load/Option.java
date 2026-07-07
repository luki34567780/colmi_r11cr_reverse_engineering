package com.bumptech.glide.load;

/* loaded from: classes.dex */
public final class Option<T> {
    private static final com.bumptech.glide.load.Option.CacheKeyUpdater<java.lang.Object> EMPTY_UPDATER = new com.bumptech.glide.load.Option.CacheKeyUpdater<java.lang.Object>() { // from class: com.bumptech.glide.load.Option.1
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(byte[] bArr, java.lang.Object obj, java.security.MessageDigest messageDigest) {
        }
    };
    private final com.bumptech.glide.load.Option.CacheKeyUpdater<T> cacheKeyUpdater;
    private final T defaultValue;
    private final java.lang.String key;
    private volatile byte[] keyBytes;

    public interface CacheKeyUpdater<T> {
        void update(byte[] bArr, T t, java.security.MessageDigest messageDigest);
    }

    public static <T> com.bumptech.glide.load.Option<T> memory(java.lang.String str) {
        return new com.bumptech.glide.load.Option<>(str, null, emptyUpdater());
    }

    public static <T> com.bumptech.glide.load.Option<T> memory(java.lang.String str, T t) {
        return new com.bumptech.glide.load.Option<>(str, t, emptyUpdater());
    }

    public static <T> com.bumptech.glide.load.Option<T> disk(java.lang.String str, com.bumptech.glide.load.Option.CacheKeyUpdater<T> cacheKeyUpdater) {
        return new com.bumptech.glide.load.Option<>(str, null, cacheKeyUpdater);
    }

    public static <T> com.bumptech.glide.load.Option<T> disk(java.lang.String str, T t, com.bumptech.glide.load.Option.CacheKeyUpdater<T> cacheKeyUpdater) {
        return new com.bumptech.glide.load.Option<>(str, t, cacheKeyUpdater);
    }

    private Option(java.lang.String str, T t, com.bumptech.glide.load.Option.CacheKeyUpdater<T> cacheKeyUpdater) {
        this.key = com.bumptech.glide.util.Preconditions.checkNotEmpty(str);
        this.defaultValue = t;
        this.cacheKeyUpdater = (com.bumptech.glide.load.Option.CacheKeyUpdater) com.bumptech.glide.util.Preconditions.checkNotNull(cacheKeyUpdater);
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public void update(T t, java.security.MessageDigest messageDigest) {
        this.cacheKeyUpdater.update(getKeyBytes(), t, messageDigest);
    }

    private byte[] getKeyBytes() {
        if (this.keyBytes == null) {
            this.keyBytes = this.key.getBytes(com.bumptech.glide.load.Key.CHARSET);
        }
        return this.keyBytes;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.bumptech.glide.load.Option) {
            return this.key.equals(((com.bumptech.glide.load.Option) obj).key);
        }
        return false;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    private static <T> com.bumptech.glide.load.Option.CacheKeyUpdater<T> emptyUpdater() {
        return (com.bumptech.glide.load.Option.CacheKeyUpdater<T>) EMPTY_UPDATER;
    }

    public java.lang.String toString() {
        return "Option{key='" + this.key + "'}";
    }
}
