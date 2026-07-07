package com.liulishuo.okdownload.core.connection;

/* loaded from: /tmp/dex/classes2.dex */
public interface DownloadConnection {
    public static final int NO_RESPONSE_CODE = 0;

    public interface Connected {
        java.io.InputStream getInputStream() throws java.io.IOException;

        java.lang.String getRedirectLocation();

        int getResponseCode() throws java.io.IOException;

        java.lang.String getResponseHeaderField(java.lang.String str);

        java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaderFields();
    }

    public interface Factory {
        com.liulishuo.okdownload.core.connection.DownloadConnection create(java.lang.String str) throws java.io.IOException;
    }

    void addHeader(java.lang.String str, java.lang.String str2);

    com.liulishuo.okdownload.core.connection.DownloadConnection.Connected execute() throws java.io.IOException;

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties();

    java.lang.String getRequestProperty(java.lang.String str);

    void release();

    boolean setRequestMethod(java.lang.String str) throws java.net.ProtocolException;
}
