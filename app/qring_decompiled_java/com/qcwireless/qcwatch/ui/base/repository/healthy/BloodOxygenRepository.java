package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: BloodOxygenRepository.kt */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ!\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u001c\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0+0*H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository;", "", "()V", "bloodOxygenDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcBloodOxygenDao;", "bloodOxygenManualDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/ManualBloodOxygenDao;", "deleteData", "", "downBoFromServer", "uid", "", "lastSyncId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryBloodOxygenByDate", "", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodOxygenLineChartView$DataBean;", "mac", "", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "queryBloodOxygenByDateDetail", "Lcom/qcwireless/qcwatch/ui/home/bloodoxgen/bean/BloodOxyDetailBean;", "queryLastBloodOxygen", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodOxygenLineChartHomeView$DataBean;", "queryLastBloodOxygenDate", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/BloodOxygenEntity;", "queryLastManualBloodOxygenDate", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/BloodOxygenManualEntity;", "queryManualBloodOxygen", "", "queryManualBloodOxygenAll", "saveManualBloodOxygen", "manualTime", "", "bloodOxygen", "syncAutoBloodOxygen", "offset", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "Lcom/oudmon/ble/base/communication/rsp/ReadBlePressureRsp;", "updateBloodOxygenDetailToServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodOxygenRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository m541invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao bloodOxygenDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcBloodOxygenDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao bloodOxygenManualDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).manualBloodOxygenDao();

    public final void saveManualBloodOxygen(final int manualTime, final int bloodOxygen) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$saveManualBloodOxygen$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenRepository, "$this$ktxRunOnBgSingle");
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(manualTime, true);
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity bloodOxygenManualEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity(deviceAddressNoClear, y_m_d, bloodOxygen, manualTime);
                manualBloodOxygenDao = bloodOxygenRepository.bloodOxygenManualDao;
                manualBloodOxygenDao.insert(bloodOxygenManualEntity);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryManualBloodOxygen(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao = this.bloodOxygenManualDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return manualBloodOxygenDao.queryDataLimit(deviceAddressNoClear, y_m_d);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity> queryManualBloodOxygenAll(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao = this.bloodOxygenManualDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return manualBloodOxygenDao.queryDataAll(deviceAddressNoClear, y_m_d);
    }

    public final void deleteData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$deleteData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.ManualBloodOxygenDao manualBloodOxygenDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenRepository, "$this$ktxRunOnBgSingleAnother");
                manualBloodOxygenDao = bloodOxygenRepository.bloodOxygenManualDao;
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryByDate = manualBloodOxygenDao.queryByDate(deviceAddressNoClear, y_m_d);
                if (queryByDate != null) {
                    manualBloodOxygenDao2 = bloodOxygenRepository.bloodOxygenManualDao;
                    manualBloodOxygenDao2.delete(queryByDate);
                }
            }
        });
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean> queryLastBloodOxygen(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity queryBloodOxygenByDateDesc = this.bloodOxygenDao.queryBloodOxygenByDateDesc(mac);
        if (queryBloodOxygenByDateDesc != null) {
            java.lang.String maxArray = queryBloodOxygenByDateDesc.getMaxArray();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Integer>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$queryLastBloodOxygen$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list = (java.util.List) adapter.fromJson(maxArray);
            java.lang.String minArray = queryBloodOxygenByDateDesc.getMinArray();
            com.squareup.moshi.JsonAdapter adapter2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Integer>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$queryLastBloodOxygen$$inlined$fromJson$2
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list2 = (java.util.List) adapter2.fromJson(minArray);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean(i * 3600, ((java.lang.Number) list2.get(i)).intValue(), intValue, (int) queryBloodOxygenByDateDesc.getUnixTime()));
                    i++;
                }
            }
        }
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryDataLimitLast = this.bloodOxygenManualDao.queryDataLimitLast(mac);
        if (((queryDataLimitLast == null || queryDataLimitLast.getTimestamp() <= 0) ? 0 : queryDataLimitLast.getTimestamp()) > (arrayList.size() > 0 ? (int) new com.qcwireless.qc_utils.date.DateUtil(((com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean) arrayList.get(arrayList.size() - 1)).getUnixTime(), true).getUnixTimestamp() : 0) && queryDataLimitLast != null) {
            arrayList.clear();
            arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartHomeView.DataBean(28800, queryDataLimitLast.getBloodOxygen(), queryDataLimitLast.getBloodOxygen(), queryDataLimitLast.getTimestamp()));
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean> queryBloodOxygenByDate(java.lang.String mac, com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao = this.bloodOxygenDao;
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity queryBloodOxygenByDate = qcBloodOxygenDao.queryBloodOxygenByDate(mac, y_m_d);
        if (queryBloodOxygenByDate != null) {
            java.lang.String maxArray = queryBloodOxygenByDate.getMaxArray();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Integer>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$queryBloodOxygenByDate$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list = (java.util.List) adapter.fromJson(maxArray);
            java.lang.String minArray = queryBloodOxygenByDate.getMinArray();
            com.squareup.moshi.JsonAdapter adapter2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Integer>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$queryBloodOxygenByDate$$inlined$fromJson$2
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list2 = (java.util.List) adapter2.fromJson(minArray);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QBloodOxygenLineChartView.DataBean(i * 3600, ((java.lang.Number) list2.get(i)).intValue(), intValue));
                    i++;
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean> queryBloodOxygenByDateDetail(java.lang.String mac, com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao = this.bloodOxygenDao;
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity queryBloodOxygenByDate = qcBloodOxygenDao.queryBloodOxygenByDate(mac, y_m_d);
        if (queryBloodOxygenByDate != null) {
            java.lang.String maxArray = queryBloodOxygenByDate.getMaxArray();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Integer>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$queryBloodOxygenByDateDetail$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list = (java.util.List) adapter.fromJson(maxArray);
            java.lang.String minArray = queryBloodOxygenByDate.getMinArray();
            com.squareup.moshi.JsonAdapter adapter2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends java.lang.Integer>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$queryBloodOxygenByDateDetail$$inlined$fromJson$2
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List list2 = (java.util.List) adapter2.fromJson(minArray);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    if (intValue > 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                        arrayList.add(new com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean(i * 3600, ((java.lang.Number) list2.get(i)).intValue(), intValue));
                    }
                    i = i2;
                }
            }
        }
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$queryBloodOxygenByDateDetail$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean) t2).getSeconds()), java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.home.bloodoxgen.bean.BloodOxyDetailBean) t).getSeconds()));
                }
            });
        }
        return arrayList;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity queryLastBloodOxygenDate() {
        return this.bloodOxygenDao.queryBloodOxygenByDateDesc(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenManualEntity queryLastManualBloodOxygenDate() {
        return this.bloodOxygenManualDao.queryDataLimitLast(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final void syncAutoBloodOxygen(int offset, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().syncBloodOxygen(offset, new com.oudmon.ble.base.communication.ILargeDataResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ILargeDataResponse
            public final void parseData(int i, byte[] bArr) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.m540syncAutoBloodOxygen$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.this, result, i, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncAutoBloodOxygen$lambda-1, reason: not valid java name */
    public static final void m540syncAutoBloodOxygen$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, int i, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (i == 42) {
            int bytesToInt = com.oudmon.ble.base.communication.utils.ByteUtil.bytesToInt(java.util.Arrays.copyOfRange(bArr, 2, 4)) / 49;
            int i2 = 0;
            while (i2 < bytesToInt) {
                int i3 = (i2 * 49) + 6;
                i2++;
                byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, i3, (i2 * 49) + 6);
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, copyOfRange);
                final com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
                final java.util.ArrayList arrayList = new java.util.ArrayList();
                final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int length = copyOfRange.length;
                for (int i4 = 0; i4 < length; i4++) {
                    if (i4 == 0) {
                        dateUtil.addDay(-copyOfRange[0]);
                    } else if (i4 % 2 == 0) {
                        arrayList2.add(java.lang.Integer.valueOf(copyOfRange[i4]));
                    } else {
                        arrayList.add(java.lang.Integer.valueOf(copyOfRange[i4]));
                    }
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(bloodOxygenRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$syncAutoBloodOxygen$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository2) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenRepository2, "$this$ktxRunOnBgSingle");
                        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity bloodOxygenEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity(deviceAddressNoClear, y_m_d, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(arrayList2), com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(arrayList), com.qcwireless.qc_utils.date.DateUtil.this.getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                        qcBloodOxygenDao = bloodOxygenRepository2.bloodOxygenDao;
                        qcBloodOxygenDao.insert(bloodOxygenEntity);
                    }
                });
            }
            if (bytesToInt == 0) {
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(bloodOxygenRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$syncAutoBloodOxygen$1$2
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository bloodOxygenRepository2) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao;
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodOxygenRepository2, "$this$ktxRunOnBgSingle");
                        qcBloodOxygenDao = bloodOxygenRepository2.bloodOxygenDao;
                        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity queryBloodOxygenByDate = qcBloodOxygenDao.queryBloodOxygenByDate(deviceAddressNoClear, y_m_d);
                        if (queryBloodOxygenByDate != null) {
                            qcBloodOxygenDao2 = bloodOxygenRepository2.bloodOxygenDao;
                            qcBloodOxygenDao2.delete(queryBloodOxygenByDate);
                        }
                    }
                });
            }
            baseDeviceResult.result(0, new com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp());
        }
    }

    public final java.lang.Object updateBloodOxygenDetailToServer(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$updateBloodOxygenDetailToServer$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$updateBloodOxygenDetailToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$updateBloodOxygenDetailToServer$4(null));
    }

    public final java.lang.Object downBoFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$downBoFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$downBoFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$downBoFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository$downBoFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.Spo2DownResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.Spo2DownResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.Spo2DownResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodOxygenDao qcBloodOxygenDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.Spo2DownResp spo2DownResp : isSuccess) {
                            com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity bloodOxygenEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodOxygenEntity(spo2DownResp.getDeviceAddress(), spo2DownResp.getDateStr(), com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(spo2DownResp.getMinValue()), com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(spo2DownResp.getMaxValue()), com.qcwireless.qc_utils.date.DateUtil.parse(spo2DownResp.getDateStr(), com.qcwireless.qc_utils.date.DateUtil.DateFormater.dFyyyyMMdd).getZeroTime(), true, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            if ((bloodOxygenEntity.getDeviceAddress().length() > 0) && (!spo2DownResp.getMinValue().isEmpty())) {
                                qcBloodOxygenDao = com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.this.bloodOxygenDao;
                                qcBloodOxygenDao.insert(bloodOxygenEntity);
                            }
                        }
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* compiled from: BloodOxygenRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodOxygenRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.BloodOxygenRepository.getInstance$delegate.getValue();
        }
    }
}
