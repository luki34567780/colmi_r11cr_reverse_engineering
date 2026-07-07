package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
class ParseByteStream implements com.hp.hpl.sparta.ParseSource {
    private com.hp.hpl.sparta.ParseCharStream parseSource_;

    public ParseByteStream(java.lang.String str, java.io.InputStream inputStream, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.ParseLog parseLog2 = parseLog == null ? DEFAULT_LOG : parseLog;
        if (!inputStream.markSupported()) {
            throw new java.lang.Error("Precondition violation: the InputStream passed to ParseByteStream must support mark");
        }
        inputStream.mark(MAXLOOKAHEAD);
        byte[] bArr = new byte[4];
        java.lang.String guessEncoding = str2 == null ? guessEncoding(str, bArr, inputStream.read(bArr), parseLog2) : str2;
        try {
            inputStream.reset();
            try {
                this.parseSource_ = new com.hp.hpl.sparta.ParseCharStream(str, new java.io.InputStreamReader(inputStream, fixEncoding(guessEncoding)), parseLog2, guessEncoding, parseHandler);
            } catch (java.io.IOException unused) {
                parseLog2.note("Problem reading with assumed encoding of " + guessEncoding + " so restarting with euc-jp", str, 1);
                inputStream.reset();
                try {
                    this.parseSource_ = new com.hp.hpl.sparta.ParseCharStream(str, new java.io.InputStreamReader(inputStream, fixEncoding("euc-jp")), parseLog2, (java.lang.String) null, parseHandler);
                } catch (java.io.UnsupportedEncodingException unused2) {
                    throw new com.hp.hpl.sparta.ParseException(parseLog2, str, 1, 0, "euc-jp", "\"euc-jp\" is not a supported encoding");
                }
            }
        } catch (com.hp.hpl.sparta.EncodingMismatchException e) {
            java.lang.String declaredEncoding = e.getDeclaredEncoding();
            parseLog2.note("Encoding declaration of " + declaredEncoding + " is different that assumed " + guessEncoding + " so restarting the parsing with the new encoding", str, 1);
            inputStream.reset();
            try {
                this.parseSource_ = new com.hp.hpl.sparta.ParseCharStream(str, new java.io.InputStreamReader(inputStream, fixEncoding(declaredEncoding)), parseLog2, (java.lang.String) null, parseHandler);
            } catch (java.io.UnsupportedEncodingException unused3) {
                throw new com.hp.hpl.sparta.ParseException(parseLog2, str, 1, 0, declaredEncoding, "\"" + declaredEncoding + "\" is not a supported encoding");
            }
        }
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public java.lang.String toString() {
        return this.parseSource_.toString();
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public java.lang.String getSystemId() {
        return this.parseSource_.getSystemId();
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public int getLineNumber() {
        return this.parseSource_.getLineNumber();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String guessEncoding(java.lang.String r5, byte[] r6, int r7, com.hp.hpl.sparta.ParseLog r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hp.hpl.sparta.ParseByteStream.guessEncoding(java.lang.String, byte[], int, com.hp.hpl.sparta.ParseLog):java.lang.String");
    }

    private static java.lang.String hex(byte b) {
        java.lang.String hexString = java.lang.Integer.toHexString(b);
        int length = hexString.length();
        if (length != 1) {
            return length != 2 ? hexString.substring(hexString.length() - 2) : hexString;
        }
        return "0" + hexString;
    }

    private static boolean equals(byte[] bArr, int i) {
        return bArr[0] == ((byte) (i >>> 24)) && bArr[1] == ((byte) ((i >>> 16) & 255)) && bArr[2] == ((byte) ((i >>> 8) & 255)) && bArr[3] == ((byte) (i & 255));
    }

    private static boolean equals(byte[] bArr, short s) {
        return bArr[0] == ((byte) (s >>> 8)) && bArr[1] == ((byte) (s & 255));
    }

    private static java.lang.String fixEncoding(java.lang.String str) {
        return str.toLowerCase().equals("utf8") ? "UTF-8" : str;
    }
}
