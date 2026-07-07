package com.liulishuo.okdownload.core.connection;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadOkHttp3Connection implements com.liulishuo.okdownload.core.connection.DownloadConnection, com.liulishuo.okdownload.core.connection.DownloadConnection.Connected {
    final okhttp3.OkHttpClient client;
    private okhttp3.Request request;
    private final okhttp3.Request.Builder requestBuilder;
    okhttp3.Response response;

    DownloadOkHttp3Connection(okhttp3.OkHttpClient okHttpClient, okhttp3.Request.Builder builder) {
        this.client = okHttpClient;
        this.requestBuilder = builder;
    }

    DownloadOkHttp3Connection(okhttp3.OkHttpClient okHttpClient, java.lang.String str) {
        this(okHttpClient, new okhttp3.Request.Builder().url(str));
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public void addHeader(java.lang.String str, java.lang.String str2) {
        this.requestBuilder.addHeader(str, str2);
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public com.liulishuo.okdownload.core.connection.DownloadConnection.Connected execute() throws java.io.IOException {
        okhttp3.Request build = this.requestBuilder.build();
        this.request = build;
        this.response = this.client.newCall(build).execute();
        return this;
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public void release() {
        this.request = null;
        okhttp3.Response response = this.response;
        if (response != null) {
            response.close();
        }
        this.response = null;
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() {
        okhttp3.Request request = this.request;
        if (request != null) {
            return request.headers().toMultimap();
        }
        return this.requestBuilder.build().headers().toMultimap();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public java.lang.String getRequestProperty(java.lang.String str) {
        okhttp3.Request request = this.request;
        if (request != null) {
            return request.header(str);
        }
        return this.requestBuilder.build().header(str);
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public int getResponseCode() throws java.io.IOException {
        okhttp3.Response response = this.response;
        if (response == null) {
            throw new java.io.IOException("Please invoke execute first!");
        }
        return response.code();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.io.InputStream getInputStream() throws java.io.IOException {
        okhttp3.Response response = this.response;
        if (response == null) {
            throw new java.io.IOException("Please invoke execute first!");
        }
        okhttp3.ResponseBody body = response.body();
        if (body == null) {
            throw new java.io.IOException("no body found on response!");
        }
        return body.byteStream();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection
    public boolean setRequestMethod(java.lang.String str) throws java.net.ProtocolException {
        this.requestBuilder.method(str, (okhttp3.RequestBody) null);
        return true;
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaderFields() {
        okhttp3.Response response = this.response;
        if (response == null) {
            return null;
        }
        return response.headers().toMultimap();
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.lang.String getResponseHeaderField(java.lang.String str) {
        okhttp3.Response response = this.response;
        if (response == null) {
            return null;
        }
        return response.header(str);
    }

    @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Connected
    public java.lang.String getRedirectLocation() {
        okhttp3.Response priorResponse = this.response.priorResponse();
        if (priorResponse != null && this.response.isSuccessful() && com.liulishuo.okdownload.RedirectUtil.isRedirect(priorResponse.code())) {
            return this.response.request().url().toString();
        }
        return null;
    }

    public static class Factory implements com.liulishuo.okdownload.core.connection.DownloadConnection.Factory {
        private volatile okhttp3.OkHttpClient client;
        private okhttp3.OkHttpClient.Builder clientBuilder;

        public com.liulishuo.okdownload.core.connection.DownloadOkHttp3Connection.Factory setBuilder(okhttp3.OkHttpClient.Builder builder) {
            this.clientBuilder = builder;
            return this;
        }

        public okhttp3.OkHttpClient.Builder builder() {
            if (this.clientBuilder == null) {
                this.clientBuilder = new okhttp3.OkHttpClient.Builder();
            }
            return this.clientBuilder;
        }

        @Override // com.liulishuo.okdownload.core.connection.DownloadConnection.Factory
        public com.liulishuo.okdownload.core.connection.DownloadConnection create(java.lang.String str) throws java.io.IOException {
            if (this.client == null) {
                synchronized (com.liulishuo.okdownload.core.connection.DownloadOkHttp3Connection.Factory.class) {
                    if (this.client == null) {
                        okhttp3.OkHttpClient.Builder builder = this.clientBuilder;
                        this.client = builder != null ? builder.build() : new okhttp3.OkHttpClient();
                        this.clientBuilder = null;
                    }
                }
            }
            return new com.liulishuo.okdownload.core.connection.DownloadOkHttp3Connection(this.client, str);
        }
    }
}
