package com.qcwireless.qcwatch.ui.home.gps.day;

/* compiled from: DayGpsFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "gpsRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/gps/GpsRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragmentViewModel$GpsDetailUI;", "df", "Ljava/text/DecimalFormat;", "df1", "gpsDetailList", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/GpsDetail;", "getGpsDetailList", "()Ljava/util/List;", "setGpsDetailList", "(Ljava/util/List;)V", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "calcTotalData", "", "data", "", "queryDetailByDate", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "GpsDetailUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DayGpsFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.GpsDetailUI> _uiState;
    private java.text.DecimalFormat df;
    private java.text.DecimalFormat df1;
    private java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> gpsDetailList;
    private final com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository;

    public DayGpsFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsRepository, "gpsRepository");
        this.gpsRepository = gpsRepository;
        this.gpsDetailList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.df = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.df1 = new java.text.DecimalFormat("0.00", new java.text.DecimalFormatSymbols(java.util.Locale.US));
        this.df.setRoundingMode(java.math.RoundingMode.HALF_UP);
        this.df1.setRoundingMode(java.math.RoundingMode.HALF_UP);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> getGpsDetailList() {
        return this.gpsDetailList;
    }

    public final void setGpsDetailList(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.gpsDetailList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.GpsDetailUI> getUiState() {
        return this._uiState;
    }

    public final void queryDetailByDate(final com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel$queryDetailByDate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel dayGpsFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.gps.GpsRepository gpsRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayGpsFragmentViewModel, "$this$ktxRunOnBgSingle");
                gpsRepository = dayGpsFragmentViewModel.gpsRepository;
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> queryGpsDetailByDate = gpsRepository.queryGpsDetailByDate(com.qcwireless.qc_utils.date.DateUtil.this);
                if (queryGpsDetailByDate != null) {
                    dayGpsFragmentViewModel.getGpsDetailList().clear();
                    dayGpsFragmentViewModel.getGpsDetailList().addAll(queryGpsDetailByDate);
                    dayGpsFragmentViewModel.calcTotalData(queryGpsDetailByDate);
                } else {
                    dayGpsFragmentViewModel.getGpsDetailList().clear();
                    mutableLiveData = dayGpsFragmentViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.GpsDetailUI("0", "0", "0", "0"));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calcTotalData(java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail> data) {
        float parseFloat;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        for (com.qcwireless.qcwatch.ui.base.repository.entity.GpsDetail gpsDetail : data) {
            i2 += (gpsDetail.getDuration() / 1000) * 1000;
            i += kotlin.math.MathKt.roundToInt(gpsDetail.getCalorie());
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getMetric()) {
                java.lang.String format = this.df.format(java.lang.Float.valueOf(gpsDetail.getDistance() / 1000));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(item.distance/1000)");
                parseFloat = java.lang.Float.parseFloat(format);
            } else {
                java.lang.String format2 = this.df.format(java.lang.Float.valueOf(com.qcwireless.qcwatch.base.utils.MetricUtilsKt.kmToIn(gpsDetail.getDistance() / 1000)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "df.format(kmToIn(item.distance/1000))");
                parseFloat = java.lang.Float.parseFloat(format2);
            }
            f += parseFloat;
        }
        androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.GpsDetailUI> mutableLiveData = this._uiState;
        java.lang.String format3 = this.df1.format(java.lang.Float.valueOf(f));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "df1.format(totalDistance)");
        java.lang.String valueOf = java.lang.String.valueOf(data.size());
        java.lang.String valueOf2 = java.lang.String.valueOf(i);
        java.lang.String minsToHHmmdd = com.qcwireless.qc_utils.date.DateUtil.minsToHHmmdd(i2 / 1000);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minsToHHmmdd, "minsToHHmmdd(totalDuring/1000)");
        mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.gps.day.DayGpsFragmentViewModel.GpsDetailUI(format3, valueOf, valueOf2, minsToHHmmdd));
    }

    /* compiled from: DayGpsFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/gps/day/DayGpsFragmentViewModel$GpsDetailUI;", "", "totalDistance", "", "totalTime", "totalCalorie", "totalDuring", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTotalCalorie", "()Ljava/lang/String;", "getTotalDistance", "getTotalDuring", "getTotalTime", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class GpsDetailUI {
        private final java.lang.String totalCalorie;
        private final java.lang.String totalDistance;
        private final java.lang.String totalDuring;
        private final java.lang.String totalTime;

        public GpsDetailUI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "totalDistance");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "totalTime");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "totalCalorie");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "totalDuring");
            this.totalDistance = str;
            this.totalTime = str2;
            this.totalCalorie = str3;
            this.totalDuring = str4;
        }

        public final java.lang.String getTotalCalorie() {
            return this.totalCalorie;
        }

        public final java.lang.String getTotalDistance() {
            return this.totalDistance;
        }

        public final java.lang.String getTotalDuring() {
            return this.totalDuring;
        }

        public final java.lang.String getTotalTime() {
            return this.totalTime;
        }
    }
}
