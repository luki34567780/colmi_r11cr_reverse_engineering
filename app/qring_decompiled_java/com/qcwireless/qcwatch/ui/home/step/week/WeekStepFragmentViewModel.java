package com.qcwireless.qcwatch.ui.home.step.week;

/* compiled from: WeekStepFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "stepHistoryRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepHistoryRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepHistoryRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragmentViewModel$WeekStepUI;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "queryHistoryStepsByDate", "", "start", "Lcom/qcwireless/qc_utils/date/DateUtil;", "end", "WeekStepUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeekStepFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository stepHistoryRepository;

    public WeekStepFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository stepHistoryRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepHistoryRepository, "stepHistoryRepository");
        this.stepHistoryRepository = stepHistoryRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI> getUiState() {
        return this._uiState;
    }

    public final void queryHistoryStepsByDate(final com.qcwireless.qc_utils.date.DateUtil start, final com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel$queryHistoryStepsByDate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel weekStepFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepHistoryRepository stepHistoryRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekStepFragmentViewModel, "$this$ktxRunOnBgSingle");
                stepHistoryRepository = weekStepFragmentViewModel.stepHistoryRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean> queryWeekHistoryStepByDate = stepHistoryRepository.queryWeekHistoryStepByDate(com.qcwireless.qc_utils.date.DateUtil.this, end);
                mutableLiveData = weekStepFragmentViewModel._uiState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI(queryWeekHistoryStepByDate));
            }
        });
    }

    /* compiled from: WeekStepFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/step/week/WeekStepFragmentViewModel$WeekStepUI;", "", "data", "", "Lcom/qcwireless/qcwatch/ui/base/view/QStepWeekHistoryBarChart$StepDataBean;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class WeekStepUI {
        private final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean> data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI copy$default(com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI weekStepUI, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = weekStepUI.data;
            }
            return weekStepUI.copy(list);
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean> component1() {
            return this.data;
        }

        public final com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI copy(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean> data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            return new com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI(data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.qcwireless.qcwatch.ui.home.step.week.WeekStepFragmentViewModel.WeekStepUI) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public java.lang.String toString() {
            return "WeekStepUI(data=" + this.data + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WeekStepUI(java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "data");
            this.data = list;
        }

        public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepWeekHistoryBarChart.StepDataBean> getData() {
            return this.data;
        }
    }
}
