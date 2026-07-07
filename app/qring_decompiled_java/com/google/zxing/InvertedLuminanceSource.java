package com.google.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public final class InvertedLuminanceSource extends com.google.zxing.LuminanceSource {
    private final com.google.zxing.LuminanceSource delegate;

    public InvertedLuminanceSource(com.google.zxing.LuminanceSource luminanceSource) {
        super(luminanceSource.getWidth(), luminanceSource.getHeight());
        this.delegate = luminanceSource;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i, byte[] bArr) {
        byte[] row = this.delegate.getRow(i, bArr);
        int width = getWidth();
        for (int i2 = 0; i2 < width; i2++) {
            row[i2] = (byte) (255 - (row[i2] & 255));
        }
        return row;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        byte[] matrix = this.delegate.getMatrix();
        int width = getWidth() * getHeight();
        byte[] bArr = new byte[width];
        for (int i = 0; i < width; i++) {
            bArr[i] = (byte) (255 - (matrix[i] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return this.delegate.isCropSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public com.google.zxing.LuminanceSource crop(int i, int i2, int i3, int i4) {
        return new com.google.zxing.InvertedLuminanceSource(this.delegate.crop(i, i2, i3, i4));
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isRotateSupported() {
        return this.delegate.isRotateSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public com.google.zxing.LuminanceSource invert() {
        return this.delegate;
    }

    @Override // com.google.zxing.LuminanceSource
    public com.google.zxing.LuminanceSource rotateCounterClockwise() {
        return new com.google.zxing.InvertedLuminanceSource(this.delegate.rotateCounterClockwise());
    }

    @Override // com.google.zxing.LuminanceSource
    public com.google.zxing.LuminanceSource rotateCounterClockwise45() {
        return new com.google.zxing.InvertedLuminanceSource(this.delegate.rotateCounterClockwise45());
    }
}
