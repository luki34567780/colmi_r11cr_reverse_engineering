package com.bumptech.glide.util;

/* loaded from: /tmp/dex/classes2.dex */
public final class ExceptionPassthroughInputStream extends java.io.InputStream {
    private static final java.util.Queue<com.bumptech.glide.util.ExceptionPassthroughInputStream> POOL = com.bumptech.glide.util.Util.createQueue(0);
    private java.io.IOException exception;
    private java.io.InputStream wrapped;

    public static com.bumptech.glide.util.ExceptionPassthroughInputStream obtain(java.io.InputStream inputStream) {
        com.bumptech.glide.util.ExceptionPassthroughInputStream poll;
        java.util.Queue<com.bumptech.glide.util.ExceptionPassthroughInputStream> queue = POOL;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new com.bumptech.glide.util.ExceptionPassthroughInputStream();
        }
        poll.setInputStream(inputStream);
        return poll;
    }

    static void clearQueue() {
        synchronized (POOL) {
            while (true) {
                java.util.Queue<com.bumptech.glide.util.ExceptionPassthroughInputStream> queue = POOL;
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
        }
    }

    ExceptionPassthroughInputStream() {
    }

    void setInputStream(java.io.InputStream inputStream) {
        this.wrapped = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.wrapped.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.wrapped.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.wrapped.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.wrapped.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        try {
            return this.wrapped.read();
        } catch (java.io.IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        try {
            return this.wrapped.read(bArr);
        } catch (java.io.IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            return this.wrapped.read(bArr, i, i2);
        } catch (java.io.IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
        this.wrapped.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        try {
            return this.wrapped.skip(j);
        } catch (java.io.IOException e) {
            this.exception = e;
            throw e;
        }
    }

    public java.io.IOException getException() {
        return this.exception;
    }

    public void release() {
        this.exception = null;
        this.wrapped = null;
        java.util.Queue<com.bumptech.glide.util.ExceptionPassthroughInputStream> queue = POOL;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}
