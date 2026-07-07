package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class AttrExpr extends com.hp.hpl.sparta.xpath.BooleanExpr {
    private final java.lang.String attrName_;

    AttrExpr(java.lang.String str) {
        this.attrName_ = str;
    }

    public java.lang.String getAttrName() {
        return this.attrName_;
    }

    public java.lang.String toString() {
        return "@" + this.attrName_;
    }
}
