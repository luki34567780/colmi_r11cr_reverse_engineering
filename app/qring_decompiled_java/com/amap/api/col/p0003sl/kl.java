package com.amap.api.col.p0003sl;

/* compiled from: EncryptProcessor.java */
/* loaded from: classes.dex */
public abstract class kl {
    com.amap.api.col.p0003sl.kl a;

    protected abstract byte[] a(byte[] bArr) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException;

    kl() {
    }

    kl(com.amap.api.col.p0003sl.kl klVar) {
        this.a = klVar;
    }

    public final byte[] b(byte[] bArr) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.NoSuchPaddingException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
        com.amap.api.col.p0003sl.kl klVar = this.a;
        if (klVar != null) {
            bArr = klVar.b(bArr);
        }
        return a(bArr);
    }
}
