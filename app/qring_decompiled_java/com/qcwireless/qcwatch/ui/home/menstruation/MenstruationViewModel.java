package com.qcwireless.qcwatch.ui.home.menstruation;

/* compiled from: MenstruationViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u000289B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u001eJ0\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\fH\u0002J\u0006\u00100\u001a\u00020\u001eJ\u0006\u00101\u001a\u00020\u001eJ\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020&J4\u00104\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020)062\u0006\u00107\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00188F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006:"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel;", "Lcom/qcwireless/qcwatch/ui/base/BaseViewModel;", "repository", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/MenstruationRepository;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/MenstruationRepository;)V", "_uiShowState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel$MenstruationShowUI;", "_uiState", "Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel$MenstruationSettingUI;", "alarmList", "", "", "getAlarmList", "()Ljava/util/List;", "setAlarmList", "(Ljava/util/List;)V", "cycleList", "getCycleList", "setCycleList", "duringList", "getDuringList", "setDuringList", "uiShowState", "Landroidx/lifecycle/LiveData;", "getUiShowState", "()Landroidx/lifecycle/LiveData;", "uiState", "getUiState", "addMenstruationData", "", "context", "Landroid/content/Context;", "d", "Lcom/qcwireless/qc_utils/date/DateUtil;", "check", "", "bean", "Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;", "execToDevice", "getSchemeCalendar", "Lcom/haibin/calendarview/Calendar;", "year", "", "month", "day", "color", "text", "initData", "queryMenstruationSetting", "saveMenstruationSetting", "menstruationBean", "showCurrMonth", "map", "", "lastAuntDate", "MenstruationSettingUI", "MenstruationShowUI", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MenstruationViewModel extends com.qcwireless.qcwatch.ui.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI> _uiShowState;
    private final androidx.lifecycle.MutableLiveData<com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI> _uiState;
    private java.util.List<java.lang.String> alarmList;
    private java.util.List<java.lang.String> cycleList;
    private java.util.List<java.lang.String> duringList;
    private final com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository repository;

    public MenstruationViewModel(com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationRepository, "repository");
        this.repository = menstruationRepository;
        this.duringList = new java.util.ArrayList();
        this.cycleList = new java.util.ArrayList();
        this.alarmList = new java.util.ArrayList();
        this._uiState = new androidx.lifecycle.MutableLiveData<>();
        this._uiShowState = new androidx.lifecycle.MutableLiveData<>();
    }

    public final java.util.List<java.lang.String> getDuringList() {
        return this.duringList;
    }

    public final void setDuringList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.duringList = list;
    }

    public final java.util.List<java.lang.String> getCycleList() {
        return this.cycleList;
    }

    public final void setCycleList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cycleList = list;
    }

    public final java.util.List<java.lang.String> getAlarmList() {
        return this.alarmList;
    }

    public final void setAlarmList(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.alarmList = list;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI> getUiState() {
        return this._uiState;
    }

    public final androidx.lifecycle.LiveData<com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI> getUiShowState() {
        return this._uiShowState;
    }

    public final void initData() {
        this.alarmList.clear();
        for (int i = 1; i < 4; i++) {
            this.alarmList.add(java.lang.String.valueOf(i));
        }
        for (int i2 = 2; i2 < 11; i2++) {
            this.duringList.add(java.lang.String.valueOf(i2));
        }
        for (int i3 = 20; i3 < 36; i3++) {
            this.cycleList.add(java.lang.String.valueOf(i3));
        }
    }

    public final void queryMenstruationSetting() {
        launchOnUI(new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel$queryMenstruationSetting$1(this, null));
    }

    public final void execToDevice() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel$execToDevice$1(this, null), 3, (java.lang.Object) null);
    }

    public final void saveMenstruationSetting(com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationBean, "menstruationBean");
        this.repository.addMenstruationFromLastTime(menstruationBean);
    }

    public final void addMenstruationData(final android.content.Context context, final com.qcwireless.qc_utils.date.DateUtil d, final boolean check, final com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean bean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "d");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bean, "bean");
        com.oudmon.ble.base.util.ThreadUtils.postDelay(new com.oudmon.ble.base.util.ThreadUtils.TimeTask() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel$addMenstruationData$1
            @Override // com.oudmon.ble.base.util.ThreadUtils.TimeTask
            protected void task() {
                com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository;
                com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository2;
                com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository3;
                com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository4;
                androidx.lifecycle.MutableLiveData mutableLiveData;
                com.haibin.calendarview.Calendar schemeCalendar;
                com.haibin.calendarview.Calendar schemeCalendar2;
                com.haibin.calendarview.Calendar schemeCalendar3;
                com.haibin.calendarview.Calendar schemeCalendar4;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                menstruationRepository = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.repository;
                boolean addMenstruationData = menstruationRepository.addMenstruationData(d, check, bean);
                menstruationRepository2 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.repository;
                java.util.List<com.qcwireless.qc_utils.date.DateUtil> loadMonthData = menstruationRepository2.loadMonthData(d.getYear(), d.getMonth());
                menstruationRepository3 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.repository;
                com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity queryMaxStartTime = menstruationRepository3.queryMaxStartTime();
                if (queryMaxStartTime != null) {
                    com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.showCurrMonth(context, linkedHashMap, new com.qcwireless.qc_utils.date.DateUtil(queryMaxStartTime.getStartTime(), true), bean);
                }
                menstruationRepository4 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.repository;
                java.util.List<com.qcwireless.qc_utils.date.DateUtil> loadPreData = menstruationRepository4.loadPreData();
                if (loadPreData != null && (!loadPreData.isEmpty())) {
                    int size = loadPreData.size();
                    for (int i = 0; i < size; i++) {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil = loadPreData.get(i);
                        schemeCalendar3 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.getSchemeCalendar(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_1), "1");
                        java.lang.String calendar = schemeCalendar3.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getSchemeCalendar(d2.yea…_show_1), \"1\").toString()");
                        schemeCalendar4 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.getSchemeCalendar(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_1), "1");
                        linkedHashMap.put(calendar, schemeCalendar4);
                    }
                }
                if (loadMonthData != null && (!loadMonthData.isEmpty())) {
                    int size2 = loadMonthData.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = loadMonthData.get(i2);
                        schemeCalendar = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.getSchemeCalendar(dateUtil2.getYear(), dateUtil2.getMonth(), dateUtil2.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_2), "3");
                        java.lang.String calendar2 = schemeCalendar.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar2, "getSchemeCalendar(d2.yea…_show_2), \"3\").toString()");
                        schemeCalendar2 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.getSchemeCalendar(dateUtil2.getYear(), dateUtil2.getMonth(), dateUtil2.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_2), "3");
                        linkedHashMap.put(calendar2, schemeCalendar2);
                    }
                }
                mutableLiveData = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this._uiShowState;
                mutableLiveData.postValue(new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI(addMenstruationData, linkedHashMap));
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCurrMonth(android.content.Context context, java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map, com.qcwireless.qc_utils.date.DateUtil lastAuntDate, com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean bean) {
        int cycle = bean.getCycle();
        int during = bean.getDuring();
        boolean z = false;
        int i = 0;
        while (i < 36) {
            int i2 = i + 1;
            new com.qcwireless.qc_utils.date.DateUtil(lastAuntDate.getTimestamp(), false).addDay(cycle * i2);
            new com.qcwireless.qc_utils.date.DateUtil().setDay(1);
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(lastAuntDate.getTimestamp(), false);
            dateUtil.addDay(i * cycle);
            dateUtil.addDay(-19);
            for (int i3 = 0; i3 < 10; i3++) {
                java.lang.String calendar = getSchemeCalendar(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_1), "1").toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "getSchemeCalendar(d2.yea…_show_1), \"1\").toString()");
                map.put(calendar, getSchemeCalendar(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_1), "1"));
                dateUtil.addDay(1);
            }
            i = i2;
        }
        int i4 = 0;
        while (i4 < 36) {
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(lastAuntDate.getTimestamp(), z);
            i4++;
            dateUtil2.addDay(cycle * i4);
            int i5 = 0;
            while (i5 < during) {
                java.lang.String calendar2 = getSchemeCalendar(dateUtil2.getYear(), dateUtil2.getMonth(), dateUtil2.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_2), "3").toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar2, "getSchemeCalendar(d1.yea…_show_2), \"3\").toString()");
                map.put(calendar2, getSchemeCalendar(dateUtil2.getYear(), dateUtil2.getMonth(), dateUtil2.getDay(), skin.support.content.res.SkinCompatResources.getColor(context, com.qcwireless.qcwatch.R.color.menstruation_show_2), "3"));
                dateUtil2.addDay(1);
                i5++;
                z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.haibin.calendarview.Calendar getSchemeCalendar(int year, int month, int day, int color, java.lang.String text) {
        com.haibin.calendarview.Calendar calendar = new com.haibin.calendarview.Calendar();
        calendar.setYear(year);
        calendar.setMonth(month);
        calendar.setDay(day);
        calendar.setSchemeColor(color);
        calendar.setScheme(text);
        return calendar;
    }

    /* compiled from: MenstruationViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel$MenstruationSettingUI;", "", "entity", "Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;", "(Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;)V", "getEntity", "()Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MenstruationSettingUI {
        private final com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean entity;

        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI copy$default(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI menstruationSettingUI, com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                menstruationBean = menstruationSettingUI.entity;
            }
            return menstruationSettingUI.copy(menstruationBean);
        }

        /* renamed from: component1, reason: from getter */
        public final com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean getEntity() {
            return this.entity;
        }

        public final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI copy(com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean entity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
            return new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI(entity);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI) && kotlin.jvm.internal.Intrinsics.areEqual(this.entity, ((com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationSettingUI) other).entity);
        }

        public int hashCode() {
            return this.entity.hashCode();
        }

        public java.lang.String toString() {
            return "MenstruationSettingUI(entity=" + this.entity + ')';
        }

        public MenstruationSettingUI(com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationBean, "entity");
            this.entity = menstruationBean;
        }

        public final com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean getEntity() {
            return this.entity;
        }
    }

    /* compiled from: MenstruationViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/qcwireless/qcwatch/ui/home/menstruation/MenstruationViewModel$MenstruationShowUI;", "", "comeOrGo", "", "map", "", "", "Lcom/haibin/calendarview/Calendar;", "(ZLjava/util/Map;)V", "getComeOrGo", "()Z", "getMap", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class MenstruationShowUI {
        private final boolean comeOrGo;
        private final java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI copy$default(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI menstruationShowUI, boolean z, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = menstruationShowUI.comeOrGo;
            }
            if ((i & 2) != 0) {
                map = menstruationShowUI.map;
            }
            return menstruationShowUI.copy(z, map);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getComeOrGo() {
            return this.comeOrGo;
        }

        public final java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> component2() {
            return this.map;
        }

        public final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI copy(boolean comeOrGo, java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
            return new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI(comeOrGo, map);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI)) {
                return false;
            }
            com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI menstruationShowUI = (com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.MenstruationShowUI) other;
            return this.comeOrGo == menstruationShowUI.comeOrGo && kotlin.jvm.internal.Intrinsics.areEqual(this.map, menstruationShowUI.map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.comeOrGo;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.map.hashCode();
        }

        public java.lang.String toString() {
            return "MenstruationShowUI(comeOrGo=" + this.comeOrGo + ", map=" + this.map + ')';
        }

        public MenstruationShowUI(boolean z, java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
            this.comeOrGo = z;
            this.map = map;
        }

        public final boolean getComeOrGo() {
            return this.comeOrGo;
        }

        public final java.util.Map<java.lang.String, com.haibin.calendarview.Calendar> getMap() {
            return this.map;
        }
    }
}
