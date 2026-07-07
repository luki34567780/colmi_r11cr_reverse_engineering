package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class ParentNodeTest extends com.hp.hpl.sparta.xpath.NodeTest {
    static final com.hp.hpl.sparta.xpath.ParentNodeTest INSTANCE = new com.hp.hpl.sparta.xpath.ParentNodeTest();

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public boolean isStringValue() {
        return false;
    }

    public java.lang.String toString() {
        return "..";
    }

    private ParentNodeTest() {
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public void accept(com.hp.hpl.sparta.xpath.Visitor visitor) throws com.hp.hpl.sparta.xpath.XPathException {
        visitor.visit(this);
    }
}
