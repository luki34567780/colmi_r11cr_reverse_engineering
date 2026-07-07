package com.liulishuo.okdownload;

/* loaded from: /tmp/dex/classes2.dex */
public class OkDownload {
    static volatile com.liulishuo.okdownload.OkDownload singleton;
    private final com.liulishuo.okdownload.core.breakpoint.BreakpointStore breakpointStore;
    private final com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher;
    private final com.liulishuo.okdownload.core.connection.DownloadConnection.Factory connectionFactory;
    private final android.content.Context context;
    private final com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher downloadDispatcher;
    private final com.liulishuo.okdownload.core.download.DownloadStrategy downloadStrategy;
    com.liulishuo.okdownload.DownloadMonitor monitor;
    private final com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory outputStreamFactory;
    private final com.liulishuo.okdownload.core.file.ProcessFileStrategy processFileStrategy;

    OkDownload(android.content.Context context, com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher downloadDispatcher, com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher, com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore, com.liulishuo.okdownload.core.connection.DownloadConnection.Factory factory, com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory factory2, com.liulishuo.okdownload.core.file.ProcessFileStrategy processFileStrategy, com.liulishuo.okdownload.core.download.DownloadStrategy downloadStrategy) {
        this.context = context;
        this.downloadDispatcher = downloadDispatcher;
        this.callbackDispatcher = callbackDispatcher;
        this.breakpointStore = downloadStore;
        this.connectionFactory = factory;
        this.outputStreamFactory = factory2;
        this.processFileStrategy = processFileStrategy;
        this.downloadStrategy = downloadStrategy;
        downloadDispatcher.setDownloadStore(com.liulishuo.okdownload.core.Util.createRemitDatabase(downloadStore));
    }

    public com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher downloadDispatcher() {
        return this.downloadDispatcher;
    }

    public com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher() {
        return this.callbackDispatcher;
    }

    public com.liulishuo.okdownload.core.breakpoint.BreakpointStore breakpointStore() {
        return this.breakpointStore;
    }

    public com.liulishuo.okdownload.core.connection.DownloadConnection.Factory connectionFactory() {
        return this.connectionFactory;
    }

    public com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory outputStreamFactory() {
        return this.outputStreamFactory;
    }

    public com.liulishuo.okdownload.core.file.ProcessFileStrategy processFileStrategy() {
        return this.processFileStrategy;
    }

    public com.liulishuo.okdownload.core.download.DownloadStrategy downloadStrategy() {
        return this.downloadStrategy;
    }

    public android.content.Context context() {
        return this.context;
    }

    public void setMonitor(com.liulishuo.okdownload.DownloadMonitor downloadMonitor) {
        this.monitor = downloadMonitor;
    }

    public com.liulishuo.okdownload.DownloadMonitor getMonitor() {
        return this.monitor;
    }

    public static com.liulishuo.okdownload.OkDownload with() {
        if (singleton == null) {
            synchronized (com.liulishuo.okdownload.OkDownload.class) {
                if (singleton == null) {
                    if (com.liulishuo.okdownload.OkDownloadProvider.context == null) {
                        throw new java.lang.IllegalStateException("context == null");
                    }
                    singleton = new com.liulishuo.okdownload.OkDownload.Builder(com.liulishuo.okdownload.OkDownloadProvider.context).build();
                }
            }
        }
        return singleton;
    }

    public static void setSingletonInstance(com.liulishuo.okdownload.OkDownload okDownload) {
        if (singleton != null) {
            throw new java.lang.IllegalArgumentException("OkDownload must be null.");
        }
        synchronized (com.liulishuo.okdownload.OkDownload.class) {
            if (singleton != null) {
                throw new java.lang.IllegalArgumentException("OkDownload must be null.");
            }
            singleton = okDownload;
        }
    }

    public static class Builder {
        private com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher;
        private com.liulishuo.okdownload.core.connection.DownloadConnection.Factory connectionFactory;
        private final android.content.Context context;
        private com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher downloadDispatcher;
        private com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore;
        private com.liulishuo.okdownload.core.download.DownloadStrategy downloadStrategy;
        private com.liulishuo.okdownload.DownloadMonitor monitor;
        private com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory outputStreamFactory;
        private com.liulishuo.okdownload.core.file.ProcessFileStrategy processFileStrategy;

        public Builder(android.content.Context context) {
            this.context = context.getApplicationContext();
        }

        public com.liulishuo.okdownload.OkDownload.Builder downloadDispatcher(com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher downloadDispatcher) {
            this.downloadDispatcher = downloadDispatcher;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload.Builder callbackDispatcher(com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher callbackDispatcher) {
            this.callbackDispatcher = callbackDispatcher;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload.Builder downloadStore(com.liulishuo.okdownload.core.breakpoint.DownloadStore downloadStore) {
            this.downloadStore = downloadStore;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload.Builder connectionFactory(com.liulishuo.okdownload.core.connection.DownloadConnection.Factory factory) {
            this.connectionFactory = factory;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload.Builder outputStreamFactory(com.liulishuo.okdownload.core.file.DownloadOutputStream.Factory factory) {
            this.outputStreamFactory = factory;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload.Builder processFileStrategy(com.liulishuo.okdownload.core.file.ProcessFileStrategy processFileStrategy) {
            this.processFileStrategy = processFileStrategy;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload.Builder downloadStrategy(com.liulishuo.okdownload.core.download.DownloadStrategy downloadStrategy) {
            this.downloadStrategy = downloadStrategy;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload.Builder monitor(com.liulishuo.okdownload.DownloadMonitor downloadMonitor) {
            this.monitor = downloadMonitor;
            return this;
        }

        public com.liulishuo.okdownload.OkDownload build() {
            if (this.downloadDispatcher == null) {
                this.downloadDispatcher = new com.liulishuo.okdownload.core.dispatcher.DownloadDispatcher();
            }
            if (this.callbackDispatcher == null) {
                this.callbackDispatcher = new com.liulishuo.okdownload.core.dispatcher.CallbackDispatcher();
            }
            if (this.downloadStore == null) {
                this.downloadStore = com.liulishuo.okdownload.core.Util.createDefaultDatabase(this.context);
            }
            if (this.connectionFactory == null) {
                this.connectionFactory = com.liulishuo.okdownload.core.Util.createDefaultConnectionFactory();
            }
            if (this.outputStreamFactory == null) {
                this.outputStreamFactory = new com.liulishuo.okdownload.core.file.DownloadUriOutputStream.Factory();
            }
            if (this.processFileStrategy == null) {
                this.processFileStrategy = new com.liulishuo.okdownload.core.file.ProcessFileStrategy();
            }
            if (this.downloadStrategy == null) {
                this.downloadStrategy = new com.liulishuo.okdownload.core.download.DownloadStrategy();
            }
            com.liulishuo.okdownload.OkDownload okDownload = new com.liulishuo.okdownload.OkDownload(this.context, this.downloadDispatcher, this.callbackDispatcher, this.downloadStore, this.connectionFactory, this.outputStreamFactory, this.processFileStrategy, this.downloadStrategy);
            okDownload.setMonitor(this.monitor);
            com.liulishuo.okdownload.core.Util.d("OkDownload", "downloadStore[" + this.downloadStore + "] connectionFactory[" + this.connectionFactory);
            return okDownload;
        }
    }
}
