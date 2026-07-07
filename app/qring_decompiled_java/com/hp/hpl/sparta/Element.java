package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class Element extends com.hp.hpl.sparta.Node {
    private static final boolean DEBUG = false;
    private java.util.Vector attributeNames_;
    private java.util.Hashtable attributes_;
    private com.hp.hpl.sparta.Node firstChild_;
    private com.hp.hpl.sparta.Node lastChild_;
    private java.lang.String tagName_;

    private void checkInvariant() {
    }

    public Element(java.lang.String str) {
        this.firstChild_ = null;
        this.lastChild_ = null;
        this.attributes_ = null;
        this.attributeNames_ = null;
        this.tagName_ = null;
        this.tagName_ = com.hp.hpl.sparta.Sparta.intern(str);
    }

    Element() {
        this.firstChild_ = null;
        this.lastChild_ = null;
        this.attributes_ = null;
        this.attributeNames_ = null;
        this.tagName_ = null;
    }

    @Override // com.hp.hpl.sparta.Node
    public java.lang.Object clone() {
        return cloneElement(true);
    }

    public com.hp.hpl.sparta.Element cloneShallow() {
        return cloneElement(false);
    }

    public com.hp.hpl.sparta.Element cloneElement(boolean z) {
        com.hp.hpl.sparta.Element element = new com.hp.hpl.sparta.Element(this.tagName_);
        java.util.Vector vector = this.attributeNames_;
        if (vector != null) {
            java.util.Enumeration elements = vector.elements();
            while (elements.hasMoreElements()) {
                java.lang.String str = (java.lang.String) elements.nextElement();
                element.setAttribute(str, (java.lang.String) this.attributes_.get(str));
            }
        }
        if (z) {
            for (com.hp.hpl.sparta.Node node = this.firstChild_; node != null; node = node.getNextSibling()) {
                element.appendChild((com.hp.hpl.sparta.Node) node.clone());
            }
        }
        return element;
    }

    public java.lang.String getTagName() {
        return this.tagName_;
    }

    public void setTagName(java.lang.String str) {
        this.tagName_ = com.hp.hpl.sparta.Sparta.intern(str);
        notifyObservers();
    }

    public com.hp.hpl.sparta.Node getFirstChild() {
        return this.firstChild_;
    }

    public com.hp.hpl.sparta.Node getLastChild() {
        return this.lastChild_;
    }

    public java.util.Enumeration getAttributeNames() {
        java.util.Vector vector = this.attributeNames_;
        if (vector == null) {
            return com.hp.hpl.sparta.Document.EMPTY;
        }
        return vector.elements();
    }

    public java.lang.String getAttribute(java.lang.String str) {
        java.util.Hashtable hashtable = this.attributes_;
        if (hashtable == null) {
            return null;
        }
        return (java.lang.String) hashtable.get(str);
    }

    public void setAttribute(java.lang.String str, java.lang.String str2) {
        if (this.attributes_ == null) {
            this.attributes_ = new java.util.Hashtable();
            this.attributeNames_ = new java.util.Vector();
        }
        if (this.attributes_.get(str) == null) {
            this.attributeNames_.addElement(str);
        }
        this.attributes_.put(str, str2);
        notifyObservers();
    }

    public void removeAttribute(java.lang.String str) {
        java.util.Hashtable hashtable = this.attributes_;
        if (hashtable == null) {
            return;
        }
        hashtable.remove(str);
        this.attributeNames_.removeElement(str);
        notifyObservers();
    }

    void appendChildNoChecking(com.hp.hpl.sparta.Node node) {
        com.hp.hpl.sparta.Element parentNode = node.getParentNode();
        if (parentNode != null) {
            parentNode.removeChildNoChecking(node);
        }
        node.insertAtEndOfLinkedList(this.lastChild_);
        if (this.firstChild_ == null) {
            this.firstChild_ = node;
        }
        node.setParentNode(this);
        this.lastChild_ = node;
        node.setOwnerDocument(getOwnerDocument());
    }

    public void appendChild(com.hp.hpl.sparta.Node node) {
        if (!canHaveAsDescendent(node)) {
            node = (com.hp.hpl.sparta.Element) node.clone();
        }
        appendChildNoChecking(node);
        notifyObservers();
    }

    boolean canHaveAsDescendent(com.hp.hpl.sparta.Node node) {
        if (node == this) {
            return false;
        }
        com.hp.hpl.sparta.Element parentNode = getParentNode();
        if (parentNode == null) {
            return true;
        }
        return parentNode.canHaveAsDescendent(node);
    }

    private boolean removeChildNoChecking(com.hp.hpl.sparta.Node node) {
        for (com.hp.hpl.sparta.Node node2 = this.firstChild_; node2 != null; node2 = node2.getNextSibling()) {
            if (node2.equals(node)) {
                if (this.firstChild_ == node2) {
                    this.firstChild_ = node2.getNextSibling();
                }
                if (this.lastChild_ == node2) {
                    this.lastChild_ = node2.getPreviousSibling();
                }
                node2.removeFromLinkedList();
                node2.setParentNode(null);
                node2.setOwnerDocument(null);
                return true;
            }
        }
        return false;
    }

    public void removeChild(com.hp.hpl.sparta.Node node) throws com.hp.hpl.sparta.DOMException {
        if (!removeChildNoChecking(node)) {
            throw new com.hp.hpl.sparta.DOMException((short) 8, "Cannot find " + node + " in " + this);
        }
        notifyObservers();
    }

    public void replaceChild(com.hp.hpl.sparta.Element element, com.hp.hpl.sparta.Node node) throws com.hp.hpl.sparta.DOMException {
        replaceChild_(element, node);
        notifyObservers();
    }

    public void replaceChild(com.hp.hpl.sparta.Text text, com.hp.hpl.sparta.Node node) throws com.hp.hpl.sparta.DOMException {
        replaceChild_(text, node);
        notifyObservers();
    }

    private void replaceChild_(com.hp.hpl.sparta.Node node, com.hp.hpl.sparta.Node node2) throws com.hp.hpl.sparta.DOMException {
        for (com.hp.hpl.sparta.Node node3 = this.firstChild_; node3 != null; node3 = node3.getNextSibling()) {
            if (node3 == node2) {
                if (this.firstChild_ == node2) {
                    this.firstChild_ = node;
                }
                if (this.lastChild_ == node2) {
                    this.lastChild_ = node;
                }
                node2.replaceInLinkedList(node);
                node.setParentNode(this);
                node2.setParentNode(null);
                return;
            }
        }
        throw new com.hp.hpl.sparta.DOMException((short) 8, "Cannot find " + node2 + " in " + this);
    }

    @Override // com.hp.hpl.sparta.Node
    void toString(java.io.Writer writer) throws java.io.IOException {
        for (com.hp.hpl.sparta.Node node = this.firstChild_; node != null; node = node.getNextSibling()) {
            node.toString(writer);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public void toXml(java.io.Writer writer) throws java.io.IOException {
        writer.write("<" + this.tagName_);
        java.util.Vector vector = this.attributeNames_;
        if (vector != null) {
            java.util.Enumeration elements = vector.elements();
            while (elements.hasMoreElements()) {
                java.lang.String str = (java.lang.String) elements.nextElement();
                java.lang.String str2 = (java.lang.String) this.attributes_.get(str);
                writer.write(" " + str + "=\"");
                htmlEncode(writer, str2);
                writer.write("\"");
            }
        }
        if (this.firstChild_ == null) {
            writer.write("/>");
            return;
        }
        writer.write(">");
        for (com.hp.hpl.sparta.Node node = this.firstChild_; node != null; node = node.getNextSibling()) {
            node.toXml(writer);
        }
        writer.write("</" + this.tagName_ + ">");
    }

    private com.hp.hpl.sparta.XPathVisitor visitor(java.lang.String str, boolean z) throws com.hp.hpl.sparta.xpath.XPathException {
        com.hp.hpl.sparta.xpath.XPath xPath = com.hp.hpl.sparta.xpath.XPath.get(str);
        if (xPath.isStringValue() != z) {
            throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "\"" + xPath + "\" evaluates to " + (z ? "evaluates to element not string" : "evaluates to string not element"));
        }
        return new com.hp.hpl.sparta.XPathVisitor(this, xPath);
    }

    @Override // com.hp.hpl.sparta.Node
    public java.util.Enumeration xpathSelectElements(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        try {
            return visitor(str, false).getResultEnumeration();
        } catch (com.hp.hpl.sparta.xpath.XPathException e) {
            throw new com.hp.hpl.sparta.ParseException("XPath problem", e);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public java.util.Enumeration xpathSelectStrings(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        try {
            return visitor(str, true).getResultEnumeration();
        } catch (com.hp.hpl.sparta.xpath.XPathException e) {
            throw new com.hp.hpl.sparta.ParseException("XPath problem", e);
        }
    }

    public boolean xpathEnsure(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        com.hp.hpl.sparta.Element xpathSelectElement;
        try {
            if (xpathSelectElement(str) != null) {
                return false;
            }
            com.hp.hpl.sparta.xpath.XPath xPath = com.hp.hpl.sparta.xpath.XPath.get(str);
            java.util.Enumeration steps = xPath.getSteps();
            int i = 0;
            while (steps.hasMoreElements()) {
                steps.nextElement();
                i++;
            }
            int i2 = i - 1;
            com.hp.hpl.sparta.xpath.Step[] stepArr = new com.hp.hpl.sparta.xpath.Step[i2];
            java.util.Enumeration steps2 = xPath.getSteps();
            for (int i3 = 0; i3 < i2; i3++) {
                stepArr[i3] = (com.hp.hpl.sparta.xpath.Step) steps2.nextElement();
            }
            com.hp.hpl.sparta.xpath.Step step = (com.hp.hpl.sparta.xpath.Step) steps2.nextElement();
            if (i2 == 0) {
                xpathSelectElement = this;
            } else {
                java.lang.String xPath2 = com.hp.hpl.sparta.xpath.XPath.get(xPath.isAbsolute(), stepArr).toString();
                xpathEnsure(xPath2.toString());
                xpathSelectElement = xpathSelectElement(xPath2);
            }
            xpathSelectElement.appendChildNoChecking(makeMatching(xpathSelectElement, step, str));
            return true;
        } catch (com.hp.hpl.sparta.xpath.XPathException e) {
            throw new com.hp.hpl.sparta.ParseException(str, e);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public com.hp.hpl.sparta.Element xpathSelectElement(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        try {
            return visitor(str, false).getFirstResultElement();
        } catch (com.hp.hpl.sparta.xpath.XPathException e) {
            throw new com.hp.hpl.sparta.ParseException("XPath problem", e);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public java.lang.String xpathSelectString(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        try {
            return visitor(str, true).getFirstResultString();
        } catch (com.hp.hpl.sparta.xpath.XPathException e) {
            throw new com.hp.hpl.sparta.ParseException("XPath problem", e);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.hp.hpl.sparta.Element)) {
            return false;
        }
        com.hp.hpl.sparta.Element element = (com.hp.hpl.sparta.Element) obj;
        if (!this.tagName_.equals(element.tagName_)) {
            return false;
        }
        java.util.Hashtable hashtable = this.attributes_;
        int size = hashtable == null ? 0 : hashtable.size();
        java.util.Hashtable hashtable2 = element.attributes_;
        if (size != (hashtable2 == null ? 0 : hashtable2.size())) {
            return false;
        }
        java.util.Hashtable hashtable3 = this.attributes_;
        if (hashtable3 != null) {
            java.util.Enumeration keys = hashtable3.keys();
            while (keys.hasMoreElements()) {
                java.lang.String str = (java.lang.String) keys.nextElement();
                if (!((java.lang.String) this.attributes_.get(str)).equals((java.lang.String) element.attributes_.get(str))) {
                    return false;
                }
            }
        }
        com.hp.hpl.sparta.Node node = this.firstChild_;
        com.hp.hpl.sparta.Node node2 = element.firstChild_;
        while (node != null) {
            if (!node.equals(node2)) {
                return false;
            }
            node = node.getNextSibling();
            node2 = node2.getNextSibling();
        }
        return true;
    }

    @Override // com.hp.hpl.sparta.Node
    protected int computeHashCode() {
        int hashCode = this.tagName_.hashCode();
        java.util.Hashtable hashtable = this.attributes_;
        if (hashtable != null) {
            java.util.Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                java.lang.String str = (java.lang.String) keys.nextElement();
                hashCode = (((hashCode * 31) + str.hashCode()) * 31) + ((java.lang.String) this.attributes_.get(str)).hashCode();
            }
        }
        for (com.hp.hpl.sparta.Node node = this.firstChild_; node != null; node = node.getNextSibling()) {
            hashCode = (hashCode * 31) + node.hashCode();
        }
        return hashCode;
    }
}
