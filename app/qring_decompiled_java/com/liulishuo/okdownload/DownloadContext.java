package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadContext {
    private static final java.util.concurrent.Executor SERIAL_EXECUTOR = new java.util.concurrent.ThreadPoolExecutor(0, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER, 30, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.liulishuo.okdownload.core.Util.threadFactory("OkDownload Serial", false));
    private static final java.lang.String TAG = "DownloadContext";
    final com.liulishuo.okdownload.DownloadContextListener contextListener;
    private final com.liulishuo.okdownload.DownloadContext.QueueSet set;
    volatile boolean started;
    private final com.liulishuo.okdownload.DownloadTask[] tasks;
    private android.os.Handler uiHandler;

    DownloadContext(com.liulishuo.okdownload.DownloadTask[] downloadTaskArr, com.liulishuo.okdownload.DownloadContextListener downloadContextListener, com.liulishuo.okdownload.DownloadContext.QueueSet queueSet, android.os.Handler handler) {
        this(downloadTaskArr, downloadContextListener, queueSet);
        this.uiHandler = handler;
    }

    DownloadContext(com.liulishuo.okdownload.DownloadTask[] downloadTaskArr, com.liulishuo.okdownload.DownloadContextListener downloadContextListener, com.liulishuo.okdownload.DownloadContext.QueueSet queueSet) {
        this.started = false;
        this.tasks = downloadTaskArr;
        this.contextListener = downloadContextListener;
        this.set = queueSet;
    }

    public boolean isStarted() {
        return this.started;
    }

    public com.liulishuo.okdownload.DownloadTask[] getTasks() {
        return this.tasks;
    }

    public void startOnSerial(com.liulishuo.okdownload.DownloadListener downloadListener) {
        start(downloadListener, true);
    }

    public void startOnParallel(com.liulishuo.okdownload.DownloadListener downloadListener) {
        start(downloadListener, false);
    }

    public void start(final com.liulishuo.okdownload.DownloadListener downloadListener, boolean z) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.liulishuo.okdownload.core.Util.d(TAG, "start " + z);
        this.started = true;
        if (this.contextListener != null) {
            downloadListener = new com.liulishuo.okdownload.core.listener.DownloadListenerBunch.Builder().append(downloadListener).append(new com.liulishuo.okdownload.DownloadContext.QueueAttachListener(this, this.contextListener, this.tasks.length)).build();
        }
        if (z) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Collections.addAll(arrayList, this.tasks);
            java.util.Collections.sort(arrayList);
            executeOnSerialExecutor(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.DownloadContext.1
                @Override // java.lang.Runnable
                public void run() {
                    for (com.liulishuo.okdownload.DownloadTask downloadTask : arrayList) {
                        if (!com.liulishuo.okdownload.DownloadContext.this.isStarted()) {
                            com.liulishuo.okdownload.DownloadContext.this.callbackQueueEndOnSerialLoop(downloadTask.isAutoCallbackToUIThread());
                            return;
                        }
                        downloadTask.execute(downloadListener);
                    }
                }
            });
        } else {
            com.liulishuo.okdownload.DownloadTask.enqueue(this.tasks, downloadListener);
        }
        com.liulishuo.okdownload.core.Util.d(TAG, "start finish " + z + " " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
    }

    public com.liulishuo.okdownload.DownloadContext.AlterContext alter() {
        return new com.liulishuo.okdownload.DownloadContext.AlterContext(this);
    }

    public void stop() {
        if (this.started) {
            com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().cancel(this.tasks);
        }
        this.started = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackQueueEndOnSerialLoop(boolean z) {
        com.liulishuo.okdownload.DownloadContextListener downloadContextListener = this.contextListener;
        if (downloadContextListener == null) {
            return;
        }
        if (z) {
            if (this.uiHandler == null) {
                this.uiHandler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            this.uiHandler.post(new java.lang.Runnable() { // from class: com.liulishuo.okdownload.DownloadContext.2
                @Override // java.lang.Runnable
                public void run() {
                    com.liulishuo.okdownload.DownloadContext.this.contextListener.queueEnd(com.liulishuo.okdownload.DownloadContext.this);
                }
            });
            return;
        }
        downloadContextListener.queueEnd(this);
    }

    void executeOnSerialExecutor(java.lang.Runnable runnable) {
        SERIAL_EXECUTOR.execute(runnable);
    }

    public com.liulishuo.okdownload.DownloadContext.Builder toBuilder() {
        return new com.liulishuo.okdownload.DownloadContext.Builder(this.set, new java.util.ArrayList(java.util.Arrays.asList(this.tasks))).setListener(this.contextListener);
    }

    public static class Builder {
        final java.util.ArrayList<com.liulishuo.okdownload.DownloadTask> boundTaskList;
        private com.liulishuo.okdownload.DownloadContextListener listener;
        private final com.liulishuo.okdownload.DownloadContext.QueueSet set;

        public Builder() {
            this(new com.liulishuo.okdownload.DownloadContext.QueueSet());
        }

        public Builder(com.liulishuo.okdownload.DownloadContext.QueueSet queueSet) {
            this(queueSet, new java.util.ArrayList());
        }

        public Builder(com.liulishuo.okdownload.DownloadContext.QueueSet queueSet, java.util.ArrayList<com.liulishuo.okdownload.DownloadTask> arrayList) {
            this.set = queueSet;
            this.boundTaskList = arrayList;
        }

        public com.liulishuo.okdownload.DownloadContext.Builder setListener(com.liulishuo.okdownload.DownloadContextListener downloadContextListener) {
            this.listener = downloadContextListener;
            return this;
        }

        public com.liulishuo.okdownload.DownloadContext.Builder bindSetTask(com.liulishuo.okdownload.DownloadTask downloadTask) {
            int indexOf = this.boundTaskList.indexOf(downloadTask);
            if (indexOf >= 0) {
                this.boundTaskList.set(indexOf, downloadTask);
            } else {
                this.boundTaskList.add(downloadTask);
            }
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask bind(java.lang.String str) {
            if (this.set.uri == null) {
                throw new java.lang.IllegalArgumentException("If you want to bind only with url, you have to provide parentPath on QueueSet!");
            }
            return bind(new com.liulishuo.okdownload.DownloadTask.Builder(str, this.set.uri).setFilenameFromResponse(true));
        }

        public com.liulishuo.okdownload.DownloadTask bind(com.liulishuo.okdownload.DownloadTask.Builder builder) {
            if (this.set.headerMapFields != null) {
                builder.setHeaderMapFields(this.set.headerMapFields);
            }
            if (this.set.readBufferSize != null) {
                builder.setReadBufferSize(this.set.readBufferSize.intValue());
            }
            if (this.set.flushBufferSize != null) {
                builder.setFlushBufferSize(this.set.flushBufferSize.intValue());
            }
            if (this.set.syncBufferSize != null) {
                builder.setSyncBufferSize(this.set.syncBufferSize.intValue());
            }
            if (this.set.wifiRequired != null) {
                builder.setWifiRequired(this.set.wifiRequired.booleanValue());
            }
            if (this.set.syncBufferIntervalMillis != null) {
                builder.setSyncBufferIntervalMillis(this.set.syncBufferIntervalMillis.intValue());
            }
            if (this.set.autoCallbackToUIThread != null) {
                builder.setAutoCallbackToUIThread(this.set.autoCallbackToUIThread.booleanValue());
            }
            if (this.set.minIntervalMillisCallbackProcess != null) {
                builder.setMinIntervalMillisCallbackProcess(this.set.minIntervalMillisCallbackProcess.intValue());
            }
            if (this.set.passIfAlreadyCompleted != null) {
                builder.setPassIfAlreadyCompleted(this.set.passIfAlreadyCompleted.booleanValue());
            }
            com.liulishuo.okdownload.DownloadTask build = builder.build();
            if (this.set.tag != null) {
                build.setTag(this.set.tag);
            }
            this.boundTaskList.add(build);
            return build;
        }

        public void unbind(com.liulishuo.okdownload.DownloadTask downloadTask) {
            this.boundTaskList.remove(downloadTask);
        }

        public void unbind(int i) {
            for (com.liulishuo.okdownload.DownloadTask downloadTask : (java.util.List) this.boundTaskList.clone()) {
                if (downloadTask.getId() == i) {
                    this.boundTaskList.remove(downloadTask);
                }
            }
        }

        public com.liulishuo.okdownload.DownloadContext build() {
            return new com.liulishuo.okdownload.DownloadContext((com.liulishuo.okdownload.DownloadTask[]) this.boundTaskList.toArray(new com.liulishuo.okdownload.DownloadTask[this.boundTaskList.size()]), this.listener, this.set);
        }
    }

    public static class QueueSet {
        private java.lang.Boolean autoCallbackToUIThread;
        private java.lang.Integer flushBufferSize;
        private java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerMapFields;
        private java.lang.Integer minIntervalMillisCallbackProcess;
        private java.lang.Boolean passIfAlreadyCompleted;
        private java.lang.Integer readBufferSize;
        private java.lang.Integer syncBufferIntervalMillis;
        private java.lang.Integer syncBufferSize;
        private java.lang.Object tag;
        private android.net.Uri uri;
        private java.lang.Boolean wifiRequired;

        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderMapFields() {
            return this.headerMapFields;
        }

        public void setHeaderMapFields(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            this.headerMapFields = map;
        }

        public android.net.Uri getDirUri() {
            return this.uri;
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setParentPathUri(android.net.Uri uri) {
            this.uri = uri;
            return this;
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setParentPathFile(java.io.File file) {
            if (file.isFile()) {
                throw new java.lang.IllegalArgumentException("parent path only accept directory path");
            }
            this.uri = android.net.Uri.fromFile(file);
            return this;
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setParentPath(java.lang.String str) {
            return setParentPathFile(new java.io.File(str));
        }

        public int getReadBufferSize() {
            java.lang.Integer num = this.readBufferSize;
            return num == null ? com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_READ_BUFFER_SIZE : num.intValue();
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setReadBufferSize(int i) {
            this.readBufferSize = java.lang.Integer.valueOf(i);
            return this;
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setWifiRequired(java.lang.Boolean bool) {
            this.wifiRequired = bool;
            return this;
        }

        public boolean isWifiRequired() {
            java.lang.Boolean bool = this.wifiRequired;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }

        public int getFlushBufferSize() {
            java.lang.Integer num = this.flushBufferSize;
            return num == null ? com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_FLUSH_BUFFER_SIZE : num.intValue();
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setFlushBufferSize(int i) {
            this.flushBufferSize = java.lang.Integer.valueOf(i);
            return this;
        }

        public int getSyncBufferSize() {
            java.lang.Integer num = this.syncBufferSize;
            return num == null ? com.liulishuo.okdownload.DownloadTask.Builder.DEFAULT_SYNC_BUFFER_SIZE : num.intValue();
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setSyncBufferSize(int i) {
            this.syncBufferSize = java.lang.Integer.valueOf(i);
            return this;
        }

        public int getSyncBufferIntervalMillis() {
            java.lang.Integer num = this.syncBufferIntervalMillis;
            if (num == null) {
                return 2000;
            }
            return num.intValue();
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setSyncBufferIntervalMillis(int i) {
            this.syncBufferIntervalMillis = java.lang.Integer.valueOf(i);
            return this;
        }

        public boolean isAutoCallbackToUIThread() {
            java.lang.Boolean bool = this.autoCallbackToUIThread;
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setAutoCallbackToUIThread(java.lang.Boolean bool) {
            this.autoCallbackToUIThread = bool;
            return this;
        }

        public int getMinIntervalMillisCallbackProcess() {
            java.lang.Integer num = this.minIntervalMillisCallbackProcess;
            if (num == null) {
                return 3000;
            }
            return num.intValue();
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setMinIntervalMillisCallbackProcess(java.lang.Integer num) {
            this.minIntervalMillisCallbackProcess = num;
            return this;
        }

        public java.lang.Object getTag() {
            return this.tag;
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        public boolean isPassIfAlreadyCompleted() {
            java.lang.Boolean bool = this.passIfAlreadyCompleted;
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }

        public com.liulishuo.okdownload.DownloadContext.QueueSet setPassIfAlreadyCompleted(boolean z) {
            this.passIfAlreadyCompleted = java.lang.Boolean.valueOf(z);
            return this;
        }

        public com.liulishuo.okdownload.DownloadContext.Builder commit() {
            return new com.liulishuo.okdownload.DownloadContext.Builder(this);
        }
    }

    static class QueueAttachListener extends com.liulishuo.okdownload.core.listener.DownloadListener2 {
        private final com.liulishuo.okdownload.DownloadContextListener contextListener;
        private final com.liulishuo.okdownload.DownloadContext hostContext;
        private final java.util.concurrent.atomic.AtomicInteger remainCount;

        @Override // com.liulishuo.okdownload.DownloadListener
        public void taskStart(com.liulishuo.okdownload.DownloadTask downloadTask) {
        }

        QueueAttachListener(com.liulishuo.okdownload.DownloadContext downloadContext, com.liulishuo.okdownload.DownloadContextListener downloadContextListener, int i) {
            this.remainCount = new java.util.concurrent.atomic.AtomicInteger(i);
            this.contextListener = downloadContextListener;
            this.hostContext = downloadContext;
        }

        @Override // com.liulishuo.okdownload.DownloadListener
        public void taskEnd(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.cause.EndCause endCause, java.lang.Exception exc) {
            int decrementAndGet = this.remainCount.decrementAndGet();
            this.contextListener.taskEnd(this.hostContext, downloadTask, endCause, exc, decrementAndGet);
            if (decrementAndGet <= 0) {
                this.contextListener.queueEnd(this.hostContext);
                com.liulishuo.okdownload.core.Util.d(com.liulishuo.okdownload.DownloadContext.TAG, "taskEnd and remainCount " + decrementAndGet);
            }
        }
    }

    public static class AlterContext {
        private final com.liulishuo.okdownload.DownloadContext context;

        AlterContext(com.liulishuo.okdownload.DownloadContext downloadContext) {
            this.context = downloadContext;
        }

        public com.liulishuo.okdownload.DownloadContext.AlterContext replaceTask(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.DownloadTask downloadTask2) {
            com.liulishuo.okdownload.DownloadTask[] downloadTaskArr = this.context.tasks;
            for (int i = 0; i < downloadTaskArr.length; i++) {
                if (downloadTaskArr[i] == downloadTask) {
                    downloadTaskArr[i] = downloadTask2;
                }
            }
            return this;
        }
    }
}
