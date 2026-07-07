package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class ElementTest extends com.hp.hpl.sparta.xpath.NodeTest {
    private final java.lang.String tagName_;

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public boolean isStringValue() {
        return false;
    }

    ElementTest(java.lang.String str) {
        this.tagName_ = com.hp.hpl.sparta.Sparta.intern(str);
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public void accept(com.hp.hpl.sparta.xpath.Visitor visitor) {
        visitor.visit(this);
    }

    public java.lang.String getTagName() {
        return this.tagName_;
    }

    public java.lang.String toString() {
        return this.tagName_;
    }
}
