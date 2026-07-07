package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class Step {
    public static com.hp.hpl.sparta.xpath.Step DOT = new com.hp.hpl.sparta.xpath.Step(com.hp.hpl.sparta.xpath.ThisNodeTest.INSTANCE, com.hp.hpl.sparta.xpath.TrueExpr.INSTANCE);
    private final boolean multiLevel_;
    private final com.hp.hpl.sparta.xpath.NodeTest nodeTest_;
    private final com.hp.hpl.sparta.xpath.BooleanExpr predicate_;

    Step(com.hp.hpl.sparta.xpath.NodeTest nodeTest, com.hp.hpl.sparta.xpath.BooleanExpr booleanExpr) {
        this.nodeTest_ = nodeTest;
        this.predicate_ = booleanExpr;
        this.multiLevel_ = false;
    }

    Step(com.hp.hpl.sparta.xpath.XPath xPath, boolean z, com.hp.hpl.sparta.xpath.SimpleStreamTokenizer simpleStreamTokenizer) throws com.hp.hpl.sparta.xpath.XPathException, java.io.IOException {
        this.multiLevel_ = z;
        int i = simpleStreamTokenizer.ttype;
        if (i != -3) {
            if (i == 42) {
                this.nodeTest_ = com.hp.hpl.sparta.xpath.AllElementTest.INSTANCE;
            } else if (i != 46) {
                if (i == 64) {
                    if (simpleStreamTokenizer.nextToken() != -3) {
                        throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after @ in node test", simpleStreamTokenizer, "name");
                    }
                    this.nodeTest_ = new com.hp.hpl.sparta.xpath.AttrTest(simpleStreamTokenizer.sval);
                } else {
                    throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "at begininning of step", simpleStreamTokenizer, "'.' or '*' or name");
                }
            } else if (simpleStreamTokenizer.nextToken() == 46) {
                this.nodeTest_ = com.hp.hpl.sparta.xpath.ParentNodeTest.INSTANCE;
            } else {
                simpleStreamTokenizer.pushBack();
                this.nodeTest_ = com.hp.hpl.sparta.xpath.ThisNodeTest.INSTANCE;
            }
        } else if (simpleStreamTokenizer.sval.equals("text")) {
            if (simpleStreamTokenizer.nextToken() != 40 || simpleStreamTokenizer.nextToken() != 41) {
                throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after text", simpleStreamTokenizer, "()");
            }
            this.nodeTest_ = com.hp.hpl.sparta.xpath.TextTest.INSTANCE;
        } else {
            this.nodeTest_ = new com.hp.hpl.sparta.xpath.ElementTest(simpleStreamTokenizer.sval);
        }
        if (simpleStreamTokenizer.nextToken() == 91) {
            simpleStreamTokenizer.nextToken();
            this.predicate_ = com.hp.hpl.sparta.xpath.ExprFactory.createExpr(xPath, simpleStreamTokenizer);
            if (simpleStreamTokenizer.ttype != 93) {
                throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "after predicate expression", simpleStreamTokenizer, "]");
            }
            simpleStreamTokenizer.nextToken();
            return;
        }
        this.predicate_ = com.hp.hpl.sparta.xpath.TrueExpr.INSTANCE;
    }

    public java.lang.String toString() {
        return this.nodeTest_.toString() + this.predicate_.toString();
    }

    public boolean isMultiLevel() {
        return this.multiLevel_;
    }

    public boolean isStringValue() {
        return this.nodeTest_.isStringValue();
    }

    public com.hp.hpl.sparta.xpath.NodeTest getNodeTest() {
        return this.nodeTest_;
    }

    public com.hp.hpl.sparta.xpath.BooleanExpr getPredicate() {
        return this.predicate_;
    }
}
