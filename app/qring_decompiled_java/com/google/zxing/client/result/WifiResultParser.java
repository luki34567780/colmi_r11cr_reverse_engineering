package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class WifiResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.WifiParsedResult parse(com.google.zxing.Result result) {
        java.lang.String substring;
        java.lang.String matchSinglePrefixedField;
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("WIFI:") || (matchSinglePrefixedField = matchSinglePrefixedField("S:", (substring = massagedText.substring(5)), ';', false)) == null || matchSinglePrefixedField.isEmpty()) {
            return null;
        }
        java.lang.String matchSinglePrefixedField2 = matchSinglePrefixedField("P:", substring, ';', false);
        java.lang.String matchSinglePrefixedField3 = matchSinglePrefixedField("T:", substring, ';', false);
        if (matchSinglePrefixedField3 == null) {
            matchSinglePrefixedField3 = "nopass";
        }
        return new com.google.zxing.client.result.WifiParsedResult(matchSinglePrefixedField3, matchSinglePrefixedField, matchSinglePrefixedField2, java.lang.Boolean.parseBoolean(matchSinglePrefixedField("H:", substring, ';', false)), matchSinglePrefixedField("I:", substring, ';', false), matchSinglePrefixedField("A:", substring, ';', false), matchSinglePrefixedField("E:", substring, ';', false), matchSinglePrefixedField("H:", substring, ';', false));
    }
}
