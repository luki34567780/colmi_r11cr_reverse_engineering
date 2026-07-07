package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
class BuildDocument implements com.hp.hpl.sparta.DocumentSource, com.hp.hpl.sparta.ParseHandler {
    private com.hp.hpl.sparta.Element currentElement_;
    private final com.hp.hpl.sparta.Document doc_;
    private final com.hp.hpl.sparta.ParseLog log_;
    private com.hp.hpl.sparta.ParseSource parseSource_;

    @Override // com.hp.hpl.sparta.ParseHandler
    public void endDocument() {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void startDocument() {
    }

    public BuildDocument() {
        this(null);
    }

    public BuildDocument(com.hp.hpl.sparta.ParseLog parseLog) {
        this.currentElement_ = null;
        this.doc_ = new com.hp.hpl.sparta.Document();
        this.parseSource_ = null;
        this.log_ = parseLog == null ? DEFAULT_LOG : parseLog;
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void setParseSource(com.hp.hpl.sparta.ParseSource parseSource) {
        this.parseSource_ = parseSource;
        this.doc_.setSystemId(parseSource.toString());
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public com.hp.hpl.sparta.ParseSource getParseSource() {
        return this.parseSource_;
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public java.lang.String toString() {
        if (this.parseSource_ == null) {
            return null;
        }
        return "BuildDoc: " + this.parseSource_.toString();
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public java.lang.String getSystemId() {
        com.hp.hpl.sparta.ParseSource parseSource = this.parseSource_;
        if (parseSource != null) {
            return parseSource.getSystemId();
        }
        return null;
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public int getLineNumber() {
        com.hp.hpl.sparta.ParseSource parseSource = this.parseSource_;
        if (parseSource != null) {
            return parseSource.getLineNumber();
        }
        return -1;
    }

    @Override // com.hp.hpl.sparta.DocumentSource
    public com.hp.hpl.sparta.Document getDocument() {
        return this.doc_;
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void startElement(com.hp.hpl.sparta.Element element) {
        com.hp.hpl.sparta.Element element2 = this.currentElement_;
        if (element2 == null) {
            this.doc_.setDocumentElement(element);
        } else {
            element2.appendChild(element);
        }
        this.currentElement_ = element;
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void endElement(com.hp.hpl.sparta.Element element) {
        this.currentElement_ = this.currentElement_.getParentNode();
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void characters(char[] cArr, int i, int i2) {
        com.hp.hpl.sparta.Element element = this.currentElement_;
        if (element.getLastChild() instanceof com.hp.hpl.sparta.Text) {
            ((com.hp.hpl.sparta.Text) element.getLastChild()).appendData(cArr, i, i2);
        } else {
            element.appendChildNoChecking(new com.hp.hpl.sparta.Text(new java.lang.String(cArr, i, i2)));
        }
    }
}
