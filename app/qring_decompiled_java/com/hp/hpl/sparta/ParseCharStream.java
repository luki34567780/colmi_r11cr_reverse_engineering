package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
class ParseCharStream implements com.hp.hpl.sparta.ParseSource {
    private static final char[] BEGIN_CDATA;
    private static final char[] BEGIN_ETAG;
    private static final char[] CHARREF_BEGIN;
    private static final char[] COMMENT_BEGIN;
    private static final char[] COMMENT_END;
    private static final boolean DEBUG = true;
    private static final char[] DOCTYPE_BEGIN;
    private static final char[] ENCODING;
    private static final char[] END_CDATA;
    private static final char[] END_EMPTYTAG;
    private static final char[] ENTITY_BEGIN;
    public static final int HISTORY_LENGTH = 100;
    private static final boolean H_DEBUG = false;
    private static final char[] MARKUPDECL_BEGIN;
    private static final int MAX_COMMON_CHAR = 128;
    private static final char[] NDATA;
    private static final char[] PI_BEGIN;
    private static final char[] PUBLIC;
    private static final char[] QU_END;
    private static final char[] SYSTEM;
    private static final int TMP_BUF_SIZE = 255;
    private static final char[] VERSION;
    private static final char[] VERSIONNUM_PUNC_CHARS;
    private static final char[] XML_BEGIN;
    private final int CBUF_SIZE;
    private final char[] cbuf_;
    private int ch_;
    private int curPos_;
    private java.lang.String docTypeName_;
    private final java.lang.String encoding_;
    private int endPos_;
    private final java.util.Hashtable entities_;
    private boolean eos_;
    private final com.hp.hpl.sparta.ParseHandler handler_;
    private final com.hp.hpl.sparta.CharCircBuffer history_;
    private boolean isExternalDtd_;
    private int lineNumber_;
    private final com.hp.hpl.sparta.ParseLog log_;
    private final java.util.Hashtable pes_;
    private final java.io.Reader reader_;
    private java.lang.String systemId_;
    private final char[] tmpBuf_;
    private static final char[] NAME_PUNCT_CHARS = {'.', '-', '_', ':'};
    private static final boolean[] IS_NAME_CHAR = new boolean[128];

    private static boolean isExtender(char c) {
        if (c == 183 || c == 903 || c == 1600 || c == 3654 || c == 3782 || c == 12293 || c == 720 || c == 721 || c == 12445 || c == 12446) {
            return true;
        }
        switch (c) {
            case 12337:
            case 12338:
            case 12339:
            case 12340:
            case 12341:
                return true;
            default:
                switch (c) {
                    case 12540:
                    case 12541:
                    case 12542:
                        return true;
                    default:
                        return false;
                }
        }
    }

    final java.lang.String getHistory() {
        return "";
    }

    public ParseCharStream(java.lang.String str, char[] cArr, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
        this(str, null, cArr, parseLog, str2, parseHandler);
    }

    public ParseCharStream(java.lang.String str, java.io.Reader reader, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
        this(str, reader, null, parseLog, str2, parseHandler);
    }

