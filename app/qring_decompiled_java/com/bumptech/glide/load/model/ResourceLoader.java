package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class ResourceLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, Data> {
    private static final java.lang.String TAG = "ResourceLoader";
    private final android.content.res.Resources resources;
    private final com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> uriLoader;

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(java.lang.Integer num) {
        return true;
    }

    public ResourceLoader(android.content.res.Resources resources, com.bumptech.glide.load.model.ModelLoader<android.net.Uri, Data> modelLoader) {
        this.resources = resources;
        this.uriLoader = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(java.lang.Integer num, int i, int i2, com.bumptech.glide.load.Options options) {
        android.net.Uri resourceUri = getResourceUri(num);
        if (resourceUri == null) {
            return null;
        }
        return this.uriLoader.buildLoadData(resourceUri, i, i2, options);
    }

    private android.net.Uri getResourceUri(java.lang.Integer num) {
        try {
            return android.net.Uri.parse("android.resource://" + this.resources.getResourcePackageName(num.intValue()) + '/' + this.resources.getResourceTypeName(num.intValue()) + '/' + this.resources.getResourceEntryName(num.intValue()));
        } catch (android.content.res.Resources.NotFoundException e) {
            if (!android.util.Log.isLoggable(TAG, 5)) {
                return null;
            }
            android.util.Log.w(TAG, "Received invalid resource id: " + num, e);
            return null;
        }
    }

    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, java.io.InputStream> {
        private final android.content.res.Resources resources;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public StreamFactory(android.content.res.Resources resources) {
            this.resources = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.ResourceLoader(this.resources, multiModelLoaderFactory.build(android.net.Uri.class, java.io.InputStream.class));
        }
    }

    public static class FileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.os.ParcelFileDescriptor> {
        private final android.content.res.Resources resources;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public FileDescriptorFactory(android.content.res.Resources resources) {
            this.resources = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.os.ParcelFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.ResourceLoader(this.resources, multiModelLoaderFactory.build(android.net.Uri.class, android.os.ParcelFileDescriptor.class));
        }
    }

    public static final class AssetFileDescriptorFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.content.res.AssetFileDescriptor> {
        private final android.content.res.Resources resources;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public AssetFileDescriptorFactory(android.content.res.Resources resources) {
            this.resources = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.content.res.AssetFileDescriptor> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.ResourceLoader(this.resources, multiModelLoaderFactory.build(android.net.Uri.class, android.content.res.AssetFileDescriptor.class));
        }
    }

    public static class UriFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.lang.Integer, android.net.Uri> {
        private final android.content.res.Resources resources;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public UriFactory(android.content.res.Resources resources) {
            this.resources = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.lang.Integer, android.net.Uri> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.ResourceLoader(this.resources, com.bumptech.glide.load.model.UnitModelLoader.getInstance());
        }
    }
}
