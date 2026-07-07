package com.qcwireless.qcwatch.ui.device.vm;

/* compiled from: DeviceViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u001f !B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0011J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_picUiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel$DevicePictureUI;", "_uiState", "Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel$DeviceFragmentUI;", "picUiState", "Landroidx/lifecycle/LiveData;", "getPicUiState", "()Landroidx/lifecycle/LiveData;", "uiState", "getUiState", "checkOta", "", "createGlideTask", "Lcom/liulishuo/okdownload/DownloadTask;", "url", "", "fileName", "createTask", "devicePicture", "hardwareVersion", "init", "saveDeviceDfuInformation", "firmwareOtaResp", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/FirmwareOtaResp;", "unBindDevice", "DeviceFragmentUI", "DevicePictureUI", "MyReceiver", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI> _picUiState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;

    public DeviceViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._picUiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI> getPicUiState() {
        return this._picUiState;
    }

    public final void init() {
        android.content.IntentFilter intentFilter = com.oudmon.ble.base.bluetooth.BleAction.getIntentFilter();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).registerReceiver(new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.MyReceiver(), intentFilter);
    }

    public final void unBindDevice() {
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().disconnectRtkSPP();
        com.oudmon.ble.base.bluetooth.DeviceManager.getInstance().reSet();
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setGpsLocationTime(0L);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastDeviceAddress(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddress());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setServerMarketSize(0);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceName("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setDeviceAddress("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHwVersion("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setFmVersion("");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setRtkMcuSupport(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMusicSupport(false);
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setLastCollectionTime(0L);
        com.qcwireless.qcwatch.base.pref.PreUtil.putString(com.qcwireless.qcwatch.base.pref.PreUtil.Action_Device_Address, "");
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMaxWatchFace(6);
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().endAndRelease();
        com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().unBindDevice();
        com.qcwireless.qcwatch.QJavaApplication.getInstance().clear();
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnUiDelay(this, com.qcwireless.qcwatch.ui.home.gps.service.TrackingService.Constant.FASTEST_UPDATE_INTERVAL, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$unBindDevice$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel deviceViewModel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceViewModel, "$this$ktxRunOnUiDelay");
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeSystemBle();
                com.oudmon.ble.base.scan.BleScannerHelper.getInstance().removeMacSystemBond(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getClassicBluetoothMac());
            }
        });
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.UnbindDeviceEvent());
        new com.qcwireless.qcwatch.ui.base.util.NotificationUtils(com.qcwireless.qcwatch.QJavaApplication.getInstance().getApplication()).initBandNotification();
    }

    public final void checkOta() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$checkOta$1(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveDeviceDfuInformation(com.qcwireless.qcwatch.ui.base.bean.response.device.FirmwareOtaResp firmwareOtaResp) {
        com.qcwireless.qcwatch.ui.home.healthy.bean.DFUInformationBean dFUInformationBean = new com.qcwireless.qcwatch.ui.home.healthy.bean.DFUInformationBean();
        dFUInformationBean.setHardwareVersion(firmwareOtaResp.getHardwareVersion());
        dFUInformationBean.setLastVersion(firmwareOtaResp.getVersion());
        if (firmwareOtaResp.getIsEnforceUpdate().length() == 0) {
            dFUInformationBean.setEnforceUpdate(1);
        } else {
            dFUInformationBean.setEnforceUpdate(java.lang.Integer.parseInt(firmwareOtaResp.getIsEnforceUpdate()));
        }
        dFUInformationBean.setOpenOrNot(firmwareOtaResp.getOpenOrNot());
        dFUInformationBean.setDownloadUrl(firmwareOtaResp.getDownloadUrl());
        if (dFUInformationBean.getLastVersion().length() > 0) {
            int openOrNot = dFUInformationBean.getOpenOrNot();
            int isEnforceUpdate = dFUInformationBean.getIsEnforceUpdate();
            boolean development = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDevelopment();
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(development));
            if (development) {
                if (openOrNot == 3) {
                    this._uiState.postValue(new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI(2, isEnforceUpdate, true, 0));
                    return;
                } else {
                    this._uiState.postValue(new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI(2, isEnforceUpdate, false, 0));
                    return;
                }
            }
            if (openOrNot == 2) {
                this._uiState.postValue(new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI(2, isEnforceUpdate, true, 0));
                return;
            } else {
                this._uiState.postValue(new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI(2, isEnforceUpdate, false, 0));
                return;
            }
        }
        this._uiState.postValue(new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI(2, 1, false, -1));
    }

    public final void devicePicture(java.lang.String hardwareVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel$devicePicture$1(this, hardwareVersion, null), 3, (java.lang.Object) null);
    }

    private final com.liulishuo.okdownload.DownloadTask createTask(java.lang.String url, java.lang.String fileName) {
        com.liulishuo.okdownload.DownloadTask build = new com.liulishuo.okdownload.DownloadTask.Builder(url, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getBinDirFile()).setFilename(fileName).setMinIntervalMillisCallbackProcess(64).setPassIfAlreadyCompleted(false).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder(url, parentFile)…lse)\n            .build()");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.liulishuo.okdownload.DownloadTask createGlideTask(java.lang.String url, java.lang.String fileName) {
        com.liulishuo.okdownload.DownloadTask build = new com.liulishuo.okdownload.DownloadTask.Builder(url, com.qcwireless.qcwatch.base.utils.FileUtils.INSTANCE.getGuideDirFile()).setFilename(fileName).setMinIntervalMillisCallbackProcess(64).setPassIfAlreadyCompleted(false).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder(url, parentFile)…lse)\n            .build()");
        return build;
    }

    /* compiled from: DeviceViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel$MyReceiver;", "Lcom/oudmon/ble/base/bluetooth/QCBluetoothCallbackCloneReceiver;", "(Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel;)V", "connectStatue", "", "device", "Landroid/bluetooth/BluetoothDevice;", "connected", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyReceiver extends com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver {
        public MyReceiver() {
        }

        @Override // com.oudmon.ble.base.bluetooth.QCBluetoothCallbackCloneReceiver
        public void connectStatue(android.bluetooth.BluetoothDevice device, boolean connected) {
            if (device == null || device.getName() == null) {
                return;
            }
            androidx.lifecycle.MutableLiveData mutableLiveData = com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.this._uiState;
            java.lang.String name = device.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "device.name");
            java.lang.String address = device.getAddress();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(address, "device.address");
            mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DeviceFragmentUI(1, connected, name, address));
        }
    }

    /* compiled from: DeviceViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel$DevicePictureUI;", "", "url", "", "localUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getLocalUrl", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DevicePictureUI {
        private final java.lang.String localUrl;
        private final java.lang.String url;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI copy$default(com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI devicePictureUI, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = devicePictureUI.url;
            }
            if ((i & 2) != 0) {
                str2 = devicePictureUI.localUrl;
            }
            return devicePictureUI.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLocalUrl() {
            return this.localUrl;
        }

        public final com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI copy(java.lang.String url, java.lang.String localUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localUrl, "localUrl");
            return new com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI(url, localUrl);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI devicePictureUI = (com.qcwireless.qcwatch.ui.device.vm.DeviceViewModel.DevicePictureUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, devicePictureUI.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.localUrl, devicePictureUI.localUrl);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.localUrl.hashCode();
        }

        public java.lang.String toString() {
            return "DevicePictureUI(url=" + this.url + ", localUrl=" + this.localUrl + ')';
        }

        public DevicePictureUI(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "localUrl");
            this.url = str;
            this.localUrl = str2;
        }

        public final java.lang.String getLocalUrl() {
            return this.localUrl;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }
    }

    /* compiled from: DeviceViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/vm/DeviceViewModel$DeviceFragmentUI;", "", "refreshType", "", "dfuType", "showDfuButton", "", "retCode", "(IIZI)V", "connect", "deviceName", "", "deviceAddress", "(IZLjava/lang/String;Ljava/lang/String;)V", "getConnect", "()Z", "setConnect", "(Z)V", "getDeviceAddress", "()Ljava/lang/String;", "setDeviceAddress", "(Ljava/lang/String;)V", "getDeviceName", "setDeviceName", "getDfuType", "()I", "setDfuType", "(I)V", "getRefreshType", "setRefreshType", "getRetCode", "setRetCode", "getShowDfuButton", "setShowDfuButton", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DeviceFragmentUI {
        private boolean connect;
        private java.lang.String deviceAddress;
        private java.lang.String deviceName;
        private int dfuType;
        private int refreshType;
        private int retCode;
        private boolean showDfuButton;

        public final int getRefreshType() {
            return this.refreshType;
        }

        public final void setRefreshType(int i) {
            this.refreshType = i;
        }

        public final boolean getConnect() {
            return this.connect;
        }

        public final void setConnect(boolean z) {
            this.connect = z;
        }

        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        public final void setDeviceName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceName = str;
        }

        public final java.lang.String getDeviceAddress() {
            return this.deviceAddress;
        }

        public final void setDeviceAddress(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceAddress = str;
        }

        public final int getDfuType() {
            return this.dfuType;
        }

        public final void setDfuType(int i) {
            this.dfuType = i;
        }

        public final boolean getShowDfuButton() {
            return this.showDfuButton;
        }

        public final void setShowDfuButton(boolean z) {
            this.showDfuButton = z;
        }

        public final int getRetCode() {
            return this.retCode;
        }

        public final void setRetCode(int i) {
            this.retCode = i;
        }

        public DeviceFragmentUI(int i, int i2, boolean z, int i3) {
            this.deviceName = "--";
            this.deviceAddress = "--";
            this.retCode = -1;
            this.refreshType = i;
            this.dfuType = i2;
            this.showDfuButton = z;
            this.retCode = i3;
        }

        public DeviceFragmentUI(int i, boolean z, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deviceName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "deviceAddress");
            this.deviceName = "--";
            this.deviceAddress = "--";
            this.retCode = -1;
            this.refreshType = i;
            this.connect = z;
            this.deviceName = str;
            this.deviceAddress = str2;
        }
    }
}
