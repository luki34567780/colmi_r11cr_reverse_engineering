package com.bumptech.glide.load.engine;

/* loaded from: classes.dex */
final class DataCacheKey implements com.bumptech.glide.load.Key {
    private final com.bumptech.glide.load.Key signature;
    private final com.bumptech.glide.load.Key sourceKey;

    DataCacheKey(com.bumptech.glide.load.Key key, com.bumptech.glide.load.Key key2) {
        this.sourceKey = key;
        this.signature = key2;
    }

    com.bumptech.glide.load.Key getSourceKey() {
        return this.sourceKey;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.bumptech.glide.load.engine.DataCacheKey)) {
            return false;
        }
        com.bumptech.glide.load.engine.DataCacheKey dataCacheKey = (com.bumptech.glide.load.engine.DataCacheKey) obj;
        return this.sourceKey.equals(dataCacheKey.sourceKey) && this.signature.equals(dataCacheKey.signature);
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return (this.sourceKey.hashCode() * 31) + this.signature.hashCode();
    }

    public java.lang.String toString() {
        return "DataCacheKey{sourceKey=" + this.sourceKey + ", signature=" + this.signature + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
        this.sourceKey.updateDiskCacheKey(messageDigest);
        this.signature.updateDiskCacheKey(messageDigest);
    }
}
