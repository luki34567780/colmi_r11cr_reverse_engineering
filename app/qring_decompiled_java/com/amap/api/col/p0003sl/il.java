package com.amap.api.col.p0003sl;

/* compiled from: IPV6Request.java */
/* loaded from: classes.dex */
public abstract class il extends com.amap.api.col.p0003sl.kz {
    @Override // com.amap.api.col.p0003sl.kz
    public boolean isSupportIPV6() {
        return true;
    }

    @Override // com.amap.api.col.p0003sl.kz
    public java.lang.String getIPV6URL() {
        if (android.text.TextUtils.isEmpty(getURL())) {
            return getURL();
        }
        java.lang.String url = getURL();
        android.net.Uri parse = android.net.Uri.parse(url);
        if (parse.getAuthority().startsWith("dualstack-")) {
            return url;
        }
        if (parse.getAuthority().startsWith("restsdk.amap.com")) {
            return parse.buildUpon().authority("dualstack-arestapi.amap.com").build().toString();
        }
        return parse.buildUpon().authority("dualstack-" + parse.getAuthority()).build().toString();
    }
}
