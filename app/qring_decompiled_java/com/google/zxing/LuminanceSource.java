package com.google.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class LuminanceSource {
    private final int height;
    private final int width;

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i, byte[] bArr);

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    protected LuminanceSource(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public com.google.zxing.LuminanceSource crop(int i, int i2, int i3, int i4) {
        throw new java.lang.UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public com.google.zxing.LuminanceSource invert() {
        return new com.google.zxing.InvertedLuminanceSource(this);
    }

    public com.google.zxing.LuminanceSource rotateCounterClockwise() {
        throw new java.lang.UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public com.google.zxing.LuminanceSource rotateCounterClockwise45() {
        throw new java.lang.UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final java.lang.String toString() {
        int i = this.width;
        byte[] bArr = new byte[i];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.height * (i + 1));
        for (int i2 = 0; i2 < this.height; i2++) {
            bArr = getRow(i2, bArr);
            for (int i3 = 0; i3 < this.width; i3++) {
                int i4 = bArr[i3] & 255;
                sb.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
