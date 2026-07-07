package okio;

/* compiled from: FileHandle.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002()B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u000eH$J\b\u0010\u0016\u001a\u00020\u000eH$J(\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH$J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0011H$J\b\u0010\u001f\u001a\u00020\u0011H$J(\u0010 \u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH$J&\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bJ\u001e\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0011J \u0010#\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\u0016\u0010$\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0011J&\u0010&\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bJ\u001e\u0010&\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0011J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006*"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "readWrite", "", "(Z)V", "closed", "openStreamCount", "", "getReadWrite", "()Z", "appendingSink", "Lokio/Sink;", "close", "", "flush", "position", "", "sink", "source", "Lokio/Source;", "protectedClose", "protectedFlush", "protectedRead", "fileOffset", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "read", "Lokio/Buffer;", "readNoCloseCheck", "reposition", "resize", "write", "writeNoCloseCheck", "FileHandleSink", "FileHandleSource", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FileHandle implements java.io.Closeable {
    private boolean closed;
    private int openStreamCount;
    private final boolean readWrite;

    protected abstract void protectedClose() throws java.io.IOException;

    protected abstract void protectedFlush() throws java.io.IOException;

    protected abstract int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws java.io.IOException;

    protected abstract void protectedResize(long size) throws java.io.IOException;

    protected abstract long protectedSize() throws java.io.IOException;

    protected abstract void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws java.io.IOException;

    public FileHandle(boolean z) {
        this.readWrite = z;
    }

    public final boolean getReadWrite() {
        return this.readWrite;
    }

    public final void resize(long size) throws java.io.IOException {
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        protectedResize(size);
    }

    public final void write(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        protectedWrite(fileOffset, array, arrayOffset, byteCount);
    }

    public final void write(long fileOffset, okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        writeNoCloseCheck(fileOffset, source, byteCount);
    }

    public final void flush() throws java.io.IOException {
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        protectedFlush();
    }

    public static /* synthetic */ okio.Source source$default(okio.FileHandle fileHandle, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return fileHandle.source(j);
    }

    public final long position(okio.Source source) throws java.io.IOException {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof okio.buffer) {
            okio.buffer bufferVar = (okio.buffer) source;
            j = bufferVar.bufferField.size();
            source = bufferVar.source;
        } else {
            j = 0;
        }
        if (!((source instanceof okio.FileHandle.FileHandleSource) && ((okio.FileHandle.FileHandleSource) source).getFileHandle() == this)) {
            throw new java.lang.IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        okio.FileHandle.FileHandleSource fileHandleSource = (okio.FileHandle.FileHandleSource) source;
        if (!(!fileHandleSource.getClosed())) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        return fileHandleSource.getPosition() - j;
    }

    public final void reposition(okio.Source source, long position) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        boolean z = false;
        if (source instanceof okio.buffer) {
            okio.buffer bufferVar = (okio.buffer) source;
            okio.Source source2 = bufferVar.source;
            if (!((source2 instanceof okio.FileHandle.FileHandleSource) && ((okio.FileHandle.FileHandleSource) source2).getFileHandle() == this)) {
                throw new java.lang.IllegalArgumentException("source was not created by this FileHandle".toString());
            }
            okio.FileHandle.FileHandleSource fileHandleSource = (okio.FileHandle.FileHandleSource) source2;
            if (!(!fileHandleSource.getClosed())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            long size = bufferVar.bufferField.size();
            long position2 = position - (fileHandleSource.getPosition() - size);
            if (0 <= position2 && position2 < size) {
                z = true;
            }
            if (z) {
                bufferVar.skip(position2);
                return;
            } else {
                bufferVar.bufferField.clear();
                fileHandleSource.setPosition(position);
                return;
            }
        }
        if ((source instanceof okio.FileHandle.FileHandleSource) && ((okio.FileHandle.FileHandleSource) source).getFileHandle() == this) {
            z = true;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        okio.FileHandle.FileHandleSource fileHandleSource2 = (okio.FileHandle.FileHandleSource) source;
        if (!(!fileHandleSource2.getClosed())) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        fileHandleSource2.setPosition(position);
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileHandle fileHandle, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return fileHandle.sink(j);
    }

    public final okio.Sink sink(long fileOffset) throws java.io.IOException {
        if (!this.readWrite) {
            throw new java.lang.IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            this.openStreamCount++;
        }
        return new okio.FileHandle.FileHandleSink(this, fileOffset);
    }

    public final okio.Sink appendingSink() throws java.io.IOException {
        return sink(size());
    }

    public final long position(okio.Sink sink) throws java.io.IOException {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink instanceof okio.buffer) {
            okio.buffer bufferVar = (okio.buffer) sink;
            j = bufferVar.bufferField.size();
            sink = bufferVar.sink;
        } else {
            j = 0;
        }
        if (!((sink instanceof okio.FileHandle.FileHandleSink) && ((okio.FileHandle.FileHandleSink) sink).getFileHandle() == this)) {
            throw new java.lang.IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        okio.FileHandle.FileHandleSink fileHandleSink = (okio.FileHandle.FileHandleSink) sink;
        if (!(!fileHandleSink.getClosed())) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        return fileHandleSink.getPosition() + j;
    }

    public final void reposition(okio.Sink sink, long position) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z = false;
        if (sink instanceof okio.buffer) {
            okio.buffer bufferVar = (okio.buffer) sink;
            okio.Sink sink2 = bufferVar.sink;
            if ((sink2 instanceof okio.FileHandle.FileHandleSink) && ((okio.FileHandle.FileHandleSink) sink2).getFileHandle() == this) {
                z = true;
            }
            if (!z) {
                throw new java.lang.IllegalArgumentException("sink was not created by this FileHandle".toString());
            }
            okio.FileHandle.FileHandleSink fileHandleSink = (okio.FileHandle.FileHandleSink) sink2;
            if (!(!fileHandleSink.getClosed())) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            bufferVar.emit();
            fileHandleSink.setPosition(position);
            return;
        }
        if ((sink instanceof okio.FileHandle.FileHandleSink) && ((okio.FileHandle.FileHandleSink) sink).getFileHandle() == this) {
            z = true;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        okio.FileHandle.FileHandleSink fileHandleSink2 = (okio.FileHandle.FileHandleSink) sink;
        if (!(!fileHandleSink2.getClosed())) {
            throw new java.lang.IllegalStateException("closed".toString());
        }
        fileHandleSink2.setPosition(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long readNoCloseCheck(long fileOffset, okio.Buffer sink, long byteCount) {
        if (!(byteCount >= 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("byteCount < 0: ", java.lang.Long.valueOf(byteCount)).toString());
        }
        long j = fileOffset + byteCount;
        long j2 = fileOffset;
        while (true) {
            if (j2 >= j) {
                break;
            }
            okio.Segment writableSegment$okio = sink.writableSegment$okio(1);
            int protectedRead = protectedRead(j2, writableSegment$okio.data, writableSegment$okio.limit, (int) java.lang.Math.min(j - j2, 8192 - writableSegment$okio.limit));
            if (protectedRead == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    sink.head = writableSegment$okio.pop();
                    okio.SegmentPool.recycle(writableSegment$okio);
                }
                if (fileOffset == j2) {
                    return -1L;
                }
            } else {
                writableSegment$okio.limit += protectedRead;
                long j3 = protectedRead;
                j2 += j3;
                sink.setSize$okio(sink.size() + j3);
            }
        }
        return j2 - fileOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeNoCloseCheck(long fileOffset, okio.Buffer source, long byteCount) {
        okio._UtilKt.checkOffsetAndCount(source.size(), 0L, byteCount);
        long j = byteCount + fileOffset;
        while (fileOffset < j) {
            okio.Segment segment = source.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            int min = (int) java.lang.Math.min(j - fileOffset, segment.limit - segment.pos);
            protectedWrite(fileOffset, segment.data, segment.pos, min);
            segment.pos += min;
            long j2 = min;
            fileOffset += j2;
            source.setSize$okio(source.size() - j2);
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                okio.SegmentPool.recycle(segment);
            }
        }
    }

    /* compiled from: FileHandle.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", "", "flush", "timeout", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class FileHandleSink implements okio.Sink {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSink(okio.FileHandle fileHandle, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j;
        }

        public final okio.FileHandle getFileHandle() {
            return this.fileHandle;
        }

        public final long getPosition() {
            return this.position;
        }

        public final void setPosition(long j) {
            this.position = j;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // okio.Sink
        public void write(okio.Buffer source, long byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            if (!this.closed) {
                this.fileHandle.writeNoCloseCheck(this.position, source, byteCount);
                this.position += byteCount;
                return;
            }
            throw new java.lang.IllegalStateException("closed".toString());
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            this.fileHandle.protectedFlush();
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
            return okio.Timeout.NONE;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            synchronized (this.fileHandle) {
                okio.FileHandle fileHandle = getFileHandle();
                fileHandle.openStreamCount--;
                if (getFileHandle().openStreamCount == 0 && getFileHandle().closed) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    this.fileHandle.protectedClose();
                }
            }
        }
    }

    /* compiled from: FileHandle.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class FileHandleSource implements okio.Source {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSource(okio.FileHandle fileHandle, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j;
        }

        public final okio.FileHandle getFileHandle() {
            return this.fileHandle;
        }

        public final long getPosition() {
            return this.position;
        }

        public final void setPosition(long j) {
            this.position = j;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // okio.Source
        public long read(okio.Buffer sink, long byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
            if (!this.closed) {
                long readNoCloseCheck = this.fileHandle.readNoCloseCheck(this.position, sink, byteCount);
                if (readNoCloseCheck != -1) {
                    this.position += readNoCloseCheck;
                }
                return readNoCloseCheck;
            }
            throw new java.lang.IllegalStateException("closed".toString());
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
            return okio.Timeout.NONE;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            synchronized (this.fileHandle) {
                okio.FileHandle fileHandle = getFileHandle();
                fileHandle.openStreamCount--;
                if (getFileHandle().openStreamCount == 0 && getFileHandle().closed) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    this.fileHandle.protectedClose();
                }
            }
        }
    }

    public final int read(long fileOffset, byte[] array, int arrayOffset, int byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return protectedRead(fileOffset, array, arrayOffset, byteCount);
    }

    public final long read(long fileOffset, okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return readNoCloseCheck(fileOffset, sink, byteCount);
    }

    public final long size() throws java.io.IOException {
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return protectedSize();
    }

    public final okio.Source source(long fileOffset) throws java.io.IOException {
        synchronized (this) {
            if (!(!this.closed)) {
                throw new java.lang.IllegalStateException("closed".toString());
            }
            this.openStreamCount++;
        }
        return new okio.FileHandle.FileHandleSource(this, fileOffset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                return;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            protectedClose();
        }
    }
}
