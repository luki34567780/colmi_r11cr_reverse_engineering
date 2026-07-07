package com.bumptech.glide.load;

/* loaded from: classes.dex */
public final class Options implements com.bumptech.glide.load.Key {
    private final androidx.collection.ArrayMap<com.bumptech.glide.load.Option<?>, java.lang.Object> values = new com.bumptech.glide.util.CachedHashCodeArrayMap();

    public void putAll(com.bumptech.glide.load.Options options) {
        this.values.putAll((androidx.collection.SimpleArrayMap<? extends com.bumptech.glide.load.Option<?>, ? extends java.lang.Object>) options.values);
    }

    public <T> com.bumptech.glide.load.Options set(com.bumptech.glide.load.Option<T> option, T t) {
        this.values.put(option, t);
        return this;
    }

    public <T> T get(com.bumptech.glide.load.Option<T> option) {
        return this.values.containsKey(option) ? (T) this.values.get(option) : option.getDefaultValue();
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.bumptech.glide.load.Options) {
            return this.values.equals(((com.bumptech.glide.load.Options) obj).values);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.values.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
        for (int i = 0; i < this.values.size(); i++) {
            updateDiskCacheKey(this.values.keyAt(i), this.values.valueAt(i), messageDigest);
        }
    }

    public java.lang.String toString() {
        return "Options{values=" + this.values + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void updateDiskCacheKey(com.bumptech.glide.load.Option<T> option, java.lang.Object obj, java.security.MessageDigest messageDigest) {
        option.update(obj, messageDigest);
    }
}
