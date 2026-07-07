package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public interface IRedirectHandler {
    java.lang.String getRedirectLocation();

    void handleRedirect(com.liulishuo.okdownload.core.connection.DownloadConnection downloadConnection, com.liulishuo.okdownload.core.connection.DownloadConnection.Connected connected, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) throws java.io.IOException;
}
