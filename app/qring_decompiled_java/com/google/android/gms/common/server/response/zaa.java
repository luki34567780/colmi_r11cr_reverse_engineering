package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaa implements com.google.android.gms.common.server.response.zai<java.lang.Integer> {
    zaa() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ java.lang.Integer zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zal;
        zal = fastParser.zal(bufferedReader);
        return java.lang.Integer.valueOf(zal);
    }
}
