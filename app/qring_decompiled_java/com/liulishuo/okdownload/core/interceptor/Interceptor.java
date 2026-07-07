package com.liulishuo.okdownload.core.interceptor;

/* loaded from: /tmp/dex/classes2.dex */
public interface Interceptor {

    public interface Connect {
        com.liulishuo.okdownload.core.connection.DownloadConnection.Connected interceptConnect(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException;
    }

    public interface Fetch {
        long interceptFetch(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException;
    }
}
