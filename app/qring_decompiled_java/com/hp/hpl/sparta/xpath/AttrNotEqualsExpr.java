package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class AttrNotEqualsExpr extends com.hp.hpl.sparta.xpath.AttrCompareExpr {
    AttrNotEqualsExpr(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(com.hp.hpl.sparta.xpath.BooleanExprVisitor booleanExprVisitor) throws com.hp.hpl.sparta.xpath.XPathException {
        booleanExprVisitor.visit(this);
    }

    @Override // com.hp.hpl.sparta.xpath.AttrExpr
    public java.lang.String toString() {
        return toString("!=");
    }
}
