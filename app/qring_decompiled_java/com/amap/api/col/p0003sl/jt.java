package com.amap.api.col.p0003sl;

/* compiled from: LogUpdateRequest.java */
/* loaded from: classes.dex */
public final class jt extends com.amap.api.col.p0003sl.il {
    private byte[] a;
    private java.lang.String b;

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final boolean isHostToIP() {
        return false;
    }

    public jt(byte[] bArr, java.lang.String str) {
        this.b = coil.disk.DiskLruCache.VERSION;
        this.a = (byte[]) bArr.clone();
        this.b = str;
        setDegradeAbility(com.amap.api.col.3sl.kz.a.SINGLE);
        setHttpProtocol(com.amap.api.col.3sl.kz.c.HTTP);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content-Type", "application/zip");
        hashMap.put(com.liulishuo.okdownload.core.Util.CONTENT_LENGTH, java.lang.String.valueOf(this.a.length));
        return hashMap;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        java.lang.String c = com.amap.api.col.p0003sl.ir.c(com.amap.api.col.p0003sl.jf.b);
        byte[] a = com.amap.api.col.p0003sl.ir.a(com.amap.api.col.p0003sl.jf.a);
        byte[] bArr = new byte[a.length + 50];
        java.lang.System.arraycopy(this.a, 0, bArr, 0, 50);
        java.lang.System.arraycopy(a, 0, bArr, 50, a.length);
        return java.lang.String.format(c, coil.disk.DiskLruCache.VERSION, this.b, coil.disk.DiskLruCache.VERSION, "open", com.amap.api.col.p0003sl.im.a(bArr));
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final byte[] getEntityBytes() {
        return this.a;
    }
}
