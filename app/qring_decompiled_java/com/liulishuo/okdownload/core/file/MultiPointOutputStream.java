package com.liulishuo.okdownload.core.file;

/* loaded from: /tmp/dex/classes2.dex */
public class MultiPointOutputStream {
    private static final java.util.concurrent.ExecutorService FILE_IO_EXECUTOR = new java.util.concurrent.ThreadPoolExecutor(0, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.liulishuo.okdownload.core.Util.threadFactory("OkDownload file io", false));
    private static final java.lang.String TAG = "MultiPointOutputStream";
    final java.util.concurrent.atomic.AtomicLong allNoSyncLength;
    boolean canceled;
    final com.liulishuo.okdownload.core.file.MultiPointOutputStream.StreamsState doneState;
    private volatile boolean firstOutputStream;
    private final int flushBufferSize;
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;
    private final boolean isPreAllocateLength;
    final java.util.concurrent.atomic.AtomicLong lastSyncTimestamp;
    java.util.ArrayList<java.lang.Integer> noMoreStreamList;
    final android.util.SparseArray<java.util.concurrent.atomic.AtomicLong> noSyncLengthMap;
    final android.util.SparseArray<com.liulishuo.okdownload.core.file.DownloadOutputStream> outputStreamMap;
    final android.util.SparseArray<java.lang.Thread> parkedRunBlockThreadMap;
    private java.lang.String path;
    java.util.List<java.lang.Integer> requireStreamBlocks;
    volatile java.lang.Thread runSyncThread;
    com.liulishuo.okdownload.core.file.MultiPointOutputStream.StreamsState state;
    private final com.liulishuo.okdownload.core.breakpoint.DownloadStore store;
    private final boolean supportSeek;
    private final int syncBufferIntervalMills;
    private final int syncBufferSize;
    java.io.IOException syncException;
    volatile java.util.concurrent.Future syncFuture;
    private final java.lang.Runnable syncRunnable;
    private final com.liulishuo.okdownload.DownloadTask task;

