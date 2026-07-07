package com.google.zxing.oned;

/* loaded from: /tmp/dex/classes2.dex */
final class UPCEANExtensionSupport {
    private static final int[] EXTENSION_START_PATTERN = {1, 1, 2};
    private final com.google.zxing.oned.UPCEANExtension2Support twoSupport = new com.google.zxing.oned.UPCEANExtension2Support();
    private final com.google.zxing.oned.UPCEANExtension5Support fiveSupport = new com.google.zxing.oned.UPCEANExtension5Support();

    UPCEANExtensionSupport() {
    }

    com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, int i2) throws com.google.zxing.NotFoundException {
        int[] findGuardPattern = com.google.zxing.oned.UPCEANReader.findGuardPattern(bitArray, i2, false, EXTENSION_START_PATTERN);
        try {
            return this.fiveSupport.decodeRow(i, bitArray, findGuardPattern);
        } catch (com.google.zxing.ReaderException unused) {
            return this.twoSupport.decodeRow(i, bitArray, findGuardPattern);
        }
    }
}
