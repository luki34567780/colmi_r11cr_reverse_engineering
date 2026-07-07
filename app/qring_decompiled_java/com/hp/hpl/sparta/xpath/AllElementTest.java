package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class AllElementTest extends com.hp.hpl.sparta.xpath.NodeTest {
    static final com.hp.hpl.sparta.xpath.AllElementTest INSTANCE = new com.hp.hpl.sparta.xpath.AllElementTest();

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public boolean isStringValue() {
        return false;
    }

    public java.lang.String toString() {
        return "*";
    }

    private AllElementTest() {
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTest
    public void accept(com.hp.hpl.sparta.xpath.Visitor visitor) {
        visitor.visit(this);
    }
}
