package com.amap.api.col.p0003sl;

/* compiled from: AutoTSignatureUtils.java */
/* loaded from: classes.dex */
public final class fd {
    private static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return java.net.URLEncoder.encode(str, com.bumptech.glide.load.Key.STRING_CHARSET_NAME).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static byte[] a(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA1");
        mac.init(new javax.crypto.spec.SecretKeySpec(str.getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME), com.bumptech.glide.load.Key.STRING_CHARSET_NAME));
        return mac.doFinal(str2.getBytes(com.bumptech.glide.load.Key.STRING_CHARSET_NAME));
    }

    private static java.lang.String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 0);
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        return a(a(str3 + "&", str.toUpperCase() + "&%2F&" + a(str2))).replace("=", "%3D");
    }

    public static java.lang.String a(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        treeMap.put("AccessKeyId", str);
        treeMap.put("SignatureMethod", "HMAC-SHA1");
        treeMap.put("SignatureVersion", "1.0");
        treeMap.put("SignatureNonce", java.util.UUID.randomUUID().toString());
        java.util.Date date = new java.util.Date();
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        treeMap.put("Timestamp", simpleDateFormat.format(date));
        treeMap.putAll(map);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + "=" + a((java.lang.String) entry.getValue()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            sb.append("&");
        }
        return sb.toString().substring(0, r3.length() - 1);
    }
}
