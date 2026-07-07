package com.bumptech.glide.load.model.stream;

/* loaded from: /tmp/dex/classes2.dex */
public class HttpGlideUrlLoader implements com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> {
    public static final com.bumptech.glide.load.Option<java.lang.Integer> TIMEOUT = com.bumptech.glide.load.Option.memory("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> modelCache;

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(com.bumptech.glide.load.model.GlideUrl glideUrl) {
        return true;
    }

    public HttpGlideUrlLoader() {
        this(null);
    }

    public HttpGlideUrlLoader(com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> modelCache) {
        this.modelCache = modelCache;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(com.bumptech.glide.load.model.GlideUrl glideUrl, int i, int i2, com.bumptech.glide.load.Options options) {
        com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> modelCache = this.modelCache;
        if (modelCache != null) {
            com.bumptech.glide.load.model.GlideUrl glideUrl2 = modelCache.get(glideUrl, 0, 0);
            if (glideUrl2 == null) {
                this.modelCache.put(glideUrl, 0, 0, glideUrl);
            } else {
                glideUrl = glideUrl2;
            }
        }
        return new com.bumptech.glide.load.model.ModelLoader.LoadData<>(glideUrl, new com.bumptech.glide.load.data.HttpUrlFetcher(glideUrl, ((java.lang.Integer) options.get(TIMEOUT)).intValue()));
    }

    public static class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> {
        private final com.bumptech.glide.load.model.ModelCache<com.bumptech.glide.load.model.GlideUrl, com.bumptech.glide.load.model.GlideUrl> modelCache = new com.bumptech.glide.load.model.ModelCache<>(500);

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.stream.HttpGlideUrlLoader(this.modelCache);
        }
    }
}
