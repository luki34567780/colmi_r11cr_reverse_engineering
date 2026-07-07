package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class ByteBufferFileLoader implements com.bumptech.glide.load.model.ModelLoader<java.io.File, java.nio.ByteBuffer> {
    private static final java.lang.String TAG = "ByteBufferFileLoader";

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(java.io.File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.nio.ByteBuffer> buildLoadData(java.io.File file, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.model.ModelLoader.LoadData<>(new com.bumptech.glide.signature.ObjectKey(file), new com.bumptech.glide.load.model.ByteBufferFileLoader.ByteBufferFetcher(file));
    }

    public static class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<java.io.File, java.nio.ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<java.io.File, java.nio.ByteBuffer> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.ByteBufferFileLoader();
        }
    }

    private static final class ByteBufferFetcher implements com.bumptech.glide.load.data.DataFetcher<java.nio.ByteBuffer> {
        private final java.io.File file;

        public void cancel() {
        }

        public void cleanup() {
        }

        ByteBufferFetcher(java.io.File file) {
            this.file = file;
        }

        public void loadData(com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.nio.ByteBuffer> dataCallback) {
            try {
                dataCallback.onDataReady(com.bumptech.glide.util.ByteBufferUtil.fromFile(this.file));
            } catch (java.io.IOException e) {
                if (android.util.Log.isLoggable(com.bumptech.glide.load.model.ByteBufferFileLoader.TAG, 3)) {
                    android.util.Log.d(com.bumptech.glide.load.model.ByteBufferFileLoader.TAG, "Failed to obtain ByteBuffer for file", e);
                }
                dataCallback.onLoadFailed(e);
            }
        }

        public java.lang.Class<java.nio.ByteBuffer> getDataClass() {
            return java.nio.ByteBuffer.class;
        }

        public com.bumptech.glide.load.DataSource getDataSource() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }
}
