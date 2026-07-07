package com.qcwireless.qcwatch.base.log;

/* loaded from: /tmp/dex/classes2.dex */
public class LogJsonParseImpl implements com.iwown.awlog.parse.IJson {
    private static com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    @Override // com.iwown.awlog.parse.IJson
    public java.lang.String toJson(java.lang.Object object) {
        return gson.toJson(object);
    }
}
