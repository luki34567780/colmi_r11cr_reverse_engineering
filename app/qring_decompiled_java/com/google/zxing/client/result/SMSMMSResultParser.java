package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class SMSMMSResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.SMSParsedResult parse(com.google.zxing.Result result) {
        java.lang.String str;
        java.lang.String substring;
        java.lang.String massagedText = getMassagedText(result);
        java.lang.String str2 = null;
        if (!massagedText.startsWith("sms:") && !massagedText.startsWith("SMS:") && !massagedText.startsWith("mms:") && !massagedText.startsWith("MMS:")) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> parseNameValuePairs = parseNameValuePairs(massagedText);
        boolean z = false;
        if (parseNameValuePairs == null || parseNameValuePairs.isEmpty()) {
            str = null;
        } else {
            str2 = parseNameValuePairs.get("subject");
            str = parseNameValuePairs.get("body");
            z = true;
        }
        int indexOf = massagedText.indexOf(63, 4);
        if (indexOf < 0 || !z) {
            substring = massagedText.substring(4);
        } else {
            substring = massagedText.substring(4, indexOf);
        }
        int i = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        while (true) {
            int i2 = i + 1;
            int indexOf2 = substring.indexOf(44, i2);
            if (indexOf2 > i) {
                addNumberVia(arrayList, arrayList2, substring.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                addNumberVia(arrayList, arrayList2, substring.substring(i2));
                return new com.google.zxing.client.result.SMSParsedResult((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]), (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]), str2, str);
            }
        }
    }

    private static void addNumberVia(java.util.Collection<java.lang.String> collection, java.util.Collection<java.lang.String> collection2, java.lang.String str) {
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            collection.add(str);
            collection2.add(null);
        } else {
            collection.add(str.substring(0, indexOf));
            java.lang.String substring = str.substring(indexOf + 1);
            collection2.add(substring.startsWith("via=") ? substring.substring(4) : null);
        }
    }
}
