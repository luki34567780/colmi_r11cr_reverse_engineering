package okhttp3.internal.platform;

/* compiled from: Platform.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011H\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u000fJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J&\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u001a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020+H\u0016¨\u00060"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "()V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", "address", "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getPrefix", "getSelectedProtocol", "getStackTraceForCloseable", "closer", "isCleartextTrafficPermitted", "", "log", "message", "level", "t", "", "logCloseableLeak", "stackTrace", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "platformTrustManager", "toString", "sslSocketFactory", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.platform.Platform.Companion INSTANCE;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final java.util.logging.Logger logger;
    private static volatile okhttp3.internal.platform.Platform platform;

    @kotlin.jvm.JvmStatic
    public static final okhttp3.internal.platform.Platform get() {
        return INSTANCE.get();
    }

    public void afterHandshake(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public void configureTlsExtensions(javax.net.ssl.SSLSocket sslSocket, java.lang.String hostname, java.util.List<okhttp3.Protocol> protocols) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public final java.lang.String getPrefix() {
        return "OkHttp";
    }

    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sslSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public boolean isCleartextTrafficPermitted(java.lang.String hostname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public javax.net.ssl.SSLContext newSSLContext() {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public javax.net.ssl.X509TrustManager platformTrustManager() {
        javax.net.ssl.TrustManagerFactory factory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
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

    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sslSocketFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        try {
            java.lang.Class<?> sslContextClass = java.lang.Class.forName("sun.security.ssl.SSLContextImpl");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sslContextClass, "sslContextClass");
            java.lang.Object readFieldOrNull = okhttp3.internal.Util.readFieldOrNull(sslSocketFactory, sslContextClass, "context");
            if (readFieldOrNull != null) {
                return (javax.net.ssl.X509TrustManager) okhttp3.internal.Util.readFieldOrNull(readFieldOrNull, javax.net.ssl.X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.RuntimeException e) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }

    public void connectSocket(java.net.Socket socket, java.net.InetSocketAddress address, int connectTimeout) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socket, "socket");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, connectTimeout);
    }

    public static /* synthetic */ void log$default(okhttp3.internal.platform.Platform platform2, java.lang.String str, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        platform2.log(str, i, th);
    }

    public void log(java.lang.String message, int level, java.lang.Throwable t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        logger.log(level == 5 ? java.util.logging.Level.WARNING : java.util.logging.Level.INFO, message, t);
    }

    public java.lang.Object getStackTraceForCloseable(java.lang.String closer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closer, "closer");
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            return new java.lang.Throwable(closer);
        }
        return null;
    }

    public void logCloseableLeak(java.lang.String message, java.lang.Object stackTrace) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(message, 5, (java.lang.Throwable) stackTrace);
    }

    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new okhttp3.internal.tls.BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        java.security.cert.X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new okhttp3.internal.tls.BasicTrustRootIndex((java.security.cert.X509Certificate[]) java.util.Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public javax.net.ssl.SSLSocketFactory newSslSocketFactory(javax.net.ssl.X509TrustManager trustManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            javax.net.ssl.SSLContext newSSLContext = newSSLContext();
            newSSLContext.init(null, new javax.net.ssl.TrustManager[]{trustManager}, null);
            javax.net.ssl.SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.AssertionError("No System TLS: " + e, e);
        }
    }

    public java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    /* compiled from: Platform.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "()V", "INFO", "", "WARN", "isAndroid", "", "()Z", "isBouncyCastlePreferred", "isConscryptPreferred", "isOpenJSSEPreferred", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "platform", "Lokhttp3/internal/platform/Platform;", "alpnProtocolNames", "", "", "protocols", "Lokhttp3/Protocol;", "concatLengthPrefixed", "", "findAndroidPlatform", "findJvmPlatform", "findPlatform", "get", "resetForTests", "", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.internal.platform.Platform get() {
            return okhttp3.internal.platform.Platform.platform;
        }

        public static /* synthetic */ void resetForTests$default(okhttp3.internal.platform.Platform.Companion companion, okhttp3.internal.platform.Platform platform, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final void resetForTests(okhttp3.internal.platform.Platform platform) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
            okhttp3.internal.platform.Platform.platform = platform;
        }

        public final java.util.List<java.lang.String> alpnProtocolNames(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : protocols) {
                if (((okhttp3.Protocol) obj) != okhttp3.Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((okhttp3.Protocol) it.next()).getProtocol());
            }
            return arrayList3;
        }

        public final boolean isAndroid() {
            return kotlin.jvm.internal.Intrinsics.areEqual("Dalvik", java.lang.System.getProperty("java.vm.name"));
        }

        private final boolean isConscryptPreferred() {
            java.security.Provider provider = java.security.Security.getProviders()[0];
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return kotlin.jvm.internal.Intrinsics.areEqual("Conscrypt", provider.getName());
        }

        private final boolean isOpenJSSEPreferred() {
            java.security.Provider provider = java.security.Security.getProviders()[0];
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return kotlin.jvm.internal.Intrinsics.areEqual("OpenJSSE", provider.getName());
        }

        private final boolean isBouncyCastlePreferred() {
            java.security.Provider provider = java.security.Security.getProviders()[0];
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return kotlin.jvm.internal.Intrinsics.areEqual("BC", provider.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final okhttp3.internal.platform.Platform findPlatform() {
            if (isAndroid()) {
                return findAndroidPlatform();
            }
            return findJvmPlatform();
        }

        private final okhttp3.internal.platform.Platform findAndroidPlatform() {
            okhttp3.internal.platform.android.AndroidLog.INSTANCE.enable();
            okhttp3.internal.platform.Platform buildIfSupported = okhttp3.internal.platform.Android10Platform.INSTANCE.buildIfSupported();
            if (buildIfSupported != null) {
                return buildIfSupported;
            }
            okhttp3.internal.platform.Platform buildIfSupported2 = okhttp3.internal.platform.AndroidPlatform.Companion.buildIfSupported();
            kotlin.jvm.internal.Intrinsics.checkNotNull(buildIfSupported2);
            return buildIfSupported2;
        }

        private final okhttp3.internal.platform.Platform findJvmPlatform() {
            okhttp3.internal.platform.OpenJSSEPlatform buildIfSupported;
            okhttp3.internal.platform.BouncyCastlePlatform buildIfSupported2;
            okhttp3.internal.platform.ConscryptPlatform buildIfSupported3;
            if (isConscryptPreferred() && (buildIfSupported3 = okhttp3.internal.platform.ConscryptPlatform.INSTANCE.buildIfSupported()) != null) {
                return buildIfSupported3;
            }
            if (isBouncyCastlePreferred() && (buildIfSupported2 = okhttp3.internal.platform.BouncyCastlePlatform.INSTANCE.buildIfSupported()) != null) {
                return buildIfSupported2;
            }
            if (isOpenJSSEPreferred() && (buildIfSupported = okhttp3.internal.platform.OpenJSSEPlatform.INSTANCE.buildIfSupported()) != null) {
                return buildIfSupported;
            }
            okhttp3.internal.platform.Jdk9Platform buildIfSupported4 = okhttp3.internal.platform.Jdk9Platform.INSTANCE.buildIfSupported();
            if (buildIfSupported4 != null) {
                return buildIfSupported4;
            }
            okhttp3.internal.platform.Platform buildIfSupported5 = okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            return buildIfSupported5 != null ? buildIfSupported5 : new okhttp3.internal.platform.Platform();
        }

        public final byte[] concatLengthPrefixed(java.util.List<? extends okhttp3.Protocol> protocols) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocols, "protocols");
            okio.Buffer buffer = new okio.Buffer();
            for (java.lang.String str : alpnProtocolNames(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }
    }

    static {
        okhttp3.internal.platform.Platform.Companion companion = new okhttp3.internal.platform.Platform.Companion(null);
        INSTANCE = companion;
        platform = companion.findPlatform();
        logger = java.util.logging.Logger.getLogger(okhttp3.OkHttpClient.class.getName());
    }
}
