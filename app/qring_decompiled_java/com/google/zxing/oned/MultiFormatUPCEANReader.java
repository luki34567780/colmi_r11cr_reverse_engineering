package com.google.zxing.oned;

/* loaded from: /tmp/dex/classes2.dex */
public final class MultiFormatUPCEANReader extends com.google.zxing.oned.OneDReader {
    private final com.google.zxing.oned.UPCEANReader[] readers;

    public MultiFormatUPCEANReader(java.util.Map<com.google.zxing.DecodeHintType, ?> map) {
        java.util.Collection collection = map == null ? null : (java.util.Collection) map.get(com.google.zxing.DecodeHintType.POSSIBLE_FORMATS);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.BarcodeFormat.EAN_13)) {
                arrayList.add(new com.google.zxing.oned.EAN13Reader());
            } else if (collection.contains(com.google.zxing.BarcodeFormat.UPC_A)) {
                arrayList.add(new com.google.zxing.oned.UPCAReader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.EAN_8)) {
                arrayList.add(new com.google.zxing.oned.EAN8Reader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.UPC_E)) {
                arrayList.add(new com.google.zxing.oned.UPCEReader());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.google.zxing.oned.EAN13Reader());
            arrayList.add(new com.google.zxing.oned.EAN8Reader());
            arrayList.add(new com.google.zxing.oned.UPCEReader());
        }
        this.readers = (com.google.zxing.oned.UPCEANReader[]) arrayList.toArray(new com.google.zxing.oned.UPCEANReader[arrayList.size()]);
    }

    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        boolean z;
        int[] findStartGuardPattern = com.google.zxing.oned.UPCEANReader.findStartGuardPattern(bitArray);
        for (com.google.zxing.oned.UPCEANReader uPCEANReader : this.readers) {
            try {
                com.google.zxing.Result decodeRow = uPCEANReader.decodeRow(i, bitArray, findStartGuardPattern, map);
                boolean z2 = decodeRow.getBarcodeFormat() == com.google.zxing.BarcodeFormat.EAN_13 && decodeRow.getText().charAt(0) == '0';
                java.util.Collection collection = map == null ? null : (java.util.Collection) map.get(com.google.zxing.DecodeHintType.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(com.google.zxing.BarcodeFormat.UPC_A)) {
                    z = false;
                    if (z2 || !z) {
                        return decodeRow;
                    }
                    com.google.zxing.Result result = new com.google.zxing.Result(decodeRow.getText().substring(1), decodeRow.getRawBytes(), decodeRow.getResultPoints(), com.google.zxing.BarcodeFormat.UPC_A);
                    result.putAllMetadata(decodeRow.getResultMetadata());
                    return result;
                }
                z = true;
                if (z2) {
                }
                return decodeRow;
            } catch (com.google.zxing.ReaderException unused) {
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        for (com.google.zxing.oned.UPCEANReader uPCEANReader : this.readers) {
            uPCEANReader.reset();
        }
    }
}
