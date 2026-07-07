package com.hp.hpl.sparta;

/* loaded from: /tmp/dex/classes2.dex */
public class Text extends com.hp.hpl.sparta.Node {
    private java.lang.StringBuffer text_;

    public Text(java.lang.String str) {
        this.text_ = new java.lang.StringBuffer(str);
    }

    public Text(char c) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        this.text_ = stringBuffer;
        stringBuffer.append(c);
    }

    @Override // com.hp.hpl.sparta.Node
    public java.lang.Object clone() {
        return new com.hp.hpl.sparta.Text(this.text_.toString());
    }

    public void appendData(java.lang.String str) {
        this.text_.append(str);
        notifyObservers();
    }

    public void appendData(char c) {
        this.text_.append(c);
        notifyObservers();
    }

    public void appendData(char[] cArr, int i, int i2) {
        this.text_.append(cArr, i, i2);
        notifyObservers();
    }

    public java.lang.String getData() {
        return this.text_.toString();
    }

    public void setData(java.lang.String str) {
        this.text_ = new java.lang.StringBuffer(str);
        notifyObservers();
    }

    @Override // com.hp.hpl.sparta.Node
    void toXml(java.io.Writer writer) throws java.io.IOException {
        java.lang.String stringBuffer = this.text_.toString();
        if (stringBuffer.length() < 50) {
            htmlEncode(writer, stringBuffer);
            return;
        }
        writer.write("<![CDATA[");
        writer.write(stringBuffer);
        writer.write("]]>");
    }

    @Override // com.hp.hpl.sparta.Node
    void toString(java.io.Writer writer) throws java.io.IOException {
        writer.write(this.text_.toString());
    }

    @Override // com.hp.hpl.sparta.Node
    public java.util.Enumeration xpathSelectElements(java.lang.String str) {
        throw new java.lang.Error("Sorry, not implemented");
    }

    @Override // com.hp.hpl.sparta.Node
    public java.util.Enumeration xpathSelectStrings(java.lang.String str) {
        throw new java.lang.Error("Sorry, not implemented");
    }

    @Override // com.hp.hpl.sparta.Node
    public com.hp.hpl.sparta.Element xpathSelectElement(java.lang.String str) {
        throw new java.lang.Error("Sorry, not implemented");
    }

    @Override // com.hp.hpl.sparta.Node
    public java.lang.String xpathSelectString(java.lang.String str) {
        throw new java.lang.Error("Sorry, not implemented");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.hp.hpl.sparta.Text) {
            return this.text_.toString().equals(((com.hp.hpl.sparta.Text) obj).text_.toString());
        }
        return false;
    }

    @Override // com.hp.hpl.sparta.Node
    protected int computeHashCode() {
        return this.text_.toString().hashCode();
    }
}
