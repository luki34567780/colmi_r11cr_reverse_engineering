package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class TextCompareExpr extends com.hp.hpl.sparta.xpath.BooleanExpr {
    private final java.lang.String value_;

    TextCompareExpr(java.lang.String str) {
        this.value_ = str;
    }

    public java.lang.String getValue() {
        return this.value_;
    }

    protected java.lang.String toString(java.lang.String str) {
        return "[text()" + str + "'" + this.value_ + "']";
    }
}