    MultiPointOutputStream(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore, java.lang.Runnable runnable) {
        this.outputStreamMap = new android.util.SparseArray<>();
        this.noSyncLengthMap = new android.util.SparseArray<>();
        this.allNoSyncLength = new java.util.concurrent.atomic.AtomicLong();
        this.lastSyncTimestamp = new java.util.concurrent.atomic.AtomicLong();
        this.canceled = false;
        this.parkedRunBlockThreadMap = new android.util.SparseArray<>();
        this.doneState = new com.liulishuo.okdownload.core.file.MultiPointOutputStream.StreamsState();
        this.state = new com.liulishuo.okdownload.core.file.MultiPointOutputStream.StreamsState();
        this.firstOutputStream = true;
        this.task = downloadTask;
        this.flushBufferSize = downloadTask.getFlushBufferSize();
        this.syncBufferSize = downloadTask.getSyncBufferSize();
        this.syncBufferIntervalMills = downloadTask.getSyncBufferIntervalMills();
        this.info = breakpointInfo;
        this.store = downloadStore;
        this.supportSeek = com.liulishuo.okdownload.OkDownload.with().outputStreamFactory().supportSeek();
        this.isPreAllocateLength = com.liulishuo.okdownload.OkDownload.with().processFileStrategy().isPreAllocateLength(downloadTask);
        this.noMoreStreamList = new java.util.ArrayList<>();
        if (runnable == null) {
            this.syncRunnable = new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.file.MultiPointOutputStream.1
                @Override // java.lang.Runnable
                public void run() {
                    com.liulishuo.okdownload.core.file.MultiPointOutputStream.this.runSyncDelayException();
                }
            };
        } else {
            this.syncRunnable = runnable;
        }
        java.io.File file = downloadTask.getFile();
        if (file != null) {
            this.path = file.getAbsolutePath();
        }
    }

    public MultiPointOutputStream(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        this(downloadTask, breakpointInfo, downloadStore, null);
    }

    public synchronized void write(int i, byte[] bArr, int i2) throws java.io.IOException {
        if (this.canceled) {
            return;
        }
        outputStream(i).write(bArr, 0, i2);
        long j = i2;
        this.allNoSyncLength.addAndGet(j);
        this.noSyncLengthMap.get(i).addAndGet(j);
        inspectAndPersist();
    }

    public void cancelAsync() {
        FILE_IO_EXECUTOR.execute(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.file.MultiPointOutputStream.2
            @Override // java.lang.Runnable
            public void run() {
                com.liulishuo.okdownload.core.file.MultiPointOutputStream.this.cancel();
            }
        });
    }

    public synchronized void cancel() {
        java.util.List<java.lang.Integer> list = this.requireStreamBlocks;
        if (list == null) {
            return;
        }
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        this.noMoreStreamList.addAll(list);
        try {
            if (this.allNoSyncLength.get() <= 0) {
                return;
            }
            if (this.syncFuture != null && !this.syncFuture.isDone()) {
                inspectValidPath();
                com.liulishuo.okdownload.OkDownload.with().processFileStrategy().getFileLock().increaseLock(this.path);
                try {
                    ensureSync(true, -1);
                    com.liulishuo.okdownload.OkDownload.with().processFileStrategy().getFileLock().decreaseLock(this.path);
                } catch (java.lang.Throwable th) {
                    com.liulishuo.okdownload.OkDownload.with().processFileStrategy().getFileLock().decreaseLock(this.path);
                    throw th;
                }
            }
            for (java.lang.Integer num : this.requireStreamBlocks) {
                try {
                    close(num.intValue());
                } catch (java.io.IOException e) {
                    com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream close failed task[" + this.task.getId() + "] block[" + num + "]" + e);
                }
            }
            this.store.onTaskEnd(this.task.getId(), com.liulishuo.okdownload.core.cause.EndCause.CANCELED, null);
            return;
        } finally {
            for (java.lang.Integer num2 : this.requireStreamBlocks) {
                try {
                    close(num2.intValue());
                } catch (java.io.IOException e2) {
                    com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream close failed task[" + this.task.getId() + "] block[" + num2 + "]" + e2);
                }
            }
            this.store.onTaskEnd(this.task.getId(), com.liulishuo.okdownload.core.cause.EndCause.CANCELED, null);
        }
    }

    public void done(int i) throws java.io.IOException {
        this.noMoreStreamList.add(java.lang.Integer.valueOf(i));
        try {
            java.io.IOException iOException = this.syncException;
            if (iOException != null) {
                throw iOException;
            }
            if (this.syncFuture != null && !this.syncFuture.isDone()) {
                java.util.concurrent.atomic.AtomicLong atomicLong = this.noSyncLengthMap.get(i);
                if (atomicLong != null && atomicLong.get() > 0) {
                    inspectStreamState(this.doneState);
                    ensureSync(this.doneState.isNoMoreStream, i);
                }
            } else if (this.syncFuture == null) {
                com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream done but no need to ensure sync, because the sync job not run yet. task[" + this.task.getId() + "] block[" + i + "]");
            } else {
                com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream done but no need to ensure sync, because the syncFuture.isDone[" + this.syncFuture.isDone() + "] task[" + this.task.getId() + "] block[" + i + "]");
            }
        } finally {
            close(i);
        }
    }

    void ensureSync(boolean z, int i) {
        if (this.syncFuture == null || this.syncFuture.isDone()) {
            return;
        }
        if (!z) {
            this.parkedRunBlockThreadMap.put(i, java.lang.Thread.currentThread());
        }
        if (this.runSyncThread != null) {
            unparkThread(this.runSyncThread);
        } else {
            while (!isRunSyncThreadValid()) {
                parkThread(25L);
            }
            unparkThread(this.runSyncThread);
        }
        if (z) {
            unparkThread(this.runSyncThread);
            try {
                this.syncFuture.get();
                return;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                return;
            }
        }
        parkThread();
    }

    boolean isRunSyncThreadValid() {
        return this.runSyncThread != null;
    }

    public void inspectComplete(int i) throws java.io.IOException {
        com.liulishuo.okdownload.core.breakpoint.BlockInfo block = this.info.getBlock(i);
        if (com.liulishuo.okdownload.core.Util.isCorrectFull(block.getCurrentOffset(), block.getContentLength())) {
            return;
        }
        throw new java.io.IOException("The current offset on block-info isn't update correct, " + block.getCurrentOffset() + " != " + block.getContentLength() + " on " + i);
    }

    void inspectAndPersist() throws java.io.IOException {
        java.io.IOException iOException = this.syncException;
        if (iOException != null) {
            throw iOException;
        }
        if (this.syncFuture == null) {
            synchronized (this.syncRunnable) {
                if (this.syncFuture == null) {
                    this.syncFuture = executeSyncRunnableAsync();
                }
            }
        }
    }

    synchronized void close(int i) throws java.io.IOException {
        com.liulishuo.okdownload.core.file.DownloadOutputStream downloadOutputStream = this.outputStreamMap.get(i);
        if (downloadOutputStream != null) {
            downloadOutputStream.close();
            this.outputStreamMap.remove(i);
            com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream close task[" + this.task.getId() + "] block[" + i + "]");
        }
    }

    void parkThread(long j) {
        java.util.concurrent.locks.LockSupport.parkNanos(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j));
    }

    void parkThread() {
        java.util.concurrent.locks.LockSupport.park();
    }

    void unparkThread(java.lang.Thread thread) {
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }

    java.util.concurrent.Future executeSyncRunnableAsync() {
        return FILE_IO_EXECUTOR.submit(this.syncRunnable);
    }

    void inspectStreamState(com.liulishuo.okdownload.core.file.MultiPointOutputStream.StreamsState streamsState) {
        streamsState.newNoMoreStreamBlockList.clear();
        int size = new java.util.HashSet((java.util.List) this.noMoreStreamList.clone()).size();
        if (size != this.requireStreamBlocks.size()) {
            com.liulishuo.okdownload.core.Util.d(TAG, "task[" + this.task.getId() + "] current need fetching block count " + this.requireStreamBlocks.size() + " is not equal to no more stream block count " + size);
            streamsState.isNoMoreStream = false;
        } else {
            com.liulishuo.okdownload.core.Util.d(TAG, "task[" + this.task.getId() + "] current need fetching block count " + this.requireStreamBlocks.size() + " is equal to no more stream block count " + size);
            streamsState.isNoMoreStream = true;
        }
        android.util.SparseArray<com.liulishuo.okdownload.core.file.DownloadOutputStream> clone = this.outputStreamMap.clone();
        int size2 = clone.size();
        for (int i = 0; i < size2; i++) {
            int keyAt = clone.keyAt(i);
            if (this.noMoreStreamList.contains(java.lang.Integer.valueOf(keyAt)) && !streamsState.noMoreStreamBlockList.contains(java.lang.Integer.valueOf(keyAt))) {
                streamsState.noMoreStreamBlockList.add(java.lang.Integer.valueOf(keyAt));
                streamsState.newNoMoreStreamBlockList.add(java.lang.Integer.valueOf(keyAt));
            }
        }
    }

    public void setRequireStreamBlocks(java.util.List<java.lang.Integer> list) {
        this.requireStreamBlocks = list;
    }

    public void catchBlockConnectException(int i) {
        this.noMoreStreamList.add(java.lang.Integer.valueOf(i));
    }

    static class StreamsState {
        boolean isNoMoreStream;
        java.util.List<java.lang.Integer> noMoreStreamBlockList = new java.util.ArrayList();
        java.util.List<java.lang.Integer> newNoMoreStreamBlockList = new java.util.ArrayList();

        StreamsState() {
        }

        boolean isStreamsEndOrChanged() {
            return this.isNoMoreStream || this.newNoMoreStreamBlockList.size() > 0;
        }
    }

    void runSyncDelayException() {
        try {
            runSync();
        } catch (java.io.IOException e) {
            this.syncException = e;
            com.liulishuo.okdownload.core.Util.w(TAG, "Sync to breakpoint-store for task[" + this.task.getId() + "] failed with cause: " + e);
        }
    }

    void runSync() throws java.io.IOException {
        int i;
        com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream start flush looper task[" + this.task.getId() + "] with syncBufferIntervalMills[" + this.syncBufferIntervalMills + "] syncBufferSize[" + this.syncBufferSize + "]");
        this.runSyncThread = java.lang.Thread.currentThread();
        long j = (long) this.syncBufferIntervalMills;
        flushProcess();
        while (true) {
            parkThread(j);
            inspectStreamState(this.state);
            if (this.state.isStreamsEndOrChanged()) {
                com.liulishuo.okdownload.core.Util.d(TAG, "runSync state change isNoMoreStream[" + this.state.isNoMoreStream + "] newNoMoreStreamBlockList[" + this.state.newNoMoreStreamBlockList + "]");
                if (this.allNoSyncLength.get() > 0) {
                    flushProcess();
                }
                for (java.lang.Integer num : this.state.newNoMoreStreamBlockList) {
                    java.lang.Thread thread = this.parkedRunBlockThreadMap.get(num.intValue());
                    this.parkedRunBlockThreadMap.remove(num.intValue());
                    if (thread != null) {
                        unparkThread(thread);
                    }
                }
                if (this.state.isNoMoreStream) {
                    break;
                }
            } else {
                if (isNoNeedFlushForLength()) {
                    i = this.syncBufferIntervalMills;
                } else {
                    j = getNextParkMillisecond();
                    if (j <= 0) {
                        flushProcess();
                        i = this.syncBufferIntervalMills;
                    }
                }
                j = i;
            }
        }
        int size = this.parkedRunBlockThreadMap.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Thread valueAt = this.parkedRunBlockThreadMap.valueAt(i2);
            if (valueAt != null) {
                unparkThread(valueAt);
            }
        }
        this.parkedRunBlockThreadMap.clear();
        com.liulishuo.okdownload.core.Util.d(TAG, "OutputStream stop flush looper task[" + this.task.getId() + "]");
    }

    boolean isNoNeedFlushForLength() {
        return this.allNoSyncLength.get() < ((long) this.syncBufferSize);
    }

    long getNextParkMillisecond() {
        return this.syncBufferIntervalMills - (now() - this.lastSyncTimestamp.get());
    }

    long now() {
        return android.os.SystemClock.uptimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void flushProcess() throws java.io.IOException {
        /*
            r11 = this;
            android.util.SparseArray<java.util.concurrent.atomic.AtomicLong> r0 = r11.noSyncLengthMap
            monitor-enter(r0)
            android.util.SparseArray<java.util.concurrent.atomic.AtomicLong> r1 = r11.noSyncLengthMap     // Catch: java.lang.Throwable -> Lda
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lda
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lda
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L11:
            r4 = 0
            if (r3 >= r1) goto L59
            android.util.SparseArray<com.liulishuo.okdownload.core.file.DownloadOutputStream> r6 = r11.outputStreamMap     // Catch: java.io.IOException -> L40
            int r6 = r6.keyAt(r3)     // Catch: java.io.IOException -> L40
            android.util.SparseArray<java.util.concurrent.atomic.AtomicLong> r7 = r11.noSyncLengthMap     // Catch: java.io.IOException -> L40
            java.lang.Object r7 = r7.get(r6)     // Catch: java.io.IOException -> L40
            java.util.concurrent.atomic.AtomicLong r7 = (java.util.concurrent.atomic.AtomicLong) r7     // Catch: java.io.IOException -> L40
            long r7 = r7.get()     // Catch: java.io.IOException -> L40
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L3d
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.io.IOException -> L40
            r0.put(r6, r7)     // Catch: java.io.IOException -> L40
            android.util.SparseArray<com.liulishuo.okdownload.core.file.DownloadOutputStream> r7 = r11.outputStreamMap     // Catch: java.io.IOException -> L40
            java.lang.Object r6 = r7.get(r6)     // Catch: java.io.IOException -> L40
            com.liulishuo.okdownload.core.file.DownloadOutputStream r6 = (com.liulishuo.okdownload.core.file.DownloadOutputStream) r6     // Catch: java.io.IOException -> L40
            r6.flushAndSync()     // Catch: java.io.IOException -> L40
        L3d:
            int r3 = r3 + 1
            goto L11
        L40:
            r1 = move-exception
            java.lang.String r3 = "MultiPointOutputStream"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "OutputStream flush and sync data to filesystem failed "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.liulishuo.okdownload.core.Util.w(r3, r1)
            r1 = 0
            goto L5a
        L59:
            r1 = 1
        L5a:
            if (r1 == 0) goto Ld9
            int r1 = r0.size()
        L60:
            if (r2 >= r1) goto Lca
            int r3 = r0.keyAt(r2)
            java.lang.Object r6 = r0.valueAt(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            com.liulishuo.okdownload.core.breakpoint.DownloadStore r8 = r11.store
            com.liulishuo.okdownload.core.breakpoint.BreakpointInfo r9 = r11.info
            r8.onSyncToFilesystemSuccess(r9, r3, r6)
            long r4 = r4 + r6
            android.util.SparseArray<java.util.concurrent.atomic.AtomicLong> r8 = r11.noSyncLengthMap
            java.lang.Object r8 = r8.get(r3)
            java.util.concurrent.atomic.AtomicLong r8 = (java.util.concurrent.atomic.AtomicLong) r8
            long r9 = -r6
            r8.addAndGet(r9)
            java.lang.String r8 = "MultiPointOutputStream"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "OutputStream sync success ("
            r9.append(r10)
            com.liulishuo.okdownload.DownloadTask r10 = r11.task
            int r10 = r10.getId()
            r9.append(r10)
            java.lang.String r10 = ") block("
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = ")  syncLength("
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = ") currentOffset("
            r9.append(r6)
            com.liulishuo.okdownload.core.breakpoint.BreakpointInfo r6 = r11.info
            com.liulishuo.okdownload.core.breakpoint.BlockInfo r3 = r6.getBlock(r3)
            long r6 = r3.getCurrentOffset()
            r9.append(r6)
            java.lang.String r3 = ")"
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            com.liulishuo.okdownload.core.Util.d(r8, r3)
            int r2 = r2 + 1
            goto L60
        Lca:
            java.util.concurrent.atomic.AtomicLong r0 = r11.allNoSyncLength
            long r1 = -r4
            r0.addAndGet(r1)
            java.util.concurrent.atomic.AtomicLong r0 = r11.lastSyncTimestamp
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.set(r1)
        Ld9:
            return
        Lda:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lda
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.okdownload.core.file.MultiPointOutputStream.flushProcess():void");
    }

    synchronized com.liulishuo.okdownload.core.file.DownloadOutputStream outputStream(int i) throws java.io.IOException {
        com.liulishuo.okdownload.core.file.DownloadOutputStream downloadOutputStream;
        android.net.Uri uri;
        downloadOutputStream = this.outputStreamMap.get(i);
        if (downloadOutputStream == null) {
            boolean isUriFileScheme = com.liulishuo.okdownload.core.Util.isUriFileScheme(this.task.getUri());
            if (isUriFileScheme) {
                java.io.File file = this.task.getFile();
                if (file == null) {
                    throw new java.io.FileNotFoundException("Filename is not ready!");
                }
                java.io.File parentFile = this.task.getParentFile();
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    throw new java.io.IOException("Create parent folder failed!");
                }
                if (file.createNewFile()) {
                    com.liulishuo.okdownload.core.Util.d(TAG, "Create new file: " + file.getName());
                }
                uri = android.net.Uri.fromFile(file);
            } else {
                uri = this.task.getUri();
            }
            com.liulishuo.okdownload.core.file.DownloadOutputStream create = com.liulishuo.okdownload.OkDownload.with().outputStreamFactory().create(com.liulishuo.okdownload.OkDownload.with().context(), uri, this.flushBufferSize);
            if (this.supportSeek) {
                long rangeLeft = this.info.getBlock(i).getRangeLeft();
                if (rangeLeft > 0) {
                    create.seek(rangeLeft);
                    com.liulishuo.okdownload.core.Util.d(TAG, "Create output stream write from (" + this.task.getId() + ") block(" + i + ") " + rangeLeft);
                }
            }
            if (this.firstOutputStream) {
                this.store.markFileDirty(this.task.getId());
            }
            if (!this.info.isChunked() && this.firstOutputStream && this.isPreAllocateLength) {
                long totalLength = this.info.getTotalLength();
                if (isUriFileScheme) {
                    java.io.File file2 = this.task.getFile();
                    long length = totalLength - file2.length();
                    if (length > 0) {
                        inspectFreeSpace(new android.os.StatFs(file2.getAbsolutePath()), length);
                        create.setLength(totalLength);
                    }
                } else {
                    create.setLength(totalLength);
                }
            }
            synchronized (this.noSyncLengthMap) {
                this.outputStreamMap.put(i, create);
                this.noSyncLengthMap.put(i, new java.util.concurrent.atomic.AtomicLong());
            }
            this.firstOutputStream = false;
            downloadOutputStream = create;
        }
        return downloadOutputStream;
    }

    void inspectFreeSpace(android.os.StatFs statFs, long j) throws com.liulishuo.okdownload.core.exception.PreAllocateException {
        long freeSpaceBytes = com.liulishuo.okdownload.core.Util.getFreeSpaceBytes(statFs);
        if (freeSpaceBytes < j) {
            throw new com.liulishuo.okdownload.core.exception.PreAllocateException(j, freeSpaceBytes);
        }
    }

    private void inspectValidPath() {
        if (this.path != null || this.task.getFile() == null) {
            return;
        }
        this.path = this.task.getFile().getAbsolutePath();
    }
}
