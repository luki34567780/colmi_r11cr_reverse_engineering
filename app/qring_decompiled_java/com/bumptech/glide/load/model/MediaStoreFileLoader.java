package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public final class MediaStoreFileLoader implements com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.File> {
    private final android.content.Context context;

    public MediaStoreFileLoader(android.content.Context context) {
        this.context = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<java.io.File> buildLoadData(android.net.Uri uri, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.model.ModelLoader.LoadData<>(new com.bumptech.glide.signature.ObjectKey(uri), new com.bumptech.glide.load.model.MediaStoreFileLoader.FilePathFetcher(this.context, uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(android.net.Uri uri) {
        return com.bumptech.glide.load.data.mediastore.MediaStoreUtil.isMediaStoreUri(uri);
    }

    private static class FilePathFetcher implements com.bumptech.glide.load.data.DataFetcher<java.io.File> {
        private static final java.lang.String[] PROJECTION = {"_data"};
        private final android.content.Context context;
        private final android.net.Uri uri;

        public void cancel() {
        }

        public void cleanup() {
        }

        FilePathFetcher(android.content.Context context, android.net.Uri uri) {
            this.context = context;
            this.uri = uri;
        }

        public void loadData(com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super java.io.File> dataCallback) {
            android.database.Cursor query = this.context.getContentResolver().query(this.uri, PROJECTION, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (android.text.TextUtils.isEmpty(r0)) {
                dataCallback.onLoadFailed(new java.io.FileNotFoundException("Failed to find file path for: " + this.uri));
                return;
            }
            dataCallback.onDataReady(new java.io.File(r0));
        }

        public java.lang.Class<java.io.File> getDataClass() {
            return java.io.File.class;
        }

        public com.bumptech.glide.load.DataSource getDataSource() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    public static final class Factory implements com.bumptech.glide.load.model.ModelLoaderFactory<android.net.Uri, java.io.File> {
        private final android.content.Context context;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        public Factory(android.content.Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<android.net.Uri, java.io.File> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.MediaStoreFileLoader(this.context);
        }
    }
}
