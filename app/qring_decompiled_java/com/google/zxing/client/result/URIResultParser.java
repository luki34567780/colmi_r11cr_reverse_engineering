package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class URIResultParser extends com.google.zxing.client.result.ResultParser {
    private static final java.util.regex.Pattern URL_WITH_PROTOCOL_PATTERN = java.util.regex.Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");
    private static final java.util.regex.Pattern URL_WITHOUT_PROTOCOL_PATTERN = java.util.regex.Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.URIParsedResult parse(com.google.zxing.Result result) {
        java.lang.String massagedText = getMassagedText(result);
        if (massagedText.startsWith("URL:") || massagedText.startsWith("URI:")) {
            return new com.google.zxing.client.result.URIParsedResult(massagedText.substring(4).trim(), null);
        }
        java.lang.String trim = massagedText.trim();
        if (isBasicallyValidURI(trim)) {
            return new com.google.zxing.client.result.URIParsedResult(trim, null);
        }
        return null;
    }

    static boolean isBasicallyValidURI(java.lang.String str) {
        if (str.contains(" ")) {
            return false;
        }
        java.util.regex.Matcher matcher = URL_WITH_PROTOCOL_PATTERN.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        java.util.regex.Matcher matcher2 = URL_WITHOUT_PROTOCOL_PATTERN.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }
}
