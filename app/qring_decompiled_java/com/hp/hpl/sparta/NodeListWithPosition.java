package com.hp.hpl.sparta;

/* compiled from: XPathVisitor.java */
/* loaded from: /tmp/dex/classes2.dex */
class NodeListWithPosition {
    private static final java.lang.Integer ONE = new java.lang.Integer(1);
    private static final java.lang.Integer TWO = new java.lang.Integer(2);
    private static final java.lang.Integer THREE = new java.lang.Integer(3);
    private static final java.lang.Integer FOUR = new java.lang.Integer(4);
    private static final java.lang.Integer FIVE = new java.lang.Integer(5);
    private static final java.lang.Integer SIX = new java.lang.Integer(6);
    private static final java.lang.Integer SEVEN = new java.lang.Integer(7);
    private static final java.lang.Integer EIGHT = new java.lang.Integer(8);
    private static final java.lang.Integer NINE = new java.lang.Integer(9);
    private static final java.lang.Integer TEN = new java.lang.Integer(10);
    private final java.util.Vector vector_ = new java.util.Vector();
    private java.util.Hashtable positions_ = new java.util.Hashtable();

    NodeListWithPosition() {
    }

    java.util.Enumeration iterator() {
        return this.vector_.elements();
    }

    void removeAllElements() {
        this.vector_.removeAllElements();
        this.positions_.clear();
    }

    void add(java.lang.String str) {
        this.vector_.addElement(str);
    }

    private static java.lang.Integer identity(com.hp.hpl.sparta.Node node) {
        return new java.lang.Integer(java.lang.System.identityHashCode(node));
    }

    void add(com.hp.hpl.sparta.Node node, int i) {
        java.lang.Integer num;
        this.vector_.addElement(node);
        switch (i) {
            case 1:
                num = ONE;
                break;
            case 2:
                num = TWO;
                break;
            case 3:
                num = THREE;
                break;
            case 4:
                num = FOUR;
                break;
            case 5:
                num = FIVE;
                break;
            case 6:
                num = SIX;
                break;
            case 7:
                num = SEVEN;
                break;
            case 8:
                num = EIGHT;
                break;
            case 9:
                num = NINE;
                break;
            case 10:
                num = TEN;
                break;
            default:
                num = new java.lang.Integer(i);
                break;
        }
        this.positions_.put(identity(node), num);
    }

    int position(com.hp.hpl.sparta.Node node) {
        return ((java.lang.Integer) this.positions_.get(identity(node))).intValue();
    }

    public java.lang.String toString() {
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("{ ");
            java.util.Enumeration elements = this.vector_.elements();
            while (elements.hasMoreElements()) {
                java.lang.Object nextElement = elements.nextElement();
                if (nextElement instanceof java.lang.String) {
                    stringBuffer.append("String(" + nextElement + ") ");
                } else {
                    com.hp.hpl.sparta.Node node = (com.hp.hpl.sparta.Node) nextElement;
                    stringBuffer.append("Node(" + node.toXml() + ")[" + this.positions_.get(identity(node)) + "] ");
                }
            }
            stringBuffer.append("}");
            return stringBuffer.toString();
        } catch (java.io.IOException e) {
            return e.toString();
        }
    }
}
