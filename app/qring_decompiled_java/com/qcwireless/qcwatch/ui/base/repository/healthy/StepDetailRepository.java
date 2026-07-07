package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: StepDetailRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u0005J\u0010\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010 \u001a\u00020\u0005J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u0005J\u0010\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020$J&\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0+H\u0002J/\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0+H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010/J\u0014\u00100\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002010+J\u001c\u00102\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0+J@\u00103\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u0002072\u000e\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u001eH\u0002J\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060<0;H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010=R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository;", "", "()V", "historyDate", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "stepDetailDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcStepDetailDao;", "stepTotalDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcStepTotalDao;", "calcStepTotal", "", "stepDetail", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/StepDetail;", "deleteStepDetailError", "detail", "downStepDetailFromServer", "uid", "", "lastSyncId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "merge", "oldEntity", "newEntity", "parseStepDetail", "resultEntity", "Lcom/oudmon/ble/base/communication/rsp/ReadDetailSportDataRsp;", "parseTodayStepDetail", "queryStepDetail", "", "Lcom/qcwireless/qcwatch/ui/base/view/QStepBarChart$StepDataBean;", "date", "queryStepDetailError", "queryStepDetailFifteenMinutes", "queryStepTotal", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/StepTotal;", "saveTotalDate", "stepTotal", "syncDeviceStepDetail", "key", "dayIndex", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "syncHistoryStepDetail", "deviceName", "deviceAddress", "(Ljava/lang/String;Ljava/lang/String;Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncTodayStep", "Lcom/oudmon/ble/base/communication/rsp/TodaySportDataRsp;", "syncTodayStepDetail", "toStepDetail", "deviceId", "interval", "isSync", "", "newStepDetailList", "Lcom/oudmon/ble/base/communication/entity/BleStepDetails;", "updateStepDetailToServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class StepDetailRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository m568invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao stepDetailDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcStepDetailDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao stepTotalDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcStepTotalDao();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> historyDate = new java.util.concurrent.ConcurrentHashMap<>();

    public final com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal queryStepTotal(java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        return this.stepTotalDao.queryTotalStepByAddressAndDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), date);
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail queryStepDetailError(java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        return this.stepDetailDao.queryByDate(date, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final void deleteStepDetailError(com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail detail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        this.stepDetailDao.delete(detail);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> queryStepDetailFifteenMinutes(java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail queryByDate = this.stepDetailDao.queryByDate(date, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        if (queryByDate != null) {
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryByDate.getIndex_str());
            int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryByDate.getCounts());
            int[] stringToIntArray3 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryByDate.getCalories());
            int length = stringToIntArray.length;
            for (int i = 0; i < length; i++) {
                arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean(stringToIntArray[i] * 15 * 60, stringToIntArray2[i], 0, stringToIntArray3[i]));
            }
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean> queryStepDetail(java.lang.String date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail queryByDate = this.stepDetailDao.queryByDate(date, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i = 0;
        if (queryByDate != null) {
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$queryStepDetail$1(this, queryByDate, null), 3, (java.lang.Object) null);
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryByDate.getIndex_str());
            int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryByDate.getCounts());
            int[] stringToIntArray3 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryByDate.getMiles());
            int[] stringToIntArray4 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(queryByDate.getCalories());
            int length = stringToIntArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = (stringToIntArray[i2] * 15) / 60;
                com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean stepDataBean = (com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean) linkedHashMap.get(java.lang.String.valueOf(i3));
                if (stepDataBean != null) {
                    stepDataBean.setSteps(stepDataBean.getSteps() + stringToIntArray2[i2]);
                    stepDataBean.setDistance(stepDataBean.getDistance() + stringToIntArray3[i2]);
                    stepDataBean.setCalorie(stepDataBean.getCalorie() + stringToIntArray4[i2]);
                    linkedHashMap.put(java.lang.String.valueOf(i3), stepDataBean);
                } else {
                    linkedHashMap.put(java.lang.String.valueOf(i3), new com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean(i3 * 3600, stringToIntArray2[i2], stringToIntArray3[i2], stringToIntArray4[i2]));
                }
            }
        }
        while (true) {
            int i4 = i + 1;
            if (linkedHashMap.get(java.lang.String.valueOf(i)) != null) {
                java.lang.Object obj = linkedHashMap.get(java.lang.String.valueOf(i));
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                arrayList.add(i, obj);
            } else {
                arrayList.add(i, new com.qcwireless.qcwatch.ui.base.view.QStepBarChart.StepDataBean(i * 3600, 0, 0, 0));
            }
            if (i4 > 23) {
                return arrayList;
            }
            i = i4;
        }
    }

    public final void syncTodayStep(final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.TodaySportDataRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 72), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.m566syncTodayStep$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.this, result, (com.oudmon.ble.base.communication.rsp.TodaySportDataRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncTodayStep$lambda-0, reason: not valid java name */
    public static final void m566syncTodayStep$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, final com.oudmon.ble.base.communication.rsp.TodaySportDataRsp todaySportDataRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (todaySportDataRsp.getStatus() == 0) {
            final com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(todaySportDataRsp.getSportTotal().getYear(), todaySportDataRsp.getSportTotal().getMonth(), todaySportDataRsp.getSportTotal().getDay());
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(stepDetailRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncTodayStep$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository2) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao2;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository2, "$this$ktxRunOnBgSingle");
                    qcStepTotalDao = stepDetailRepository2.stepTotalDao;
                    java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                    java.lang.String y_m_d = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "d.y_M_D");
                    if (qcStepTotalDao.queryTotalStepByAddressAndDate(deviceAddressNoClear, y_m_d) != null) {
                        qcStepTotalDao3 = stepDetailRepository2.stepTotalDao;
                        java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d2 = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "d.y_M_D");
                        qcStepTotalDao3.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal(deviceAddressNoClear2, y_m_d2, todaySportDataRsp.getSportTotal().getTotalSteps(), todaySportDataRsp.getSportTotal().getWalkDistance(), todaySportDataRsp.getSportTotal().getCalorie(), (int) com.qcwireless.qc_utils.date.DateUtil.this.getUnixTimestamp()));
                    } else {
                        qcStepTotalDao2 = stepDetailRepository2.stepTotalDao;
                        java.lang.String deviceAddressNoClear3 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d3 = com.qcwireless.qc_utils.date.DateUtil.this.getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d3, "d.y_M_D");
                        qcStepTotalDao2.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal(deviceAddressNoClear3, y_m_d3, todaySportDataRsp.getSportTotal().getTotalSteps(), todaySportDataRsp.getSportTotal().getWalkDistance(), todaySportDataRsp.getSportTotal().getCalorie(), (int) com.qcwireless.qc_utils.date.DateUtil.this.getUnixTimestamp()));
                    }
                    com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.TodaySportDataRsp> baseDeviceResult2 = baseDeviceResult;
                    com.oudmon.ble.base.communication.rsp.TodaySportDataRsp todaySportDataRsp2 = todaySportDataRsp;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(todaySportDataRsp2, "it");
                    baseDeviceResult2.result(0, todaySportDataRsp2);
                }
            });
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(todaySportDataRsp, "it");
            baseDeviceResult.result(-1, todaySportDataRsp);
        }
    }

    public final void saveTotalDate(final com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepTotal, "stepTotal");
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$saveTotalDate$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "$this$ktxRunOnBgSingle");
                qcStepTotalDao = stepDetailRepository.stepTotalDao;
                qcStepTotalDao.insert(com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal.this);
            }
        });
    }

    public final java.lang.Object syncHistoryStepDetail(java.lang.String str, java.lang.String str2, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp> baseDeviceResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!com.oudmon.ble.base.bluetooth.BleOperateManager.getInstance().isConnected()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$2(this, str2, null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$3(this, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$4
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((java.util.Map<java.lang.String, java.lang.Integer>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(java.util.Map<java.lang.String, java.lang.Integer> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                concurrentHashMap = com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.this.historyDate;
                java.util.Iterator it = concurrentHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
                    java.util.Map.Entry entry = (java.util.Map.Entry) next;
                    com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository = com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.this;
                    java.lang.Object key = entry.getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "bean.key");
                    java.lang.Object value = entry.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "bean.value");
                    stepDetailRepository.syncDeviceStepDetail((java.lang.String) key, ((java.lang.Number) value).intValue(), baseDeviceResult);
                } else {
                    baseDeviceResult.result(0, new com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp());
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    private final void parseTodayStepDetail(final com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp resultEntity) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$parseTodayStepDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao;
                com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "$this$ktxRunOnBgSingle");
                java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleStepDetails> bleStepDetailses = com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp.this.getBleStepDetailses();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bleStepDetailses, "resultEntity.bleStepDetailses");
                if (bleStepDetailses.size() > 0) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(bleStepDetailses.get(0).getYear(), bleStepDetailses.get(0).getMonth(), bleStepDetailses.get(0).getDay());
                    qcStepDetailDao = stepDetailRepository.stepDetailDao;
                    java.lang.String y_m_d = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dataDate.y_M_D");
                    qcStepDetailDao.queryByDate(y_m_d, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                    java.lang.String deviceNameNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceNameNoClear();
                    java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                    java.lang.String y_m_d2 = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "dataDate.y_M_D");
                    stepDetail = stepDetailRepository.toStepDetail(deviceNameNoClear, deviceAddressNoClear, y_m_d2, 900, false, bleStepDetailses);
                    qcStepDetailDao2 = stepDetailRepository.stepDetailDao;
                    qcStepDetailDao2.insert(stepDetail);
                    return;
                }
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(stepDetailRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$parseTodayStepDetail$1.1
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository2) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao3;
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao;
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao4;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository2, "$this$ktxRunOnBgSingle");
                        qcStepDetailDao3 = stepDetailRepository2.stepDetailDao;
                        java.lang.String y_m_d3 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d3, "DateUtil().y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail queryByDate = qcStepDetailDao3.queryByDate(y_m_d3, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                        if (queryByDate != null) {
                            qcStepDetailDao4 = stepDetailRepository2.stepDetailDao;
                            qcStepDetailDao4.delete(queryByDate);
                        }
                        java.lang.String y_m_d4 = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d4, "DateUtil().y_M_D");
                        com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal queryStepTotal = stepDetailRepository2.queryStepTotal(y_m_d4);
                        if (queryStepTotal == null || queryStepTotal.getStep() != 0) {
                            return;
                        }
                        qcStepTotalDao = stepDetailRepository2.stepTotalDao;
                        qcStepTotalDao.delete(queryStepTotal);
                    }
                });
            }
        });
    }

    private final void parseStepDetail(final com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp resultEntity) {
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$parseStepDetail$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao;
                com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao2;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "$this$ktxRunOnBgSingle");
                java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleStepDetails> bleStepDetailses = com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp.this.getBleStepDetailses();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bleStepDetailses, "resultEntity.bleStepDetailses");
                if (bleStepDetailses.size() > 0) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(bleStepDetailses.get(0).getYear(), bleStepDetailses.get(0).getMonth(), bleStepDetailses.get(0).getDay());
                    qcStepDetailDao = stepDetailRepository.stepDetailDao;
                    java.lang.String y_m_d = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dataDate.y_M_D");
                    com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail queryByDate = qcStepDetailDao.queryByDate(y_m_d, com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                    java.lang.String deviceNameNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceNameNoClear();
                    java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                    java.lang.String y_m_d2 = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "dataDate.y_M_D");
                    stepDetail = stepDetailRepository.toStepDetail(deviceNameNoClear, deviceAddressNoClear, y_m_d2, 900, false, bleStepDetailses);
                    if (com.qcwireless.qc_utils.date.DateUtil.isSameDay(dateUtil.toDate(), new java.util.Date())) {
                        if (queryByDate != null) {
                            stepDetail = stepDetailRepository.merge(queryByDate, stepDetail);
                        }
                        qcStepDetailDao3 = stepDetailRepository.stepDetailDao;
                        qcStepDetailDao3.insert(stepDetail);
                        stepDetailRepository.calcStepTotal(stepDetail);
                        return;
                    }
                    qcStepDetailDao2 = stepDetailRepository.stepDetailDao;
                    qcStepDetailDao2.insert(stepDetail);
                    stepDetailRepository.calcStepTotal(stepDetail);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calcStepTotal(com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail) {
        int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(stepDetail.getIndex_str());
        int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(stepDetail.getCounts());
        int[] stringToIntArray3 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(stepDetail.getMiles());
        int[] stringToIntArray4 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(stepDetail.getCalories());
        int length = stringToIntArray.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = stringToIntArray[i4];
            i += stringToIntArray2[i4];
            i2 += stringToIntArray3[i4];
            i3 += stringToIntArray4[i4];
        }
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qc_utils.date.DateUtil.String2Date("yyyy-MM-dd", stepDetail.getDateStr()));
        com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal stepTotal = new com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal(stepDetail.getDeviceAddress(), stepDetail.getDateStr(), i, i2, i3, (int) dateUtil.getZeroTime());
        if (stepTotal.getStep() > 0 || stepTotal.getCarolie() > 0) {
            com.qcwireless.qcwatch.ui.base.repository.dao.QcStepTotalDao qcStepTotalDao = this.stepTotalDao;
            java.lang.String deviceAddress = stepDetail.getDeviceAddress();
            java.lang.String y_m_d = dateUtil.getY_M_D();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
            com.qcwireless.qcwatch.ui.base.repository.entity.StepTotal queryTotalStepByAddressAndDate = qcStepTotalDao.queryTotalStepByAddressAndDate(deviceAddress, y_m_d);
            if (queryTotalStepByAddressAndDate == null) {
                this.stepTotalDao.insert(stepTotal);
            } else if (queryTotalStepByAddressAndDate.getCarolie() < stepTotal.getCarolie() || queryTotalStepByAddressAndDate.getStep() < stepTotal.getStep() || queryTotalStepByAddressAndDate.getDistance() < stepTotal.getDistance()) {
                this.stepTotalDao.insert(stepTotal);
            }
        }
    }

    public final void syncTodayStepDetail(int dayIndex, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadDetailSportDataReq(dayIndex, 0, 95), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.m567syncTodayStepDetail$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.this, result, (com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncTodayStepDetail$lambda-1, reason: not valid java name */
    public static final void m567syncTodayStepDetail$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp readDetailSportDataRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (readDetailSportDataRsp.getStatus() == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readDetailSportDataRsp, "it");
            stepDetailRepository.parseTodayStepDetail(readDetailSportDataRsp);
            baseDeviceResult.result(0, readDetailSportDataRsp);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readDetailSportDataRsp, "it");
            baseDeviceResult.result(-1, readDetailSportDataRsp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncDeviceStepDetail(final java.lang.String key, int dayIndex, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp> result) {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadDetailSportDataReq(dayIndex, 0, 95), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$$ExternalSyntheticLambda2
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.m565syncDeviceStepDetail$lambda2(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.this, key, result, (com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncDeviceStepDetail$lambda-2, reason: not valid java name */
    public static final void m565syncDeviceStepDetail$lambda2(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository, java.lang.String str, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.ReadDetailSportDataRsp readDetailSportDataRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepDetailRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "$key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (readDetailSportDataRsp.getStatus() == 0) {
            java.util.ArrayList<com.oudmon.ble.base.communication.entity.BleStepDetails> bleStepDetailses = readDetailSportDataRsp.getBleStepDetailses();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bleStepDetailses, "list");
            if (!bleStepDetailses.isEmpty()) {
                stepDetailRepository.historyDate.remove(new com.qcwireless.qc_utils.date.DateUtil(bleStepDetailses.get(0).getYear(), bleStepDetailses.get(0).getMonth(), bleStepDetailses.get(0).getDay()).getY_M_D());
            } else {
                stepDetailRepository.historyDate.remove(str);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readDetailSportDataRsp, "it");
            stepDetailRepository.parseStepDetail(readDetailSportDataRsp);
            if (!stepDetailRepository.historyDate.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> it = stepDetailRepository.historyDate.entrySet().iterator();
                if (it.hasNext()) {
                    java.util.Map.Entry<java.lang.String, java.lang.Integer> next = it.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
                    java.util.Map.Entry<java.lang.String, java.lang.Integer> entry = next;
                    java.lang.String key = entry.getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "bean.key");
                    java.lang.Integer value = entry.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "bean.value");
                    stepDetailRepository.syncDeviceStepDetail(key, value.intValue(), baseDeviceResult);
                    return;
                }
                return;
            }
            baseDeviceResult.result(0, readDetailSportDataRsp);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readDetailSportDataRsp, "it");
        baseDeviceResult.result(-1, readDetailSportDataRsp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail toStepDetail(java.lang.String deviceName, java.lang.String deviceId, java.lang.String date, int interval, boolean isSync, java.util.List<? extends com.oudmon.ble.base.communication.entity.BleStepDetails> newStepDetailList) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        if (newStepDetailList != null) {
            for (com.oudmon.ble.base.communication.entity.BleStepDetails bleStepDetails : newStepDetailList) {
                sparseArray.put(bleStepDetails.getTimeIndex(), new java.lang.Integer[]{java.lang.Integer.valueOf(bleStepDetails.getWalkSteps()), java.lang.Integer.valueOf(bleStepDetails.getDistance()), java.lang.Integer.valueOf(bleStepDetails.getCalorie())});
            }
        }
        int size = interval * sparseArray.size();
        int size2 = sparseArray.size();
        int[] iArr = new int[size2];
        int size3 = sparseArray.size();
        for (int i = 0; i < size3; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        java.util.Arrays.sort(iArr);
        java.lang.String intArrayToString = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr);
        int[] iArr2 = new int[sparseArray.size()];
        int[] iArr3 = new int[sparseArray.size()];
        int[] iArr4 = new int[sparseArray.size()];
        for (int i2 = 0; i2 < size2; i2++) {
            iArr2[i2] = ((java.lang.Integer[]) sparseArray.get(iArr[i2]))[0].intValue();
            iArr3[i2] = ((java.lang.Integer[]) sparseArray.get(iArr[i2]))[1].intValue();
            iArr4[i2] = ((java.lang.Integer[]) sparseArray.get(iArr[i2]))[2].intValue();
        }
        return new com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail(deviceId, date, interval, size, intArrayToString, com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr2), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr3), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr4), isSync, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail merge(com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail oldEntity, com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail newEntity) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(oldEntity.getIndex_str());
        int[] stringToIntArray2 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(oldEntity.getCounts());
        int[] stringToIntArray3 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(oldEntity.getMiles());
        int[] stringToIntArray4 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(oldEntity.getCalories());
        int length = stringToIntArray.length;
        for (int i = 0; i < length; i++) {
            sparseArray.put(stringToIntArray[i], new java.lang.Integer[]{java.lang.Integer.valueOf(stringToIntArray2[i]), java.lang.Integer.valueOf(stringToIntArray3[i]), java.lang.Integer.valueOf(stringToIntArray4[i])});
        }
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        int[] stringToIntArray5 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(newEntity.getIndex_str());
        int[] stringToIntArray6 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(newEntity.getCounts());
        int[] stringToIntArray7 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(newEntity.getMiles());
        int[] stringToIntArray8 = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(newEntity.getCalories());
        int length2 = stringToIntArray5.length;
        for (int i2 = 0; i2 < length2; i2++) {
            sparseArray2.put(stringToIntArray5[i2], new java.lang.Integer[]{java.lang.Integer.valueOf(stringToIntArray6[i2]), java.lang.Integer.valueOf(stringToIntArray7[i2]), java.lang.Integer.valueOf(stringToIntArray8[i2])});
        }
        android.util.SparseArray sparseArray3 = new android.util.SparseArray();
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray3.put(sparseArray.keyAt(i3), sparseArray.valueAt(i3));
        }
        int size2 = sparseArray2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sparseArray3.put(sparseArray2.keyAt(i4), sparseArray2.valueAt(i4));
        }
        oldEntity.setTotalActiveTime(oldEntity.getIntervar() * sparseArray3.size());
        int size3 = sparseArray3.size();
        int[] iArr = new int[size3];
        int size4 = sparseArray3.size();
        for (int i5 = 0; i5 < size4; i5++) {
            iArr[i5] = sparseArray3.keyAt(i5);
        }
        java.util.Arrays.sort(iArr);
        oldEntity.setIndex_str(com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr));
        int[] iArr2 = new int[sparseArray3.size()];
        int[] iArr3 = new int[sparseArray3.size()];
        int[] iArr4 = new int[sparseArray3.size()];
        for (int i6 = 0; i6 < size3; i6++) {
            iArr2[i6] = ((java.lang.Integer[]) sparseArray3.get(iArr[i6]))[0].intValue();
            iArr3[i6] = ((java.lang.Integer[]) sparseArray3.get(iArr[i6]))[1].intValue();
            iArr4[i6] = ((java.lang.Integer[]) sparseArray3.get(iArr[i6]))[2].intValue();
        }
        oldEntity.setCounts(com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr2));
        oldEntity.setMiles(com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr3));
        oldEntity.setCalories(com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intArrayToString(iArr4));
        oldEntity.setSync(false);
        return oldEntity;
    }

    public final java.lang.Object updateStepDetailToServer(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$updateStepDetailToServer$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$updateStepDetailToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$updateStepDetailToServer$4(null));
    }

    public final java.lang.Object downStepDetailFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$downStepDetailFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$downStepDetailFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$downStepDetailFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$downStepDetailFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.StepDetailResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.StepDetailResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.StepDetailResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.StepDetailResp stepDetailResp : isSuccess) {
                            java.lang.String deviceId = stepDetailResp.getDeviceId();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(deviceId);
                            java.lang.String dateStr = stepDetailResp.getDateStr();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(dateStr);
                            com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail(deviceId, dateStr, stepDetailResp.getInterval(), stepDetailResp.getTotalActiveTime(), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(stepDetailResp.getIndexs()), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(stepDetailResp.getCounts()), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(stepDetailResp.getMiles()), com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(stepDetailResp.getCalories()), true, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            qcStepDetailDao = com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.this.stepDetailDao;
                            qcStepDetailDao.insert(stepDetail);
                            com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.this.calcStepTotal(stepDetail);
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

    /* compiled from: StepDetailRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/StepDetailRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository.getInstance$delegate.getValue();
        }
    }
}
