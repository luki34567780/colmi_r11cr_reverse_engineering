package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class AttrTest extends com.hp.hpl.sparta.xpath.NodeTest {
    private final java.lang.String attrName_;

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public boolean isStringValue() {
        return true;
    }

    AttrTest(java.lang.String str) {
        this.attrName_ = str;
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public void accept(com.hp.hpl.sparta.xpath.Visitor visitor) {
        visitor.visit(this);
    }

    public java.lang.String getAttrName() {
        return this.attrName_;
    }

    public java.lang.String toString() {
        return "@" + this.attrName_;
    }
}
