package com.amap.api.col.p0003sl;

/* compiled from: CollectionUploader.java */
/* loaded from: classes.dex */
public final class ml {
    public static boolean a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        byte[] bArr2 = null;
        try {
            com.amap.api.col.p0003sl.ns nsVar = new com.amap.api.col.p0003sl.ns();
            nsVar.b.put("Content-Type", "application/octet-stream");
            nsVar.b.put("aps_c_src", android.util.Base64.encodeToString(com.amap.api.col.p0003sl.ns.a().getBytes(), 2));
            nsVar.b.put("aps_c_key", android.util.Base64.encodeToString(com.amap.api.col.p0003sl.ns.b().getBytes(), 2));
            nsVar.d = bArr;
            if (com.amap.api.col.p0003sl.mc.a) {
                nsVar.a = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            } else {
                nsVar.a = (com.amap.api.col.p0003sl.mc.b ? "https://" : "http://") + "cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            }
            com.amap.api.col.p0003sl.nt a = com.amap.api.col.p0003sl.ng.b().a(nsVar);
            if (a != null && a.a == 200) {
                bArr2 = a.c;
            }
            if (bArr2 != null) {
                return "true".equals(new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8));
            }
            return false;
        } catch (java.lang.Exception e) {
            com.amap.api.col.p0003sl.nr.a(e);
            return false;
        }
    }
}
