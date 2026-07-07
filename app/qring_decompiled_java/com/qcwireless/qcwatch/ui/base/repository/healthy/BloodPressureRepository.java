package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: BloodPressureRepository.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository;", "", "()V", "bloodPressureDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcBloodPressureDao;", "downBpFromServer", "", "uid", "", "lastSyncId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryBpByDate", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/BloodPressureEntity;", "start", "end", "queryLastBp", "queryLastBpValue", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodPressureChartHomeView$BpDataBean;", "mac", "", "syncAutoBp", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "Lcom/oudmon/ble/base/communication/rsp/ReadBlePressureRsp;", "syncAutoBpConfirm", "syncManualBp", "updateBpDetailToServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class BloodPressureRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository m544invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao bloodPressureDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcBloodPressureDao();

    public final void syncAutoBp(final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.SimpleKeyReq((byte) 13), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.m542syncAutoBp$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.this, result, (com.oudmon.ble.base.communication.rsp.BpDataRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncAutoBp$lambda-0, reason: not valid java name */
    public static final void m542syncAutoBp$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, com.oudmon.ble.base.communication.rsp.BpDataRsp bpDataRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (bpDataRsp.getBpDataEntity() == null) {
            bloodPressureRepository.syncManualBp(baseDeviceResult);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "同步手动血压");
        } else {
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$syncAutoBp$1$1(bpDataRsp, bloodPressureRepository, null), 3, (java.lang.Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncAutoBpConfirm() {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.BpReadConformReq(true));
    }

    private final void syncManualBp(final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp> result) {
        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmd(new com.oudmon.ble.base.communication.req.ReadPressureReq(0L), new com.oudmon.ble.base.communication.ICommandResponse() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$$ExternalSyntheticLambda1
            @Override // com.oudmon.ble.base.communication.ICommandResponse
            public final void onDataResponse(com.oudmon.ble.base.communication.rsp.BaseRspCmd baseRspCmd) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.m543syncManualBp$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.this, result, (com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp) baseRspCmd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncManualBp$lambda-1, reason: not valid java name */
    public static final void m543syncManualBp$lambda1(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository, final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, final com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp readBlePressureRsp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "血压数据长度:" + readBlePressureRsp.getValueList().size());
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(bloodPressureRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$syncManualBp$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository bloodPressureRepository2) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao qcBloodPressureDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bloodPressureRepository2, "$this$ktxRunOnBgSingle");
                int i = 0;
                for (com.oudmon.ble.base.communication.entity.BlePressure blePressure : com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp.this.getValueList()) {
                    int i2 = i + 1;
                    com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil(blePressure.time, true);
                    int i3 = blePressure.sbp;
                    if (i < com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp.this.getValueList().size() - 1) {
                        long j = 60;
                        if (com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp.this.getValueList().get(i).time / j == com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp.this.getValueList().get(i2).time / j) {
                            dateUtil.setSecond(1);
                            com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity bloodPressureEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), dateUtil.getUnixTimestamp(), i3, blePressure.dbp, false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            qcBloodPressureDao = bloodPressureRepository2.bloodPressureDao;
                            qcBloodPressureDao.insert(bloodPressureEntity);
                            i = i2;
                        }
                    }
                    dateUtil.setSecond(0);
                    com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity bloodPressureEntity2 = new com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), dateUtil.getUnixTimestamp(), i3, blePressure.dbp, false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                    qcBloodPressureDao = bloodPressureRepository2.bloodPressureDao;
                    qcBloodPressureDao.insert(bloodPressureEntity2);
                    i = i2;
                }
                if (com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp.this.getStatus() == 0) {
                    com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp> baseDeviceResult2 = baseDeviceResult;
                    com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp readBlePressureRsp2 = com.oudmon.ble.base.communication.rsp.ReadBlePressureRsp.this;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readBlePressureRsp2, "it");
                    baseDeviceResult2.result(0, readBlePressureRsp2);
                }
            }
        });
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> queryBpByDate(long start, long end) {
        return this.bloodPressureDao.queryByUnixTime(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), start, end);
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity queryLastBp() {
        return this.bloodPressureDao.queryLastBpValue(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean> queryLastBpValue(java.lang.String mac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "mac");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity queryLastBpValue = this.bloodPressureDao.queryLastBpValue(mac);
        if (queryLastBpValue != null) {
            com.oudmon.ble.base.util.DateUtil dateUtil = new com.oudmon.ble.base.util.DateUtil(queryLastBpValue.getUnixTime(), true);
            java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity> queryByUnixTime = this.bloodPressureDao.queryByUnixTime(mac, dateUtil.getZeroTime(), dateUtil.getZeroTime() + 86399);
            if (queryByUnixTime != null) {
                int i = 0;
                for (com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity bloodPressureEntity : queryByUnixTime) {
                    int i2 = i + 1;
                    if (i > 0) {
                        long j = 60;
                        if (queryByUnixTime.get(i - 1).getUnixTime() / j == queryByUnixTime.get(i).getUnixTime() / j) {
                            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, bloodPressureEntity);
                            i = i2;
                        }
                    }
                    com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(bloodPressureEntity.getUnixTime(), true);
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean((dateUtil2.getHour() * 60) + dateUtil2.getMinute(), bloodPressureEntity.getSbp(), bloodPressureEntity.getDbp(), queryLastBpValue.getUnixTime()));
                    i = i2;
                }
            }
        }
        return arrayList;
    }

    public final java.lang.Object updateBpDetailToServer(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$updateBpDetailToServer$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$updateBpDetailToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$updateBpDetailToServer$4(null));
    }

    public final java.lang.Object downBpFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$downBpFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$downBpFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$downBpFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository$downBpFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.BpDownResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.BpDownResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.BpDownResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcBloodPressureDao qcBloodPressureDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.BpDownResp bpDownResp : isSuccess) {
                            java.lang.String deviceId = bpDownResp.getDeviceId();
                            com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity bloodPressureEntity = deviceId != null ? new com.qcwireless.qcwatch.ui.base.repository.entity.BloodPressureEntity(deviceId, bpDownResp.getTime() / 1000, bpDownResp.getSbp(), bpDownResp.getDbp(), false, new com.oudmon.ble.base.util.DateUtil().getUnixTimestamp()) : null;
                            if (bloodPressureEntity != null) {
                                qcBloodPressureDao = com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.this.bloodPressureDao;
                                qcBloodPressureDao.insert(bloodPressureEntity);
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

    /* compiled from: BloodPressureRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/BloodPressureRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.getInstance$delegate.getValue();
        }
    }
}
