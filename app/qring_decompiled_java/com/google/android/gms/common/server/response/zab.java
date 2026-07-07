package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zab implements com.google.android.gms.common.server.response.zai<java.lang.Long> {
    zab() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ java.lang.Long zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        long zan;
        zan = fastParser.zan(bufferedReader);
        return java.lang.Long.valueOf(zan);
    }
}
