package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: SleepDetailRepository.kt */
@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0013H\u0002J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J!\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0006H\u0002J\b\u0010\"\u001a\u0004\u0018\u00010\u0010J\b\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010&\u001a\u00020\u0005J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020+J\u0010\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010&\u001a\u00020\u0005J\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010(2\u0006\u0010*\u001a\u00020+J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020/0(2\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020+H\u0002J\u0010\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\u00132\u0006\u00106\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\u00132\u0006\u00106\u001a\u000209H\u0002J&\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0>H\u0002J\u001e\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0>H\u0002J/\u0010?\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0>H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010CJ\u001c\u0010D\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0>J8\u0010E\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00062\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010(H\u0002J\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060L0KH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010MJ\u001d\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060L0KH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010MR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;", "", "()V", "historyDate", "", "", "", "sleepDetailDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSleepDetailDao;", "sleepNewDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSleepNewProtocolDao;", "sleepTotalDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSleepTotalDao;", "calcSleepViewData", "Lcom/qcwireless/qcwatch/ui/home/sleep/bean/SleepViewBean;", "currentDay", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SleepDetail;", "theDayBefore", "deleteNewSleepData", "", "downSleepDetailFromServer", "uid", "", "lastSyncId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downSleepDetailNewProtocolFromServer", "merge", "oldEntity", "newEntity", "parseSleepDetail", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/ReadSleepDetailsRsp;", "parseSleepDetailToday", "dayIndex", "queryLastSleep", "queryLastSleepNewProtocol", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SleepNewProtocol;", "querySleepByDate", "dateStr", "querySleepMonth", "", "Lcom/qcwireless/qcwatch/ui/base/view/QSleepMonthBarView$SleepDataBean;", "start", "Lcom/qcwireless/qc_utils/date/DateUtil;", "querySleepNewProtocol", "dateUtil", "querySleepTotalByDate", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SleepTotalHistory;", "querySleepWeek", "Lcom/qcwireless/qcwatch/ui/base/view/QSleepWeekBarView$SleepDataBean;", "queryWeekSleepByDate", "dateStart", "dateEnd", "saveDownloadSleepToTotal", "sleepBean", "Lcom/qcwireless/qcwatch/ui/base/bean/response/healthy/SleepDetailNewProtocolResp;", "saveSleepNewProtocol", "Lcom/oudmon/ble/base/communication/rsp/SleepNewProtoResp;", "saveSleepToTotal", "syncDeviceSleepDetail", "key", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "syncSleepDetail", "offset", "deviceName", "deviceAddress", "(Ljava/lang/String;Ljava/lang/String;Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncTodaySleepDetail", "toSleepDetail", "date", "interval", "sleepDetailList", "Lcom/oudmon/ble/base/communication/entity/BleSleepDetails;", "updateSleepDetailToServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSleepDetailToServerNewProtocol", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SleepDetailRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository m561invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao sleepDetailDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcSleepDetailDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao sleepTotalDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcSleepTotalDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao sleepNewDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcSleepNewProtocolDao();
    private java.util.Map<java.lang.String, java.lang.Integer> historyDate = new java.util.LinkedHashMap();

    public final com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean querySleepNewProtocol(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean sleepViewBean = new com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean(null, 0, 0, 0, 0, 0L, 0L, com.google.android.gms.internal.fitness.zzab.zzh, null);
        com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao qcSleepNewProtocolDao = this.sleepNewDao;
        java.lang.String y_m_d = dateUtil.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol queryByDate = qcSleepNewProtocolDao.queryByDate(y_m_d, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        if (queryByDate != null) {
            java.lang.String detail = queryByDate.getDetail();
            com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<java.util.List<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean>>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$querySleepNewProtocol$$inlined$fromJson$1
            }.getType());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
            java.util.List<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean> list = (java.util.List) adapter.fromJson(detail);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i3 = 0;
            if (list != null) {
                java.util.ArrayList<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean> arrayList2 = new java.util.ArrayList();
                com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean detailBean = new com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean();
                int i4 = 0;
                for (com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean detailBean2 : list) {
                    int i5 = i4 + 1;
                    if (i4 == 0) {
                        detailBean = detailBean2;
                    }
                    if (i5 < list.size()) {
                        if (detailBean2.getT() == ((com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean) list.get(i5)).getT()) {
                            detailBean.setD(((com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean) list.get(i5)).getD() + ((com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean) list.get(i4)).getD());
                        } else {
                            arrayList2.add(detailBean);
                            detailBean = (com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean) list.get(i5);
                        }
                    } else {
                        arrayList2.add(detailBean);
                    }
                    i4 = i5;
                }
                i = 0;
                i2 = 0;
                int i6 = 0;
                for (com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean detailBean3 : arrayList2) {
                    int i7 = i6 + 1;
                    int t = detailBean3.getT();
                    if (t == 2) {
                        i += detailBean3.getD();
                    } else if (t == 3) {
                        i3 += detailBean3.getD();
                    } else if (t == 5) {
                        i2 += detailBean3.getD();
                    }
                    com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean = new com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean();
                    int t2 = detailBean3.getT();
                    if (t2 == 0 || t2 == 1) {
                        sleepDataBean.setType(4);
                    } else if (t2 == 2) {
                        sleepDataBean.setType(2);
                    } else if (t2 == 3) {
                        sleepDataBean.setType(1);
                    } else if (t2 == 5) {
                        sleepDataBean.setType(3);
                    }
                    if (i6 == 0) {
                        sleepDataBean.setSleepStart(queryByDate.getSt());
                        sleepDataBean.setSleepEnd(queryByDate.getSt() + (detailBean3.getD() * 60));
                        arrayList.add(sleepDataBean);
                    } else {
                        com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean sleepDataBean2 = (com.qcwireless.qcwatch.ui.base.view.QSleepBarChart.SleepDataBean) arrayList.get(i6 - 1);
                        sleepDataBean.setSleepStart(sleepDataBean2.getSleepEnd());
                        sleepDataBean.setSleepEnd(sleepDataBean2.getSleepEnd() + (detailBean3.getD() * 60));
                        arrayList.add(sleepDataBean);
                    }
                    i6 = i7;
                }
            } else {
                i = 0;
                i2 = 0;
            }
            int i8 = i3 * 60;
            int i9 = i * 60;
            int i10 = i2 * 60;
            sleepViewBean.setStartTime(queryByDate.getSt());
            sleepViewBean.setEndTime(queryByDate.getEt());
            sleepViewBean.setTotalSleep(i8 + i9 + i10);
            sleepViewBean.setDeepSleep(i8);
            sleepViewBean.setLightSleep(i9);
            sleepViewBean.setAwakeSleep(i10);
            sleepViewBean.setData(arrayList);
            return sleepViewBean;
        }
        return new com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean(null, 0, 0, 0, 0, 0L, 0L, com.google.android.gms.internal.fitness.zzab.zzh, null);
    }

    public final java.lang.Object syncSleepDetail(java.lang.String str, java.lang.String str2, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp> baseDeviceResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return kotlin.Unit.INSTANCE;
        }
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getNewSleepProtocol()) {
            syncSleepDetail(255, baseDeviceResult);
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$syncSleepDetail$2(this, str2, null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$syncSleepDetail$3(this, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$syncSleepDetail$4
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((java.util.Map<java.lang.String, java.lang.Integer>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(java.util.Map<java.lang.String, java.lang.Integer> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.Map map2;
                java.util.Map map3;
                java.util.Map map4;
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
                dateUtil.addDay(-1);
                map2 = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this.historyDate;
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                map2.put(y_m_d, kotlin.coroutines.jvm.internal.Boxing.boxInt(1));
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this;
                map3 = sleepDetailRepository.historyDate;
                java.util.Map<java.lang.String, java.lang.Integer> sortMapByValue = com.qcwireless.qcwatch.ui.base.util.MapUtils.sortMapByValue(map3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sortMapByValue, "sortMapByValue(historyDate)");
                sleepDetailRepository.historyDate = sortMapByValue;
                map4 = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this.historyDate;
                java.util.Iterator it = map4.entrySet().iterator();
                if (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this.syncDeviceSleepDetail((java.lang.String) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue(), baseDeviceResult);
                } else {
                    baseDeviceResult.result(0, new com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp());
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final void syncTodaySleepDetail(final int dayIndex, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getNewSleepProtocol()) {
            syncSleepDetail(0, result);
        } else {
            com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadSleepDetailsReq(dayIndex, 0, 95), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$$ExternalSyntheticLambda0
                @Override // com.oudmon.ble.base.communication.ICommandResponse
                public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                    com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.m560syncTodaySleepDetail$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this, dayIndex, result, (com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp) baseRspCmd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncTodaySleepDetail$lambda-0, reason: not valid java name */
    public static final void m560syncTodaySleepDetail$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository, int i, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp readSleepDetailsRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (readSleepDetailsRsp.getStatus() == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readSleepDetailsRsp, "it");
            sleepDetailRepository.parseSleepDetailToday(readSleepDetailsRsp, i);
            if (i == 1) {
                baseDeviceResult.result(0, readSleepDetailsRsp);
            }
            if (i == 0) {
                sleepDetailRepository.syncTodaySleepDetail(1, baseDeviceResult);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readSleepDetailsRsp, "it");
        baseDeviceResult.result(-1, readSleepDetailsRsp);
    }

    private final void syncSleepDetail(int offset, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp> result) {
        com.oudmon.ble.base.communication.LargeDataHandler.getInstance().syncSleepList(offset, new com.oudmon.ble.base.communication.ILargeDataSleepResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$$ExternalSyntheticLambda2
            @Override // com.oudmon.ble.base.communication.ILargeDataSleepResponse
            public final void sleepData(com.oudmon.ble.base.communication.rsp.SleepNewProtoResp sleepNewProtoResp) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.m559syncSleepDetail$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this, sleepNewProtoResp);
            }
        });
        result.result(0, new com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncSleepDetail$lambda-1, reason: not valid java name */
    public static final void m559syncSleepDetail$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository, final com.oudmon.ble.base.communication.rsp.SleepNewProtoResp sleepNewProtoResp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "this$0");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(sleepDetailRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$syncSleepDetail$5$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository2, "$this$ktxRunOnBgSingle");
                com.oudmon.ble.base.communication.rsp.SleepNewProtoResp sleepNewProtoResp2 = com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.this;
                if (sleepNewProtoResp2 == null) {
                    sleepDetailRepository2.deleteNewSleepData();
                    return;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sleepNewProtoResp2, "it");
                sleepDetailRepository2.saveSleepNewProtocol(sleepNewProtoResp2);
                com.oudmon.ble.base.communication.rsp.SleepNewProtoResp sleepNewProtoResp3 = com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.this;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sleepNewProtoResp3, "it");
                sleepDetailRepository2.saveSleepToTotal(sleepNewProtoResp3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSleepNewProtocol(com.oudmon.ble.base.communication.rsp.SleepNewProtoResp sleepBean) {
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil(sleepBean.getEt(), true).getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil(sleepBean.et.toLong(), true).y_M_D");
        java.util.List<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean> list = sleepBean.getList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "sleepBean.list");
        this.sleepNewDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol(deviceAddressNoClear, y_m_d, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(list), sleepBean.getSt(), sleepBean.getEt(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteNewSleepData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$deleteNewSleepData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao qcSleepNewProtocolDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao qcSleepTotalDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao qcSleepTotalDao2;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao qcSleepNewProtocolDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "$this$ktxRunOnBgSingle");
                qcSleepNewProtocolDao = sleepDetailRepository.sleepNewDao;
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol queryByDate = qcSleepNewProtocolDao.queryByDate(y_m_d, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                if (queryByDate != null) {
                    qcSleepNewProtocolDao2 = sleepDetailRepository.sleepNewDao;
                    qcSleepNewProtocolDao2.delete(queryByDate);
                }
                qcSleepTotalDao = sleepDetailRepository.sleepTotalDao;
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory queryTotalSleepByAddressAndDate = qcSleepTotalDao.queryTotalSleepByAddressAndDate(deviceAddressNoClear, y_m_d2);
                if (queryTotalSleepByAddressAndDate != null) {
                    qcSleepTotalDao2 = sleepDetailRepository.sleepTotalDao;
                    qcSleepTotalDao2.delete(queryTotalSleepByAddressAndDate);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSleepToTotal(com.oudmon.ble.base.communication.rsp.SleepNewProtoResp sleepBean) {
        java.util.List<com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean> list = sleepBean.getList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "sleepBean.list");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (com.oudmon.ble.base.communication.rsp.SleepNewProtoResp.DetailBean detailBean : list) {
            int t = detailBean.getT();
            if (t == 2) {
                i2 += detailBean.getD();
            } else if (t == 3) {
                i += detailBean.getD();
            } else if (t == 5) {
                i3 += detailBean.getD();
            }
        }
        int i4 = i * 60;
        int i5 = i2 * 60;
        int i6 = i3 * 60;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil(sleepBean.getEt(), true).getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil(sleepBean.et.toLong(), true).y_M_D");
        this.sleepTotalDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory(deviceAddressNoClear, y_m_d, i4 + i5 + i6, i4, i5, i6, sleepBean.getSt(), sleepBean.getEt(), (int) new com.qcwireless.qc_utils.date.DateUtil(sleepBean.getEt(), true).getZeroTime()));
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate(java.lang.String dateStr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        return this.sleepDetailDao.queryByDate(dateStr, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryLastSleep() {
        return this.sleepDetailDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol queryLastSleepNewProtocol() {
        return this.sleepNewDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    private final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory> queryWeekSleepByDate(com.qcwireless.qc_utils.date.DateUtil dateStart, com.qcwireless.qc_utils.date.DateUtil dateEnd) {
        return this.sleepTotalDao.queryByAddressAndDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), java.lang.String.valueOf(dateStart.getZeroTime()), java.lang.String.valueOf(dateEnd.getUnixTimestamp()));
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory querySleepTotalByDate(java.lang.String dateStr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        return this.sleepTotalDao.queryTotalSleepByAddressAndDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), dateStr);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean> querySleepWeek(com.qcwireless.qc_utils.date.DateUtil start) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(start.getUnixTimestamp(), true);
        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(start.getZeroTime() + 86399, true);
        dateUtil2.addDay(6);
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory> queryWeekSleepByDate = queryWeekSleepByDate(start, dateUtil2);
        for (int i = 0; i < 7; i++) {
            java.lang.String y_m_d = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "temp.y_M_D");
            linkedHashMap.put(y_m_d, new com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean(dateUtil.getUnixTimestamp(), 0, 0, 0, 0, 0.0f, 0.0f, 0.0f));
            dateUtil.addDay(1);
        }
        for (com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory sleepTotalHistory : queryWeekSleepByDate) {
            int totalSleep = sleepTotalHistory.getTotalSleep() / 60;
            int deepSleep = sleepTotalHistory.getDeepSleep() / 60;
            int lightSleep = sleepTotalHistory.getLightSleep() / 60;
            int awake = sleepTotalHistory.getAwake() / 60;
            float f = totalSleep;
            com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean sleepDataBean = new com.qcwireless.qcwatch.ui.base.view.QSleepWeekBarView.SleepDataBean(sleepTotalHistory.getUnixTime(), totalSleep, deepSleep, lightSleep, awake, (deepSleep * 1.0f) / f, (lightSleep * 1.0f) / f, (awake * 1.0f) / f);
            java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil(sleepTotalHistory.getUnixTime(), true).getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil(item.unixTime.toLong(), true).y_M_D");
            linkedHashMap.put(y_m_d2, sleepDataBean);
        }
        return new java.util.ArrayList(linkedHashMap.values());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean> querySleepMonth(com.qcwireless.qc_utils.date.DateUtil start) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int daysOfMonth = com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(start.toDate());
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(start.getUnixTimestamp(), true);
        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(start.getZeroTime() + 86399, true);
        dateUtil2.addDay(daysOfMonth - 1);
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory> queryWeekSleepByDate = queryWeekSleepByDate(start, dateUtil2);
        for (int i = 0; i < daysOfMonth; i++) {
            java.lang.String y_m_d = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "temp.y_M_D");
            linkedHashMap.put(y_m_d, new com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean(dateUtil.getUnixTimestamp(), 0, 0, 0, 0, 0.0f, 0.0f, 0.0f));
            dateUtil.addDay(1);
        }
        for (com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory sleepTotalHistory : queryWeekSleepByDate) {
            int totalSleep = sleepTotalHistory.getTotalSleep() / 60;
            int deepSleep = sleepTotalHistory.getDeepSleep() / 60;
            int lightSleep = sleepTotalHistory.getLightSleep() / 60;
            int awake = sleepTotalHistory.getAwake() / 60;
            float f = totalSleep;
            com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean sleepDataBean = new com.qcwireless.qcwatch.ui.base.view.QSleepMonthBarView.SleepDataBean(sleepTotalHistory.getUnixTime(), totalSleep, deepSleep, lightSleep, awake, (deepSleep * 1.0f) / f, (lightSleep * 1.0f) / f, (awake * 1.0f) / f);
            java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil(sleepTotalHistory.getUnixTime(), true).getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil(item.unixTime.toLong(), true).y_M_D");
            linkedHashMap.put(y_m_d2, sleepDataBean);
        }
        return new java.util.ArrayList(linkedHashMap.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncDeviceSleepDetail(final java.lang.String key, int dayIndex, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp> result) {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadSleepDetailsReq(dayIndex, 0, 95), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.m558syncDeviceSleepDetail$lambda3(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this, key, result, (com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceSleepDetail$lambda-3, reason: not valid java name */
    public static final void m558syncDeviceSleepDetail$lambda3(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository, java.lang.String str, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp readSleepDetailsRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "$key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (readSleepDetailsRsp.getStatus() == 0) {
            java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleSleepDetails> bleSleepDetailses = readSleepDetailsRsp.getBleSleepDetailses();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bleSleepDetailses, "list");
            if (!bleSleepDetailses.isEmpty()) {
                sleepDetailRepository.historyDate.remove(new com.qcwireless.qc_utils.date.DateUtil(bleSleepDetailses.get(0).getYear(), bleSleepDetailses.get(0).getMonth(), bleSleepDetailses.get(0).getDay()).getY_M_D());
            } else {
                sleepDetailRepository.historyDate.remove(str);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readSleepDetailsRsp, "it");
            sleepDetailRepository.parseSleepDetail(readSleepDetailsRsp);
            if (!sleepDetailRepository.historyDate.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> it = sleepDetailRepository.historyDate.entrySet().iterator();
                if (it.hasNext()) {
                    java.util.Map.Entry<java.lang.String, java.lang.Integer> next = it.next();
                    sleepDetailRepository.syncDeviceSleepDetail(next.getKey(), next.getValue().intValue(), baseDeviceResult);
                    return;
                }
                return;
            }
            baseDeviceResult.result(0, readSleepDetailsRsp);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readSleepDetailsRsp, "it");
        baseDeviceResult.result(-1, readSleepDetailsRsp);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[LOOP:2: B:23:0x00b0->B:24:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[LOOP:3: B:27:0x00c2->B:28:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c A[LOOP:4: B:34:0x00ff->B:38:0x012c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f A[EDGE_INSN: B:39:0x012f->B:41:0x012f BREAK  A[LOOP:4: B:34:0x00ff->B:38:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean calcSleepViewData(com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail r29, com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail r30) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.calcSleepViewData(com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail, com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail):com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean");
    }

    private final void parseSleepDetailToday(final com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp resultEntity, final int dayIndex) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$parseSleepDetailToday$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao;
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao2;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "$this$ktxRunOnBgSingle");
                java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleSleepDetails> bleSleepDetailses = com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp.this.getBleSleepDetailses();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bleSleepDetailses, "resultEntity.bleSleepDetailses");
                if (bleSleepDetailses.size() > 0) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(bleSleepDetailses.get(0).getYear(), bleSleepDetailses.get(0).getMonth(), bleSleepDetailses.get(0).getDay());
                    if (dateUtil.getZeroTime() > new com.qcwireless.qc_utils.date.DateUtil().getZeroTime()) {
                        return;
                    }
                    qcSleepDetailDao = sleepDetailRepository.sleepDetailDao;
                    java.lang.String y_m_d = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dataDate.y_M_D");
                    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryByDate = qcSleepDetailDao.queryByDate(y_m_d, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                    java.lang.String deviceNameNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceNameNoClear();
                    java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                    java.lang.String y_m_d2 = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "dataDate.y_M_D");
                    sleepDetail = sleepDetailRepository.toSleepDetail(deviceNameNoClear, deviceAddressNoClear, y_m_d2, 900, bleSleepDetailses);
                    if (com.qcwireless.qc_utils.date.DateUtil.isSameDay(dateUtil.toDate(), new java.util.Date())) {
                        if (queryByDate != null) {
                            sleepDetail = sleepDetailRepository.merge(queryByDate, sleepDetail);
                        }
                        qcSleepDetailDao3 = sleepDetailRepository.sleepDetailDao;
                        qcSleepDetailDao3.insert(sleepDetail);
                    } else {
                        qcSleepDetailDao2 = sleepDetailRepository.sleepDetailDao;
                        qcSleepDetailDao2.insert(sleepDetail);
                    }
                    com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
                    dateUtil2.addDay(-1);
                    java.lang.String y_m_d3 = dateUtil2.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d3, "yesDate.y_M_D");
                    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate = sleepDetailRepository.querySleepByDate(y_m_d3);
                    if (querySleepByDate == null) {
                        querySleepByDate = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "", 900, "", "", false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                    }
                    sleepDetailRepository.calcSleepViewData(sleepDetail, querySleepByDate);
                    return;
                }
                if (dayIndex == 0) {
                    com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(sleepDetailRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$parseSleepDetailToday$1.1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                            invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) obj);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository2) {
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao4;
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao qcSleepTotalDao;
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepTotalDao qcSleepTotalDao2;
                            com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao5;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository2, "$this$ktxRunOnBgSingle");
                            qcSleepDetailDao4 = sleepDetailRepository2.sleepDetailDao;
                            java.lang.String y_m_d4 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d4, "DateUtil().y_M_D");
                            com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryByDate2 = qcSleepDetailDao4.queryByDate(y_m_d4, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                            if (queryByDate2 != null) {
                                qcSleepDetailDao5 = sleepDetailRepository2.sleepDetailDao;
                                qcSleepDetailDao5.delete(queryByDate2);
                            }
                            qcSleepTotalDao = sleepDetailRepository2.sleepTotalDao;
                            java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                            java.lang.String y_m_d5 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d5, "DateUtil().y_M_D");
                            com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory queryTotalSleepByAddressAndDate = qcSleepTotalDao.queryTotalSleepByAddressAndDate(deviceAddressNoClear2, y_m_d5);
                            if (queryTotalSleepByAddressAndDate != null) {
                                qcSleepTotalDao2 = sleepDetailRepository2.sleepTotalDao;
                                qcSleepTotalDao2.delete(queryTotalSleepByAddressAndDate);
                            }
                        }
                    });
                }
            }
        });
    }

    private final void parseSleepDetail(final com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp resultEntity) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$parseSleepDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository sleepDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao;
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao2;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDetailRepository, "$this$ktxRunOnBgSingle");
                java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleSleepDetails> bleSleepDetailses = com.oudmon.ble.base.communication.rsp.ReadSleepDetailsRsp.this.getBleSleepDetailses();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bleSleepDetailses, "resultEntity.bleSleepDetailses");
                if (bleSleepDetailses.size() > 0) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(bleSleepDetailses.get(0).getYear(), bleSleepDetailses.get(0).getMonth(), bleSleepDetailses.get(0).getDay());
                    if (dateUtil.getZeroTime() > new com.qcwireless.qc_utils.date.DateUtil().getZeroTime()) {
                        return;
                    }
                    qcSleepDetailDao = sleepDetailRepository.sleepDetailDao;
                    java.lang.String y_m_d = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dataDate.y_M_D");
                    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryByDate = qcSleepDetailDao.queryByDate(y_m_d, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                    java.lang.String deviceNameNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceNameNoClear();
                    java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                    java.lang.String y_m_d2 = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "dataDate.y_M_D");
                    sleepDetail = sleepDetailRepository.toSleepDetail(deviceNameNoClear, deviceAddressNoClear, y_m_d2, 900, bleSleepDetailses);
                    if (com.qcwireless.qc_utils.date.DateUtil.isSameDay(dateUtil.toDate(), new java.util.Date())) {
                        if (queryByDate != null) {
                            sleepDetail = sleepDetailRepository.merge(queryByDate, sleepDetail);
                        }
                        qcSleepDetailDao3 = sleepDetailRepository.sleepDetailDao;
                        qcSleepDetailDao3.insert(sleepDetail);
                    } else {
                        qcSleepDetailDao2 = sleepDetailRepository.sleepDetailDao;
                        qcSleepDetailDao2.insert(sleepDetail);
                    }
                    com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
                    dateUtil2.addDay(-1);
                    java.lang.String y_m_d3 = dateUtil2.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d3, "yesDate.y_M_D");
                    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate = sleepDetailRepository.querySleepByDate(y_m_d3);
                    if (querySleepByDate == null) {
                        querySleepByDate = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "", 900, "", "", false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                    }
                    sleepDetailRepository.calcSleepViewData(sleepDetail, querySleepByDate);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail toSleepDetail(java.lang.String deviceName, java.lang.String deviceAddress, java.lang.String date, int interval, java.util.List<? extends com.oudmon.ble.base.communication.entity.BleSleepDetails> sleepDetailList) {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        if (sleepDetailList != null) {
            for (com.oudmon.ble.base.communication.entity.BleSleepDetails bleSleepDetails : sleepDetailList) {
                int[] sleepQualities = bleSleepDetails.getSleepQualities();
                sparseIntArray.put(bleSleepDetails.getTimeIndex(), (sleepQualities[1] * 100000) + (sleepQualities[2] * 1000) + sleepQualities[3]);
            }
        }
        int size = sparseIntArray.size();
        int[] iArr = new int[size];
        int size2 = sparseIntArray.size();
        for (int i = 0; i < size2; i++) {
            iArr[i] = sparseIntArray.keyAt(i);
        }
        java.util.Arrays.sort(iArr);
        java.lang.String intArrayToString = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr);
        int[] iArr2 = new int[sparseIntArray.size()];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = sparseIntArray.get(iArr[i2]);
        }
        return new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(deviceAddress, date, interval, intArrayToString, com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr2), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail merge(com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail oldEntity, com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail newEntity) {
        int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(oldEntity.getIndex_str());
        int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(oldEntity.getQuality());
        int[] stringToIntArray3 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(newEntity.getIndex_str());
        int[] stringToIntArray4 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(newEntity.getQuality());
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        int length = stringToIntArray.length;
        for (int i = 0; i < length; i++) {
            sparseIntArray.put(stringToIntArray[i], stringToIntArray2[i]);
        }
        int length2 = stringToIntArray3.length;
        for (int i2 = 0; i2 < length2; i2++) {
            sparseIntArray.put(stringToIntArray3[i2], stringToIntArray4[i2]);
        }
        int size = sparseIntArray.size();
        int[] iArr = new int[size];
        int size2 = sparseIntArray.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iArr[i3] = sparseIntArray.keyAt(i3);
        }
        java.util.Arrays.sort(iArr);
        int[] iArr2 = new int[sparseIntArray.size()];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = sparseIntArray.get(iArr[i4]);
        }
        oldEntity.setIndex_str(com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr));
        oldEntity.setQuality(com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr2));
        return oldEntity;
    }

    public final java.lang.Object updateSleepDetailToServer(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServer$4(null));
    }

    public final java.lang.Object updateSleepDetailToServerNewProtocol(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServerNewProtocol$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServerNewProtocol$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$updateSleepDetailToServerNewProtocol$4(null));
    }

    public final java.lang.Object downSleepDetailFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepDetailDao qcSleepDetailDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailResp sleepDetailResp : isSuccess) {
                            java.lang.String deviceId = sleepDetailResp.getDeviceId();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(deviceId);
                            java.lang.String date = sleepDetailResp.getDate();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(date);
                            com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail sleepDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(deviceId, date, sleepDetailResp.getIntervar(), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(sleepDetailResp.getIndexs()), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(sleepDetailResp.getQualitys()), true, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            qcSleepDetailDao = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this.sleepDetailDao;
                            qcSleepDetailDao.insert(sleepDetail);
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

    public final java.lang.Object downSleepDetailNewProtocolFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailNewProtocolFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailNewProtocolFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailNewProtocolFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository$downSleepDetailNewProtocolFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSleepNewProtocolDao qcSleepNewProtocolDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp sleepDetailNewProtocolResp : isSuccess) {
                            java.lang.String str = sleepDetailNewProtocolResp.deviceAddress;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                            java.lang.String str2 = sleepDetailNewProtocolResp.date;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                            java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp.SleepDetail> list = sleepDetailNewProtocolResp.datas;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                            com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol sleepNewProtocol = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepNewProtocol(str, str2, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(list), sleepDetailNewProtocolResp.st, sleepDetailNewProtocolResp.et, true, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            qcSleepNewProtocolDao = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this.sleepNewDao;
                            qcSleepNewProtocolDao.insert(sleepNewProtocol);
                            com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.this.saveDownloadSleepToTotal(sleepDetailNewProtocolResp);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveDownloadSleepToTotal(com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp sleepBean) {
        java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp.SleepDetail> list = sleepBean.datas;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "sleepBean.datas");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.SleepDetailNewProtocolResp.SleepDetail sleepDetail : list) {
            int i4 = sleepDetail.t;
            if (i4 == 2) {
                i2 += sleepDetail.d;
            } else if (i4 == 3) {
                i += sleepDetail.d;
            } else if (i4 == 5) {
                i3 += sleepDetail.d;
            }
        }
        int i5 = i * 60;
        int i6 = i2 * 60;
        int i7 = i3 * 60;
        java.lang.String str = sleepBean.deviceAddress;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "sleepBean.deviceAddress");
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil(sleepBean.et, true).getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil(sleepBean.et.toLong(), true).y_M_D");
        this.sleepTotalDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SleepTotalHistory(str, y_m_d, i5 + i6 + i7, i5, i6, i7, sleepBean.st, sleepBean.et, (int) new com.qcwireless.qc_utils.date.DateUtil(sleepBean.et, true).getZeroTime()));
    }

    /* compiled from: SleepDetailRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SleepDetailRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.getInstance$delegate.getValue();
        }
    }
}
