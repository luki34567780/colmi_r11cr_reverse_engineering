package com.google.zxing.aztec.encoder;

/* loaded from: /tmp/dex/classes2.dex */
final class State {
    static final com.google.zxing.aztec.encoder.State INITIAL_STATE = new com.google.zxing.aztec.encoder.State(com.google.zxing.aztec.encoder.Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final com.google.zxing.aztec.encoder.Token token;

    private State(com.google.zxing.aztec.encoder.Token token, int i, int i2, int i3) {
        this.token = token;
        this.mode = i;
        this.binaryShiftByteCount = i2;
        this.bitCount = i3;
    }

    int getMode() {
        return this.mode;
    }

    com.google.zxing.aztec.encoder.Token getToken() {
        return this.token;
    }

    int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    int getBitCount() {
        return this.bitCount;
    }

    com.google.zxing.aztec.encoder.State latchAndAppend(int i, int i2) {
        int i3 = this.bitCount;
        com.google.zxing.aztec.encoder.Token token = this.token;
        if (i != this.mode) {
            int i4 = com.google.zxing.aztec.encoder.HighLevelEncoder.LATCH_TABLE[this.mode][i];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            token = token.add(i5, i6);
            i3 += i6;
        }
        int i7 = i == 2 ? 4 : 5;
        return new com.google.zxing.aztec.encoder.State(token.add(i2, i7), i, 0, i3 + i7);
    }

    com.google.zxing.aztec.encoder.State shiftAndAppend(int i, int i2) {
        com.google.zxing.aztec.encoder.Token token = this.token;
        int i3 = this.mode == 2 ? 4 : 5;
        return new com.google.zxing.aztec.encoder.State(token.add(com.google.zxing.aztec.encoder.HighLevelEncoder.SHIFT_TABLE[this.mode][i], i3).add(i2, 5), this.mode, 0, this.bitCount + i3 + 5);
    }

    com.google.zxing.aztec.encoder.State addBinaryShiftChar(int i) {
        com.google.zxing.aztec.encoder.Token token = this.token;
        int i2 = this.mode;
        int i3 = this.bitCount;
        if (i2 == 4 || i2 == 2) {
            int i4 = com.google.zxing.aztec.encoder.HighLevelEncoder.LATCH_TABLE[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            token = token.add(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.binaryShiftByteCount;
        com.google.zxing.aztec.encoder.State state = new com.google.zxing.aztec.encoder.State(token, i2, this.binaryShiftByteCount + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i + 1) : state;
    }

    com.google.zxing.aztec.encoder.State endBinaryShift(int i) {
        int i2 = this.binaryShiftByteCount;
        return i2 == 0 ? this : new com.google.zxing.aztec.encoder.State(this.token.addBinaryShift(i - i2, i2), this.mode, 0, this.bitCount);
    }

    boolean isBetterThanOrEqualTo(com.google.zxing.aztec.encoder.State state) {
        int i;
        int i2 = this.bitCount + (com.google.zxing.aztec.encoder.HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i3 = state.binaryShiftByteCount;
        if (i3 > 0 && ((i = this.binaryShiftByteCount) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= state.bitCount;
    }

    com.google.zxing.common.BitArray toBitArray(byte[] bArr) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.google.zxing.aztec.encoder.Token token = endBinaryShift(bArr.length).token; token != null; token = token.getPrevious()) {
            linkedList.addFirst(token);
        }
        com.google.zxing.common.BitArray bitArray = new com.google.zxing.common.BitArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.google.zxing.aztec.encoder.Token) it.next()).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public java.lang.String toString() {
        return java.lang.String.format("%s bits=%d bytes=%d", com.google.zxing.aztec.encoder.HighLevelEncoder.MODE_NAMES[this.mode], java.lang.Integer.valueOf(this.bitCount), java.lang.Integer.valueOf(this.binaryShiftByteCount));
    }
}
