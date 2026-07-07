package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class EncodingMismatchException extends com.hp.hpl.sparta.ParseException {
    private java.lang.String declaredEncoding_;

    EncodingMismatchException(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str, 0, str2.charAt(str2.length() - 1), str2, "encoding '" + str2 + "' declared instead of of " + str3 + " as expected");
        this.declaredEncoding_ = str2;
    }

    java.lang.String getDeclaredEncoding() {
        return this.declaredEncoding_;
    }
}
