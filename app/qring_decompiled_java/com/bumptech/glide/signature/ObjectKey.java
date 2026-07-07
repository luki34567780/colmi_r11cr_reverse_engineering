package com.bumptech.glide.signature;

/* loaded from: /tmp/dex/classes2.dex */
public final class ObjectKey implements com.bumptech.glide.load.Key {
    private final java.lang.Object object;

    public ObjectKey(java.lang.Object obj) {
        this.object = com.bumptech.glide.util.Preconditions.checkNotNull(obj);
    }

    public java.lang.String toString() {
        return "ObjectKey{object=" + this.object + '}';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.bumptech.glide.signature.ObjectKey) {
            return this.object.equals(((com.bumptech.glide.signature.ObjectKey) obj).object);
        }
        return false;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
        messageDigest.update(this.object.toString().getBytes(CHARSET));
    }
}
