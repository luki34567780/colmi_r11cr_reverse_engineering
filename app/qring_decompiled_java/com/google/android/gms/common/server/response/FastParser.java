package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final com.google.android.gms.common.server.response.zai<java.lang.Integer> zag = new com.google.android.gms.common.server.response.zaa();
    private static final com.google.android.gms.common.server.response.zai<java.lang.Long> zah = new com.google.android.gms.common.server.response.zab();
    private static final com.google.android.gms.common.server.response.zai<java.lang.Float> zai = new com.google.android.gms.common.server.response.zac();
    private static final com.google.android.gms.common.server.response.zai<java.lang.Double> zaj = new com.google.android.gms.common.server.response.zad();
    private static final com.google.android.gms.common.server.response.zai<java.lang.Boolean> zak = new com.google.android.gms.common.server.response.zae();
    private static final com.google.android.gms.common.server.response.zai<java.lang.String> zal = new com.google.android.gms.common.server.response.zaf();
    private static final com.google.android.gms.common.server.response.zai<java.math.BigInteger> zam = new com.google.android.gms.common.server.response.zag();
    private static final com.google.android.gms.common.server.response.zai<java.math.BigDecimal> zan = new com.google.android.gms.common.server.response.zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2];
    private final java.lang.StringBuilder zar = new java.lang.StringBuilder(32);
    private final java.lang.StringBuilder zas = new java.lang.StringBuilder(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
    private final java.util.Stack<java.lang.Integer> zat = new java.util.Stack<>();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class ParseException extends java.lang.Exception {
        public ParseException(java.lang.String str) {
            super(str);
        }

        public ParseException(java.lang.String str, java.lang.Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(java.lang.Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L68
            r4 = 0
        L12:
            if (r4 >= r3) goto L60
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L31
            if (r11 == 0) goto L29
            r6 = 0
        L1f:
            if (r6 > 0) goto L29
            char r7 = r11[r6]
            if (r7 != r5) goto L26
            goto L31
        L26:
            int r6 = r6 + 1
            goto L1f
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L31:
            r6 = 34
            r7 = 1
            if (r5 != r6) goto L53
            if (r2 != 0) goto L5c
            r10.append(r9, r0, r4)
            r8.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r8.skip(r2)
            if (r1 == 0) goto L4e
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L4e:
            java.lang.String r8 = r10.toString()
            return r8
        L53:
            r6 = 92
            if (r5 != r6) goto L5c
            r1 = r2 ^ 1
            r2 = r1
            r1 = 1
            goto L5d
        L5c:
            r2 = 0
        L5d:
            int r4 = r4 + 1
            goto L12
        L60:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L68:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        if (bufferedReader.read(this.zao) == -1) {
            return (char) 0;
        }
        while (java.lang.Character.isWhitespace(this.zao[0])) {
            if (bufferedReader.read(this.zao) == -1) {
                return (char) 0;
            }
        }
        return this.zao[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return java.lang.Double.parseDouble(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0f;
        }
        return java.lang.Float.parseFloat(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        int i2;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
        }
        char c = cArr[0];
        int i3 = c == '-' ? com.bumptech.glide.request.target.Target.SIZE_ORIGINAL : -2147483647;
        int i4 = c == '-' ? 1 : 0;
        if (i4 < zam2) {
            i = i4 + 1;
            int digit = java.lang.Character.digit(cArr[i4], 10);
            if (digit < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            i2 = -digit;
        } else {
            i = i4;
            i2 = 0;
        }
        while (i < zam2) {
            int i5 = i + 1;
            int digit2 = java.lang.Character.digit(cArr[i], 10);
            if (digit2 < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            if (i2 < -214748364) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            int i6 = i2 * 10;
            if (i6 < i3 + digit2) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            i2 = i6 - digit2;
            i = i5;
        }
        if (i4 == 0) {
            return -i2;
        }
        if (i > 1) {
            return i2;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
    }

    private final int zam(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        char zai2 = zai(bufferedReader);
        if (zai2 == 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
        }
        if (zai2 == ',') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
        if (zai2 == '\"') {
            i = 0;
            boolean z = false;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (java.lang.Character.isISOControl(c)) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                }
                if (c == '\"') {
                    if (!z) {
                        bufferedReader.reset();
                        bufferedReader.skip(i + 1);
                        return i;
                    }
                } else if (c == '\\') {
                    z = !z;
                    i++;
                }
                z = false;
                i++;
            }
        } else {
            cArr[0] = zai2;
            i = 1;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c2 = cArr[i];
                if (c2 == '}' || c2 == ',' || java.lang.Character.isWhitespace(c2) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == 1024) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Absurdly long value");
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        long j;
        int i;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
        }
        char c = cArr[0];
        long j2 = c == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i2 = c == '-' ? 1 : 0;
        if (i2 < zam2) {
            i = i2 + 1;
            int digit = java.lang.Character.digit(cArr[i2], 10);
            if (digit < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            j = -digit;
        } else {
            j = 0;
            i = i2;
        }
        while (i < zam2) {
            int i3 = i + 1;
            int digit2 = java.lang.Character.digit(cArr[i], 10);
            if (digit2 < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            if (j < -922337203685477580L) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            long j3 = j * 10;
            long j4 = digit2;
            if (j3 < j2 + j4) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            j = j3 - j4;
            i = i3;
        }
        if (i2 == 0) {
            return -j;
        }
        if (i > 1) {
            return j;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zao(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final java.lang.String zap(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb, char[] cArr2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (zai2 != 'n') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    private final java.lang.String zaq(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            this.zat.push(3);
            java.lang.String zaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return zaA;
            }
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected key/value separator");
        }
        if (zai2 == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (zai2 == '}') {
            zaw(2);
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(zai2);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
    }

    private final java.lang.String zar(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        bufferedReader.mark(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
        char zai2 = zai(bufferedReader);
        int i = 1;
        if (zai2 == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
            }
            char c = this.zao[0];
            boolean z = false;
            do {
                if (c == '\"') {
                    if (z) {
                        c = '\"';
                        z = true;
                    }
                }
                z = c == '\\' ? !z : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
                }
                c = this.zao[0];
            } while (!java.lang.Character.isISOControl(c));
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
        }
        if (zai2 == ',') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
        }
        if (zai2 == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) != ']') {
                bufferedReader.reset();
                boolean z2 = false;
                loop1: while (true) {
                    boolean z3 = false;
                    while (i > 0) {
                        char zai3 = zai(bufferedReader);
                        if (zai3 == 0) {
                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing array");
                        }
                        if (java.lang.Character.isISOControl(zai3)) {
                            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading array");
                        }
                        if (zai3 == '\"') {
                            if (!z3) {
                                z2 = !z2;
                            }
                            zai3 = '\"';
                        }
                        if (zai3 == '[') {
                            if (!z2) {
                                i++;
                            }
                            zai3 = '[';
                        }
                        if (zai3 == ']' && !z2) {
                            i--;
                        }
                        if (zai3 == '\\' && z2) {
                            z3 = !z3;
                        }
                    }
                    zaw(5);
                    break loop1;
                }
            } else {
                zaw(5);
            }
        } else if (zai2 != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char zai4 = zai(bufferedReader);
            if (zai4 == '}') {
                zaw(1);
            } else {
                if (zai4 != '\"') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(18);
                    sb.append("Unexpected token ");
                    sb.append(zai4);
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
                zaw(1);
            }
        }
        char zai5 = zai(bufferedReader);
        if (zai5 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (zai5 == '}') {
            zaw(2);
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(18);
        sb2.append("Unexpected token ");
        sb2.append(zai5);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigDecimal zas(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new java.math.BigDecimal(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigInteger zat(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new java.math.BigInteger(new java.lang.String(this.zaq, 0, zam2));
    }

    private final <O> java.util.ArrayList<O> zau(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.zai<O> zaiVar) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 != '[') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of array");
        }
        this.zat.push(5);
        java.util.ArrayList<O> arrayList = new java.util.ArrayList<>();
        while (true) {
            bufferedReader.mark(com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
            char zai3 = zai(bufferedReader);
            if (zai3 == 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            if (zai3 != ',') {
                if (zai3 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends com.google.android.gms.common.server.response.FastJsonResponse> java.util.ArrayList<T> zav(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        java.util.ArrayList<T> arrayList = (java.util.ArrayList<T>) new java.util.ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return arrayList;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (zai2 != '{') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zai2);
            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
        }
        this.zat.push(1);
        while (true) {
            try {
                com.google.android.gms.common.server.response.FastJsonResponse zad2 = field.zad();
                if (!zaz(bufferedReader, zad2)) {
                    return arrayList;
                }
                arrayList.add(zad2);
                char zai3 = zai(bufferedReader);
                if (zai3 != ',') {
                    if (zai3 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(19);
                    sb2.append("Unexpected token: ");
                    sb2.append(zai3);
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
                }
                if (zai(bufferedReader) != '{') {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (java.lang.IllegalAccessException e) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
            } catch (java.lang.InstantiationException e2) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
            }
        }
    }

    private final void zaw(int i) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        if (this.zat.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i);
            sb.append(" but had empty stack");
            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
        }
        int intValue = this.zat.pop().intValue();
        if (intValue == i) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had ");
        sb2.append(intValue);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
    }

    private final void zax(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i);
            if (read == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            for (int i2 = 0; i2 < read; i2++) {
                if (cArr[i2 + i] != this.zap[i2]) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected character");
                }
            }
            i += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(java.io.BufferedReader bufferedReader, boolean z) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            if (z) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (zai2 == 'f') {
            zax(bufferedReader, z ? zae : zad);
            return false;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (zai2 == 't') {
            zax(bufferedReader, z ? zac : zab);
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(zai2);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zaz(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        java.util.HashMap hashMap;
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        java.lang.String zaq = zaq(bufferedReader);
        if (zaq == null) {
            zaw(1);
            return false;
        }
        while (zaq != null) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(zaq);
            if (field == null) {
                zaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i = field.zaa;
                switch (i) {
                    case 0:
                        if (!field.zab) {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                            break;
                        }
                    case 1:
                        if (!field.zab) {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                            break;
                        }
                    case 2:
                        if (!field.zab) {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                            break;
                        }
                    case 3:
                        if (!field.zab) {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                            break;
                        }
                    case 4:
                        if (!field.zab) {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                            break;
                        }
                    case 5:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                            break;
                        }
                    case 6:
                        if (!field.zab) {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                            break;
                        } else {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                            break;
                        }
                    case 7:
                        if (!field.zab) {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                            break;
                        }
                    case 8:
                        fastJsonResponse.zal(field, com.google.android.gms.common.util.Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        break;
                    case 9:
                        fastJsonResponse.zal(field, com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        break;
                    case 10:
                        char zai2 = zai(bufferedReader);
                        if (zai2 == 'n') {
                            zax(bufferedReader, zaa);
                            hashMap = null;
                        } else {
                            if (zai2 != '{') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            hashMap = new java.util.HashMap();
                            while (true) {
                                char zai3 = zai(bufferedReader);
                                if (zai3 == 0) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
                                }
                                if (zai3 == '\"') {
                                    java.lang.String zaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        java.lang.String valueOf = java.lang.String.valueOf(zaA);
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(valueOf.length() != 0 ? "No map value found for key ".concat(valueOf) : new java.lang.String("No map value found for key "));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        java.lang.String valueOf2 = java.lang.String.valueOf(zaA);
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(valueOf2.length() != 0 ? "Expected String value for key ".concat(valueOf2) : new java.lang.String("Expected String value for key "));
                                    }
                                    hashMap.put(zaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char zai4 = zai(bufferedReader);
                                    if (zai4 != ',') {
                                        if (zai4 != '}') {
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder(48);
                                            sb.append("Unexpected character while parsing string map: ");
                                            sb.append(zai4);
                                            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                                        }
                                        zaw(1);
                                    }
                                } else if (zai3 == '}') {
                                    zaw(1);
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, hashMap);
                        break;
                    case 11:
                        if (field.zab) {
                            char zai5 = zai(bufferedReader);
                            if (zai5 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                                break;
                            } else {
                                this.zat.push(5);
                                if (zai5 != '[') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                                break;
                            }
                        } else {
                            char zai6 = zai(bufferedReader);
                            if (zai6 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                                break;
                            } else {
                                this.zat.push(1);
                                if (zai6 != '{') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of object");
                                }
                                try {
                                    com.google.android.gms.common.server.response.FastJsonResponse zad2 = field.zad();
                                    zaz(bufferedReader, zad2);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, zad2);
                                    break;
                                } catch (java.lang.IllegalAccessException e) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
                                } catch (java.lang.InstantiationException e2) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
                                }
                            }
                        }
                    default:
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(30);
                        sb2.append("Invalid field type ");
                        sb2.append(i);
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
                }
                zaw(4);
                zaw(2);
                char zai7 = zai(bufferedReader);
                if (zai7 == ',') {
                    zaq = zaq(bufferedReader);
                } else {
                    if (zai7 != '}') {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(55);
                        sb3.append("Expected end of object or field separator, but found: ");
                        sb3.append(zai7);
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb3.toString());
                    }
                    zaq = null;
                }
            }
        }
        zaw(1);
        return true;
    }

    public void parse(java.io.InputStream inputStream, T t) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream), com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 == 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("No data to parse");
                }
                if (zai2 == '[') {
                    this.zat.push(5);
                    java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Object array response class must have a single Field");
                    }
                    com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (zai2 != '{') {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(zai2);
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t);
                }
                zaw(0);
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException(e);
            }
        } finally {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused) {
                android.util.Log.w("FastParser", "Failed to close reader while parsing.");
            }
        }
    }
}
