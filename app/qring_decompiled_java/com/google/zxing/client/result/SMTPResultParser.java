package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class SMTPResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.EmailAddressParsedResult parse(com.google.zxing.Result result) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String massagedText = getMassagedText(result);
        if (!massagedText.startsWith("smtp:") && !massagedText.startsWith("SMTP:")) {
            return null;
        }
        java.lang.String substring = massagedText.substring(5);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            java.lang.String substring2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
            int indexOf2 = substring2.indexOf(58);
            if (indexOf2 >= 0) {
                java.lang.String substring3 = substring2.substring(indexOf2 + 1);
                str = substring2.substring(0, indexOf2);
                str2 = substring3;
            } else {
                str2 = null;
                str = substring2;
            }
        } else {
            str = null;
            str2 = null;
        }
        return new com.google.zxing.client.result.EmailAddressParsedResult(new java.lang.String[]{substring}, null, null, str, str2);
    }
}
