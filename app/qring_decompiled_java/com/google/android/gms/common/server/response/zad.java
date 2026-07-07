package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zad implements com.google.android.gms.common.server.response.zai<java.lang.Double> {
    zad() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ java.lang.Double zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        double zaj;
        zaj = fastParser.zaj(bufferedReader);
        return java.lang.Double.valueOf(zaj);
    }
}
