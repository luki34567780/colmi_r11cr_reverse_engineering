package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class TextTest extends com.hp.hpl.sparta.xpath.NodeTest {
    static final com.hp.hpl.sparta.xpath.TextTest INSTANCE = new com.hp.hpl.sparta.xpath.TextTest();

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public boolean isStringValue() {
        return true;
    }

    public java.lang.String toString() {
        return "text()";
    }

    private TextTest() {
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public void accept(com.hp.hpl.sparta.xpath.Visitor visitor) throws com.hp.hpl.sparta.xpath.XPathException {
        visitor.visit(this);
    }
}
