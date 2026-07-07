package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public interface ModelLoader<Model, Data> {
    com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(Model model, int i, int i2, com.bumptech.glide.load.Options options);

    boolean handles(Model model);

    public static class LoadData<Data> {
        public final java.util.List<com.bumptech.glide.load.Key> alternateKeys;
        public final com.bumptech.glide.load.data.DataFetcher<Data> fetcher;
        public final com.bumptech.glide.load.Key sourceKey;

        public LoadData(com.bumptech.glide.load.Key key, com.bumptech.glide.load.data.DataFetcher<Data> dataFetcher) {
            this(key, java.util.Collections.emptyList(), dataFetcher);
        }

        public LoadData(com.bumptech.glide.load.Key key, java.util.List<com.bumptech.glide.load.Key> list, com.bumptech.glide.load.data.DataFetcher<Data> dataFetcher) {
            this.sourceKey = (com.bumptech.glide.load.Key) com.bumptech.glide.util.Preconditions.checkNotNull(key);
            this.alternateKeys = (java.util.List) com.bumptech.glide.util.Preconditions.checkNotNull(list);
            this.fetcher = (com.bumptech.glide.load.data.DataFetcher) com.bumptech.glide.util.Preconditions.checkNotNull(dataFetcher);
        }
    }
}
