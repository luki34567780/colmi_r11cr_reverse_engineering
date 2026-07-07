package com.qcwireless.qcwatch.ui.device.dfu.vm;

/* compiled from: DeviceFirmwareUpdateViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001f B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J \u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "otaRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/OTARepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel$FirmwareUI;", "_updateUiInfo", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/FirmwareOtaResp;", "callback", "Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel$QueueBinListener;", "task", "Lcom/liulishuo/okdownload/DownloadTask;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "updateUiInfo", "getUpdateUiInfo", "cancelTask", "", "checkOta", "checkOtaChina", "createTask", "url", "", "fileName", "tag", "saveDeviceDfuInformation", "firmwareOtaResp", "FirmwareUI", "QueueBinListener", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceFirmwareUpdateViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI> _uiState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp> _updateUiInfo;
    private final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.QueueBinListener callback;
    private final com.qcwireless.qcwatch.ui.base.repository.device.OTARepository otaRepository;
    private com.liulishuo.okdownload.DownloadTask task;

    public DeviceFirmwareUpdateViewModel(com.qcwireless.qcwatch.ui.base.repository.device.OTARepository oTARepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTARepository, "otaRepository");
        this.otaRepository = oTARepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.callback = new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.QueueBinListener();
        this._updateUiInfo = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp> getUpdateUiInfo() {
        return this._updateUiInfo;
    }

    public final void checkOta() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel$checkOta$1(this, null), 3, (java.lang.Object) null);
    }

    public final void checkOtaChina() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel$checkOtaChina$1(this, null), 3, (java.lang.Object) null);
    }

    public final void saveDeviceDfuInformation(com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp firmwareOtaResp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareOtaResp, "firmwareOtaResp");
        com.qcwireless.qcwatch.ui.home.healthy.bean.DFUInformationBean dFUInformationBean = new com.qcwireless.qcwatch.ui.home.healthy.bean.DFUInformationBean();
        dFUInformationBean.setHardwareVersion(firmwareOtaResp.getHardwareVersion());
        dFUInformationBean.setLastVersion(firmwareOtaResp.getVersion());
        if (firmwareOtaResp.getIsEnforceUpdate().length() == 0) {
            dFUInformationBean.setEnforceUpdate(1);
        }
        dFUInformationBean.setOpenOrNot(firmwareOtaResp.getOpenOrNot());
        dFUInformationBean.setDownloadUrl(firmwareOtaResp.getDownloadUrl());
        if (dFUInformationBean.getLastVersion().length() > 0) {
            int openOrNot = dFUInformationBean.getOpenOrNot();
            boolean development = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDevelopment();
            java.lang.String str = dFUInformationBean.getLastVersion() + ".bin";
            com.liulishuo.okdownload.DownloadTask downloadTask = null;
            if (development) {
                if (openOrNot == 3) {
                    com.liulishuo.okdownload.DownloadTask createTask = createTask(dFUInformationBean.getDownloadUrl(), str, str);
                    this.task = createTask;
                    if (createTask == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("task");
                    } else {
                        downloadTask = createTask;
                    }
                    downloadTask.enqueue(this.callback);
                    return;
                }
                return;
            }
            if (openOrNot == 2) {
                com.liulishuo.okdownload.DownloadTask createTask2 = createTask(dFUInformationBean.getDownloadUrl(), str, str);
                this.task = createTask2;
                if (createTask2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    downloadTask = createTask2;
                }
                downloadTask.enqueue(this.callback);
            }
        }
    }

    public final void cancelTask() {
        try {
            com.liulishuo.okdownload.DownloadTask downloadTask = this.task;
            if (downloadTask == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("task");
                downloadTask = null;
            }
            downloadTask.cancel();
        } catch (java.lang.Exception unused) {
        }
    }

    /* compiled from: DeviceFirmwareUpdateViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel$FirmwareUI;", "", "progressBar", "", "fileName", "", "success", "", "(JLjava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getProgressBar", "()J", "setProgressBar", "(J)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "component3", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class FirmwareUI {
        private java.lang.String fileName;
        private long progressBar;
        private boolean success;

        public FirmwareUI() {
            this(0L, null, false, 7, null);
        }

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI copy$default(com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI firmwareUI, long j, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = firmwareUI.progressBar;
            }
            if ((i & 2) != 0) {
                str = firmwareUI.fileName;
            }
            if ((i & 4) != 0) {
                z = firmwareUI.success;
            }
            return firmwareUI.copy(j, str, z);
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

        public final com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI copy(long progressBar, java.lang.String fileName, boolean success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
            return new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI(progressBar, fileName, success);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI firmwareUI = (com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI) other;
            return this.progressBar == firmwareUI.progressBar && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, firmwareUI.fileName) && this.success == firmwareUI.success;
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
            return "FirmwareUI(progressBar=" + this.progressBar + ", fileName=" + this.fileName + ", success=" + this.success + ')';
        }

        public FirmwareUI(long j, java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fileName");
            this.progressBar = j;
            this.fileName = str;
            this.success = z;
        }

        public /* synthetic */ FirmwareUI(long j, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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

    private final com.liulishuo.okdownload.DownloadTask createTask(java.lang.String url, java.lang.String fileName, java.lang.String tag) {
        com.liulishuo.okdownload.DownloadTask build = new com.liulishuo.okdownload.DownloadTask.Builder(url, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getBinDirFile()).setFilename(fileName).setMinIntervalMillisCallbackProcess(64).setPassIfAlreadyCompleted(false).setPriority(11).setReadBufferSize(8192).build();
        build.setTag(tag);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "task");
        return build;
    }

    /* compiled from: DeviceFirmwareUpdateViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0017"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel$QueueBinListener;", "Lcom/liulishuo/okdownload/core/listener/DownloadListener1;", "(Lcom/qcwireless/qcwatch/ui/device/dfu/vm/DeviceFirmwareUpdateViewModel;)V", "connected", "", "task", "Lcom/liulishuo/okdownload/DownloadTask;", "blockCount", "", "currentOffset", "", "totalLength", "progress", "retry", "cause", "Lcom/liulishuo/okdownload/core/cause/ResumeFailedCause;", "taskEnd", "Lcom/liulishuo/okdownload/core/cause/EndCause;", "realCause", "Ljava/lang/Exception;", "model", "Lcom/liulishuo/okdownload/core/listener/assist/Listener1Assist$Listener1Model;", "taskStart", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class QueueBinListener extends com.liulishuo.okdownload.core.listener.DownloadListener1 {
        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void connected(com.liulishuo.okdownload.DownloadTask task, int blockCount, long currentOffset, long totalLength) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void retry(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.ResumeFailedCause cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void taskEnd(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.cause.EndCause cause, java.lang.Exception realCause, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void taskStart(com.liulishuo.okdownload.DownloadTask task, com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Model model) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        }

        public QueueBinListener() {
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
        public void progress(com.liulishuo.okdownload.DownloadTask task, long currentOffset, long totalLength) {
            int i;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "下载进度:" + currentOffset + "--" + totalLength);
            long j = (((long) 100) * currentOffset) / totalLength;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Long.valueOf(j));
            if (currentOffset == totalLength || (i = (int) j) == 100) {
                com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.this._uiState.postValue(new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI(100L, task.getTag().toString(), true));
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.OTAFileStatusEvent(3, 100, true, task.getTag().toString()));
            } else {
                com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.this._uiState.postValue(new com.qcwireless.qcwatch.ui.device.dfu.vm.DeviceFirmwareUpdateViewModel.FirmwareUI(j, task.getTag().toString(), false));
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.OTAFileStatusEvent(3, i, false, task.getTag().toString()));
            }
        }
    }
}
