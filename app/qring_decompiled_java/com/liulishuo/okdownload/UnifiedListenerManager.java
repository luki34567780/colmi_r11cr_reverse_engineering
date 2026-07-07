package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class UnifiedListenerManager {
    final java.util.List<java.lang.Integer> autoRemoveListenerIdList = new java.util.ArrayList();
    final com.liulishuo.okdownload.DownloadListener hostListener = new com.liulishuo.okdownload.DownloadListener() { // from class: com.liulishuo.okdownload.UnifiedListenerManager.1
        @Override // com.liulishuo.okdownload.DownloadListener
        public void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.taskStart(downloadTask);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectTrialStart(com.liulishuo.okdownload.DownloadTask downloadTask, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.connectTrialStart(downloadTask, map);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectTrialEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.connectTrialEnd(downloadTask, i, map);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void downloadFromBeginning(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo, com.liulishuo.okdownload.core.cause.ResumeFailedCause resumeFailedCause) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.downloadFromBeginning(downloadTask, breakpointInfo, resumeFailedCause);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void downloadFromBreakpoint(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.downloadFromBreakpoint(downloadTask, breakpointInfo);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.connectStart(downloadTask, i, map);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void connectEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, int i2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.connectEnd(downloadTask, i, i2, map);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void fetchStart(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.fetchStart(downloadTask, i, j);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void fetchProgress(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.fetchProgress(downloadTask, i, j);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void fetchEnd(com.liulishuo.okdownload.DownloadTask downloadTask, int i, long j) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.fetchEnd(downloadTask, i, j);
                }
            }
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
            com.liulishuo.okdownload.DownloadListener[] threadSafeArray = com.liulishuo.okdownload.UnifiedListenerManager.getThreadSafeArray(downloadTask, com.liulishuo.okdownload.UnifiedListenerManager.this.realListenerMap);
            if (threadSafeArray == null) {
                return;
            }
            for (com.liulishuo.okdownload.DownloadListener downloadListener : threadSafeArray) {
                if (downloadListener != null) {
                    downloadListener.taskEnd(downloadTask, endCause, exc);
                }
            }
            if (com.liulishuo.okdownload.UnifiedListenerManager.this.autoRemoveListenerIdList.contains(java.lang.Integer.valueOf(downloadTask.getId()))) {
                com.liulishuo.okdownload.UnifiedListenerManager.this.detachListener(downloadTask.getId());
            }
        }
    };
    final android.util.SparseArray<java.util.ArrayList<com.liulishuo.okdownload.DownloadListener>> realListenerMap = new android.util.SparseArray<>();

    public synchronized void detachListener(int i) {
        this.realListenerMap.remove(i);
    }

    public synchronized void addAutoRemoveListenersWhenTaskEnd(int i) {
        if (this.autoRemoveListenerIdList.contains(java.lang.Integer.valueOf(i))) {
            return;
        }
        this.autoRemoveListenerIdList.add(java.lang.Integer.valueOf(i));
    }

    public synchronized void removeAutoRemoveListenersWhenTaskEnd(int i) {
        this.autoRemoveListenerIdList.remove(java.lang.Integer.valueOf(i));
    }

    public synchronized void detachListener(com.liulishuo.okdownload.DownloadListener downloadListener) {
        int size = this.realListenerMap.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList<com.liulishuo.okdownload.DownloadListener> valueAt = this.realListenerMap.valueAt(i);
            if (valueAt != null) {
                valueAt.remove(downloadListener);
                if (valueAt.isEmpty()) {
                    arrayList.add(java.lang.Integer.valueOf(this.realListenerMap.keyAt(i)));
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.realListenerMap.remove(((java.lang.Integer) it.next()).intValue());
        }
    }

    public synchronized boolean detachListener(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.DownloadListener downloadListener) {
        int id = downloadTask.getId();
        java.util.ArrayList<com.liulishuo.okdownload.DownloadListener> arrayList = this.realListenerMap.get(id);
        if (arrayList == null) {
            return false;
        }
        boolean remove = arrayList.remove(downloadListener);
        if (arrayList.isEmpty()) {
            this.realListenerMap.remove(id);
        }
        return remove;
    }

    public synchronized void attachListener(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.DownloadListener downloadListener) {
        int id = downloadTask.getId();
        java.util.ArrayList<com.liulishuo.okdownload.DownloadListener> arrayList = this.realListenerMap.get(id);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            this.realListenerMap.put(id, arrayList);
        }
        if (!arrayList.contains(downloadListener)) {
            arrayList.add(downloadListener);
            if (downloadListener instanceof com.liulishuo.okdownload.core.listener.assist.ListenerAssist) {
                ((com.liulishuo.okdownload.core.listener.assist.ListenerAssist) downloadListener).setAlwaysRecoverAssistModelIfNotSet(true);
            }
        }
    }

    public synchronized void attachAndEnqueueIfNotRun(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.DownloadListener downloadListener) {
        attachListener(downloadTask, downloadListener);
        if (!isTaskPendingOrRunning(downloadTask)) {
            downloadTask.enqueue(this.hostListener);
        }
    }

    public synchronized void enqueueTaskWithUnifiedListener(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.DownloadListener downloadListener) {
        attachListener(downloadTask, downloadListener);
        downloadTask.enqueue(this.hostListener);
    }

    public synchronized void executeTaskWithUnifiedListener(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.DownloadListener downloadListener) {
        attachListener(downloadTask, downloadListener);
        downloadTask.execute(this.hostListener);
    }

    public com.liulishuo.okdownload.DownloadListener getHostListener() {
        return this.hostListener;
    }

    boolean isTaskPendingOrRunning(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return com.liulishuo.okdownload.StatusUtil.isSameTaskPendingOrRunning(downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.liulishuo.okdownload.DownloadListener[] getThreadSafeArray(com.liulishuo.okdownload.DownloadTask downloadTask, android.util.SparseArray<java.util.ArrayList<com.liulishuo.okdownload.DownloadListener>> sparseArray) {
        java.util.ArrayList<com.liulishuo.okdownload.DownloadListener> arrayList = sparseArray.get(downloadTask.getId());
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        com.liulishuo.okdownload.DownloadListener[] downloadListenerArr = new com.liulishuo.okdownload.DownloadListener[arrayList.size()];
        arrayList.toArray(downloadListenerArr);
        return downloadListenerArr;
    }
}
