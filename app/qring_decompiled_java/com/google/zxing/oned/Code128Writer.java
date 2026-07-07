package com.google.zxing.oned;

/* loaded from: /tmp/dex/classes2.dex */
public final class Code128Writer extends com.google.zxing.oned.OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    private enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) throws com.google.zxing.WriterException {
        if (barcodeFormat != com.google.zxing.BarcodeFormat.CODE_128) {
            throw new java.lang.IllegalArgumentException("Can only encode CODE_128, but got ".concat(java.lang.String.valueOf(barcodeFormat)));
        }
        return super.encode(str, barcodeFormat, i, i2, map);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(java.lang.String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new java.lang.IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(java.lang.String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_A_CAN_USE_FLAG /* 241 */:
                case com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_B_CAN_USE_FLAG /* 242 */:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new java.lang.IllegalArgumentException("Bad character in input: ".concat(java.lang.String.valueOf(charAt)));
                    }
                    break;
            }
        }
        java.util.ArrayList<int[]> arrayList = new java.util.ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int chooseCode = chooseCode(str, i3, i5);
                int i8 = 100;
                if (chooseCode == i5) {
                    switch (str.charAt(i3)) {
                        case com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_A_CAN_USE_FLAG /* 241 */:
                            i8 = 102;
                            break;
                        case com.realsil.sdk.audioconnect.localplayback.LocalPlaybackConstants.BUFFER_B_CAN_USE_FLAG /* 242 */:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 != 101) {
                                    i8 = java.lang.Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = chooseCode;
                    } else if (chooseCode == 100) {
                        i7 = 104;
                    } else if (chooseCode != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = chooseCode;
                }
                arrayList.add(com.google.zxing.oned.Code128Reader.CODE_PATTERNS[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                arrayList.add(com.google.zxing.oned.Code128Reader.CODE_PATTERNS[i4 % 103]);
                arrayList.add(com.google.zxing.oned.Code128Reader.CODE_PATTERNS[106]);
                int i9 = 0;
                for (int[] iArr : arrayList) {
                    for (int i10 : iArr) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i += appendPattern(zArr, i, (int[]) it.next(), true);
                }
                return zArr;
            }
        }
    }

    private static com.google.zxing.oned.Code128Writer.CType findCType(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return com.google.zxing.oned.Code128Writer.CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return com.google.zxing.oned.Code128Writer.CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return com.google.zxing.oned.Code128Writer.CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT;
        }
        return com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS;
    }

    private static int chooseCode(java.lang.CharSequence charSequence, int i, int i2) {
        com.google.zxing.oned.Code128Writer.CType findCType;
        com.google.zxing.oned.Code128Writer.CType findCType2;
        char charAt;
        com.google.zxing.oned.Code128Writer.CType findCType3 = findCType(charSequence, i);
        if (findCType3 == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT) {
            return 100;
        }
        if (findCType3 == com.google.zxing.oned.Code128Writer.CType.UNCODABLE) {
            return (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) ? 100 : 101;
        }
        if (i2 == 99) {
            return 99;
        }
        if (i2 == 100) {
            if (findCType3 == com.google.zxing.oned.Code128Writer.CType.FNC_1 || (findCType = findCType(charSequence, i + 2)) == com.google.zxing.oned.Code128Writer.CType.UNCODABLE || findCType == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT) {
                return 100;
            }
            if (findCType == com.google.zxing.oned.Code128Writer.CType.FNC_1) {
                return findCType(charSequence, i + 3) == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS ? 99 : 100;
            }
            int i3 = i + 4;
            while (true) {
                findCType2 = findCType(charSequence, i3);
                if (findCType2 != com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) {
                    break;
                }
                i3 += 2;
            }
            return findCType2 == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT ? 100 : 99;
        }
        if (findCType3 == com.google.zxing.oned.Code128Writer.CType.FNC_1) {
            findCType3 = findCType(charSequence, i + 1);
        }
        return findCType3 == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS ? 99 : 100;
    }
}
