package com.autonavi.aps.amapapi.trans;

/* compiled from: HttpRequest.java */
/* loaded from: classes.dex */
public final class b extends com.amap.api.col.p0003sl.il {
    java.util.Map<java.lang.String, java.lang.String> a = null;
    java.util.Map<java.lang.String, java.lang.String> b = null;
    java.lang.String c = "";
    byte[] d = null;
    private java.lang.String e = null;

    public final void a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.a = map;
    }

    public final void b(java.util.Map<java.lang.String, java.lang.String> map) {
        this.b = map;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        return this.a;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return this.b;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        return this.c;
    }

    public final void a(java.lang.String str) {
        this.c = str;
    }

    public final void a(byte[] bArr) {
        this.d = bArr;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final byte[] getEntityBytes() {
        return this.d;
    }

    public final void b(java.lang.String str) {
        this.e = str;
    }

    @Override // com.amap.api.col.p0003sl.il, com.amap.api.col.p0003sl.kz
    public final java.lang.String getIPV6URL() {
        if (!android.text.TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        return super.getIPV6URL();
    }
}
