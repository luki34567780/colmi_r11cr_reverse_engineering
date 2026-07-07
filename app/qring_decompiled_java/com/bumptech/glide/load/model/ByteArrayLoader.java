package com.bumptech.glide.load.model;

/* loaded from: /tmp/dex/classes2.dex */
public class ByteArrayLoader<Data> implements com.bumptech.glide.load.model.ModelLoader<byte[], Data> {
    private final com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> converter;

    public interface Converter<Data> {
        Data convert(byte[] bArr);

        java.lang.Class<Data> getDataClass();
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(byte[] bArr) {
        return true;
    }

    public ByteArrayLoader(com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> converter) {
        this.converter = converter;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public com.bumptech.glide.load.model.ModelLoader.LoadData<Data> buildLoadData(byte[] bArr, int i, int i2, com.bumptech.glide.load.Options options) {
        return new com.bumptech.glide.load.model.ModelLoader.LoadData<>(new com.bumptech.glide.signature.ObjectKey(bArr), new com.bumptech.glide.load.model.ByteArrayLoader.Fetcher(bArr, this.converter));
    }

    private static class Fetcher<Data> implements com.bumptech.glide.load.data.DataFetcher<Data> {
        private final com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> converter;
        private final byte[] model;

        public void cancel() {
        }

        public void cleanup() {
        }

        Fetcher(byte[] bArr, com.bumptech.glide.load.model.ByteArrayLoader.Converter<Data> converter) {
            this.model = bArr;
            this.converter = converter;
        }

        public void loadData(com.bumptech.glide.Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback<? super Data> dataCallback) {
            dataCallback.onDataReady(this.converter.convert(this.model));
        }

        public java.lang.Class<Data> getDataClass() {
            return this.converter.getDataClass();
        }

        public com.bumptech.glide.load.DataSource getDataSource() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    public static class ByteBufferFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<byte[], java.nio.ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<byte[], java.nio.ByteBuffer> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.ByteArrayLoader(new com.bumptech.glide.load.model.ByteArrayLoader.Converter<java.nio.ByteBuffer>() { // from class: com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory.1
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public java.nio.ByteBuffer convert(byte[] bArr) {
                    return java.nio.ByteBuffer.wrap(bArr);
                }

                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public java.lang.Class<java.nio.ByteBuffer> getDataClass() {
                    return java.nio.ByteBuffer.class;
                }
            });
        }
    }

    public static class StreamFactory implements com.bumptech.glide.load.model.ModelLoaderFactory<byte[], java.io.InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public com.bumptech.glide.load.model.ModelLoader<byte[], java.io.InputStream> build(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
            return new com.bumptech.glide.load.model.ByteArrayLoader(new com.bumptech.glide.load.model.ByteArrayLoader.Converter<java.io.InputStream>() { // from class: com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public java.io.InputStream convert(byte[] bArr) {
                    return new java.io.ByteArrayInputStream(bArr);
                }

                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public java.lang.Class<java.io.InputStream> getDataClass() {
                    return java.io.InputStream.class;
                }
            });
        }
    }
}
