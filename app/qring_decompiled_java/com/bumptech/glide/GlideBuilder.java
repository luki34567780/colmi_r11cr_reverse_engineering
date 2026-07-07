package com.bumptech.glide;

/* loaded from: classes.dex */
public final class GlideBuilder {
    private com.bumptech.glide.load.engine.executor.GlideExecutor animationExecutor;
    private com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private com.bumptech.glide.manager.ConnectivityMonitorFactory connectivityMonitorFactory;
    private java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> defaultRequestListeners;
    private com.bumptech.glide.load.engine.executor.GlideExecutor diskCacheExecutor;
    private com.bumptech.glide.load.engine.cache.DiskCache.Factory diskCacheFactory;
    private com.bumptech.glide.load.engine.Engine engine;
    private boolean isActiveResourceRetentionAllowed;
    private com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private com.bumptech.glide.load.engine.cache.MemorySizeCalculator memorySizeCalculator;
    private com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
    private com.bumptech.glide.load.engine.executor.GlideExecutor sourceExecutor;
    private final java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> defaultTransitionOptions = new androidx.collection.ArrayMap();
    private final com.bumptech.glide.GlideExperiments.Builder glideExperimentsBuilder = new com.bumptech.glide.GlideExperiments.Builder();
    private int logLevel = 4;
    private com.bumptech.glide.Glide.RequestOptionsFactory defaultRequestOptionsFactory = new com.bumptech.glide.Glide.RequestOptionsFactory() { // from class: com.bumptech.glide.GlideBuilder.1
        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        public com.bumptech.glide.request.RequestOptions build() {
            return new com.bumptech.glide.request.RequestOptions();
        }
    };

    public static final class LogRequestOrigins implements com.bumptech.glide.GlideExperiments.Experiment {
    }

