package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class DefaultParseHandler implements com.hp.hpl.sparta.ParseHandler {
    private com.hp.hpl.sparta.ParseSource parseSource_ = null;

    @Override // com.hp.hpl.sparta.ParseHandler
    public void characters(char[] cArr, int i, int i2) throws com.hp.hpl.sparta.ParseException {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void endDocument() throws com.hp.hpl.sparta.ParseException {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void endElement(com.hp.hpl.sparta.Element element) throws com.hp.hpl.sparta.ParseException {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void startDocument() throws com.hp.hpl.sparta.ParseException {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void startElement(com.hp.hpl.sparta.Element element) throws com.hp.hpl.sparta.ParseException {
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public void setParseSource(com.hp.hpl.sparta.ParseSource parseSource) {
        this.parseSource_ = parseSource;
    }

    @Override // com.hp.hpl.sparta.ParseHandler
    public com.hp.hpl.sparta.ParseSource getParseSource() {
        return this.parseSource_;
    }
}
