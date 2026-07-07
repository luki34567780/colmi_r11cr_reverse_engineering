package com.qcwireless.qcwatch.ui.device.vm;

/* compiled from: DeviceSettingViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u001aJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0007J\u0016\u0010&\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u0007J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0006\u0010,\u001a\u00020\u001aJ\u000e\u0010-\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006."}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/vm/DeviceSettingViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "timeList", "", "Lcom/qcwireless/qcwatch/base/dialog/bean/ListDataBean;", "getTimeList", "()Ljava/util/List;", "setTimeList", "(Ljava/util/List;)V", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "unitList", "getUnitList", "setUnitList", "weatherUnitList", "getWeatherUnitList", "setWeatherUnitList", "execBO2", "", "setting", "execBpCmd", "execGesture", "execUnit", "execWeather", "findWatch", "initData", "mac", "", "initDialogData", "it", "saveDeviceSetting", "deviceSetting", "startSyncDeviceSettingByType", "type", "", "startSyncDeviceSettings", "syncDeviceSettings", "syncDeviceSettingsFromDevice", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DeviceSettingViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> timeList;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> unitList;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> weatherUnitList;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execBO2$lambda-1, reason: not valid java name */
    public static final void m899execBO2$lambda1(com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp bloodOxygenSettingRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execBpCmd$lambda-4, reason: not valid java name */
    public static final void m900execBpCmd$lambda4(com.oudmon.ble.base.communication.rsp.BpSettingRsp bpSettingRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execGesture$lambda-0, reason: not valid java name */
    public static final void m901execGesture$lambda0(com.oudmon.ble.base.communication.rsp.PalmScreenRsp palmScreenRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execUnit$lambda-3, reason: not valid java name */
    public static final void m902execUnit$lambda3(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execWeather$lambda-2, reason: not valid java name */
    public static final void m903execWeather$lambda2(com.oudmon.ble.base.communication.rsp.DegreeSwitchRsp degreeSwitchRsp) {
    }

    public DeviceSettingViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.unitList = new java.util.ArrayList();
        this.weatherUnitList = new java.util.ArrayList();
        this.timeList = new java.util.ArrayList();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getUiState() {
        return this._uiState;
    }

    public final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> getUnitList() {
        return this.unitList;
    }

    public final void setUnitList(java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.unitList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> getWeatherUnitList() {
        return this.weatherUnitList;
    }

    public final void setWeatherUnitList(java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.weatherUnitList = list;
    }

    public final java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> getTimeList() {
        return this.timeList;
    }

    public final void setTimeList(java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.timeList = list;
    }

    public final void saveDeviceSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$initData$1(this, mac, null), 3, (java.lang.Object) null);
    }

    public final void initDialogData(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this.unitList.clear();
        this.weatherUnitList.clear();
        this.timeList.clear();
        if (it.getMetricUnit() == 0) {
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_35), true));
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_36), false));
        } else {
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_35), false));
            this.unitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_36), true));
        }
        if (it.getWeatherFormat() == 0) {
            this.weatherUnitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_27), true));
            this.weatherUnitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_28), false));
        } else {
            this.weatherUnitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_27), false));
            this.weatherUnitList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_28), true));
        }
        if (it.getTimeFormat() == 0) {
            this.timeList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_26), true));
            this.timeList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_25), false));
        } else {
            this.timeList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_26), false));
            this.timeList.add(new com.qcwireless.qcwatch.base.dialog.bean.ListDataBean(com.qcwireless.qcwatch.base.view.GlobalKt.getString(com.qcwireless.qcwatch.R.string.qc_text_25), true));
        }
    }

    public final void execGesture(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PalmScreenReq.getWriteInstance(setting.getWristSense(), true), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda4
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m901execGesture$lambda0((com.oudmon.ble.base.communication.rsp.PalmScreenRsp) baseRspCmd);
            }
        });
        launchOnUI(new com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$execGesture$2(this, setting, null));
    }

    public final void execBO2(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.BloodOxygenSettingReq.getWriteInstance(setting.getBo2Detection()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m899execBO2$lambda1((com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void findWatch() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.FindDeviceReq());
    }

    public final void execWeather(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.DegreeSwitchReq.getWriteInstance(true, setting.getWeatherFormat() == 0), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda3
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m903execWeather$lambda2((com.oudmon.ble.base.communication.rsp.DegreeSwitchRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void execUnit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(setting.getTimeFormat() == 0, (byte) setting.getMetricUnit()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda5
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m902execUnit$lambda3((com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void execBpCmd(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity = new com.oudmon.ble.base.communication.entity.StartEndTimeEntity(0, 0, 23, 59);
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.BpSettingReq.getWriteInstance(setting.getBpSwitch(), startEndTimeEntity, 60), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda2
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m900execBpCmd$lambda4((com.oudmon.ble.base.communication.rsp.BpSettingRsp) baseRspCmd);
            }
        });
    }

    public final void syncDeviceSettings() {
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getHwVersion().length() == 0) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadHwRequest());
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getFmVersion().length() == 0) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().execReadCmd(com.oudmon.ble.base.communication.CommandHandle.getInstance().getReadFmRequest());
        }
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 3), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda14
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m913syncDeviceSettings$lambda5((com.oudmon.ble.base.communication.rsp.BatteryRsp) baseRspCmd);
            }
        });
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$syncDeviceSettings$2(this, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSettings$lambda-5, reason: not valid java name */
    public static final void m913syncDeviceSettings$lambda5(com.oudmon.ble.base.communication.rsp.BatteryRsp batteryRsp) {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(batteryRsp.getBatteryValue()));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setBattery(java.lang.String.valueOf(batteryRsp.getBatteryValue()));
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSyncDeviceSettings(final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.HeartRateSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda10
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m909startSyncDeviceSettings$lambda6(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.BloodOxygenSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m910startSyncDeviceSettings$lambda7(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.BpSettingReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda6
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m911startSyncDeviceSettings$lambda8(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.BpSettingRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PalmScreenReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda11
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m912startSyncDeviceSettings$lambda9(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.PalmScreenRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.DegreeSwitchReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda7
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m906startSyncDeviceSettings$lambda10(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.DegreeSwitchRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda12
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m907startSyncDeviceSettings$lambda11(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.DndReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda8
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m908startSyncDeviceSettings$lambda12(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.DndRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettings$lambda-6, reason: not valid java name */
    public static final void m909startSyncDeviceSettings$lambda6(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp heartRateSettingRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        deviceSetting.setHrDetection(heartRateSettingRsp.isEnable());
        deviceSetting.setHrInterval(heartRateSettingRsp.getHeartInterval());
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Integer.valueOf(heartRateSettingRsp.getHeartInterval()));
        if (heartRateSettingRsp.getHeartInterval() > 0) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHeartRateInterval(true);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        } else {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setHeartRateInterval(false);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        }
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettings$lambda-7, reason: not valid java name */
    public static final void m910startSyncDeviceSettings$lambda7(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp bloodOxygenSettingRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        deviceSetting.setBo2Detection(bloodOxygenSettingRsp.isEnable());
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettings$lambda-8, reason: not valid java name */
    public static final void m911startSyncDeviceSettings$lambda8(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.BpSettingRsp bpSettingRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        deviceSetting.setBpSwitch(bpSettingRsp.isEnable());
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettings$lambda-9, reason: not valid java name */
    public static final void m912startSyncDeviceSettings$lambda9(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.PalmScreenRsp palmScreenRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        deviceSetting.setWristSense(palmScreenRsp.isEnable());
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettings$lambda-10, reason: not valid java name */
    public static final void m906startSyncDeviceSettings$lambda10(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.DegreeSwitchRsp degreeSwitchRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(degreeSwitchRsp.isCelsius()));
        if (degreeSwitchRsp.isCelsius()) {
            deviceSetting.setWeatherFormat(0);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setTemperature(false);
        } else {
            deviceSetting.setWeatherFormat(1);
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setTemperature(true);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettings$lambda-11, reason: not valid java name */
    public static final void m907startSyncDeviceSettings$lambda11(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        if (timeFormatRsp.is24()) {
            deviceSetting.setTimeFormat(0);
        } else {
            deviceSetting.setTimeFormat(1);
        }
        if (timeFormatRsp.isMetric()) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(true);
            deviceSetting.setMetricUnit(0);
        } else {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(false);
            deviceSetting.setMetricUnit(1);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettings$lambda-12, reason: not valid java name */
    public static final void m908startSyncDeviceSettings$lambda12(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.DndRsp dndRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, dndRsp);
        if (dndRsp == null || dndRsp.getDndEntity() == null) {
            return;
        }
        deviceSetting.setDisturbSwitch(dndRsp.isEnable());
        deviceSetting.setDisturbStart((dndRsp.getDndEntity().getStartHour() * 60) + dndRsp.getDndEntity().getStartMinute());
        deviceSetting.setDisturbEnd((dndRsp.getDndEntity().getEndHour() * 60) + dndRsp.getDndEntity().getEndMinute());
        deviceSetting.setDisturbManualSwitch(dndRsp.isManualDND());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setManualDND(dndRsp.isManualDND());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
        deviceSettingViewModel._uiState.postValue(deviceSetting);
    }

    public final void saveDeviceSetting(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "deviceSetting");
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(deviceSetting)));
    }

    public final void syncDeviceSettingsFromDevice(int type) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$syncDeviceSettingsFromDevice$1(this, type, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettingByType$lambda-13, reason: not valid java name */
    public static final void m904startSyncDeviceSettingByType$lambda13(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.DndRsp dndRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, dndRsp);
        if (dndRsp == null || dndRsp.getDndEntity() == null) {
            return;
        }
        deviceSetting.setDisturbSwitch(dndRsp.isEnable());
        deviceSetting.setDisturbStart((dndRsp.getDndEntity().getStartHour() * 60) + dndRsp.getDndEntity().getStartMinute());
        deviceSetting.setDisturbEnd((dndRsp.getDndEntity().getEndHour() * 60) + dndRsp.getDndEntity().getEndMinute());
        deviceSetting.setDisturbManualSwitch(dndRsp.isManualDND());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setManualDND(dndRsp.isManualDND());
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
        deviceSettingViewModel._uiState.postValue(deviceSetting);
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, deviceSetting);
        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSyncDeviceSettingByType(int type, final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        if (type == 9) {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.DndReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda9
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m904startSyncDeviceSettingByType$lambda13(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.DndRsp) baseRspCmd);
                }
            });
        } else {
            if (type != 11) {
                return;
            }
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getReadInstance(), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel$$ExternalSyntheticLambda13
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel.m905startSyncDeviceSettingByType$lambda14(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSyncDeviceSettingByType$lambda-14, reason: not valid java name */
    public static final void m905startSyncDeviceSettingByType$lambda14(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.vm.DeviceSettingViewModel deviceSettingViewModel, com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingViewModel, "this$0");
        if (timeFormatRsp.is24()) {
            deviceSetting.setTimeFormat(0);
        } else {
            deviceSetting.setTimeFormat(1);
        }
        if (timeFormatRsp.isMetric()) {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(true);
            deviceSetting.setMetricUnit(0);
        } else {
            com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().setMetric(false);
            deviceSetting.setMetricUnit(1);
        }
        com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().save();
        deviceSettingViewModel.saveDeviceSetting(deviceSetting);
        deviceSettingViewModel._uiState.postValue(deviceSetting);
    }
}
