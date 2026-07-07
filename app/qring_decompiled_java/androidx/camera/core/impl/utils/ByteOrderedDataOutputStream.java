package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
class ByteOrderedDataOutputStream extends java.io.FilterOutputStream {
    private java.nio.ByteOrder mByteOrder;
    final java.io.OutputStream mOutputStream;

    ByteOrderedDataOutputStream(java.io.OutputStream out, java.nio.ByteOrder byteOrder) {
        super(out);
        this.mOutputStream = out;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(java.nio.ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes) throws java.io.IOException {
        this.mOutputStream.write(bytes);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes, int offset, int length) throws java.io.IOException {
        this.mOutputStream.write(bytes, offset, length);
    }

    public void writeByte(int val) throws java.io.IOException {
        this.mOutputStream.write(val);
    }

    public void writeShort(short val) throws java.io.IOException {
        if (this.mByteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((val >>> 0) & 255);
            this.mOutputStream.write((val >>> 8) & 255);
        } else if (this.mByteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((val >>> 8) & 255);
            this.mOutputStream.write((val >>> 0) & 255);
        }
    }

    public void writeInt(int val) throws java.io.IOException {
        if (this.mByteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((val >>> 0) & 255);
            this.mOutputStream.write((val >>> 8) & 255);
            this.mOutputStream.write((val >>> 16) & 255);
            this.mOutputStream.write((val >>> 24) & 255);
            return;
        }
        if (this.mByteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((val >>> 24) & 255);
            this.mOutputStream.write((val >>> 16) & 255);
            this.mOutputStream.write((val >>> 8) & 255);
            this.mOutputStream.write((val >>> 0) & 255);
        }
    }

    public void writeUnsignedShort(int val) throws java.io.IOException {
        writeShort((short) val);
    }

    public void writeUnsignedInt(long val) throws java.io.IOException {
        writeInt((int) val);
    }
}
