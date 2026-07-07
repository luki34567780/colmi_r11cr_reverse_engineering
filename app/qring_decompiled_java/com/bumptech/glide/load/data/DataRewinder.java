package com.bumptech.glide.load.data;

/* loaded from: classes.dex */
public interface DataRewinder<T> {

    public interface Factory<T> {
        com.bumptech.glide.load.data.DataRewinder<T> build(T t);

        java.lang.Class<T> getDataClass();
    }

    void cleanup();

    T rewindAndGet() throws java.io.IOException;
}
