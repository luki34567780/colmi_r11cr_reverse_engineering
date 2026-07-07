package com.google.zxing.client.result;

/* loaded from: /tmp/dex/classes2.dex */
public final class URLTOResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public com.google.zxing.client.result.URIParsedResult parse(com.google.zxing.Result result) {
        int indexOf;
        java.lang.String massagedText = getMassagedText(result);
        if ((massagedText.startsWith("urlto:") || massagedText.startsWith("URLTO:")) && (indexOf = massagedText.indexOf(58, 6)) >= 0) {
            return new com.google.zxing.client.result.URIParsedResult(massagedText.substring(indexOf + 1), indexOf > 6 ? massagedText.substring(6, indexOf) : null);
        }
        return null;
    }
}
