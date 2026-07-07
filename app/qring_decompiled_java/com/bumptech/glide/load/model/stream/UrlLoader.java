package com.bumptech.glide.load.model.stream;

/* loaded from: /tmp/dex/classes2.dex */
public class UrlLoader implements com.bumptech.glide.load.model.ModelLoader<java.net.URL, java.io.InputStream> {
    private final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> glideUrlLoader;

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(java.net.URL url) {
        return true;
    }

    public UrlLoader(com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, java.io.InputStream> modelLoader) {
        this.glideUrlLoader = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.InputStream> buildLoadData(java.net.URL url, int i, int i2, com.bumptech.glide.load.Options options) {
        return this.glideUrlLoader.buildLoadData(new com.bumptech.glide.load.model.GlideUrl(url), i, i2, options);
    }

    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.net.URL, java.io.InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.net.URL, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.stream.UrlLoader(multiModelLoaderFactory.build(com.bumptech.glide.load.model.GlideUrl.class, java.io.InputStream.class));
        }
    }
}
