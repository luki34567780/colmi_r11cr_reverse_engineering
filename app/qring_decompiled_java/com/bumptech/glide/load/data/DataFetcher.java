package com.bumptech.glide.load.data;

/* loaded from: classes.dex */
public interface DataFetcher<T> {

    public interface DataCallback<T> {
        void onDataReady(T t);

        void onLoadFailed(java.lang.Exception exc);
    }

    void cancel();

    void cleanup();

    java.lang.Class<T> getDataClass();

    com.bumptech.glide.load.DataSource getDataSource();

    void loadData(com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super T> dataCallback);
}
