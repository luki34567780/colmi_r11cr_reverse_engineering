package com.liulishuo.okdownload.core.download;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadChain implements java.lang.Runnable {
    private static final java.util.concurrent.ExecutorService EXECUTOR = new java.util.concurrent.ThreadPoolExecutor(0, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.liulishuo.okdownload.core.Util.threadFactory("OkDownload Cancel Block", false));
    private static final java.lang.String TAG = "DownloadChain";
    private final int blockIndex;
    private final com.liulishuo.okdownload.core.download.DownloadCache cache;
    private volatile com.liulishuo.okdownload.core.connection.DownloadConnection connection;
    volatile java.lang.Thread currentThread;
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;
    long noCallbackIncreaseBytes;
    private long responseContentLength;
    private final com.liulishuo.okdownload.core.breakpoint.DownloadStore store;
    private final com.liulishuo.okdownload.DownloadTask task;
    final java.util.List<com.liulishuo.okdownload.core.interceptor.Interceptor.Connect> connectInterceptorList = new java.util.ArrayList();
    final java.util.List<com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch> fetchInterceptorList = new java.util.ArrayList();
    int connectIndex = 0;
    int fetchIndex = 0;
    final java.util.concurrent.atomic.AtomicBoolean finished = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.lang.Runnable releaseConnectionRunnable = new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.download.DownloadChain.1
        @Override // java.lang.Runnable
        public void run() {
            com.liulishuo.okdownload.core.download.DownloadChain.this.releaseConnection();
        }
    };
    private final com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher = com.liulishuo.okdownload.OkDownload.with().callbackDispatcher();

    static com.liulishuo.okdownload.core.download.DownloadChain createChain(int i, com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.download.DownloadCache downloadCache, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        return new com.liulishuo.okdownload.core.download.DownloadChain(i, downloadTask, breakpointInfo, downloadCache, downloadStore);
    }

    private DownloadChain(int i, com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.download.DownloadCache downloadCache, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        this.blockIndex = i;
        this.task = downloadTask;
        this.cache = downloadCache;
        this.info = breakpointInfo;
        this.store = downloadStore;
    }

    public long getResponseContentLength() {
        return this.responseContentLength;
    }

    public void setResponseContentLength(long j) {
        this.responseContentLength = j;
    }

    public void cancel() {
        if (this.finished.get() || this.currentThread == null) {
            return;
        }
        this.currentThread.interrupt();
    }

    public com.liulishuo.okdownload.DownloadTask getTask() {
        return this.task;
    }

    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getInfo() {
        return this.info;
    }

    public int getBlockIndex() {
        return this.blockIndex;
    }

    public synchronized void setConnection(com.liulishuo.okdownload.core.connection.DownloadConnection downloadConnection) {
        this.connection = downloadConnection;
    }

    public com.liulishuo.okdownload.core.download.DownloadCache getCache() {
        return this.cache;
    }

    public void setRedirectLocation(java.lang.String str) {
        this.cache.setRedirectLocation(str);
    }

    public com.liulishuo.okdownload.core.file.MultiPointOutputStream getOutputStream() {
        return this.cache.getOutputStream();
    }

    public synchronized com.liulishuo.okdownload.core.connection.DownloadConnection getConnection() {
        return this.connection;
    }

    public synchronized com.liulishuo.okdownload.core.connection.DownloadConnection getConnectionOrCreate() throws java.io.IOException {
        if (this.cache.isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        if (this.connection == null) {
            java.lang.String redirectLocation = this.cache.getRedirectLocation();
            if (redirectLocation == null) {
                redirectLocation = this.info.getUrl();
            }
            com.liulishuo.okdownload.core.Util.d(TAG, "create connection on url: " + redirectLocation);
            this.connection = com.liulishuo.okdownload.OkDownload.with().connectionFactory().create(redirectLocation);
        }
        return this.connection;
    }

    public void increaseCallbackBytes(long j) {
        this.noCallbackIncreaseBytes += j;
    }

    public void flushNoCallbackIncreaseBytes() {
        if (this.noCallbackIncreaseBytes == 0) {
            return;
        }
        this.callbackDispatcher.dispatch().fetchProgress(this.task, this.blockIndex, this.noCallbackIncreaseBytes);
        this.noCallbackIncreaseBytes = 0L;
    }

    void start() throws java.io.IOException {
        com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher = com.liulishuo.okdownload.OkDownload.with().callbackDispatcher();
        com.liulishuo.okdownload.core.interceptor.RetryInterceptor retryInterceptor = new com.liulishuo.okdownload.core.interceptor.RetryInterceptor();
        com.liulishuo.okdownload.core.interceptor.BreakpointInterceptor breakpointInterceptor = new com.liulishuo.okdownload.core.interceptor.BreakpointInterceptor();
        this.connectInterceptorList.add(retryInterceptor);
        this.connectInterceptorList.add(breakpointInterceptor);
        this.connectInterceptorList.add(new com.liulishuo.okdownload.core.interceptor.connect.HeaderInterceptor());
        this.connectInterceptorList.add(new com.liulishuo.okdownload.core.interceptor.connect.CallServerInterceptor());
        this.connectIndex = 0;
        com.liulishuo.okdownload.core.connection.DownloadConnection.Connected processConnect = processConnect();
        if (this.cache.isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        callbackDispatcher.dispatch().fetchStart(this.task, this.blockIndex, getResponseContentLength());
        com.liulishuo.okdownload.core.interceptor.FetchDataInterceptor fetchDataInterceptor = new com.liulishuo.okdownload.core.interceptor.FetchDataInterceptor(this.blockIndex, processConnect.getInputStream(), getOutputStream(), this.task);
        this.fetchInterceptorList.add(retryInterceptor);
        this.fetchInterceptorList.add(breakpointInterceptor);
        this.fetchInterceptorList.add(fetchDataInterceptor);
        this.fetchIndex = 0;
        callbackDispatcher.dispatch().fetchEnd(this.task, this.blockIndex, processFetch());
    }

    public void resetConnectForRetry() {
        this.connectIndex = 1;
        releaseConnection();
    }

    public synchronized void releaseConnection() {
        if (this.connection != null) {
            this.connection.release();
            com.liulishuo.okdownload.core.Util.d(TAG, "release connection " + this.connection + " task[" + this.task.getId() + "] block[" + this.blockIndex + "]");
        }
        this.connection = null;
    }

    public com.liulishuo.okdownload.core.connection.DownloadConnection.Connected processConnect() throws java.io.IOException {
        if (this.cache.isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        java.util.List<com.liulishuo.okdownload.core.interceptor.Interceptor.Connect> list = this.connectInterceptorList;
        int i = this.connectIndex;
        this.connectIndex = i + 1;
        return list.get(i).interceptConnect(this);
    }

    public long processFetch() throws java.io.IOException {
        if (this.cache.isInterrupt()) {
            throw com.liulishuo.okdownload.core.exception.InterruptException.SIGNAL;
        }
        java.util.List<com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch> list = this.fetchInterceptorList;
        int i = this.fetchIndex;
        this.fetchIndex = i + 1;
        return list.get(i).interceptFetch(this);
    }

    public long loopFetch() throws java.io.IOException {
        if (this.fetchIndex == this.fetchInterceptorList.size()) {
            this.fetchIndex--;
        }
        return processFetch();
    }

    boolean isFinished() {
        return this.finished.get();
    }

    public com.liulishuo.okdownload.core.breakpoint.DownloadStore getDownloadStore() {
        return this.store;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isFinished()) {
            throw new java.lang.IllegalAccessError("The chain has been finished!");
        }
        this.currentThread = java.lang.Thread.currentThread();
        try {
            start();
        } catch (java.io.IOException unused) {
        } catch (java.lang.Throwable th) {
            this.finished.set(true);
            releaseConnectionAsync();
            throw th;
        }
        this.finished.set(true);
        releaseConnectionAsync();
    }

    void releaseConnectionAsync() {
        EXECUTOR.execute(this.releaseConnectionRunnable);
    }
}
