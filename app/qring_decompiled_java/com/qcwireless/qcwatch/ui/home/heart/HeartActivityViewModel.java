package com.qcwireless.qcwatch.ui.home.heart;

/* compiled from: HeartActivityViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003345B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0016\u001a\u00020'J\u000e\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\u000fJ\u000e\u0010-\u001a\u00020'2\u0006\u0010,\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020'J\u0016\u0010/\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u00100\u001a\u00020\rJ\u000e\u00101\u001a\u00020'2\u0006\u0010,\u001a\u00020\u000fJ\u0006\u00102\u001a\u00020'R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00158F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158F¢\u0006\u0006\u001a\u0004\b$\u0010\u0017R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158F¢\u0006\u0006\u001a\u0004\b&\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "heartRateDetailRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository;", "userProfileRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository;Lcom/qcwireless/qcwatch/ui/base/repository/mine/UserProfileRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_age", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel$UserAge;", "_deviceSetting", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "_lastDate", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiDetail", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel$HeartRateDetail;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel$HeartDetailUI;", "age", "Landroidx/lifecycle/LiveData;", "getAge", "()Landroidx/lifecycle/LiveData;", "detailList", "", "Lcom/qcwireless/qcwatch/ui/home/heart/bean/HeartRateDetailBean;", "getDetailList", "()Ljava/util/List;", "deviceSetting", "getDeviceSetting", "lastDate", "getLastDate", "manualList", "getManualList", "uiDetail", "getUiDetail", "uiState", "getUiState", "", "initData", "mac", "", "queryAppHeartRateByDateDetail", "date", "queryHeartRateByDateDetail", "queryLastData", "saveDeviceSetting", "setting", "showHeartRateDetail", "syncTodayData", "HeartDetailUI", "HeartRateDetail", "UserAge", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HeartActivityViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge> _age;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _deviceSetting;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail> _uiDetail;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI> _uiState;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> detailList;
    private com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> manualList;
    private final com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveDeviceSetting$lambda-0, reason: not valid java name */
    public static final void m1111saveDeviceSetting$lambda0(com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp heartRateSettingRsp) {
    }

    public HeartActivityViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository, com.qcwireless.qcwatch.ui.base.repository.mine.UserProfileRepository userProfileRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "heartRateDetailRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.heartRateDetailRepository = heartRateDetailRepository;
        this.userProfileRepository = userProfileRepository;
        this.deviceSettingRepository = deviceSettingRepository;
        this.detailList = new java.util.ArrayList();
        this.manualList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._age = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
        this._uiDetail = new androidx.lifecycle.MutableLiveData<>();
        this._deviceSetting = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> getDetailList() {
        return this.detailList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> getManualList() {
        return this.manualList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge> getAge() {
        return this._age;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail> getUiDetail() {
        return this._uiDetail;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getDeviceSetting() {
        return this._deviceSetting;
    }

    public final void showHeartRateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$showHeartRateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel heartActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivityViewModel, "$this$ktxRunOnBgSingle");
                heartRateDetailRepository = heartActivityViewModel.heartRateDetailRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> queryHeartDetail = heartRateDetailRepository.queryHeartDetail(com.qcwireless.qc_utils.date.DateUtil.this);
                if (com.qcwireless.qc_utils.date.DateUtil.this.isToday()) {
                    mutableLiveData2 = heartActivityViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI(true, queryHeartDetail));
                } else {
                    mutableLiveData = heartActivityViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI(false, queryHeartDetail));
                }
            }
        });
    }

    /* renamed from: getAge, reason: collision with other method in class */
    public final void m1113getAge() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$getAge$1(this, null), 3, (java.lang.Object) null);
    }

    public final void queryLastData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$queryLastData$1(this, null), 3, (java.lang.Object) null);
    }

    public final void queryHeartRateByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$queryHeartRateByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel heartActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivityViewModel, "$this$ktxRunOnBgSingle");
                heartRateDetailRepository = heartActivityViewModel.heartRateDetailRepository;
                java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> queryHeartRateByDateDetailResp = heartRateDetailRepository.queryHeartRateByDateDetailResp(com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = heartActivityViewModel._uiDetail;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail(queryHeartRateByDateDetailResp));
            }
        });
    }

    public final void queryAppHeartRateByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$queryAppHeartRateByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel heartActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivityViewModel, "$this$ktxRunOnBgSingle");
                heartRateDetailRepository = heartActivityViewModel.heartRateDetailRepository;
                java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> queryAppHeartRateByDateDetailResp = heartRateDetailRepository.queryAppHeartRateByDateDetailResp(com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = heartActivityViewModel._uiDetail;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail(queryAppHeartRateByDateDetailResp));
            }
        });
    }

    public final void saveDeviceSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.HeartRateSettingReq.getWriteInstance(setting.getHrDetection(), setting.getHrInterval()), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.m1111saveDeviceSetting$lambda0((com.oudmon.ble.base.communication.rsp.HeartRateSettingRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$initData$1(this, mac, null), 3, (java.lang.Object) null);
    }

    public final void syncTodayData() {
        final com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository = this.heartRateDetailRepository;
        java.lang.String deviceFunctionList = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceFunctionList();
        com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.base.bean.device.DeviceFunctionList>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$lambda-2$$inlined$fromJson$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        com.qcwireless.qcwatch.ui.base.bean.device.DeviceFunctionList deviceFunctionList2 = (com.qcwireless.qcwatch.ui.base.bean.device.DeviceFunctionList) adapter.fromJson(deviceFunctionList);
        if (deviceFunctionList2 != null) {
            if (deviceFunctionList2.getManualHeart()) {
                heartRateDetailRepository.syncManualHeartRate(0, new com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$$ExternalSyntheticLambda1
                    @Override // com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse
                    public final void manualHeart(com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate manualHeartRate) {
                        com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.m1112syncTodayData$lambda2$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.this, this, manualHeartRate);
                    }
                });
                return;
            } else {
                heartRateDetailRepository.syncTodayHeartRate(new com.qcwireless.qc_utils.date.DateUtil(), new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$2
                    @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
                    public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp t) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                        final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel heartActivityViewModel = com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.this;
                        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$2, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$2$result$1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$2) obj);
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$2 heartActivityViewModel$syncTodayData$1$2) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivityViewModel$syncTodayData$1$2, "$this$ktxRunOnBgSingle");
                                com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.this.queryHeartRateByDateDetail(new com.qcwireless.qc_utils.date.DateUtil());
                                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                            }
                        });
                    }
                });
                return;
            }
        }
        heartRateDetailRepository.syncTodayHeartRate(new com.qcwireless.qc_utils.date.DateUtil(), new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$3
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel heartActivityViewModel = com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$3, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$3$result$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$3) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$3 heartActivityViewModel$syncTodayData$1$3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivityViewModel$syncTodayData$1$3, "$this$ktxRunOnBgSingle");
                        com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.this.queryHeartRateByDateDetail(new com.qcwireless.qc_utils.date.DateUtil());
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncTodayData$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1112syncTodayData$lambda2$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository, final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel heartActivityViewModel, com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate manualHeartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "$this_run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivityViewModel, "this$0");
        heartRateDetailRepository.syncTodayHeartRate(new com.qcwireless.qc_utils.date.DateUtil(), new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel heartActivityViewModel2 = com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$1$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$1$1$result$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$1$1) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel$syncTodayData$1$1$1 heartActivityViewModel$syncTodayData$1$1$1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartActivityViewModel$syncTodayData$1$1$1, "$this$ktxRunOnBgSingle");
                        com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.this.queryHeartRateByDateDetail(new com.qcwireless.qc_utils.date.DateUtil());
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                    }
                });
            }
        });
    }

    /* compiled from: HeartActivityViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel$HeartDetailUI;", "", "today", "", "listData", "", "Lcom/qcwireless/qcwatch/ui/base/view/QHeartLineChartView$HeartDataBean;", "(ZLjava/util/List;)V", "getListData", "()Ljava/util/List;", "getToday", "()Z", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class HeartDetailUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> listData;
        private final boolean today;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI copy$default(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI heartDetailUI, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = heartDetailUI.today;
            }
            if ((i & 2) != 0) {
                list = heartDetailUI.listData;
            }
            return heartDetailUI.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> component2() {
            return this.listData;
        }

        public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI copy(boolean today, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> listData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listData, "listData");
            return new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI(today, listData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI heartDetailUI = (com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartDetailUI) other;
            return this.today == heartDetailUI.today && kotlin.jvm.internal.Intrinsics.areEqual(this.listData, heartDetailUI.listData);
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
            return "HeartDetailUI(today=" + this.today + ", listData=" + this.listData + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HeartDetailUI(boolean z, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "listData");
            this.today = z;
            this.listData = list;
        }

        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> getListData() {
            return this.listData;
        }
    }

    /* compiled from: HeartActivityViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel$UserAge;", "", "age", "", "(I)V", "getAge", "()I", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class UserAge {
        private final int age;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge copy$default(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge userAge, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = userAge.age;
            }
            return userAge.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAge() {
            return this.age;
        }

        public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge copy(int age) {
            return new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge(age);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge) && this.age == ((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.UserAge) other).age;
        }

        public int hashCode() {
            return this.age;
        }

        public java.lang.String toString() {
            return "UserAge(age=" + this.age + ')';
        }

        public UserAge(int i) {
            this.age = i;
        }

        public final int getAge() {
            return this.age;
        }
    }

    /* compiled from: HeartActivityViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/heart/HeartActivityViewModel$HeartRateDetail;", "", "data", "", "Lcom/qcwireless/qcwatch/ui/home/heart/bean/HeartRateDetailBean;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class HeartRateDetail {
        private final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail copy$default(com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail heartRateDetail, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = heartRateDetail.data;
            }
            return heartRateDetail.copy(list);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> component1() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail copy(java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail(data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.qcwireless.qcwatch.ui.home.heart.HeartActivityViewModel.HeartRateDetail) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public java.lang.String toString() {
            return "HeartRateDetail(data=" + this.data + ')';
        }

        public HeartRateDetail(java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            this.data = list;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> getData() {
            return this.data;
        }
    }
}
