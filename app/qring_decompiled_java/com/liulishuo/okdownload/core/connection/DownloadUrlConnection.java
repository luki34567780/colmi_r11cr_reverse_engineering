package com.liulishuo.okdownload.core.connection;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadUrlConnection implements com.liulishuo.okdownload.core.connection.DownloadConnection, com.liulishuo.okdownload.core.connection.DownloadConnection.Connected {
    private static final java.lang.String TAG = "DownloadUrlConnection";
    private com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration;
    protected java.net.URLConnection connection;
    private com.liulishuo.okdownload.IRedirectHandler redirectHandler;
    private java.net.URL url;

    DownloadUrlConnection(java.net.URLConnection uRLConnection) {
        this(uRLConnection, new com.liulishuo.okdownload.core.connection.DownloadUrlConnection.RedirectHandler());
    }

    DownloadUrlConnection(java.net.URLConnection uRLConnection, com.liulishuo.okdownload.IRedirectHandler iRedirectHandler) {
        this.connection = uRLConnection;
        this.url = uRLConnection.getURL();
        this.redirectHandler = iRedirectHandler;
    }

    public DownloadUrlConnection(java.lang.String str, com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration) throws java.io.IOException {
        this(new java.net.URL(str), configuration);
    }

    public DownloadUrlConnection(java.net.URL url, com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration) throws java.io.IOException {
        this(url, configuration, new com.liulishuo.okdownload.core.connection.DownloadUrlConnection.RedirectHandler());
    }

    public DownloadUrlConnection(java.net.URL url, com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration, com.liulishuo.okdownload.IRedirectHandler iRedirectHandler) throws java.io.IOException {
        this.configuration = configuration;
        this.url = url;
        this.redirectHandler = iRedirectHandler;
        configUrlConnection();
    }

    public DownloadUrlConnection(java.lang.String str) throws java.io.IOException {
        this(str, (com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration) null);
    }

    void configUrlConnection() throws java.io.IOException {
        com.liulishuo.okdownload.core.Util.d(TAG, "config connection for " + this.url);
        com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration = this.configuration;
        if (configuration == null || configuration.proxy == null) {
            this.connection = this.url.openConnection();
        } else {
            this.connection = this.url.openConnection(this.configuration.proxy);
        }
        java.net.URLConnection uRLConnection = this.connection;
        if (uRLConnection instanceof java.net.HttpURLConnection) {
            ((java.net.HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
        }
        com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration2 = this.configuration;
        if (configuration2 != null) {
            if (configuration2.readTimeout != null) {
                this.connection.setReadTimeout(this.configuration.readTimeout.intValue());
            }
            if (this.configuration.connectTimeout != null) {
                this.connection.setConnectTimeout(this.configuration.connectTimeout.intValue());
            }
        }
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public void addHeader(java.lang.String str, java.lang.String str2) {
        this.connection.addRequestProperty(str, str2);
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public com.liulishuo.okdownload.core.connection.DownloadConnection.Connected execute() throws java.io.IOException {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> requestProperties = getRequestProperties();
        this.connection.connect();
        this.redirectHandler.handleRedirect(this, this, requestProperties);
        return this;
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public int getResponseCode() throws java.io.IOException {
        java.net.URLConnection uRLConnection = this.connection;
        if (uRLConnection instanceof java.net.HttpURLConnection) {
            return ((java.net.HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.io.InputStream getInputStream() throws java.io.IOException {
        return this.connection.getInputStream();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public boolean setRequestMethod(java.lang.String str) throws java.net.ProtocolException {
        java.net.URLConnection uRLConnection = this.connection;
        if (!(uRLConnection instanceof java.net.HttpURLConnection)) {
            return false;
        }
        ((java.net.HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaderFields() {
        return this.connection.getHeaderFields();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.lang.String getResponseHeaderField(java.lang.String str) {
        return this.connection.getHeaderField(str);
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.lang.String getRedirectLocation() {
        return this.redirectHandler.getRedirectLocation();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public void release() {
        try {
            java.io.InputStream inputStream = this.connection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.io.IOException unused) {
        }
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() {
        return this.connection.getRequestProperties();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public java.lang.String getRequestProperty(java.lang.String str) {
        return this.connection.getRequestProperty(str);
    }

    public static class Factory implements com.liulishuo.okdownload.core.connection.DownloadConnection.Factory {
        private final com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration;

        public Factory() {
            this(null);
        }

        public Factory(com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration configuration) {
            this.configuration = configuration;
        }

        com.liulishuo.okdownload.core.connection.DownloadConnection create(java.net.URL url) throws java.io.IOException {
            return new com.liulishuo.okdownload.core.connection.DownloadUrlConnection(url, this.configuration);
        }

        @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Factory
        public com.liulishuo.okdownload.core.connection.DownloadConnection create(java.lang.String str) throws java.io.IOException {
            return new com.liulishuo.okdownload.core.connection.DownloadUrlConnection(str, this.configuration);
        }
    }

    public static class Configuration {
        private java.lang.Integer connectTimeout;
        private java.net.Proxy proxy;
        private java.lang.Integer readTimeout;

        public com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration proxy(java.net.Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration readTimeout(int i) {
            this.readTimeout = java.lang.Integer.valueOf(i);
            return this;
        }

        public com.liulishuo.okdownload.core.connection.DownloadUrlConnection.Configuration connectTimeout(int i) {
            this.connectTimeout = java.lang.Integer.valueOf(i);
            return this;
        }
    }

    static final class RedirectHandler implements com.liulishuo.okdownload.IRedirectHandler {
        java.lang.String redirectLocation;

        RedirectHandler() {
        }

        @Override // com.liulishuo.okdownload.IRedirectHandler
        public void handleRedirect(com.liulishuo.okdownload.core.connection.DownloadConnection downloadConnection, com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) throws java.io.IOException {
            com.liulishuo.okdownload.core.connection.DownloadUrlConnection downloadUrlConnection = (com.liulishuo.okdownload.core.connection.DownloadUrlConnection) downloadConnection;
            int i = 0;
            for (int responseCode = connected.getResponseCode(); com.liulishuo.okdownload.RedirectUtil.isRedirect(responseCode); responseCode = downloadUrlConnection.getResponseCode()) {
                downloadUrlConnection.release();
                i++;
                if (i > 10) {
                    throw new java.net.ProtocolException("Too many redirect requests: " + i);
                }
                this.redirectLocation = com.liulishuo.okdownload.RedirectUtil.getRedirectedUrl(connected, responseCode);
                downloadUrlConnection.url = new java.net.URL(this.redirectLocation);
                downloadUrlConnection.configUrlConnection();
                com.liulishuo.okdownload.core.Util.addRequestHeaderFields(map, downloadUrlConnection);
                downloadUrlConnection.connection.connect();
            }
        }

        @Override // com.liulishuo.okdownload.IRedirectHandler
        public java.lang.String getRedirectLocation() {
            return this.redirectLocation;
        }
    }
}
