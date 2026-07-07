package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public interface ParseHandler {
    void characters(char[] cArr, int i, int i2) throws com.hp.hpl.sparta.ParseException;

    void endDocument() throws com.hp.hpl.sparta.ParseException;

    void endElement(com.hp.hpl.sparta.Element element) throws com.hp.hpl.sparta.ParseException;

    com.hp.hpl.sparta.ParseSource getParseSource();

    void setParseSource(com.hp.hpl.sparta.ParseSource parseSource);

    void startDocument() throws com.hp.hpl.sparta.ParseException;

    void startElement(com.hp.hpl.sparta.Element element) throws com.hp.hpl.sparta.ParseException;
}
