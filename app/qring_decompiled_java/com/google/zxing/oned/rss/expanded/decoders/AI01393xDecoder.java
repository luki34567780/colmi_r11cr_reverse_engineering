package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /tmp/dex/classes2.dex */
final class AI01393xDecoder extends com.google.zxing.oned.rss.expanded.decoders.AI01decoder {
    private static final int FIRST_THREE_DIGITS_SIZE = 10;
    private static final int HEADER_SIZE = 8;
    private static final int LAST_DIGIT_SIZE = 2;

    AI01393xDecoder(com.google.zxing.common.BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public java.lang.String parseInformation() throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        if (getInformation().getSize() < 48) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        encodeCompressedGtin(sb, 8);
        int extractNumericValueFromBitArray = getGeneralDecoder().extractNumericValueFromBitArray(48, 2);
        sb.append("(393");
        sb.append(extractNumericValueFromBitArray);
        sb.append(')');
        int extractNumericValueFromBitArray2 = getGeneralDecoder().extractNumericValueFromBitArray(50, 10);
        if (extractNumericValueFromBitArray2 / 100 == 0) {
            sb.append('0');
        }
        if (extractNumericValueFromBitArray2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(extractNumericValueFromBitArray2);
        sb.append(getGeneralDecoder().decodeGeneralPurposeField(60, null).getNewString());
        return sb.toString();
    }
}
