package com.bumptech.glide.load;

/* loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    com.bumptech.glide.load.engine.Resource<Z> decode(T t, int i, int i2, com.bumptech.glide.load.Options options) throws java.io.IOException;

    boolean handles(T t, com.bumptech.glide.load.Options options) throws java.io.IOException;
}
