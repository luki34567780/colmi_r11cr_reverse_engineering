package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class Document extends com.hp.hpl.sparta.Node {
    private static final boolean DEBUG = false;
    private final java.util.Hashtable indexible_;
    private com.hp.hpl.sparta.Sparta.Cache indices_;
    private java.util.Vector observers_;
    private com.hp.hpl.sparta.Element rootElement_;
    private java.lang.String systemId_;
    private static final java.lang.Integer ONE = new java.lang.Integer(1);
    static final java.util.Enumeration EMPTY = new com.hp.hpl.sparta.EmptyEnumeration();

    public interface Observer {
        void update(com.hp.hpl.sparta.Document document);
    }

    void monitor(com.hp.hpl.sparta.xpath.XPath xPath) throws com.hp.hpl.sparta.xpath.XPathException {
    }

    Document(java.lang.String str) {
        this.rootElement_ = null;
        this.indices_ = com.hp.hpl.sparta.Sparta.newCache();
        this.observers_ = new java.util.Vector();
        this.indexible_ = null;
        this.systemId_ = str;
    }

    public Document() {
        this.rootElement_ = null;
        this.indices_ = com.hp.hpl.sparta.Sparta.newCache();
        this.observers_ = new java.util.Vector();
        this.indexible_ = null;
        this.systemId_ = "MEMORY";
    }

    @Override // com.hp.hpl.sparta.Node
    public java.lang.Object clone() {
        com.hp.hpl.sparta.Document document = new com.hp.hpl.sparta.Document(this.systemId_);
        document.rootElement_ = (com.hp.hpl.sparta.Element) this.rootElement_.clone();
        return document;
    }

    public java.lang.String getSystemId() {
        return this.systemId_;
    }

    public void setSystemId(java.lang.String str) {
        this.systemId_ = str;
        notifyObservers();
    }

    @Override // com.hp.hpl.sparta.Node
    public java.lang.String toString() {
        return this.systemId_;
    }

    public com.hp.hpl.sparta.Element getDocumentElement() {
        return this.rootElement_;
    }

    public void setDocumentElement(com.hp.hpl.sparta.Element element) {
        this.rootElement_ = element;
        element.setOwnerDocument(this);
        notifyObservers();
    }

    private com.hp.hpl.sparta.XPathVisitor visitor(java.lang.String str, boolean z) throws com.hp.hpl.sparta.xpath.XPathException {
        if (str.charAt(0) != '/') {
            str = "/" + str;
        }
        return visitor(com.hp.hpl.sparta.xpath.XPath.get(str), z);
    }

    com.hp.hpl.sparta.XPathVisitor visitor(com.hp.hpl.sparta.xpath.XPath xPath, boolean z) throws com.hp.hpl.sparta.xpath.XPathException {
        if (xPath.isStringValue() != z) {
            throw new com.hp.hpl.sparta.xpath.XPathException(xPath, "\"" + xPath + "\" evaluates to " + (z ? "evaluates to element not string" : "evaluates to string not element"));
        }
        return new com.hp.hpl.sparta.XPathVisitor(this, xPath);
    }

    @Override // com.hp.hpl.sparta.Node
    public java.util.Enumeration xpathSelectElements(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        try {
            if (str.charAt(0) != '/') {
                str = "/" + str;
            }
            com.hp.hpl.sparta.xpath.XPath xPath = com.hp.hpl.sparta.xpath.XPath.get(str);
            monitor(xPath);
            return visitor(xPath, false).getResultEnumeration();
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

    @Override // com.hp.hpl.sparta.Node
    public com.hp.hpl.sparta.Element xpathSelectElement(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        try {
            if (str.charAt(0) != '/') {
                str = "/" + str;
            }
            com.hp.hpl.sparta.xpath.XPath xPath = com.hp.hpl.sparta.xpath.XPath.get(str);
            monitor(xPath);
            return visitor(xPath, false).getFirstResultElement();
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

    public boolean xpathEnsure(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
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
            java.util.Enumeration steps2 = xPath.getSteps();
            com.hp.hpl.sparta.xpath.Step step = (com.hp.hpl.sparta.xpath.Step) steps2.nextElement();
            int i2 = i - 1;
            com.hp.hpl.sparta.xpath.Step[] stepArr = new com.hp.hpl.sparta.xpath.Step[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                stepArr[i3] = (com.hp.hpl.sparta.xpath.Step) steps2.nextElement();
            }
            if (this.rootElement_ == null) {
                setDocumentElement(makeMatching(null, step, str));
            } else {
                if (xpathSelectElement("/" + step) == null) {
                    throw new com.hp.hpl.sparta.ParseException("Existing root element <" + this.rootElement_.getTagName() + "...> does not match first step \"" + step + "\" of \"" + str);
                }
            }
            if (i2 == 0) {
                return true;
            }
            return this.rootElement_.xpathEnsure(com.hp.hpl.sparta.xpath.XPath.get(false, stepArr).toString());
        } catch (com.hp.hpl.sparta.xpath.XPathException e) {
            throw new com.hp.hpl.sparta.ParseException(str, e);
        }
    }

    public class Index implements com.hp.hpl.sparta.Document.Observer {
        private final java.lang.String attrName_;
        private transient com.hp.hpl.sparta.Sparta.Cache dict_ = null;
        private final com.hp.hpl.sparta.xpath.XPath xpath_;

        Index(com.hp.hpl.sparta.xpath.XPath xPath) throws com.hp.hpl.sparta.xpath.XPathException {
            this.attrName_ = xPath.getIndexingAttrName();
            this.xpath_ = xPath;
            com.hp.hpl.sparta.Document.this.addObserver(this);
        }

        public synchronized java.util.Enumeration get(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
            java.util.Vector vector;
            if (this.dict_ == null) {
                regenerate();
            }
            vector = (java.util.Vector) this.dict_.get(str);
            return vector == null ? com.hp.hpl.sparta.Document.EMPTY : vector.elements();
        }

        public synchronized int size() throws com.hp.hpl.sparta.ParseException {
            if (this.dict_ == null) {
                regenerate();
            }
            return this.dict_.size();
        }

        @Override // com.hp.hpl.sparta.Document.Observer
        public synchronized void update(com.hp.hpl.sparta.Document document) {
            this.dict_ = null;
        }

        private void regenerate() throws com.hp.hpl.sparta.ParseException {
            try {
                this.dict_ = com.hp.hpl.sparta.Sparta.newCache();
                java.util.Enumeration resultEnumeration = com.hp.hpl.sparta.Document.this.visitor(this.xpath_, false).getResultEnumeration();
                while (resultEnumeration.hasMoreElements()) {
                    com.hp.hpl.sparta.Element element = (com.hp.hpl.sparta.Element) resultEnumeration.nextElement();
                    java.lang.String attribute = element.getAttribute(this.attrName_);
                    java.util.Vector vector = (java.util.Vector) this.dict_.get(attribute);
                    if (vector == null) {
                        vector = new java.util.Vector(1);
                        this.dict_.put(attribute, vector);
                    }
                    vector.addElement(element);
                }
            } catch (com.hp.hpl.sparta.xpath.XPathException e) {
                throw new com.hp.hpl.sparta.ParseException("XPath problem", e);
            }
        }
    }

    public boolean xpathHasIndex(java.lang.String str) {
        return this.indices_.get(str) != null;
    }

    public com.hp.hpl.sparta.Document.Index xpathGetIndex(java.lang.String str) throws com.hp.hpl.sparta.ParseException {
        try {
            com.hp.hpl.sparta.Document.Index index = (com.hp.hpl.sparta.Document.Index) this.indices_.get(str);
            if (index != null) {
                return index;
            }
            com.hp.hpl.sparta.Document.Index index2 = new com.hp.hpl.sparta.Document.Index(com.hp.hpl.sparta.xpath.XPath.get(str));
            this.indices_.put(str, index2);
            return index2;
        } catch (com.hp.hpl.sparta.xpath.XPathException e) {
            throw new com.hp.hpl.sparta.ParseException("XPath problem", e);
        }
    }

    public void addObserver(com.hp.hpl.sparta.Document.Observer observer) {
        this.observers_.addElement(observer);
    }

    public void deleteObserver(com.hp.hpl.sparta.Document.Observer observer) {
        this.observers_.removeElement(observer);
    }

    @Override // com.hp.hpl.sparta.Node
    public void toString(java.io.Writer writer) throws java.io.IOException {
        this.rootElement_.toString(writer);
    }

    @Override // com.hp.hpl.sparta.Node
    void notifyObservers() {
        java.util.Enumeration elements = this.observers_.elements();
        while (elements.hasMoreElements()) {
            ((com.hp.hpl.sparta.Document.Observer) elements.nextElement()).update(this);
        }
    }

    @Override // com.hp.hpl.sparta.Node
    public void toXml(java.io.Writer writer) throws java.io.IOException {
        writer.write("<?xml version=\"1.0\" ?>\n");
        this.rootElement_.toXml(writer);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.hp.hpl.sparta.Document) {
            return this.rootElement_.equals(((com.hp.hpl.sparta.Document) obj).rootElement_);
        }
        return false;
    }

    @Override // com.hp.hpl.sparta.Node
    protected int computeHashCode() {
        return this.rootElement_.hashCode();
    }
}
