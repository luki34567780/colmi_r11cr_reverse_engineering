package com.bumptech.glide.load.resource;

/* loaded from: /tmp/dex/classes2.dex */
public final class UnitTransformation<T> implements com.bumptech.glide.load.Transformation<T> {
    private static final com.bumptech.glide.load.Transformation<?> TRANSFORMATION = new com.bumptech.glide.load.resource.UnitTransformation();

    public com.bumptech.glide.load.engine.Resource<T> transform(android.content.Context context, com.bumptech.glide.load.engine.Resource<T> resource, int i, int i2) {
        return resource;
    }

    public void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
    }

    public static <T> com.bumptech.glide.load.resource.UnitTransformation<T> get() {
        return (com.bumptech.glide.load.resource.UnitTransformation) TRANSFORMATION;
    }

    private UnitTransformation() {
    }
}
