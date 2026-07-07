package com.king.zxing.analyze;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ImageAnalyzer implements com.king.zxing.analyze.Analyzer {
    public abstract com.google.zxing.Result analyze(byte[] bArr, int i, int i2);

    @Override // com.king.zxing.analyze.Analyzer
    public com.google.zxing.Result analyze(androidx.camera.core.ImageProxy imageProxy, int i) {
        if (imageProxy.getFormat() == 35) {
            java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            if (i == 1) {
                byte[] bArr2 = new byte[remaining];
                for (int i2 = 0; i2 < height; i2++) {
                    for (int i3 = 0; i3 < width; i3++) {
                        bArr2[(((i3 * height) + height) - i2) - 1] = bArr[(i2 * width) + i3];
                    }
                }
                return analyze(bArr2, height, width);
            }
            return analyze(bArr, width, height);
        }
        com.king.zxing.util.LogUtils.w("imageFormat: " + imageProxy.getFormat());
        return null;
    }
}
