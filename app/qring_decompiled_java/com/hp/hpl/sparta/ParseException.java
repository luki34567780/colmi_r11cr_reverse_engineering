package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class ParseException extends java.lang.Exception {
    private java.lang.Throwable cause_;
    private int lineNumber_;

    public ParseException(java.lang.String str) {
        super(str);
        this.lineNumber_ = -1;
        this.cause_ = null;
    }

    public ParseException(java.lang.String str, java.lang.Throwable th) {
        super(str + " " + th);
        this.lineNumber_ = -1;
        this.cause_ = null;
        this.cause_ = th;
    }

    public ParseException(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        super(toMessage(str, i, i2, str2, str3));
        this.lineNumber_ = -1;
        this.cause_ = null;
        this.lineNumber_ = i;
    }

    public ParseException(com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        this(str, i, i2, str2, str3);
        parseLog.error(str3, str, i);
    }

    public ParseException(com.hp.hpl.sparta.ParseCharStream parseCharStream, java.lang.String str) {
        this(parseCharStream.getLog(), parseCharStream.getSystemId(), parseCharStream.getLineNumber(), parseCharStream.getLastCharRead(), parseCharStream.getHistory(), str);
    }

    public ParseException(com.hp.hpl.sparta.ParseCharStream parseCharStream, char c, char c2) {
        this(parseCharStream, "got '" + c + "' instead of expected '" + c2 + "'");
    }

    public ParseException(com.hp.hpl.sparta.ParseCharStream parseCharStream, char c, char[] cArr) {
        this(parseCharStream, "got '" + c + "' instead of " + toString(cArr));
    }

    public ParseException(com.hp.hpl.sparta.ParseCharStream parseCharStream, char c, java.lang.String str) {
        this(parseCharStream, "got '" + c + "' instead of " + str + " as expected");
    }

    public ParseException(com.hp.hpl.sparta.ParseCharStream parseCharStream, java.lang.String str, java.lang.String str2) {
        this(parseCharStream, "got \"" + str + "\" instead of \"" + str2 + "\" as expected");
    }

    private static java.lang.String toString(char[] cArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(cArr[0]);
        for (int i = 1; i < cArr.length; i++) {
            stringBuffer.append("or " + cArr[i]);
        }
        return stringBuffer.toString();
    }

    public ParseException(com.hp.hpl.sparta.ParseCharStream parseCharStream, java.lang.String str, char[] cArr) {
        this(parseCharStream, str, new java.lang.String(cArr));
    }

    public int getLineNumber() {
        return this.lineNumber_;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.cause_;
    }

    private static java.lang.String toMessage(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        return str + "(" + i + "): \n" + str2 + "\nLast character read was '" + charRepr(i2) + "'\n" + str3;
    }

    static java.lang.String charRepr(int i) {
        if (i == -1) {
            return "EOF";
        }
        return "" + ((char) i);
    }
}
