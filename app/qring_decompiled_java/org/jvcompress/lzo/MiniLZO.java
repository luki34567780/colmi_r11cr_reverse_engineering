package org.jvcompress.lzo;

/* loaded from: classes3.dex */
public final class MiniLZO implements org.jvcompress.lzo.LZOConstants {
    public static final int c0_last = 7;
    public static final int c0_literal = 3;
    public static final int c0_m3_m4_len = 5;
    public static final int c0_m3_m4_offset = 6;
    public static final int c0_match = 4;
    public static final int c0_top = 1;
    public static final int c0_try_match = 2;
    public static final int c_copy_match = 4;
    public static final int c_eof_found = 7;
    public static final int c_first_literal_run = 2;
    public static final int c_input_overrun = 8;
    public static final int c_lookbehind_overrun = 10;
    public static final int c_match = 3;
    public static final int c_match_done = 5;
    public static final int c_match_next = 6;
    public static final int c_output_overrun = 9;
    public static final int c_top_loop = 1;
    private static final boolean debug = false;

    private static final int U(byte b) {
        return b & 255;
    }

    public static void main(java.lang.String[] strArr) {
        int i = 0;
        int intValue = java.lang.Integer.getInteger("ZERO_FILL", 0).intValue();
        java.lang.String property = java.lang.System.getProperty("IFILE", "IFILE");
        try {
            java.io.File file = new java.io.File(java.lang.System.getProperty("OFILE", "IFILE"));
            long length = file.length();
            int i2 = (int) length;
            byte[] bArr = new byte[i2];
            java.io.File file2 = new java.io.File(property);
            byte[] bArr2 = new byte[(int) file2.length()];
            byte[] bArr3 = new byte[(int) file2.length()];
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(property);
            if (fileInputStream.read(bArr) > 0) {
                org.jvcompress.util.MInt mInt = new org.jvcompress.util.MInt();
                java.lang.System.out.println("Decompressing byte.length=" + length);
                lzo1x_decompress(bArr, i2, bArr2, mInt);
                java.lang.System.out.println("Got decompressed length:" + mInt.v);
                if (intValue > 0) {
                    java.lang.System.out.println("Doing zero fill check");
                    while (i < mInt.v) {
                        if (bArr2[i] != 0) {
                            throw new java.lang.AssertionError("Decompreesed values not matching to Zero @:" + i);
                        }
                        i++;
                    }
                    return;
                }
                fileInputStream2.read(bArr3);
                while (i < mInt.v) {
                    if (bArr2[i] != bArr3[i]) {
                        throw new java.lang.AssertionError("Decompreesed values not matching to Zero @:" + i);
                    }
                    i++;
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:155:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int _lzo1x_1_do_compress(byte[] r20, int r21, byte[] r22, org.jvcompress.util.MInt r23, int[] r24) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jvcompress.lzo.MiniLZO._lzo1x_1_do_compress(byte[], int, byte[], org.jvcompress.util.MInt, int[]):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[LOOP:0: B:12:0x0052->B:14:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[EDGE_INSN: B:15:0x0062->B:28:0x0062 BREAK  A[LOOP:0: B:12:0x0052->B:14:0x0060], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int lzo1x_1_compress(byte[] r5, int r6, byte[] r7, org.jvcompress.util.MInt r8, int[] r9) {
        /*
            r0 = 0
            r1 = 13
            if (r6 > r1) goto L8
            r9 = r6
            r1 = 0
            goto Lf
        L8:
            int r9 = _lzo1x_1_do_compress(r5, r6, r7, r8, r9)
            int r1 = r8.v
            int r1 = r1 + r0
        Lf:
            if (r9 <= 0) goto L62
            int r6 = r6 + r0
            int r6 = r6 - r9
            if (r1 != 0) goto L22
            r2 = 238(0xee, float:3.34E-43)
            if (r9 > r2) goto L22
            int r2 = r1 + 1
            int r3 = r9 + 17
            byte r3 = (byte) r3
            r7[r1] = r3
        L20:
            r1 = r2
            goto L52
        L22:
            r2 = 3
            if (r9 > r2) goto L2f
            int r2 = r1 + (-2)
            r3 = r7[r2]
            byte r4 = (byte) r9
            r3 = r3 | r4
            byte r3 = (byte) r3
            r7[r2] = r3
            goto L52
        L2f:
            r2 = 18
            if (r9 > r2) goto L3b
            int r2 = r1 + 1
            int r3 = r9 + (-3)
            byte r3 = (byte) r3
            r7[r1] = r3
            goto L20
        L3b:
            int r2 = r9 + (-18)
            int r3 = r1 + 1
            r7[r1] = r0
        L41:
            r1 = 255(0xff, float:3.57E-43)
            if (r2 <= r1) goto L4d
            int r2 = r2 + (-255)
            int r1 = r3 + 1
            r7[r3] = r0
            r3 = r1
            goto L41
        L4d:
            int r1 = r3 + 1
            byte r2 = (byte) r2
            r7[r3] = r2
        L52:
            int r2 = r1 + 1
            int r3 = r6 + 1
            r6 = r5[r6]
            r7[r1] = r6
            int r9 = r9 + (-1)
            r1 = r2
            if (r9 > 0) goto L60
            goto L62
        L60:
            r6 = r3
            goto L52
        L62:
            int r5 = r1 + 1
            r6 = 17
            r7[r1] = r6
            int r6 = r5 + 1
            r7[r5] = r0
            int r5 = r6 + 1
            r7[r6] = r0
            int r5 = r5 - r0
            r8.v = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jvcompress.lzo.MiniLZO.lzo1x_1_compress(byte[], int, byte[], org.jvcompress.util.MInt, int[]):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0192 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int lzo1x_decompress(byte[] r19, int r20, byte[] r21, org.jvcompress.util.MInt r22) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jvcompress.lzo.MiniLZO.lzo1x_decompress(byte[], int, byte[], org.jvcompress.util.MInt):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x032b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x032d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x032f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0331 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int lzo1x_decompress_safe(byte[] r21, int r22, byte[] r23, org.jvcompress.util.MInt r24) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jvcompress.lzo.MiniLZO.lzo1x_decompress_safe(byte[], int, byte[], org.jvcompress.util.MInt):int");
    }
}
