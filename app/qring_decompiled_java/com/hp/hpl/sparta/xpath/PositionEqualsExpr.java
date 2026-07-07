package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class PositionEqualsExpr extends com.hp.hpl.sparta.xpath.BooleanExpr {
    private final int position_;

    public PositionEqualsExpr(int i) {
        this.position_ = i;
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExpr
    public void accept(com.hp.hpl.sparta.xpath.BooleanExprVisitor booleanExprVisitor) throws com.hp.hpl.sparta.xpath.XPathException {
        booleanExprVisitor.visit(this);
    }

    public int getPosition() {
        return this.position_;
    }

    public java.lang.String toString() {
        return "[" + this.position_ + "]";
    }
}
