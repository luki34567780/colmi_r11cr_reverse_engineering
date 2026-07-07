package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: PressureRepository.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00102\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017J\u0016\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006J\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020'H\u0002J'\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-J&\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,H\u0002J\u0014\u00101\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository;", "", "()V", "historyDate", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "pressureDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcPressureDetailDao;", "pressureManualDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/ManualPressureDao;", "deleteData", "", "queryAppPressure", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/PressureManualEntity;", "queryLastPressure", "", "Lcom/qcwireless/qcwatch/ui/base/view/QPressureLineChartHomeView$DataBean;", "queryLastPressureDate", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/PressureDetail;", "queryManualPressure", "", "date", "Lcom/qcwireless/qc_utils/date/DateUtil;", "queryManualPressureAll", "queryMonthHistoryPressureByDate", "Lcom/qcwireless/qcwatch/ui/base/view/QPressureMonthHistoryBarChart$StepDataBean;", "start", "end", "queryPressureByDateDetailResp", "Lcom/qcwireless/qcwatch/ui/base/view/QPressureBarChart$PressureDataBean;", "queryWeekHistoryPressureByDate", "Lcom/qcwireless/qcwatch/ui/base/view/QPressureWeekHistoryBarChart$StepDataBean;", "saveManualPressure", "dataTime", "", "value", "savePressure", "heartResp", "Lcom/oudmon/ble/base/communication/rsp/PressureRsp;", "savePressureToday", "syncHistoryPressureDetail", "deviceAddress", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "(Ljava/lang/String;Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncPressureDetail", "key", "offset", "syncTodayPressure", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class PressureRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository m557invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao pressureDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcPressureDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao pressureManualDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).manualPressureDao();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> historyDate = new java.util.concurrent.ConcurrentHashMap<>();

    public final com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail queryLastPressureDate() {
        return this.pressureDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "");
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.StepDataBean> queryWeekHistoryPressureByDate(com.qcwireless.qc_utils.date.DateUtil start, com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(start.getUnixTimestamp(), true);
        dateUtil.setHour(0);
        dateUtil.setMinute(0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail> queryByAddressAndDate = this.pressureDao.queryByAddressAndDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), java.lang.String.valueOf(start.getZeroTime()), java.lang.String.valueOf(end.getUnixTimestamp()));
        for (int i = 0; i < 7; i++) {
            java.lang.String y_m_d = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "tempDate.y_M_D");
            linkedHashMap.put(y_m_d, new com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.StepDataBean(dateUtil.getUnixTimestamp(), 0));
            dateUtil.addDay(1);
        }
        for (com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail pressureDetail : queryByAddressAndDate) {
            java.lang.String dateStr = pressureDetail.getDateStr();
            com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.StepDataBean stepDataBean = (com.qcwireless.qcwatch.ui.base.view.QPressureWeekHistoryBarChart.StepDataBean) linkedHashMap.get(dateStr);
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(pressureDetail.getValue());
            int length = stringToIntArray.length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = stringToIntArray[i4];
                if (stringToIntArray[i4] != 0) {
                    i3 += i5;
                    i2++;
                }
            }
            if (i2 > 0) {
                if (stepDataBean != null) {
                    stepDataBean.setSteps(i3 / i2);
                }
            } else if (stepDataBean != null) {
                stepDataBean.setSteps(0);
            }
            if (stepDataBean != null) {
                linkedHashMap.put(dateStr, stepDataBean);
            }
        }
        return new java.util.ArrayList(linkedHashMap.values());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean> queryMonthHistoryPressureByDate(com.qcwireless.qc_utils.date.DateUtil start, com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(start.getUnixTimestamp(), true);
        dateUtil.setHour(0);
        dateUtil.setMinute(0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail> queryByAddressAndDate = this.pressureDao.queryByAddressAndDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), java.lang.String.valueOf(start.getZeroTime()), java.lang.String.valueOf(end.getUnixTimestamp()));
        int daysOfMonth = com.qcwireless.qc_utils.date.DateUtil.getDaysOfMonth(start.toDate());
        if (1 <= daysOfMonth) {
            int i = 1;
            while (true) {
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "tempDate.y_M_D");
                linkedHashMap.put(y_m_d, new com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean(dateUtil.getUnixTimestamp(), 0));
                dateUtil.addDay(1);
                if (i == daysOfMonth) {
                    break;
                }
                i++;
            }
        }
        for (com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail pressureDetail : queryByAddressAndDate) {
            java.lang.String dateStr = pressureDetail.getDateStr();
            com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean stepDataBean = (com.qcwireless.qcwatch.ui.base.view.QPressureMonthHistoryBarChart.StepDataBean) linkedHashMap.get(dateStr);
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(pressureDetail.getValue());
            int length = stringToIntArray.length;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = stringToIntArray[i4];
                if (stringToIntArray[i4] != 0) {
                    i3 += i5;
                    i2++;
                }
            }
            if (i2 > 0) {
                if (stepDataBean != null) {
                    stepDataBean.setSteps(i3 / i2);
                }
            } else if (stepDataBean != null) {
                stepDataBean.setSteps(0);
            }
            if (stepDataBean != null) {
                linkedHashMap.put(dateStr, stepDataBean);
            }
        }
        return new java.util.ArrayList(linkedHashMap.values());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean> queryPressureByDateDetailResp(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao qcPressureDetailDao = this.pressureDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail queryPressureByDate = qcPressureDetailDao.queryPressureByDate(deviceAddressNoClear, y_m_d);
        if (queryPressureByDate != null) {
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryPressureByDate.getIndex_str());
            int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryPressureByDate.getValue());
            int length = stringToIntArray.length;
            for (int i = 0; i < length; i++) {
                int i2 = stringToIntArray[i];
                if (stringToIntArray2[i] != 0) {
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QPressureBarChart.PressureDataBean(i2 * queryPressureByDate.getIntervar() * 60, stringToIntArray2[i]));
                }
            }
        }
        return arrayList;
    }

    public final void syncTodayPressure(final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.PressureRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.PressureReq((byte) 0), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.m556syncTodayPressure$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.this, result, (com.oudmon.ble.base.communication.rsp.PressureRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncTodayPressure$lambda-0, reason: not valid java name */
    public static final void m556syncTodayPressure$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.PressureRsp pressureRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (pressureRsp.getStatus() == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pressureRsp, "it");
            pressureRepository.savePressureToday(pressureRsp);
            if (pressureRsp.isEndFlag()) {
                baseDeviceResult.result(0, pressureRsp);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pressureRsp, "it");
        baseDeviceResult.result(-1, pressureRsp);
    }

    private final void savePressureToday(final com.oudmon.ble.base.communication.rsp.PressureRsp heartResp) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$savePressureToday$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao qcPressureDetailDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao qcPressureDetailDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "$this$ktxRunOnBgSingle");
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                if (com.oudmon.ble.base.communication.rsp.PressureRsp.this.getPressureArray() == null) {
                    return;
                }
                byte[] pressureArray = com.oudmon.ble.base.communication.rsp.PressureRsp.this.getPressureArray();
                int length = pressureArray.length;
                for (int i = 0; i < length; i++) {
                    sb.append(i);
                    sb.append(",");
                    int i2 = pressureArray[i];
                    if (i2 < 0) {
                        i2 = com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(pressureArray[i]);
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
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                int range = com.oudmon.ble.base.communication.rsp.PressureRsp.this.getRange();
                java.lang.String sb3 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "indexStr.toString()");
                java.lang.String sb4 = sb2.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "values.toString()");
                com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail pressureDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail(deviceAddressNoClear, y_m_d, range, sb3, sb4, dateUtil.getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, pressureDetail);
                if (dateUtil.getZeroTime() > 0) {
                    qcPressureDetailDao2 = pressureRepository.pressureDao;
                    qcPressureDetailDao2.insert(pressureDetail);
                    return;
                }
                qcPressureDetailDao = pressureRepository.pressureDao;
                java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil().y_M_D");
                qcPressureDetailDao.delete(new com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail(deviceAddressNoClear2, y_m_d2, com.oudmon.ble.base.communication.rsp.PressureRsp.this.getRange(), "", "", new com.qcwireless.qc_utils.date.DateUtil().getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp()));
            }
        });
    }

    public final java.lang.Object syncHistoryPressureDetail(java.lang.String str, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.PressureRsp> baseDeviceResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$syncHistoryPressureDetail$2(this, str, null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$syncHistoryPressureDetail$3(this, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$syncHistoryPressureDetail$4
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((java.util.Map<java.lang.String, java.lang.Integer>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(java.util.Map<java.lang.String, java.lang.Integer> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                concurrentHashMap = com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.this.historyDate;
                java.util.Iterator it = concurrentHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
                    java.util.Map.Entry entry = (java.util.Map.Entry) next;
                    com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository = com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.this;
                    java.lang.Object key = entry.getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "bean.key");
                    java.lang.Object value = entry.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "bean.value");
                    pressureRepository.syncPressureDetail((java.lang.String) key, ((java.lang.Number) value).intValue(), baseDeviceResult);
                } else {
                    baseDeviceResult.result(0, new com.oudmon.ble.base.communication.rsp.PressureRsp());
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncPressureDetail(final java.lang.String key, int offset, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.PressureRsp> result) {
        this.historyDate.remove(key);
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.PressureReq((byte) offset), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.m555syncPressureDetail$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.this, key, result, (com.oudmon.ble.base.communication.rsp.PressureRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncPressureDetail$lambda-1, reason: not valid java name */
    public static final void m555syncPressureDetail$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository, java.lang.String str, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.PressureRsp pressureRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "$key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (pressureRsp.getStatus() == 0) {
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
            dateUtil.addDay(-pressureRsp.getOffset());
            pressureRepository.historyDate.remove(dateUtil.getY_M_D());
            if (dateUtil.isToday()) {
                pressureRepository.historyDate.remove(str);
            }
            if (pressureRsp.getOffset() > 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pressureRsp, "it");
                pressureRepository.savePressure(pressureRsp);
            }
            if (!pressureRepository.historyDate.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> it = pressureRepository.historyDate.entrySet().iterator();
                if (it.hasNext()) {
                    java.util.Map.Entry<java.lang.String, java.lang.Integer> next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
                    java.util.Map.Entry<java.lang.String, java.lang.Integer> entry = next;
                    java.lang.String key = entry.getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "bean.key");
                    java.lang.Integer value = entry.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "bean.value");
                    pressureRepository.syncPressureDetail(key, value.intValue(), baseDeviceResult);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pressureRsp, "it");
            baseDeviceResult.result(0, pressureRsp);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pressureRsp, "it");
        baseDeviceResult.result(-1, pressureRsp);
    }

    private final void savePressure(final com.oudmon.ble.base.communication.rsp.PressureRsp heartResp) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$savePressure$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcPressureDetailDao qcPressureDetailDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "$this$ktxRunOnBgSingle");
                com.oudmon.ble.base.util.DateUtil today = com.oudmon.ble.base.communication.rsp.PressureRsp.this.getToday();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                byte[] pressureArray = com.oudmon.ble.base.communication.rsp.PressureRsp.this.getPressureArray();
                int length = pressureArray.length;
                for (int i = 0; i < length; i++) {
                    sb.append(i);
                    sb.append(",");
                    int i2 = pressureArray[i];
                    if (i2 < 0) {
                        i2 = com.oudmon.ble.base.communication.utils.ByteUtil.byteToInt(pressureArray[i]);
                    }
                    sb2.append(i2);
                    sb2.append(",");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = today.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateStr.y_M_D");
                int range = com.oudmon.ble.base.communication.rsp.PressureRsp.this.getRange();
                java.lang.String sb3 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "indexStr.toString()");
                java.lang.String sb4 = sb2.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "values.toString()");
                com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail pressureDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail(deviceAddressNoClear, y_m_d, range, sb3, sb4, today.getZeroTime(), false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                if (today.getZeroTime() > 0) {
                    qcPressureDetailDao = pressureRepository.pressureDao;
                    qcPressureDetailDao.insert(pressureDetail);
                }
            }
        });
    }

    public final void deleteData() {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$deleteData$1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "$this$ktxRunOnBgSingleAnother");
                manualPressureDao = pressureRepository.pressureManualDao;
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity queryByDate = manualPressureDao.queryByDate(deviceAddressNoClear, y_m_d);
                if (queryByDate != null) {
                    manualPressureDao2 = pressureRepository.pressureManualDao;
                    manualPressureDao2.delete(queryByDate);
                }
            }
        });
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity queryAppPressure() {
        return this.pressureManualDao.queryDataLimitLast(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean> queryLastPressure() {
        new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.qcwireless.qcwatch.ui.base.repository.entity.PressureDetail queryLastSyncDate = this.pressureDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "");
        if (queryLastSyncDate != null) {
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryLastSyncDate.getIndex_str());
            int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryLastSyncDate.getValue());
            int length = stringToIntArray.length;
            for (int i = 0; i < length; i++) {
                int i2 = stringToIntArray[i];
                if (stringToIntArray2[i] != 0) {
                    com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean dataBean = new com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean(i2 * queryLastSyncDate.getIntervar() * 60, stringToIntArray2[i], stringToIntArray2[i]);
                    dataBean.setUnixTime((int) queryLastSyncDate.getUnixTime());
                    linkedHashMap.put(java.lang.Integer.valueOf(dataBean.getSeconds() / 60), dataBean);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.values());
        if (arrayList.size() > 1) {
            kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$queryLastPressure$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean) t).getSeconds() / 60), java.lang.Integer.valueOf(((com.qcwireless.qcwatch.ui.base.view.QPressureLineChartHomeView.DataBean) t2).getSeconds() / 60));
                }
            });
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity> queryManualPressure(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao = this.pressureManualDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return manualPressureDao.queryDataLimit(deviceAddressNoClear, y_m_d);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity> queryManualPressureAll(com.qcwireless.qc_utils.date.DateUtil date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao = this.pressureManualDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = date.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
        return manualPressureDao.queryDataAll(deviceAddressNoClear, y_m_d);
    }

    public final void saveManualPressure(final long dataTime, final int value) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingleAnother(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository$saveManualPressure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository pressureRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.ManualPressureDao manualPressureDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pressureRepository, "$this$ktxRunOnBgSingleAnother");
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(dataTime, true);
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity pressureManualEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.PressureManualEntity(deviceAddressNoClear, y_m_d, value, (int) dataTime);
                manualPressureDao = pressureRepository.pressureManualDao;
                manualPressureDao.insert(pressureManualEntity);
                org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
            }
        });
    }

    /* compiled from: PressureRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/PressureRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.PressureRepository.getInstance$delegate.getValue();
        }
    }
}
