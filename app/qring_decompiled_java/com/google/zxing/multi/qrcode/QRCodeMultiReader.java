package com.google.zxing.multi.qrcode;

/* loaded from: /tmp/dex/classes2.dex */
public final class QRCodeMultiReader extends com.google.zxing.qrcode.QRCodeReader implements com.google.zxing.multi.MultipleBarcodeReader {
    private static final com.google.zxing.Result[] EMPTY_RESULT_ARRAY = new com.google.zxing.Result[0];
    private static final com.google.zxing.ResultPoint[] NO_POINTS = new com.google.zxing.ResultPoint[0];

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public com.google.zxing.Result[] decodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public com.google.zxing.Result[] decodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.zxing.common.DetectorResult detectorResult : new com.google.zxing.multi.qrcode.detector.MultiDetector(binaryBitmap.getBlackMatrix()).detectMulti(map)) {
            try {
                com.google.zxing.common.DecoderResult decode = getDecoder().decode(detectorResult.getBits(), map);
                com.google.zxing.ResultPoint[] points = detectorResult.getPoints();
                if (decode.getOther() instanceof com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData) {
                    ((com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData) decode.getOther()).applyMirroredCorrection(points);
                }
                com.google.zxing.Result result = new com.google.zxing.Result(decode.getText(), decode.getRawBytes(), points, com.google.zxing.BarcodeFormat.QR_CODE);
                java.util.List<byte[]> byteSegments = decode.getByteSegments();
                if (byteSegments != null) {
                    result.putMetadata(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS, byteSegments);
                }
                java.lang.String eCLevel = decode.getECLevel();
                if (eCLevel != null) {
                    result.putMetadata(com.google.zxing.ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
                }
                if (decode.hasStructuredAppend()) {
                    result.putMetadata(com.google.zxing.ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, java.lang.Integer.valueOf(decode.getStructuredAppendSequenceNumber()));
                    result.putMetadata(com.google.zxing.ResultMetadataType.STRUCTURED_APPEND_PARITY, java.lang.Integer.valueOf(decode.getStructuredAppendParity()));
                }
                arrayList.add(result);
            } catch (com.google.zxing.ReaderException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return EMPTY_RESULT_ARRAY;
        }
        java.util.List<com.google.zxing.Result> processStructuredAppend = processStructuredAppend(arrayList);
        return (com.google.zxing.Result[]) processStructuredAppend.toArray(new com.google.zxing.Result[processStructuredAppend.size()]);
    }

    private static java.util.List<com.google.zxing.Result> processStructuredAppend(java.util.List<com.google.zxing.Result> list) {
        boolean z;
        java.util.Iterator<com.google.zxing.Result> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (it.next().getResultMetadata().containsKey(com.google.zxing.ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                z = true;
                break;
            }
        }
        if (!z) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<com.google.zxing.Result> arrayList2 = new java.util.ArrayList();
        for (com.google.zxing.Result result : list) {
            arrayList.add(result);
            if (result.getResultMetadata().containsKey(com.google.zxing.ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(result);
            }
        }
        java.util.Collections.sort(arrayList2, new com.google.zxing.multi.qrcode.QRCodeMultiReader.SAComparator());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        int i2 = 0;
        for (com.google.zxing.Result result2 : arrayList2) {
            sb.append(result2.getText());
            i += result2.getRawBytes().length;
            if (result2.getResultMetadata().containsKey(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS)) {
                java.util.Iterator it2 = ((java.lang.Iterable) result2.getResultMetadata().get(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS)).iterator();
                while (it2.hasNext()) {
                    i2 += ((byte[]) it2.next()).length;
                }
            }
        }
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        for (com.google.zxing.Result result3 : arrayList2) {
            java.lang.System.arraycopy(result3.getRawBytes(), 0, bArr, i3, result3.getRawBytes().length);
            i3 += result3.getRawBytes().length;
            if (result3.getResultMetadata().containsKey(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS)) {
                for (byte[] bArr3 : (java.lang.Iterable) result3.getResultMetadata().get(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS)) {
                    java.lang.System.arraycopy(bArr3, 0, bArr2, i4, bArr3.length);
                    i4 += bArr3.length;
                }
            }
        }
        com.google.zxing.Result result4 = new com.google.zxing.Result(sb.toString(), bArr, NO_POINTS, com.google.zxing.BarcodeFormat.QR_CODE);
        if (i2 > 0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(bArr2);
            result4.putMetadata(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS, arrayList3);
        }
        arrayList.add(result4);
        return arrayList;
    }

    private static final class SAComparator implements java.io.Serializable, java.util.Comparator<com.google.zxing.Result> {
        private SAComparator() {
        }

        @Override // java.util.Comparator
        public int compare(com.google.zxing.Result result, com.google.zxing.Result result2) {
            return java.lang.Integer.compare(((java.lang.Integer) result.getResultMetadata().get(com.google.zxing.ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)).intValue(), ((java.lang.Integer) result2.getResultMetadata().get(com.google.zxing.ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)).intValue());
        }
    }
}
