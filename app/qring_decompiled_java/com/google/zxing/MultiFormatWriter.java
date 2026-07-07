package com.google.zxing;

/* loaded from: /tmp/dex/classes2.dex */
public final class MultiFormatWriter implements com.google.zxing.Writer {
    @Override // com.google.zxing.Writer
    public com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2) throws com.google.zxing.WriterException {
        return encode(str, barcodeFormat, i, i2, null);
    }

    /* renamed from: com.google.zxing.MultiFormatWriter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$BarcodeFormat;

        static {
            int[] iArr = new int[com.google.zxing.BarcodeFormat.values().length];
            $SwitchMap$com$google$zxing$BarcodeFormat = iArr;
            try {
                iArr[com.google.zxing.BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.ITF.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$zxing$BarcodeFormat[com.google.zxing.BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.Writer
    public com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) throws com.google.zxing.WriterException {
        com.google.zxing.Writer eAN8Writer;
        switch (com.google.zxing.MultiFormatWriter.AnonymousClass1.$SwitchMap$com$google$zxing$BarcodeFormat[barcodeFormat.ordinal()]) {
            case 1:
                eAN8Writer = new com.google.zxing.oned.EAN8Writer();
                break;
            case 2:
                eAN8Writer = new com.google.zxing.oned.UPCEWriter();
                break;
            case 3:
                eAN8Writer = new com.google.zxing.oned.EAN13Writer();
                break;
            case 4:
                eAN8Writer = new com.google.zxing.oned.UPCAWriter();
                break;
            case 5:
                eAN8Writer = new com.google.zxing.qrcode.QRCodeWriter();
                break;
            case 6:
                eAN8Writer = new com.google.zxing.oned.Code39Writer();
                break;
            case 7:
                eAN8Writer = new com.google.zxing.oned.Code93Writer();
                break;
            case 8:
                eAN8Writer = new com.google.zxing.oned.Code128Writer();
                break;
            case 9:
                eAN8Writer = new com.google.zxing.oned.ITFWriter();
                break;
            case 10:
                eAN8Writer = new com.google.zxing.pdf417.PDF417Writer();
                break;
            case 11:
                eAN8Writer = new com.google.zxing.oned.CodaBarWriter();
                break;
            case 12:
                eAN8Writer = new com.google.zxing.datamatrix.DataMatrixWriter();
                break;
            case 13:
                eAN8Writer = new com.google.zxing.aztec.AztecWriter();
                break;
            default:
                throw new java.lang.IllegalArgumentException("No encoder available for format ".concat(java.lang.String.valueOf(barcodeFormat)));
        }
        return eAN8Writer.encode(str, barcodeFormat, i, i2, map);
    }
}
