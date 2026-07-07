package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class XPathException extends java.lang.Exception {
    private java.lang.Throwable cause_;

    public XPathException(com.hp.hpl.sparta.xpath.XPath xPath, java.lang.String str) {
        super(xPath + " " + str);
        this.cause_ = null;
    }

    XPathException(com.hp.hpl.sparta.xpath.XPath xPath, java.lang.String str, com.hp.hpl.sparta.xpath.SimpleStreamTokenizer simpleStreamTokenizer, java.lang.String str2) {
        this(xPath, str + " got \"" + toString(simpleStreamTokenizer) + "\" instead of expected " + str2);
    }

    XPathException(com.hp.hpl.sparta.xpath.XPath xPath, java.lang.Exception exc) {
        super(xPath + " " + exc);
        this.cause_ = null;
        this.cause_ = exc;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.cause_;
    }

    private static java.lang.String toString(com.hp.hpl.sparta.xpath.SimpleStreamTokenizer simpleStreamTokenizer) {
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(tokenToString(simpleStreamTokenizer));
            if (simpleStreamTokenizer.ttype != -1) {
                simpleStreamTokenizer.nextToken();
                stringBuffer.append(tokenToString(simpleStreamTokenizer));
                simpleStreamTokenizer.pushBack();
            }
            return stringBuffer.toString();
        } catch (java.io.IOException e) {
            return "(cannot get  info: " + e + ")";
        }
    }

    private static java.lang.String tokenToString(com.hp.hpl.sparta.xpath.SimpleStreamTokenizer simpleStreamTokenizer) {
        int i = simpleStreamTokenizer.ttype;
        if (i == -3) {
            return simpleStreamTokenizer.sval;
        }
        if (i == -2) {
            return simpleStreamTokenizer.nval + "";
        }
        if (i == -1) {
            return "<end of expression>";
        }
        return ((char) simpleStreamTokenizer.ttype) + "";
    }
}
