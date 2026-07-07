package com.bumptech.glide.signature;

/* loaded from: /tmp/dex/classes2.dex */
public final class EmptySignature implements com.bumptech.glide.load.Key {
    private static final com.bumptech.glide.signature.EmptySignature EMPTY_KEY = new com.bumptech.glide.signature.EmptySignature();

    public java.lang.String toString() {
        return "EmptySignature";
    }

    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
    }

    public static com.bumptech.glide.signature.EmptySignature obtain() {
        return EMPTY_KEY;
    }

    private EmptySignature() {
    }
}
