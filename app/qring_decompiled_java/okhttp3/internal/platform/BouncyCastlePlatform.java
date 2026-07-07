package okhttp3.internal.platform;

/* compiled from: BouncyCastlePlatform.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\fH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/BouncyCastlePlatform;", "Lokhttp3/internal/platform/Platform;", "()V", "provider", "Ljava/security/Provider;", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "getSelectedProtocol", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "platformTrustManager", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class BouncyCastlePlatform extends okhttp3.internal.platform.Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.BouncyCastlePlatform.Companion INSTANCE;
    private static final boolean isSupported;
    private final java.security.Provider provider;

    private BouncyCastlePlatform() {
        this.provider = new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider();
    }

    public /* synthetic */ BouncyCastlePlatform(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext newSSLContext() {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", this.provider);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager platformTrustManager() {
        javax.net.ssl.TrustManagerFactory factory = javax.net.ssl.TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        factory.init((java.security.KeyStore) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(factory, "factory");
        javax.net.ssl.TrustManager[] trustManagers = factory.getTrustManagers();
        kotlin.jvm.internal.Intrinsics.checkNotNull(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof javax.net.ssl.X509TrustManager))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Unexpected default trust managers: ");
            java.lang.String arrays = java.util.Arrays.toString(trustManagers);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        javax.net.ssl.TrustManager trustManager = trustManagers[0];
        java.util.Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return (javax.net.ssl.X509TrustManager) trustManager;
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        throw new java.lang.UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (sslSocket instanceof org.bouncycastle.jsse.BCSSLSocket) {
            org.bouncycastle.jsse.BCSSLSocket bCSSLSocket = (org.bouncycastle.jsse.BCSSLSocket) sslSocket;
            org.bouncycastle.jsse.BCSSLParameters sslParameters = bCSSLSocket.getParameters();
            java.util.List<java.lang.String> alpnProtocolNames = okhttp3.internal.platform.Platform.INSTANCE.alpnProtocolNames(protocols);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
            java.lang.Object[] array = alpnProtocolNames.toArray(new java.lang.String[0]);
            java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            sslParameters.setApplicationProtocols((java.lang.String[]) array);
            bCSSLSocket.setParameters(sslParameters);
            return;
        }
        super.configureTlsExtensions(sslSocket, hostname, protocols);
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (sslSocket instanceof org.bouncycastle.jsse.BCSSLSocket) {
            java.lang.String applicationProtocol = ((org.bouncycastle.jsse.BCSSLSocket) sslSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.getSelectedProtocol(sslSocket);
    }

    /* compiled from: BouncyCastlePlatform.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/BouncyCastlePlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/BouncyCastlePlatform;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupported() {
            return okhttp3.internal.platform.BouncyCastlePlatform.isSupported;
        }

        public final okhttp3.internal.platform.BouncyCastlePlatform buildIfSupported() {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (isSupported()) {
                return new okhttp3.internal.platform.BouncyCastlePlatform(defaultConstructorMarker);
            }
            return null;
        }
    }

    static {
        okhttp3.internal.platform.BouncyCastlePlatform.Companion companion = new okhttp3.internal.platform.BouncyCastlePlatform.Companion(null);
        INSTANCE = companion;
        boolean z = false;
        try {
            java.lang.Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        isSupported = z;
    }
}
