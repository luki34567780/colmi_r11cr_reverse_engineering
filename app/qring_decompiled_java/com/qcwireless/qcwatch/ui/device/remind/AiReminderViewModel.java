package com.qcwireless.qcwatch.ui.device.remind;

/* compiled from: AiReminderViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0007J6\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\t2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fH\u0002J\u0010\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u0007H\u0002J\u0018\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u0007H\u0002J\u0010\u00105\u001a\u00020 2\u0006\u00102\u001a\u00020\u0007H\u0002J\u0016\u00106\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0007J\u0016\u00107\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001b¨\u00068"}, d2 = {"Lcom/qcwireless/qcwatch/ui/device/remind/AiReminderViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "alarmList", "", "Lcom/qcwireless/qcwatch/ui/base/bean/device/AlarmBean;", "getAlarmList", "()Ljava/util/List;", "drinkIndexMap", "", "", "max", "getMax", "()I", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "unitList", "Lcom/qcwireless/qcwatch/base/dialog/bean/ListDataBean;", "getUnitList", "setUnitList", "(Ljava/util/List;)V", "weatherUnitList", "getWeatherUnitList", "setWeatherUnitList", "execAlarm", "", "setting", "execUnit", "execWeather", "initData", "mac", "", "initDialogData", "it", "parseAlarm", "total", "list", "Lcom/oudmon/ble/base/communication/bigData/AlarmNewEntity$AlarmBean;", "data", "", "alarmLength", "alarmStart", "readAlarmOnly", "deviceSetting", "readDrinkData", "index", "readLongSit", "saveDeviceSetting", "saveReminder", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class AiReminderViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _uiState;
    private final java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> alarmList;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> drinkIndexMap;
    private final int max;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> unitList;
    private java.util.List<com.qcwireless.qcwatch.base.dialog.bean.ListDataBean> weatherUnitList;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execUnit$lambda-4, reason: not valid java name */
    public static final void m869execUnit$lambda4(com.oudmon.ble.base.communication.rsp.TimeFormatRsp timeFormatRsp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execWeather$lambda-3, reason: not valid java name */
    public static final void m870execWeather$lambda3(com.oudmon.ble.base.communication.rsp.DegreeSwitchRsp degreeSwitchRsp) {
    }

    public AiReminderViewModel(com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.deviceSettingRepository = deviceSettingRepository;
        this.alarmList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.drinkIndexMap = new java.util.LinkedHashMap();
        this.max = 10;
        this.unitList = new java.util.ArrayList();
        this.weatherUnitList = new java.util.ArrayList();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> getAlarmList() {
        return this.alarmList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getUiState() {
        return this._uiState;
    }

    public final int getMax() {
        return this.max;
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

    public final void initDialogData(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this.unitList.clear();
        this.weatherUnitList.clear();
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
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$initData$1(this, mac, null), 3, (java.lang.Object) null);
        this.drinkIndexMap.clear();
        for (int i = 0; i < 8; i++) {
            this.drinkIndexMap.put(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i));
        }
        launchOnUI(new com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$initData$2(this, mac, null));
    }

    private final void readDrinkData(final int index, final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        this.drinkIndexMap.remove(java.lang.Integer.valueOf(index));
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadDrinkAlarmReq(index), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.m872readDrinkData$lambda0(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, index, this, (com.oudmon.ble.base.communication.rsp.ReadAlarmRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readDrinkData$lambda-0, reason: not valid java name */
    public static final void m872readDrinkData$lambda0(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, int i, com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel, com.oudmon.ble.base.communication.rsp.ReadAlarmRsp readAlarmRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderViewModel, "this$0");
        com.oudmon.ble.base.communication.entity.AlarmEntity alarmEntity = readAlarmRsp.getAlarmEntity();
        com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean drinkBean = new com.qcwireless.qcwatch.ui.base.bean.device.DrinkBean("", (alarmEntity.getHour() * 60) + alarmEntity.getMinute(), alarmEntity.isEnable());
        if (alarmEntity.isEnable()) {
            deviceSetting.setDrinkSwitch(true);
        }
        if (alarmEntity.getWeekMask() == -1) {
            deviceSetting.setDrinkWeek(0);
            deviceSetting.setDrinkSwitch(false);
        } else {
            deviceSetting.setDrinkWeek(alarmEntity.getWeekMask());
        }
        if (alarmEntity.getWeekMask() == 0) {
            deviceSetting.setDrinkSwitch(false);
        }
        deviceSetting.getDrinkArray()[i] = drinkBean;
        if (!aiReminderViewModel.drinkIndexMap.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.Integer>> it = aiReminderViewModel.drinkIndexMap.entrySet().iterator();
            if (it.hasNext()) {
                aiReminderViewModel.readDrinkData(it.next().getKey().intValue(), deviceSetting);
                return;
            }
            return;
        }
        aiReminderViewModel.saveReminder(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), deviceSetting);
        aiReminderViewModel._uiState.postValue(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void readAlarmOnly(final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        deviceSetting.getAlarmList().clear();
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().readAlarm(new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$$ExternalSyntheticLambda4
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public final void parseData(int i, byte[] bArr) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.m871readAlarmOnly$lambda1(com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.this, deviceSetting, i, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readAlarmOnly$lambda-1, reason: not valid java name */
    public static final void m871readAlarmOnly$lambda1(com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, int i, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderViewModel, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        if (i == 44) {
            if (com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 6, 7)) == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.oudmon.ble.base.communication.bigData.AlarmNewEntity alarmNewEntity = new com.oudmon.ble.base.communication.bigData.AlarmNewEntity();
                alarmNewEntity.setTotal(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 7, 8)));
                if (alarmNewEntity.getTotal() > 0) {
                    int total = alarmNewEntity.getTotal();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArr, "data");
                    aiReminderViewModel.parseAlarm(total, arrayList, bArr, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 8, 9)), 8);
                    int i2 = 0;
                    for (com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean alarmBean : arrayList) {
                        int i3 = i2 + 1;
                        if (alarmBean.getContent() == null) {
                            alarmBean.setContent("");
                        }
                        int min = alarmBean.getMin();
                        java.lang.String content = alarmBean.getContent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(content, "item.content");
                        deviceSetting.getAlarmList().add(new com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean(i2, min, content, (alarmBean.getRepeatAndEnable() & com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4) == 128, alarmBean.getRepeatAndEnable(), true));
                        i2 = i3;
                    }
                } else {
                    deviceSetting.setAlarmList(new java.util.ArrayList());
                }
            }
            aiReminderViewModel.readLongSit(deviceSetting);
        }
    }

    private final void parseAlarm(int total, java.util.List<com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean> list, byte[] data, int alarmLength, int alarmStart) {
        com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean alarmBean = new com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean();
        alarmBean.setAlarmLength(alarmLength);
        int i = alarmStart + 2;
        alarmBean.setRepeatAndEnable(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(kotlin.collections.ArraysKt.copyOfRange(data, alarmStart + 1, i)));
        int i2 = alarmStart + 4;
        alarmBean.setMin(com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(kotlin.collections.ArraysKt.copyOfRange(data, i, i2)));
        if (alarmLength > 4) {
            byte[] copyOfRange = kotlin.collections.ArraysKt.copyOfRange(data, i2, alarmStart + alarmLength);
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
            alarmBean.setContent(new java.lang.String(copyOfRange, defaultCharset));
        }
        list.add(alarmBean);
        if (list.size() < total) {
            int i3 = alarmStart + alarmLength;
            parseAlarm(total, list, data, com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(kotlin.collections.ArraysKt.copyOfRange(data, i3, i3 + 1)), i3);
        }
    }

    private final void readLongSit(final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting) {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq(com.oudmon.ble.base.communication.Constants.CMD_GET_SIT_LONG), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.m873readLongSit$lambda2(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting.this, this, (com.oudmon.ble.base.communication.rsp.ReadSitLongRsp) baseRspCmd);
            }
        });
        saveReminder(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), deviceSetting);
        this._uiState.postValue(deviceSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: readLongSit$lambda-2, reason: not valid java name */
    public static final void m873readLongSit$lambda2(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting deviceSetting, com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel, com.oudmon.ble.base.communication.rsp.ReadSitLongRsp readSitLongRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSetting, "$deviceSetting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderViewModel, "this$0");
        deviceSetting.setLongSitSwitch(readSitLongRsp.isEnable());
        com.oudmon.ble.base.communication.entity.StartEndTimeEntity startEndTimeEntity = readSitLongRsp.getStartEndTimeEntity();
        deviceSetting.setLongSitStart((startEndTimeEntity.getStartHour() * 60) + startEndTimeEntity.getStartMinute());
        deviceSetting.setLongSitEnd((startEndTimeEntity.getEndHour() * 60) + startEndTimeEntity.getEndMinute());
        deviceSetting.setLongSitDuring(readSitLongRsp.getCycle());
        deviceSetting.setLongSitWeek(readSitLongRsp.getWeekMask());
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.Integer>> it = aiReminderViewModel.drinkIndexMap.entrySet().iterator();
        if (it.hasNext()) {
            aiReminderViewModel.readDrinkData(it.next().getKey().intValue(), deviceSetting);
        }
    }

    public final void saveReminder(final java.lang.String mac, final com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$saveReminder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel aiReminderViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aiReminderViewModel, "$this$ktxRunOnBgSingle");
                deviceSettingRepository = aiReminderViewModel.deviceSettingRepository;
                deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
            }
        });
    }

    public final void execWeather(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.DegreeSwitchReq.getWriteInstance(true, setting.getWeatherFormat() == 0), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$$ExternalSyntheticLambda2
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.m870execWeather$lambda3((com.oudmon.ble.base.communication.rsp.DegreeSwitchRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void execUnit(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.TimeFormatReq.getWriteInstance(setting.getTimeFormat() == 0, (byte) setting.getMetricUnit()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel$$ExternalSyntheticLambda3
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.device.remind.AiReminderViewModel.m869execUnit$lambda4((com.oudmon.ble.base.communication.rsp.TimeFormatRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void saveDeviceSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void execAlarm(com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.bigData.AlarmNewEntity alarmNewEntity = new com.oudmon.ble.base.communication.bigData.AlarmNewEntity();
        java.util.List<com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean> alarmList = setting.getAlarmList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.qcwireless.qcwatch.ui.base.bean.device.AlarmBean alarmBean : alarmList) {
            if (alarmBean.getDefault()) {
                com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean alarmBean2 = new com.oudmon.ble.base.communication.bigData.AlarmNewEntity.AlarmBean();
                alarmBean2.setMin(alarmBean.getTime());
                alarmBean2.setContent(alarmBean.getTitle());
                java.lang.String content = alarmBean2.getContent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(content, "entity.content");
                alarmBean2.setAlarmLength(kotlin.text.StringsKt.encodeToByteArray(content).length + 4);
                if (alarmBean.getSwitch()) {
                    alarmBean2.setRepeatAndEnable(alarmBean.getWeek() | com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4);
                } else {
                    alarmBean2.setRepeatAndEnable(alarmBean.getWeek() & (-129));
                }
                arrayList.add(alarmBean2);
            }
        }
        alarmNewEntity.setTotal(arrayList.size());
        alarmNewEntity.setData(arrayList);
        if (arrayList.size() > 0) {
            com.oudmon.ble.base.communication.LargeDataHandler.getInstance().writeAlarm(alarmNewEntity);
            this._uiState.postValue(setting);
        } else {
            alarmNewEntity.setTotal(0);
            com.oudmon.ble.base.communication.LargeDataHandler.getInstance().writeAlarm(alarmNewEntity);
        }
    }
}
