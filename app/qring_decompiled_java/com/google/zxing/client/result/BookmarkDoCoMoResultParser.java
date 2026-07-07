package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class BookmarkDoCoMoResultParser extends com.google.zxing.client.result.AbstractDoCoMoResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.URIParsedResult parse(com.google.zxing.Result result) {
        java.lang.String text = result.getText();
        if (!text.startsWith("MEBKM:")) {
            return null;
        }
        java.lang.String matchSingleDoCoMoPrefixedField = matchSingleDoCoMoPrefixedField("TITLE:", text, true);
        java.lang.String[] matchDoCoMoPrefixedField = matchDoCoMoPrefixedField("URL:", text, true);
        if (matchDoCoMoPrefixedField == null) {
            return null;
        }
        java.lang.String str = matchDoCoMoPrefixedField[0];
        if (com.google.zxing.client.result.URIResultParser.isBasicallyValidURI(str)) {
            return new com.google.zxing.client.result.URIParsedResult(str, matchSingleDoCoMoPrefixedField);
        }
        return null;
    }
}
