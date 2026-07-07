package com.qcwireless.qcwatch.ui.base.service;

/* compiled from: NetService.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u0006\u0010\u0015\u001a\u00020\u0006J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/service/NetService;", "", "()V", "syncDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSyncDao;", "downAll", "", "downBoList", "lastId", "", "downBpList", "downGoalSetting", "downHeartRateDetail", "downSleepDetail", "downSportDetail", "downStepDetail", "downTemperature", "downUserProfile", "upAll", "upBoList", "upBpList", "upCollectionData", "upHeartRateDetail", "upSleepDetail", "upSportDetailDetail", "upStepsDetail", "upTemperatureList", "Companion", "SyncAction", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class NetService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.service.NetService.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.service.NetService.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.service.NetService> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.service.NetService>() { // from class: com.qcwireless.qcwatch.ui.base.service.NetService$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.service.NetService m573invoke() {
            return new com.qcwireless.qcwatch.ui.base.service.NetService();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao syncDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcSyncDao();

    /* compiled from: NetService.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/service/NetService$SyncAction;", "", "()V", com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.BloodOxygen_Action, "", com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.BloodPressure_Action, com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Heart_Rate_Action, com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Sleep_Action, com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Sport_Plus_Action, com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Step_Action, com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Temperature_Action, "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SyncAction {
        public static final java.lang.String BloodOxygen_Action = "BloodOxygen_Action";
        public static final java.lang.String BloodPressure_Action = "BloodPressure_Action";
        public static final java.lang.String Heart_Rate_Action = "Heart_Rate_Action";
        public static final com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction INSTANCE = new com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction();
        public static final java.lang.String Sleep_Action = "Sleep_Action";
        public static final java.lang.String Sport_Plus_Action = "Sport_Plus_Action";
        public static final java.lang.String Step_Action = "Step_Action";
        public static final java.lang.String Temperature_Action = "Temperature_Action";

        private SyncAction() {
        }
    }

    public final void upAll() {
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()));
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.NetService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.NetService$upAll$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.service.NetService) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.service.NetService netService) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(netService, "$this$ktxRunOnBgFix");
                    netService.upHeartRateDetail();
                    netService.upSleepDetail();
                    netService.upSportDetailDetail();
                    netService.upStepsDetail();
                    netService.upBpList();
                    netService.upBoList();
                    netService.upTemperatureList();
                }
            });
        }
    }

    public final void downAll() {
        if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getLoginStatus()) {
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgFix(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.service.NetService, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.service.NetService$downAll$1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.service.NetService) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.service.NetService netService) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao2;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao3;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao4;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao5;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao6;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao7;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao8;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao9;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao10;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao11;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao12;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao13;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcSyncDao qcSyncDao14;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(netService, "$this$ktxRunOnBgFix");
                    qcSyncDao = netService.syncDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction = qcSyncDao.queryByUidAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Step_Action);
                    if (queryByUidAndAction != null) {
                        netService.downStepDetail(queryByUidAndAction.getLastSyncTime());
                    } else {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
                        dateUtil.addDay(-30);
                        netService.downStepDetail(dateUtil.getTimestamp());
                        qcSyncDao2 = netService.syncDao;
                        qcSyncDao2.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Step_Action, dateUtil.getTimestamp()));
                    }
                    qcSyncDao3 = netService.syncDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction2 = qcSyncDao3.queryByUidAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Sleep_Action);
                    if (queryByUidAndAction2 != null) {
                        netService.downSleepDetail(queryByUidAndAction2.getLastSyncTime());
                    } else {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil();
                        dateUtil2.addDay(-30);
                        netService.downSleepDetail(dateUtil2.getTimestamp());
                        qcSyncDao4 = netService.syncDao;
                        qcSyncDao4.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Sleep_Action, dateUtil2.getTimestamp()));
                    }
                    qcSyncDao5 = netService.syncDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction3 = qcSyncDao5.queryByUidAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Heart_Rate_Action);
                    if (queryByUidAndAction3 != null) {
                        netService.downSleepDetail(queryByUidAndAction3.getLastSyncTime());
                    } else {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil3 = new com.qcwireless.qc_utils.date.DateUtil();
                        dateUtil3.addDay(-30);
                        netService.downHeartRateDetail(dateUtil3.getTimestamp());
                        qcSyncDao6 = netService.syncDao;
                        qcSyncDao6.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Heart_Rate_Action, dateUtil3.getTimestamp()));
                    }
                    qcSyncDao7 = netService.syncDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction4 = qcSyncDao7.queryByUidAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Sport_Plus_Action);
                    if (queryByUidAndAction4 != null) {
                        netService.downSportDetail(queryByUidAndAction4.getLastSyncTime() / 1000);
                    } else {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil4 = new com.qcwireless.qc_utils.date.DateUtil();
                        dateUtil4.addDay(-30);
                        netService.downSportDetail(dateUtil4.getTimestamp() / 1000);
                        qcSyncDao8 = netService.syncDao;
                        qcSyncDao8.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Sport_Plus_Action, dateUtil4.getTimestamp()));
                    }
                    qcSyncDao9 = netService.syncDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction5 = qcSyncDao9.queryByUidAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.BloodPressure_Action);
                    if (queryByUidAndAction5 != null) {
                        netService.downBpList(queryByUidAndAction5.getLastSyncTime());
                    } else {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil5 = new com.qcwireless.qc_utils.date.DateUtil();
                        dateUtil5.addDay(-30);
                        netService.downBpList(dateUtil5.getTimestamp());
                        qcSyncDao10 = netService.syncDao;
                        qcSyncDao10.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.BloodPressure_Action, dateUtil5.getTimestamp()));
                    }
                    qcSyncDao11 = netService.syncDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction6 = qcSyncDao11.queryByUidAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.BloodOxygen_Action);
                    if (queryByUidAndAction6 != null) {
                        netService.downBoList(queryByUidAndAction6.getLastSyncTime());
                    } else {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil6 = new com.qcwireless.qc_utils.date.DateUtil();
                        dateUtil6.addDay(-30);
                        netService.downBoList(dateUtil6.getTimestamp());
                        qcSyncDao12 = netService.syncDao;
                        qcSyncDao12.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.BloodOxygen_Action, dateUtil6.getTimestamp()));
                    }
                    qcSyncDao13 = netService.syncDao;
                    com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity queryByUidAndAction7 = qcSyncDao13.queryByUidAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Temperature_Action);
                    if (queryByUidAndAction7 != null) {
                        netService.downTemperature(queryByUidAndAction7.getLastSyncTime());
                        return;
                    }
                    com.qcwireless.qc_utils.date.DateUtil dateUtil7 = new com.qcwireless.qc_utils.date.DateUtil();
                    dateUtil7.addDay(-30);
                    netService.downTemperature(dateUtil7.getTimestamp());
                    qcSyncDao14 = netService.syncDao;
                    qcSyncDao14.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.SyncDataEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getUid(), com.qcwireless.qcwatch.ui.base.service.NetService.SyncAction.Temperature_Action, dateUtil7.getTimestamp()));
                }
            });
        }
    }

    public final void downUserProfile() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downUserProfile$1(null), 3, (java.lang.Object) null);
    }

    public final void downGoalSetting() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downGoalSetting$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upStepsDetail() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upStepsDetail$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upBpList() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upBpList$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upBoList() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upBoList$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upTemperatureList() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upTemperatureList$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upSleepDetail() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upSleepDetail$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upHeartRateDetail() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upHeartRateDetail$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upSportDetailDetail() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upSportDetailDetail$1(null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downStepDetail(long lastId) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downStepDetail$1(lastId, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downBpList(long lastId) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downBpList$1(lastId, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downTemperature(long lastId) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downTemperature$1(lastId, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downBoList(long lastId) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downBoList$1(lastId, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downSleepDetail(long lastId) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downSleepDetail$1(lastId, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downHeartRateDetail(long lastId) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downHeartRateDetail$1(lastId, null), 3, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downSportDetail(long lastId) {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$downSportDetail$1(lastId, null), 3, (java.lang.Object) null);
    }

    public final void upCollectionData() {
        kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.qcwireless.qcwatch.ui.base.service.NetService$upCollectionData$1(null), 3, (java.lang.Object) null);
    }

    /* compiled from: NetService.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/service/NetService$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/service/NetService;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/service/NetService;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.service.NetService getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.service.NetService) com.qcwireless.qcwatch.ui.base.service.NetService.getInstance$delegate.getValue();
        }
    }
}
