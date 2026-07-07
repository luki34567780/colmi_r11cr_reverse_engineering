package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zae implements com.google.android.gms.common.server.response.zai<java.lang.Boolean> {
    zae() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* bridge */ /* synthetic */ java.lang.Boolean zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        boolean zay;
        zay = fastParser.zay(bufferedReader, false);
        return java.lang.Boolean.valueOf(zay);
    }
}
