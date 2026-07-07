package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class DownloadTask extends com.liulishuo.okdownload.core.IdentifiedTask implements java.lang.Comparable<com.liulishuo.okdownload.DownloadTask> {
    private final boolean autoCallbackToUIThread;
    private final java.lang.Integer connectionCount;
    private final java.io.File directoryFile;
    private final boolean filenameFromResponse;
    private final com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder filenameHolder;
    private final int flushBufferSize;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerMapFields;
    private final int id;
    private com.liulishuo.okdownload.core.breakpoint.BreakpointInfo info;
    private final java.lang.Boolean isPreAllocateLength;
    private volatile android.util.SparseArray<java.lang.Object> keyTagMap;
    private final java.util.concurrent.atomic.AtomicLong lastCallbackProcessTimestamp = new java.util.concurrent.atomic.AtomicLong();
    private volatile com.liulishuo.okdownload.DownloadListener listener;
    private final int minIntervalMillisCallbackProcess;
    private final boolean passIfAlreadyCompleted;
    private final int priority;
    private final java.io.File providedPathFile;
    private final int readBufferSize;
    private java.lang.String redirectLocation;
    private final int syncBufferIntervalMills;
    private final int syncBufferSize;
    private java.lang.Object tag;
    private java.io.File targetFile;
    private final android.net.Uri uri;
    private final java.lang.String url;
    private final boolean wifiRequired;

    public DownloadTask(java.lang.String str, android.net.Uri uri, int i, int i2, int i3, int i4, int i5, boolean z, int i6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.lang.String str2, boolean z2, boolean z3, java.lang.Boolean bool, java.lang.Integer num, java.lang.Boolean bool2) {
        java.lang.Boolean bool3;
        java.lang.String str3 = str2;
        this.url = str;
        this.uri = uri;
        this.priority = i;
        this.readBufferSize = i2;
        this.flushBufferSize = i3;
        this.syncBufferSize = i4;
        this.syncBufferIntervalMills = i5;
        this.autoCallbackToUIThread = z;
        this.minIntervalMillisCallbackProcess = i6;
        this.headerMapFields = map;
        this.passIfAlreadyCompleted = z2;
        this.wifiRequired = z3;
        this.connectionCount = num;
        this.isPreAllocateLength = bool2;
        if (com.liulishuo.okdownload.core.Util.isUriFileScheme(uri)) {
            java.io.File file = new java.io.File(uri.getPath());
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (file.exists() && file.isFile()) {
                        throw new java.lang.IllegalArgumentException("If you want filename from response please make sure you provide path is directory " + file.getPath());
                    }
                    if (!com.liulishuo.okdownload.core.Util.isEmpty(str2)) {
                        com.liulishuo.okdownload.core.Util.w("DownloadTask", "Discard filename[" + str3 + "] because you set filenameFromResponse=true");
                        str3 = null;
                    }
                    this.directoryFile = file;
                } else {
                    if (file.exists() && file.isDirectory() && com.liulishuo.okdownload.core.Util.isEmpty(str2)) {
                        throw new java.lang.IllegalArgumentException("If you don't want filename from response please make sure you have already provided valid filename or not directory path " + file.getPath());
                    }
                    if (com.liulishuo.okdownload.core.Util.isEmpty(str2)) {
                        str3 = file.getName();
                        this.directoryFile = com.liulishuo.okdownload.core.Util.getParentFile(file);
                    } else {
                        this.directoryFile = file;
                    }
                }
                bool3 = bool;
            } else if (file.exists() && file.isDirectory()) {
                bool3 = true;
                this.directoryFile = file;
            } else {
                bool3 = false;
                if (file.exists()) {
                    if (!com.liulishuo.okdownload.core.Util.isEmpty(str2) && !file.getName().equals(str3)) {
                        throw new java.lang.IllegalArgumentException("Uri already provided filename!");
                    }
                    str3 = file.getName();
                    this.directoryFile = com.liulishuo.okdownload.core.Util.getParentFile(file);
                } else if (com.liulishuo.okdownload.core.Util.isEmpty(str2)) {
                    str3 = file.getName();
                    this.directoryFile = com.liulishuo.okdownload.core.Util.getParentFile(file);
                } else {
                    this.directoryFile = file;
                }
            }
            this.filenameFromResponse = bool3.booleanValue();
        } else {
            this.filenameFromResponse = false;
            this.directoryFile = new java.io.File(uri.getPath());
        }
        if (com.liulishuo.okdownload.core.Util.isEmpty(str3)) {
            this.filenameHolder = new com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder();
            this.providedPathFile = this.directoryFile;
        } else {
            this.filenameHolder = new com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder(str3);
            java.io.File file2 = new java.io.File(this.directoryFile, str3);
            this.targetFile = file2;
            this.providedPathFile = file2;
        }
        this.id = com.liulishuo.okdownload.OkDownload.with().breakpointStore().findOrCreateId(this);
    }

    public boolean isFilenameFromResponse() {
        return this.filenameFromResponse;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderMapFields() {
        return this.headerMapFields;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    public int getId() {
        return this.id;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    public java.lang.String getFilename() {
        return this.filenameHolder.get();
    }

    public boolean isPassIfAlreadyCompleted() {
        return this.passIfAlreadyCompleted;
    }

    public boolean isWifiRequired() {
        return this.wifiRequired;
    }

    public com.liulishuo.okdownload.core.download.DownloadStrategy.FilenameHolder getFilenameHolder() {
        return this.filenameHolder;
    }

    public android.net.Uri getUri() {
        return this.uri;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    public java.lang.String getUrl() {
        return this.url;
    }

    public void setRedirectLocation(java.lang.String str) {
        this.redirectLocation = str;
    }

    public java.lang.String getRedirectLocation() {
        return this.redirectLocation;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    protected java.io.File getProvidedPathFile() {
        return this.providedPathFile;
    }

    @Override // com.liulishuo.okdownload.core.IdentifiedTask
    public java.io.File getParentFile() {
        return this.directoryFile;
    }

    public java.io.File getFile() {
        java.lang.String str = this.filenameHolder.get();
        if (str == null) {
            return null;
        }
        if (this.targetFile == null) {
            this.targetFile = new java.io.File(this.directoryFile, str);
        }
        return this.targetFile;
    }

    public int getReadBufferSize() {
        return this.readBufferSize;
    }

    public int getFlushBufferSize() {
        return this.flushBufferSize;
    }

    public int getSyncBufferSize() {
        return this.syncBufferSize;
    }

    public int getSyncBufferIntervalMills() {
        return this.syncBufferIntervalMills;
    }

    public boolean isAutoCallbackToUIThread() {
        return this.autoCallbackToUIThread;
    }

    public int getMinIntervalMillisCallbackProcess() {
        return this.minIntervalMillisCallbackProcess;
    }

    public java.lang.Integer getSetConnectionCount() {
        return this.connectionCount;
    }

    public java.lang.Boolean getSetPreAllocateLength() {
        return this.isPreAllocateLength;
    }

    public int getConnectionCount() {
        com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo = this.info;
        if (breakpointInfo == null) {
            return 0;
        }
        return breakpointInfo.getBlockCount();
    }

    public java.lang.Object getTag(int i) {
        if (this.keyTagMap == null) {
            return null;
        }
        return this.keyTagMap.get(i);
    }

    public java.lang.Object getTag() {
        return this.tag;
    }

    public com.liulishuo.okdownload.core.breakpoint.BreakpointInfo getInfo() {
        if (this.info == null) {
            this.info = com.liulishuo.okdownload.OkDownload.with().breakpointStore().get(this.id);
        }
        return this.info;
    }

    long getLastCallbackProcessTs() {
        return this.lastCallbackProcessTimestamp.get();
    }

    void setLastCallbackProcessTs(long j) {
        this.lastCallbackProcessTimestamp.set(j);
    }

    void setBreakpointInfo(com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
        this.info = breakpointInfo;
    }

    public synchronized com.liulishuo.okdownload.DownloadTask addTag(int i, java.lang.Object obj) {
        if (this.keyTagMap == null) {
            synchronized (this) {
                if (this.keyTagMap == null) {
                    this.keyTagMap = new android.util.SparseArray<>();
                }
            }
        }
        this.keyTagMap.put(i, obj);
        return this;
    }

    public synchronized void removeTag(int i) {
        if (this.keyTagMap != null) {
            this.keyTagMap.remove(i);
        }
    }

    public synchronized void removeTag() {
        this.tag = null;
    }

    public void setTag(java.lang.Object obj) {
        this.tag = obj;
    }

    public void replaceListener(com.liulishuo.okdownload.DownloadListener downloadListener) {
        this.listener = downloadListener;
    }

    public static void enqueue(com.liulishuo.okdownload.DownloadTask[] downloadTaskArr, com.liulishuo.okdownload.DownloadListener downloadListener) {
        for (com.liulishuo.okdownload.DownloadTask downloadTask : downloadTaskArr) {
            downloadTask.listener = downloadListener;
        }
        com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().enqueue(downloadTaskArr);
    }

    public void enqueue(com.liulishuo.okdownload.DownloadListener downloadListener) {
        this.listener = downloadListener;
        com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().enqueue(this);
    }

    public void execute(com.liulishuo.okdownload.DownloadListener downloadListener) {
        this.listener = downloadListener;
        com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().execute(this);
    }

    public void cancel() {
        com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().cancel(this);
    }

    public static void cancel(com.liulishuo.okdownload.DownloadTask[] downloadTaskArr) {
        com.liulishuo.okdownload.OkDownload.with().downloadDispatcher().cancel(downloadTaskArr);
    }

    public com.liulishuo.okdownload.DownloadListener getListener() {
        return this.listener;
    }

    public int getPriority() {
        return this.priority;
    }

    public com.liulishuo.okdownload.DownloadTask.Builder toBuilder(java.lang.String str, android.net.Uri uri) {
        com.liulishuo.okdownload.DownloadTask.Builder passIfAlreadyCompleted = new com.liulishuo.okdownload.DownloadTask.Builder(str, uri).setPriority(this.priority).setReadBufferSize(this.readBufferSize).setFlushBufferSize(this.flushBufferSize).setSyncBufferSize(this.syncBufferSize).setSyncBufferIntervalMillis(this.syncBufferIntervalMills).setAutoCallbackToUIThread(this.autoCallbackToUIThread).setMinIntervalMillisCallbackProcess(this.minIntervalMillisCallbackProcess).setHeaderMapFields(this.headerMapFields).setPassIfAlreadyCompleted(this.passIfAlreadyCompleted);
        if (com.liulishuo.okdownload.core.Util.isUriFileScheme(uri) && !new java.io.File(uri.getPath()).isFile() && com.liulishuo.okdownload.core.Util.isUriFileScheme(this.uri) && this.filenameHolder.get() != null && !new java.io.File(this.uri.getPath()).getName().equals(this.filenameHolder.get())) {
            passIfAlreadyCompleted.setFilename(this.filenameHolder.get());
        }
        return passIfAlreadyCompleted;
    }

    public com.liulishuo.okdownload.DownloadTask.Builder toBuilder() {
        return toBuilder(this.url, this.uri);
    }

    public void setTags(com.liulishuo.okdownload.DownloadTask downloadTask) {
        this.tag = downloadTask.tag;
        this.keyTagMap = downloadTask.keyTagMap;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.liulishuo.okdownload.DownloadTask downloadTask) {
        return downloadTask.getPriority() - getPriority();
    }

    public static class Builder {
        public static final boolean DEFAULT_AUTO_CALLBACK_TO_UI_THREAD = true;
        public static final int DEFAULT_FLUSH_BUFFER_SIZE = 16384;
        public static final boolean DEFAULT_IS_WIFI_REQUIRED = false;
        public static final int DEFAULT_MIN_INTERVAL_MILLIS_CALLBACK_PROCESS = 3000;
        public static final boolean DEFAULT_PASS_IF_ALREADY_COMPLETED = true;
        public static final int DEFAULT_READ_BUFFER_SIZE = 4096;
        public static final int DEFAULT_SYNC_BUFFER_INTERVAL_MILLIS = 2000;
        public static final int DEFAULT_SYNC_BUFFER_SIZE = 65536;
        private boolean autoCallbackToUIThread;
        private java.lang.Integer connectionCount;
        private java.lang.String filename;
        private int flushBufferSize;
        private volatile java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerMapFields;
        private java.lang.Boolean isFilenameFromResponse;
        private java.lang.Boolean isPreAllocateLength;
        private boolean isWifiRequired;
        private int minIntervalMillisCallbackProcess;
        private boolean passIfAlreadyCompleted;
        private int priority;
        private int readBufferSize;
        private int syncBufferIntervalMillis;
        private int syncBufferSize;
        final android.net.Uri uri;
        final java.lang.String url;

        public Builder(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this(str, android.net.Uri.fromFile(new java.io.File(str2)));
            if (com.liulishuo.okdownload.core.Util.isEmpty(str3)) {
                this.isFilenameFromResponse = true;
            } else {
                this.filename = str3;
            }
        }

        public Builder(java.lang.String str, java.io.File file) {
            this.readBufferSize = DEFAULT_READ_BUFFER_SIZE;
            this.flushBufferSize = DEFAULT_FLUSH_BUFFER_SIZE;
            this.syncBufferSize = DEFAULT_SYNC_BUFFER_SIZE;
            this.syncBufferIntervalMillis = 2000;
            this.autoCallbackToUIThread = true;
            this.minIntervalMillisCallbackProcess = 3000;
            this.passIfAlreadyCompleted = true;
            this.isWifiRequired = false;
            this.url = str;
            this.uri = android.net.Uri.fromFile(file);
        }

        public Builder(java.lang.String str, android.net.Uri uri) {
            this.readBufferSize = DEFAULT_READ_BUFFER_SIZE;
            this.flushBufferSize = DEFAULT_FLUSH_BUFFER_SIZE;
            this.syncBufferSize = DEFAULT_SYNC_BUFFER_SIZE;
            this.syncBufferIntervalMillis = 2000;
            this.autoCallbackToUIThread = true;
            this.minIntervalMillisCallbackProcess = 3000;
            this.passIfAlreadyCompleted = true;
            this.isWifiRequired = false;
            this.url = str;
            this.uri = uri;
            if (com.liulishuo.okdownload.core.Util.isUriContentScheme(uri)) {
                this.filename = com.liulishuo.okdownload.core.Util.getFilenameFromContentUri(uri);
            }
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setPreAllocateLength(boolean z) {
            this.isPreAllocateLength = java.lang.Boolean.valueOf(z);
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setConnectionCount(int i) {
            this.connectionCount = java.lang.Integer.valueOf(i);
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setFilenameFromResponse(java.lang.Boolean bool) {
            if (!com.liulishuo.okdownload.core.Util.isUriFileScheme(this.uri)) {
                throw new java.lang.IllegalArgumentException("Uri isn't file scheme we can't let filename from response");
            }
            this.isFilenameFromResponse = bool;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setAutoCallbackToUIThread(boolean z) {
            this.autoCallbackToUIThread = z;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setMinIntervalMillisCallbackProcess(int i) {
            this.minIntervalMillisCallbackProcess = i;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setHeaderMapFields(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            this.headerMapFields = map;
            return this;
        }

        public synchronized void addHeader(java.lang.String str, java.lang.String str2) {
            if (this.headerMapFields == null) {
                this.headerMapFields = new java.util.HashMap();
            }
            java.util.List<java.lang.String> list = this.headerMapFields.get(str);
            if (list == null) {
                list = new java.util.ArrayList<>();
                this.headerMapFields.put(str, list);
            }
            list.add(str2);
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setPriority(int i) {
            this.priority = i;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setReadBufferSize(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Value must be positive!");
            }
            this.readBufferSize = i;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setFlushBufferSize(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Value must be positive!");
            }
            this.flushBufferSize = i;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setSyncBufferSize(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Value must be positive!");
            }
            this.syncBufferSize = i;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setSyncBufferIntervalMillis(int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Value must be positive!");
            }
            this.syncBufferIntervalMillis = i;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setFilename(java.lang.String str) {
            this.filename = str;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setPassIfAlreadyCompleted(boolean z) {
            this.passIfAlreadyCompleted = z;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask.Builder setWifiRequired(boolean z) {
            this.isWifiRequired = z;
            return this;
        }

        public com.liulishuo.okdownload.DownloadTask build() {
            return new com.liulishuo.okdownload.DownloadTask(this.url, this.uri, this.priority, this.readBufferSize, this.flushBufferSize, this.syncBufferSize, this.syncBufferIntervalMillis, this.autoCallbackToUIThread, this.minIntervalMillisCallbackProcess, this.headerMapFields, this.filename, this.passIfAlreadyCompleted, this.isWifiRequired, this.isFilenameFromResponse, this.connectionCount, this.isPreAllocateLength);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof com.liulishuo.okdownload.DownloadTask)) {
            return false;
        }
        com.liulishuo.okdownload.DownloadTask downloadTask = (com.liulishuo.okdownload.DownloadTask) obj;
        if (downloadTask.id == this.id) {
            return true;
        }
        return compareIgnoreId(downloadTask);
    }

    public int hashCode() {
        return (this.url + this.providedPathFile.toString() + this.filenameHolder.get()).hashCode();
    }

    public java.lang.String toString() {
        return super.toString() + "@" + this.id + "@" + this.url + "@" + this.directoryFile.toString() + "/" + this.filenameHolder.get();
    }

    public static com.liulishuo.okdownload.DownloadTask.MockTaskForCompare mockTaskForCompare(int i) {
        return new com.liulishuo.okdownload.DownloadTask.MockTaskForCompare(i);
    }

    public com.liulishuo.okdownload.DownloadTask.MockTaskForCompare mock(int i) {
        return new com.liulishuo.okdownload.DownloadTask.MockTaskForCompare(i, this);
    }

    public static class TaskHideWrapper {
        public static long getLastCallbackProcessTs(com.liulishuo.okdownload.DownloadTask downloadTask) {
            return downloadTask.getLastCallbackProcessTs();
        }

        public static void setLastCallbackProcessTs(com.liulishuo.okdownload.DownloadTask downloadTask, long j) {
            downloadTask.setLastCallbackProcessTs(j);
        }

        public static void setBreakpointInfo(com.liulishuo.okdownload.DownloadTask downloadTask, com.liulishuo.okdownload.core.breakpoint.BreakpointInfo breakpointInfo) {
            downloadTask.setBreakpointInfo(breakpointInfo);
        }
    }

    public static class MockTaskForCompare extends com.liulishuo.okdownload.core.IdentifiedTask {
        final java.lang.String filename;
        final int id;
        final java.io.File parentFile;
        final java.io.File providedPathFile;
        final java.lang.String url;

        public MockTaskForCompare(int i) {
            this.id = i;
            this.url = "";
            this.providedPathFile = EMPTY_FILE;
            this.filename = null;
            this.parentFile = EMPTY_FILE;
        }

        public MockTaskForCompare(int i, com.liulishuo.okdownload.DownloadTask downloadTask) {
            this.id = i;
            this.url = downloadTask.url;
            this.parentFile = downloadTask.getParentFile();
            this.providedPathFile = downloadTask.providedPathFile;
            this.filename = downloadTask.getFilename();
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        public int getId() {
            return this.id;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        public java.lang.String getUrl() {
            return this.url;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        protected java.io.File getProvidedPathFile() {
            return this.providedPathFile;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        public java.io.File getParentFile() {
            return this.parentFile;
        }

        @Override // com.liulishuo.okdownload.core.IdentifiedTask
        public java.lang.String getFilename() {
            return this.filename;
        }
    }
}
