package com.google.zxing.multi;

/* loaded from: /tmp/dex/classes2.dex */
public final class ByQuadrantReader implements com.google.zxing.Reader {
    private final com.google.zxing.Reader delegate;

    public ByQuadrantReader(com.google.zxing.Reader reader) {
        this.delegate = reader;
    }

    @Override // com.google.zxing.Reader
    public com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        int width = binaryBitmap.getWidth() / 2;
        int height = binaryBitmap.getHeight() / 2;
        try {
            try {
                try {
                    try {
                        return this.delegate.decode(binaryBitmap.crop(0, 0, width, height), map);
                    } catch (com.google.zxing.NotFoundException unused) {
                        int i = width / 2;
                        int i2 = height / 2;
                        com.google.zxing.Result decode = this.delegate.decode(binaryBitmap.crop(i, i2, width, height), map);
                        makeAbsolute(decode.getResultPoints(), i, i2);
                        return decode;
                    }
                } catch (com.google.zxing.NotFoundException unused2) {
                    com.google.zxing.Result decode2 = this.delegate.decode(binaryBitmap.crop(width, height, width, height), map);
                    makeAbsolute(decode2.getResultPoints(), width, height);
                    return decode2;
                }
            } catch (com.google.zxing.NotFoundException unused3) {
                com.google.zxing.Result decode3 = this.delegate.decode(binaryBitmap.crop(0, height, width, height), map);
                makeAbsolute(decode3.getResultPoints(), 0, height);
                return decode3;
            }
        } catch (com.google.zxing.NotFoundException unused4) {
            com.google.zxing.Result decode4 = this.delegate.decode(binaryBitmap.crop(width, 0, width, height), map);
            makeAbsolute(decode4.getResultPoints(), width, 0);
            return decode4;
        }
    }

    @Override // com.google.zxing.Reader
    public void reset() {
        this.delegate.reset();
    }

    private static void makeAbsolute(com.google.zxing.ResultPoint[] resultPointArr, int i, int i2) {
        if (resultPointArr != null) {
            for (int i3 = 0; i3 < resultPointArr.length; i3++) {
                com.google.zxing.ResultPoint resultPoint = resultPointArr[i3];
                resultPointArr[i3] = new com.google.zxing.ResultPoint(resultPoint.getX() + i, resultPoint.getY() + i2);
            }
        }
    }
}
