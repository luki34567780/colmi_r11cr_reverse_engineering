package com.amap.api.col.p0003sl;

/* compiled from: AbstractAMapRequest.java */
/* loaded from: classes.dex */
public abstract class db extends com.amap.api.col.p0003sl.kz {
    protected boolean isPostFlag = true;

    @Override // com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }

    protected com.amap.api.col.p0003sl.la makeHttpRequestNeedHeader() throws com.amap.api.col.p0003sl.id {
        if (com.amap.api.col.p0003sl.ab.a != null && com.amap.api.col.p0003sl.in.a(com.amap.api.col.p0003sl.ab.a, com.amap.api.col.p0003sl.dx.a()).a != com.amap.api.col.3sl.in.c.SuccessCode) {
            return null;
        }
        setHttpProtocol(com.amap.api.maps.MapsInitializer.getProtocol() == 1 ? com.amap.api.col.3sl.kz.c.HTTP : com.amap.api.col.3sl.kz.c.HTTPS);
        com.amap.api.col.p0003sl.ky.c();
        if (this.isPostFlag) {
            return com.amap.api.col.p0003sl.ky.a(this);
        }
        return com.amap.api.col.p0003sl.ky.e(this);
    }

    protected byte[] makeHttpRequest() throws com.amap.api.col.p0003sl.id {
        com.amap.api.col.p0003sl.la makeHttpRequestNeedHeader = makeHttpRequestNeedHeader();
        if (makeHttpRequestNeedHeader != null) {
            return makeHttpRequestNeedHeader.a;
        }
        return null;
    }

    public byte[] makeHttpRequestWithInterrupted() throws com.amap.api.col.p0003sl.id {
        setDegradeAbility(com.amap.api.col.3sl.kz.a.INTERRUPT_IO);
        return makeHttpRequest();
    }
}
