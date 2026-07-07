package com.qcwireless.qcwatch.ui.device.dfu.vm;

/* compiled from: WatchFileDismissViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003,-.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ \u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002J\u001e\u0010%\u001a\u00020\u001f2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\"0\u0016j\b\u0012\u0004\u0012\u00020\"`\u0017J \u0010'\u001a\u00020\u001f2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0016j\b\u0012\u0004\u0012\u00020\u000e`\u0017H\u0002J\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\u001fJ\u0014\u0010*\u001a\u00020\u001f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0+R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0016j\b\u0012\u0004\u0012\u00020\u000e`\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012¨\u0006/"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "otaRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository;)V", "_dismissFileState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel$DismissFileFirmwareUI;", "_uiState", "Lcom/qcwireless/qcwatch/ui/base/repository/device/OTAFileStatus;", "callback", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel$Callback;", "dismissFile", "", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/DeviceMissFileResp;", "dismissFileState", "Landroidx/lifecycle/LiveData;", "getDismissFileState", "()Landroidx/lifecycle/LiveData;", "downloadCallback", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel$QueueDismissFileListener;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mSendFileIndex", "", "task", "Lcom/liulishuo/okdownload/DownloadTask;", "uiState", "getUiState", "cancelTask", "", "createTask", "url", "", "fileName", "tag", "downloadFile", "fileNames", "downloadWatchDismissFiles", "initFileHandler", "sendFile", "startDismissFileOTA", "", "Callback", "DismissFileFirmwareUI", "QueueDismissFileListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WatchFileDismissViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI> _dismissFileState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus> _uiState;
    private final com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.Callback callback;
    private java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp> dismissFile;
    private final com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.QueueDismissFileListener downloadCallback;
    private java.util.ArrayList<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp> list;
    private int mSendFileIndex;
    private final com.qcwireless.qcwatch.ui.base.repository.device.OTARepository otaRepository;
    private com.liulishuo.okdownload.DownloadTask task;

    public WatchFileDismissViewModel(com.qcwireless.qcwatch.ui.base.repository.device.OTARepository oTARepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTARepository, "otaRepository");
        this.otaRepository = oTARepository;
        this.dismissFile = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.callback = new com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.Callback();
        this.downloadCallback = new com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.QueueDismissFileListener();
        this._dismissFileState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI> getDismissFileState() {
        return this._dismissFileState;
    }

    public final void startDismissFileOTA(java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        initFileHandler();
        this.dismissFile.clear();
        this.dismissFile.addAll(list);
        this.mSendFileIndex = 0;
        sendFile();
    }

    public final void initFileHandler() {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().removeCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(this.callback);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().initRegister();
    }

    public final void sendFile() {
        try {
            if (this.mSendFileIndex < this.dismissFile.size()) {
                final com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp deviceMissFileResp = this.dismissFile.get(this.mSendFileIndex);
                if (com.oudmon.ble.base.communication.file.FileHandle.getInstance().checkFile(new java.io.File(com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getBinDirFile(), deviceMissFileResp.getFileName()).getAbsolutePath())) {
                    com.oudmon.ble.base.util.ThreadUtils.postDelay(new com.oudmon.ble.base.util.ThreadUtils.TimeTask() { // from class: com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel$sendFile$1
                        @Override // com.oudmon.ble.base.util.ThreadUtils.TimeTask
                        protected void task() {
                            com.oudmon.ble.base.communication.file.FileHandle.getInstance().cmdFileInit(com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp.this.getFileName());
                        }
                    }, 1000L);
                } else {
                    com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus oTAFileStatus = new com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus();
                    oTAFileStatus.setFileExists(false);
                    this._uiState.postValue(oTAFileStatus);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void downloadFile(java.util.ArrayList<java.lang.String> fileNames) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileNames, "fileNames");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel$downloadFile$1(this, fileNames, null), 3, (java.lang.Object) null);
    }

    private final com.liulishuo.okdownload.DownloadTask createTask(java.lang.String url, java.lang.String fileName, java.lang.String tag) {
        com.liulishuo.okdownload.DownloadTask build = new com.liulishuo.okdownload.DownloadTask.Builder(url, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getBinDirFile()).setFilename(fileName).setMinIntervalMillisCallbackProcess(64).setPassIfAlreadyCompleted(false).setPriority(100).setReadBufferSize(8192).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder(url, parentFile)…192)\n            .build()");
        this.task = build;
        if (build == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("task");
            build = null;
        }
        build.setTag(tag);
        com.liulishuo.okdownload.DownloadTask downloadTask = this.task;
        if (downloadTask != null) {
            return downloadTask;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("task");
        return null;
    }

    public final void cancelTask() {
        try {
            com.liulishuo.okdownload.DownloadTask downloadTask = this.task;
            if (downloadTask != null) {
                if (downloadTask == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("task");
                    downloadTask = null;
                }
                downloadTask.cancel();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadWatchDismissFiles(java.util.ArrayList<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp> list) {
        java.io.File binDirFile = com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getBinDirFile();
        java.util.Iterator<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp> it = list.iterator();
        while (it.hasNext()) {
            com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp next = it.next();
            if (com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.fileExists(binDirFile.getAbsolutePath() + '/' + next.getFileName())) {
                com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.deleteFile(binDirFile.getAbsolutePath() + '/' + next.getFileName());
            }
            createTask(next.getDownloadUrl(), next.getFileName(), next.getFileName()).enqueue(this.downloadCallback);
        }
    }

    /* compiled from: WatchFileDismissViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel$QueueDismissFileListener;", "Lcom/liulishuo/okdownload/core/listener/DownloadListener1;", "(Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel;)V", "connected", "", "task", "Lcom/liulishuo/okdownload/DownloadTask;", "blockCount", "", "currentOffset", "", "totalLength", "progress", "retry", "cause", "Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;", "taskEnd", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "realCause", "Ljava/lang/Exception;", "model", "Lcom/liulishuo/okdownload/core/listener/assist/Listener1Assist$Listener1Model;", "taskStart", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class QueueDismissFileListener extends com.liulishuo.okdownload.core.listener.DownloadListener1 {
        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void connected(com.liulishuo.okdownload.DownloadTask task, int blockCount, long currentOffset, long totalLength) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        }

        public QueueDismissFileListener() {
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void taskStart(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "task start");
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void taskEnd(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
            if (cause == com.liulishuo.okdownload.core.cause.EndCause.ERROR) {
                java.util.ArrayList arrayList = com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this.list;
                java.util.ArrayList arrayList2 = null;
                if (arrayList == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("list");
                    arrayList = null;
                }
                if (arrayList.size() > 0) {
                    com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel watchFileDismissViewModel = com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this;
                    java.util.ArrayList arrayList3 = watchFileDismissViewModel.list;
                    if (arrayList3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("list");
                    } else {
                        arrayList2 = arrayList3;
                    }
                    watchFileDismissViewModel.downloadWatchDismissFiles(arrayList2);
                }
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "task end" + realCause);
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void retry(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.ResumeFailedCause cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "task retry");
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void progress(com.liulishuo.okdownload.DownloadTask task, long currentOffset, long totalLength) {
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "下载进度:" + currentOffset + "--" + totalLength);
            long j = (((long) 100) * currentOffset) / totalLength;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Long.valueOf(j));
            if (currentOffset == totalLength || (i = (int) j) == 100) {
                com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this._dismissFileState.postValue(new com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI(100L, task.getTag().toString(), true));
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.OTAFileStatusEvent(1, 100, true, task.getTag().toString()));
            } else {
                com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this._dismissFileState.postValue(new com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI(j, task.getTag().toString(), false));
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.OTAFileStatusEvent(1, i, false, task.getTag().toString()));
            }
        }
    }

    /* compiled from: WatchFileDismissViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel$DismissFileFirmwareUI;", "", "progressBar", "", "fileName", "", "success", "", "(JLjava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getProgressBar", "()J", "setProgressBar", "(J)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "component3", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DismissFileFirmwareUI {
        private java.lang.String fileName;
        private long progressBar;
        private boolean success;

        public DismissFileFirmwareUI() {
            this(0L, null, false, 7, null);
        }

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI copy$default(com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI dismissFileFirmwareUI, long j, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = dismissFileFirmwareUI.progressBar;
            }
            if ((i & 2) != 0) {
                str = dismissFileFirmwareUI.fileName;
            }
            if ((i & 4) != 0) {
                z = dismissFileFirmwareUI.success;
            }
            return dismissFileFirmwareUI.copy(j, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getProgressBar() {
            return this.progressBar;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFileName() {
            return this.fileName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public final com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI copy(long progressBar, java.lang.String fileName, boolean success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
            return new com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI(progressBar, fileName, success);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI dismissFileFirmwareUI = (com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.DismissFileFirmwareUI) other;
            return this.progressBar == dismissFileFirmwareUI.progressBar && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, dismissFileFirmwareUI.fileName) && this.success == dismissFileFirmwareUI.success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int m = ((com.qcwireless.qcwatch.ui.base.bean.request.collection.CollectionRequest$$ExternalSyntheticBackport0.m(this.progressBar) * 31) + this.fileName.hashCode()) * 31;
            boolean z = this.success;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return m + i;
        }

        public java.lang.String toString() {
            return "DismissFileFirmwareUI(progressBar=" + this.progressBar + ", fileName=" + this.fileName + ", success=" + this.success + ')';
        }

        public DismissFileFirmwareUI(long j, java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fileName");
            this.progressBar = j;
            this.fileName = str;
            this.success = z;
        }

        public /* synthetic */ DismissFileFirmwareUI(long j, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z);
        }

        public final long getProgressBar() {
            return this.progressBar;
        }

        public final void setProgressBar(long j) {
            this.progressBar = j;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final void setFileName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.fileName = str;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final void setSuccess(boolean z) {
            this.success = z;
        }
    }

    /* compiled from: WatchFileDismissViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel$Callback;", "Lcom/oudmon/ble/base/communication/file/SimpleCallback;", "(Lcom/qcwireless/qcwatch/ui/device/dfu/vm/WatchFileDismissViewModel;)V", "onComplete", "", "onProgress", "percent", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Callback extends com.oudmon.ble.base.communication.file.SimpleCallback {
        public Callback() {
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onProgress(int percent) {
            com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus oTAFileStatus = new com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus();
            oTAFileStatus.setCurrIndex(com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this.mSendFileIndex);
            oTAFileStatus.setTotalIndex(com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this.dismissFile.size());
            oTAFileStatus.setProgressBar(percent);
            oTAFileStatus.setOtaSuccess(false);
            com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this._uiState.postValue(oTAFileStatus);
            org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.OTAFileStatusEvent(2, percent, false, ""));
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onComplete() {
            com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this.mSendFileIndex++;
            if (com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this.mSendFileIndex >= com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this.dismissFile.size()) {
                com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus oTAFileStatus = new com.qcwireless.qcwatch.ui.base.repository.device.OTAFileStatus();
                oTAFileStatus.setOtaSuccess(true);
                com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this._uiState.postValue(oTAFileStatus);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.OTAFileStatusEvent(2, 100, true, ""));
                return;
            }
            com.qcwireless.qcwatch.ui.device.dfu.vm.WatchFileDismissViewModel.this.sendFile();
        }
    }
}
