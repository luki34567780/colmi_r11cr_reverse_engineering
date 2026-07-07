package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class Node {
    private com.hp.hpl.sparta.Document doc_ = null;
    private com.hp.hpl.sparta.Element parentNode_ = null;
    private com.hp.hpl.sparta.Node previousSibling_ = null;
    private com.hp.hpl.sparta.Node nextSibling_ = null;
    private java.lang.Object annotation_ = null;
    private int hash_ = 0;

    public abstract java.lang.Object clone();

    protected abstract int computeHashCode();

    abstract void toString(java.io.Writer writer) throws java.io.IOException;

    abstract void toXml(java.io.Writer writer) throws java.io.IOException;

    public abstract com.hp.hpl.sparta.Element xpathSelectElement(java.lang.String str) throws com.hp.hpl.sparta.ParseException;

    public abstract java.util.Enumeration xpathSelectElements(java.lang.String str) throws com.hp.hpl.sparta.ParseException;

    public abstract java.lang.String xpathSelectString(java.lang.String str) throws com.hp.hpl.sparta.ParseException;

    public abstract java.util.Enumeration xpathSelectStrings(java.lang.String str) throws com.hp.hpl.sparta.ParseException;

    void notifyObservers() {
        this.hash_ = 0;
        com.hp.hpl.sparta.Document document = this.doc_;
        if (document != null) {
            document.notifyObservers();
        }
    }

    void setOwnerDocument(com.hp.hpl.sparta.Document document) {
        this.doc_ = document;
    }

    public com.hp.hpl.sparta.Document getOwnerDocument() {
        return this.doc_;
    }

    public com.hp.hpl.sparta.Element getParentNode() {
        return this.parentNode_;
    }

    public com.hp.hpl.sparta.Node getPreviousSibling() {
        return this.previousSibling_;
    }

    public com.hp.hpl.sparta.Node getNextSibling() {
        return this.nextSibling_;
    }

    public java.lang.Object getAnnotation() {
        return this.annotation_;
    }

    public void setAnnotation(java.lang.Object obj) {
        this.annotation_ = obj;
    }

    void setParentNode(com.hp.hpl.sparta.Element element) {
        this.parentNode_ = element;
    }

    void insertAtEndOfLinkedList(com.hp.hpl.sparta.Node node) {
        this.previousSibling_ = node;
        if (node != null) {
            node.nextSibling_ = this;
        }
    }

    void removeFromLinkedList() {
        com.hp.hpl.sparta.Node node = this.previousSibling_;
        if (node != null) {
            node.nextSibling_ = this.nextSibling_;
        }
        com.hp.hpl.sparta.Node node2 = this.nextSibling_;
        if (node2 != null) {
            node2.previousSibling_ = node;
        }
        this.nextSibling_ = null;
        this.previousSibling_ = null;
    }

    void replaceInLinkedList(com.hp.hpl.sparta.Node node) {
        com.hp.hpl.sparta.Node node2 = this.previousSibling_;
        if (node2 != null) {
            node2.nextSibling_ = node;
        }
        com.hp.hpl.sparta.Node node3 = this.nextSibling_;
        if (node3 != null) {
            node3.previousSibling_ = node;
        }
        node.nextSibling_ = node3;
        node.previousSibling_ = this.previousSibling_;
        this.nextSibling_ = null;
        this.previousSibling_ = null;
    }

    public java.lang.String toXml() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(byteArrayOutputStream);
        toXml(outputStreamWriter);
        outputStreamWriter.flush();
        return new java.lang.String(byteArrayOutputStream.toByteArray());
    }

    public boolean xpathSetStrings(java.lang.String str, java.lang.String str2) throws com.hp.hpl.sparta.ParseException {
        try {
            int lastIndexOf = str.lastIndexOf(47);
            int i = lastIndexOf + 1;
            if (!str.substring(i).equals("text()") && str.charAt(i) != '@') {
                throw new com.hp.hpl.sparta.ParseException("Last step of Xpath expression \"" + str + "\" is not \"text()\" and does not start with a '@'. It starts with a '" + str.charAt(i) + "'");
            }
            boolean z = false;
            java.lang.String substring = str.substring(0, lastIndexOf);
            if (str.charAt(i) == '@') {
                java.lang.String substring2 = str.substring(lastIndexOf + 2);
                if (substring2.length() == 0) {
                    throw new com.hp.hpl.sparta.ParseException("Xpath expression \"" + str + "\" specifies zero-length attribute name\"");
                }
                java.util.Enumeration xpathSelectElements = xpathSelectElements(substring);
                while (xpathSelectElements.hasMoreElements()) {
                    com.hp.hpl.sparta.Element element = (com.hp.hpl.sparta.Element) xpathSelectElements.nextElement();
                    if (!str2.equals(element.getAttribute(substring2))) {
                        element.setAttribute(substring2, str2);
                        z = true;
                    }
                }
                return z;
            }
            java.util.Enumeration xpathSelectElements2 = xpathSelectElements(substring);
            boolean hasMoreElements = xpathSelectElements2.hasMoreElements();
            while (xpathSelectElements2.hasMoreElements()) {
                com.hp.hpl.sparta.Element element2 = (com.hp.hpl.sparta.Element) xpathSelectElements2.nextElement();
                java.util.Vector vector = new java.util.Vector();
                for (com.hp.hpl.sparta.Node firstChild = element2.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                    if (firstChild instanceof com.hp.hpl.sparta.Text) {
                        vector.addElement((com.hp.hpl.sparta.Text) firstChild);
                    }
                }
                if (vector.size() == 0) {
                    com.hp.hpl.sparta.Text text = new com.hp.hpl.sparta.Text(str2);
                    if (text.getData().length() > 0) {
                        element2.appendChild(text);
                        hasMoreElements = true;
                    }
                } else {
                    com.hp.hpl.sparta.Text text2 = (com.hp.hpl.sparta.Text) vector.elementAt(0);
                    if (!text2.getData().equals(str2)) {
                        vector.removeElementAt(0);
                        text2.setData(str2);
                        hasMoreElements = true;
                    }
                    int i2 = 0;
                    while (i2 < vector.size()) {
                        element2.removeChild((com.hp.hpl.sparta.Text) vector.elementAt(i2));
                        i2++;
                        hasMoreElements = true;
                    }
                }
            }
            return hasMoreElements;
        } catch (com.hp.hpl.sparta.DOMException e) {
            throw new java.lang.Error("Assertion failed " + e);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.hp.hpl.sparta.ParseException("Xpath expression \"" + str + "\" is not in the form \"xpathExpression/@attributeName\"");
        }
    }

    com.hp.hpl.sparta.Element makeMatching(final com.hp.hpl.sparta.Element element, com.hp.hpl.sparta.xpath.Step step, final java.lang.String str) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.xpath.XPathException {
        com.hp.hpl.sparta.xpath.NodeTest nodeTest = step.getNodeTest();
        if (!(nodeTest instanceof com.hp.hpl.sparta.xpath.ElementTest)) {
            throw new com.hp.hpl.sparta.ParseException("\"" + nodeTest + "\" in \"" + str + "\" is not an element test");
        }
        final java.lang.String tagName = ((com.hp.hpl.sparta.xpath.ElementTest) nodeTest).getTagName();
        final com.hp.hpl.sparta.Element element2 = new com.hp.hpl.sparta.Element(tagName);
        step.getPredicate().accept(new com.hp.hpl.sparta.xpath.BooleanExprVisitor() { // from class: com.hp.hpl.sparta.Node.1
            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.TrueExpr trueExpr) {
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.AttrExistsExpr attrExistsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.setAttribute(attrExistsExpr.getAttrName(), "something");
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.AttrEqualsExpr attrEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.setAttribute(attrEqualsExpr.getAttrName(), attrEqualsExpr.getAttrValue());
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.AttrNotEqualsExpr attrNotEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.setAttribute(attrNotEqualsExpr.getAttrName(), "not " + attrNotEqualsExpr.getAttrValue());
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.AttrLessExpr attrLessExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.setAttribute(attrLessExpr.getAttrName(), java.lang.Long.toString(Long.MIN_VALUE));
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.AttrGreaterExpr attrGreaterExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.setAttribute(attrGreaterExpr.getAttrName(), java.lang.Long.toString(Long.MAX_VALUE));
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.TextExistsExpr textExistsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.appendChild(new com.hp.hpl.sparta.Text("something"));
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.TextEqualsExpr textEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.appendChild(new com.hp.hpl.sparta.Text(textEqualsExpr.getValue()));
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.TextNotEqualsExpr textNotEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                element2.appendChild(new com.hp.hpl.sparta.Text("not " + textNotEqualsExpr.getValue()));
            }

            @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
            public void visit(com.hp.hpl.sparta.xpath.PositionEqualsExpr positionEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
                int position = positionEqualsExpr.getPosition();
                if (element == null && position != 1) {
                    throw new com.hp.hpl.sparta.xpath.XPathException(com.hp.hpl.sparta.xpath.XPath.get(str), "Position of root node must be 1");
                }
                for (int i = 1; i < position; i++) {
                    element.appendChild(new com.hp.hpl.sparta.Element(tagName));
                }
            }
        });
        return element2;
    }

    public java.lang.String toString() {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(byteArrayOutputStream);
            toString(outputStreamWriter);
            outputStreamWriter.flush();
            return new java.lang.String(byteArrayOutputStream.toByteArray());
        } catch (java.io.IOException unused) {
            return super.toString();
        }
    }

    protected static void htmlEncode(java.io.Writer writer, java.lang.String str) throws java.io.IOException {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            java.lang.String str2 = charAt >= 128 ? "&#" + ((int) charAt) + ";" : charAt != '\"' ? charAt != '<' ? charAt != '>' ? charAt != '&' ? charAt != '\'' ? null : "&#39;" : "&amp;" : "&gt;" : "&lt;" : "&quot;";
            if (str2 != null) {
                writer.write(str, i, i2 - i);
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
    }

    public int hashCode() {
        if (this.hash_ == 0) {
            this.hash_ = computeHashCode();
        }
        return this.hash_;
    }
}
