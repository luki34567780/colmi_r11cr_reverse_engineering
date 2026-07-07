package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class TextExistsExpr extends com.hp.hpl.sparta.xpath.BooleanExpr {
    static final com.hp.hpl.sparta.xpath.TextExistsExpr INSTANCE = new com.hp.hpl.sparta.xpath.TextExistsExpr();

    public java.lang.String toString() {
        return "[text()]";
    }

    private TextExistsExpr() {
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(com.hp.hpl.sparta.xpath.BooleanExprVisitor booleanExprVisitor) throws com.hp.hpl.sparta.xpath.XPathException {
        booleanExprVisitor.visit(this);
    }
}
