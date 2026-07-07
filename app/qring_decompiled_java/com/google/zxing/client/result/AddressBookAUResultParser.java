package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class AddressBookAUResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.AddressBookParsedResult parse(com.google.zxing.Result result) {
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.contains("MEMORY") || !massagedText.contains("\r\n")) {
            return null;
        }
        java.lang.String matchSinglePrefixedField = matchSinglePrefixedField("NAME1:", massagedText, '\r', true);
        java.lang.String matchSinglePrefixedField2 = matchSinglePrefixedField("NAME2:", massagedText, '\r', true);
        java.lang.String[] matchMultipleValuePrefix = matchMultipleValuePrefix("TEL", 3, massagedText, true);
        java.lang.String[] matchMultipleValuePrefix2 = matchMultipleValuePrefix("MAIL", 3, massagedText, true);
        java.lang.String matchSinglePrefixedField3 = matchSinglePrefixedField("MEMORY:", massagedText, '\r', false);
        java.lang.String matchSinglePrefixedField4 = matchSinglePrefixedField("ADD:", massagedText, '\r', true);
        return new com.google.zxing.client.result.AddressBookParsedResult(maybeWrap(matchSinglePrefixedField), null, matchSinglePrefixedField2, matchMultipleValuePrefix, null, matchMultipleValuePrefix2, null, null, matchSinglePrefixedField3, matchSinglePrefixedField4 != null ? new java.lang.String[]{matchSinglePrefixedField4} : null, null, null, null, null, null, null);
    }

    private static java.lang.String[] matchMultipleValuePrefix(java.lang.String str, int i, java.lang.String str2, boolean z) {
        java.util.ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            java.lang.String matchSinglePrefixedField = matchSinglePrefixedField(str + i2 + ':', str2, '\r', z);
            if (matchSinglePrefixedField == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new java.util.ArrayList(i);
            }
            arrayList.add(matchSinglePrefixedField);
        }
        if (arrayList == null) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
}
