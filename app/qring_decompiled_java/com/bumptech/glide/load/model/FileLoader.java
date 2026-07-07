package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class FileLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<java.io.File, Data> {
    private static final java.lang.String TAG = "FileLoader";
    private final com.bumptech.glide.load.model.FileLoader.FileOpener<Data> fileOpener;

    public interface FileOpener<Data> {
        void close(Data data) throws java.io.IOException;

        java.lang.Class<Data> getDataClass();

        Data open(java.io.File file) throws java.io.FileNotFoundException;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(java.io.File file) {
        return true;
    }

    public FileLoader(com.bumptech.glide.load.model.FileLoader.FileOpener<Data> fileOpener) {
        this.fileOpener = fileOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(java.io.File file, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.model.ModelLoader.LoadData<>(new com.bumptech.glide.signature.ObjectKey(file), new com.bumptech.glide.load.model.FileLoader.FileFetcher(file, this.fileOpener));
    }

    private static final class FileFetcher<Data> implements com.bumptech.glide.load.data.DataFetcher<Data> {
        private Data data;
        private final java.io.File file;
        private final com.bumptech.glide.load.model.FileLoader.FileOpener<Data> opener;

        public void cancel() {
        }

        FileFetcher(java.io.File file, com.bumptech.glide.load.model.FileLoader.FileOpener<Data> fileOpener) {
            this.file = file;
            this.opener = fileOpener;
        }

        public void loadData(com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Data> dataCallback) {
            try {
                Data open = this.opener.open(this.file);
                this.data = open;
                dataCallback.onDataReady(open);
            } catch (java.io.FileNotFoundException e) {
                if (android.util.Log.isLoggable(com.bumptech.glide.load.model.FileLoader.TAG, 3)) {
                    android.util.Log.d(com.bumptech.glide.load.model.FileLoader.TAG, "Failed to open file", e);
                }
                dataCallback.onLoadFailed(e);
            }
        }

        public void cleanup() {
            Data data = this.data;
            if (data != null) {
                try {
                    this.opener.close(data);
                } catch (java.io.IOException unused) {
                }
            }
        }

        public java.lang.Class<Data> getDataClass() {
            return this.opener.getDataClass();
        }

        public com.bumptech.glide.load.DataSource getDataSource() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    public static class Factory<Data> implements com.bumptech.glide.load.model.ModelLoaderFactory<java.io.File, Data> {
        private final com.bumptech.glide.load.model.FileLoader.FileOpener<Data> opener;

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }

        public Factory(com.bumptech.glide.load.model.FileLoader.FileOpener<Data> fileOpener) {
            this.opener = fileOpener;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final com.bumptech.glide.load.model.ModelLoader<java.io.File, Data> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.FileLoader(this.opener);
        }
    }

    public static class StreamFactory extends com.bumptech.glide.load.model.FileLoader.Factory<java.io.InputStream> {
        public StreamFactory() {
            super(new com.bumptech.glide.load.model.FileLoader.FileOpener<java.io.InputStream>() { // from class: com.bumptech.glide.load.model.FileLoader.StreamFactory.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                public java.io.InputStream open(java.io.File file) throws java.io.FileNotFoundException {
                    return new java.io.FileInputStream(file);
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                public void close(java.io.InputStream inputStream) throws java.io.IOException {
                    inputStream.close();
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                public java.lang.Class<java.io.InputStream> getDataClass() {
                    return java.io.InputStream.class;
                }
            });
        }
    }

    public static class FileDescriptorFactory extends com.bumptech.glide.load.model.FileLoader.Factory<android.os.ParcelFileDescriptor> {
        public FileDescriptorFactory() {
            super(new com.bumptech.glide.load.model.FileLoader.FileOpener<android.os.ParcelFileDescriptor>() { // from class: com.bumptech.glide.load.model.FileLoader.FileDescriptorFactory.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                public android.os.ParcelFileDescriptor open(java.io.File file) throws java.io.FileNotFoundException {
                    return android.os.ParcelFileDescriptor.open(file, 268435456);
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                public void close(android.os.ParcelFileDescriptor parcelFileDescriptor) throws java.io.IOException {
                    parcelFileDescriptor.close();
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                public java.lang.Class<android.os.ParcelFileDescriptor> getDataClass() {
                    return android.os.ParcelFileDescriptor.class;
                }
            });
        }
    }
}
