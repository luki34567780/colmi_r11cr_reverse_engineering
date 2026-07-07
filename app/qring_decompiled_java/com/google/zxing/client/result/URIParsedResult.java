package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class URIParsedResult extends com.google.zxing.client.result.ParsedResult {
    private static final java.util.regex.Pattern USER_IN_HOST = java.util.regex.Pattern.compile(":/*([^/@]+)@[^/]+");
    private final java.lang.String title;
    private final java.lang.String uri;

    public URIParsedResult(java.lang.String str, java.lang.String str2) {
        super(com.google.zxing.client.result.ParsedResultType.URI);
        this.uri = massageURI(str);
        this.title = str2;
    }

    public java.lang.String getURI() {
        return this.uri;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public boolean isPossiblyMaliciousURI() {
        return USER_IN_HOST.matcher(this.uri).find();
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public java.lang.String getDisplayResult() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        maybeAppend(this.title, sb);
        maybeAppend(this.uri, sb);
        return sb.toString();
    }

    private static java.lang.String massageURI(java.lang.String str) {
        java.lang.String trim = str.trim();
        int indexOf = trim.indexOf(58);
        return (indexOf < 0 || isColonFollowedByPortNumber(trim, indexOf)) ? "http://".concat(java.lang.String.valueOf(trim)) : trim;
    }

    private static boolean isColonFollowedByPortNumber(java.lang.String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return com.google.zxing.client.result.ResultParser.isSubstringOfDigits(str, i2, indexOf - i2);
    }
}
