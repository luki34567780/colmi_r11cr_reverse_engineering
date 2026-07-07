package com.qcwireless.qcwatch.ui.home.sleep.week;

/* compiled from: WeekSleepFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/week/WeekSleepFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "sleepDetailRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/qcwireless/qcwatch/ui/base/view/QSleepWeekBarView$SleepDataBean;", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "queryWeekSleepHistory", "", "start", "Lcom/qcwireless/qc_utils/date/DateUtil;", "showDaySleepView", "dateUtil", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class WeekSleepFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean>> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;

    public WeekSleepFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "sleepDetailRepository");
        this.sleepDetailRepository = sleepDetailRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean>> getUiState() {
        return this._uiState;
    }

    public final void queryWeekSleepHistory(final com.qcwireless.qc_utils.date.DateUtil start) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel$queryWeekSleepHistory$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel weekSleepFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository2;
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekSleepFragmentViewModel, "$this$ktxRunOnBgSingle");
                if (!com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getNewSleepProtocol()) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qc_utils.date.DateUtil.this.getUnixTimestamp(), true);
                    for (int i = 0; i < 7; i++) {
                        sleepDetailRepository2 = weekSleepFragmentViewModel.sleepDetailRepository;
                        java.lang.String y_m_d = dateUtil.getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dayAdd.y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate = sleepDetailRepository2.querySleepByDate(y_m_d);
                        sleepDetailRepository3 = weekSleepFragmentViewModel.sleepDetailRepository;
                        java.lang.String y_m_d2 = dateUtil.getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "dayAdd.y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory querySleepTotalByDate = sleepDetailRepository3.querySleepTotalByDate(y_m_d2);
                        if (querySleepByDate != null && querySleepTotalByDate == null) {
                            weekSleepFragmentViewModel.showDaySleepView(dateUtil);
                        }
                        dateUtil.addDay(1);
                    }
                }
                sleepDetailRepository = weekSleepFragmentViewModel.sleepDetailRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean> querySleepWeek = sleepDetailRepository.querySleepWeek(com.qcwireless.qc_utils.date.DateUtil.this);
                mutableLiveData = weekSleepFragmentViewModel._uiState;
                mutableLiveData.postValue(querySleepWeek);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDaySleepView(final com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel$showDaySleepView$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.sleep.week.WeekSleepFragmentViewModel weekSleepFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository2;
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekSleepFragmentViewModel, "$this$ktxRunOnBgSingle");
                sleepDetailRepository = weekSleepFragmentViewModel.sleepDetailRepository;
                java.lang.String y_m_d = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate = sleepDetailRepository.querySleepByDate(y_m_d);
                com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qc_utils.date.DateUtil.this.getUnixTimestamp(), true);
                dateUtil2.addDay(-1);
                sleepDetailRepository2 = weekSleepFragmentViewModel.sleepDetailRepository;
                java.lang.String y_m_d2 = dateUtil2.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "yesDate.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate2 = sleepDetailRepository2.querySleepByDate(y_m_d2);
                if (querySleepByDate2 == null) {
                    querySleepByDate2 = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "", 900, "", "", false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                }
                if (querySleepByDate != null) {
                    sleepDetailRepository3 = weekSleepFragmentViewModel.sleepDetailRepository;
                    sleepDetailRepository3.calcSleepViewData(querySleepByDate, querySleepByDate2);
                }
            }
        });
    }
}
