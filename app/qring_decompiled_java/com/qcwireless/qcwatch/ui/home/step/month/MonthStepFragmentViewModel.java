package com.qcwireless.qcwatch.ui.home.step.month;

/* compiled from: MonthStepFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "stepHistoryRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepHistoryRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepHistoryRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragmentViewModel$MonthStepUI;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "queryHistoryStepsByDate", "", "start", "Lcom/qcwireless/qc_utils/date/DateUtil;", "end", "MonthStepUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MonthStepFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository stepHistoryRepository;

    public MonthStepFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository stepHistoryRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepHistoryRepository, "stepHistoryRepository");
        this.stepHistoryRepository = stepHistoryRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI> getUiState() {
        return this._uiState;
    }

    public final void queryHistoryStepsByDate(final com.qcwireless.qc_utils.date.DateUtil start, final com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel$queryHistoryStepsByDate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel monthStepFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository stepHistoryRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthStepFragmentViewModel, "$this$ktxRunOnBgSingle");
                stepHistoryRepository = monthStepFragmentViewModel.stepHistoryRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean> queryMonthHistoryStepByDate = stepHistoryRepository.queryMonthHistoryStepByDate(com.qcwireless.qc_utils.date.DateUtil.this, end);
                mutableLiveData = monthStepFragmentViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI(queryMonthHistoryStepByDate));
            }
        });
    }

    /* compiled from: MonthStepFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/month/MonthStepFragmentViewModel$MonthStepUI;", "", "data", "", "Lcom/qcwireless/qcwatch/ui/base/view/QStepMonthHistoryBarChart$StepDataBean;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MonthStepUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean> data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI copy$default(com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI monthStepUI, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = monthStepUI.data;
            }
            return monthStepUI.copy(list);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean> component1() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI copy(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI(data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.qcwireless.qcwatch.ui.home.step.month.MonthStepFragmentViewModel.MonthStepUI) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public java.lang.String toString() {
            return "MonthStepUI(data=" + this.data + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MonthStepUI(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            this.data = list;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepMonthHistoryBarChart.StepDataBean> getData() {
            return this.data;
        }
    }
}