    public ParseCharStream(java.lang.String str, java.io.Reader reader, char[] cArr, com.hp.hpl.sparta.ParseLog parseLog, java.lang.String str2, com.hp.hpl.sparta.ParseHandler parseHandler) throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
        this.docTypeName_ = null;
        java.util.Hashtable hashtable = new java.util.Hashtable();
        this.entities_ = hashtable;
        this.pes_ = new java.util.Hashtable();
        this.ch_ = -2;
        this.isExternalDtd_ = false;
        this.CBUF_SIZE = com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2;
        this.curPos_ = 0;
        this.endPos_ = 0;
        this.eos_ = false;
        this.tmpBuf_ = new char[255];
        this.lineNumber_ = -1;
        this.lineNumber_ = 1;
        this.history_ = null;
        parseLog = parseLog == null ? DEFAULT_LOG : parseLog;
        this.log_ = parseLog;
        this.encoding_ = str2 == null ? null : str2.toLowerCase();
        hashtable.put("lt", "<");
        hashtable.put("gt", ">");
        hashtable.put("amp", "&");
        hashtable.put("apos", "'");
        hashtable.put("quot", "\"");
        if (cArr != null) {
            this.cbuf_ = cArr;
            this.curPos_ = 0;
            this.endPos_ = cArr.length;
            this.eos_ = true;
            this.reader_ = null;
        } else {
            this.reader_ = reader;
            this.cbuf_ = new char[com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.REALTIME_EQ_2];
            fillBuf();
        }
        this.systemId_ = str;
        this.handler_ = parseHandler;
        parseHandler.setParseSource(this);
        readProlog();
        parseHandler.startDocument();
        com.hp.hpl.sparta.Element readElement = readElement();
        java.lang.String str3 = this.docTypeName_;
        if (str3 != null && !str3.equals(readElement.getTagName())) {
            parseLog.warning("DOCTYPE name \"" + this.docTypeName_ + "\" not same as tag name, \"" + readElement.getTagName() + "\" of root element", this.systemId_, getLineNumber());
        }
        while (isMisc()) {
            readMisc();
        }
        java.io.Reader reader2 = this.reader_;
        if (reader2 != null) {
            reader2.close();
        }
        this.handler_.endDocument();
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public java.lang.String toString() {
        return this.systemId_;
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public java.lang.String getSystemId() {
        return this.systemId_;
    }

    @Override // com.hp.hpl.sparta.ParseSource
    public int getLineNumber() {
        return this.lineNumber_;
    }

    int getLastCharRead() {
        return this.ch_;
    }

    private int fillBuf() throws java.io.IOException {
        if (this.eos_) {
            return -1;
        }
        int i = this.endPos_;
        char[] cArr = this.cbuf_;
        if (i == cArr.length) {
            this.endPos_ = 0;
            this.curPos_ = 0;
        }
        java.io.Reader reader = this.reader_;
        int i2 = this.endPos_;
        int read = reader.read(cArr, i2, cArr.length - i2);
        if (read <= 0) {
            this.eos_ = true;
            return -1;
        }
        this.endPos_ += read;
        return read;
    }

    private int fillBuf(int i) throws java.io.IOException {
        int i2;
        int i3;
        if (this.eos_) {
            return -1;
        }
        int i4 = 0;
        if (this.cbuf_.length - this.curPos_ < i) {
            int i5 = 0;
            while (true) {
                i2 = this.curPos_;
                int i6 = i2 + i5;
                i3 = this.endPos_;
                if (i6 >= i3) {
                    break;
                }
                char[] cArr = this.cbuf_;
                cArr[i5] = cArr[i2 + i5];
                i5++;
            }
            int i7 = i3 - i2;
            this.endPos_ = i7;
            this.curPos_ = 0;
            i4 = i7;
        }
        int fillBuf = fillBuf();
        if (fillBuf != -1) {
            return i4 + fillBuf;
        }
        if (i4 == 0) {
            return -1;
        }
        return i4;
    }

    private final char readChar() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (this.curPos_ >= this.endPos_ && fillBuf() == -1) {
            throw new com.hp.hpl.sparta.ParseException(this, "unexpected end of expression.");
        }
        char[] cArr = this.cbuf_;
        int i = this.curPos_;
        if (cArr[i] == '\n') {
            this.lineNumber_++;
        }
        this.curPos_ = i + 1;
        return cArr[i];
    }

