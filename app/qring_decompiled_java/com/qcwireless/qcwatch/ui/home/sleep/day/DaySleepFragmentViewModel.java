package com.qcwireless.qcwatch.ui.home.sleep.day;

/* compiled from: DaySleepFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sleep/day/DaySleepFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "sleepDetailRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;)V", "_lastDate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/sleep/bean/SleepViewBean;", "lastDate", "Landroidx/lifecycle/LiveData;", "getLastDate", "()Landroidx/lifecycle/LiveData;", "uiState", "getUiState", "queryLastData", "", "showDaySleepView", "dateUtil", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DaySleepFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean> _uiState;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;

    public DaySleepFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "sleepDetailRepository");
        this.sleepDetailRepository = sleepDetailRepository;
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final void showDaySleepView(final com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel$showDaySleepView$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel daySleepFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository2;
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository3;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                androidx.lifecycle.MutableLiveData mutableLiveData2;
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository4;
                androidx.lifecycle.MutableLiveData mutableLiveData3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySleepFragmentViewModel, "$this$ktxRunOnBgSingle");
                if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getNewSleepProtocol()) {
                    sleepDetailRepository4 = daySleepFragmentViewModel.sleepDetailRepository;
                    com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean querySleepNewProtocol = sleepDetailRepository4.querySleepNewProtocol(com.qcwireless.qc_utils.date.DateUtil.this);
                    mutableLiveData3 = daySleepFragmentViewModel._uiState;
                    mutableLiveData3.postValue(querySleepNewProtocol);
                    return;
                }
                sleepDetailRepository = daySleepFragmentViewModel.sleepDetailRepository;
                java.lang.String y_m_d = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate = sleepDetailRepository.querySleepByDate(y_m_d);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D());
                com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qc_utils.date.DateUtil.this.getUnixTimestamp(), true);
                dateUtil2.addDay(-1);
                sleepDetailRepository2 = daySleepFragmentViewModel.sleepDetailRepository;
                java.lang.String y_m_d2 = dateUtil2.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "yesDate.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate2 = sleepDetailRepository2.querySleepByDate(y_m_d2);
                if (querySleepByDate == null) {
                    mutableLiveData2 = daySleepFragmentViewModel._uiState;
                    mutableLiveData2.postValue(new com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean(null, 0, 0, 0, 0, 0L, 0L, com.google.android.gms.internal.fitness.zzab.zzh, null));
                }
                if (querySleepByDate2 == null) {
                    querySleepByDate2 = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "", 900, "", "", false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                }
                if (querySleepByDate != null) {
                    sleepDetailRepository3 = daySleepFragmentViewModel.sleepDetailRepository;
                    com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean calcSleepViewData = sleepDetailRepository3.calcSleepViewData(querySleepByDate, querySleepByDate2);
                    mutableLiveData = daySleepFragmentViewModel._uiState;
                    mutableLiveData.postValue(calcSleepViewData);
                }
            }
        });
    }

    public final void queryLastData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.sleep.day.DaySleepFragmentViewModel$queryLastData$1(this, null), 3, (java.lang.Object) null);
    }
}
