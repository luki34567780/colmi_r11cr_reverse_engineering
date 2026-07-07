package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class TextEqualsExpr extends com.hp.hpl.sparta.xpath.TextCompareExpr {
    TextEqualsExpr(java.lang.String str) {
        super(str);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(com.hp.hpl.sparta.xpath.BooleanExprVisitor booleanExprVisitor) throws com.hp.hpl.sparta.xpath.XPathException {
        booleanExprVisitor.visit(this);
    }

    public java.lang.String toString() {
        return toString("=");
    }
}
