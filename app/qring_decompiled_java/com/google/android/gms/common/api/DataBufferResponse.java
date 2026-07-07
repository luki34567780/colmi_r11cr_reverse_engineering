package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataBufferResponse<T, R extends com.google.android.gms.common.data.AbstractDataBuffer<T> & com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.Response<R> implements com.google.android.gms.common.data.DataBuffer<T> {
    public DataBufferResponse() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer
    public final T get(int i) {
        return (T) ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).getCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer
    public final android.os.Bundle getMetadata() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).getMetadata();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).isClosed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.data.DataBuffer
    public final java.util.Iterator<T> singleRefIterator() {
        return ((com.google.android.gms.common.data.AbstractDataBuffer) getResult()).singleRefIterator();
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public DataBufferResponse(com.google.android.gms.common.data.AbstractDataBuffer abstractDataBuffer) {
        super(abstractDataBuffer);
    }
}
