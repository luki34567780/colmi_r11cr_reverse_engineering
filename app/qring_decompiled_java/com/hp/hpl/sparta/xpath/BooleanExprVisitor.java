package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public interface BooleanExprVisitor {
    void visit(com.hp.hpl.sparta.xpath.AttrEqualsExpr attrEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.AttrExistsExpr attrExistsExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.AttrGreaterExpr attrGreaterExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.AttrLessExpr attrLessExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.AttrNotEqualsExpr attrNotEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.PositionEqualsExpr positionEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.TextEqualsExpr textEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.TextExistsExpr textExistsExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.TextNotEqualsExpr textNotEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException;

    void visit(com.hp.hpl.sparta.xpath.TrueExpr trueExpr);
}
