package okio;

/* compiled from: Buffer.kt */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$okio", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", "hashCode", "", "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class Buffer implements okio.BufferedSource, okio.BufferedSink, java.lang.Cloneable, java.nio.channels.ByteChannel {
    public okio.Segment head;
    private long size;

    @Override // okio.BufferedSource, okio.BufferedSink
    /* renamed from: buffer */
    public okio.Buffer getBufferField() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final okio.Buffer copyTo(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (java.lang.Object) null);
    }

    public final okio.Buffer copyTo(java.io.OutputStream out, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, j, 0L, 4, (java.lang.Object) null);
    }

    @Override // okio.BufferedSink
    public okio.Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer emitCompleteSegments() {
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    public final okio.Buffer.UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    public final okio.Buffer writeTo(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    public final long size() {
        return this.size;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
        return new java.io.OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @Override // java.io.OutputStream
            public void write(int b) {
                okio.Buffer.this.writeByte(b);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                okio.Buffer.this.write(data, offset, byteCount);
            }

            public java.lang.String toString() {
                return okio.Buffer.this + ".outputStream()";
            }
        };
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws java.io.EOFException {
        if (this.size < byteCount) {
            throw new java.io.EOFException();
        }
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
        return okio.Okio.buffer(new okio.PeekSource(this));
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
        return new java.io.InputStream() { // from class: okio.Buffer$inputStream$1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (okio.Buffer.this.size() > 0) {
                    return okio.Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                return okio.Buffer.this.read(sink, offset, byteCount);
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) java.lang.Math.min(okio.Buffer.this.size(), Integer.MAX_VALUE);
            }

            public java.lang.String toString() {
                return okio.Buffer.this + ".inputStream()";
            }
        };
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readUnsafe$default(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = okio._UtilKt.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readAndWriteUnsafe$default(okio.Buffer buffer, okio.Buffer.UnsafeCursor unsafeCursor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = okio._UtilKt.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer buffer, java.io.OutputStream outputStream, long j, long j2, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    public final okio.Buffer copyTo(java.io.OutputStream out, long offset, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        okio._UtilKt.checkOffsetAndCount(this.size, offset, byteCount);
        if (byteCount == 0) {
            return this;
        }
        okio.Segment segment = this.head;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (offset < segment.limit - segment.pos) {
                break;
            }
            offset -= segment.limit - segment.pos;
            segment = segment.next;
        }
        while (byteCount > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int min = (int) java.lang.Math.min(segment.limit - r9, byteCount);
            out.write(segment.data, (int) (segment.pos + offset), min);
            byteCount -= min;
            segment = segment.next;
            offset = 0;
        }
        return this;
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer buffer, okio.Buffer buffer2, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j2);
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer buffer, okio.Buffer buffer2, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    public final okio.Buffer copyTo(okio.Buffer out, long offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        return copyTo(out, offset, this.size - offset);
    }

    public static /* synthetic */ okio.Buffer writeTo$default(okio.Buffer buffer, java.io.OutputStream outputStream, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    public final okio.Buffer writeTo(java.io.OutputStream out, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        okio._UtilKt.checkOffsetAndCount(this.size, 0L, byteCount);
        okio.Segment segment = this.head;
        while (byteCount > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int min = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j = min;
            this.size -= j;
            byteCount -= j;
            if (segment.pos == segment.limit) {
                okio.Segment pop = segment.pop();
                this.head = pop;
                okio.SegmentPool.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    public final okio.Buffer readFrom(java.io.InputStream input) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    public final okio.Buffer readFrom(java.io.InputStream input, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("byteCount < 0: ", java.lang.Long.valueOf(byteCount)).toString());
        }
        readFrom(input, byteCount, false);
        return this;
    }

    private final void readFrom(java.io.InputStream input, long byteCount, boolean forever) throws java.io.IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            okio.Segment writableSegment$okio = writableSegment$okio(1);
            int read = input.read(writableSegment$okio.data, writableSegment$okio.limit, (int) java.lang.Math.min(byteCount, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    this.head = writableSegment$okio.pop();
                    okio.SegmentPool.recycle(writableSegment$okio);
                }
                if (!forever) {
                    throw new java.io.EOFException();
                }
                return;
            }
            writableSegment$okio.limit += read;
            long j = read;
            this.size += j;
            byteCount -= j;
        }
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.EOFException {
        return okio._UtilKt.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.EOFException {
        return okio._UtilKt.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.EOFException {
        return okio._UtilKt.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
        return readString(this.size, kotlin.text.Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long byteCount) throws java.io.EOFException {
        return readString(byteCount, kotlin.text.Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long byteCount, java.nio.charset.Charset charset) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(byteCount >= 0 && byteCount <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("byteCount: ", java.lang.Long.valueOf(byteCount)).toString());
        }
        if (this.size < byteCount) {
            throw new java.io.EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        if (segment.pos + byteCount > segment.limit) {
            return new java.lang.String(readByteArray(byteCount), charset);
        }
        int i = (int) byteCount;
        java.lang.String str = new java.lang.String(segment.data, segment.pos, i, charset);
        segment.pos += i;
        this.size -= byteCount;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() throws java.io.EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        okio.Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = java.lang.Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, min);
        segment.pos += min;
        this.size -= min;
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String string, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String string, int beginIndex, int endIndex, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(beginIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("beginIndex < 0: ", java.lang.Integer.valueOf(beginIndex)).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(charset, kotlin.text.Charsets.UTF_8)) {
            return writeUtf8(string, beginIndex, endIndex);
        }
        java.lang.String substring = string.substring(beginIndex, endIndex);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        java.util.Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            okio.Segment writableSegment$okio = writableSegment$okio(1);
            int min = java.lang.Math.min(i, 8192 - writableSegment$okio.limit);
            source.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShortLe(int s) {
        return writeShort((int) okio._UtilKt.reverseBytes((short) s));
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeIntLe(int i) {
        return writeInt(okio._UtilKt.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLongLe(long v) {
        return writeLong(okio._UtilKt.reverseBytes(v));
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex) {
        return indexOf(b, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString bytes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString targetBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, okio.ByteString bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // okio.Source
    /* renamed from: timeout */
    public okio.Timeout getThis$0() {
        return okio.Timeout.NONE;
    }

    public final okio.ByteString md5() {
        return digest("MD5");
    }

    public final okio.ByteString sha1() {
        return digest("SHA-1");
    }

    public final okio.ByteString sha256() {
        return digest("SHA-256");
    }

    public final okio.ByteString sha512() {
        return digest("SHA-512");
    }

    private final okio.ByteString digest(java.lang.String algorithm) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        okio.Segment segment = this.head;
        if (segment != null) {
            messageDigest.update(segment.data, segment.pos, segment.limit - segment.pos);
            okio.Segment segment2 = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            while (segment2 != segment) {
                messageDigest.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                segment2 = segment2.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            }
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "messageDigest.digest()");
        return new okio.ByteString(digest);
    }

    public final okio.ByteString hmacSha1(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final okio.ByteString hmacSha256(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final okio.ByteString hmacSha512(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac("HmacSHA512", key);
    }

    private final okio.ByteString hmac(java.lang.String algorithm, okio.ByteString key) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.internalArray$okio(), algorithm));
            okio.Segment segment = this.head;
            if (segment != null) {
                mac.update(segment.data, segment.pos, segment.limit - segment.pos);
                okio.Segment segment2 = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                while (segment2 != segment) {
                    mac.update(segment2.data, segment2.pos, segment2.limit - segment2.pos);
                    segment2 = segment2.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                }
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "mac.doFinal()");
            return new okio.ByteString(doFinal);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public java.lang.String toString() {
        return snapshot().toString();
    }

    public okio.Buffer clone() {
        return copy();
    }

    public final okio.Buffer.UnsafeCursor readUnsafe(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal._BufferKt.commonReadUnsafe(this, unsafeCursor);
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe(okio.Buffer.UnsafeCursor unsafeCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal._BufferKt.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m2722deprecated_getByte(long index) {
        return getByte(index);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* compiled from: Buffer.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", com.autonavi.base.amap.mapcore.AeUtil.ROOT_DATA_PATH_OLD_NAME, "", "end", "", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "", "readWrite", "", "segment", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "start", "close", "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UnsafeCursor implements java.io.Closeable {
        public okio.Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private okio.Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        /* renamed from: getSegment$okio, reason: from getter */
        public final okio.Segment getSegment() {
            return this.segment;
        }

        public final void setSegment$okio(okio.Segment segment) {
            this.segment = segment;
        }

        public final int next() {
            long j = this.offset;
            okio.Buffer buffer = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(buffer);
            if (!(j != buffer.size())) {
                throw new java.lang.IllegalStateException("no more bytes".toString());
            }
            long j2 = this.offset;
            return seek(j2 == -1 ? 0L : j2 + (this.end - this.start));
        }

        public final int seek(long offset) {
            okio.Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (offset < -1 || offset > buffer.size()) {
                throw new java.lang.ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + buffer.size());
            }
            if (offset == -1 || offset == buffer.size()) {
                setSegment$okio(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long j = 0;
            long size = buffer.size();
            okio.Segment segment = buffer.head;
            okio.Segment segment2 = buffer.head;
            if (getSegment() != null) {
                long j2 = this.offset;
                int i = this.start;
                kotlin.jvm.internal.Intrinsics.checkNotNull(getSegment());
                long j3 = j2 - (i - r10.pos);
                if (j3 > offset) {
                    segment2 = getSegment();
                    size = j3;
                } else {
                    segment = getSegment();
                    j = j3;
                }
            }
            if (size - offset > offset - j) {
                while (true) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    if (offset < (segment.limit - segment.pos) + j) {
                        break;
                    }
                    j += segment.limit - segment.pos;
                    segment = segment.next;
                }
            } else {
                while (size > offset) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    segment2 = segment2.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    size -= segment2.limit - segment2.pos;
                }
                j = size;
                segment = segment2;
            }
            if (this.readWrite) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                if (segment.shared) {
                    okio.Segment unsharedCopy = segment.unsharedCopy();
                    if (buffer.head == segment) {
                        buffer.head = unsharedCopy;
                    }
                    segment = segment.push(unsharedCopy);
                    okio.Segment segment3 = segment.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    segment3.pop();
                }
            }
            setSegment$okio(segment);
            this.offset = offset;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            this.data = segment.data;
            this.start = segment.pos + ((int) (offset - j));
            int i2 = segment.limit;
            this.end = i2;
            return i2 - this.start;
        }

        public final long resizeBuffer(long newSize) {
            okio.Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new java.lang.IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            int i = 1;
            if (newSize <= size) {
                if (!(newSize >= 0)) {
                    throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("newSize < 0: ", java.lang.Long.valueOf(newSize)).toString());
                }
                long j = size - newSize;
                while (true) {
                    if (j <= 0) {
                        break;
                    }
                    okio.Segment segment = buffer.head;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    okio.Segment segment2 = segment.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    long j2 = segment2.limit - segment2.pos;
                    if (j2 <= j) {
                        buffer.head = segment2.pop();
                        okio.SegmentPool.recycle(segment2);
                        j -= j2;
                    } else {
                        segment2.limit -= (int) j;
                        break;
                    }
                }
                setSegment$okio(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j3 = newSize - size;
                boolean z = true;
                while (j3 > 0) {
                    okio.Segment writableSegment$okio = buffer.writableSegment$okio(i);
                    int min = (int) java.lang.Math.min(j3, 8192 - writableSegment$okio.limit);
                    writableSegment$okio.limit += min;
                    j3 -= min;
                    if (z) {
                        setSegment$okio(writableSegment$okio);
                        this.offset = size;
                        this.data = writableSegment$okio.data;
                        this.start = writableSegment$okio.limit - min;
                        this.end = writableSegment$okio.limit;
                        i = 1;
                        z = false;
                    } else {
                        i = 1;
                    }
                }
            }
            buffer.setSize$okio(newSize);
            return size;
        }

        public final long expandBuffer(int minByteCount) {
            if (!(minByteCount > 0)) {
                throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("minByteCount <= 0: ", java.lang.Integer.valueOf(minByteCount)).toString());
            }
            if (!(minByteCount <= 8192)) {
                throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("minByteCount > Segment.SIZE: ", java.lang.Integer.valueOf(minByteCount)).toString());
            }
            okio.Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new java.lang.IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            okio.Segment writableSegment$okio = buffer.writableSegment$okio(minByteCount);
            int i = 8192 - writableSegment$okio.limit;
            writableSegment$okio.limit = 8192;
            long j = i;
            buffer.setSize$okio(size + j);
            setSegment$okio(writableSegment$okio);
            this.offset = size;
            this.data = writableSegment$okio.data;
            this.start = 8192 - i;
            this.end = 8192;
            return j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new java.lang.IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }
    }

    public final okio.Buffer copyTo(okio.Buffer out, long offset, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        okio._UtilKt.checkOffsetAndCount(size(), offset, byteCount);
        if (byteCount != 0) {
            out.setSize$okio(out.size() + byteCount);
            okio.Segment segment = this.head;
            while (true) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                if (offset < segment.limit - segment.pos) {
                    break;
                }
                offset -= segment.limit - segment.pos;
                segment = segment.next;
            }
            while (byteCount > 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                okio.Segment sharedCopy = segment.sharedCopy();
                sharedCopy.pos += (int) offset;
                sharedCopy.limit = java.lang.Math.min(sharedCopy.pos + ((int) byteCount), sharedCopy.limit);
                okio.Segment segment2 = out.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy.prev;
                    out.head = sharedCopy.next;
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    okio.Segment segment3 = segment2.prev;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    segment3.push(sharedCopy);
                }
                byteCount -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                offset = 0;
            }
        }
        return this;
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        if (segment2.limit < 8192 && segment2.owner) {
            size -= segment2.limit - segment2.pos;
        }
        return size;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.EOFException {
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        setSize$okio(size() - 1);
        if (i3 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public final byte getByte(long pos) {
        okio._UtilKt.checkOffsetAndCount(size(), pos, 1L);
        okio.Segment segment = this.head;
        if (segment == null) {
            okio.Segment segment2 = null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(null);
            return segment2.data[(int) ((segment2.pos + pos) - (-1))];
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + pos) - size)];
        }
        long j = 0;
        while (true) {
            long j2 = (segment.limit - segment.pos) + j;
            if (j2 > pos) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + pos) - j)];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j = j2;
        }
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.EOFException {
        if (size() < 2) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        setSize$okio(size() - 2);
        if (i4 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return (short) i5;
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.EOFException {
        if (size() < 4) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        setSize$okio(size() - 4);
        if (i8 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i8;
        }
        return i9;
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.EOFException {
        if (size() < 8) {
            throw new java.io.EOFException();
        }
        okio.Segment segment = this.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.data;
        long j = (bArr[i] & 255) << 56;
        long j2 = j | ((bArr[r6] & 255) << 48);
        long j3 = j2 | ((bArr[r1] & 255) << 40);
        int i3 = i + 1 + 1 + 1 + 1;
        long j4 = ((bArr[r6] & 255) << 32) | j3;
        long j5 = j4 | ((bArr[i3] & 255) << 24);
        long j6 = j5 | ((bArr[r8] & 255) << 16);
        long j7 = j6 | ((bArr[r1] & 255) << 8);
        int i4 = i3 + 1 + 1 + 1 + 1;
        long j8 = j7 | (bArr[r8] & 255);
        setSize$okio(size() - 8);
        if (i4 == i2) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return j8;
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.EOFException {
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        long j = -7;
        int i = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        do {
            okio.Segment segment = this.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                byte b2 = (byte) 48;
                if (b >= b2 && b <= ((byte) 57)) {
                    int i4 = b2 - b;
                    if (j2 < okio.internal._BufferKt.OVERFLOW_ZONE || (j2 == okio.internal._BufferKt.OVERFLOW_ZONE && i4 < j)) {
                        okio.Buffer writeByte = new okio.Buffer().writeDecimalLong(j2).writeByte((int) b);
                        if (!z) {
                            writeByte.readByte();
                        }
                        throw new java.lang.NumberFormatException(kotlin.jvm.internal.Intrinsics.stringPlus("Number too large: ", writeByte.readUtf8()));
                    }
                    j2 = (j2 * 10) + i4;
                } else {
                    if (b != ((byte) 45) || i != 0) {
                        z2 = true;
                        break;
                    }
                    j--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - i);
        if (i >= (z ? 2 : 1)) {
            return z ? j2 : -j2;
        }
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        throw new java.lang.NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + okio._UtilKt.toHexString(getByte(0L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098 A[EDGE_INSN: B:39:0x0098->B:36:0x0098 BREAK  A[LOOP:0: B:4:0x000d->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La2
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            okio.Segment r6 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L84
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L70
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L70
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.readUtf8()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            r1.<init>(r0)
            throw r1
        L70:
            if (r0 == 0) goto L74
            r1 = 1
            goto L84
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = okio._UtilKt.toHexString(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r0.<init>(r1)
            throw r0
        L84:
            if (r8 != r9) goto L90
            okio.Segment r7 = r6.pop()
            r15.head = r7
            okio.SegmentPool.recycle(r6)
            goto L92
        L90:
            r6.pos = r8
        L92:
            if (r1 != 0) goto L98
            okio.Segment r6 = r15.head
            if (r6 != 0) goto Ld
        L98:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.setSize$okio(r1)
            return r4
        La2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long byteCount) throws java.io.EOFException {
        if (!(byteCount >= 0 && byteCount <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("byteCount: ", java.lang.Long.valueOf(byteCount)).toString());
        }
        if (size() < byteCount) {
            throw new java.io.EOFException();
        }
        if (byteCount >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            okio.ByteString snapshot = snapshot((int) byteCount);
            skip(byteCount);
            return snapshot;
        }
        return new okio.ByteString(readByteArray(byteCount));
    }

    @Override // okio.BufferedSource
    public int select(okio.Options options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        int selectPrefix$default = okio.internal._BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer sink, long byteCount) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() < byteCount) {
            sink.write(this, size());
            throw new java.io.EOFException();
        }
        sink.write(this, byteCount);
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() throws java.io.EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return okio.internal._BufferKt.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long limit) throws java.io.EOFException {
        if (!(limit >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("limit < 0: ", java.lang.Long.valueOf(limit)).toString());
        }
        long j = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long indexOf = indexOf(b, 0L, j);
        if (indexOf != -1) {
            return okio.internal._BufferKt.readUtf8Line(this, indexOf);
        }
        if (j < size() && getByte(j - 1) == ((byte) 13) && getByte(j) == b) {
            return okio.internal._BufferKt.readUtf8Line(this, j);
        }
        okio.Buffer buffer = new okio.Buffer();
        copyTo(buffer, 0L, java.lang.Math.min(32, size()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(size(), limit) + " content=" + buffer.readByteString().hex() + kotlin.text.Typography.ellipsis);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.EOFException {
        int i;
        int i2;
        int i3;
        if (size() == 0) {
            throw new java.io.EOFException();
        }
        byte b = getByte(0L);
        boolean z = false;
        if ((b & 128) == 0) {
            i = b & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE;
            i2 = 1;
            i3 = 0;
        } else if ((b & 224) == 192) {
            i = b & com.oudmon.ble.base.communication.Constants.CMD_DISPLAY_TIME;
            i2 = 2;
            i3 = 128;
        } else if ((b & com.realsil.sdk.bbpro.params.Mmi.AU_MMI_START_ROLESWAP) == 224) {
            i = b & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & com.realsil.sdk.bbpro.params.Mmi.AU_MMI_AV_PAUSE) != 240) {
                skip(1L);
                return okio.Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (size() < j) {
            throw new java.io.EOFException("size < " + i2 + ": " + size() + " (to read code point prefixed 0x" + okio._UtilKt.toHexString(b) + ')');
        }
        if (1 < i2) {
            int i4 = 1;
            while (true) {
                int i5 = i4 + 1;
                long j2 = i4;
                byte b2 = getByte(j2);
                if ((b2 & com.realsil.sdk.bbpro.params.Mmi.AU_MMI_SD_PLAYBACK_SWITCH) != 128) {
                    skip(j2);
                    return okio.Utf8.REPLACEMENT_CODE_POINT;
                }
                i = (i << 6) | (b2 & okio.Utf8.REPLACEMENT_BYTE);
                if (i5 >= i2) {
                    break;
                }
                i4 = i5;
            }
        }
        skip(j);
        if (i > 1114111) {
            return okio.Utf8.REPLACEMENT_CODE_POINT;
        }
        if (55296 <= i && i <= 57343) {
            z = true;
        }
        return (!z && i >= i3) ? i : okio.Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long byteCount) throws java.io.EOFException {
        if (!(byteCount >= 0 && byteCount <= 2147483647L)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("byteCount: ", java.lang.Long.valueOf(byteCount)).toString());
        }
        if (size() < byteCount) {
            throw new java.io.EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] sink) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            i += read;
        }
    }

    @Override // okio.BufferedSource
    public int read(byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        okio._UtilKt.checkOffsetAndCount(sink.length, offset, byteCount);
        okio.Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = java.lang.Math.min(byteCount, segment.limit - segment.pos);
        kotlin.collections.ArraysKt.copyInto(segment.data, sink, offset, segment.pos, segment.pos + min);
        segment.pos += min;
        setSize$okio(size() - min);
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            okio.SegmentPool.recycle(segment);
        }
        return min;
    }

    public final void clear() {
        skip(size());
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) throws java.io.EOFException {
        while (byteCount > 0) {
            okio.Segment segment = this.head;
            if (segment == null) {
                throw new java.io.EOFException();
            }
            int min = (int) java.lang.Math.min(byteCount, segment.limit - segment.pos);
            long j = min;
            setSize$okio(size() - j);
            byteCount -= j;
            segment.pos += min;
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString byteString, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, offset, byteCount);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String string, int beginIndex, int endIndex) {
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (!(beginIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("beginIndex < 0: ", java.lang.Integer.valueOf(beginIndex)).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new java.lang.IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char charAt2 = string.charAt(beginIndex);
            if (charAt2 < 128) {
                okio.Segment writableSegment$okio = writableSegment$okio(1);
                byte[] bArr = writableSegment$okio.data;
                int i = writableSegment$okio.limit - beginIndex;
                int min = java.lang.Math.min(endIndex, 8192 - i);
                int i2 = beginIndex + 1;
                bArr[beginIndex + i] = (byte) charAt2;
                while (true) {
                    beginIndex = i2;
                    if (beginIndex >= min || (charAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i2 = beginIndex + 1;
                    bArr[beginIndex + i] = (byte) charAt;
                }
                int i3 = (i + beginIndex) - writableSegment$okio.limit;
                writableSegment$okio.limit += i3;
                setSize$okio(size() + i3);
            } else {
                if (charAt2 < 2048) {
                    okio.Segment writableSegment$okio2 = writableSegment$okio(2);
                    writableSegment$okio2.data[writableSegment$okio2.limit] = (byte) ((charAt2 >> 6) | 192);
                    writableSegment$okio2.data[writableSegment$okio2.limit + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit += 2;
                    setSize$okio(size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    okio.Segment writableSegment$okio3 = writableSegment$okio(3);
                    writableSegment$okio3.data[writableSegment$okio3.limit] = (byte) ((charAt2 >> '\f') | 224);
                    writableSegment$okio3.data[writableSegment$okio3.limit + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    writableSegment$okio3.data[writableSegment$okio3.limit + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit += 3;
                    setSize$okio(size() + 3);
                } else {
                    int i4 = beginIndex + 1;
                    char charAt3 = i4 < endIndex ? string.charAt(i4) : (char) 0;
                    if (charAt2 <= 56319) {
                        if (56320 <= charAt3 && charAt3 <= 57343) {
                            int i5 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            okio.Segment writableSegment$okio4 = writableSegment$okio(4);
                            writableSegment$okio4.data[writableSegment$okio4.limit] = (byte) ((i5 >> 18) | com.autonavi.amap.mapcore.tools.GlMapUtil.DEVICE_DISPLAY_DPI_MEDIAN);
                            writableSegment$okio4.data[writableSegment$okio4.limit + 1] = (byte) (((i5 >> 12) & 63) | 128);
                            writableSegment$okio4.data[writableSegment$okio4.limit + 2] = (byte) (((i5 >> 6) & 63) | 128);
                            writableSegment$okio4.data[writableSegment$okio4.limit + 3] = (byte) ((i5 & 63) | 128);
                            writableSegment$okio4.limit += 4;
                            setSize$okio(size() + 4);
                            beginIndex += 2;
                        }
                    }
                    writeByte(63);
                    beginIndex = i4;
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            okio.Segment writableSegment$okio = writableSegment$okio(2);
            writableSegment$okio.data[writableSegment$okio.limit] = (byte) ((codePoint >> 6) | 192);
            writableSegment$okio.data[writableSegment$okio.limit + 1] = (byte) ((codePoint & 63) | 128);
            writableSegment$okio.limit += 2;
            setSize$okio(size() + 2);
        } else {
            boolean z = false;
            if (55296 <= codePoint && codePoint <= 57343) {
                z = true;
            }
            if (z) {
                writeByte(63);
            } else if (codePoint < 65536) {
                okio.Segment writableSegment$okio2 = writableSegment$okio(3);
                writableSegment$okio2.data[writableSegment$okio2.limit] = (byte) ((codePoint >> 12) | 224);
                writableSegment$okio2.data[writableSegment$okio2.limit + 1] = (byte) (((codePoint >> 6) & 63) | 128);
                writableSegment$okio2.data[writableSegment$okio2.limit + 2] = (byte) ((codePoint & 63) | 128);
                writableSegment$okio2.limit += 3;
                setSize$okio(size() + 3);
            } else if (codePoint <= 1114111) {
                okio.Segment writableSegment$okio3 = writableSegment$okio(4);
                writableSegment$okio3.data[writableSegment$okio3.limit] = (byte) ((codePoint >> 18) | com.autonavi.amap.mapcore.tools.GlMapUtil.DEVICE_DISPLAY_DPI_MEDIAN);
                writableSegment$okio3.data[writableSegment$okio3.limit + 1] = (byte) (((codePoint >> 12) & 63) | 128);
                writableSegment$okio3.data[writableSegment$okio3.limit + 2] = (byte) (((codePoint >> 6) & 63) | 128);
                writableSegment$okio3.data[writableSegment$okio3.limit + 3] = (byte) ((codePoint & 63) | 128);
                writableSegment$okio3.limit += 4;
                setSize$okio(size() + 4);
            } else {
                throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Unexpected code point: 0x", okio._UtilKt.toHexString(codePoint)));
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = byteCount;
        okio._UtilKt.checkOffsetAndCount(source.length, offset, j);
        int i = byteCount + offset;
        while (offset < i) {
            okio.Segment writableSegment$okio = writableSegment$okio(1);
            int min = java.lang.Math.min(i - offset, 8192 - writableSegment$okio.limit);
            int i2 = offset + min;
            kotlin.collections.ArraysKt.copyInto(source, writableSegment$okio.data, writableSegment$okio.limit, offset, i2);
            writableSegment$okio.limit += min;
            offset = i2;
        }
        setSize$okio(size() + j);
        return this;
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source source) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.Source source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        while (byteCount > 0) {
            long read = source.read(this, byteCount);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            byteCount -= read;
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeByte(int b) {
        okio.Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        writableSegment$okio.limit = i + 1;
        bArr[i] = (byte) b;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShort(int s) {
        okio.Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i2] = (byte) (s & 255);
        writableSegment$okio.limit = i2 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeInt(int i) {
        okio.Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment$okio.limit = i5 + 1;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLong(long v) {
        okio.Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((v >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((v >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((v >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((v >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((v >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((v >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((v >>> 8) & 255);
        bArr[i8] = (byte) (v & 255);
        writableSegment$okio.limit = i8 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeDecimalLong(long v) {
        if (v == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i = 1;
        if (v < 0) {
            v = -v;
            if (v < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        }
        if (v >= 100000000) {
            i = v < 1000000000000L ? v < okhttp3.internal.connection.RealConnection.IDLE_CONNECTION_HEALTHY_NS ? v < 1000000000 ? 9 : 10 : v < 100000000000L ? 11 : 12 : v < 1000000000000000L ? v < 10000000000000L ? 13 : v < 100000000000000L ? 14 : 15 : v < 100000000000000000L ? v < 10000000000000000L ? 16 : 17 : v < 1000000000000000000L ? 18 : 19;
        } else if (v >= androidx.work.WorkRequest.MIN_BACKOFF_MILLIS) {
            i = v < 1000000 ? v < 100000 ? 5 : 6 : v < 10000000 ? 7 : 8;
        } else if (v >= 100) {
            i = v < 1000 ? 3 : 4;
        } else if (v >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        okio.Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit + i;
        while (v != 0) {
            long j = 10;
            i2--;
            bArr[i2] = okio.internal._BufferKt.getHEX_DIGIT_BYTES()[(int) (v % j)];
            v /= j;
        }
        if (z) {
            bArr[i2 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i;
        setSize$okio(size() + i);
        return this;
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeHexadecimalUnsignedLong(long v) {
        if (v == 0) {
            return writeByte(48);
        }
        long j = (v >>> 1) | v;
        long j2 = j | (j >>> 2);
        long j3 = j2 | (j2 >>> 4);
        long j4 = j3 | (j3 >>> 8);
        long j5 = j4 | (j4 >>> 16);
        long j6 = j5 | (j5 >>> 32);
        long j7 = j6 - ((j6 >>> 1) & 6148914691236517205L);
        long j8 = ((j7 >>> 2) & 3689348814741910323L) + (j7 & 3689348814741910323L);
        long j9 = ((j8 >>> 4) + j8) & 1085102592571150095L;
        long j10 = j9 + (j9 >>> 8);
        long j11 = j10 + (j10 >>> 16);
        int i = (int) ((((j11 & 63) + ((j11 >>> 32) & 63)) + 3) / 4);
        okio.Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (writableSegment$okio.limit + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = okio.internal._BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & v)];
            v >>>= 4;
        }
        writableSegment$okio.limit += i;
        setSize$okio(size() + i);
        return this;
    }

    public final okio.Segment writableSegment$okio(int minimumCapacity) {
        if (!(minimumCapacity >= 1 && minimumCapacity <= 8192)) {
            throw new java.lang.IllegalArgumentException("unexpected capacity".toString());
        }
        okio.Segment segment = this.head;
        if (segment == null) {
            okio.Segment take = okio.SegmentPool.take();
            this.head = take;
            take.prev = take;
            take.next = take;
            return take;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        okio.Segment segment2 = segment.prev;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
        return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(okio.SegmentPool.take()) : segment2;
    }

    @Override // okio.Sink
    public void write(okio.Buffer source, long byteCount) {
        okio.Segment segment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new java.lang.IllegalArgumentException("source == this".toString());
        }
        okio._UtilKt.checkOffsetAndCount(source.size(), 0L, byteCount);
        while (byteCount > 0) {
            okio.Segment segment2 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            int i = segment2.limit;
            kotlin.jvm.internal.Intrinsics.checkNotNull(source.head);
            if (byteCount < i - r2.pos) {
                okio.Segment segment3 = this.head;
                if (segment3 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                    segment = segment3.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((segment.limit + byteCount) - (segment.shared ? 0 : segment.pos) <= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        okio.Segment segment4 = source.head;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                        segment4.writeTo(segment, (int) byteCount);
                        source.setSize$okio(source.size() - byteCount);
                        setSize$okio(size() + byteCount);
                        return;
                    }
                }
                okio.Segment segment5 = source.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment5);
                source.head = segment5.split((int) byteCount);
            }
            okio.Segment segment6 = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment6);
            long j = segment6.limit - segment6.pos;
            source.head = segment6.pop();
            okio.Segment segment7 = this.head;
            if (segment7 == null) {
                this.head = segment6;
                segment6.prev = segment6;
                segment6.next = segment6.prev;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment7);
                okio.Segment segment8 = segment7.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment8);
                segment8.push(segment6).compact();
            }
            source.setSize$okio(source.size() - j);
            setSize$okio(size() + j);
            byteCount -= j;
        }
    }

    @Override // okio.Source
    public long read(okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("byteCount < 0: ", java.lang.Long.valueOf(byteCount)).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (byteCount > size()) {
            byteCount = size();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex, long toIndex) {
        int i;
        long j = fromIndex;
        long j2 = toIndex;
        boolean z = false;
        long j3 = 0;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > size()) {
            j2 = size();
        }
        long j4 = j2;
        if (j == j4) {
            return -1L;
        }
        okio.Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j < j) {
            j3 = size();
            while (j3 > j) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j3 -= segment.limit - segment.pos;
            }
            if (segment == null) {
                return -1L;
            }
            while (j3 < j4) {
                byte[] bArr = segment.data;
                int min = (int) java.lang.Math.min(segment.limit, (segment.pos + j4) - j3);
                i = (int) ((segment.pos + j) - j3);
                while (i < min) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j5 = (segment.limit - segment.pos) + j3;
            if (j5 > j) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j3 = j5;
        }
        if (segment == null) {
            return -1L;
        }
        while (j3 < j4) {
            byte[] bArr2 = segment.data;
            int min2 = (int) java.lang.Math.min(segment.limit, (segment.pos + j4) - j3);
            i = (int) ((segment.pos + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j = j3;
        }
        return -1L;
        return (i - segment.pos) + j3;
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString bytes, long fromIndex) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new java.lang.IllegalArgumentException("bytes is empty".toString());
        }
        long j = 0;
        if (!(fromIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("fromIndex < 0: ", java.lang.Long.valueOf(fromIndex)).toString());
        }
        okio.Segment segment = this.head;
        if (segment == null) {
        } else if (size() - fromIndex < fromIndex) {
            long size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            if (segment != null) {
                byte[] internalArray$okio = bytes.internalArray$okio();
                byte b = internalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - size2) + 1;
                okio.Segment segment2 = segment;
                long j2 = size;
                long j3 = fromIndex;
                while (j2 < size3) {
                    byte[] bArr = segment2.data;
                    long j4 = j3;
                    int min = (int) java.lang.Math.min(segment2.limit, (segment2.pos + size3) - j2);
                    int i = (int) ((segment2.pos + j4) - j2);
                    if (i < min) {
                        while (true) {
                            int i2 = i + 1;
                            if (bArr[i] == b && okio.internal._BufferKt.rangeEquals(segment2, i2, internalArray$okio, 1, size2)) {
                                return (i - segment2.pos) + j2;
                            }
                            if (i2 >= min) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    j2 += segment2.limit - segment2.pos;
                    segment2 = segment2.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                    j3 = j2;
                }
            }
        } else {
            while (true) {
                long j5 = (segment.limit - segment.pos) + j;
                if (j5 > fromIndex) {
                    break;
                }
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j = j5;
            }
            if (segment != null) {
                byte[] internalArray$okio2 = bytes.internalArray$okio();
                byte b2 = internalArray$okio2[0];
                int size4 = bytes.size();
                long size5 = (size() - size4) + 1;
                long j6 = j;
                long j7 = fromIndex;
                while (j6 < size5) {
                    byte[] bArr2 = segment.data;
                    long j8 = size5;
                    int min2 = (int) java.lang.Math.min(segment.limit, (segment.pos + size5) - j6);
                    int i3 = (int) ((segment.pos + j7) - j6);
                    if (i3 < min2) {
                        while (true) {
                            int i4 = i3 + 1;
                            if (bArr2[i3] == b2 && okio.internal._BufferKt.rangeEquals(segment, i4, internalArray$okio2, 1, size4)) {
                                return (i3 - segment.pos) + j6;
                            }
                            if (i4 >= min2) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    j6 += segment.limit - segment.pos;
                    segment = segment.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    j7 = j6;
                    size5 = j8;
                }
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString targetBytes, long fromIndex) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j = 0;
        if (!(fromIndex >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("fromIndex < 0: ", java.lang.Long.valueOf(fromIndex)).toString());
        }
        okio.Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            j = size();
            while (j > fromIndex) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                j -= segment.limit - segment.pos;
            }
            if (segment == null) {
                return -1L;
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (j < size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + fromIndex) - j);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        i2 = segment.pos;
                    }
                    j += segment.limit - segment.pos;
                    segment = segment.next;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                    fromIndex = j;
                }
                return -1L;
            }
            byte[] internalArray$okio = targetBytes.internalArray$okio();
            while (j < size()) {
                byte[] bArr2 = segment.data;
                i = (int) ((segment.pos + fromIndex) - j);
                int i4 = segment.limit;
                while (i < i4) {
                    byte b4 = bArr2[i];
                    int length = internalArray$okio.length;
                    int i5 = 0;
                    while (i5 < length) {
                        byte b5 = internalArray$okio[i5];
                        i5++;
                        if (b4 == b5) {
                            i2 = segment.pos;
                        }
                    }
                    i++;
                }
                j += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                fromIndex = j;
            }
            return -1L;
        }
        while (true) {
            long j2 = (segment.limit - segment.pos) + j;
            if (j2 > fromIndex) {
                break;
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            j = j2;
        }
        if (segment == null) {
            return -1L;
        }
        if (targetBytes.size() == 2) {
            byte b6 = targetBytes.getByte(0);
            byte b7 = targetBytes.getByte(1);
            while (j < size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + fromIndex) - j);
                int i6 = segment.limit;
                while (i < i6) {
                    byte b8 = bArr3[i];
                    if (b8 != b6 && b8 != b7) {
                        i++;
                    }
                    i2 = segment.pos;
                }
                j += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                fromIndex = j;
            }
            return -1L;
        }
        byte[] internalArray$okio2 = targetBytes.internalArray$okio();
        while (j < size()) {
            byte[] bArr4 = segment.data;
            i = (int) ((segment.pos + fromIndex) - j);
            int i7 = segment.limit;
            while (i < i7) {
                byte b9 = bArr4[i];
                int length2 = internalArray$okio2.length;
                int i8 = 0;
                while (i8 < length2) {
                    byte b10 = internalArray$okio2[i8];
                    i8++;
                    if (b9 == b10) {
                        i2 = segment.pos;
                    }
                }
                i++;
            }
            j += segment.limit - segment.pos;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            fromIndex = j;
        }
        return -1L;
        return (i - i2) + j;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, okio.ByteString bytes, int bytesOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        if (byteCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (getByte(i + offset) != bytes.getByte(i + bytesOffset)) {
                    return false;
                }
                if (i2 >= byteCount) {
                    break;
                }
                i = i2;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            if (!(other instanceof okio.Buffer)) {
                return false;
            }
            okio.Buffer buffer = (okio.Buffer) other;
            if (size() != buffer.size()) {
                return false;
            }
            if (size() != 0) {
                okio.Segment segment = this.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                okio.Segment segment2 = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                int i = segment.pos;
                int i2 = segment2.pos;
                long j = 0;
                while (j < size()) {
                    long min = java.lang.Math.min(segment.limit - i, segment2.limit - i2);
                    if (0 < min) {
                        long j2 = 0;
                        while (true) {
                            j2++;
                            int i3 = i + 1;
                            int i4 = i2 + 1;
                            if (segment.data[i] != segment2.data[i2]) {
                                return false;
                            }
                            if (j2 >= min) {
                                i = i3;
                                i2 = i4;
                                break;
                            }
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == segment.limit) {
                        segment = segment.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                        i = segment.pos;
                    }
                    if (i2 == segment2.limit) {
                        segment2 = segment2.next;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                        i2 = segment2.pos;
                    }
                    j += min;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        okio.Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        } while (segment != this.head);
        return i;
    }

    public final okio.Buffer copy() {
        okio.Buffer buffer = new okio.Buffer();
        if (size() != 0) {
            okio.Segment segment = this.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            okio.Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy.prev;
            for (okio.Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                okio.Segment segment3 = sharedCopy.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    public final okio.ByteString snapshot() {
        if (!(size() <= 2147483647L)) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.Intrinsics.stringPlus("size > Int.MAX_VALUE: ", java.lang.Long.valueOf(size())).toString());
        }
        return snapshot((int) size());
    }

    public final okio.ByteString snapshot(int byteCount) {
        if (byteCount == 0) {
            return okio.ByteString.EMPTY;
        }
        okio._UtilKt.checkOffsetAndCount(size(), 0L, byteCount);
        okio.Segment segment = this.head;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i2 += segment.limit - segment.pos;
            i3++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i3][];
        int[] iArr = new int[i3 * 2];
        okio.Segment segment2 = this.head;
        int i4 = 0;
        while (i < byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment2);
            bArr[i4] = segment2.data;
            i += segment2.limit - segment2.pos;
            iArr[i4] = java.lang.Math.min(i, byteCount);
            iArr[bArr.length + i4] = segment2.pos;
            segment2.shared = true;
            i4++;
            segment2 = segment2.next;
        }
        return new okio.SegmentedByteString(bArr, iArr);
    }
}
