package com.qcwireless.qcwatch.ui.home.pressure.day;

/* compiled from: DayPressureFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\tJ\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0007J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f¨\u0006$"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "pressureRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository;)V", "_deviceSetting", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "_lastDate", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragmentViewModel$DayPressureUI;", "deviceSetting", "Landroidx/lifecycle/LiveData;", "getDeviceSetting", "()Landroidx/lifecycle/LiveData;", "lastDate", "getLastDate", "manualList", "", "Lcom/qcwireless/qcwatch/ui/home/pressure/bean/PressureDetailBean;", "getManualList", "()Ljava/util/List;", "uiState", "getUiState", "initData", "", "mac", "", "queryLastData", "queryPressureByDate", "date", "saveDeviceSetting", "setting", "syncPressureAgain", "DayPressureUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DayPressureFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _deviceSetting;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI> _uiState;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.pressure.bean.PressureDetailBean> manualList;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveDeviceSetting$lambda-0, reason: not valid java name */
    public static final void m1159saveDeviceSetting$lambda0(com.oudmon.ble.base.communication.rsp.PressureSettingRsp pressureSettingRsp) {
    }

    public DayPressureFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "pressureRepository");
        this.pressureRepository = pressureRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
        this.manualList = new java.util.ArrayList();
        this._deviceSetting = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.pressure.bean.PressureDetailBean> getManualList() {
        return this.manualList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getDeviceSetting() {
        return this._deviceSetting;
    }

    private final void syncPressureAgain(java.lang.String date) {
        this.pressureRepository.syncTodayPressure(new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.PressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$syncPressureAgain$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.PressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
            }
        });
    }

    public final void queryLastData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$queryLastData$1(this, null), 3, (java.lang.Object) null);
    }

    public final void queryPressureByDate(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$queryPressureByDate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel dayPressureFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPressureFragmentViewModel, "$this$ktxRunOnBgFix");
                pressureRepository = dayPressureFragmentViewModel.pressureRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> queryPressureByDateDetailResp = pressureRepository.queryPressureByDateDetailResp(com.qcwireless.qc_utils.date.DateUtil.this);
                if (com.qcwireless.qc_utils.date.DateUtil.this.isToday()) {
                    mutableLiveData2 = dayPressureFragmentViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI(true, queryPressureByDateDetailResp));
                } else {
                    mutableLiveData = dayPressureFragmentViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI(false, queryPressureByDateDetailResp));
                }
            }
        });
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$initData$1(mac, this, null), 3, (java.lang.Object) null);
    }

    public final void saveDeviceSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.PressureSettingReq.getWriteInstance(setting.getPressureDetection()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.m1159saveDeviceSetting$lambda0((com.oudmon.ble.base.communication.rsp.PressureSettingRsp) baseRspCmd);
            }
        });
        com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository.INSTANCE.getGetInstance().saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    /* compiled from: DayPressureFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/pressure/day/DayPressureFragmentViewModel$DayPressureUI;", "", "today", "", "data", "", "Lcom/qcwireless/qcwatch/ui/base/view/QPressureBarChart$PressureDataBean;", "(ZLjava/util/List;)V", "getData", "()Ljava/util/List;", "getToday", "()Z", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DayPressureUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> data;
        private final boolean today;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI copy$default(com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI dayPressureUI, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = dayPressureUI.today;
            }
            if ((i & 2) != 0) {
                list = dayPressureUI.data;
            }
            return dayPressureUI.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> component2() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI copy(boolean today, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI(today, data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI dayPressureUI = (com.qcwireless.qcwatch.ui.home.pressure.day.DayPressureFragmentViewModel.DayPressureUI) other;
            return this.today == dayPressureUI.today && kotlin.jvm.internal.Intrinsics.areEqual(this.data, dayPressureUI.data);
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
            return (r0 * 31) + this.data.hashCode();
        }

        public java.lang.String toString() {
            return "DayPressureUI(today=" + this.today + ", data=" + this.data + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DayPressureUI(boolean z, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            this.today = z;
            this.data = list;
        }

        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> getData() {
            return this.data;
        }
    }
}
