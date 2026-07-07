package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: HeartRateDetailRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010 \u001a\u0004\u0018\u00010\u0017J\b\u0010!\u001a\u0004\u0018\u00010\"J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bJ\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170%2\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(H\u0002J\u0016\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\nJ&\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00020(01H\u0002J'\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020(01H\u0086@ø\u0001\u0000¢\u0006\u0002\u00104J\u000e\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u000207J\u0016\u00105\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\n2\u0006\u00106\u001a\u000207J\u001c\u00109\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020(01J\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0<0;H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010=R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository;", "", "()V", "appManualHeartRateDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcAppManualHeartDao;", "heartRateDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcHeartRateDetailDao;", "historyDate", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "manualHeartRateDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcManualHeartDao;", "deleteData", "", "downHeartRateDetailFromServer", "uid", "", "lastSyncId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTimeZone", "", "queryAppHeartLast", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/AppHeartEntity;", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "queryAppHeartRateByDateDetailResp", "", "Lcom/qcwireless/qcwatch/ui/home/heart/bean/HeartRateDetailBean;", "queryHeartDetail", "Lcom/qcwireless/qcwatch/ui/base/view/QHeartLineChartView$HeartDataBean;", "queryHeartRateByDateDetailResp", "queryLastAppHeartManual", "queryLastData", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/HeartRateDetail;", "queryLastHeartDetail", "queryManualAppHeart", "", "saveHeartRate", "heartResp", "Lcom/oudmon/ble/base/communication/rsp/ReadHeartRateRsp;", "saveHeartRateToday", "saveManualHeartRate", "dataTime", "value", "syncHeartRateDetail", "key", "time", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "syncHistoryHeartDetail", "deviceAddress", "(Ljava/lang/String;Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncManualHeartRate", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/oudmon/ble/base/communication/bigData/resp/ILargeDataManualHeartRateResponse;", "offset", "syncTodayHeartRate", "updateHeartRateDetailToServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class HeartRateDetailRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository m552invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao heartRateDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcHeartRateDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao manualHeartRateDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcManualHeartDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao appManualHeartRateDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcAppManualHeartDao();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> historyDate = new java.util.concurrent.ConcurrentHashMap<>();

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> queryHeartDetail(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao qcManualHeartDao = this.manualHeartRateDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity queryByDate = qcManualHeartDao.queryByDate(deviceAddressNoClear, y_m_d);
        com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDetailDao = this.heartRateDao;
        java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d2 = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail queryHeartByDate = qcHeartRateDetailDao.queryHeartByDate(deviceAddressNoClear2, y_m_d2);
        if (queryHeartByDate != null) {
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryHeartByDate.getIndex_str());
            int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryHeartByDate.getValue());
            int length = stringToIntArray.length;
            for (int i = 0; i < length; i++) {
                int i2 = stringToIntArray[i];
                if (stringToIntArray2[i] != 0) {
                    com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(i2 * queryHeartByDate.getIntervar(), stringToIntArray2[i], false, queryHeartByDate.getIntervar());
                    linkedHashMap.put(java.lang.Integer.valueOf(heartDataBean.getMin()), heartDataBean);
                }
            }
        }
        if (queryByDate != null) {
            java.lang.String content = queryByDate.getContent();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$queryHeartDetail$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> list = (java.util.List) adapter.fromJson(content);
            if (list != null) {
                for (com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean detailBean : list) {
                    if (detailBean.getV() != 0) {
                        com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean2 = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(detailBean.getM(), detailBean.getV(), false, 0);
                        linkedHashMap.put(java.lang.Integer.valueOf(heartDataBean2.getMin()), heartDataBean2);
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.values());
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$queryHeartDetail$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean) t).getMin()), java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean) t2).getMin()));
                }
            });
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> queryAppHeartRateByDateDetailResp(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao = this.appManualHeartRateDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        java.util.Iterator<T> it = qcAppManualHeartDao.queryByDate(deviceAddressNoClear, y_m_d).iterator();
        while (it.hasNext()) {
            arrayList.add(new com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean(r1.getTimestamp(), ((com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity) it.next()).getHeart()));
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean> queryHeartRateByDateDetailResp(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao qcManualHeartDao = this.manualHeartRateDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity queryByDate = qcManualHeartDao.queryByDate(deviceAddressNoClear, y_m_d);
        if (queryByDate != null) {
            java.lang.String content = queryByDate.getContent();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$queryHeartRateByDateDetailResp$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> list = (java.util.List) adapter.fromJson(content);
            if (list != null) {
                int i = 0;
                for (com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean detailBean : list) {
                    int i2 = i + 1;
                    if (detailBean.getV() != 0) {
                        if (i >= 1 && ((com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean) list.get(i - 1)).getM() == ((com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean) list.get(i)).getM()) {
                            arrayList.add(new com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean(date.getZeroTime() + (detailBean.getM() * 60) + i, detailBean.getV()));
                        } else {
                            arrayList.add(new com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean(date.getZeroTime() + (detailBean.getM() * 60), detailBean.getV()));
                        }
                    }
                    i = i2;
                }
            }
        }
        com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDetailDao = this.heartRateDao;
        java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d2 = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail queryHeartByDate = qcHeartRateDetailDao.queryHeartByDate(deviceAddressNoClear2, y_m_d2);
        if (queryHeartByDate != null) {
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryHeartByDate.getIndex_str());
            int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryHeartByDate.getValue());
            int length = stringToIntArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = stringToIntArray[i3];
                if (stringToIntArray2[i3] != 0) {
                    arrayList.add(new com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean(date.getZeroTime() + (i4 * queryHeartByDate.getIntervar() * 60), stringToIntArray2[i3]));
                }
            }
        }
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$queryHeartRateByDateDetailResp$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean) t2).getTimestamp()), java.lang.Long.valueOf(((com.qcwireless.qcwatch.ui.home.heart.bean.HeartRateDetailBean) t).getTimestamp()));
                }
            });
        }
        return arrayList;
    }

    public final void syncTodayHeartRate(com.qcwireless.qc_utils.date.DateUtil date, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadHeartRateReq(date.getUnixTimestamp() + ((int) (getTimeZone() * 3600))), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.m551syncTodayHeartRate$lambda3(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.this, result, (com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncTodayHeartRate$lambda-3, reason: not valid java name */
    public static final void m551syncTodayHeartRate$lambda3(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp readHeartRateRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (readHeartRateRsp.getStatus() == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readHeartRateRsp, "it");
            heartRateDetailRepository.saveHeartRateToday(readHeartRateRsp);
            if (readHeartRateRsp.isEndFlag()) {
                baseDeviceResult.result(0, readHeartRateRsp);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readHeartRateRsp, "it");
        baseDeviceResult.result(-1, readHeartRateRsp);
    }

    public final void syncManualHeartRate(int offset, final com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().syncManualHeartRateList(offset, new com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$$ExternalSyntheticLambda2
            @Override // com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse
            public final void manualHeart(com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate manualHeartRate) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.m550syncManualHeartRate$lambda4(com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse.this, this, manualHeartRate);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncManualHeartRate$lambda-4, reason: not valid java name */
    public static final void m550syncManualHeartRate$lambda4(com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse iLargeDataManualHeartRateResponse, com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository, final com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate manualHeartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iLargeDataManualHeartRateResponse, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "this$0");
        iLargeDataManualHeartRateResponse.manualHeart(manualHeartRate);
        final com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        dateUtil.addDay(-manualHeartRate.getIndex());
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(heartRateDetailRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$syncManualHeartRate$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository2) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao qcManualHeartDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository2, "$this$ktxRunOnBgSingle");
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> data = manualHeartRate.getData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "it.data");
                com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity manualHeartEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity(deviceAddressNoClear, y_m_d, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(data));
                qcManualHeartDao = heartRateDetailRepository2.manualHeartRateDao;
                qcManualHeartDao.insert(manualHeartEntity);
            }
        });
    }

    public final void syncManualHeartRate(com.oudmon.ble.base.communication.bigData.resp.ILargeDataManualHeartRateResponse listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
        dateUtil.addDay(-1);
        com.qcwireless.qcwatch.ui.base.repository.dao.QcManualHeartDao qcManualHeartDao = this.manualHeartRateDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = dateUtil.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        if (qcManualHeartDao.queryByDate(deviceAddressNoClear, y_m_d) == null) {
            syncManualHeartRate(255, listener);
        } else {
            syncManualHeartRate(0, listener);
        }
    }

    public final void saveManualHeartRate(final long dataTime, final int value) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$saveManualHeartRate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "$this$ktxRunOnBgSingleAnother");
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(dataTime, true);
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "bean.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity appHeartEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity(deviceAddressNoClear, y_m_d, (int) dataTime, value);
                qcAppManualHeartDao = heartRateDetailRepository.appManualHeartRateDao;
                qcAppManualHeartDao.insert(appHeartEntity);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryLastAppHeartManual() {
        return this.appManualHeartRateDao.queryDataDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHeartRateDetail(final java.lang.String key, long time, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp> result) {
        this.historyDate.remove(key);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadHeartRateReq(time), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.m549syncHeartRateDetail$lambda5(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.this, key, result, (com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncHeartRateDetail$lambda-5, reason: not valid java name */
    public static final void m549syncHeartRateDetail$lambda5(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository, java.lang.String str, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp readHeartRateRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "$key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (readHeartRateRsp.getStatus() == 0) {
            int i = readHeartRateRsp.getmUtcTime();
            heartRateDetailRepository.historyDate.remove(new com.qcwireless.qc_utils.date.DateUtil(i, true).getY_M_D());
            if (i == 0) {
                heartRateDetailRepository.historyDate.remove(str);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readHeartRateRsp, "it");
            heartRateDetailRepository.saveHeartRate(readHeartRateRsp);
            if (!heartRateDetailRepository.historyDate.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> it = heartRateDetailRepository.historyDate.entrySet().iterator();
                if (it.hasNext()) {
                    java.util.Map.Entry<java.lang.String, java.lang.Integer> next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
                    java.lang.String key = next.getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "bean.key");
                    heartRateDetailRepository.syncHeartRateDetail(key, r7.getValue().intValue(), baseDeviceResult);
                    return;
                }
                return;
            }
            baseDeviceResult.result(0, readHeartRateRsp);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readHeartRateRsp, "it");
        baseDeviceResult.result(-1, readHeartRateRsp);
    }

    public final java.lang.Object syncHistoryHeartDetail(java.lang.String str, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp> baseDeviceResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$syncHistoryHeartDetail$2(this, str, null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$syncHistoryHeartDetail$3(this, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$syncHistoryHeartDetail$4
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((java.util.Map<java.lang.String, java.lang.Integer>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(java.util.Map<java.lang.String, java.lang.Integer> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                concurrentHashMap = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.this.historyDate;
                java.util.Iterator it = concurrentHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
                    com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.this;
                    java.lang.Object key = ((java.util.Map.Entry) next).getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "bean.key");
                    heartRateDetailRepository.syncHeartRateDetail((java.lang.String) key, ((java.lang.Number) r4.getValue()).intValue(), baseDeviceResult);
                } else {
                    baseDeviceResult.result(0, new com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp());
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    private final void saveHeartRate(final com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp heartResp) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$saveHeartRate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDetailDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "$this$ktxRunOnBgSingle");
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp.this.getmUtcTime(), true);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                byte[] bArr = com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp.this.getmHeartRateArray();
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    sb.append(i);
                    sb.append(",");
                    int i2 = bArr[i];
                    if (i2 < 0) {
                        i2 = com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(bArr[i]);
                    }
                    sb2.append(i2);
                    sb2.append(",");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateStr.y_M_D");
                int range = com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp.this.getRange();
                java.lang.String sb3 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "indexStr.toString()");
                java.lang.String sb4 = sb2.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "values.toString()");
                com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail heartRateDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail(deviceAddressNoClear, y_m_d, range, sb3, sb4, dateUtil.getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                if (dateUtil.getZeroTime() > 0) {
                    qcHeartRateDetailDao = heartRateDetailRepository.heartRateDao;
                    qcHeartRateDetailDao.insert(heartRateDetail);
                }
            }
        });
    }

    private final void saveHeartRateToday(final com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp heartResp) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$saveHeartRateToday$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDetailDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDetailDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "$this$ktxRunOnBgSingle");
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp.this.getmUtcTime(), true);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                byte[] bArr = com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp.this.getmHeartRateArray();
                int length = bArr.length;
                for (int i = 0; i < length; i++) {
                    sb.append(i);
                    sb.append(",");
                    int i2 = bArr[i];
                    if (i2 < 0) {
                        i2 = com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(bArr[i]);
                    }
                    sb2.append(i2);
                    sb2.append(",");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateStr.y_M_D");
                int range = com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp.this.getRange();
                java.lang.String sb3 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "indexStr.toString()");
                java.lang.String sb4 = sb2.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "values.toString()");
                com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail heartRateDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail(deviceAddressNoClear, y_m_d, range, sb3, sb4, dateUtil.getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                if (dateUtil.getZeroTime() > 0) {
                    qcHeartRateDetailDao2 = heartRateDetailRepository.heartRateDao;
                    qcHeartRateDetailDao2.insert(heartRateDetail);
                    return;
                }
                qcHeartRateDetailDao = heartRateDetailRepository.heartRateDao;
                java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                qcHeartRateDetailDao.delete(new com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail(deviceAddressNoClear2, y_m_d2, com.oudmon.ble.base.communication.rsp.ReadHeartRateRsp.this.getRange(), "", "", new com.qcwireless.qc_utils.date.DateUtil().getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()));
            }
        });
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail queryLastData() {
        return this.heartRateDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean> queryLastHeartDetail() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail queryLastSyncDate = this.heartRateDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        com.qcwireless.qcwatch.ui.base.repository.entity.ManualHeartEntity queryDataDate = this.manualHeartRateDao.queryDataDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        long zeroTime = (queryDataDate == null || queryDataDate.getContent().length() <= 2) ? 0L : com.qcwireless.qc_utils.date.DateUtil.parse(queryDataDate.getDateStr(), com.qcwireless.qc_utils.date.DateUtil.DateFormater.dFyyyyMMdd).getZeroTime();
        long zeroTime2 = queryLastSyncDate != null ? new com.qcwireless.qc_utils.date.DateUtil(queryLastSyncDate.getUnixTime(), true).getZeroTime() : 0L;
        if (zeroTime2 == zeroTime) {
            if (queryLastSyncDate != null) {
                int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryLastSyncDate.getIndex_str());
                int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryLastSyncDate.getValue());
                int length = stringToIntArray.length;
                for (int i = 0; i < length; i++) {
                    int i2 = stringToIntArray[i];
                    if (stringToIntArray2[i] != 0) {
                        com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(i2 * queryLastSyncDate.getIntervar(), stringToIntArray2[i], false, queryLastSyncDate.getIntervar());
                        heartDataBean.setUnixTime(queryLastSyncDate.getUnixTime());
                        linkedHashMap.put(java.lang.Integer.valueOf(heartDataBean.getMin()), heartDataBean);
                    }
                }
            }
            if (queryDataDate != null) {
                java.lang.String content = queryDataDate.getContent();
                com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$queryLastHeartDetail$$inlined$fromJson$1
                }.getType());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
                java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> list = (java.util.List) adapter.fromJson(content);
                if (list != null) {
                    for (com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean detailBean : list) {
                        if (detailBean.getV() != 0) {
                            com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean2 = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(detailBean.getM(), detailBean.getV(), false, 0);
                            heartDataBean2.setUnixTime(com.qcwireless.qc_utils.date.DateUtil.parse(queryDataDate.getDateStr(), com.qcwireless.qc_utils.date.DateUtil.DateFormater.dFyyyyMMdd).getUnixTimestamp());
                            linkedHashMap.put(java.lang.Integer.valueOf(heartDataBean2.getMin()), heartDataBean2);
                        }
                    }
                }
            }
        } else if (zeroTime2 > zeroTime) {
            if (queryLastSyncDate != null) {
                int[] stringToIntArray3 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryLastSyncDate.getIndex_str());
                int[] stringToIntArray4 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryLastSyncDate.getValue());
                int length2 = stringToIntArray3.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = stringToIntArray3[i3];
                    if (stringToIntArray4[i3] != 0) {
                        com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean3 = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(i4 * queryLastSyncDate.getIntervar(), stringToIntArray4[i3], false, queryLastSyncDate.getIntervar());
                        heartDataBean3.setUnixTime(queryLastSyncDate.getUnixTime());
                        linkedHashMap.put(java.lang.Integer.valueOf(heartDataBean3.getMin()), heartDataBean3);
                    }
                }
            }
        } else if (queryDataDate != null) {
            java.lang.String content2 = queryDataDate.getContent();
            com.squareup.moshi.JsonAdapter adapter2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<? extends com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$queryLastHeartDetail$$inlined$fromJson$2
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter2, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List<com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean> list2 = (java.util.List) adapter2.fromJson(content2);
            if (list2 != null) {
                int i5 = 0;
                for (com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean detailBean2 : list2) {
                    int i6 = i5 + 1;
                    if (detailBean2.getV() != 0 && (i5 < 1 || ((com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean) list2.get(i5 - 1)).getM() != ((com.oudmon.ble.base.communication.bigData.bean.ManualHeartRate.DetailBean) list2.get(i5)).getM())) {
                        com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean heartDataBean4 = new com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean(detailBean2.getM(), detailBean2.getV(), false, 0);
                        heartDataBean4.setUnixTime(com.qcwireless.qc_utils.date.DateUtil.parse(queryDataDate.getDateStr(), com.qcwireless.qc_utils.date.DateUtil.DateFormater.dFyyyyMMdd).getUnixTimestamp());
                        linkedHashMap.put(java.lang.Integer.valueOf(heartDataBean4.getMin()), heartDataBean4);
                    }
                    i5 = i6;
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.values());
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$queryLastHeartDetail$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean) t).getMin()), java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.base.view.QHeartLineChartView.HeartDataBean) t2).getMin()));
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTimeZone() {
        return java.util.TimeZone.getDefault().getOffset(java.lang.System.currentTimeMillis()) / 3600000.0f;
    }

    public final java.lang.Object updateHeartRateDetailToServer(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$updateHeartRateDetailToServer$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$updateHeartRateDetailToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$updateHeartRateDetailToServer$4(null));
    }

    public final java.lang.Object downHeartRateDetailFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$downHeartRateDetailFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$downHeartRateDetailFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$downHeartRateDetailFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$downHeartRateDetailFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.HeartRateResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.HeartRateResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.HeartRateResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcHeartRateDetailDao qcHeartRateDetailDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.HeartRateResp heartRateResp : isSuccess) {
                            java.lang.String deviceId = heartRateResp.getDeviceId();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(deviceId);
                            java.lang.String date = heartRateResp.getDate();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(date);
                            int interval = heartRateResp.getInterval() / 60;
                            com.qcwireless.qcwatch.ui.base.bean.response.healthy.HeartRateResp.HeartDetail data = heartRateResp.getData();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(data);
                            java.lang.String intListToString = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(data.getIndexs());
                            com.qcwireless.qcwatch.ui.base.bean.response.healthy.HeartRateResp.HeartDetail data2 = heartRateResp.getData();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(data2);
                            java.lang.String intListToString2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(data2.getValues());
                            java.lang.String date2 = heartRateResp.getDate();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(date2);
                            com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail heartRateDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.HeartRateDetail(deviceId, date, interval, intListToString, intListToString2, new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qc_utils.date.DateUtil.dateY_M_D2Stamp(date2), false).getZeroTime(), true, 0L);
                            qcHeartRateDetailDao = com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.this.heartRateDao;
                            qcHeartRateDetailDao.insert(heartRateDetail);
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

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity> queryManualAppHeart(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao = this.appManualHeartRateDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return qcAppManualHeartDao.queryDataLimit(deviceAddressNoClear, y_m_d);
    }

    public final void deleteData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository$deleteData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository heartRateDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDetailRepository, "$this$ktxRunOnBgSingleAnother");
                qcAppManualHeartDao = heartRateDetailRepository.appManualHeartRateDao;
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity> queryByDate = qcAppManualHeartDao.queryByDate(deviceAddressNoClear, y_m_d);
                if (!queryByDate.isEmpty()) {
                    qcAppManualHeartDao2 = heartRateDetailRepository.appManualHeartRateDao;
                    qcAppManualHeartDao2.deleteList(kotlin.jvm.internal.TypeIntrinsics.asMutableList(queryByDate));
                }
            }
        });
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryAppHeartLast(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.QcAppManualHeartDao qcAppManualHeartDao = this.appManualHeartRateDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return qcAppManualHeartDao.queryLastData(deviceAddressNoClear, y_m_d);
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.AppHeartEntity queryAppHeartLast() {
        return this.appManualHeartRateDao.queryDataDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    /* compiled from: HeartRateDetailRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/HeartRateDetailRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.HeartRateDetailRepository.getInstance$delegate.getValue();
        }
    }
}
