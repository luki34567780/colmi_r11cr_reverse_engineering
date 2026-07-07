package com.qcwireless.qcwatch.ui.home.bloodsugar;

/* compiled from: BloodSugarActivityViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dJ\u0006\u0010#\u001a\u00020\u001dR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006&"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "bloodSugarRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodSugarRepository;)V", "_lastDate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiDetail", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel$BloodSugarDetail;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel$BloodSugarUI;", "detailList", "", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/bean/BloodSugarDetailBean;", "getDetailList", "()Ljava/util/List;", "lastDate", "Landroidx/lifecycle/LiveData;", "getLastDate", "()Landroidx/lifecycle/LiveData;", "manualList", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/bean/AppSugarDetailBean;", "getManualList", "uiDetail", "getUiDetail", "uiState", "getUiState", "queryAppBloodSugarByDateDetail", "", "date", "queryBloodSugarByDate", "queryBloodSugarByDateDetail", "queryLastData", "syncBloodSugarSugar", "syncTodayData", "BloodSugarDetail", "BloodSugarUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodSugarActivityViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail> _uiDetail;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> detailList;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.AppSugarDetailBean> manualList;

    public BloodSugarActivityViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarRepository, "bloodSugarRepository");
        this.bloodSugarRepository = bloodSugarRepository;
        this.detailList = new java.util.ArrayList();
        this.manualList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
        this._uiDetail = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> getDetailList() {
        return this.detailList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.AppSugarDetailBean> getManualList() {
        return this.manualList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail> getUiDetail() {
        return this._uiDetail;
    }

    public final void queryBloodSugarByDate(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$queryBloodSugarByDate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel bloodSugarActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivityViewModel, "$this$ktxRunOnBgSingle");
                bloodSugarRepository = bloodSugarActivityViewModel.bloodSugarRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> queryBloodSugarByDate = bloodSugarRepository.queryBloodSugarByDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qc_utils.date.DateUtil.this);
                if (com.qcwireless.qc_utils.date.DateUtil.this.isToday()) {
                    mutableLiveData2 = bloodSugarActivityViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI(true, queryBloodSugarByDate));
                } else {
                    mutableLiveData = bloodSugarActivityViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI(false, queryBloodSugarByDate));
                }
            }
        });
    }

    public final void queryBloodSugarByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$queryBloodSugarByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel bloodSugarActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivityViewModel, "$this$ktxRunOnBgSingle");
                bloodSugarRepository = bloodSugarActivityViewModel.bloodSugarRepository;
                java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> queryBloodSugarByDateDetail = bloodSugarRepository.queryBloodSugarByDateDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = bloodSugarActivityViewModel._uiDetail;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail(queryBloodSugarByDateDetail));
            }
        });
    }

    public final void queryAppBloodSugarByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$queryAppBloodSugarByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel bloodSugarActivityViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository bloodSugarRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivityViewModel, "$this$ktxRunOnBgSingle");
                bloodSugarRepository = bloodSugarActivityViewModel.bloodSugarRepository;
                java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> queryBloodSugarByDateDetailAll = bloodSugarRepository.queryBloodSugarByDateDetailAll(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = bloodSugarActivityViewModel._uiDetail;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail(queryBloodSugarByDateDetailAll));
            }
        });
    }

    public final void queryLastData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$queryLastData$1(this, null), 3, (java.lang.Object) null);
    }

    public final void syncBloodSugarSugar() {
        this.bloodSugarRepository.syncBloodSugar(255, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$syncBloodSugarSugar$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
            }
        });
    }

    public final void syncTodayData() {
        this.bloodSugarRepository.syncBloodSugar(0, new com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$syncTodayData$1$1
            @Override // com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult
            public void result(int errorCode, com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp t) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
                final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel bloodSugarActivityViewModel = com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.this;
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$syncTodayData$1$1, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$syncTodayData$1$1$result$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$syncTodayData$1$1) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel$syncTodayData$1$1 bloodSugarActivityViewModel$syncTodayData$1$1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodSugarActivityViewModel$syncTodayData$1$1, "$this$ktxRunOnBgSingle");
                        com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.this.queryBloodSugarByDateDetail(new com.qcwireless.qc_utils.date.DateUtil());
                    }
                });
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    /* compiled from: BloodSugarActivityViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel$BloodSugarUI;", "", "today", "", "listData", "", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodSugarLineChartView$DataBean;", "(ZLjava/util/List;)V", "getListData", "()Ljava/util/List;", "getToday", "()Z", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BloodSugarUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> listData;
        private final boolean today;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI copy$default(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI bloodSugarUI, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = bloodSugarUI.today;
            }
            if ((i & 2) != 0) {
                list = bloodSugarUI.listData;
            }
            return bloodSugarUI.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> component2() {
            return this.listData;
        }

        public final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI copy(boolean today, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> listData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listData, "listData");
            return new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI(today, listData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI bloodSugarUI = (com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarUI) other;
            return this.today == bloodSugarUI.today && kotlin.jvm.internal.Intrinsics.areEqual(this.listData, bloodSugarUI.listData);
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
            return "BloodSugarUI(today=" + this.today + ", listData=" + this.listData + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BloodSugarUI(boolean z, java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "listData");
            this.today = z;
            this.listData = list;
        }

        public final boolean getToday() {
            return this.today;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodSugarLineChartView.DataBean> getListData() {
            return this.listData;
        }
    }

    /* compiled from: BloodSugarActivityViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/bloodsugar/BloodSugarActivityViewModel$BloodSugarDetail;", "", "data", "", "Lcom/qcwireless/qcwatch/ui/home/bloodsugar/bean/BloodSugarDetailBean;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BloodSugarDetail {
        private final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail copy$default(com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail bloodSugarDetail, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = bloodSugarDetail.data;
            }
            return bloodSugarDetail.copy(list);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> component1() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail copy(java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail(data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.qcwireless.qcwatch.ui.home.bloodsugar.BloodSugarActivityViewModel.BloodSugarDetail) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public java.lang.String toString() {
            return "BloodSugarDetail(data=" + this.data + ')';
        }

        public BloodSugarDetail(java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            this.data = list;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodsugar.bean.BloodSugarDetailBean> getData() {
            return this.data;
        }
    }
}
