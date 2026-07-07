package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public interface ModelLoaderFactory<T, Y> {
    com.bumptech.glide.load.model.ModelLoader<T, Y> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory);

    void teardown();
}
