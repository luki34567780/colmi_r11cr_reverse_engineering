package com.liulishuo.okdownload.core.dispatcher;

/* loaded from: /tmp/dex/classes2.dex */
public class CallbackDispatcher {
    private static final java.lang.String TAG = "CallbackDispatcher";
    private final com.liulishuo.okdownload.DownloadListener transmit;
    private final android.os.Handler uiHandler;

    CallbackDispatcher(android.os.Handler handler, com.liulishuo.okdownload.DownloadListener downloadListener) {
        this.uiHandler = handler;
        this.transmit = downloadListener;
    }

    public CallbackDispatcher() {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.uiHandler = handler;
        this.transmit = new com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener(handler);
    }

    public boolean isFetchProcessMoment(com.liulishuo.okdownload.DownloadTask downloadTask) {
        long minIntervalMillisCallbackProcess = downloadTask.getMinIntervalMillisCallbackProcess();
        return minIntervalMillisCallbackProcess <= 0 || android.os.SystemClock.uptimeMillis() - com.liulishuo.okdownload.DownloadTask.TaskHideWrapper.getLastCallbackProcessTs(downloadTask) >= minIntervalMillisCallbackProcess;
    }

    public void endTasksWithError(final java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection, final java.lang.Exception exc) {
        if (collection.size() <= 0) {
            return;
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "endTasksWithError error[" + collection.size() + "] realCause: " + exc);
        java.util.Iterator<com.liulishuo.okdownload.DownloadTask> it = collection.iterator();
        while (it.hasNext()) {
            com.liulishuo.okdownload.DownloadTask next = it.next();
            if (!next.isAutoCallbackToUIThread()) {
                next.getListener().taskEnd(next, com.liulishuo.okdownload.core.cause.EndCause.ERROR, exc);
                it.remove();
            }
        }
        this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                for (com.liulishuo.okdownload.DownloadTask downloadTask : collection) {
                    downloadTask.getListener().taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.ERROR, exc);
                }
            }
        });
    }

    public void endTasks(final java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection, final java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection2, final java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection3) {
        if (collection.size() == 0 && collection2.size() == 0 && collection3.size() == 0) {
            return;
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "endTasks completed[" + collection.size() + "] sameTask[" + collection2.size() + "] fileBusy[" + collection3.size() + "]");
        if (collection.size() > 0) {
            java.util.Iterator<com.liulishuo.okdownload.DownloadTask> it = collection.iterator();
            while (it.hasNext()) {
                com.liulishuo.okdownload.DownloadTask next = it.next();
                if (!next.isAutoCallbackToUIThread()) {
                    next.getListener().taskEnd(next, com.liulishuo.okdownload.core.cause.EndCause.COMPLETED, null);
                    it.remove();
                }
            }
        }
        if (collection2.size() > 0) {
            java.util.Iterator<com.liulishuo.okdownload.DownloadTask> it2 = collection2.iterator();
            while (it2.hasNext()) {
                com.liulishuo.okdownload.DownloadTask next2 = it2.next();
                if (!next2.isAutoCallbackToUIThread()) {
                    next2.getListener().taskEnd(next2, com.liulishuo.okdownload.core.cause.EndCause.SAME_TASK_BUSY, null);
                    it2.remove();
                }
            }
        }
        if (collection3.size() > 0) {
            java.util.Iterator<com.liulishuo.okdownload.DownloadTask> it3 = collection3.iterator();
            while (it3.hasNext()) {
                com.liulishuo.okdownload.DownloadTask next3 = it3.next();
                if (!next3.isAutoCallbackToUIThread()) {
                    next3.getListener().taskEnd(next3, com.liulishuo.okdownload.core.cause.EndCause.FILE_BUSY, null);
                    it3.remove();
                }
            }
        }
        if (collection.size() == 0 && collection2.size() == 0 && collection3.size() == 0) {
            return;
        }
        this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.2
            @Override // java.lang.Runnable
            public void run() {
                for (com.liulishuo.okdownload.DownloadTask downloadTask : collection) {
                    downloadTask.getListener().taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.COMPLETED, null);
                }
                for (com.liulishuo.okdownload.DownloadTask downloadTask2 : collection2) {
                    downloadTask2.getListener().taskEnd(downloadTask2, com.liulishuo.okdownload.core.cause.EndCause.SAME_TASK_BUSY, null);
                }
                for (com.liulishuo.okdownload.DownloadTask downloadTask3 : collection3) {
                    downloadTask3.getListener().taskEnd(downloadTask3, com.liulishuo.okdownload.core.cause.EndCause.FILE_BUSY, null);
                }
            }
        });
    }

    public void endTasksWithCanceled(final java.util.Collection<com.liulishuo.okdownload.DownloadTask> collection) {
        if (collection.size() <= 0) {
            return;
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "endTasksWithCanceled canceled[" + collection.size() + "]");
        java.util.Iterator<com.liulishuo.okdownload.DownloadTask> it = collection.iterator();
        while (it.hasNext()) {
            com.liulishuo.okdownload.DownloadTask next = it.next();
            if (!next.isAutoCallbackToUIThread()) {
                next.getListener().taskEnd(next, com.liulishuo.okdownload.core.cause.EndCause.CANCELED, null);
                it.remove();
            }
        }
        this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.3
            @Override // java.lang.Runnable
            public void run() {
                for (com.liulishuo.okdownload.DownloadTask downloadTask : collection) {
                    downloadTask.getListener().taskEnd(downloadTask, com.liulishuo.okdownload.core.cause.EndCause.CANCELED, null);
                }
            }
        });
    }

    public com.liulishuo.okdownload.DownloadListener dispatch() {
        return this.transmit;
    }

    static class DefaultTransmitListener implements com.liulishuo.okdownload.DownloadListener {
        private final android.os.Handler uiHandler;

        DefaultTransmitListener(android.os.Handler handler) {
            this.uiHandler = handler;
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void taskStart(final com.liulishuo.okdownload.DownloadTask downloadTask) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "taskStart: " + downloadTask.getId());
            inspectTaskStart(downloadTask);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().taskStart(downloadTask);
                    }
                });
            } else {
                downloadTask.getListener().taskStart(downloadTask);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectTrialStart(final com.liulishuo.okdownload.DownloadTask downloadTask, final java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "-----> start trial task(" + downloadTask.getId() + ") " + map);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.2
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().connectTrialStart(downloadTask, map);
                    }
                });
            } else {
                downloadTask.getListener().connectTrialStart(downloadTask, map);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectTrialEnd(final com.liulishuo.okdownload.DownloadTask downloadTask, final int i, final java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "<----- finish trial task(" + downloadTask.getId() + ") code[" + i + "]" + map);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().connectTrialEnd(downloadTask, i, map);
                    }
                });
            } else {
                downloadTask.getListener().connectTrialEnd(downloadTask, i, map);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void downloadFromBeginning(final com.liulishuo.okdownload.DownloadTask downloadTask, final com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, final com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "downloadFromBeginning: " + downloadTask.getId());
            inspectDownloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.4
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
                    }
                });
            } else {
                downloadTask.getListener().downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void downloadFromBreakpoint(final com.liulishuo.okdownload.DownloadTask downloadTask, final com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "downloadFromBreakpoint: " + downloadTask.getId());
            inspectDownloadFromBreakpoint(downloadTask, breakpointInfo);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.5
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().downloadFromBreakpoint(downloadTask, breakpointInfo);
                    }
                });
            } else {
                downloadTask.getListener().downloadFromBreakpoint(downloadTask, breakpointInfo);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectStart(final com.liulishuo.okdownload.DownloadTask downloadTask, final int i, final java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "-----> start connection task(" + downloadTask.getId() + ") block(" + i + ") " + map);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.6
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().connectStart(downloadTask, i, map);
                    }
                });
            } else {
                downloadTask.getListener().connectStart(downloadTask, i, map);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectEnd(final com.liulishuo.okdownload.DownloadTask downloadTask, final int i, final int i2, final java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "<----- finish connection task(" + downloadTask.getId() + ") block(" + i + ") code[" + i2 + "]" + map);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.7
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().connectEnd(downloadTask, i, i2, map);
                    }
                });
            } else {
                downloadTask.getListener().connectEnd(downloadTask, i, i2, map);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void fetchStart(final com.liulishuo.okdownload.DownloadTask downloadTask, final int i, final long j) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "fetchStart: " + downloadTask.getId());
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.8
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().fetchStart(downloadTask, i, j);
                    }
                });
            } else {
                downloadTask.getListener().fetchStart(downloadTask, i, j);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void fetchProgress(final com.liulishuo.okdownload.DownloadTask downloadTask, final int i, final long j) {
            if (downloadTask.getMinIntervalMillisCallbackProcess() > 0) {
                com.liulishuo.okdownload.DownloadTask.TaskHideWrapper.setLastCallbackProcessTs(downloadTask, android.os.SystemClock.uptimeMillis());
            }
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.9
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().fetchProgress(downloadTask, i, j);
                    }
                });
            } else {
                downloadTask.getListener().fetchProgress(downloadTask, i, j);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void fetchEnd(final com.liulishuo.okdownload.DownloadTask downloadTask, final int i, final long j) {
            com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "fetchEnd: " + downloadTask.getId());
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.10
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().fetchEnd(downloadTask, i, j);
                    }
                });
            } else {
                downloadTask.getListener().fetchEnd(downloadTask, i, j);
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void taskEnd(final com.liulishuo.okdownload.DownloadTask downloadTask, final com.liulishuo.okdownload.core.cause.EndCause endCause, final java.lang.Exception exc) {
            if (endCause == com.liulishuo.okdownload.core.cause.EndCause.ERROR) {
                com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.TAG, "taskEnd: " + downloadTask.getId() + " " + endCause + " " + exc);
            }
            inspectTaskEnd(downloadTask, endCause, exc);
            if (downloadTask.isAutoCallbackToUIThread()) {
                this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher.DefaultTransmitListener.11
                    @Override // java.lang.Runnable
                    public void run() {
                        downloadTask.getListener().taskEnd(downloadTask, endCause, exc);
                    }
                });
            } else {
                downloadTask.getListener().taskEnd(downloadTask, endCause, exc);
            }
        }

        void inspectDownloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            com.liulishuo.okdownload.DownloadMonitor monitor = com.liulishuo.okdownload.OkDownload.with().getMonitor();
            if (monitor != null) {
                monitor.taskDownloadFromBreakpoint(downloadTask, breakpointInfo);
            }
        }

        void inspectDownloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
            com.liulishuo.okdownload.DownloadMonitor monitor = com.liulishuo.okdownload.OkDownload.with().getMonitor();
            if (monitor != null) {
                monitor.taskDownloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
            }
        }

        void inspectTaskStart(com.liulishuo.okdownload.DownloadTask downloadTask) {
            com.liulishuo.okdownload.DownloadMonitor monitor = com.liulishuo.okdownload.OkDownload.with().getMonitor();
            if (monitor != null) {
                monitor.taskStart(downloadTask);
            }
        }

        void inspectTaskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
            com.liulishuo.okdownload.DownloadMonitor monitor = com.liulishuo.okdownload.OkDownload.with().getMonitor();
            if (monitor != null) {
                monitor.taskEnd(downloadTask, endCause, exc);
            }
        }
    }
}
