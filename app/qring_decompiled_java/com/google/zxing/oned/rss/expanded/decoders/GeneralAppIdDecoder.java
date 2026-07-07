package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /tmp/dex/classes2.dex */
final class GeneralAppIdDecoder {
    private final com.google.zxing.common.BitArray information;
    private final com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState current = new com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState();
    private final java.lang.StringBuilder buffer = new java.lang.StringBuilder();

    GeneralAppIdDecoder(com.google.zxing.common.BitArray bitArray) {
        this.information = bitArray;
    }

    java.lang.String decodeAllCodes(java.lang.StringBuilder sb, int i) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        java.lang.String str = null;
        while (true) {
            com.google.zxing.oned.rss.expanded.decoders.DecodedInformation decodeGeneralPurposeField = decodeGeneralPurposeField(i, str);
            java.lang.String parseFieldsInGeneralPurpose = com.google.zxing.oned.rss.expanded.decoders.FieldParser.parseFieldsInGeneralPurpose(decodeGeneralPurposeField.getNewString());
            if (parseFieldsInGeneralPurpose != null) {
                sb.append(parseFieldsInGeneralPurpose);
            }
            java.lang.String valueOf = decodeGeneralPurposeField.isRemaining() ? java.lang.String.valueOf(decodeGeneralPurposeField.getRemainingValue()) : null;
            if (i != decodeGeneralPurposeField.getNewPosition()) {
                i = decodeGeneralPurposeField.getNewPosition();
                str = valueOf;
            } else {
                return sb.toString();
            }
        }
    }

    private boolean isStillNumeric(int i) {
        if (i + 7 > this.information.getSize()) {
            return i + 4 <= this.information.getSize();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.information.get(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.information.get(i3);
            }
        }
    }

    private com.google.zxing.oned.rss.expanded.decoders.DecodedNumeric decodeNumeric(int i) throws com.google.zxing.FormatException {
        int i2 = i + 7;
        if (i2 > this.information.getSize()) {
            int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 4);
            if (extractNumericValueFromBitArray == 0) {
                return new com.google.zxing.oned.rss.expanded.decoders.DecodedNumeric(this.information.getSize(), 10, 10);
            }
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedNumeric(this.information.getSize(), extractNumericValueFromBitArray - 1, 10);
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 7) - 8;
        return new com.google.zxing.oned.rss.expanded.decoders.DecodedNumeric(i2, extractNumericValueFromBitArray2 / 11, extractNumericValueFromBitArray2 % 11);
    }

    int extractNumericValueFromBitArray(int i, int i2) {
        return extractNumericValueFromBitArray(this.information, i, i2);
    }

    static int extractNumericValueFromBitArray(com.google.zxing.common.BitArray bitArray, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (bitArray.get(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    com.google.zxing.oned.rss.expanded.decoders.DecodedInformation decodeGeneralPurposeField(int i, java.lang.String str) throws com.google.zxing.FormatException {
        this.buffer.setLength(0);
        if (str != null) {
            this.buffer.append(str);
        }
        this.current.setPosition(i);
        com.google.zxing.oned.rss.expanded.decoders.DecodedInformation parseBlocks = parseBlocks();
        if (parseBlocks != null && parseBlocks.isRemaining()) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedInformation(this.current.getPosition(), this.buffer.toString(), parseBlocks.getRemainingValue());
        }
        return new com.google.zxing.oned.rss.expanded.decoders.DecodedInformation(this.current.getPosition(), this.buffer.toString());
    }

    private com.google.zxing.oned.rss.expanded.decoders.DecodedInformation parseBlocks() throws com.google.zxing.FormatException {
        com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult parseNumericBlock;
        boolean isFinished;
        do {
            int position = this.current.getPosition();
            if (this.current.isAlpha()) {
                parseNumericBlock = parseAlphaBlock();
                isFinished = parseNumericBlock.isFinished();
            } else if (this.current.isIsoIec646()) {
                parseNumericBlock = parseIsoIec646Block();
                isFinished = parseNumericBlock.isFinished();
            } else {
                parseNumericBlock = parseNumericBlock();
                isFinished = parseNumericBlock.isFinished();
            }
            if (!(position != this.current.getPosition()) && !isFinished) {
                break;
            }
        } while (!isFinished);
        return parseNumericBlock.getDecodedInformation();
    }

    private com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult parseNumericBlock() throws com.google.zxing.FormatException {
        com.google.zxing.oned.rss.expanded.decoders.DecodedInformation decodedInformation;
        while (isStillNumeric(this.current.getPosition())) {
            com.google.zxing.oned.rss.expanded.decoders.DecodedNumeric decodeNumeric = decodeNumeric(this.current.getPosition());
            this.current.setPosition(decodeNumeric.getNewPosition());
            if (decodeNumeric.isFirstDigitFNC1()) {
                if (decodeNumeric.isSecondDigitFNC1()) {
                    decodedInformation = new com.google.zxing.oned.rss.expanded.decoders.DecodedInformation(this.current.getPosition(), this.buffer.toString());
                } else {
                    decodedInformation = new com.google.zxing.oned.rss.expanded.decoders.DecodedInformation(this.current.getPosition(), this.buffer.toString(), decodeNumeric.getSecondDigit());
                }
                return new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(decodedInformation, true);
            }
            this.buffer.append(decodeNumeric.getFirstDigit());
            if (decodeNumeric.isSecondDigitFNC1()) {
                return new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(new com.google.zxing.oned.rss.expanded.decoders.DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeNumeric.getSecondDigit());
        }
        if (isNumericToAlphaNumericLatch(this.current.getPosition())) {
            this.current.setAlpha();
            this.current.incrementPosition(4);
        }
        return new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(false);
    }

    private com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult parseIsoIec646Block() throws com.google.zxing.FormatException {
        while (isStillIsoIec646(this.current.getPosition())) {
            com.google.zxing.oned.rss.expanded.decoders.DecodedChar decodeIsoIec646 = decodeIsoIec646(this.current.getPosition());
            this.current.setPosition(decodeIsoIec646.getNewPosition());
            if (decodeIsoIec646.isFNC1()) {
                return new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(new com.google.zxing.oned.rss.expanded.decoders.DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeIsoIec646.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setAlpha();
        }
        return new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(false);
    }

    private com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult parseAlphaBlock() {
        while (isStillAlpha(this.current.getPosition())) {
            com.google.zxing.oned.rss.expanded.decoders.DecodedChar decodeAlphanumeric = decodeAlphanumeric(this.current.getPosition());
            this.current.setPosition(decodeAlphanumeric.getNewPosition());
            if (decodeAlphanumeric.isFNC1()) {
                return new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(new com.google.zxing.oned.rss.expanded.decoders.DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeAlphanumeric.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setIsoIec646();
        }
        return new com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult(false);
    }

    private boolean isStillIsoIec646(int i) {
        int extractNumericValueFromBitArray;
        if (i + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray2 >= 5 && extractNumericValueFromBitArray2 < 16) {
            return true;
        }
        if (i + 7 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray3 = extractNumericValueFromBitArray(i, 7);
        if (extractNumericValueFromBitArray3 < 64 || extractNumericValueFromBitArray3 >= 116) {
            return i + 8 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 8)) >= 232 && extractNumericValueFromBitArray < 253;
        }
        return true;
    }

    private com.google.zxing.oned.rss.expanded.decoders.DecodedChar decodeIsoIec646(int i) throws com.google.zxing.FormatException {
        char c;
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 5, '$');
        }
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 5, (char) ((extractNumericValueFromBitArray + 48) - 5));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 7);
        if (extractNumericValueFromBitArray2 >= 64 && extractNumericValueFromBitArray2 < 90) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 7, (char) (extractNumericValueFromBitArray2 + 1));
        }
        if (extractNumericValueFromBitArray2 >= 90 && extractNumericValueFromBitArray2 < 116) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 7, (char) (extractNumericValueFromBitArray2 + 7));
        }
        switch (extractNumericValueFromBitArray(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_A_CAN_USE_FLAG /* 241 */:
                c = ',';
                break;
            case com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_B_CAN_USE_FLAG /* 242 */:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case com.luck.picture.lib.utils.AnimUtils.DURATION /* 250 */:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw com.google.zxing.FormatException.getFormatInstance();
        }
        return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 8, c);
    }

    private boolean isStillAlpha(int i) {
        int extractNumericValueFromBitArray;
        if (i + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray2 < 5 || extractNumericValueFromBitArray2 >= 16) {
            return i + 6 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 6)) >= 16 && extractNumericValueFromBitArray < 63;
        }
        return true;
    }

    private com.google.zxing.oned.rss.expanded.decoders.DecodedChar decodeAlphanumeric(int i) {
        char c;
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 5, '$');
        }
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 5, (char) ((extractNumericValueFromBitArray + 48) - 5));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i, 6);
        if (extractNumericValueFromBitArray2 >= 32 && extractNumericValueFromBitArray2 < 58) {
            return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 6, (char) (extractNumericValueFromBitArray2 + 33));
        }
        switch (extractNumericValueFromBitArray2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new java.lang.IllegalStateException("Decoding invalid alphanumeric value: ".concat(java.lang.String.valueOf(extractNumericValueFromBitArray2)));
        }
        return new com.google.zxing.oned.rss.expanded.decoders.DecodedChar(i + 6, c);
    }

    private boolean isAlphaTo646ToAlphaLatch(int i) {
        int i2;
        if (i + 1 > this.information.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.information.getSize(); i3++) {
            if (i3 == 2) {
                if (!this.information.get(i + 2)) {
                    return false;
                }
            } else if (this.information.get(i2)) {
                return false;
            }
        }
        return true;
    }

    private boolean isAlphaOr646ToNumericLatch(int i) {
        int i2 = i + 3;
        if (i2 > this.information.getSize()) {
            return false;
        }
        while (i < i2) {
            if (this.information.get(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int i) {
        int i2;
        if (i + 1 > this.information.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.information.getSize(); i3++) {
            if (this.information.get(i2)) {
                return false;
            }
        }
        return true;
    }
}
