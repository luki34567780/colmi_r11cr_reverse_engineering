package com.bumptech.glide.load.resource.bytes;

/* loaded from: /tmp/dex/classes2.dex */
public class ByteBufferRewinder implements com.bumptech.glide.load.data.DataRewinder<java.nio.ByteBuffer> {
    private final java.nio.ByteBuffer buffer;

    public void cleanup() {
    }

    public ByteBufferRewinder(java.nio.ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    public java.nio.ByteBuffer rewindAndGet() {
        this.buffer.position(0);
        return this.buffer;
    }

    public static class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory<java.nio.ByteBuffer> {
        public com.bumptech.glide.load.data.DataRewinder<java.nio.ByteBuffer> build(java.nio.ByteBuffer byteBuffer) {
            return new com.bumptech.glide.load.resource.bytes.ByteBufferRewinder(byteBuffer);
        }

        public java.lang.Class<java.nio.ByteBuffer> getDataClass() {
            return java.nio.ByteBuffer.class;
        }
    }
}
