package com.qcwireless.qcwatch.ui.home.sport.day;

/* compiled from: DaySportFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f¨\u0006 "}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "sportPlusRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;)V", "_lastDate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qc_utils/date/DateUtil;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragmentViewModel$DaySportUI;", "df", "Ljava/text/DecimalFormat;", "lastDate", "Landroidx/lifecycle/LiveData;", "getLastDate", "()Landroidx/lifecycle/LiveData;", "sportDetailList", "", "Lcom/qcwireless/qcwatch/ui/home/sport/bean/SportDetail;", "getSportDetailList", "()Ljava/util/List;", "setSportDetailList", "(Ljava/util/List;)V", "uiState", "getUiState", "calcSportTotal", "", "", "daySportPlusDetail", "start", "queryLastData", "DaySportUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class DaySportFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qc_utils.date.DateUtil> _lastDate;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI> _uiState;
    private java.text.DecimalFormat df;
    private java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> sportDetailList;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;

    public DaySportFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPlusRepository, "sportPlusRepository");
        this.sportPlusRepository = sportPlusRepository;
        this.sportDetailList = new java.util.ArrayList();
        this.df = new java.text.DecimalFormat("0");
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._lastDate = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> getSportDetailList() {
        return this.sportDetailList;
    }

    public final void setSportDetailList(java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sportDetailList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qc_utils.date.DateUtil> getLastDate() {
        return this._lastDate;
    }

    public final void daySportPlusDetail(final com.qcwireless.qc_utils.date.DateUtil start) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel$daySportPlusDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel daySportFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySportFragmentViewModel, "$this$ktxRunOnBgSingle");
                sportPlusRepository = daySportFragmentViewModel.sportPlusRepository;
                com.qcwireless.qc_utils.date.DateUtil dateUtil = com.qcwireless.qc_utils.date.DateUtil.this;
                java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> querySportPlus = sportPlusRepository.querySportPlus(dateUtil, dateUtil);
                java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> list = querySportPlus;
                if (!list.isEmpty()) {
                    daySportFragmentViewModel.getSportDetailList().clear();
                    daySportFragmentViewModel.getSportDetailList().addAll(list);
                    daySportFragmentViewModel.calcSportTotal(querySportPlus);
                } else {
                    daySportFragmentViewModel.getSportDetailList().clear();
                    mutableLiveData = daySportFragmentViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI("00:00:00", "0", "0", "0"));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calcSportTotal(java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> sportDetailList) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i = 0;
        int i2 = 0;
        for (com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail : sportDetailList) {
            i += sportDetail.getDuration();
            i2 += ((int) sportDetail.getCalorie()) / 1000;
            java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil(sportDetail.getStartTime(), true).getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil(item.startTime,true).y_M_D");
            linkedHashMap.put(y_m_d, 1);
        }
        this.df.setRoundingMode(java.math.RoundingMode.DOWN);
        androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI> mutableLiveData = this._uiState;
        java.lang.String minsToHHmmdd = com.qcwireless.qc_utils.date.DateUtil.minsToHHmmdd(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minsToHHmmdd, "minsToHHmmdd(sportTime)");
        java.lang.String valueOf = java.lang.String.valueOf(sportDetailList.size());
        java.lang.String format = this.df.format(java.lang.Integer.valueOf(i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(calories)");
        mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI(minsToHHmmdd, valueOf, format, java.lang.String.valueOf(linkedHashMap.keySet().size())));
    }

    public final void queryLastData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel$queryLastData$1(this, null), 3, (java.lang.Object) null);
    }

    /* compiled from: DaySportFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/day/DaySportFragmentViewModel$DaySportUI;", "", "sportTimes", "", "sportCounts", "sportCalorie", "days", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDays", "()Ljava/lang/String;", "getSportCalorie", "getSportCounts", "getSportTimes", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class DaySportUI {
        private final java.lang.String days;
        private final java.lang.String sportCalorie;
        private final java.lang.String sportCounts;
        private final java.lang.String sportTimes;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI copy$default(com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI daySportUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = daySportUI.sportTimes;
            }
            if ((i & 2) != 0) {
                str2 = daySportUI.sportCounts;
            }
            if ((i & 4) != 0) {
                str3 = daySportUI.sportCalorie;
            }
            if ((i & 8) != 0) {
                str4 = daySportUI.days;
            }
            return daySportUI.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSportTimes() {
            return this.sportTimes;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSportCounts() {
            return this.sportCounts;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSportCalorie() {
            return this.sportCalorie;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDays() {
            return this.days;
        }

        public final com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI copy(java.lang.String sportTimes, java.lang.String sportCounts, java.lang.String sportCalorie, java.lang.String days) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportTimes, "sportTimes");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportCounts, "sportCounts");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportCalorie, "sportCalorie");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "days");
            return new com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI(sportTimes, sportCounts, sportCalorie, days);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI daySportUI = (com.qcwireless.qcwatch.ui.home.sport.day.DaySportFragmentViewModel.DaySportUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sportTimes, daySportUI.sportTimes) && kotlin.jvm.internal.Intrinsics.areEqual(this.sportCounts, daySportUI.sportCounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.sportCalorie, daySportUI.sportCalorie) && kotlin.jvm.internal.Intrinsics.areEqual(this.days, daySportUI.days);
        }

        public int hashCode() {
            return (((((this.sportTimes.hashCode() * 31) + this.sportCounts.hashCode()) * 31) + this.sportCalorie.hashCode()) * 31) + this.days.hashCode();
        }

        public java.lang.String toString() {
            return "DaySportUI(sportTimes=" + this.sportTimes + ", sportCounts=" + this.sportCounts + ", sportCalorie=" + this.sportCalorie + ", days=" + this.days + ')';
        }

        public DaySportUI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "sportTimes");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "sportCounts");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "sportCalorie");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "days");
            this.sportTimes = str;
            this.sportCounts = str2;
            this.sportCalorie = str3;
            this.days = str4;
        }

        public final java.lang.String getSportTimes() {
            return this.sportTimes;
        }

        public final java.lang.String getSportCounts() {
            return this.sportCounts;
        }

        public final java.lang.String getSportCalorie() {
            return this.sportCalorie;
        }

        public final java.lang.String getDays() {
            return this.days;
        }
    }
}
