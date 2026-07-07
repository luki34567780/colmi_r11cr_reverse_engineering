package com.amap.api.col.p0003sl;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public abstract class kz {
    public static final int DEFAULT_RETRY_TIMEOUT = 5000;
    private java.lang.String d;
    private boolean e;
    private boolean f;
    com.amap.api.col.3sl.ks.a o;
    int l = 20000;
    int m = 20000;
    java.net.Proxy n = null;
    private boolean a = false;
    private int b = 20000;
    private boolean c = true;
    private com.amap.api.col.3sl.kz.a g = com.amap.api.col.3sl.kz.a.NORMAL;
    private com.amap.api.col.3sl.kz.b h = com.amap.api.col.3sl.kz.b.FIRST_NONDEGRADE;

    public byte[] getEntityBytes() {
        return null;
    }

    protected java.lang.String getIPDNSName() {
        return "";
    }

    public abstract java.util.Map<java.lang.String, java.lang.String> getParams();

    public abstract java.util.Map<java.lang.String, java.lang.String> getRequestHead();

    public java.lang.String getSDKName() {
        return "";
    }

    public abstract java.lang.String getURL();

    public boolean isIgnoreGZip() {
        return false;
    }

    public boolean isSupportIPV6() {
        return false;
    }

    /* compiled from: Request.java */
    public enum a {
        NORMAL(0),
        INTERRUPT_IO(1),
        NEVER(2),
        FIX(3),
        SINGLE(4);

        private int f;

        a(int i) {
            this.f = i;
        }
    }

    /* compiled from: Request.java */
    public enum b {
        FIRST_NONDEGRADE(0),
        NEVER_GRADE(1),
        DEGRADE_BYERROR(2),
        DEGRADE_ONLY(3),
        FIX_NONDEGRADE(4),
        FIX_DEGRADE_BYERROR(5),
        FIX_DEGRADE_ONLY(6);

        private int h;

        b(int i2) {
            this.h = i2;
        }

        public final int a() {
            return this.h;
        }

        public final boolean b() {
            int i2 = this.h;
            return i2 == FIRST_NONDEGRADE.h || i2 == NEVER_GRADE.h || i2 == FIX_NONDEGRADE.h;
        }

        public final boolean c() {
            int i2 = this.h;
            return i2 == DEGRADE_BYERROR.h || i2 == DEGRADE_ONLY.h || i2 == FIX_DEGRADE_BYERROR.h || i2 == FIX_DEGRADE_ONLY.h;
        }

        public final boolean d() {
            int i2 = this.h;
            return i2 == DEGRADE_BYERROR.h || i2 == FIX_DEGRADE_BYERROR.h;
        }

        public final boolean e() {
            return this.h == NEVER_GRADE.h;
        }
    }

    /* compiled from: Request.java */
    public enum c {
        HTTP(0),
        HTTPS(1);

        private int c;

        c(int i) {
            this.c = i;
        }
    }

    final java.lang.String a() {
        return a(getURL());
    }

    private java.lang.String a(java.lang.String str) {
        byte[] entityBytes = getEntityBytes();
        if (entityBytes == null || entityBytes.length == 0) {
            return str;
        }
        java.util.Map<java.lang.String, java.lang.String> params = getParams();
        if (com.amap.api.col.p0003sl.ks.e != null) {
            if (params != null) {
                params.putAll(com.amap.api.col.p0003sl.ks.e);
            } else {
                params = com.amap.api.col.p0003sl.ks.e;
            }
        }
        if (params == null) {
            return str;
        }
        java.lang.String a2 = com.amap.api.col.p0003sl.kw.a(params);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("?");
        stringBuffer.append(a2);
        return stringBuffer.toString();
    }

    final java.lang.String b() {
        return a(getIPV6URL());
    }

    protected boolean isIPRequest() {
        return !android.text.TextUtils.isEmpty(getIPDNSName());
    }

    public java.lang.String getIPV6URL() {
        return getURL();
    }

    public final void setConnectionTimeout(int i) {
        this.l = i;
    }

    public final void setSoTimeout(int i) {
        this.m = i;
    }

    public int getConntectionTimeout() {
        return this.l;
    }

    public int getSoTimeout() {
        return this.m;
    }

    public final void setProxy(java.net.Proxy proxy) {
        this.n = proxy;
    }

    public java.net.Proxy getProxy() {
        return this.n;
    }

    public void setDegradeAbility(com.amap.api.col.3sl.kz.a aVar) {
        this.g = aVar;
    }

    protected com.amap.api.col.3sl.kz.a getDegradeAbility() {
        return this.g;
    }

    protected boolean isBinary() {
        return this.a;
    }

    public void setBinary(boolean z) {
        this.a = z;
    }

    protected boolean isHttps() {
        return this.f;
    }

    public void setHttpProtocol(com.amap.api.col.3sl.kz.c cVar) {
        this.f = cVar == com.amap.api.col.3sl.kz.c.HTTPS;
    }

    public com.amap.api.col.3sl.ks.a getUrlConnectionImpl() {
        return this.o;
    }

    public void setUrlConnectionImpl(com.amap.api.col.3sl.ks.a aVar) {
        this.o = aVar;
    }

    protected com.amap.api.col.3sl.kz.b getDegradeType() {
        return this.h;
    }

    public void setDegradeType(com.amap.api.col.3sl.kz.b bVar) {
        this.h = bVar;
    }

    protected int getReal_max_timeout() {
        return this.b;
    }

    public void setReal_max_timeout(int i) {
        this.b = i;
    }

    protected boolean isHostToIP() {
        return this.c;
    }

    public void setHostToIP(boolean z) {
        this.c = z;
    }

    protected java.lang.String getNon_degrade_final_Host() {
        return this.d;
    }

    public void setNon_degrade_final_Host(java.lang.String str) {
        this.d = str;
    }

    protected boolean isIPV6Request() {
        return this.e;
    }

    public void setIPV6Request(boolean z) {
        this.e = z;
    }

    protected java.lang.String parseSdkNameFromRequest() {
        java.lang.String str;
        try {
            str = getSDKName();
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    if (this.a) {
                        str = parseSDKNameFromPlatInfo(((com.amap.api.col.p0003sl.kt) this).g());
                    } else {
                        str = parseSdkNameFromHeader(getRequestHead());
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                com.amap.api.col.p0003sl.jr.a(th, "ht", "pnfr");
                return str;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            str = "";
        }
        return str;
    }

    protected java.lang.String parseSdkNameFromHeader(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return null;
        }
        try {
            if (map.containsKey("platinfo")) {
                return parseSDKNameFromPlatInfo(map.get("platinfo"));
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "ht", "pnfh");
            return null;
        }
    }

    protected java.lang.String parseSDKNameFromPlatInfo(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = "";
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String[] split = str.split("&");
                if (split.length > 1) {
                    int length = split.length;
                    int i = 0;
                    java.lang.String str4 = "";
                    while (true) {
                        if (i >= length) {
                            str2 = "";
                            break;
                        }
                        str2 = split[i];
                        if (str2.contains("sdkversion")) {
                            str4 = str2;
                        }
                        if (str2.contains("product")) {
                            break;
                        }
                        i++;
                    }
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        java.lang.String[] split2 = str2.split("=");
                        if (split2.length > 1) {
                            str3 = split2[1].trim();
                            if (!android.text.TextUtils.isEmpty(str4) && android.text.TextUtils.isEmpty(com.amap.api.col.p0003sl.jf.a(str3))) {
                                java.lang.String[] split3 = str4.split("=");
                                if (split3.length > 1) {
                                    com.amap.api.col.p0003sl.jf.a(str3, split3[1].trim());
                                }
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.jr.a(th, "ht", "pnfp");
        }
        return str3;
    }
}
