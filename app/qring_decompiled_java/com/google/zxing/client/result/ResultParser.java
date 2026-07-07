package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public abstract class ResultParser {
    private static final java.lang.String BYTE_ORDER_MARK = "\ufeff";
    private static final com.google.zxing.client.result.ResultParser[] PARSERS = {new com.google.zxing.client.result.BookmarkDoCoMoResultParser(), new com.google.zxing.client.result.AddressBookDoCoMoResultParser(), new com.google.zxing.client.result.EmailDoCoMoResultParser(), new com.google.zxing.client.result.AddressBookAUResultParser(), new com.google.zxing.client.result.VCardResultParser(), new com.google.zxing.client.result.BizcardResultParser(), new com.google.zxing.client.result.VEventResultParser(), new com.google.zxing.client.result.EmailAddressResultParser(), new com.google.zxing.client.result.SMTPResultParser(), new com.google.zxing.client.result.TelResultParser(), new com.google.zxing.client.result.SMSMMSResultParser(), new com.google.zxing.client.result.SMSTOMMSTOResultParser(), new com.google.zxing.client.result.GeoResultParser(), new com.google.zxing.client.result.WifiResultParser(), new com.google.zxing.client.result.URLTOResultParser(), new com.google.zxing.client.result.URIResultParser(), new com.google.zxing.client.result.ISBNResultParser(), new com.google.zxing.client.result.ProductResultParser(), new com.google.zxing.client.result.ExpandedProductResultParser(), new com.google.zxing.client.result.VINResultParser()};
    private static final java.util.regex.Pattern DIGITS = java.util.regex.Pattern.compile("\\d+");
    private static final java.util.regex.Pattern AMPERSAND = java.util.regex.Pattern.compile("&");
    private static final java.util.regex.Pattern EQUALS = java.util.regex.Pattern.compile("=");

    protected static java.lang.String[] maybeWrap(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new java.lang.String[]{str};
    }

    protected static int parseHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public abstract com.google.zxing.client.result.ParsedResult parse(com.google.zxing.Result result);

    protected static java.lang.String getMassagedText(com.google.zxing.Result result) {
        java.lang.String text = result.getText();
        return text.startsWith(BYTE_ORDER_MARK) ? text.substring(1) : text;
    }

    public static com.google.zxing.client.result.ParsedResult parseResult(com.google.zxing.Result result) {
        for (com.google.zxing.client.result.ResultParser resultParser : PARSERS) {
            com.google.zxing.client.result.ParsedResult parse = resultParser.parse(result);
            if (parse != null) {
                return parse;
            }
        }
        return new com.google.zxing.client.result.TextParsedResult(result.getText(), null);
    }

    protected static void maybeAppend(java.lang.String str, java.lang.StringBuilder sb) {
        if (str != null) {
            sb.append('\n');
            sb.append(str);
        }
    }

    protected static void maybeAppend(java.lang.String[] strArr, java.lang.StringBuilder sb) {
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                sb.append('\n');
                sb.append(str);
            }
        }
    }

    protected static java.lang.String unescapeBackslash(java.lang.String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z || charAt != '\\') {
                sb.append(charAt);
                z = false;
            } else {
                z = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    protected static boolean isStringOfDigits(java.lang.CharSequence charSequence, int i) {
        return charSequence != null && i > 0 && i == charSequence.length() && DIGITS.matcher(charSequence).matches();
    }

    protected static boolean isSubstringOfDigits(java.lang.CharSequence charSequence, int i, int i2) {
        int i3;
        return charSequence != null && i2 > 0 && charSequence.length() >= (i3 = i2 + i) && DIGITS.matcher(charSequence.subSequence(i, i3)).matches();
    }

    static java.util.Map<java.lang.String, java.lang.String> parseNameValuePairs(java.lang.String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap(3);
        for (java.lang.String str2 : AMPERSAND.split(str.substring(indexOf + 1))) {
            appendKeyValue(str2, hashMap);
        }
        return hashMap;
    }

    private static void appendKeyValue(java.lang.CharSequence charSequence, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String[] split = EQUALS.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], urlDecode(split[1]));
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
    }

    static java.lang.String urlDecode(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    static java.lang.String[] matchPrefixedField(java.lang.String str, java.lang.String str2, char c, boolean z) {
        int length = str2.length();
        java.util.ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            java.util.ArrayList arrayList2 = arrayList;
            boolean z2 = true;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (countPrecedingBackslashes(str2, indexOf2) % 2 != 0) {
                    i2 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList(3);
                    }
                    java.lang.String unescapeBackslash = unescapeBackslash(str2.substring(length2, indexOf2));
                    if (z) {
                        unescapeBackslash = unescapeBackslash.trim();
                    }
                    if (!unescapeBackslash.isEmpty()) {
                        arrayList2.add(unescapeBackslash);
                    }
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    private static int countPrecedingBackslashes(java.lang.CharSequence charSequence, int i) {
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0 && charSequence.charAt(i3) == '\\'; i3--) {
            i2++;
        }
        return i2;
    }

    static java.lang.String matchSinglePrefixedField(java.lang.String str, java.lang.String str2, char c, boolean z) {
        java.lang.String[] matchPrefixedField = matchPrefixedField(str, str2, c, z);
        if (matchPrefixedField == null) {
            return null;
        }
        return matchPrefixedField[0];
    }
}
