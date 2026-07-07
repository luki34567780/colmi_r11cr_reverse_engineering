package com.google.zxing.oned;

/* loaded from: /tmp/dex/classes2.dex */
public final class MultiFormatOneDReader extends com.google.zxing.oned.OneDReader {
    private final com.google.zxing.oned.OneDReader[] readers;

    public MultiFormatOneDReader(java.util.Map<com.google.zxing.DecodeHintType, ?> map) {
        java.util.Collection collection = map == null ? null : (java.util.Collection) map.get(com.google.zxing.DecodeHintType.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(com.google.zxing.DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.BarcodeFormat.EAN_13) || collection.contains(com.google.zxing.BarcodeFormat.UPC_A) || collection.contains(com.google.zxing.BarcodeFormat.EAN_8) || collection.contains(com.google.zxing.BarcodeFormat.UPC_E)) {
                arrayList.add(new com.google.zxing.oned.MultiFormatUPCEANReader(map));
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.CODE_39)) {
                arrayList.add(new com.google.zxing.oned.Code39Reader(z));
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.CODE_93)) {
                arrayList.add(new com.google.zxing.oned.Code93Reader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.CODE_128)) {
                arrayList.add(new com.google.zxing.oned.Code128Reader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.ITF)) {
                arrayList.add(new com.google.zxing.oned.ITFReader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.CODABAR)) {
                arrayList.add(new com.google.zxing.oned.CodaBarReader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.RSS_14)) {
                arrayList.add(new com.google.zxing.oned.rss.RSS14Reader());
            }
            if (collection.contains(com.google.zxing.BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new com.google.zxing.oned.rss.expanded.RSSExpandedReader());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.google.zxing.oned.MultiFormatUPCEANReader(map));
            arrayList.add(new com.google.zxing.oned.Code39Reader());
            arrayList.add(new com.google.zxing.oned.CodaBarReader());
            arrayList.add(new com.google.zxing.oned.Code93Reader());
            arrayList.add(new com.google.zxing.oned.Code128Reader());
            arrayList.add(new com.google.zxing.oned.ITFReader());
            arrayList.add(new com.google.zxing.oned.rss.RSS14Reader());
            arrayList.add(new com.google.zxing.oned.rss.expanded.RSSExpandedReader());
        }
        this.readers = (com.google.zxing.oned.OneDReader[]) arrayList.toArray(new com.google.zxing.oned.OneDReader[arrayList.size()]);
    }

    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        for (com.google.zxing.oned.OneDReader oneDReader : this.readers) {
            try {
                return oneDReader.decodeRow(i, bitArray, map);
            } catch (com.google.zxing.ReaderException unused) {
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        for (com.google.zxing.oned.OneDReader oneDReader : this.readers) {
            oneDReader.reset();
        }
    }
}
