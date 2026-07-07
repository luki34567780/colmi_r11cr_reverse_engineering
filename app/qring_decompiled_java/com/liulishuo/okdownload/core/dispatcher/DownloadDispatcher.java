package com.liulishuo.okdownload.core.dispatcher;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadDispatcher {
    private static final java.lang.String TAG = "DownloadDispatcher";
    private volatile java.util.concurrent.ExecutorService executorService;
    private final java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> finishingCalls;
    private final java.util.concurrent.atomic.AtomicInteger flyingCanceledAsyncCallCount;
    int maxParallelRunningCount;
    private final java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> readyAsyncCalls;
    private final java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> runningAsyncCalls;
    private final java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> runningSyncCalls;
    private final java.util.concurrent.atomic.AtomicInteger skipProceedCallCount;
    private com.liulishuo.okdownload.core.breakpoint.DownloadStore store;

    public DownloadDispatcher() {
        this(new java.util.ArrayList(), new java.util.ArrayList(), new java.util.ArrayList(), new java.util.ArrayList());
    }

    DownloadDispatcher(java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list, java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list2, java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list3, java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list4) {
        this.maxParallelRunningCount = 5;
        this.flyingCanceledAsyncCallCount = new java.util.concurrent.atomic.AtomicInteger();
        this.skipProceedCallCount = new java.util.concurrent.atomic.AtomicInteger();
        this.readyAsyncCalls = list;
        this.runningAsyncCalls = list2;
        this.runningSyncCalls = list3;
        this.finishingCalls = list4;
    }

    public void setDownloadStore(com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
        this.store = downloadStore;
    }

    synchronized java.util.concurrent.ExecutorService getExecutorService() {
        if (this.executorService == null) {
            this.executorService = new java.util.concurrent.ThreadPoolExecutor(0, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.liulishuo.okdownload.core.Util.threadFactory("OkDownload Download", false));
        }
        return this.executorService;
    }

    public void enqueue(com.liulishuo.okdownload.DownloadTask[] downloadTaskArr) {
        this.skipProceedCallCount.incrementAndGet();
        enqueueLocked(downloadTaskArr);
        this.skipProceedCallCount.decrementAndGet();
    }

    public void enqueue(com.liulishuo.okdownload.DownloadTask downloadTask) {
        this.skipProceedCallCount.incrementAndGet();
        enqueueLocked(downloadTask);
        this.skipProceedCallCount.decrementAndGet();
    }

    private synchronized void enqueueLocked(com.liulishuo.okdownload.DownloadTask[] downloadTaskArr) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.liulishuo.okdownload.core.Util.d(TAG, "start enqueueLocked for bunch task: " + downloadTaskArr.length);
        java.util.ArrayList<com.liulishuo.okdownload.DownloadTask> arrayList = new java.util.ArrayList();
        java.util.Collections.addAll(arrayList, downloadTaskArr);
        if (arrayList.size() > 1) {
            java.util.Collections.sort(arrayList);
        }
        int size = this.readyAsyncCalls.size();
        try {
            com.liulishuo.okdownload.OkDownload.with().downloadStrategy().inspectNetworkAvailable();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.liulishuo.okdownload.DownloadTask downloadTask : arrayList) {
                if (!inspectCompleted(downloadTask, arrayList2) && !inspectForConflict(downloadTask, arrayList3, arrayList4)) {
                    enqueueIgnorePriority(downloadTask);
                }
            }
            com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().endTasks(arrayList2, arrayList3, arrayList4);
        } catch (java.net.UnknownHostException e) {
            com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().endTasksWithError(new java.util.ArrayList(arrayList), e);
        }
        if (size != this.readyAsyncCalls.size()) {
            java.util.Collections.sort(this.readyAsyncCalls);
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "end enqueueLocked for bunch task: " + downloadTaskArr.length + " consume " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
    }

    private synchronized void enqueueLocked(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.Util.d(TAG, "enqueueLocked for single task: " + downloadTask);
        if (inspectCompleted(downloadTask)) {
            return;
        }
        if (inspectForConflict(downloadTask)) {
            return;
        }
        int size = this.readyAsyncCalls.size();
        enqueueIgnorePriority(downloadTask);
        if (size != this.readyAsyncCalls.size()) {
            java.util.Collections.sort(this.readyAsyncCalls);
        }
    }

    private synchronized void enqueueIgnorePriority(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.download.DownloadCall create = com.liulishuo.okdownload.core.download.DownloadCall.create(downloadTask, true, this.store);
        if (runningAsyncSize() < this.maxParallelRunningCount) {
            this.runningAsyncCalls.add(create);
            getExecutorService().execute(create);
        } else {
            this.readyAsyncCalls.add(create);
        }
    }

    public void execute(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.Util.d(TAG, "execute: " + downloadTask);
        synchronized (this) {
            if (inspectCompleted(downloadTask)) {
                return;
            }
            if (inspectForConflict(downloadTask)) {
                return;
            }
            com.liulishuo.okdownload.core.download.DownloadCall create = com.liulishuo.okdownload.core.download.DownloadCall.create(downloadTask, false, this.store);
            this.runningSyncCalls.add(create);
            syncRunCall(create);
        }
    }

    public void cancelAll() {
        this.skipProceedCallCount.incrementAndGet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().task);
        }
        java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().task);
        }
        java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().task);
        }
        if (!arrayList.isEmpty()) {
            cancelLocked((com.liulishuo.okdownload.core.IdentifiedTask[]) arrayList.toArray(new com.liulishuo.okdownload.DownloadTask[arrayList.size()]));
        }
        this.skipProceedCallCount.decrementAndGet();
    }

    public void cancel(com.liulishuo.okdownload.core.IdentifiedTask[] identifiedTaskArr) {
        this.skipProceedCallCount.incrementAndGet();
        cancelLocked(identifiedTaskArr);
        this.skipProceedCallCount.decrementAndGet();
        processCalls();
    }

    public boolean cancel(com.liulishuo.okdownload.core.IdentifiedTask identifiedTask) {
        this.skipProceedCallCount.incrementAndGet();
        boolean cancelLocked = cancelLocked(identifiedTask);
        this.skipProceedCallCount.decrementAndGet();
        processCalls();
        return cancelLocked;
    }

    public boolean cancel(int i) {
        this.skipProceedCallCount.incrementAndGet();
        boolean cancelLocked = cancelLocked(com.liulishuo.okdownload.DownloadTask.mockTaskForCompare(i));
        this.skipProceedCallCount.decrementAndGet();
        processCalls();
        return cancelLocked;
    }

    private synchronized void cancelLocked(com.liulishuo.okdownload.core.IdentifiedTask[] identifiedTaskArr) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.liulishuo.okdownload.core.Util.d(TAG, "start cancel bunch task manually: " + identifiedTaskArr.length);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        try {
            for (com.liulishuo.okdownload.core.IdentifiedTask identifiedTask : identifiedTaskArr) {
                filterCanceledCalls(identifiedTask, arrayList, arrayList2);
            }
        } finally {
            handleCanceledCalls(arrayList, arrayList2);
            com.liulishuo.okdownload.core.Util.d(TAG, "finish cancel bunch task manually: " + identifiedTaskArr.length + " consume " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
        }
    }

    synchronized boolean cancelLocked(com.liulishuo.okdownload.core.IdentifiedTask identifiedTask) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.liulishuo.okdownload.core.Util.d(TAG, "cancel manually: " + identifiedTask.getId());
        arrayList = new java.util.ArrayList();
        arrayList2 = new java.util.ArrayList();
        try {
            filterCanceledCalls(identifiedTask, arrayList, arrayList2);
            handleCanceledCalls(arrayList, arrayList2);
        } catch (java.lang.Throwable th) {
            handleCanceledCalls(arrayList, arrayList2);
            throw th;
        }
        return arrayList.size() > 0 || arrayList2.size() > 0;
    }

    private synchronized void filterCanceledCalls(com.liulishuo.okdownload.core.IdentifiedTask identifiedTask, java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list, java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list2) {
        java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            com.liulishuo.okdownload.core.download.DownloadCall next = it.next();
            if (next.task == identifiedTask || next.task.getId() == identifiedTask.getId()) {
                if (!next.isCanceled() && !next.isFinishing()) {
                    it.remove();
                    list.add(next);
                    return;
                }
                return;
            }
        }
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall : this.runningAsyncCalls) {
            if (downloadCall.task == identifiedTask || downloadCall.task.getId() == identifiedTask.getId()) {
                list.add(downloadCall);
                list2.add(downloadCall);
                return;
            }
        }
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall2 : this.runningSyncCalls) {
            if (downloadCall2.task == identifiedTask || downloadCall2.task.getId() == identifiedTask.getId()) {
                list.add(downloadCall2);
                list2.add(downloadCall2);
                return;
            }
        }
    }

    private synchronized void handleCanceledCalls(java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list, java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list2) {
        com.liulishuo.okdownload.core.Util.d(TAG, "handle cancel calls, cancel calls: " + list2.size());
        if (!list2.isEmpty()) {
            for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall : list2) {
                if (!downloadCall.cancel()) {
                    list.remove(downloadCall);
                }
            }
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "handle cancel calls, callback cancel event: " + list.size());
        if (!list.isEmpty()) {
            if (list.size() <= 1) {
                com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().taskEnd(list.get(0).task, com.liulishuo.okdownload.core.cause.EndCause.CANCELED, null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadCall> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().task);
                }
                com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().endTasksWithCanceled(arrayList);
            }
        }
    }

    public synchronized com.liulishuo.okdownload.DownloadTask findSameTask(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.Util.d(TAG, "findSameTask: " + downloadTask.getId());
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall : this.readyAsyncCalls) {
            if (!downloadCall.isCanceled() && downloadCall.equalsTask(downloadTask)) {
                return downloadCall.task;
            }
        }
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall2 : this.runningAsyncCalls) {
            if (!downloadCall2.isCanceled() && downloadCall2.equalsTask(downloadTask)) {
                return downloadCall2.task;
            }
        }
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall3 : this.runningSyncCalls) {
            if (!downloadCall3.isCanceled() && downloadCall3.equalsTask(downloadTask)) {
                return downloadCall3.task;
            }
        }
        return null;
    }

    public synchronized boolean isRunning(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.Util.d(TAG, "isRunning: " + downloadTask.getId());
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall : this.runningSyncCalls) {
            if (!downloadCall.isCanceled() && downloadCall.equalsTask(downloadTask)) {
                return true;
            }
        }
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall2 : this.runningAsyncCalls) {
            if (!downloadCall2.isCanceled() && downloadCall2.equalsTask(downloadTask)) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean isPending(com.liulishuo.okdownload.DownloadTask downloadTask) {
        com.liulishuo.okdownload.core.Util.d(TAG, "isPending: " + downloadTask.getId());
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall : this.readyAsyncCalls) {
            if (!downloadCall.isCanceled() && downloadCall.equalsTask(downloadTask)) {
                return true;
            }
        }
        return false;
    }

    void syncRunCall(com.liulishuo.okdownload.core.download.DownloadCall downloadCall) {
        downloadCall.run();
    }

    public synchronized void flyingCanceled(com.liulishuo.okdownload.core.download.DownloadCall downloadCall) {
        com.liulishuo.okdownload.core.Util.d(TAG, "flying canceled: " + downloadCall.task.getId());
        if (downloadCall.asyncExecuted) {
            this.flyingCanceledAsyncCallCount.incrementAndGet();
        }
    }

    public synchronized void finish(com.liulishuo.okdownload.core.download.DownloadCall downloadCall) {
        java.util.List<com.liulishuo.okdownload.core.download.DownloadCall> list;
        boolean z = downloadCall.asyncExecuted;
        if (this.finishingCalls.contains(downloadCall)) {
            list = this.finishingCalls;
        } else if (z) {
            list = this.runningAsyncCalls;
        } else {
            list = this.runningSyncCalls;
        }
        if (!list.remove(downloadCall)) {
            throw new java.lang.AssertionError("Call wasn't in-flight!");
        }
        if (z && downloadCall.isCanceled()) {
            this.flyingCanceledAsyncCallCount.decrementAndGet();
        }
        if (z) {
            processCalls();
        }
    }

    public synchronized boolean isFileConflictAfterRun(com.liulishuo.okdownload.DownloadTask downloadTask) {
        java.io.File file;
        java.io.File file2;
        com.liulishuo.okdownload.core.Util.d(TAG, "is file conflict after run: " + downloadTask.getId());
        java.io.File file3 = downloadTask.getFile();
        if (file3 == null) {
            return false;
        }
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall : this.runningSyncCalls) {
            if (!downloadCall.isCanceled() && downloadCall.task != downloadTask && (file2 = downloadCall.task.getFile()) != null && file3.equals(file2)) {
                return true;
            }
        }
        for (com.liulishuo.okdownload.core.download.DownloadCall downloadCall2 : this.runningAsyncCalls) {
            if (!downloadCall2.isCanceled() && downloadCall2.task != downloadTask && (file = downloadCall2.task.getFile()) != null && file3.equals(file)) {
                return true;
            }
        }
        return false;
    }

    private boolean inspectForConflict(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return inspectForConflict(downloadTask, null, null);
    }

    private boolean inspectForConflict(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection, java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection2) {
        return inspectForConflict(downloadTask, this.readyAsyncCalls, collection, collection2) || inspectForConflict(downloadTask, this.runningAsyncCalls, collection, collection2) || inspectForConflict(downloadTask, this.runningSyncCalls, collection, collection2);
    }

    boolean inspectCompleted(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return inspectCompleted(downloadTask, null);
    }

    boolean inspectCompleted(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection) {
        if (!downloadTask.isPassIfAlreadyCompleted() || !com.liulishuo.okdownload.StatusUtil.isCompleted(downloadTask)) {
            return false;
        }
        if (downloadTask.getFilename() == null && !com.liulishuo.okdownload.OkDownload.with().downloadStrategy().validFilenameFromStore(downloadTask)) {
            return false;
        }
        com.liulishuo.okdownload.OkDownload.with().downloadStrategy().validInfoOnCompleted(downloadTask, this.store);
        if (collection != null) {
            collection.add(downloadTask);
            return true;
        }
        com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.COMPLETED, null);
        return true;
    }

    boolean inspectForConflict(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Collection<com.liulishuo.okdownload.core.download.DownloadCall> collection, java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection2, java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection3) {
        com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher = com.liulishuo.okdownload.OkDownload.with().callbackDispatcher();
        java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadCall> it = collection.iterator();
        while (it.hasNext()) {
            com.liulishuo.okdownload.core.download.DownloadCall next = it.next();
            if (!next.isCanceled()) {
                if (next.equalsTask(downloadTask)) {
                    if (!next.isFinishing()) {
                        if (collection2 != null) {
                            collection2.add(downloadTask);
                        } else {
                            callbackDispatcher.dispatch().taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.SAME_TASK_BUSY, null);
                        }
                        return true;
                    }
                    com.liulishuo.okdownload.core.Util.d(TAG, "task: " + downloadTask.getId() + " is finishing, move it to finishing list");
                    this.finishingCalls.add(next);
                    it.remove();
                    return false;
                }
                java.io.File file = next.getFile();
                java.io.File file2 = downloadTask.getFile();
                if (file != null && file2 != null && file.equals(file2)) {
                    if (collection3 != null) {
                        collection3.add(downloadTask);
                    } else {
                        callbackDispatcher.dispatch().taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.FILE_BUSY, null);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private synchronized void processCalls() {
        if (this.skipProceedCallCount.get() > 0) {
            return;
        }
        if (runningAsyncSize() >= this.maxParallelRunningCount) {
            return;
        }
        if (this.readyAsyncCalls.isEmpty()) {
            return;
        }
        java.util.Iterator<com.liulishuo.okdownload.core.download.DownloadCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            com.liulishuo.okdownload.core.download.DownloadCall next = it.next();
            it.remove();
            com.liulishuo.okdownload.DownloadTask downloadTask = next.task;
            if (isFileConflictAfterRun(downloadTask)) {
                com.liulishuo.okdownload.OkDownload.with().callbackDispatcher().dispatch().taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.FILE_BUSY, null);
            } else {
                this.runningAsyncCalls.add(next);
                getExecutorService().execute(next);
                if (runningAsyncSize() >= this.maxParallelRunningCount) {
                    return;
                }
            }
        }
    }

    private int runningAsyncSize() {
        return this.runningAsyncCalls.size() - this.flyingCanceledAsyncCallCount.get();
    }

    public static void setMaxParallelRunningCount(int i) {
        com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher downloadDispatcher = com.liulishuo.okdownload.OkDownload.with().downloadDispatcher();
        if (downloadDispatcher.getClass() != com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher.class) {
            throw new java.lang.IllegalStateException("The current dispatcher is " + downloadDispatcher + " not DownloadDispatcher exactly!");
        }
        downloadDispatcher.maxParallelRunningCount = java.lang.Math.max(1, i);
    }
}
