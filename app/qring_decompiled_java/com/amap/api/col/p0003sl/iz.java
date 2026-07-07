package com.amap.api.col.p0003sl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BaseAAIDRequest.java */
/* loaded from: classes.dex */
public class iz extends il {
    public Context k;

    @Override // com.amap.api.col.p0003sl.kz
    public String getSDKName() {
        return "core";
    }

    public iz(Context context) {
        this.k = context;
        setConnectionTimeout(5000);
        setSoTimeout(5000);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public Map<String, String> getRequestHead() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android core 4.3.6");
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "4.3.6", "core"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public Map<String, String> getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("key", ie.f(this.k));
        String a = ih.a();
        String a2 = ih.a(this.k, a, ir.b(hashMap));
        hashMap.put("ts", a);
        hashMap.put("scode", a2);
        return hashMap;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public String getURL() {
        return ik.a().b() ? "https://restapi.amap.com/rest/aaid/get" : "http://restapi.amap.com/rest/aaid/get";
    }
}
