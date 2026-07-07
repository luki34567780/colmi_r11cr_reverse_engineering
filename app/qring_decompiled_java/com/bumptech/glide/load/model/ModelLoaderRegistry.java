package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class ModelLoaderRegistry {
    private final com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache cache;
    private final com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory;

    public ModelLoaderRegistry(androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
        this(new com.bumptech.glide.load.model.MultiModelLoaderFactory(pool));
    }

    private ModelLoaderRegistry(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
        this.cache = new com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache();
        this.multiModelLoaderFactory = multiModelLoaderFactory;
    }

    public synchronized <Model, Data> void append(java.lang.Class<Model> cls, java.lang.Class<Data> cls2, com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.multiModelLoaderFactory.append(cls, cls2, modelLoaderFactory);
        this.cache.clear();
    }

    public synchronized <Model, Data> void prepend(java.lang.Class<Model> cls, java.lang.Class<Data> cls2, com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.multiModelLoaderFactory.prepend(cls, cls2, modelLoaderFactory);
        this.cache.clear();
    }

    public synchronized <Model, Data> void remove(java.lang.Class<Model> cls, java.lang.Class<Data> cls2) {
        tearDown(this.multiModelLoaderFactory.remove(cls, cls2));
        this.cache.clear();
    }

    public synchronized <Model, Data> void replace(java.lang.Class<Model> cls, java.lang.Class<Data> cls2, com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        tearDown(this.multiModelLoaderFactory.replace(cls, cls2, modelLoaderFactory));
        this.cache.clear();
    }

    private <Model, Data> void tearDown(java.util.List<com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data>> list) {
        java.util.Iterator<com.bumptech.glide.load.model.ModelLoaderFactory<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().teardown();
        }
    }

    public <A> java.util.List<com.bumptech.glide.load.model.ModelLoader<A, ?>> getModelLoaders(A a) {
        java.util.List<com.bumptech.glide.load.model.ModelLoader<A, ?>> modelLoadersForClass = getModelLoadersForClass(getClass(a));
        if (modelLoadersForClass.isEmpty()) {
            throw new com.bumptech.glide.Registry.NoModelLoaderAvailableException(a);
        }
        int size = modelLoadersForClass.size();
        java.util.List<com.bumptech.glide.load.model.ModelLoader<A, ?>> emptyList = java.util.Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            com.bumptech.glide.load.model.ModelLoader<A, ?> modelLoader = modelLoadersForClass.get(i);
            if (modelLoader.handles(a)) {
                if (z) {
                    emptyList = new java.util.ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(modelLoader);
            }
        }
        if (emptyList.isEmpty()) {
            throw new com.bumptech.glide.Registry.NoModelLoaderAvailableException(a, modelLoadersForClass);
        }
        return emptyList;
    }

    public synchronized <Model, Data> com.bumptech.glide.load.model.ModelLoader<Model, Data> build(java.lang.Class<Model> cls, java.lang.Class<Data> cls2) {
        return this.multiModelLoaderFactory.build(cls, cls2);
    }

    public synchronized java.util.List<java.lang.Class<?>> getDataClasses(java.lang.Class<?> cls) {
        return this.multiModelLoaderFactory.getDataClasses(cls);
    }

    private synchronized <A> java.util.List<com.bumptech.glide.load.model.ModelLoader<A, ?>> getModelLoadersForClass(java.lang.Class<A> cls) {
        java.util.List<com.bumptech.glide.load.model.ModelLoader<A, ?>> list;
        list = this.cache.get(cls);
        if (list == null) {
            list = java.util.Collections.unmodifiableList(this.multiModelLoaderFactory.build(cls));
            this.cache.put(cls, list);
        }
        return list;
    }

    private static <A> java.lang.Class<A> getClass(A a) {
        return (java.lang.Class<A>) a.getClass();
    }

    private static class ModelLoaderCache {
        private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache.Entry<?>> cachedModelLoaders = new java.util.HashMap();

        ModelLoaderCache() {
        }

        public void clear() {
            this.cachedModelLoaders.clear();
        }

        public <Model> void put(java.lang.Class<Model> cls, java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> list) {
            if (this.cachedModelLoaders.put(cls, new com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache.Entry<>(list)) == null) {
                return;
            }
            throw new java.lang.IllegalStateException("Already cached loaders for model: " + cls);
        }

        public <Model> java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> get(java.lang.Class<Model> cls) {
            com.bumptech.glide.load.model.ModelLoaderRegistry.ModelLoaderCache.Entry<?> entry = this.cachedModelLoaders.get(cls);
            if (entry == null) {
                return null;
            }
            return (java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>>) entry.loaders;
        }

        private static class Entry<Model> {
            final java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> loaders;

            public Entry(java.util.List<com.bumptech.glide.load.model.ModelLoader<Model, ?>> list) {
                this.loaders = list;
            }
        }
    }
}
