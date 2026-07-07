package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class SimpleStreamTokenizer {
    private static final int QUOTE = -6;
    public static final int TT_EOF = -1;
    public static final int TT_NUMBER = -2;
    public static final int TT_WORD = -3;
    private static final int WHITESPACE = -5;
    private int nextType_;
    private final java.io.Reader reader_;
    public int ttype = com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
    public int nval = com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
    public java.lang.String sval = "";
    private final java.lang.StringBuffer buf_ = new java.lang.StringBuffer();
    private final int[] charType_ = new int[256];
    private boolean pushedBack_ = false;
    private char inQuote_ = 0;

    public java.lang.String toString() {
        int i = this.ttype;
        if (i != -3) {
            if (i == -2) {
                return java.lang.Integer.toString(this.nval);
            }
            if (i == -1) {
                return "(EOF)";
            }
            if (i != 34) {
                if (i == 39) {
                    return "'" + this.sval + "'";
                }
                return "'" + ((char) this.ttype) + "'";
            }
        }
        return "\"" + this.sval + "\"";
    }

    public SimpleStreamTokenizer(java.io.Reader reader) throws java.io.IOException {
        char c = 0;
        this.reader_ = reader;
        while (true) {
            int[] iArr = this.charType_;
            if (c >= iArr.length) {
                nextToken();
                return;
            }
            if (('A' <= c && c <= 'Z') || (('a' <= c && c <= 'z') || c == '-')) {
                iArr[c] = -3;
            } else if ('0' <= c && c <= '9') {
                iArr[c] = -2;
            } else if (c >= 0 && c <= ' ') {
                iArr[c] = -5;
            } else {
                iArr[c] = c;
            }
            c = (char) (c + 1);
        }
    }

    public void ordinaryChar(char c) {
        this.charType_[c] = c;
    }

    public void wordChars(char c, char c2) {
        while (c <= c2) {
            this.charType_[c] = -3;
            c = (char) (c + 1);
        }
    }

    public int nextToken() throws java.io.IOException {
        int read;
        int i;
        char c;
        boolean z;
        boolean z2;
        int i2;
        if (this.pushedBack_) {
            this.pushedBack_ = false;
            return this.ttype;
        }
        this.ttype = this.nextType_;
        do {
            boolean z3 = false;
            do {
                read = this.reader_.read();
                if (read == -1) {
                    if (this.inQuote_ != 0) {
                        throw new java.io.IOException("Unterminated quote");
                    }
                    i = -1;
                } else {
                    i = this.charType_[read];
                }
                c = this.inQuote_;
                z = c == 0 && i == -5;
                z3 = z3 || z;
            } while (z);
            if (i == 39 || i == 34) {
                if (c == 0) {
                    this.inQuote_ = (char) i;
                } else if (c == i) {
                    this.inQuote_ = (char) 0;
                }
            }
            char c2 = this.inQuote_;
            if (c2 != 0) {
                i = c2;
            }
            z2 = z3 || !(((i2 = this.ttype) < -1 || i2 == 39 || i2 == 34) && i2 == i);
            if (z2) {
                int i3 = this.ttype;
                if (i3 == -3) {
                    this.sval = this.buf_.toString();
                    this.buf_.setLength(0);
                } else if (i3 == -2) {
                    this.nval = java.lang.Integer.parseInt(this.buf_.toString());
                    this.buf_.setLength(0);
                } else if (i3 == 34 || i3 == 39) {
                    this.sval = this.buf_.toString().substring(1, this.buf_.length() - 1);
                    this.buf_.setLength(0);
                }
                if (i != -5) {
                    this.nextType_ = i == -6 ? read : i;
                }
            }
            if (i == -3 || i == -2 || i == 34 || i == 39) {
                this.buf_.append((char) read);
            }
        } while (!z2);
        return this.ttype;
    }

    public void pushBack() {
        this.pushedBack_ = true;
    }
}
