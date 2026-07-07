package com.google.zxing.qrcode.decoder;

/* loaded from: /tmp/dex/classes2.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db A[LOOP:0: B:2:0x001e->B:25:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.zxing.common.DecoderResult decode(byte[] r17, com.google.zxing.qrcode.decoder.Version r18, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r19, java.util.Map<com.google.zxing.DecodeHintType, ?> r20) throws com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.DecodedBitStreamParser.decode(byte[], com.google.zxing.qrcode.decoder.Version, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):com.google.zxing.common.DecoderResult");
    }

    private static void decodeHanziSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        if (i * 13 > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = (readBits % 96) | ((readBits / 96) << 8);
            int i4 = i3 + (i3 < 959 ? 41377 : 42657);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new java.lang.String(bArr, com.google.zxing.common.StringUtils.GB2312));
        } catch (java.io.UnsupportedEncodingException unused) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
    }

    private static void decodeKanjiSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        if (i * 13 > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int readBits = bitSource.readBits(13);
            int i3 = (readBits % 192) | ((readBits / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new java.lang.String(bArr, com.google.zxing.common.StringUtils.SHIFT_JIS));
        } catch (java.io.UnsupportedEncodingException unused) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
    }

    private static void decodeByteSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i, com.google.zxing.common.CharacterSetECI characterSetECI, java.util.Collection<byte[]> collection, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.FormatException {
        java.lang.String name;
        if ((i << 3) > bitSource.available()) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) bitSource.readBits(8);
        }
        if (characterSetECI == null) {
            name = com.google.zxing.common.StringUtils.guessEncoding(bArr, map);
        } else {
            name = characterSetECI.name();
        }
        try {
            sb.append(new java.lang.String(bArr, name));
            collection.add(bArr);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
    }

    private static char toAlphaNumericChar(int i) throws com.google.zxing.FormatException {
        char[] cArr = ALPHANUMERIC_CHARS;
        if (i >= cArr.length) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        return cArr[i];
    }

    private static void decodeAlphanumericSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i, boolean z) throws com.google.zxing.FormatException {
        while (i > 1) {
            if (bitSource.available() < 11) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits = bitSource.readBits(11);
            sb.append(toAlphaNumericChar(readBits / 45));
            sb.append(toAlphaNumericChar(readBits % 45));
            i -= 2;
        }
        if (i == 1) {
            if (bitSource.available() < 6) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(bitSource.readBits(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void decodeNumericSegment(com.google.zxing.common.BitSource bitSource, java.lang.StringBuilder sb, int i) throws com.google.zxing.FormatException {
        while (i >= 3) {
            if (bitSource.available() < 10) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits = bitSource.readBits(10);
            if (readBits >= 1000) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits / 100));
            sb.append(toAlphaNumericChar((readBits / 10) % 10));
            sb.append(toAlphaNumericChar(readBits % 10));
            i -= 3;
        }
        if (i == 2) {
            if (bitSource.available() < 7) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits2 = bitSource.readBits(7);
            if (readBits2 >= 100) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits2 / 10));
            sb.append(toAlphaNumericChar(readBits2 % 10));
            return;
        }
        if (i == 1) {
            if (bitSource.available() < 4) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            int readBits3 = bitSource.readBits(4);
            if (readBits3 >= 10) {
                throw com.google.zxing.FormatException.getFormatInstance();
            }
            sb.append(toAlphaNumericChar(readBits3));
        }
    }

    private static int parseECIValue(com.google.zxing.common.BitSource bitSource) throws com.google.zxing.FormatException {
        int readBits = bitSource.readBits(8);
        if ((readBits & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) == 0) {
            return readBits & com.google.android.gms.internal.fitness.zzab.zzh;
        }
        if ((readBits & 192) == 128) {
            return bitSource.readBits(8) | ((readBits & 63) << 8);
        }
        if ((readBits & 224) == 192) {
            return bitSource.readBits(16) | ((readBits & 31) << 16);
        }
        throw com.google.zxing.FormatException.getFormatInstance();
    }
}
