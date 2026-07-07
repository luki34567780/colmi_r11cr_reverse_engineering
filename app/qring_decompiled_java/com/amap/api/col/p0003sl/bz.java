package com.amap.api.col.p0003sl;

/* compiled from: OfflineDownloadRequest.java */
/* loaded from: classes.dex */
public final class bz extends com.amap.api.col.p0003sl.db {
    private java.lang.String a;

    @Override // com.amap.api.col.p0003sl.db, com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final boolean isSupportIPV6() {
        return false;
    }

    public bz(java.lang.String str) {
        this.a = str;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        java.util.Hashtable hashtable = new java.util.Hashtable(32);
        hashtable.put("User-Agent", "MAC=channel:amapapi");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getURL() {
        return this.a;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public final java.lang.String getIPV6URL() {
        return getURL();
    }
}
