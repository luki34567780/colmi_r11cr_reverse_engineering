package com.amap.api.col.p0003sl;

/* compiled from: HeaderAddStrategy.java */
/* loaded from: classes.dex */
public final class lm extends com.amap.api.col.p0003sl.lq {
    private android.content.Context a;
    private java.lang.String b;
    private com.amap.api.col.p0003sl.kl e;
    private java.lang.Object[] f;

    public lm(android.content.Context context, com.amap.api.col.p0003sl.lq lqVar, com.amap.api.col.p0003sl.kl klVar, java.lang.String str, java.lang.Object... objArr) {
        super(lqVar);
        this.a = context;
        this.b = str;
        this.e = klVar;
        this.f = objArr;
    }

    @Override // com.amap.api.col.p0003sl.lq
    protected final byte[] a(byte[] bArr) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        java.lang.String a = com.amap.api.col.p0003sl.ir.a(bArr);
        if (android.text.TextUtils.isEmpty(a)) {
            return null;
        }
        return com.amap.api.col.p0003sl.ir.a("{\"pinfo\":\"" + com.amap.api.col.p0003sl.ir.a(this.e.b(com.amap.api.col.p0003sl.ir.a(b()))) + "\",\"els\":[" + a + "]}");
    }

    private java.lang.String b() {
        try {
            return java.lang.String.format(com.amap.api.col.p0003sl.ir.c(this.b), this.f);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            com.amap.api.col.p0003sl.ju.c(th, "ofm", "gpj");
            return "";
        }
    }
}
