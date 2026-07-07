package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
final class ByteOrderedDataInputStream extends java.io.InputStream implements java.io.DataInput {
    private java.nio.ByteOrder mByteOrder;
    private final java.io.DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final java.nio.ByteOrder LITTLE_ENDIAN = java.nio.ByteOrder.LITTLE_ENDIAN;
    private static final java.nio.ByteOrder BIG_ENDIAN = java.nio.ByteOrder.BIG_ENDIAN;

    ByteOrderedDataInputStream(java.io.InputStream in) throws java.io.IOException {
        this(in, java.nio.ByteOrder.BIG_ENDIAN);
    }

    ByteOrderedDataInputStream(java.io.InputStream in, java.nio.ByteOrder byteOrder) throws java.io.IOException {
        this.mByteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(in);
        this.mDataInputStream = dataInputStream;
        int available = dataInputStream.available();
        this.mLength = available;
        this.mPosition = 0;
        dataInputStream.mark(available);
        this.mByteOrder = byteOrder;
    }

    ByteOrderedDataInputStream(byte[] bytes) throws java.io.IOException {
        this(new java.io.ByteArrayInputStream(bytes));
    }

    public void setByteOrder(java.nio.ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    public void seek(long byteCount) throws java.io.IOException {
        int i = this.mPosition;
        if (i > byteCount) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            byteCount -= i;
        }
        int i2 = (int) byteCount;
        if (skipBytes(i2) != i2) {
            throw new java.io.IOException("Couldn't seek up to the byteCount");
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.mDataInputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws java.io.IOException {
        int read = this.mDataInputStream.read(b, off, len);
        this.mPosition += read;
        return read;
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws java.io.IOException {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws java.io.IOException {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public char readChar() throws java.io.IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public java.lang.String readUTF() throws java.io.IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] buffer, int offset, int length) throws java.io.IOException {
        int i = this.mPosition + length;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new java.io.EOFException();
        }
        if (this.mDataInputStream.read(buffer, offset, length) != length) {
            throw new java.io.IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public void readFully(byte[] buffer) throws java.io.IOException {
        int length = this.mPosition + buffer.length;
        this.mPosition = length;
        if (length > this.mLength) {
            throw new java.io.EOFException();
        }
        if (this.mDataInputStream.read(buffer, 0, buffer.length) != buffer.length) {
            throw new java.io.IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public byte readByte() throws java.io.IOException {
        int i = this.mPosition + 1;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public short readShort() throws java.io.IOException {
        int i = this.mPosition + 2;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public int readInt() throws java.io.IOException {
        int i = this.mPosition + 4;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public int skipBytes(int byteCount) throws java.io.IOException {
        int min = java.lang.Math.min(byteCount, this.mLength - this.mPosition);
        int i = 0;
        while (i < min) {
            i += this.mDataInputStream.skipBytes(min - i);
        }
        this.mPosition += i;
        return i;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws java.io.IOException {
        int i = this.mPosition + 2;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    public long readUnsignedInt() throws java.io.IOException {
        return readInt() & 4294967295L;
    }

    @Override // java.io.DataInput
    public long readLong() throws java.io.IOException {
        int i = this.mPosition + 8;
        this.mPosition = i;
        if (i > this.mLength) {
            throw new java.io.EOFException();
        }
        int read = this.mDataInputStream.read();
        int read2 = this.mDataInputStream.read();
        int read3 = this.mDataInputStream.read();
        int read4 = this.mDataInputStream.read();
        int read5 = this.mDataInputStream.read();
        int read6 = this.mDataInputStream.read();
        int read7 = this.mDataInputStream.read();
        int read8 = this.mDataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new java.io.IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public void mark(int readlimit) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(readlimit);
        }
    }

    public int getLength() {
        return this.mLength;
    }
}
