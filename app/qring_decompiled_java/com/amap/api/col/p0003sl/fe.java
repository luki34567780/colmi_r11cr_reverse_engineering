package com.amap.api.col.p0003sl;

/* compiled from: BasicHandler.java */
/* loaded from: classes.dex */
public abstract class fe<T, V> extends com.amap.api.col.p0003sl.il {
    protected T b;
    protected android.content.Context e;
    protected boolean a = true;
    protected int c = 1;
    protected java.lang.String d = "";
    private int g = 1;
    protected java.lang.String f = "";

    protected abstract V a(java.lang.String str) throws com.amap.api.services.core.AMapException;

    protected abstract java.lang.String c();

    protected com.amap.api.col.3sl.gm.b e() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public java.lang.String getSDKName() {
        return "sea";
    }

    public fe(android.content.Context context, T t) {
        a(context, t);
    }

    private void a(android.content.Context context, T t) {
        this.e = context;
        this.b = t;
        this.c = 1;
        setSoTimeout(com.amap.api.services.core.ServiceSettings.getInstance().getSoTimeOut());
        setConnectionTimeout(com.amap.api.services.core.ServiceSettings.getInstance().getConnectionTimeOut());
    }

    private java.lang.String f() {
        return this.f;
    }

    private java.lang.String g() {
        java.lang.String ipv6url = getIPV6URL();
        if (ipv6url == null) {
            return null;
        }
        try {
            int indexOf = ipv6url.indexOf(".com/");
            int indexOf2 = ipv6url.indexOf("?");
            if (indexOf2 == -1) {
                return ipv6url.substring(indexOf + 5);
            }
            return ipv6url.substring(indexOf + 5, indexOf2);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    protected V a(byte[] bArr) throws com.amap.api.services.core.AMapException {
        java.lang.String str;
        try {
            str = new java.lang.String(bArr, "utf-8");
        } catch (java.lang.Exception e) {
            com.amap.api.col.p0003sl.fn.a(e, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        com.amap.api.col.p0003sl.fn.b(str);
        return a(str);
    }

    public final V d() throws com.amap.api.services.core.AMapException {
        if (this.b == null) {
            return null;
        }
        try {
            return h();
        } catch (com.amap.api.services.core.AMapException e) {
            com.amap.api.col.p0003sl.gw.a(g(), f(), e);
            throw e;
        }
    }

    private V h() throws com.amap.api.services.core.AMapException {
        java.lang.Object obj;
        com.amap.api.col.p0003sl.gm gmVar;
        com.amap.api.col.3sl.gm.c a;
        try {
            com.amap.api.col.3sl.gm.b e = e();
            boolean b = com.amap.api.col.p0003sl.gm.a().b(e);
            boolean z = false;
            int i = 0;
            V v = null;
            boolean z2 = false;
            while (i < this.c) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    try {
                        try {
                            int protocol = com.amap.api.services.core.ServiceSettings.getInstance().getProtocol();
                            com.amap.api.col.p0003sl.ik.a().a(this.e);
                            com.amap.api.col.p0003sl.ky c = com.amap.api.col.p0003sl.ky.c();
                            if (b && (a = com.amap.api.col.p0003sl.gm.a().a(e)) != null && a.a != null) {
                                v = (V) a.a;
                                try {
                                    com.amap.api.col.p0003sl.gw.a(this.e, e.a, a.b);
                                    z2 = true;
                                } catch (com.amap.api.col.p0003sl.id e2) {
                                    e = e2;
                                    z2 = true;
                                    com.amap.api.col.p0003sl.gw.a(this.e, g(), java.lang.System.currentTimeMillis() - currentTimeMillis, z);
                                    i++;
                                    if (i >= this.c) {
                                        if (!com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_UNKNOWN.equals(e.a()) && !com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e.getMessage())) {
                                            throw new com.amap.api.services.core.AMapException(e.a(), 1, e.c());
                                        }
                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION, 1, e.c());
                                    }
                                    try {
                                        java.lang.Thread.sleep(this.g * 1000);
                                        if (b && !z2) {
                                            com.amap.api.col.p0003sl.gm.a().a(e, v);
                                        }
                                        z = false;
                                    } catch (java.lang.InterruptedException unused) {
                                        if (!com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e.getMessage())) {
                                            throw new com.amap.api.services.core.AMapException(e.a(), 1, e.c());
                                        }
                                        throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION, 1, e.c());
                                    }
                                } catch (com.amap.api.services.core.AMapException e3) {
                                    e = e3;
                                    z2 = true;
                                    com.amap.api.col.p0003sl.gw.a(this.e, g(), java.lang.System.currentTimeMillis() - currentTimeMillis, z);
                                    i++;
                                    if (i >= this.c) {
                                        throw e;
                                    }
                                    if (b && !z2) {
                                        gmVar = com.amap.api.col.p0003sl.gm.a();
                                        gmVar.a(e, v);
                                    }
                                    z = false;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    obj = v;
                                    z2 = true;
                                    if (b) {
                                        com.amap.api.col.p0003sl.gm.a().a(e, obj);
                                    }
                                    throw th;
                                }
                            }
                            if (v == null) {
                                byte[] a2 = a(protocol, c, this);
                                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                v = b(a2);
                                com.amap.api.col.p0003sl.gw.a(this.e, g(), currentTimeMillis2 - currentTimeMillis, true);
                            }
                            i = this.c;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            obj = null;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        obj = v;
                        if (b && !z2) {
                            com.amap.api.col.p0003sl.gm.a().a(e, obj);
                        }
                        throw th;
                    }
                } catch (com.amap.api.col.p0003sl.id e4) {
                    e = e4;
                } catch (com.amap.api.services.core.AMapException e5) {
                    e = e5;
                }
                if (b && !z2) {
                    gmVar = com.amap.api.col.p0003sl.gm.a();
                    gmVar.a(e, v);
                }
                z = false;
            }
            return v;
        } catch (com.amap.api.services.core.AMapException e6) {
            throw e6;
        } catch (java.lang.Throwable th4) {
            th4.printStackTrace();
            throw new com.amap.api.services.core.AMapException(com.amap.api.services.core.AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    private byte[] a(int i, com.amap.api.col.p0003sl.ky kyVar, com.amap.api.col.p0003sl.il ilVar) throws com.amap.api.col.p0003sl.id {
        com.amap.api.col.p0003sl.la e;
        setHttpProtocol(i == 1 ? com.amap.api.col.3sl.kz.c.HTTP : com.amap.api.col.3sl.kz.c.HTTPS);
        if (this.a) {
            e = com.amap.api.col.p0003sl.ky.a(ilVar);
        } else {
            e = com.amap.api.col.p0003sl.ky.e(ilVar);
        }
        if (e == null) {
            return null;
        }
        byte[] bArr = e.a;
        this.f = e.d;
        return bArr;
    }

    private V b(byte[] bArr) throws com.amap.api.services.core.AMapException {
        return a(bArr);
    }
}
