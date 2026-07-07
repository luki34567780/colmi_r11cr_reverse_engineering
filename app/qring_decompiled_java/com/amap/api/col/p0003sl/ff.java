package com.amap.api.col.p0003sl;

/* compiled from: BasicLBSRestHandler.java */
/* loaded from: classes.dex */
public abstract class ff<T, V> extends com.amap.api.col.p0003sl.fe<T, V> {
    @Override // com.amap.api.col.p0003sl.fe
    protected abstract V a(java.lang.String str) throws com.amap.api.services.core.AMapException;

    @Override // com.amap.api.col.p0003sl.fe
    protected abstract java.lang.String c();

    @Override // com.amap.api.col.p0003sl.fe, com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }

    public ff(android.content.Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public byte[] getEntityBytes() {
        try {
            java.lang.String c = c();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            if (c != null) {
                stringBuffer.append(c);
                stringBuffer.append("&");
            }
            stringBuffer.append("language=");
            stringBuffer.append(com.amap.api.services.core.ServiceSettings.getInstance().getLanguage());
            java.lang.String stringBuffer2 = stringBuffer.toString();
            java.lang.String c2 = c(stringBuffer2);
            java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
            stringBuffer3.append(stringBuffer2);
            java.lang.String a = com.amap.api.col.p0003sl.ih.a();
            stringBuffer3.append("&ts=".concat(java.lang.String.valueOf(a)));
            stringBuffer3.append("&scode=" + com.amap.api.col.p0003sl.ih.a(this.e, a, c2));
            return stringBuffer3.toString().getBytes("utf-8");
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.fn.a(th, "ProtocalHandler", "getEntity");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.fe, com.amap.api.col.p0003sl.kz
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Search 9.7.0");
        hashMap.put("X-INFO", com.amap.api.col.p0003sl.ih.b(this.e));
        hashMap.put("platinfo", java.lang.String.format("platform=Android&sdkversion=%s&product=%s", "9.7.0", "sea"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    private static java.lang.String c(java.lang.String str) {
        java.lang.String[] split = str.split("&");
        java.util.Arrays.sort(split);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str2 : split) {
            stringBuffer.append(d(str2));
            stringBuffer.append("&");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() > 1 ? (java.lang.String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1) : str;
    }

    protected static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return str;
        }
        try {
            return java.net.URLEncoder.encode(str, "utf-8");
        } catch (java.io.UnsupportedEncodingException e) {
            com.amap.api.col.p0003sl.fn.a(e, "ProtocalHandler", "strEncoderUnsupportedEncodingException");
            return "";
        } catch (java.lang.Exception e2) {
            com.amap.api.col.p0003sl.fn.a(e2, "ProtocalHandler", "strEncoderException");
            return "";
        }
    }

    private static java.lang.String d(java.lang.String str) {
        if (str == null) {
            return str;
        }
        try {
            return java.net.URLDecoder.decode(str, "utf-8");
        } catch (java.io.UnsupportedEncodingException e) {
            com.amap.api.col.p0003sl.fn.a(e, "ProtocalHandler", "strReEncoder");
            return "";
        } catch (java.lang.Exception e2) {
            com.amap.api.col.p0003sl.fn.a(e2, "ProtocalHandler", "strReEncoderException");
            return "";
        }
    }
}
