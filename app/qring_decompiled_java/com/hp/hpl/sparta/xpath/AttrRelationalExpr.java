package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class AttrRelationalExpr extends com.hp.hpl.sparta.xpath.AttrExpr {
    private final int attrValue_;

    AttrRelationalExpr(java.lang.String str, int i) {
        super(str);
        this.attrValue_ = i;
    }

    public double getAttrValue() {
        return this.attrValue_;
    }

    protected java.lang.String toString(java.lang.String str) {
        return "[" + super.toString() + str + "'" + this.attrValue_ + "']";
    }
}
