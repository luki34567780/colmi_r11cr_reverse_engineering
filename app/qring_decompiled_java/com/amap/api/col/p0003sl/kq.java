package com.amap.api.col.p0003sl;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
public final class kq implements java.io.Closeable {
    public static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("US-ASCII");
    private final java.io.InputStream b;
    private final java.nio.charset.Charset c;
    private byte[] d;
    private int e;
    private int f;

    public kq(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private kq(java.io.InputStream inputStream, java.nio.charset.Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(a)) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding");
        }
        this.b = inputStream;
        this.c = charset;
        this.d = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this.b) {
            if (this.d != null) {
                this.d = null;
                this.b.close();
            }
        }
    }

    public final java.lang.String a() throws java.io.IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.b) {
            if (this.d == null) {
                throw new java.io.IOException("LineReader is closed");
            }
            if (this.e >= this.f) {
                b();
            }
            for (int i3 = this.e; i3 != this.f; i3++) {
                byte[] bArr2 = this.d;
                if (bArr2[i3] == 10) {
                    int i4 = this.e;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            java.lang.String str = new java.lang.String(bArr2, i4, i2 - i4, this.c.name());
                            this.e = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    java.lang.String str2 = new java.lang.String(bArr2, i4, i2 - i4, this.c.name());
                    this.e = i3 + 1;
                    return str2;
                }
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((this.f - this.e) + 80) { // from class: com.amap.api.col.3sl.kq.1
                @Override // java.io.ByteArrayOutputStream
                public final java.lang.String toString() {
                    try {
                        return new java.lang.String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, com.amap.api.col.p0003sl.kq.this.c.name());
                    } catch (java.io.UnsupportedEncodingException e) {
                        throw new java.lang.AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.d;
                int i5 = this.e;
                byteArrayOutputStream.write(bArr3, i5, this.f - i5);
                this.f = -1;
                b();
                i = this.e;
                while (i != this.f) {
                    bArr = this.d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.e;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.e = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    private void b() throws java.io.IOException {
        java.io.InputStream inputStream = this.b;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new java.io.EOFException();
        }
        this.e = 0;
        this.f = read;
    }
}
