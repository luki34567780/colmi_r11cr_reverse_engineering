package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class Parser {
    public static com.hp.hpl.sparta.Document parse(java.lang.String str, java.io.Reader reader) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseCharStream(str, reader, (com.hp.hpl.sparta.ParseLog) null, (java.lang.String) null, buildDocument);
        return buildDocument.getDocument();
    }

    public static com.hp.hpl.sparta.Document parse(java.lang.String str, java.io.Reader reader, com.hp.hpl.sparta.ParseLog parseLog) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseCharStream(str, reader, parseLog, (java.lang.String) null, buildDocument);
        return buildDocument.getDocument();
    }

    public static com.hp.hpl.sparta.Document parse(java.lang.String str) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return parse(str.toCharArray());
    }

    public static com.hp.hpl.sparta.Document parse(char[] cArr) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseCharStream("file:anonymous-string", cArr, (com.hp.hpl.sparta.ParseLog) null, (java.lang.String) null, buildDocument);
        return buildDocument.getDocument();
    }

    public static com.hp.hpl.sparta.Document parse(byte[] bArr) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseByteStream("file:anonymous-string", new java.io.ByteArrayInputStream(bArr), null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static com.hp.hpl.sparta.Document parse(java.lang.String str, java.io.Reader reader, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseCharStream(str, reader, parseLog, str2, buildDocument);
        return buildDocument.getDocument();
    }

    public static com.hp.hpl.sparta.Document parse(java.lang.String str, java.io.InputStream inputStream, com.hp.hpl.sparta.ParseLog parseLog) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseByteStream(str, inputStream, parseLog, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static com.hp.hpl.sparta.Document parse(java.lang.String str, java.io.InputStream inputStream) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseByteStream(str, inputStream, null, null, buildDocument);
        return buildDocument.getDocument();
    }

    public static com.hp.hpl.sparta.Document parse(java.lang.String str, java.io.InputStream inputStream, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.BuildDocument buildDocument = new com.hp.hpl.sparta.BuildDocument();
        new com.hp.hpl.sparta.ParseByteStream(str, inputStream, parseLog, str2, buildDocument);
        return buildDocument.getDocument();
    }

    public static void parse(java.lang.String str, java.io.Reader reader, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        new com.hp.hpl.sparta.ParseCharStream(str, reader, (com.hp.hpl.sparta.ParseLog) null, (java.lang.String) null, parseHandler);
    }

    public static void parse(java.lang.String str, java.io.Reader reader, com.hp.hpl.sparta.ParseLog parseLog, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        new com.hp.hpl.sparta.ParseCharStream(str, reader, parseLog, (java.lang.String) null, parseHandler);
    }

    public static void parse(java.lang.String str, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        parse(str.toCharArray(), parseHandler);
    }

    public static void parse(char[] cArr, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        new com.hp.hpl.sparta.ParseCharStream("file:anonymous-string", cArr, (com.hp.hpl.sparta.ParseLog) null, (java.lang.String) null, parseHandler);
    }

    public static void parse(byte[] bArr, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        new com.hp.hpl.sparta.ParseByteStream("file:anonymous-string", new java.io.ByteArrayInputStream(bArr), null, null, parseHandler);
    }

    public static void parse(java.lang.String str, java.io.InputStream inputStream, com.hp.hpl.sparta.ParseLog parseLog, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        new com.hp.hpl.sparta.ParseByteStream(str, inputStream, parseLog, null, parseHandler);
    }

    public static void parse(java.lang.String str, java.io.InputStream inputStream, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        new com.hp.hpl.sparta.ParseByteStream(str, inputStream, null, null, parseHandler);
    }

    public static void parse(java.lang.String str, java.io.InputStream inputStream, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        new com.hp.hpl.sparta.ParseByteStream(str, inputStream, parseLog, str2, parseHandler);
    }

    public static void parse(java.lang.String str, java.io.Reader reader, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
        new com.hp.hpl.sparta.ParseCharStream(str, reader, parseLog, str2, parseHandler);
    }
}
