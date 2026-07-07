package com.qcwireless.qcwatch.ui.home.temperature.vm;

/* compiled from: TemperatureViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006!"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/temperature/vm/TemperatureViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "temperatureRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;)V", "_lastDate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiDetail", "", "Lcom/qcwireless/qcwatch/ui/home/temperature/bean/TemperatureDetailBean;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/temperature/vm/TemperatureViewModel$TemperatureUI;", "detailList", "", "getDetailList", "()Ljava/util/List;", "lastDate", "Landroidx/lifecycle/LiveData;", "getLastDate", "()Landroidx/lifecycle/LiveData;", "uiDetail", "getUiDetail", "uiState", "getUiState", "getTemperatureByDate", "", "dateUtil", "queryLastDate", "queryTemperatureByDateDetail", "date", "syncTemperatureSingleCheck", "TemperatureUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class TemperatureViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean>> _uiDetail;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI> _uiState;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean> detailList;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository;

    public TemperatureViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureRepository, "temperatureRepository");
        this.temperatureRepository = temperatureRepository;
        this.detailList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
        this._uiDetail = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean> getDetailList() {
        return this.detailList;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final androidx.lifecycle.LiveData<java.util.List<com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean>> getUiDetail() {
        return this._uiDetail;
    }

    public final void queryLastDate() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$queryLastDate$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel temperatureViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureViewModel, "$this$ktxRunOnBgSingle");
                temperatureRepository = temperatureViewModel.temperatureRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView.TemperatureDataBean> queryTemperatureLast = temperatureRepository.queryTemperatureLast();
                if (!queryTemperatureLast.isEmpty()) {
                    mutableLiveData2 = temperatureViewModel._lastDate;
                    mutableLiveData2.postValue(new com.qcwireless.qc_utils.date.DateUtil(queryTemperatureLast.get(0).getUnixTime(), true));
                } else {
                    mutableLiveData = temperatureViewModel._lastDate;
                    mutableLiveData.postValue(new com.qcwireless.qc_utils.date.DateUtil());
                }
            }
        });
    }

    public final void getTemperatureByDate(final com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$getTemperatureByDate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel temperatureViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureViewModel, "$this$ktxRunOnBgSingle");
                temperatureRepository = temperatureViewModel.temperatureRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> queryTemperatureByDate = temperatureRepository.queryTemperatureByDate(com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = temperatureViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI(queryTemperatureByDate));
            }
        });
    }

    public final void queryTemperatureByDateDetail(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$queryTemperatureByDateDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel temperatureViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(temperatureViewModel, "$this$ktxRunOnBgSingle");
                temperatureRepository = temperatureViewModel.temperatureRepository;
                java.util.List<com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean> queryTemperatureDetailByDate = temperatureRepository.queryTemperatureDetailByDate(com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = temperatureViewModel._uiDetail;
                mutableLiveData.postValue(queryTemperatureDetailByDate);
            }
        });
    }

    public final void syncTemperatureSingleCheck() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel$syncTemperatureSingleCheck$1(this, null), 3, (java.lang.Object) null);
    }

    /* compiled from: TemperatureViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/temperature/vm/TemperatureViewModel$TemperatureUI;", "", "data", "", "Lcom/qcwireless/qcwatch/ui/base/view/QTemperatureLineChartView$TemperatureDataBean;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class TemperatureUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI copy$default(com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI temperatureUI, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = temperatureUI.data;
            }
            return temperatureUI.copy(list);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> component1() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI copy(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI(data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.qcwireless.qcwatch.ui.home.temperature.vm.TemperatureViewModel.TemperatureUI) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public java.lang.String toString() {
            return "TemperatureUI(data=" + this.data + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemperatureUI(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            this.data = list;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> getData() {
            return this.data;
        }
    }
}
