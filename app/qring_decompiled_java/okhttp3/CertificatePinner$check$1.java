package okhttp3;

/* compiled from: CertificatePinner.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class CertificatePinner$check$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends java.security.cert.X509Certificate>> {
    final /* synthetic */ java.lang.String $hostname;
    final /* synthetic */ java.util.List $peerCertificates;
    final /* synthetic */ okhttp3.CertificatePinner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CertificatePinner$check$1(okhttp3.CertificatePinner certificatePinner, java.util.List list, java.lang.String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.List<? extends java.security.cert.X509Certificate> invoke() {
        java.util.List<java.security.cert.Certificate> list;
        okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner = this.this$0.getCertificateChainCleaner();
        if (certificateChainCleaner == null || (list = certificateChainCleaner.clean(this.$peerCertificates, this.$hostname)) == null) {
            list = this.$peerCertificates;
        }
        java.util.List<java.security.cert.Certificate> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (java.security.cert.Certificate certificate : list2) {
            java.util.Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((java.security.cert.X509Certificate) certificate);
        }
        return arrayList;
    }
}
