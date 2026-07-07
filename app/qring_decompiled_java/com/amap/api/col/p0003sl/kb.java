package com.amap.api.col.p0003sl;

/* compiled from: PrivacyUploadRequest.java */
/* loaded from: classes.dex */
public final class kb extends com.amap.api.col.p0003sl.il {
    public org.json.JSONObject a = null;
    public android.content.Context b = null;

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getSDKName() {
        return "core";
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final byte[] getEntityBytes() {
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            org.json.JSONObject jSONObject = this.a;
            if (jSONObject != null) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    stringBuffer.append(next + "=" + java.net.URLEncoder.encode(this.a.get(next).toString(), "utf-8") + "&");
                }
            }
            stringBuffer.append("output=json");
            java.lang.String f = com.amap.api.col.p0003sl.ie.f(this.b);
            stringBuffer.append("&key=".concat(java.lang.String.valueOf(f)));
            java.lang.String a = com.amap.api.col.p0003sl.ih.a();
            stringBuffer.append("&ts=".concat(java.lang.String.valueOf(a)));
            stringBuffer.append("&scode=" + com.amap.api.col.p0003sl.ih.a(this.b, a, "key=".concat(java.lang.String.valueOf(f))));
            return stringBuffer.toString().getBytes("utf-8");
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android core 4.3.6");
        hashMap.put("X-INFO", com.amap.api.col.p0003sl.ih.b(this.b));
        hashMap.put("platinfo", java.lang.String.format("platform=Android&sdkversion=%s&product=%s", "4.3.6", "core"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        return com.amap.api.col.p0003sl.ik.a().b() ? "https://restsdk.amap.com/sdk/compliance/params" : "http://restsdk.amap.com/sdk/compliance/params";
    }
}
