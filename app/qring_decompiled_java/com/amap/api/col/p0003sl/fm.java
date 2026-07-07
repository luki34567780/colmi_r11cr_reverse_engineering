package com.amap.api.col.p0003sl;

/* compiled from: ConfigableConst.java */
/* loaded from: classes.dex */
public final class fm {
    public static final java.lang.String[] a = {"com.amap.api.services", "com.amap.api.search.admic"};

    public static java.lang.String a() {
        return com.amap.api.services.core.ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/v3" : "https://restsdk.amap.com/v3";
    }

    public static java.lang.String b() {
        return com.amap.api.services.core.ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/v4" : "https://restsdk.amap.com/v4";
    }

    public static java.lang.String c() {
        return com.amap.api.services.core.ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/v5" : "https://restsdk.amap.com/v5";
    }

    public static java.lang.String d() {
        return com.amap.api.services.core.ServiceSettings.getInstance().getProtocol() == 1 ? "http://yuntuapi.amap.com" : "https://yuntuapi.amap.com";
    }

    public static java.lang.String e() {
        return com.amap.api.services.core.ServiceSettings.getInstance().getProtocol() == 1 ? "http://restsdk.amap.com/rest/me/cpoint" : "https://restsdk.amap.com/rest/me/cpoint";
    }

    public static java.lang.String f() {
        return com.amap.api.services.core.ServiceSettings.getInstance().getProtocol() == 1 ? "http://apistore.amap.com" : "https://apistore.amap.com";
    }

    public static com.amap.api.col.p0003sl.iq a(boolean z) {
        try {
            return new com.amap.api.col.3sl.iq.a("sea", "9.7.0", "AMAP SDK Android Search 9.7.0").a(a).a(z).a("9.7.0").a();
        } catch (com.amap.api.col.p0003sl.id e) {
            com.amap.api.col.p0003sl.fn.a(e, "ConfigableConst", "getSDKInfo");
            return null;
        }
    }

    public static java.lang.String g() {
        return com.amap.api.services.core.ServiceSettings.getInstance().getProtocol() == 1 ? "http://m5.amap.com/ws/mapapi/shortaddress/transform" : "https://m5.amap.com/ws/mapapi/shortaddress/transform";
    }
}
