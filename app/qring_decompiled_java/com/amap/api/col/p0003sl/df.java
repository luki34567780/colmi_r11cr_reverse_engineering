package com.amap.api.col.p0003sl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* compiled from: BaseTileRequest.java */
/* loaded from: classes.dex */
public abstract class df extends db {
    @Override // com.amap.api.col.p0003sl.db, com.amap.api.col.p0003sl.kz
    public Map<String, String> getParams() {
        return null;
    }

    public df() {
        setProxy(ip.a(ab.a));
        setConnectionTimeout(5000);
        setSoTimeout(50000);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public Map<String, String> getRequestHead() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", w.c);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "9.8.2", "3dmap"));
        hashtable.put("x-INFO", ih.a(ab.a));
        hashtable.put("key", ie.f(ab.a));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    protected String appendTsScode(String str) {
        String a = a(str);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        String a2 = ih.a();
        stringBuffer.append("&ts=".concat(String.valueOf(a2)));
        stringBuffer.append("&scode=" + ih.a(ab.a, a2, a));
        return stringBuffer.toString();
    }

    private static String a(String str) {
        String[] split = str.split("&");
        Arrays.sort(split);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : split) {
            stringBuffer.append(b(str2));
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() > 1 ? (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1) : str;
    }

    private static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            ju.c(e, "AbstractProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            ju.c(e2, "AbstractProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    @Override // com.amap.api.col.p0003sl.kz
    public String getIPV6URL() {
        String url = getURL();
        return (url == null || !url.contains("http://restsdk.amap.com/v4/gridmap?")) ? url : dx.a(url);
    }

    @Override // com.amap.api.col.p0003sl.kz
    public boolean isSupportIPV6() {
        String url = getURL();
        return url != null && url.contains("http://restsdk.amap.com/v4/gridmap?");
    }
}
