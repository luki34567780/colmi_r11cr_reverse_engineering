package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class VCardResultParser extends com.google.zxing.client.result.ResultParser {
    private static final java.util.regex.Pattern BEGIN_VCARD = java.util.regex.Pattern.compile("BEGIN:VCARD", 2);
    private static final java.util.regex.Pattern VCARD_LIKE_DATE = java.util.regex.Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");
    private static final java.util.regex.Pattern CR_LF_SPACE_TAB = java.util.regex.Pattern.compile("\r\n[ \t]");
    private static final java.util.regex.Pattern NEWLINE_ESCAPE = java.util.regex.Pattern.compile("\\\\[nN]");
    private static final java.util.regex.Pattern VCARD_ESCAPES = java.util.regex.Pattern.compile("\\\\([,;\\\\])");
    private static final java.util.regex.Pattern EQUALS = java.util.regex.Pattern.compile("=");
    private static final java.util.regex.Pattern SEMICOLON = java.util.regex.Pattern.compile(";");
    private static final java.util.regex.Pattern UNESCAPED_SEMICOLONS = java.util.regex.Pattern.compile("(?<!\\\\);+");
    private static final java.util.regex.Pattern COMMA = java.util.regex.Pattern.compile(",");
    private static final java.util.regex.Pattern SEMICOLON_OR_COMMA = java.util.regex.Pattern.compile("[;,]");

    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.AddressBookParsedResult parse(com.google.zxing.Result result) {
        java.lang.String massagedText = getMassagedText(result);
        java.util.regex.Matcher matcher = BEGIN_VCARD.matcher(massagedText);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField = matchVCardPrefixedField("FN", massagedText, true, false);
        if (matchVCardPrefixedField == null) {
            matchVCardPrefixedField = matchVCardPrefixedField("N", massagedText, true, false);
            formatNames(matchVCardPrefixedField);
        }
        java.util.List<java.lang.String> matchSingleVCardPrefixedField = matchSingleVCardPrefixedField("NICKNAME", massagedText, true, false);
        java.lang.String[] split = matchSingleVCardPrefixedField == null ? null : COMMA.split(matchSingleVCardPrefixedField.get(0));
        java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField2 = matchVCardPrefixedField("TEL", massagedText, true, false);
        java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField3 = matchVCardPrefixedField("EMAIL", massagedText, true, false);
        java.util.List<java.lang.String> matchSingleVCardPrefixedField2 = matchSingleVCardPrefixedField("NOTE", massagedText, false, false);
        java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField4 = matchVCardPrefixedField("ADR", massagedText, true, true);
        java.util.List<java.lang.String> matchSingleVCardPrefixedField3 = matchSingleVCardPrefixedField("ORG", massagedText, true, true);
        java.util.List<java.lang.String> matchSingleVCardPrefixedField4 = matchSingleVCardPrefixedField("BDAY", massagedText, true, false);
        java.util.List<java.lang.String> list = (matchSingleVCardPrefixedField4 == null || isLikeVCardDate(matchSingleVCardPrefixedField4.get(0))) ? matchSingleVCardPrefixedField4 : null;
        java.util.List<java.lang.String> matchSingleVCardPrefixedField5 = matchSingleVCardPrefixedField("TITLE", massagedText, true, false);
        java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField5 = matchVCardPrefixedField("URL", massagedText, true, false);
        java.util.List<java.lang.String> matchSingleVCardPrefixedField6 = matchSingleVCardPrefixedField("IMPP", massagedText, true, false);
        java.util.List<java.lang.String> matchSingleVCardPrefixedField7 = matchSingleVCardPrefixedField("GEO", massagedText, true, false);
        java.lang.String[] split2 = matchSingleVCardPrefixedField7 == null ? null : SEMICOLON_OR_COMMA.split(matchSingleVCardPrefixedField7.get(0));
        return new com.google.zxing.client.result.AddressBookParsedResult(toPrimaryValues(matchVCardPrefixedField), split, null, toPrimaryValues(matchVCardPrefixedField2), toTypes(matchVCardPrefixedField2), toPrimaryValues(matchVCardPrefixedField3), toTypes(matchVCardPrefixedField3), toPrimaryValue(matchSingleVCardPrefixedField6), toPrimaryValue(matchSingleVCardPrefixedField2), toPrimaryValues(matchVCardPrefixedField4), toTypes(matchVCardPrefixedField4), toPrimaryValue(matchSingleVCardPrefixedField3), toPrimaryValue(list), toPrimaryValue(matchSingleVCardPrefixedField5), toPrimaryValues(matchVCardPrefixedField5), (split2 == null || split2.length == 2) ? split2 : null);
    }

    static java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField(java.lang.CharSequence charSequence, java.lang.String str, boolean z, boolean z2) {
        java.util.ArrayList arrayList;
        boolean z3;
        java.lang.String str2;
        java.lang.String str3;
        int indexOf;
        java.lang.String replaceAll;
        int length = str.length();
        int i = 0;
        int i2 = 0;
        java.util.ArrayList arrayList2 = null;
        while (i2 < length) {
            int i3 = 2;
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?:^|\n)" + ((java.lang.Object) charSequence) + "(?:;([^:]*))?:", 2).matcher(str);
            if (i2 > 0) {
                i2--;
            }
            if (!matcher.find(i2)) {
                break;
            }
            int end = matcher.end(i);
            java.lang.String group = matcher.group(1);
            if (group != null) {
                java.lang.String[] split = SEMICOLON.split(group);
                int length2 = split.length;
                int i4 = 0;
                arrayList = null;
                z3 = false;
                str2 = null;
                str3 = null;
                while (i4 < length2) {
                    java.lang.String str4 = split[i4];
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList(1);
                    }
                    arrayList.add(str4);
                    java.lang.String[] split2 = EQUALS.split(str4, i3);
                    if (split2.length > 1) {
                        java.lang.String str5 = split2[0];
                        java.lang.String str6 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str5) && "QUOTED-PRINTABLE".equalsIgnoreCase(str6)) {
                            z3 = true;
                        } else if ("CHARSET".equalsIgnoreCase(str5)) {
                            str2 = str6;
                        } else if (com.oudmon.ble.base.bluetooth.BleAction.EXTRA_VALUE.equalsIgnoreCase(str5)) {
                            str3 = str6;
                        }
                    }
                    i4++;
                    i3 = 2;
                }
            } else {
                arrayList = null;
                z3 = false;
                str2 = null;
                str3 = null;
            }
            int i5 = end;
            while (true) {
                indexOf = str.indexOf(10, i5);
                if (indexOf < 0) {
                    break;
                }
                if (indexOf < str.length() - 1) {
                    int i6 = indexOf + 1;
                    if (str.charAt(i6) == ' ' || str.charAt(i6) == '\t') {
                        i5 = indexOf + 2;
                    }
                }
                if (!z3) {
                    break;
                }
                if (indexOf > 0) {
                    if (str.charAt(indexOf - 1) == '=') {
                        i5 = indexOf + 1;
                    }
                }
                if (indexOf < 2) {
                    break;
                }
                if (str.charAt(indexOf - 2) != '=') {
                    break;
                }
                i5 = indexOf + 1;
            }
            if (indexOf < 0) {
                i2 = length;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList(1);
                    }
                    if (indexOf > 0 && str.charAt(indexOf - 1) == '\r') {
                        indexOf--;
                    }
                    java.lang.String substring = str.substring(end, indexOf);
                    if (z) {
                        substring = substring.trim();
                    }
                    if (z3) {
                        replaceAll = decodeQuotedPrintable(substring, str2);
                        if (z2) {
                            replaceAll = UNESCAPED_SEMICOLONS.matcher(replaceAll).replaceAll("\n").trim();
                        }
                    } else {
                        if (z2) {
                            substring = UNESCAPED_SEMICOLONS.matcher(substring).replaceAll("\n").trim();
                        }
                        replaceAll = VCARD_ESCAPES.matcher(NEWLINE_ESCAPE.matcher(CR_LF_SPACE_TAB.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if ("uri".equals(str3)) {
                        try {
                            replaceAll = java.net.URI.create(replaceAll).getSchemeSpecificPart();
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
                        arrayList3.add(replaceAll);
                        arrayList2.add(arrayList3);
                    } else {
                        arrayList.add(0, replaceAll);
                        arrayList2.add(arrayList);
                        i2 = indexOf + 1;
                    }
                }
                i2 = indexOf + 1;
            }
            i = 0;
        }
        return arrayList2;
    }

    private static java.lang.String decodeQuotedPrintable(java.lang.CharSequence charSequence, java.lang.String str) {
        char charAt;
        int length = charSequence.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    maybeAppendFragment(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (i < length - 2 && (charAt = charSequence.charAt(i + 1)) != '\r' && charAt != '\n') {
                    i += 2;
                    char charAt3 = charSequence.charAt(i);
                    int parseHexDigit = parseHexDigit(charAt);
                    int parseHexDigit2 = parseHexDigit(charAt3);
                    if (parseHexDigit >= 0 && parseHexDigit2 >= 0) {
                        byteArrayOutputStream.write((parseHexDigit << 4) + parseHexDigit2);
                    }
                }
            }
            i++;
        }
        maybeAppendFragment(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    private static void maybeAppendFragment(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.String str, java.lang.StringBuilder sb) {
        java.lang.String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new java.lang.String(byteArray, java.nio.charset.StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new java.lang.String(byteArray, str);
                } catch (java.io.UnsupportedEncodingException unused) {
                    str2 = new java.lang.String(byteArray, java.nio.charset.StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    static java.util.List<java.lang.String> matchSingleVCardPrefixedField(java.lang.CharSequence charSequence, java.lang.String str, boolean z, boolean z2) {
        java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField = matchVCardPrefixedField(charSequence, str, z, z2);
        if (matchVCardPrefixedField == null || matchVCardPrefixedField.isEmpty()) {
            return null;
        }
        return matchVCardPrefixedField.get(0);
    }

    private static java.lang.String toPrimaryValue(java.util.List<java.lang.String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static java.lang.String[] toPrimaryValues(java.util.Collection<java.util.List<java.lang.String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator<java.util.List<java.lang.String>> it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    private static java.lang.String[] toTypes(java.util.Collection<java.util.List<java.lang.String>> collection) {
        java.lang.String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (java.util.List<java.lang.String> list : collection) {
            java.lang.String str2 = list.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i = 1;
                while (true) {
                    if (i >= list.size()) {
                        str = null;
                        break;
                    }
                    str = list.get(i);
                    int indexOf = str.indexOf(61);
                    if (indexOf < 0) {
                        break;
                    }
                    if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    }
                    i++;
                }
                arrayList.add(str);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    private static boolean isLikeVCardDate(java.lang.CharSequence charSequence) {
        return charSequence == null || VCARD_LIKE_DATE.matcher(charSequence).matches();
    }

    private static void formatNames(java.lang.Iterable<java.util.List<java.lang.String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (java.util.List<java.lang.String> list : iterable) {
                java.lang.String str = list.get(0);
                java.lang.String[] strArr = new java.lang.String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4 && (indexOf = str.indexOf(59, i2)) >= 0) {
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
                maybeAppendComponent(strArr, 3, sb);
                maybeAppendComponent(strArr, 1, sb);
                maybeAppendComponent(strArr, 2, sb);
                maybeAppendComponent(strArr, 0, sb);
                maybeAppendComponent(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    private static void maybeAppendComponent(java.lang.String[] strArr, int i, java.lang.StringBuilder sb) {
        if (strArr[i] == null || strArr[i].isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(' ');
        }
        sb.append(strArr[i]);
    }
}
