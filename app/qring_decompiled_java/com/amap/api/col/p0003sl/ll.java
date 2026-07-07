package com.amap.api.col.p0003sl;

/* compiled from: EncryptRsaDataStrategy.java */
/* loaded from: classes.dex */
public final class ll extends com.amap.api.col.p0003sl.lq {
    private com.amap.api.col.p0003sl.kl a;

    public ll() {
        this.a = new com.amap.api.col.p0003sl.kn();
    }

    public ll(com.amap.api.col.p0003sl.lq lqVar) {
        super(lqVar);
        this.a = new com.amap.api.col.p0003sl.kn();
    }

    @Override // com.amap.api.col.p0003sl.lq
    protected final byte[] a(byte[] bArr) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        return this.a.b(bArr);
    }
}
