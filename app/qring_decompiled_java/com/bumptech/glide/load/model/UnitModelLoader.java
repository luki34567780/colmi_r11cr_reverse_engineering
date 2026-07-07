package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class UnitModelLoader<Model> implements com.bumptech.glide.load.model.ModelLoader<Model, Model> {
    private static final com.bumptech.glide.load.model.UnitModelLoader<?> INSTANCE = new com.bumptech.glide.load.model.UnitModelLoader<>();

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(Model model) {
        return true;
    }

    public static <T> com.bumptech.glide.load.model.UnitModelLoader<T> getInstance() {
        return (com.bumptech.glide.load.model.UnitModelLoader<T>) INSTANCE;
    }

    @java.lang.Deprecated
    public UnitModelLoader() {
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Model> buildLoadData(Model model, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.model.ModelLoader.LoadData<>(new com.bumptech.glide.signature.ObjectKey(model), new com.bumptech.glide.load.model.UnitModelLoader.UnitFetcher(model));
    }

    private static class UnitFetcher<Model> implements com.bumptech.glide.load.data.DataFetcher<Model> {
        private final Model resource;

        public void cancel() {
        }

        public void cleanup() {
        }

        UnitFetcher(Model model) {
            this.resource = model;
        }

        public void loadData(com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Model> dataCallback) {
            dataCallback.onDataReady(this.resource);
        }

        public java.lang.Class<Model> getDataClass() {
            return (java.lang.Class<Model>) this.resource.getClass();
        }

        public com.bumptech.glide.load.DataSource getDataSource() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    public static class Factory<Model> implements com.bumptech.glide.load.model.ModelLoaderFactory<Model, Model> {
        private static final com.bumptech.glide.load.model.UnitModelLoader.Factory<?> FACTORY = new com.bumptech.glide.load.model.UnitModelLoader.Factory<>();

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public static <T> com.bumptech.glide.load.model.UnitModelLoader.Factory<T> getInstance() {
            return (com.bumptech.glide.load.model.UnitModelLoader.Factory<T>) FACTORY;
        }

        @java.lang.Deprecated
        public Factory() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<Model, Model> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return com.bumptech.glide.load.model.UnitModelLoader.getInstance();
        }
    }
}