    private final char peekChar() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (this.curPos_ < this.endPos_ || fillBuf() != -1) {
            return this.cbuf_[this.curPos_];
        }
        throw new com.hp.hpl.sparta.ParseException(this, "unexpected end of expression.");
    }

    private final void readChar(char c) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char readChar = readChar();
        if (readChar != c) {
            throw new com.hp.hpl.sparta.ParseException(this, readChar, c);
        }
    }

    private final boolean isChar(char c) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (this.curPos_ < this.endPos_ || fillBuf() != -1) {
            return this.cbuf_[this.curPos_] == c;
        }
        throw new com.hp.hpl.sparta.ParseException(this, "unexpected end of expression.");
    }

    private final char readChar(char c, char c2) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char readChar = readChar();
        if (readChar == c || readChar == c2) {
            return readChar;
        }
        throw new com.hp.hpl.sparta.ParseException(this, readChar, new char[]{c, c2});
    }

    private final char readChar(char c, char c2, char c3, char c4) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char readChar = readChar();
        if (readChar == c || readChar == c2 || readChar == c3 || readChar == c4) {
            return readChar;
        }
        throw new com.hp.hpl.sparta.ParseException(this, readChar, new char[]{c, c2, c3, c4});
    }

    private final boolean isChar(char c, char c2) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (this.curPos_ >= this.endPos_ && fillBuf() == -1) {
            return false;
        }
        char c3 = this.cbuf_[this.curPos_];
        return c3 == c || c3 == c2;
    }

    private final boolean isChar(char c, char c2, char c3, char c4) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (this.curPos_ >= this.endPos_ && fillBuf() == -1) {
            return false;
        }
        char c5 = this.cbuf_[this.curPos_];
        return c5 == c || c5 == c2 || c5 == c3 || c5 == c4;
    }

    private static final boolean isIn(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    private final void readS() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readChar(' ', '\t', '\r', '\n');
        while (isChar(' ', '\t', '\r', '\n')) {
            readChar();
        }
    }

    private final boolean isS() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isChar(' ', '\t', '\r', '\n');
    }

    static {
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            IS_NAME_CHAR[c] = isNameChar(c);
        }
        COMMENT_BEGIN = "<!--".toCharArray();
        COMMENT_END = "-->".toCharArray();
        PI_BEGIN = "<?".toCharArray();
        QU_END = "?>".toCharArray();
        DOCTYPE_BEGIN = "<!DOCTYPE".toCharArray();
        XML_BEGIN = "<?xml".toCharArray();
        ENCODING = "encoding".toCharArray();
        VERSION = "version".toCharArray();
        VERSIONNUM_PUNC_CHARS = new char[]{'_', '.', ':', '-'};
        MARKUPDECL_BEGIN = "<!".toCharArray();
        CHARREF_BEGIN = "&#".toCharArray();
        ENTITY_BEGIN = "<!ENTITY".toCharArray();
        NDATA = "NDATA".toCharArray();
        SYSTEM = "SYSTEM".toCharArray();
        PUBLIC = "PUBLIC".toCharArray();
        BEGIN_CDATA = "<![CDATA[".toCharArray();
        END_CDATA = "]]>".toCharArray();
        END_EMPTYTAG = "/>".toCharArray();
        BEGIN_ETAG = "</".toCharArray();
    }

    private boolean isNameChar() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char peekChar = peekChar();
        return peekChar < 128 ? IS_NAME_CHAR[peekChar] : isNameChar(peekChar);
    }

    private static boolean isLetter(char c) {
        return "abcdefghijklmnopqrstuvwxyz".indexOf(java.lang.Character.toLowerCase(c)) != -1;
    }

    private static boolean isNameChar(char c) {
        return java.lang.Character.isDigit(c) || isLetter(c) || isIn(c, NAME_PUNCT_CHARS) || isExtender(c);
    }

    private final java.lang.String readName() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        this.tmpBuf_[0] = readNameStartChar();
        int i = 1;
        java.lang.StringBuffer stringBuffer = null;
        while (isNameChar()) {
            if (i >= 255) {
                if (stringBuffer == null) {
                    stringBuffer = new java.lang.StringBuffer(i);
                    stringBuffer.append(this.tmpBuf_, 0, i);
                } else {
                    stringBuffer.append(this.tmpBuf_, 0, i);
                }
                i = 0;
            }
            this.tmpBuf_[i] = readChar();
            i++;
        }
        if (stringBuffer == null) {
            return com.hp.hpl.sparta.Sparta.intern(new java.lang.String(this.tmpBuf_, 0, i));
        }
        stringBuffer.append(this.tmpBuf_, 0, i);
        return stringBuffer.toString();
    }

    private char readNameStartChar() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char readChar = readChar();
        if (isLetter(readChar) || readChar == '_' || readChar == ':') {
            return readChar;
        }
        throw new com.hp.hpl.sparta.ParseException(this, readChar, "letter, underscore, colon");
    }

    private final java.lang.String readEntityValue() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char readChar = readChar('\'', '\"');
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (!isChar(readChar)) {
            if (isPeReference()) {
                stringBuffer.append(readPeReference());
            } else if (isReference()) {
                stringBuffer.append(readReference());
            } else {
                stringBuffer.append(readChar());
            }
        }
        readChar(readChar);
        return stringBuffer.toString();
    }

    private final boolean isEntityValue() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isChar('\'', '\"');
    }

    private final void readSystemLiteral() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char readChar = readChar();
        while (peekChar() != readChar) {
            readChar();
        }
        readChar(readChar);
    }

    private final void readPubidLiteral() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readSystemLiteral();
    }

    private boolean isMisc() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isComment() || isPi() || isS();
    }

    private void readMisc() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (isComment()) {
            readComment();
        } else if (isPi()) {
            readPi();
        } else {
            if (isS()) {
                readS();
                return;
            }
            throw new com.hp.hpl.sparta.ParseException(this, "expecting comment or processing instruction or space");
        }
    }

    private final void readComment() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readSymbol(COMMENT_BEGIN);
        while (true) {
            char[] cArr = COMMENT_END;
            if (!isSymbol(cArr)) {
                readChar();
            } else {
                readSymbol(cArr);
                return;
            }
        }
    }

    private final boolean isComment() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(COMMENT_BEGIN);
    }

    private final void readPi() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readSymbol(PI_BEGIN);
        while (true) {
            char[] cArr = QU_END;
            if (!isSymbol(cArr)) {
                readChar();
            } else {
                readSymbol(cArr);
                return;
            }
        }
    }

    private final boolean isPi() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(PI_BEGIN);
    }

    private void readProlog() throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
        if (isXmlDecl()) {
            readXmlDecl();
        }
        while (isMisc()) {
            readMisc();
        }
        if (isDocTypeDecl()) {
            readDocTypeDecl();
            while (isMisc()) {
                readMisc();
            }
        }
    }

    private boolean isDocTypeDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(DOCTYPE_BEGIN);
    }

    private void readXmlDecl() throws com.hp.hpl.sparta.ParseException, com.hp.hpl.sparta.EncodingMismatchException, java.io.IOException {
        readSymbol(XML_BEGIN);
        readVersionInfo();
        if (isS()) {
            readS();
        }
        if (isEncodingDecl()) {
            java.lang.String readEncodingDecl = readEncodingDecl();
            if (this.encoding_ != null && !readEncodingDecl.toLowerCase().equals(this.encoding_)) {
                throw new com.hp.hpl.sparta.EncodingMismatchException(this.systemId_, readEncodingDecl, this.encoding_);
            }
        }
        while (true) {
            char[] cArr = QU_END;
            if (!isSymbol(cArr)) {
                readChar();
            } else {
                readSymbol(cArr);
                return;
            }
        }
    }

    private boolean isXmlDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(XML_BEGIN);
    }

    private boolean isEncodingDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(ENCODING);
    }

    private java.lang.String readEncodingDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readSymbol(ENCODING);
        readEq();
        char readChar = readChar('\'', '\"');
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (!isChar(readChar)) {
            stringBuffer.append(readChar());
        }
        readChar(readChar);
        return stringBuffer.toString();
    }

    private void readVersionInfo() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readS();
        readSymbol(VERSION);
        readEq();
        char readChar = readChar('\'', '\"');
        readVersionNum();
        readChar(readChar);
    }

    private final void readEq() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (isS()) {
            readS();
        }
        readChar('=');
        if (isS()) {
            readS();
        }
    }

    private boolean isVersionNumChar() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char peekChar = peekChar();
        return java.lang.Character.isDigit(peekChar) || ('a' <= peekChar && peekChar <= 'z') || (('Z' <= peekChar && peekChar <= 'Z') || isIn(peekChar, VERSIONNUM_PUNC_CHARS));
    }

    private void readVersionNum() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readChar();
        while (isVersionNumChar()) {
            readChar();
        }
    }

    private void readDocTypeDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readSymbol(DOCTYPE_BEGIN);
        readS();
        this.docTypeName_ = readName();
        if (isS()) {
            readS();
            if (!isChar('>') && !isChar('[')) {
                this.isExternalDtd_ = true;
                readExternalId();
                if (isS()) {
                    readS();
                }
            }
        }
        if (isChar('[')) {
            readChar();
            while (!isChar(']')) {
                if (isDeclSep()) {
                    readDeclSep();
                } else {
                    readMarkupDecl();
                }
            }
            readChar(']');
            if (isS()) {
                readS();
            }
        }
        readChar('>');
    }

    private void readDeclSep() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (isPeReference()) {
            readPeReference();
        } else {
            readS();
        }
    }

    private boolean isDeclSep() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isPeReference() || isS();
    }

    private void readMarkupDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        if (isPi()) {
            readPi();
            return;
        }
        if (isComment()) {
            readComment();
            return;
        }
        if (isEntityDecl()) {
            readEntityDecl();
            return;
        }
        if (isSymbol(MARKUPDECL_BEGIN)) {
            while (!isChar('>')) {
                if (isChar('\'', '\"')) {
                    char readChar = readChar();
                    while (!isChar(readChar)) {
                        readChar();
                    }
                    readChar(readChar);
                } else {
                    readChar();
                }
            }
            readChar('>');
            return;
        }
        throw new com.hp.hpl.sparta.ParseException(this, "expecting processing instruction, comment, or \"<!\"");
    }

    private char readCharRef() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        int i;
        readSymbol(CHARREF_BEGIN);
        if (isChar('x')) {
            readChar();
            i = 16;
        } else {
            i = 10;
        }
        int i2 = 0;
        while (!isChar(';')) {
            int i3 = i2 + 1;
            this.tmpBuf_[i2] = readChar();
            if (i3 >= 255) {
                this.log_.warning("Tmp buffer overflow on readCharRef", this.systemId_, getLineNumber());
                return ' ';
            }
            i2 = i3;
        }
        readChar(';');
        java.lang.String str = new java.lang.String(this.tmpBuf_, 0, i2);
        try {
            return (char) java.lang.Integer.parseInt(str, i);
        } catch (java.lang.NumberFormatException unused) {
            com.hp.hpl.sparta.ParseLog parseLog = this.log_;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("\"");
            sb.append(str);
            sb.append("\" is not a valid ");
            sb.append(i == 16 ? "hexadecimal" : "decimal");
            sb.append(" number");
            parseLog.warning(sb.toString(), this.systemId_, getLineNumber());
            return ' ';
        }
    }

    private final char[] readReference() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(CHARREF_BEGIN) ? new char[]{readCharRef()} : readEntityRef().toCharArray();
    }

    private final boolean isReference() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isChar('&');
    }

    private java.lang.String readEntityRef() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readChar('&');
        java.lang.String readName = readName();
        java.lang.String str = (java.lang.String) this.entities_.get(readName);
        if (str == null) {
            if (this.isExternalDtd_) {
                this.log_.warning("&" + readName + "; not found -- possibly defined in external DTD)", this.systemId_, getLineNumber());
            } else {
                this.log_.warning("No declaration of &" + readName + ";", this.systemId_, getLineNumber());
            }
            str = "";
        }
        readChar(';');
        return str;
    }

    private java.lang.String readPeReference() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readChar('%');
        java.lang.String readName = readName();
        java.lang.String str = (java.lang.String) this.pes_.get(readName);
        if (str == null) {
            this.log_.warning("No declaration of %" + readName + ";", this.systemId_, getLineNumber());
            str = "";
        }
        readChar(';');
        return str;
    }

    private boolean isPeReference() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isChar('%');
    }

    private void readEntityDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        java.lang.String readExternalId;
        java.lang.String readExternalId2;
        readSymbol(ENTITY_BEGIN);
        readS();
        if (isChar('%')) {
            readChar('%');
            readS();
            java.lang.String readName = readName();
            readS();
            if (isEntityValue()) {
                readExternalId2 = readEntityValue();
            } else {
                readExternalId2 = readExternalId();
            }
            this.pes_.put(readName, readExternalId2);
        } else {
            java.lang.String readName2 = readName();
            readS();
            if (isEntityValue()) {
                readExternalId = readEntityValue();
            } else if (isExternalId()) {
                readExternalId = readExternalId();
                if (isS()) {
                    readS();
                }
                char[] cArr = NDATA;
                if (isSymbol(cArr)) {
                    readSymbol(cArr);
                    readS();
                    readName();
                }
            } else {
                throw new com.hp.hpl.sparta.ParseException(this, "expecting double-quote, \"PUBLIC\" or \"SYSTEM\" while reading entity declaration");
            }
            this.entities_.put(readName2, readExternalId);
        }
        if (isS()) {
            readS();
        }
        readChar('>');
    }

    private boolean isEntityDecl() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(ENTITY_BEGIN);
    }

    private java.lang.String readExternalId() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char[] cArr = SYSTEM;
        if (isSymbol(cArr)) {
            readSymbol(cArr);
        } else {
            char[] cArr2 = PUBLIC;
            if (isSymbol(cArr2)) {
                readSymbol(cArr2);
                readS();
                readPubidLiteral();
            } else {
                throw new com.hp.hpl.sparta.ParseException(this, "expecting \"SYSTEM\" or \"PUBLIC\" while reading external ID");
            }
        }
        readS();
        readSystemLiteral();
        return "(WARNING: external ID not read)";
    }

    private boolean isExternalId() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(SYSTEM) || isSymbol(PUBLIC);
    }

    private final void readSymbol(char[] cArr) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        int length = cArr.length;
        if (this.endPos_ - this.curPos_ < length && fillBuf(length) <= 0) {
            this.ch_ = -1;
            throw new com.hp.hpl.sparta.ParseException(this, "end of XML file", cArr);
        }
        char[] cArr2 = this.cbuf_;
        int i = this.endPos_;
        this.ch_ = cArr2[i - 1];
        if (i - this.curPos_ < length) {
            throw new com.hp.hpl.sparta.ParseException(this, "end of XML file", cArr);
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (this.cbuf_[this.curPos_ + i2] != cArr[i2]) {
                throw new com.hp.hpl.sparta.ParseException(this, new java.lang.String(this.cbuf_, this.curPos_, length), cArr);
            }
        }
        this.curPos_ += length;
    }

    private final boolean isSymbol(char[] cArr) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        int length = cArr.length;
        if (this.endPos_ - this.curPos_ < length && fillBuf(length) <= 0) {
            this.ch_ = -1;
            return false;
        }
        char[] cArr2 = this.cbuf_;
        int i = this.endPos_;
        this.ch_ = cArr2[i - 1];
        if (i - this.curPos_ < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (this.cbuf_[this.curPos_ + i2] != cArr[i2]) {
                return false;
            }
        }
        return true;
    }

    private java.lang.String readAttValue() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char readChar = readChar('\'', '\"');
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (!isChar(readChar)) {
            if (isReference()) {
                stringBuffer.append(readReference());
            } else {
                stringBuffer.append(readChar());
            }
        }
        readChar(readChar);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r4.handler_.characters(r4.tmpBuf_, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readPossibleCharData() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            r2 = 60
            boolean r2 = r4.isChar(r2)
            if (r2 != 0) goto L48
            r2 = 38
            boolean r2 = r4.isChar(r2)
            if (r2 != 0) goto L48
            char[] r2 = com.hp.hpl.sparta.ParseCharStream.END_CDATA
            boolean r2 = r4.isSymbol(r2)
            if (r2 != 0) goto L48
            char[] r2 = r4.tmpBuf_
            char r3 = r4.readChar()
            r2[r1] = r3
            char[] r2 = r4.tmpBuf_
            char r2 = r2[r1]
            r3 = 13
            if (r2 != r3) goto L3a
            char r2 = r4.peekChar()
            r3 = 10
            if (r2 != r3) goto L3a
            char[] r2 = r4.tmpBuf_
            char r3 = r4.readChar()
            r2[r1] = r3
        L3a:
            int r1 = r1 + 1
            r2 = 255(0xff, float:3.57E-43)
            if (r1 != r2) goto L2
            com.hp.hpl.sparta.ParseHandler r1 = r4.handler_
            char[] r3 = r4.tmpBuf_
            r1.characters(r3, r0, r2)
            goto L1
        L48:
            if (r1 <= 0) goto L51
            com.hp.hpl.sparta.ParseHandler r2 = r4.handler_
            char[] r3 = r4.tmpBuf_
            r2.characters(r3, r0, r1)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hp.hpl.sparta.ParseCharStream.readPossibleCharData():void");
    }

    private void readCdSect() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        char[] cArr;
        readSymbol(BEGIN_CDATA);
        java.lang.StringBuffer stringBuffer = null;
        int i = 0;
        while (true) {
            cArr = END_CDATA;
            if (isSymbol(cArr)) {
                break;
            }
            if (i >= 255) {
                if (stringBuffer == null) {
                    stringBuffer = new java.lang.StringBuffer(i);
                    stringBuffer.append(this.tmpBuf_, 0, i);
                } else {
                    stringBuffer.append(this.tmpBuf_, 0, i);
                }
                i = 0;
            }
            this.tmpBuf_[i] = readChar();
            i++;
        }
        readSymbol(cArr);
        if (stringBuffer != null) {
            stringBuffer.append(this.tmpBuf_, 0, i);
            char[] charArray = stringBuffer.toString().toCharArray();
            this.handler_.characters(charArray, 0, charArray.length);
            return;
        }
        this.handler_.characters(this.tmpBuf_, 0, i);
    }

    private boolean isCdSect() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(BEGIN_CDATA);
    }

    private final com.hp.hpl.sparta.Element readElement() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        com.hp.hpl.sparta.Element element = new com.hp.hpl.sparta.Element();
        boolean readEmptyElementTagOrSTag = readEmptyElementTagOrSTag(element);
        this.handler_.startElement(element);
        if (readEmptyElementTagOrSTag) {
            readContent();
            readETag(element);
        }
        this.handler_.endElement(element);
        return element;
    }

    com.hp.hpl.sparta.ParseLog getLog() {
        return this.log_;
    }

    private boolean readEmptyElementTagOrSTag(com.hp.hpl.sparta.Element element) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readChar('<');
        element.setTagName(readName());
        while (isS()) {
            readS();
            if (!isChar('/', '>')) {
                readAttribute(element);
            }
        }
        if (isS()) {
            readS();
        }
        boolean isChar = isChar('>');
        if (isChar) {
            readChar('>');
        } else {
            readSymbol(END_EMPTYTAG);
        }
        return isChar;
    }

    private void readAttribute(com.hp.hpl.sparta.Element element) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        java.lang.String readName = readName();
        readEq();
        java.lang.String readAttValue = readAttValue();
        if (element.getAttribute(readName) != null) {
            this.log_.warning("Element " + this + " contains attribute " + readName + "more than once", this.systemId_, getLineNumber());
        }
        element.setAttribute(readName, readAttValue);
    }

    private void readETag(com.hp.hpl.sparta.Element element) throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readSymbol(BEGIN_ETAG);
        java.lang.String readName = readName();
        if (!readName.equals(element.getTagName())) {
            this.log_.warning("end tag (" + readName + ") does not match begin tag (" + element.getTagName() + ")", this.systemId_, getLineNumber());
        }
        if (isS()) {
            readS();
        }
        readChar('>');
    }

    private boolean isETag() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        return isSymbol(BEGIN_ETAG);
    }

    private void readContent() throws com.hp.hpl.sparta.ParseException, java.io.IOException {
        readPossibleCharData();
        boolean z = true;
        while (z) {
            if (!isETag()) {
                if (isReference()) {
                    char[] readReference = readReference();
                    this.handler_.characters(readReference, 0, readReference.length);
                } else if (isCdSect()) {
                    readCdSect();
                } else if (isPi()) {
                    readPi();
                } else if (isComment()) {
                    readComment();
                } else if (isChar('<')) {
                    readElement();
                }
                readPossibleCharData();
            }
            z = false;
            readPossibleCharData();
        }
    }
}
