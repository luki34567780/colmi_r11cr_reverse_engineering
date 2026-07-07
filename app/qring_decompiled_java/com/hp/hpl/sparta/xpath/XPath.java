package com.hp.hpl.sparta.xpath;

/* loaded from: /tmp/dex/classes2.dex */
public class XPath {
    private static final int ASSERTION = 0;
    private static java.util.Hashtable cache_ = new java.util.Hashtable();
    private boolean absolute_;
    private java.util.Stack steps_;
    private java.lang.String string_;

    private XPath(boolean z, com.hp.hpl.sparta.xpath.Step[] stepArr) {
        this.steps_ = new java.util.Stack();
        for (com.hp.hpl.sparta.xpath.Step step : stepArr) {
            this.steps_.addElement(step);
        }
        this.absolute_ = z;
        this.string_ = null;
    }

    private XPath(java.lang.String str) throws com.hp.hpl.sparta.xpath.XPathException {
        this(str, new java.io.InputStreamReader(new java.io.ByteArrayInputStream(str.getBytes())));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: IOException -> 0x0072, TryCatch #0 {IOException -> 0x0072, blocks: (B:3:0x000a, B:5:0x002d, B:7:0x0035, B:8:0x003d, B:9:0x0047, B:11:0x004b, B:13:0x0051, B:15:0x0057, B:19:0x0062, B:23:0x0068, B:24:0x0071, B:27:0x003a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[Catch: IOException -> 0x0072, TryCatch #0 {IOException -> 0x0072, blocks: (B:3:0x000a, B:5:0x002d, B:7:0x0035, B:8:0x003d, B:9:0x0047, B:11:0x004b, B:13:0x0051, B:15:0x0057, B:19:0x0062, B:23:0x0068, B:24:0x0071, B:27:0x003a), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private XPath(java.lang.String r6, java.io.Reader r7) throws com.hp.hpl.sparta.xpath.XPathException {
        /*
            r5 = this;
            r5.<init>()
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r5.steps_ = r0
            r5.string_ = r6     // Catch: java.io.IOException -> L72
            com.hp.hpl.sparta.xpath.SimpleStreamTokenizer r6 = new com.hp.hpl.sparta.xpath.SimpleStreamTokenizer     // Catch: java.io.IOException -> L72
            r6.<init>(r7)     // Catch: java.io.IOException -> L72
            r7 = 47
            r6.ordinaryChar(r7)     // Catch: java.io.IOException -> L72
            r0 = 46
            r6.ordinaryChar(r0)     // Catch: java.io.IOException -> L72
            r0 = 58
            r6.wordChars(r0, r0)     // Catch: java.io.IOException -> L72
            r0 = 95
            r6.wordChars(r0, r0)     // Catch: java.io.IOException -> L72
            int r0 = r6.nextToken()     // Catch: java.io.IOException -> L72
            r1 = 1
            r2 = 0
            if (r0 != r7) goto L3a
            r5.absolute_ = r1     // Catch: java.io.IOException -> L72
            int r0 = r6.nextToken()     // Catch: java.io.IOException -> L72
            if (r0 != r7) goto L3c
            r6.nextToken()     // Catch: java.io.IOException -> L72
            r0 = 1
            goto L3d
        L3a:
            r5.absolute_ = r2     // Catch: java.io.IOException -> L72
        L3c:
            r0 = 0
        L3d:
            java.util.Stack r3 = r5.steps_     // Catch: java.io.IOException -> L72
            com.hp.hpl.sparta.xpath.Step r4 = new com.hp.hpl.sparta.xpath.Step     // Catch: java.io.IOException -> L72
            r4.<init>(r5, r0, r6)     // Catch: java.io.IOException -> L72
            r3.push(r4)     // Catch: java.io.IOException -> L72
        L47:
            int r0 = r6.ttype     // Catch: java.io.IOException -> L72
            if (r0 != r7) goto L62
            int r0 = r6.nextToken()     // Catch: java.io.IOException -> L72
            if (r0 != r7) goto L56
            r6.nextToken()     // Catch: java.io.IOException -> L72
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            java.util.Stack r3 = r5.steps_     // Catch: java.io.IOException -> L72
            com.hp.hpl.sparta.xpath.Step r4 = new com.hp.hpl.sparta.xpath.Step     // Catch: java.io.IOException -> L72
            r4.<init>(r5, r0, r6)     // Catch: java.io.IOException -> L72
            r3.push(r4)     // Catch: java.io.IOException -> L72
            goto L47
        L62:
            int r7 = r6.ttype     // Catch: java.io.IOException -> L72
            r0 = -1
            if (r7 != r0) goto L68
            return
        L68:
            com.hp.hpl.sparta.xpath.XPathException r7 = new com.hp.hpl.sparta.xpath.XPathException     // Catch: java.io.IOException -> L72
            java.lang.String r0 = "at end of XPATH expression"
            java.lang.String r1 = "end of expression"
            r7.<init>(r5, r0, r6, r1)     // Catch: java.io.IOException -> L72
            throw r7     // Catch: java.io.IOException -> L72
        L72:
            r6 = move-exception
            com.hp.hpl.sparta.xpath.XPathException r7 = new com.hp.hpl.sparta.xpath.XPathException
            r7.<init>(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hp.hpl.sparta.xpath.XPath.<init>(java.lang.String, java.io.Reader):void");
    }

    public java.lang.String toString() {
        if (this.string_ == null) {
            this.string_ = generateString();
        }
        return this.string_;
    }

    private java.lang.String generateString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Enumeration elements = this.steps_.elements();
        boolean z = true;
        while (elements.hasMoreElements()) {
            com.hp.hpl.sparta.xpath.Step step = (com.hp.hpl.sparta.xpath.Step) elements.nextElement();
            if (!z || this.absolute_) {
                stringBuffer.append('/');
                if (step.isMultiLevel()) {
                    stringBuffer.append('/');
                }
            }
            stringBuffer.append(step.toString());
            z = false;
        }
        return stringBuffer.toString();
    }

    public boolean isAbsolute() {
        return this.absolute_;
    }

    public boolean isStringValue() {
        return ((com.hp.hpl.sparta.xpath.Step) this.steps_.peek()).isStringValue();
    }

    public java.util.Enumeration getSteps() {
        return this.steps_.elements();
    }

    public java.lang.String getIndexingAttrName() throws com.hp.hpl.sparta.xpath.XPathException {
        com.hp.hpl.sparta.xpath.BooleanExpr predicate = ((com.hp.hpl.sparta.xpath.Step) this.steps_.peek()).getPredicate();
        if (!(predicate instanceof com.hp.hpl.sparta.xpath.AttrExistsExpr)) {
            throw new com.hp.hpl.sparta.xpath.XPathException(this, "has no indexing attribute name (must end with predicate of the form [@attrName]");
        }
        return ((com.hp.hpl.sparta.xpath.AttrExistsExpr) predicate).getAttrName();
    }

    public java.lang.String getIndexingAttrNameOfEquals() throws com.hp.hpl.sparta.xpath.XPathException {
        com.hp.hpl.sparta.xpath.BooleanExpr predicate = ((com.hp.hpl.sparta.xpath.Step) this.steps_.peek()).getPredicate();
        if (predicate instanceof com.hp.hpl.sparta.xpath.AttrEqualsExpr) {
            return ((com.hp.hpl.sparta.xpath.AttrEqualsExpr) predicate).getAttrName();
        }
        return null;
    }

    public java.lang.Object clone() {
        int size = this.steps_.size();
        com.hp.hpl.sparta.xpath.Step[] stepArr = new com.hp.hpl.sparta.xpath.Step[size];
        java.util.Enumeration elements = this.steps_.elements();
        for (int i = 0; i < size; i++) {
            stepArr[i] = (com.hp.hpl.sparta.xpath.Step) elements.nextElement();
        }
        return new com.hp.hpl.sparta.xpath.XPath(this.absolute_, stepArr);
    }

    public static com.hp.hpl.sparta.xpath.XPath get(java.lang.String str) throws com.hp.hpl.sparta.xpath.XPathException {
        com.hp.hpl.sparta.xpath.XPath xPath;
        synchronized (cache_) {
            xPath = (com.hp.hpl.sparta.xpath.XPath) cache_.get(str);
            if (xPath == null) {
                xPath = new com.hp.hpl.sparta.xpath.XPath(str);
                cache_.put(str, xPath);
            }
        }
        return xPath;
    }

    public static com.hp.hpl.sparta.xpath.XPath get(boolean z, com.hp.hpl.sparta.xpath.Step[] stepArr) {
        com.hp.hpl.sparta.xpath.XPath xPath = new com.hp.hpl.sparta.xpath.XPath(z, stepArr);
        java.lang.String xPath2 = xPath.toString();
        synchronized (cache_) {
            com.hp.hpl.sparta.xpath.XPath xPath3 = (com.hp.hpl.sparta.xpath.XPath) cache_.get(xPath2);
            if (xPath3 != null) {
                return xPath3;
            }
            cache_.put(xPath2, xPath);
            return xPath;
        }
    }

    public static boolean isStringValue(java.lang.String str) throws com.hp.hpl.sparta.xpath.XPathException, java.io.IOException {
        return get(str).isStringValue();
    }
}
