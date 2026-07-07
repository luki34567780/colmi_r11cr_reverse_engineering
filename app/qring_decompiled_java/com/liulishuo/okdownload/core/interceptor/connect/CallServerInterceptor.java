package com.liulishuo.okdownload.core.interceptor.connect;

/* loaded from: /tmp/dex/classes2.dex */
public class CallServerInterceptor implements com.liulishuo.okdownload.core.interceptor.Interceptor.Connect {
    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Connect
    public com.liulishuo.okdownload.core.connection.DownloadConnection.Connected interceptConnect(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException {
        com.liulishuo.okdownload.OkDownload.with().downloadStrategy().inspectNetworkOnWifi(downloadChain.getTask());
        com.liulishuo.okdownload.OkDownload.with().downloadStrategy().inspectNetworkAvailable();
        return downloadChain.getConnectionOrCreate().execute();
    }
}
