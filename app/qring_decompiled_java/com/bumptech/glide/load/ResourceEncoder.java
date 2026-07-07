package com.bumptech.glide.load;

/* loaded from: classes.dex */
public interface ResourceEncoder<T> extends com.bumptech.glide.load.Encoder<com.bumptech.glide.load.engine.Resource<T>> {
    com.bumptech.glide.load.EncodeStrategy getEncodeStrategy(com.bumptech.glide.load.Options options);
}
