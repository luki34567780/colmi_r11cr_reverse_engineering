package com.king.zxing.analyze;

/* loaded from: /tmp/dex/classes2.dex */
public class QRCodeAnalyzer extends com.king.zxing.analyze.BarcodeFormatAnalyzer {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCodeAnalyzer() {
        this((com.king.zxing.DecodeConfig) null);
    }

    public QRCodeAnalyzer(java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> map) {
        this(new com.king.zxing.DecodeConfig().setHints(map));
    }

    public QRCodeAnalyzer(com.king.zxing.DecodeConfig decodeConfig) {
        super(decodeConfig);
    }

    @Override // com.king.zxing.analyze.BarcodeFormatAnalyzer
    public com.google.zxing.Reader createReader() {
        return new com.google.zxing.qrcode.QRCodeReader();
    }
}
