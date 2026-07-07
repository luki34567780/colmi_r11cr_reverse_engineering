package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class AbstractExpandedDecoder {
    private final com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder generalDecoder;
    private final com.google.zxing.common.BitArray information;

    public abstract java.lang.String parseInformation() throws com.google.zxing.NotFoundException, com.google.zxing.FormatException;

    AbstractExpandedDecoder(com.google.zxing.common.BitArray bitArray) {
        this.information = bitArray;
        this.generalDecoder = new com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder(bitArray);
    }

    protected final com.google.zxing.common.BitArray getInformation() {
        return this.information;
    }

    protected final com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder getGeneralDecoder() {
        return this.generalDecoder;
    }

    public static com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder createDecoder(com.google.zxing.common.BitArray bitArray) {
        if (bitArray.get(1)) {
            return new com.google.zxing.oned.rss.expanded.decoders.AI01AndOtherAIs(bitArray);
        }
        if (!bitArray.get(2)) {
            return new com.google.zxing.oned.rss.expanded.decoders.AnyAIDecoder(bitArray);
        }
        int extractNumericValueFromBitArray = com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder.extractNumericValueFromBitArray(bitArray, 1, 4);
        if (extractNumericValueFromBitArray == 4) {
            return new com.google.zxing.oned.rss.expanded.decoders.AI013103decoder(bitArray);
        }
        if (extractNumericValueFromBitArray == 5) {
            return new com.google.zxing.oned.rss.expanded.decoders.AI01320xDecoder(bitArray);
        }
        int extractNumericValueFromBitArray2 = com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder.extractNumericValueFromBitArray(bitArray, 1, 5);
        if (extractNumericValueFromBitArray2 == 12) {
            return new com.google.zxing.oned.rss.expanded.decoders.AI01392xDecoder(bitArray);
        }
        if (extractNumericValueFromBitArray2 == 13) {
            return new com.google.zxing.oned.rss.expanded.decoders.AI01393xDecoder(bitArray);
        }
        switch (com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder.extractNumericValueFromBitArray(bitArray, 1, 7)) {
            case 56:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "310", "11");
            case 57:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "320", "11");
            case 58:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "310", "13");
            case 59:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "320", "13");
            case 60:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "310", "15");
            case 61:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "320", "15");
            case 62:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "310", "17");
            case 63:
                return new com.google.zxing.oned.rss.expanded.decoders.AI013x0x1xDecoder(bitArray, "320", "17");
            default:
                throw new java.lang.IllegalStateException("unknown decoder: ".concat(java.lang.String.valueOf(bitArray)));
        }
    }
}