    public com.bumptech.glide.GlideBuilder setBitmapPool(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool) {
        this.bitmapPool = bitmapPool;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setArrayPool(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool) {
        this.arrayPool = arrayPool;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setMemoryCache(com.bumptech.glide.load.engine.cache.MemoryCache memoryCache) {
        this.memoryCache = memoryCache;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setDiskCache(com.bumptech.glide.load.engine.cache.DiskCache.Factory factory) {
        this.diskCacheFactory = factory;
        return this;
    }

    @java.lang.Deprecated
    public com.bumptech.glide.GlideBuilder setResizeExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor glideExecutor) {
        return setSourceExecutor(glideExecutor);
    }

    public com.bumptech.glide.GlideBuilder setSourceExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor glideExecutor) {
        this.sourceExecutor = glideExecutor;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setDiskCacheExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor glideExecutor) {
        this.diskCacheExecutor = glideExecutor;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setAnimationExecutor(com.bumptech.glide.load.engine.executor.GlideExecutor glideExecutor) {
        this.animationExecutor = glideExecutor;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setDefaultRequestOptions(final com.bumptech.glide.request.RequestOptions requestOptions) {
        return setDefaultRequestOptions(new com.bumptech.glide.Glide.RequestOptionsFactory() { // from class: com.bumptech.glide.GlideBuilder.2
            @Override // com.bumptech.glide.Glide.RequestOptionsFactory
            public com.bumptech.glide.request.RequestOptions build() {
                com.bumptech.glide.request.RequestOptions requestOptions2 = requestOptions;
                return requestOptions2 != null ? requestOptions2 : new com.bumptech.glide.request.RequestOptions();
            }
        });
    }

    public com.bumptech.glide.GlideBuilder setDefaultRequestOptions(com.bumptech.glide.Glide.RequestOptionsFactory requestOptionsFactory) {
        this.defaultRequestOptionsFactory = (com.bumptech.glide.Glide.RequestOptionsFactory) com.bumptech.glide.util.Preconditions.checkNotNull(requestOptionsFactory);
        return this;
    }

    public <T> com.bumptech.glide.GlideBuilder setDefaultTransitionOptions(java.lang.Class<T> cls, com.bumptech.glide.TransitionOptions<?, T> transitionOptions) {
        this.defaultTransitionOptions.put(cls, transitionOptions);
        return this;
    }

    public com.bumptech.glide.GlideBuilder setMemorySizeCalculator(com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder builder) {
        return setMemorySizeCalculator(builder.build());
    }

    public com.bumptech.glide.GlideBuilder setMemorySizeCalculator(com.bumptech.glide.load.engine.cache.MemorySizeCalculator memorySizeCalculator) {
        this.memorySizeCalculator = memorySizeCalculator;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setConnectivityMonitorFactory(com.bumptech.glide.manager.ConnectivityMonitorFactory connectivityMonitorFactory) {
        this.connectivityMonitorFactory = connectivityMonitorFactory;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setLogLevel(int i) {
        if (i < 2 || i > 6) {
            throw new java.lang.IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.logLevel = i;
        return this;
    }

    public com.bumptech.glide.GlideBuilder setIsActiveResourceRetentionAllowed(boolean z) {
        this.isActiveResourceRetentionAllowed = z;
        return this;
    }

    public com.bumptech.glide.GlideBuilder addGlobalRequestListener(com.bumptech.glide.request.RequestListener<java.lang.Object> requestListener) {
        if (this.defaultRequestListeners == null) {
            this.defaultRequestListeners = new java.util.ArrayList();
        }
        this.defaultRequestListeners.add(requestListener);
        return this;
    }

    public com.bumptech.glide.GlideBuilder setLogRequestOrigins(boolean z) {
        this.glideExperimentsBuilder.update(new com.bumptech.glide.GlideBuilder.LogRequestOrigins(), z);
        return this;
    }

    public com.bumptech.glide.GlideBuilder setImageDecoderEnabledForBitmaps(boolean z) {
        this.glideExperimentsBuilder.update(new com.bumptech.glide.GlideBuilder.EnableImageDecoderForBitmaps(), z && android.os.Build.VERSION.SDK_INT >= 29);
        return this;
    }

    void setRequestManagerFactory(com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.requestManagerFactory = requestManagerFactory;
    }

    com.bumptech.glide.GlideBuilder setEngine(com.bumptech.glide.load.engine.Engine engine) {
        this.engine = engine;
        return this;
    }

    com.bumptech.glide.Glide build(android.content.Context context) {
        if (this.sourceExecutor == null) {
            this.sourceExecutor = com.bumptech.glide.load.engine.executor.GlideExecutor.newSourceExecutor();
        }
        if (this.diskCacheExecutor == null) {
            this.diskCacheExecutor = com.bumptech.glide.load.engine.executor.GlideExecutor.newDiskCacheExecutor();
        }
        if (this.animationExecutor == null) {
            this.animationExecutor = com.bumptech.glide.load.engine.executor.GlideExecutor.newAnimationExecutor();
        }
        if (this.memorySizeCalculator == null) {
            this.memorySizeCalculator = new com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder(context).build();
        }
        if (this.connectivityMonitorFactory == null) {
            this.connectivityMonitorFactory = new com.bumptech.glide.manager.DefaultConnectivityMonitorFactory();
        }
        if (this.bitmapPool == null) {
            int bitmapPoolSize = this.memorySizeCalculator.getBitmapPoolSize();
            if (bitmapPoolSize > 0) {
                this.bitmapPool = new com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool(bitmapPoolSize);
            } else {
                this.bitmapPool = new com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter();
            }
        }
        if (this.arrayPool == null) {
            this.arrayPool = new com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool(this.memorySizeCalculator.getArrayPoolSizeInBytes());
        }
        if (this.memoryCache == null) {
            this.memoryCache = new com.bumptech.glide.load.engine.cache.LruResourceCache(this.memorySizeCalculator.getMemoryCacheSize());
        }
        if (this.diskCacheFactory == null) {
            this.diskCacheFactory = new com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory(context);
        }
        if (this.engine == null) {
            this.engine = new com.bumptech.glide.load.engine.Engine(this.memoryCache, this.diskCacheFactory, this.diskCacheExecutor, this.sourceExecutor, com.bumptech.glide.load.engine.executor.GlideExecutor.newUnlimitedSourceExecutor(), this.animationExecutor, this.isActiveResourceRetentionAllowed);
        }
        java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> list = this.defaultRequestListeners;
        if (list == null) {
            this.defaultRequestListeners = java.util.Collections.emptyList();
        } else {
            this.defaultRequestListeners = java.util.Collections.unmodifiableList(list);
        }
        com.bumptech.glide.GlideExperiments build = this.glideExperimentsBuilder.build();
        return new com.bumptech.glide.Glide(context, this.engine, this.memoryCache, this.bitmapPool, this.arrayPool, new com.bumptech.glide.manager.RequestManagerRetriever(this.requestManagerFactory, build), this.connectivityMonitorFactory, this.logLevel, this.defaultRequestOptionsFactory, this.defaultTransitionOptions, this.defaultRequestListeners, build);
    }

    static final class ManualOverrideHardwareBitmapMaxFdCount implements com.bumptech.glide.GlideExperiments.Experiment {
        final int fdCount;

        ManualOverrideHardwareBitmapMaxFdCount(int i) {
            this.fdCount = i;
        }
    }

    public static final class WaitForFramesAfterTrimMemory implements com.bumptech.glide.GlideExperiments.Experiment {
        private WaitForFramesAfterTrimMemory() {
        }
    }

    static final class EnableImageDecoderForBitmaps implements com.bumptech.glide.GlideExperiments.Experiment {
        EnableImageDecoderForBitmaps() {
        }
    }
}
