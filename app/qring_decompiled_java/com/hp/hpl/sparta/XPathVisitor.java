package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
class XPathVisitor implements com.hp.hpl.sparta.xpath.Visitor {
    private com.hp.hpl.sparta.Node contextNode_;
    private final com.hp.hpl.sparta.XPathVisitor.BooleanStack exprStack_;
    private boolean multiLevel_;
    private java.lang.Object node_;
    private java.util.Vector nodelistFiltered_;
    private final com.hp.hpl.sparta.NodeListWithPosition nodelistRaw_;
    private java.util.Enumeration nodesetIterator_;
    private com.hp.hpl.sparta.xpath.XPath xpath_;
    private static final java.lang.Boolean TRUE = new java.lang.Boolean(true);
    private static final java.lang.Boolean FALSE = new java.lang.Boolean(false);

    private XPathVisitor(com.hp.hpl.sparta.xpath.XPath xPath, com.hp.hpl.sparta.Node node) throws com.hp.hpl.sparta.xpath.XPathException {
        this.nodelistRaw_ = new com.hp.hpl.sparta.NodeListWithPosition();
        this.nodelistFiltered_ = new java.util.Vector();
        this.nodesetIterator_ = null;
        this.node_ = null;
        this.exprStack_ = new com.hp.hpl.sparta.XPathVisitor.BooleanStack();
        this.xpath_ = xPath;
        this.contextNode_ = node;
        java.util.Vector vector = new java.util.Vector(1);
        this.nodelistFiltered_ = vector;
        vector.addElement(this.contextNode_);
        java.util.Enumeration steps = xPath.getSteps();
        while (steps.hasMoreElements()) {
            com.hp.hpl.sparta.xpath.Step step = (com.hp.hpl.sparta.xpath.Step) steps.nextElement();
            this.multiLevel_ = step.isMultiLevel();
            this.nodesetIterator_ = null;
            step.getNodeTest().accept(this);
            this.nodesetIterator_ = this.nodelistRaw_.iterator();
            this.nodelistFiltered_.removeAllElements();
            com.hp.hpl.sparta.xpath.BooleanExpr predicate = step.getPredicate();
            while (this.nodesetIterator_.hasMoreElements()) {
                this.node_ = this.nodesetIterator_.nextElement();
                predicate.accept(this);
                if (this.exprStack_.pop().booleanValue()) {
                    this.nodelistFiltered_.addElement(this.node_);
                }
            }
        }
    }

