package com.liulishuo.okdownload.core.download;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadCall extends com.liulishuo.okdownload.core.NamedRunnable implements java.lang.Comparable<com.liulishuo.okdownload.core.download.DownloadCall> {
    private static final java.util.concurrent.ExecutorService EXECUTOR = new java.util.concurrent.ThreadPoolExecutor(0, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.liulishuo.okdownload.core.Util.threadFactory("OkDownload Block", false));
    static final int MAX_COUNT_RETRY_FOR_PRECONDITION_FAILED = 1;
    private static final java.lang.String TAG = "DownloadCall";
    public final boolean asyncExecuted;
    final java.util.ArrayList<com.liulishuo.okdownload.core.download.DownloadChain> blockChainList;
    volatile com.liulishuo.okdownload.core.download.DownloadCache cache;
    volatile boolean canceled;
    volatile java.lang.Thread currentThread;
    volatile boolean finishing;
    private final com.liulishuo.okdownload.core.breakpoint.DownloadStore store;
    public final com.liulishuo.okdownload.DownloadTask task;

    @Override // com.liulishuo.okdownload.core.NamedRunnable
    protected void interrupted(java.lang.InterruptedException interruptedException) {
    }

    private DownloadCall(com.liulishuo.okdownload.DownloadTask downloadTask, boolean z, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        this(downloadTask, z, new java.util.ArrayList(), downloadStore);
    }

    DownloadCall(com.liulishuo.okdownload.DownloadTask downloadTask, boolean z, java.util.ArrayList<com.liulishuo.okdownload.core.download.DownloadChain> arrayList, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        super("download call: " + downloadTask.getId());
        this.task = downloadTask;
        this.asyncExecuted = z;
        this.blockChainList = arrayList;
        this.store = downloadStore;
    }

    public static com.liulishuo.okdownload.core.download.DownloadCall create(com.liulishuo.okdownload.DownloadTask downloadTask, boolean z, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        return new com.liulishuo.okdownload.core.download.DownloadCall(downloadTask, z, downloadStore);
    }

    public boolean cancel() {
        synchronized (this) {
            if (this.canceled) {
                return false;
            }
            if (this.finishing) {
                return false;
            }
            this.canceled = true;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().flyingCanceled(this);
            com.liulishuo.okdownload.core.download.DownloadCache downloadCache = this.cache;
            if (downloadCache != null) {
                downloadCache.setUserCanceled();
            }
            java.lang.Object[] array = this.blockChainList.toArray();
            if (array != null && array.length != 0) {
                for (java.lang.Object obj : array) {
                    if (obj instanceof com.liulishuo.okdownload.core.download.DownloadChain) {
                        ((com.liulishuo.okdownload.core.download.DownloadChain) obj).cancel();
                    }
                }
            } else if (this.currentThread != null) {
                com.liulishuo.okdownload.core.Util.d(TAG, "interrupt thread with cancel operation because of chains are not running " + this.task.getId());
                this.currentThread.interrupt();
            }
            if (downloadCache != null) {
                downloadCache.getOutputStream().cancelAsync();
            }
            com.liulishuo.okdownload.core.Util.d(TAG, "cancel task " + this.task.getId() + " consume: " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
            return true;
        }
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean isFinishing() {
        return this.finishing;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x015b A[EDGE_INSN: B:33:0x015b->B:34:0x015b BREAK  A[LOOP:0: B:2:0x0013->B:56:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:0: B:2:0x0013->B:56:?, LOOP_END, SYNTHETIC] */
    @Override // com.liulishuo.okdownload.core.NamedRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.okdownload.core.download.DownloadCall.execute():void");
    }

    private void inspectTaskStart() {
        this.store.onTaskStart(this.task.getId());
        com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().taskStart(this.task);
    }

    private void inspectTaskEnd(com.liulishuo.okdownload.core.download.DownloadCache downloadCache, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
        if (endCause == com.liulishuo.okdownload.core.cause.EndCause.CANCELED) {
            throw new java.lang.IllegalAccessError("can't recognize cancelled on here");
        }
        synchronized (this) {
            if (this.canceled) {
                return;
            }
            this.finishing = true;
            this.store.onTaskEnd(this.task.getId(), endCause, exc);
            if (endCause == com.liulishuo.okdownload.core.cause.EndCause.COMPLETED) {
                this.store.markFileClear(this.task.getId());
                com.liulishuo.okdownload.OkDownload.with().processFileStrategy().completeProcessStream(downloadCache.getOutputStream(), this.task);
            }
            com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().taskEnd(this.task, endCause, exc);
        }
    }

    com.liulishuo.okdownload.core.download.DownloadCache createCache(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        return new com.liulishuo.okdownload.core.download.DownloadCache(com.liulishuo.okdownload.OkDownload.with().processFileStrategy().createProcessStream(this.task, breakpointInfo, this.store));
    }

    int getPriority() {
        return this.task.getPriority();
    }

    void start(com.liulishuo.okdownload.core.download.DownloadCache downloadCache, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) throws java.lang.InterruptedException {
        int blockCount = breakpointInfo.getBlockCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(breakpointInfo.getBlockCount());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < blockCount; i++) {
            com.liulishuo.okdownload.core.breakpoint.BlockInfo block = breakpointInfo.getBlock(i);
            if (!com.liulishuo.okdownload.core.Util.isCorrectFull(block.getCurrentOffset(), block.getContentLength())) {
                com.liulishuo.okdownload.core.Util.resetBlockIfDirty(block);
                com.liulishuo.okdownload.core.download.DownloadChain createChain = com.liulishuo.okdownload.core.download.DownloadChain.createChain(i, this.task, breakpointInfo, downloadCache, this.store);
                arrayList.add(createChain);
                arrayList2.add(java.lang.Integer.valueOf(createChain.getBlockIndex()));
            }
        }
        if (this.canceled) {
            return;
        }
        downloadCache.getOutputStream().setRequireStreamBlocks(arrayList2);
        startBlocks(arrayList);
    }

    @Override // com.liulishuo.okdownload.core.NamedRunnable
    protected void finished() {
        com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().finish(this);
        com.liulishuo.okdownload.core.Util.d(TAG, "call is finished " + this.task.getId());
    }

    void startBlocks(java.util.List<com.liulishuo.okdownload.core.download.DownloadChain> list) throws java.lang.InterruptedException {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        try {
            java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadChain> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(submitChain(it.next()));
            }
            this.blockChainList.addAll(list);
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                java.util.concurrent.Future future = (java.util.concurrent.Future) it2.next();
                if (!future.isDone()) {
                    try {
                        future.get();
                    } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
                    }
                }
            }
        } finally {
        }
    }

    com.liulishuo.okdownload.core.download.BreakpointLocalCheck createLocalCheck(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, long j) {
        return new com.liulishuo.okdownload.core.download.BreakpointLocalCheck(this.task, breakpointInfo, j);
    }

    com.liulishuo.okdownload.core.download.BreakpointRemoteCheck createRemoteCheck(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        return new com.liulishuo.okdownload.core.download.BreakpointRemoteCheck(this.task, breakpointInfo);
    }

    void setInfoToTask(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        com.liulishuo.okdownload.DownloadTask.TaskHideWrapper.setBreakpointInfo(this.task, breakpointInfo);
    }

    void assembleBlockAndCallbackFromBeginning(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.download.BreakpointRemoteCheck breakpointRemoteCheck, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
        com.liulishuo.okdownload.core.Util.assembleBlock(this.task, breakpointInfo, breakpointRemoteCheck.getInstanceLength(), breakpointRemoteCheck.isAcceptRange());
        com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().downloadFromBeginning(this.task, breakpointInfo, resumeFailedCause);
    }

    java.util.concurrent.Future<?> submitChain(com.liulishuo.okdownload.core.download.DownloadChain downloadChain) {
        return EXECUTOR.submit(downloadChain);
    }

    public boolean equalsTask(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return this.task.equals(downloadTask);
    }

    public java.io.File getFile() {
        return this.task.getFile();
    }

    @Override // java.lang.Comparable
    public int compareTo(com.liulishuo.okdownload.core.download.DownloadCall downloadCall) {
        return downloadCall.getPriority() - getPriority();
    }
}
