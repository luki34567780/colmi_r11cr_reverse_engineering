package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class UriLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> {
    private static final java.util.Set<java.lang.String> SCHEMES = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("file", "android.resource", "content")));
    private final com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<Data> factory;

    public interface LocalUriFetcherFactory<Data> {
        com.bumptech.glide.load.data.DataFetcher<Data> build(android.net.Uri uri);
    }

    public UriLoader(com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<Data> localUriFetcherFactory) {
        this.factory = localUriFetcherFactory;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(android.net.Uri uri, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.model.ModelLoader.LoadData<>(new com.bumptech.glide.signature.ObjectKey(uri), this.factory.build(uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(android.net.Uri uri) {
        return SCHEMES.contains(uri.getScheme());
    }

    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.InputStream>, com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<java.io.InputStream> {
        private final android.content.ContentResolver contentResolver;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public StreamFactory(android.content.ContentResolver contentResolver) {
            this.contentResolver = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<java.io.InputStream> build(android.net.Uri uri) {
            return new com.bumptech.glide.load.data.StreamLocalUriFetcher(this.contentResolver, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.UriLoader(this);
        }
    }

    public static class FileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.os.ParcelFileDescriptor>, com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<android.os.ParcelFileDescriptor> {
        private final android.content.ContentResolver contentResolver;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public FileDescriptorFactory(android.content.ContentResolver contentResolver) {
            this.contentResolver = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<android.os.ParcelFileDescriptor> build(android.net.Uri uri) {
            return new com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher(this.contentResolver, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.os.ParcelFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.UriLoader(this);
        }
    }

    public static final class AssetFileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, android.content.res.AssetFileDescriptor>, com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory<android.content.res.AssetFileDescriptor> {
        private final android.content.ContentResolver contentResolver;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public AssetFileDescriptorFactory(android.content.ContentResolver contentResolver) {
            this.contentResolver = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, android.content.res.AssetFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.UriLoader(this);
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public com.bumptech.glide.load.data.DataFetcher<android.content.res.AssetFileDescriptor> build(android.net.Uri uri) {
            return new com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher(this.contentResolver, uri);
        }
    }
}
