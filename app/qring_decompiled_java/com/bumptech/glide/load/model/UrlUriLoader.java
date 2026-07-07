package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class UrlUriLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> {
    private static final java.util.Set<java.lang.String> SCHEMES = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("http", "https")));
    private final com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, Data> urlLoader;

    public UrlUriLoader(com.bumptech.glide.load.model.ModelLoader<com.bumptech.glide.load.model.GlideUrl, Data> modelLoader) {
        this.urlLoader = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(android.net.Uri uri, int i, int i2, com.bumptech.glide.load.Options options) {
        return this.urlLoader.buildLoadData(new com.bumptech.glide.load.model.GlideUrl(uri.toString()), i, i2, options);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(android.net.Uri uri) {
        return SCHEMES.contains(uri.getScheme());
    }

    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.UrlUriLoader(multiModelLoaderFactory.build(com.bumptech.glide.load.model.GlideUrl.class, java.io.InputStream.class));
        }
    }
}
