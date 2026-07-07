package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class EmailDoCoMoResultParser extends com.google.zxing.client.result.AbstractDoCoMoResultParser {
    private static final java.util.regex.Pattern ATEXT_ALPHANUMERIC = java.util.regex.Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.EmailAddressParsedResult parse(com.google.zxing.Result result) {
        java.lang.String[] matchDoCoMoPrefixedField;
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("MATMSG:") || (matchDoCoMoPrefixedField = matchDoCoMoPrefixedField("TO:", massagedText, true)) == null) {
            return null;
        }
        for (java.lang.String str : matchDoCoMoPrefixedField) {
            if (!isBasicallyValidEmailAddress(str)) {
                return null;
            }
        }
        return new com.google.zxing.client.result.EmailAddressParsedResult(matchDoCoMoPrefixedField, null, null, matchSingleDoCoMoPrefixedField("SUB:", massagedText, false), matchSingleDoCoMoPrefixedField("BODY:", massagedText, false));
    }

    static boolean isBasicallyValidEmailAddress(java.lang.String str) {
        return str != null && ATEXT_ALPHANUMERIC.matcher(str).matches() && str.indexOf(64) >= 0;
    }
}
