package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public interface NodeTestVisitor {
    void visit(com.hp.hpl.sparta.xpath.AllElementTest allElementTest);

    void visit(com.hp.hpl.sparta.xpath.AttrTest attrTest);

    void visit(com.hp.hpl.sparta.xpath.ElementTest elementTest);

    void visit(com.hp.hpl.sparta.xpath.ParentNodeTest parentNodeTest) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.TextTest textTest);

    void visit(com.hp.hpl.sparta.xpath.ThisNodeTest thisNodeTest);
}
