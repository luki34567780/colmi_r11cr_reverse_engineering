package com.qcwireless.qcwatch.ui.home.bloodoxgen;

/* compiled from: BloodOxygenViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002-.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u000bJ\u000e\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u000bJ\u000e\u0010(\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u000bJ\u0006\u0010)\u001a\u00020\"J\u0016\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010+\u001a\u00020\tJ\u0006\u0010,\u001a\u00020\"R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00168F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00168F¢\u0006\u0006\u001a\u0004\b \u0010\u0018¨\u0006/"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "bloodOxygenRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_deviceSetting", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "_lastDate", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiDetail", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenViewModel$BloodOxygenDetail;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenViewModel$BloodOxygenUI;", "detailList", "", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/bean/BloodOxyDetailBean;", "getDetailList", "()Ljava/util/List;", "deviceSetting", "Landroidx/lifecycle/LiveData;", "getDeviceSetting", "()Landroidx/lifecycle/LiveData;", "lastDate", "getLastDate", "manualList", "getManualList", "uiDetail", "getUiDetail", "uiState", "getUiState", "initData", "", "mac", "", "queryAppBloodOxygenByDateDetail", "date", "queryBloodOxygenByDate", "queryBloodOxygenByDateDetail", "queryLastData", "saveDeviceSetting", "setting", "syncTodayData", "BloodOxygenDetail", "BloodOxygenUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodOxygenViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _deviceSetting;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail> _uiDetail;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> detailList;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> manualList;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveDeviceSetting$lambda-1, reason: not valid java name */
    public static final void m933saveDeviceSetting$lambda1(com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp bloodOxygenSettingRsp) {
    }

    public BloodOxygenViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenRepository, "bloodOxygenRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.bloodOxygenRepository = bloodOxygenRepository;
        this.deviceSettingRepository = deviceSettingRepository;
        this.detailList = new java.util.ArrayList();
        this.manualList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
        this._uiDetail = new androidx.lifecycle.MutableLiveData<>();
        this._deviceSetting = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> getDetailList() {
        return this.detailList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> getManualList() {
        return this.manualList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail> getUiDetail() {
        return this._uiDetail;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getDeviceSetting() {
        return this._deviceSetting;
    }

    public final void queryBloodOxygenByDate(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$queryBloodOxygenByDate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel bloodOxygenViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenViewModel, "$this$ktxRunOnBgSingle");
                bloodOxygenRepository = bloodOxygenViewModel.bloodOxygenRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean> queryBloodOxygenByDate = bloodOxygenRepository.queryBloodOxygenByDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qc_utils.date.DateUtil.this);
                if (com.qcwireless.qc_utils.date.DateUtil.this.isToday()) {
                    mutableLiveData2 = bloodOxygenViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI(true, queryBloodOxygenByDate));
                } else {
                    mutableLiveData = bloodOxygenViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI(false, queryBloodOxygenByDate));
                }
            }
        });
    }

    public final void queryBloodOxygenByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$queryBloodOxygenByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel bloodOxygenViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenViewModel, "$this$ktxRunOnBgSingle");
                bloodOxygenRepository = bloodOxygenViewModel.bloodOxygenRepository;
                java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> queryBloodOxygenByDateDetail = bloodOxygenRepository.queryBloodOxygenByDateDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = bloodOxygenViewModel._uiDetail;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail(queryBloodOxygenByDateDetail));
            }
        });
    }

    public final void queryAppBloodOxygenByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$queryAppBloodOxygenByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel bloodOxygenViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenViewModel, "$this$ktxRunOnBgSingle");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                bloodOxygenRepository = bloodOxygenViewModel.bloodOxygenRepository;
                for (com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity bloodOxygenManualEntity : bloodOxygenRepository.queryManualBloodOxygenAll(com.qcwireless.qc_utils.date.DateUtil.this)) {
                    arrayList.add(new com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean(bloodOxygenManualEntity.getTimestamp(), bloodOxygenManualEntity.getBloodOxygen(), bloodOxygenManualEntity.getBloodOxygen()));
                }
                mutableLiveData = bloodOxygenViewModel._uiDetail;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail(arrayList));
            }
        });
    }

    public final void syncTodayData() {
        this.bloodOxygenRepository.syncAutoBloodOxygen(0, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$syncTodayData$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel bloodOxygenViewModel = com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$syncTodayData$1$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$syncTodayData$1$1$result$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$syncTodayData$1$1) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$syncTodayData$1$1 bloodOxygenViewModel$syncTodayData$1$1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenViewModel$syncTodayData$1$1, "$this$ktxRunOnBgSingle");
                        com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.this.queryBloodOxygenByDateDetail(new com.qcwireless.qc_utils.date.DateUtil());
                    }
                });
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    public final void queryLastData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$queryLastData$1(this, null), 3, (java.lang.Object) null);
    }

    public final void saveDeviceSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.BloodOxygenSettingReq.getWriteInstance(setting.getBo2Detection()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.m933saveDeviceSetting$lambda1((com.oudmon.ble.base.communication.rsp.BloodOxygenSettingRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel$initData$1(this, mac, null), 3, (java.lang.Object) null);
    }

    /* compiled from: BloodOxygenViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenViewModel$BloodOxygenUI;", "", "today", "", "listData", "", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodOxygenLineChartView$DataBean;", "(ZLjava/util/List;)V", "getListData", "()Ljava/util/List;", "getToday", "()Z", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BloodOxygenUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean> listData;
        private final boolean today;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI copy$default(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI bloodOxygenUI, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = bloodOxygenUI.today;
            }
            if ((i & 2) != 0) {
                list = bloodOxygenUI.listData;
            }
            return bloodOxygenUI.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean> component2() {
            return this.listData;
        }

        public final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI copy(boolean today, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean> listData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listData, "listData");
            return new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI(today, listData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI bloodOxygenUI = (com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenUI) other;
            return this.today == bloodOxygenUI.today && kotlin.jvm.internal.Intrinsics.areEqual(this.listData, bloodOxygenUI.listData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.today;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.listData.hashCode();
        }

        public java.lang.String toString() {
            return "BloodOxygenUI(today=" + this.today + ", listData=" + this.listData + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BloodOxygenUI(boolean z, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "listData");
            this.today = z;
            this.listData = list;
        }

        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean> getListData() {
            return this.listData;
        }
    }

    /* compiled from: BloodOxygenViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/BloodOxygenViewModel$BloodOxygenDetail;", "", "data", "", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/bean/BloodOxyDetailBean;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BloodOxygenDetail {
        private final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail copy$default(com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail bloodOxygenDetail, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = bloodOxygenDetail.data;
            }
            return bloodOxygenDetail.copy(list);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> component1() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail copy(java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail(data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.qcwireless.qcwatch.ui.home.bloodoxgen.BloodOxygenViewModel.BloodOxygenDetail) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public java.lang.String toString() {
            return "BloodOxygenDetail(data=" + this.data + ')';
        }

        public BloodOxygenDetail(java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            this.data = list;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> getData() {
            return this.data;
        }
    }
}
