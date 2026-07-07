package com.amap.api.col.p0003sl;

/* compiled from: AbstractBasicHandler.java */
/* loaded from: classes.dex */
public abstract class hw<T, V> extends com.amap.api.col.p0003sl.db {
    protected T a;
    protected android.content.Context c;
    protected java.lang.String d;
    protected int b = 1;
    protected boolean e = false;

    protected V a(com.amap.api.col.p0003sl.la laVar) throws com.amap.api.col.p0003sl.hv {
        return null;
    }

    protected abstract V a(java.lang.String str) throws com.amap.api.col.p0003sl.hv;

    protected abstract java.lang.String c();

    public hw(android.content.Context context, T t) {
        a(context, t);
    }

    private void a(android.content.Context context, T t) {
        this.c = context;
        this.a = t;
        this.b = 1;
        setSoTimeout(30000);
        setConnectionTimeout(30000);
    }

    protected V a(byte[] bArr) throws com.amap.api.col.p0003sl.hv {
        java.lang.String str;
        try {
            str = new java.lang.String(bArr, "utf-8");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (str == null || "".equals(str)) {
            return null;
        }
        com.amap.api.col.p0003sl.hy.a(str);
        return a(str);
    }

    public final V d() throws com.amap.api.col.p0003sl.hv {
        if (this.a == null) {
            return null;
        }
        try {
            return e();
        } catch (com.amap.api.col.p0003sl.hv e) {
            com.amap.api.col.p0003sl.dx.a(e);
            throw e;
        }
    }

    private V e() throws com.amap.api.col.p0003sl.hv {
        V v = null;
        int i = 0;
        while (i < this.b) {
            try {
                setProxy(com.amap.api.col.p0003sl.ip.a(this.c));
                if (this.e) {
                    v = b(makeHttpRequestNeedHeader());
                } else {
                    v = b(makeHttpRequest());
                }
                i = this.b;
            } catch (com.amap.api.col.p0003sl.hv e) {
                i++;
                if (i >= this.b) {
                    throw new com.amap.api.col.p0003sl.hv(e.a());
                }
            } catch (com.amap.api.col.p0003sl.id e2) {
                i++;
                if (i < this.b) {
                    try {
                        java.lang.Thread.sleep(1000L);
                    } catch (java.lang.InterruptedException unused) {
                        if (com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e2.getMessage()) || com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                            throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                        }
                        throw new com.amap.api.col.p0003sl.hv(e2.a());
                    }
                } else {
                    if (com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e2.getMessage()) || com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e2.getMessage()) || com.amap.api.maps.AMapException.ERROR_UNKNOWN.equals(e2.a()) || com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e2.getMessage())) {
                        throw new com.amap.api.col.p0003sl.hv(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                    }
                    throw new com.amap.api.col.p0003sl.hv(e2.a());
                }
            }
        }
        return v;
    }

    private V b(byte[] bArr) throws com.amap.api.col.p0003sl.hv {
        return a(bArr);
    }

    private V b(com.amap.api.col.p0003sl.la laVar) throws com.amap.api.col.p0003sl.hv {
        return a(laVar);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        com.amap.api.col.p0003sl.iq a = com.amap.api.col.p0003sl.dx.a();
        java.lang.String b = a != null ? a.b() : null;
        java.util.Hashtable hashtable = new java.util.Hashtable(16);
        hashtable.put("User-Agent", com.amap.api.col.p0003sl.w.c);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", java.lang.String.format(java.util.Locale.US, "platform=Android&sdkversion=%s&product=%s", b, "3dmap"));
        hashtable.put("X-INFO", com.amap.api.col.p0003sl.ih.b(this.c));
        hashtable.put("key", com.amap.api.col.p0003sl.ie.f(this.c));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }
}
