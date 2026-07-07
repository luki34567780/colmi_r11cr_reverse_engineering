package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class EmailAddressResultParser extends com.google.zxing.client.result.ResultParser {
    private static final java.util.regex.Pattern COMMA = java.util.regex.Pattern.compile(",");

    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.EmailAddressParsedResult parse(com.google.zxing.Result result) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.String[] strArr3;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String massagedText = getMassagedText(result);
        if (massagedText.startsWith("mailto:") || massagedText.startsWith("MAILTO:")) {
            java.lang.String substring = massagedText.substring(7);
            int indexOf = substring.indexOf(63);
            if (indexOf >= 0) {
                substring = substring.substring(0, indexOf);
            }
            try {
                java.lang.String urlDecode = urlDecode(substring);
                java.lang.String[] split = !urlDecode.isEmpty() ? COMMA.split(urlDecode) : null;
                java.util.Map<java.lang.String, java.lang.String> parseNameValuePairs = parseNameValuePairs(massagedText);
                if (parseNameValuePairs != null) {
                    if (split == null && (str3 = parseNameValuePairs.get("to")) != null) {
                        split = COMMA.split(str3);
                    }
                    java.lang.String str4 = parseNameValuePairs.get("cc");
                    java.lang.String[] split2 = str4 != null ? COMMA.split(str4) : null;
                    java.lang.String str5 = parseNameValuePairs.get("bcc");
                    java.lang.String[] split3 = str5 != null ? COMMA.split(str5) : null;
                    java.lang.String str6 = parseNameValuePairs.get("subject");
                    str2 = parseNameValuePairs.get("body");
                    strArr = split;
                    strArr3 = split3;
                    strArr2 = split2;
                    str = str6;
                } else {
                    strArr = split;
                    strArr2 = null;
                    strArr3 = null;
                    str = null;
                    str2 = null;
                }
                return new com.google.zxing.client.result.EmailAddressParsedResult(strArr, strArr2, strArr3, str, str2);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        if (com.google.zxing.client.result.EmailDoCoMoResultParser.isBasicallyValidEmailAddress(massagedText)) {
            return new com.google.zxing.client.result.EmailAddressParsedResult(massagedText);
        }
        return null;
    }
}
