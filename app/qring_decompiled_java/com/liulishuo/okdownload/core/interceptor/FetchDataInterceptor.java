package com.liulishuo.okdownload.core.interceptor;

/* loaded from: /tmp/dex/classes2.dex */
public class FetchDataInterceptor implements com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch {
    private final int blockIndex;
    private final com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher dispatcher = com.liulishuo.okdownload.OkDownload.with().callbackDispatcher();
    private final java.io.InputStream inputStream;
    private final com.liulishuo.okdownload.core.file.MultiPointOutputStream outputStream;
    private final byte[] readBuffer;
    private final com.liulishuo.okdownload.DownloadTask task;

    public FetchDataInterceptor(int i, java.io.InputStream inputStream, com.liulishuo.okdownload.core.file.MultiPointOutputStream multiPointOutputStream, com.liulishuo.okdownload.DownloadTask downloadTask) {
        this.blockIndex = i;
        this.inputStream = inputStream;
        this.readBuffer = new byte[downloadTask.getReadBufferSize()];
        this.outputStream = multiPointOutputStream;
        this.task = downloadTask;
    }

    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch
    public long interceptFetch(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) throws java.io.IOException {
        if (downloadChain.getCache().isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        com.liulishuo.okdownload.OkDownload.with().downloadStrategy().inspectNetworkOnWifi(downloadChain.getTask());
        int read = this.inputStream.read(this.readBuffer);
        if (read == -1) {
            return read;
        }
        this.outputStream.write(this.blockIndex, this.readBuffer, read);
        long j = read;
        downloadChain.increaseCallbackBytes(j);
        if (this.dispatcher.isFetchProcessMoment(this.task)) {
            downloadChain.flushNoCallbackIncreaseBytes();
        }
        return j;
    }
}
