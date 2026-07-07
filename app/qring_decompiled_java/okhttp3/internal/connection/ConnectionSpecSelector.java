package okhttp3.internal.connection;

/* compiled from: ConnectionSpecSelector.kt */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "(Ljava/util/List;)V", "isFallback", "", "isFallbackPossible", "nextModeIndex", "", "configureSecureSocket", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "connectionFailed", com.amap.api.col.p0003sl.js.h, "Ljava/io/IOException;", "socket", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ConnectionSpecSelector {
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(java.util.List<okhttp3.ConnectionSpec> connectionSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    public final okhttp3.ConnectionSpec configureSecureSocket(javax.net.ssl.SSLSocket sslSocket) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        okhttp3.ConnectionSpec connectionSpec = null;
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i >= size) {
                break;
            }
            okhttp3.ConnectionSpec connectionSpec2 = this.connectionSpecs.get(i);
            if (connectionSpec2.isCompatible(sslSocket)) {
                this.nextModeIndex = i + 1;
                connectionSpec = connectionSpec2;
                break;
            }
            i++;
        }
        if (connectionSpec == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Unable to find acceptable protocols. isFallback=");
            sb.append(this.isFallback);
            sb.append(',');
            sb.append(" modes=");
            sb.append(this.connectionSpecs);
            sb.append(',');
            sb.append(" supported protocols=");
            java.lang.String[] enabledProtocols = sslSocket.getEnabledProtocols();
            kotlin.jvm.internal.Intrinsics.checkNotNull(enabledProtocols);
            java.lang.String arrays = java.util.Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new java.net.UnknownServiceException(sb.toString());
        }
        this.isFallbackPossible = isFallbackPossible(sslSocket);
        connectionSpec.apply$okhttp(sslSocket, this.isFallback);
        return connectionSpec;
    }

    public final boolean connectionFailed(java.io.IOException e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        this.isFallback = true;
        return (!this.isFallbackPossible || (e instanceof java.net.ProtocolException) || (e instanceof java.io.InterruptedIOException) || ((e instanceof javax.net.ssl.SSLHandshakeException) && (e.getCause() instanceof java.security.cert.CertificateException)) || (e instanceof javax.net.ssl.SSLPeerUnverifiedException) || !(e instanceof javax.net.ssl.SSLException)) ? false : true;
    }

    private final boolean isFallbackPossible(javax.net.ssl.SSLSocket socket) {
        int size = this.connectionSpecs.size();
        for (int i = this.nextModeIndex; i < size; i++) {
            if (this.connectionSpecs.get(i).isCompatible(socket)) {
                return true;
            }
        }
        return false;
    }
}
