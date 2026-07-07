package com.google.zxing.datamatrix.decoder;

/* loaded from: /tmp/dex/classes2.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int i, byte[] bArr) {
        this.numDataCodewords = i;
        this.codewords = bArr;
    }

    static com.google.zxing.datamatrix.decoder.DataBlock[] getDataBlocks(byte[] bArr, com.google.zxing.datamatrix.decoder.Version version) {
        com.google.zxing.datamatrix.decoder.Version.ECBlocks eCBlocks = version.getECBlocks();
        com.google.zxing.datamatrix.decoder.Version.ECB[] eCBlocks2 = eCBlocks.getECBlocks();
        int i = 0;
        for (com.google.zxing.datamatrix.decoder.Version.ECB ecb : eCBlocks2) {
            i += ecb.getCount();
        }
        com.google.zxing.datamatrix.decoder.DataBlock[] dataBlockArr = new com.google.zxing.datamatrix.decoder.DataBlock[i];
        int i2 = 0;
        for (com.google.zxing.datamatrix.decoder.Version.ECB ecb2 : eCBlocks2) {
            int i3 = 0;
            while (i3 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                dataBlockArr[i2] = new com.google.zxing.datamatrix.decoder.DataBlock(dataCodewords, new byte[eCBlocks.getECCodewords() + dataCodewords]);
                i3++;
                i2++;
            }
        }
        int length = dataBlockArr[0].codewords.length - eCBlocks.getECCodewords();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                dataBlockArr[i7].codewords[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = version.getVersionNumber() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            dataBlockArr[i9].codewords[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = dataBlockArr[0].codewords.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                dataBlockArr[i11].codewords[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return dataBlockArr;
        }
        throw new java.lang.IllegalArgumentException();
    }

    int getNumDataCodewords() {
        return this.numDataCodewords;
    }

    byte[] getCodewords() {
        return this.codewords;
    }
}
