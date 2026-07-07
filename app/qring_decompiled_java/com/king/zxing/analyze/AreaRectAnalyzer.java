package com.king.zxing.analyze;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class AreaRectAnalyzer extends com.king.zxing.analyze.ImageAnalyzer {
    boolean isMultiDecode;
    private int mAreaRectHorizontalOffset;
    private float mAreaRectRatio;
    private int mAreaRectVerticalOffset;
    com.king.zxing.DecodeConfig mDecodeConfig;
    java.util.Map<com.google.zxing.DecodeHintType, ?> mHints;

    public abstract com.google.zxing.Result analyze(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6);

    public AreaRectAnalyzer(com.king.zxing.DecodeConfig decodeConfig) {
        this.isMultiDecode = true;
        this.mAreaRectRatio = 0.8f;
        this.mAreaRectHorizontalOffset = 0;
        this.mAreaRectVerticalOffset = 0;
        this.mDecodeConfig = decodeConfig;
        if (decodeConfig != null) {
            this.mHints = decodeConfig.getHints();
            this.isMultiDecode = decodeConfig.isMultiDecode();
            this.mAreaRectRatio = decodeConfig.getAreaRectRatio();
            this.mAreaRectHorizontalOffset = decodeConfig.getAreaRectHorizontalOffset();
            this.mAreaRectVerticalOffset = decodeConfig.getAreaRectVerticalOffset();
            return;
        }
        this.mHints = com.king.zxing.DecodeFormatManager.DEFAULT_HINTS;
    }

    @Override // com.king.zxing.analyze.ImageAnalyzer
    public com.google.zxing.Result analyze(byte[] bArr, int i, int i2) {
        com.king.zxing.DecodeConfig decodeConfig = this.mDecodeConfig;
        if (decodeConfig != null) {
            if (decodeConfig.isFullAreaScan()) {
                return analyze(bArr, i, i2, 0, 0, i, i2);
            }
            android.graphics.Rect analyzeAreaRect = this.mDecodeConfig.getAnalyzeAreaRect();
            if (analyzeAreaRect != null) {
                return analyze(bArr, i, i2, analyzeAreaRect.left, analyzeAreaRect.top, analyzeAreaRect.width(), analyzeAreaRect.height());
            }
        }
        int min = (int) (java.lang.Math.min(i, i2) * this.mAreaRectRatio);
        return analyze(bArr, i, i2, ((i - min) / 2) + this.mAreaRectHorizontalOffset, ((i2 - min) / 2) + this.mAreaRectVerticalOffset, min, min);
    }
}
