package org.jvcompress.lzo;

/* loaded from: classes3.dex */
public class Min1Comp {
    private static final int IN_LEN = 1048576;
    private static final int OUT_LEN = 2097152;

    private static void clearDict(int[] iArr) {
        java.util.Arrays.fill(iArr, 0);
    }

    private static java.lang.String R(long j, long j2, long j3) {
        long j4 = j + 1;
        return ", millis:" + j4 + ", MB/sec:" + (((1000 * j2) / j4) / 1000000) + ", ratio:" + (((j3 + 1) * 100) / j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x032e, code lost:
    
        throw new java.lang.AssertionError(r10 + r5 + r0 + ")  Decompreesed values not matching to Zero @:" + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x035c, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void main(java.lang.String[] r35) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jvcompress.lzo.Min1Comp.main(java.lang.String[]):void");
    }

    private static void fillPartillyRandom(int i, byte[] bArr, java.util.Random random, boolean z) {
        int i2 = 0;
        do {
            int nextInt = z ? random.nextInt(10) : 1;
            byte nextInt2 = (byte) random.nextInt(i);
            int i3 = 0;
            while (i3 < nextInt && i2 < bArr.length) {
                bArr[i2] = nextInt2;
                i3++;
                i2++;
            }
        } while (i2 < bArr.length);
    }
}
