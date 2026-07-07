package com.liulishuo.okdownload.core.interceptor;

/* loaded from: /tmp/dex/classes2.dex */
public class RetryInterceptor implements com.liulishuo.okdownload.core.interceptor.Interceptor.Connect, com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch {
    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Connect
    public com.liulishuo.okdownload.core.connection.DownloadConnection.Connected interceptConnect(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException {
        com.liulishuo.okdownload.core.download.DownloadCache cache = downloadChain.getCache();
        while (true) {
            try {
                if (cache.isInterrupt()) {
                    throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
                }
                return downloadChain.processConnect();
            } catch (java.io.IOException e) {
                if (e instanceof com.liulishuo.okdownload.core.exception.RetryException) {
                    downloadChain.resetConnectForRetry();
                } else {
                    downloadChain.getCache().catchException(e);
                    downloadChain.getOutputStream().catchBlockConnectException(downloadChain.getBlockIndex());
                    throw e;
                }
            }
        }
    }

    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch
    public long interceptFetch(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException {
        try {
            return downloadChain.processFetch();
        } catch (java.io.IOException e) {
            downloadChain.getCache().catchException(e);
            throw e;
        }
    }
}
