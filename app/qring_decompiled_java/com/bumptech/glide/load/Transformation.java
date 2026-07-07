package com.bumptech.glide.load;

/* loaded from: classes.dex */
public interface Transformation<T> extends com.bumptech.glide.load.Key {
    com.bumptech.glide.load.engine.Resource<T> transform(android.content.Context context, com.bumptech.glide.load.engine.Resource<T> resource, int i, int i2);
}
