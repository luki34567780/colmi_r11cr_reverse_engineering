package com.amap.api.col.p0003sl;

/* compiled from: NearbyDeleteHandler.java */
/* loaded from: classes.dex */
public final class fz extends com.amap.api.col.p0003sl.ff<java.lang.String, java.lang.Integer> {
    private android.content.Context g;
    private java.lang.String h;

    @Override // com.amap.api.col.p0003sl.ff, com.amap.api.col.p0003sl.fe
    protected final /* synthetic */ java.lang.Object a(java.lang.String str) throws com.amap.api.services.core.AMapException {
        return f();
    }

    public fz(android.content.Context context, java.lang.String str) {
        super(context, str);
        this.g = context;
        this.h = str;
    }

    @Override // com.amap.api.col.p0003sl.ff, com.amap.api.col.p0003sl.fe
    protected final java.lang.String c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(com.amap.api.col.p0003sl.ie.f(this.g));
        stringBuffer.append("&userid=");
        stringBuffer.append(this.h);
        return stringBuffer.toString();
    }

    private static java.lang.Integer f() throws com.amap.api.services.core.AMapException {
        return 0;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        return com.amap.api.col.p0003sl.fm.d() + "/nearby/data/delete";
    }
}
