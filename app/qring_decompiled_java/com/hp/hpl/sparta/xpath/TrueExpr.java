package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class TrueExpr extends com.hp.hpl.sparta.xpath.BooleanExpr {
    static final com.hp.hpl.sparta.xpath.TrueExpr INSTANCE = new com.hp.hpl.sparta.xpath.TrueExpr();

    public java.lang.String toString() {
        return "";
    }

    private TrueExpr() {
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(com.hp.hpl.sparta.xpath.BooleanExprVisitor booleanExprVisitor) {
        booleanExprVisitor.visit(this);
    }
}
