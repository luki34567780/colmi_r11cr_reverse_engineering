package com.qcwireless.qcwatch.ui.home.sport.month;

/* compiled from: MonthSportFragmentViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 H\u0002J\u0016\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00140\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00140\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragmentViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "sportPlusRepository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragmentViewModel$MonthSportUI;", "df", "Ljava/text/DecimalFormat;", "listDataChild", "", "", "", "Lcom/qcwireless/qcwatch/ui/home/sport/bean/SportDetail;", "getListDataChild", "()Ljava/util/Map;", "setListDataChild", "(Ljava/util/Map;)V", "mDataListTrees", "Lcom/qcwireless/qcwatch/ui/home/sport/bean/DataListTree;", "getMDataListTrees", "()Ljava/util/List;", "mDataListTreesBackup", "getMDataListTreesBackup", "uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "calcSportTotal", "", "sportDetailList", "", "showMonthData", "start", "Lcom/qcwireless/qc_utils/date/DateUtil;", "end", "MonthSportUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MonthSportFragmentViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI> _uiState;
    private java.text.DecimalFormat df;
    private java.util.Map<java.lang.String, java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> listDataChild;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> mDataListTrees;
    private final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> mDataListTreesBackup;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;

    public MonthSportFragmentViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPlusRepository, "sportPlusRepository");
        this.sportPlusRepository = sportPlusRepository;
        this.listDataChild = new java.util.LinkedHashMap();
        this.mDataListTrees = new java.util.ArrayList();
        this.mDataListTreesBackup = new java.util.ArrayList();
        this.df = new java.text.DecimalFormat("0");
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this.df.setRoundingMode(java.math.RoundingMode.DOWN);
    }

    public final java.util.Map<java.lang.String, java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> getListDataChild() {
        return this.listDataChild;
    }

    public final void setListDataChild(java.util.Map<java.lang.String, java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.listDataChild = map;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> getMDataListTrees() {
        return this.mDataListTrees;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<java.lang.String, com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> getMDataListTreesBackup() {
        return this.mDataListTreesBackup;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI> getUiState() {
        return this._uiState;
    }

    public final void showMonthData(final com.qcwireless.qc_utils.date.DateUtil start, final com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel$showMonthData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel monthSportFragmentViewModel) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthSportFragmentViewModel, "$this$ktxRunOnBgSingle");
                sportPlusRepository = monthSportFragmentViewModel.sportPlusRepository;
                java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> querySportPlus = sportPlusRepository.querySportPlus(com.qcwireless.qc_utils.date.DateUtil.this, end);
                monthSportFragmentViewModel.getListDataChild().clear();
                monthSportFragmentViewModel.getMDataListTrees().clear();
                for (com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail : querySportPlus) {
                    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault());
                    simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("Asia/Shanghai"));
                    long j = 1000;
                    java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> list = monthSportFragmentViewModel.getListDataChild().get(simpleDateFormat.format(new java.util.Date(sportDetail.getStartTime() * j)));
                    if (list != null) {
                        list.add(sportDetail);
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(sportDetail);
                        java.util.Map<java.lang.String, java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> listDataChild = monthSportFragmentViewModel.getListDataChild();
                        java.lang.String format = simpleDateFormat.format(new java.util.Date(sportDetail.getStartTime() * j));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "sdf.format(Date(item.startTime*1000))");
                        listDataChild.put(format, arrayList);
                    }
                }
                for (java.util.Map.Entry<java.lang.String, java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail>> entry : monthSportFragmentViewModel.getListDataChild().entrySet()) {
                    monthSportFragmentViewModel.getMDataListTrees().add(new com.qcwireless.qcwatch.ui.home.sport.bean.DataListTree<>(entry.getKey(), entry.getValue()));
                }
                monthSportFragmentViewModel.calcSportTotal(querySportPlus);
                if (querySportPlus.isEmpty()) {
                    mutableLiveData = monthSportFragmentViewModel._uiState;
                    mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI("00:00:00", "0", "0", "0"));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calcSportTotal(java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> sportDetailList) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i = 0;
        float f = 0.0f;
        for (com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail sportDetail : sportDetailList) {
            i += sportDetail.getDuration();
            f += ((int) sportDetail.getCalorie()) / 1000;
            java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil(sportDetail.getStartTime(), true).getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil(item.startTime, true).y_M_D");
            linkedHashMap.put(y_m_d, 1);
        }
        androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI> mutableLiveData = this._uiState;
        java.lang.String minsToHHmmdd = com.qcwireless.qc_utils.date.DateUtil.minsToHHmmdd(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(minsToHHmmdd, "minsToHHmmdd(sportTime)");
        java.lang.String valueOf = java.lang.String.valueOf(sportDetailList.size());
        java.lang.String format = this.df.format(java.lang.Float.valueOf(f));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "df.format(calories)");
        mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI(minsToHHmmdd, valueOf, format, java.lang.String.valueOf(linkedHashMap.keySet().size())));
    }

    /* compiled from: MonthSportFragmentViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/sport/month/MonthSportFragmentViewModel$MonthSportUI;", "", "sportTimes", "", "sportCounts", "sportCalorie", "days", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDays", "()Ljava/lang/String;", "getSportCalorie", "getSportCounts", "getSportTimes", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MonthSportUI {
        private final java.lang.String days;
        private final java.lang.String sportCalorie;
        private final java.lang.String sportCounts;
        private final java.lang.String sportTimes;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI copy$default(com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI monthSportUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = monthSportUI.sportTimes;
            }
            if ((i & 2) != 0) {
                str2 = monthSportUI.sportCounts;
            }
            if ((i & 4) != 0) {
                str3 = monthSportUI.sportCalorie;
            }
            if ((i & 8) != 0) {
                str4 = monthSportUI.days;
            }
            return monthSportUI.copy(str, str2, str3, str4);
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

        public final com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI copy(java.lang.String sportTimes, java.lang.String sportCounts, java.lang.String sportCalorie, java.lang.String days) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportTimes, "sportTimes");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportCounts, "sportCounts");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportCalorie, "sportCalorie");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "days");
            return new com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI(sportTimes, sportCounts, sportCalorie, days);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI monthSportUI = (com.qcwireless.qcwatch.ui.home.sport.month.MonthSportFragmentViewModel.MonthSportUI) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sportTimes, monthSportUI.sportTimes) && kotlin.jvm.internal.Intrinsics.areEqual(this.sportCounts, monthSportUI.sportCounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.sportCalorie, monthSportUI.sportCalorie) && kotlin.jvm.internal.Intrinsics.areEqual(this.days, monthSportUI.days);
        }

        public int hashCode() {
            return (((((this.sportTimes.hashCode() * 31) + this.sportCounts.hashCode()) * 31) + this.sportCalorie.hashCode()) * 31) + this.days.hashCode();
        }

        public java.lang.String toString() {
            return "MonthSportUI(sportTimes=" + this.sportTimes + ", sportCounts=" + this.sportCounts + ", sportCalorie=" + this.sportCalorie + ", days=" + this.days + ')';
        }

        public MonthSportUI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
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
