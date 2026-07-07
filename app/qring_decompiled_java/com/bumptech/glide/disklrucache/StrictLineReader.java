package com.bumptech.glide.disklrucache;

/* loaded from: classes.dex */
class StrictLineReader implements java.io.Closeable {
    private static final byte CR = 13;
    private static final byte LF = 10;
    private byte[] buf;
    private final java.nio.charset.Charset charset;
    private int end;
    private final java.io.InputStream in;
    private int pos;

    public StrictLineReader(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        this(inputStream, 8192, charset);
    }

    public StrictLineReader(java.io.InputStream inputStream, int i, java.nio.charset.Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(com.bumptech.glide.disklrucache.Util.US_ASCII)) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding");
        }
        this.in = inputStream;
        this.charset = charset;
        this.buf = new byte[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this.in) {
            if (this.buf != null) {
                this.buf = null;
                this.in.close();
            }
        }
    }

    public java.lang.String readLine() throws java.io.IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.in) {
            if (this.buf == null) {
                throw new java.io.IOException("LineReader is closed");
            }
            if (this.pos >= this.end) {
                fillBuf();
            }
            for (int i3 = this.pos; i3 != this.end; i3++) {
                byte[] bArr2 = this.buf;
                if (bArr2[i3] == 10) {
                    int i4 = this.pos;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            java.lang.String str = new java.lang.String(bArr2, i4, i2 - i4, this.charset.name());
                            this.pos = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    java.lang.String str2 = new java.lang.String(bArr2, i4, i2 - i4, this.charset.name());
                    this.pos = i3 + 1;
                    return str2;
                }
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((this.end - this.pos) + 80) { // from class: com.bumptech.glide.disklrucache.StrictLineReader.1
                @Override // java.io.ByteArrayOutputStream
                public java.lang.String toString() {
                    try {
                        return new java.lang.String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, com.bumptech.glide.disklrucache.StrictLineReader.this.charset.name());
                    } catch (java.io.UnsupportedEncodingException e) {
                        throw new java.lang.AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.buf;
                int i5 = this.pos;
                byteArrayOutputStream.write(bArr3, i5, this.end - i5);
                this.end = -1;
                fillBuf();
                i = this.pos;
                while (i != this.end) {
                    bArr = this.buf;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.pos;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.pos = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public boolean hasUnterminatedLine() {
        return this.end == -1;
    }

    private void fillBuf() throws java.io.IOException {
        java.io.InputStream inputStream = this.in;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new java.io.EOFException();
        }
        this.pos = 0;
        this.end = read;
    }
}
