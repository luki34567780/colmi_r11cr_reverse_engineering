package com.amap.api.col.p0003sl;

/* compiled from: UpdateDataStrategy.java */
/* loaded from: classes.dex */
public abstract class lq {
    com.amap.api.col.p0003sl.lq c;
    byte[] d = null;

    protected abstract byte[] a(byte[] bArr) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException;

    public void b(byte[] bArr) {
    }

    lq() {
    }

    lq(com.amap.api.col.p0003sl.lq lqVar) {
        this.c = lqVar;
    }

    public final byte[] a() throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        byte[] a = a(this.d);
        com.amap.api.col.p0003sl.lq lqVar = this.c;
        if (lqVar == null) {
            return a;
        }
        lqVar.d = a;
        return lqVar.a();
    }
}
