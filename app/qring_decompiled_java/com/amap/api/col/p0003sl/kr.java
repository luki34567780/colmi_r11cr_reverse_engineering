package com.amap.api.col.p0003sl;

/* compiled from: ADIURequest.java */
/* loaded from: classes.dex */
public final class kr extends com.amap.api.col.p0003sl.kz {
    private byte[] a;
    private java.util.Map<java.lang.String, java.lang.String> b;

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        return "https://adiu.amap.com/ws/device/adius";
    }

    public kr(byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map) {
        this.a = bArr;
        this.b = map;
        setDegradeAbility(com.amap.api.col.3sl.kz.a.SINGLE);
        setHttpProtocol(com.amap.api.col.3sl.kz.c.HTTPS);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return this.b;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final byte[] getEntityBytes() {
        return this.a;
    }
}
