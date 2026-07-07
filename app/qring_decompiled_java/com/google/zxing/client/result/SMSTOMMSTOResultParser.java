package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class SMSTOMMSTOResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.SMSParsedResult parse(com.google.zxing.Result result) {
        java.lang.String str;
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("smsto:") && !massagedText.startsWith("SMSTO:") && !massagedText.startsWith("mmsto:") && !massagedText.startsWith("MMSTO:")) {
            return null;
        }
        java.lang.String substring = massagedText.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str = null;
        }
        return new com.google.zxing.client.result.SMSParsedResult(substring, (java.lang.String) null, (java.lang.String) null, str);
    }
}
