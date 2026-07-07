package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class AttrCompareExpr extends com.hp.hpl.sparta.xpath.AttrExpr {
    private final java.lang.String attrValue_;

    AttrCompareExpr(java.lang.String str, java.lang.String str2) {
        super(str);
        this.attrValue_ = com.hp.hpl.sparta.Sparta.intern(str2);
    }

    public java.lang.String getAttrValue() {
        return this.attrValue_;
    }

    protected java.lang.String toString(java.lang.String str) {
        return "[" + super.toString() + str + "'" + this.attrValue_ + "']";
    }
}
