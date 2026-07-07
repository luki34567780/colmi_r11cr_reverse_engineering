package com.qcwireless.qcwatch.ui.home.bp;

/* compiled from: BloodPressureViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002*+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000bJ\u0006\u0010&\u001a\u00020 J\u0016\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010(\u001a\u00020\tJ\u0006\u0010)\u001a\u00020 R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00168F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006,"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "bloodPressureRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository;", "deviceSettingRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository;Lcom/qcwireless/qcwatch/ui/base/repository/device/DeviceSettingRepository;)V", "_deviceSetting", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/base/bean/device/DeviceSetting;", "_lastDate", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiDetail", "Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel$BloodPressureDetail;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel$BloodPressureUI;", "detailList", "", "Lcom/qcwireless/qcwatch/ui/home/bp/bean/BpDetailBean;", "getDetailList", "()Ljava/util/List;", "deviceSetting", "Landroidx/lifecycle/LiveData;", "getDeviceSetting", "()Landroidx/lifecycle/LiveData;", "lastDate", "getLastDate", "uiDetail", "getUiDetail", "uiState", "getUiState", "initData", "", "mac", "", "queryBloodPressureByDate", "date", "queryBloodPressureByDateDetail", "queryLastData", "saveDeviceSetting", "setting", "syncBp", "BloodPressureDetail", "BloodPressureUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodPressureViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> _deviceSetting;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail> _uiDetail;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean> detailList;
    private final com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveDeviceSetting$lambda-0, reason: not valid java name */
    public static final void m959saveDeviceSetting$lambda0(com.oudmon.ble.base.communication.rsp.BpSettingRsp bpSettingRsp) {
    }

    public BloodPressureViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository, com.qcwireless.qcwatch.ui.base.repository.device.DeviceSettingRepository deviceSettingRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureRepository, "bloodPressureRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSettingRepository, "deviceSettingRepository");
        this.bloodPressureRepository = bloodPressureRepository;
        this.deviceSettingRepository = deviceSettingRepository;
        this.detailList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
        this._uiDetail = new androidx.lifecycle.MutableLiveData<>();
        this._deviceSetting = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean> getDetailList() {
        return this.detailList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail> getUiDetail() {
        return this._uiDetail;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting> getDeviceSetting() {
        return this._deviceSetting;
    }

    public final void saveDeviceSetting(java.lang.String mac, com.qcwireless.qcwatch.ui.base.bean.device.DeviceSetting setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "setting");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(com.oudmon.ble.base.communication.req.BpSettingReq.getWriteInstance(setting.getBpSwitch(), new com.oudmon.ble.base.communication.entity.StartEndTimeEntity(0, 0, 23, 59), 60), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.m959saveDeviceSetting$lambda0((com.oudmon.ble.base.communication.rsp.BpSettingRsp) baseRspCmd);
            }
        });
        this.deviceSettingRepository.saveDeviceSetting(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(mac, com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.WatchSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(setting)));
    }

    public final void initData(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$initData$1(this, mac, null), 3, (java.lang.Object) null);
    }

    public final void queryBloodPressureByDate(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$queryBloodPressureByDate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel bloodPressureViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureViewModel, "$this$ktxRunOnBgSingle");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                bloodPressureRepository = bloodPressureViewModel.bloodPressureRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> queryBpByDate = bloodPressureRepository.queryBpByDate(com.qcwireless.qc_utils.date.DateUtil.this.getZeroTime(), com.qcwireless.qc_utils.date.DateUtil.this.getZeroTime() + 86399);
                if (queryBpByDate != null) {
                    int i = 0;
                    for (com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity bloodPressureEntity : queryBpByDate) {
                        int i2 = i + 1;
                        if (i > 0) {
                            long j = 60;
                            if (queryBpByDate.get(i - 1).getUnixTime() / j == queryBpByDate.get(i).getUnixTime() / j) {
                                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bloodPressureEntity);
                                i = i2;
                            }
                        }
                        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(bloodPressureEntity.getUnixTime(), true);
                        arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean((dateUtil.getHour() * 60) + dateUtil.getMinute(), bloodPressureEntity.getSbp(), bloodPressureEntity.getDbp()));
                        i = i2;
                    }
                }
                if (com.qcwireless.qc_utils.date.DateUtil.this.isToday()) {
                    mutableLiveData2 = bloodPressureViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI(true, arrayList));
                } else {
                    mutableLiveData = bloodPressureViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI(false, arrayList));
                }
            }
        });
    }

    public final void queryBloodPressureByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$queryBloodPressureByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel bloodPressureViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureViewModel, "$this$ktxRunOnBgSingle");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                bloodPressureRepository = bloodPressureViewModel.bloodPressureRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> queryBpByDate = bloodPressureRepository.queryBpByDate(com.qcwireless.qc_utils.date.DateUtil.this.getZeroTime(), com.qcwireless.qc_utils.date.DateUtil.this.getZeroTime() + 86399);
                if (queryBpByDate != null) {
                    for (com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity bloodPressureEntity : queryBpByDate) {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(bloodPressureEntity.getUnixTime(), true);
                        arrayList.add(new com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean((dateUtil.getHour() * 60) + dateUtil.getMinute(), bloodPressureEntity.getSbp(), bloodPressureEntity.getDbp()));
                    }
                }
                if (arrayList.size() > 1) {
                    kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$queryBloodPressureByDateDetail$1$invoke$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean) t2).getMin()), java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean) t).getMin()));
                        }
                    });
                }
                mutableLiveData = bloodPressureViewModel._uiDetail;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail(arrayList));
            }
        });
    }

    public final void syncBp() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$syncBp$1(this, null), 3, (java.lang.Object) null);
    }

    public final void queryLastData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel$queryLastData$1(this, null), 3, (java.lang.Object) null);
    }

    /* compiled from: BloodPressureViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel$BloodPressureUI;", "", "today", "", "listData", "", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodPressureChartView$BpDataBean;", "(ZLjava/util/List;)V", "getListData", "()Ljava/util/List;", "getToday", "()Z", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BloodPressureUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean> listData;
        private final boolean today;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI copy$default(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI bloodPressureUI, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = bloodPressureUI.today;
            }
            if ((i & 2) != 0) {
                list = bloodPressureUI.listData;
            }
            return bloodPressureUI.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean> component2() {
            return this.listData;
        }

        public final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI copy(boolean today, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean> listData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listData, "listData");
            return new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI(today, listData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI bloodPressureUI = (com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureUI) other;
            return this.today == bloodPressureUI.today && kotlin.jvm.internal.Intrinsics.areEqual(this.listData, bloodPressureUI.listData);
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
            return "BloodPressureUI(today=" + this.today + ", listData=" + this.listData + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BloodPressureUI(boolean z, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "listData");
            this.today = z;
            this.listData = list;
        }

        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartView.BpDataBean> getListData() {
            return this.listData;
        }
    }

    /* compiled from: BloodPressureViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bp/BloodPressureViewModel$BloodPressureDetail;", "", "listData", "", "Lcom/qcwireless/qcwatch/ui/home/bp/bean/BpDetailBean;", "(Ljava/util/List;)V", "getListData", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BloodPressureDetail {
        private final java.util.List<com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean> listData;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail copy$default(com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail bloodPressureDetail, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = bloodPressureDetail.listData;
            }
            return bloodPressureDetail.copy(list);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean> component1() {
            return this.listData;
        }

        public final com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail copy(java.util.List<com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean> listData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listData, "listData");
            return new com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail(listData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.listData, ((com.qcwireless.qcwatch.ui.home.bp.BloodPressureViewModel.BloodPressureDetail) other).listData);
        }

        public int hashCode() {
            return this.listData.hashCode();
        }

        public java.lang.String toString() {
            return "BloodPressureDetail(listData=" + this.listData + ')';
        }

        public BloodPressureDetail(java.util.List<com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "listData");
            this.listData = list;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.bp.bean.BpDetailBean> getListData() {
            return this.listData;
        }
    }
}