    public XPathVisitor(com.hp.hpl.sparta.Element element, com.hp.hpl.sparta.xpath.XPath xPath) throws com.hp.hpl.sparta.xpath.XPathException {
        this(xPath, element);
        if (xPath.isAbsolute()) {
            throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "Cannot use element as context node for absolute xpath");
        }
    }

    public XPathVisitor(com.hp.hpl.sparta.Document document, com.hp.hpl.sparta.xpath.XPath xPath) throws com.hp.hpl.sparta.xpath.XPathException {
        this(xPath, document);
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTestVisitor
    public void visit(com.hp.hpl.sparta.xpath.ThisNodeTest thisNodeTest) {
        this.nodelistRaw_.removeAllElements();
        this.nodelistRaw_.add(this.contextNode_, 1);
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTestVisitor
    public void visit(com.hp.hpl.sparta.xpath.ParentNodeTest parentNodeTest) throws com.hp.hpl.sparta.xpath.XPathException {
        this.nodelistRaw_.removeAllElements();
        com.hp.hpl.sparta.Element parentNode = this.contextNode_.getParentNode();
        if (parentNode == null) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Illegal attempt to apply \"..\" to node with no parent.");
        }
        this.nodelistRaw_.add(parentNode, 1);
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTestVisitor
    public void visit(com.hp.hpl.sparta.xpath.AllElementTest allElementTest) {
        java.util.Vector vector = this.nodelistFiltered_;
        this.nodelistRaw_.removeAllElements();
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            java.lang.Object nextElement = elements.nextElement();
            if (nextElement instanceof com.hp.hpl.sparta.Element) {
                accumulateElements((com.hp.hpl.sparta.Element) nextElement);
            } else if (nextElement instanceof com.hp.hpl.sparta.Document) {
                accumulateElements((com.hp.hpl.sparta.Document) nextElement);
            }
        }
    }

    private void accumulateElements(com.hp.hpl.sparta.Document document) {
        com.hp.hpl.sparta.Element documentElement = document.getDocumentElement();
        this.nodelistRaw_.add(documentElement, 1);
        if (this.multiLevel_) {
            accumulateElements(documentElement);
        }
    }

    private void accumulateElements(com.hp.hpl.sparta.Element element) {
        int i = 0;
        for (com.hp.hpl.sparta.Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild instanceof com.hp.hpl.sparta.Element) {
                i++;
                this.nodelistRaw_.add(firstChild, i);
                if (this.multiLevel_) {
                    accumulateElements((com.hp.hpl.sparta.Element) firstChild);
                }
            }
        }
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTestVisitor
    public void visit(com.hp.hpl.sparta.xpath.TextTest textTest) {
        java.util.Vector vector = this.nodelistFiltered_;
        this.nodelistRaw_.removeAllElements();
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            java.lang.Object nextElement = elements.nextElement();
            if (nextElement instanceof com.hp.hpl.sparta.Element) {
                for (com.hp.hpl.sparta.Node firstChild = ((com.hp.hpl.sparta.Element) nextElement).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                    if (firstChild instanceof com.hp.hpl.sparta.Text) {
                        this.nodelistRaw_.add(((com.hp.hpl.sparta.Text) firstChild).getData());
                    }
                }
            }
        }
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTestVisitor
    public void visit(com.hp.hpl.sparta.xpath.ElementTest elementTest) {
        java.lang.String tagName = elementTest.getTagName();
        java.util.Vector vector = this.nodelistFiltered_;
        int size = vector.size();
        this.nodelistRaw_.removeAllElements();
        for (int i = 0; i < size; i++) {
            java.lang.Object elementAt = vector.elementAt(i);
            if (elementAt instanceof com.hp.hpl.sparta.Element) {
                accumulateMatchingElements((com.hp.hpl.sparta.Element) elementAt, tagName);
            } else if (elementAt instanceof com.hp.hpl.sparta.Document) {
                accumulateMatchingElements((com.hp.hpl.sparta.Document) elementAt, tagName);
            }
        }
    }

    private void accumulateMatchingElements(com.hp.hpl.sparta.Document document, java.lang.String str) {
        com.hp.hpl.sparta.Element documentElement = document.getDocumentElement();
        if (documentElement == null) {
            return;
        }
        if (documentElement.getTagName() == str) {
            this.nodelistRaw_.add(documentElement, 1);
        }
        if (this.multiLevel_) {
            accumulateMatchingElements(documentElement, str);
        }
    }

    private void accumulateMatchingElements(com.hp.hpl.sparta.Element element, java.lang.String str) {
        int i = 0;
        for (com.hp.hpl.sparta.Node firstChild = element.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild instanceof com.hp.hpl.sparta.Element) {
                com.hp.hpl.sparta.Element element2 = (com.hp.hpl.sparta.Element) firstChild;
                if (element2.getTagName() == str) {
                    i++;
                    this.nodelistRaw_.add(element2, i);
                }
                if (this.multiLevel_) {
                    accumulateMatchingElements(element2, str);
                }
            }
        }
    }

    @Override // com.hp.hpl.sparta.xpath.NodeTestVisitor
    public void visit(com.hp.hpl.sparta.xpath.AttrTest attrTest) {
        java.lang.String attribute;
        java.util.Vector vector = this.nodelistFiltered_;
        this.nodelistRaw_.removeAllElements();
        java.util.Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            com.hp.hpl.sparta.Node node = (com.hp.hpl.sparta.Node) elements.nextElement();
            if ((node instanceof com.hp.hpl.sparta.Element) && (attribute = ((com.hp.hpl.sparta.Element) node).getAttribute(attrTest.getAttrName())) != null) {
                this.nodelistRaw_.add(attribute);
            }
        }
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.TrueExpr trueExpr) {
        this.exprStack_.push(TRUE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.AttrExistsExpr attrExistsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        java.lang.String attribute = ((com.hp.hpl.sparta.Element) obj).getAttribute(attrExistsExpr.getAttrName());
        this.exprStack_.push(attribute != null && attribute.length() > 0 ? TRUE : FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.AttrEqualsExpr attrEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        this.exprStack_.push(attrEqualsExpr.getAttrValue().equals(((com.hp.hpl.sparta.Element) obj).getAttribute(attrEqualsExpr.getAttrName())) ? TRUE : FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.AttrNotEqualsExpr attrNotEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        this.exprStack_.push(attrNotEqualsExpr.getAttrValue().equals(((com.hp.hpl.sparta.Element) obj).getAttribute(attrNotEqualsExpr.getAttrName())) ^ true ? TRUE : FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.AttrLessExpr attrLessExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        this.exprStack_.push((((double) java.lang.Long.parseLong(((com.hp.hpl.sparta.Element) obj).getAttribute(attrLessExpr.getAttrName()))) > attrLessExpr.getAttrValue() ? 1 : (((double) java.lang.Long.parseLong(((com.hp.hpl.sparta.Element) obj).getAttribute(attrLessExpr.getAttrName()))) == attrLessExpr.getAttrValue() ? 0 : -1)) < 0 ? TRUE : FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.AttrGreaterExpr attrGreaterExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        this.exprStack_.push((((double) java.lang.Long.parseLong(((com.hp.hpl.sparta.Element) obj).getAttribute(attrGreaterExpr.getAttrName()))) > attrGreaterExpr.getAttrValue() ? 1 : (((double) java.lang.Long.parseLong(((com.hp.hpl.sparta.Element) obj).getAttribute(attrGreaterExpr.getAttrName()))) == attrGreaterExpr.getAttrValue() ? 0 : -1)) > 0 ? TRUE : FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.TextExistsExpr textExistsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        for (com.hp.hpl.sparta.Node firstChild = ((com.hp.hpl.sparta.Element) obj).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild instanceof com.hp.hpl.sparta.Text) {
                this.exprStack_.push(TRUE);
                return;
            }
        }
        this.exprStack_.push(FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.TextEqualsExpr textEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        for (com.hp.hpl.sparta.Node firstChild = ((com.hp.hpl.sparta.Element) obj).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if ((firstChild instanceof com.hp.hpl.sparta.Text) && ((com.hp.hpl.sparta.Text) firstChild).getData().equals(textEqualsExpr.getValue())) {
                this.exprStack_.push(TRUE);
                return;
            }
        }
        this.exprStack_.push(FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.TextNotEqualsExpr textNotEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test attribute of document");
        }
        for (com.hp.hpl.sparta.Node firstChild = ((com.hp.hpl.sparta.Element) obj).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if ((firstChild instanceof com.hp.hpl.sparta.Text) && !((com.hp.hpl.sparta.Text) firstChild).getData().equals(textNotEqualsExpr.getValue())) {
                this.exprStack_.push(TRUE);
                return;
            }
        }
        this.exprStack_.push(FALSE);
    }

    @Override // com.hp.hpl.sparta.xpath.BooleanExprVisitor
    public void visit(com.hp.hpl.sparta.xpath.PositionEqualsExpr positionEqualsExpr) throws com.hp.hpl.sparta.xpath.XPathException {
        java.lang.Object obj = this.node_;
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this.xpath_, "Cannot test position of document");
        }
        this.exprStack_.push(this.nodelistRaw_.position((com.hp.hpl.sparta.Element) obj) == positionEqualsExpr.getPosition() ? TRUE : FALSE);
    }

    public java.util.Enumeration getResultEnumeration() {
        return this.nodelistFiltered_.elements();
    }

    public com.hp.hpl.sparta.Element getFirstResultElement() {
        if (this.nodelistFiltered_.size() == 0) {
            return null;
        }
        return (com.hp.hpl.sparta.Element) this.nodelistFiltered_.elementAt(0);
    }

    public java.lang.String getFirstResultString() {
        if (this.nodelistFiltered_.size() == 0) {
            return null;
        }
        return this.nodelistFiltered_.elementAt(0).toString();
    }

    private static class BooleanStack {
        private com.hp.hpl.sparta.XPathVisitor.BooleanStack.Item top_;

        private BooleanStack() {
            this.top_ = null;
        }

        private static class Item {
            final java.lang.Boolean bool;
            final com.hp.hpl.sparta.XPathVisitor.BooleanStack.Item prev;

            Item(java.lang.Boolean bool, com.hp.hpl.sparta.XPathVisitor.BooleanStack.Item item) {
                this.bool = bool;
                this.prev = item;
            }
        }

        void push(java.lang.Boolean bool) {
            this.top_ = new com.hp.hpl.sparta.XPathVisitor.BooleanStack.Item(bool, this.top_);
        }

        java.lang.Boolean pop() {
            java.lang.Boolean bool = this.top_.bool;
            this.top_ = this.top_.prev;
            return bool;
        }
    }
}
