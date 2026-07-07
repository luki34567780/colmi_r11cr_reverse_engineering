package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: TemperatureRepository.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0006J\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u001bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;", "", "()V", "temperatureDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcTemperatureDao;", "downTemperatureFromServer", "", "uid", "", "lastSyncId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initData", "queryTemperatureByDate", "", "Lcom/qcwireless/qcwatch/ui/base/view/QTemperatureLineChartView$TemperatureDataBean;", "dateUtil", "Lcom/qcwireless/qc_utils/date/DateUtil;", "queryTemperatureDetailByDate", "Lcom/qcwireless/qcwatch/ui/home/temperature/bean/TemperatureDetailBean;", "queryTemperatureLast", "Lcom/qcwireless/qcwatch/ui/base/view/QTemperatureLineHomeChartView$TemperatureDataBean;", "syncAutoCheckTemperature", "syncSingleCheckTemperature", "index", "", "syncTodayTemperature", "updateTemperatureDetailToServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Callback", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class TemperatureRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository m569invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao temperatureDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcTemperatureDao();

    public final void initData() {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().clearCallback();
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().registerCallback(new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Callback());
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().initRegister();
    }

    public final void syncSingleCheckTemperature(int index) {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().startObtainTemperatureOnce(index);
    }

    public final void syncAutoCheckTemperature() {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao = this.temperatureDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
        com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity queryTemperatureLastByDate = qcTemperatureDao.queryTemperatureLastByDate(deviceAddressNoClear, y_m_d);
        if (queryTemperatureLastByDate == null) {
            com.oudmon.ble.base.communication.file.FileHandle.getInstance().startObtainTemperatureSeries(6);
        } else if (com.qcwireless.qc_utils.date.DateUtil.isSameDay(new java.util.Date(), new com.qcwireless.qc_utils.date.DateUtil(queryTemperatureLastByDate.getLastSyncTime(), true).toDate())) {
            com.oudmon.ble.base.communication.file.FileHandle.getInstance().startObtainTemperatureSeries(2);
        } else {
            com.oudmon.ble.base.communication.file.FileHandle.getInstance().startObtainTemperatureSeries(6);
        }
    }

    public final void syncTodayTemperature() {
        com.oudmon.ble.base.communication.file.FileHandle.getInstance().startObtainTemperatureSeries(0);
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean> queryTemperatureByDate(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao = this.temperatureDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = dateUtil.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureList = qcTemperatureDao.queryTemperatureList(deviceAddressNoClear, y_m_d);
        if (queryTemperatureList != null) {
            for (com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity bodyTemperatureEntity : queryTemperatureList) {
                if (bodyTemperatureEntity.getTemperature() >= 35.0f) {
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineChartView.TemperatureDataBean(bodyTemperatureEntity.getMin(), bodyTemperatureEntity.getTemperature(), false));
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean> queryTemperatureDetailByDate(com.qcwireless.qc_utils.date.DateUtil dateUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateUtil, "dateUtil");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao = this.temperatureDao;
        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
        java.lang.String y_m_d = dateUtil.getY_M_D();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureListDesc = qcTemperatureDao.queryTemperatureListDesc(deviceAddressNoClear, y_m_d);
        if (queryTemperatureListDesc != null) {
            for (com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity bodyTemperatureEntity : queryTemperatureListDesc) {
                if (bodyTemperatureEntity.getTemperature() >= 35.0f) {
                    arrayList.add(new com.qcwireless.qcwatch.ui.home.temperature.bean.TemperatureDetailBean(bodyTemperatureEntity.getMin(), bodyTemperatureEntity.getTemperature()));
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView.TemperatureDataBean> queryTemperatureLast() {
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity queryTemperatureLast = this.temperatureDao.queryTemperatureLast(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        if (queryTemperatureLast != null && (queryTemperatureList = this.temperatureDao.queryTemperatureList(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), queryTemperatureLast.getDateStr())) != null) {
            for (com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity bodyTemperatureEntity : queryTemperatureList) {
                if (bodyTemperatureEntity.getTemperature() >= 35.0f) {
                    arrayList.add(new com.qcwireless.qcwatch.ui.base.view.QTemperatureLineHomeChartView.TemperatureDataBean(bodyTemperatureEntity.getMin(), bodyTemperatureEntity.getTemperature(), false, bodyTemperatureEntity.getUnixTime()));
                }
            }
        }
        return arrayList;
    }

    /* compiled from: TemperatureRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository$Callback;", "Lcom/oudmon/ble/base/communication/file/SimpleCallback;", "(Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;)V", "onUpdateTemperature", "", "data", "Lcom/oudmon/ble/base/communication/dfu_temperature/TemperatureEntity;", "onUpdateTemperatureList", "array", "", "Lcom/oudmon/ble/base/communication/dfu_temperature/TemperatureOnceEntity;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class Callback extends com.oudmon.ble.base.communication.file.SimpleCallback {
        public Callback() {
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onUpdateTemperature(final com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity data) {
            final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository = com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.this;
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Callback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$Callback$onUpdateTemperature$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Callback) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Callback callback) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao2;
                    com.qcwireless.qc_utils.date.DateUtil dateUtil;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$this$ktxRunOnBgSingle");
                    int i = 0;
                    if (com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity.this == null) {
                        qcTemperatureDao = temperatureRepository.temperatureDao;
                        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureListByFlag = qcTemperatureDao.queryTemperatureListByFlag(deviceAddressNoClear, y_m_d, 0);
                        if (queryTemperatureListByFlag != null) {
                            qcTemperatureDao2 = temperatureRepository.temperatureDao;
                            qcTemperatureDao2.deleteList(kotlin.jvm.internal.TypeIntrinsics.asMutableList(queryTemperatureListByFlag));
                            return;
                        }
                        return;
                    }
                    com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil();
                    dateUtil2.addDay(-com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity.this.mIndex);
                    int i2 = com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity.this.mTimeSpan;
                    float[] fArr = com.oudmon.ble.base.communication.dfu_temperature.TemperatureEntity.this.mValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fArr, "data.mValues");
                    int length = fArr.length;
                    while (i < length) {
                        float f = fArr[i];
                        if (f > 0.0f) {
                            java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                            java.lang.String y_m_d2 = dateUtil2.getY_M_D();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "date.y_M_D");
                            dateUtil = dateUtil2;
                            com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity bodyTemperatureEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity(deviceAddressNoClear2, y_m_d2, dateUtil2.getZeroTime(), f, i * i2, false, 0, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            qcTemperatureDao3 = temperatureRepository.temperatureDao;
                            qcTemperatureDao3.insert(bodyTemperatureEntity);
                        } else {
                            dateUtil = dateUtil2;
                        }
                        i++;
                        dateUtil2 = dateUtil;
                    }
                }
            });
        }

        @Override // com.oudmon.ble.base.communication.file.SimpleCallback, com.oudmon.ble.base.communication.file.ICallback
        public void onUpdateTemperatureList(final java.util.List<com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity> array) {
            final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository = com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.this;
            com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Callback, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$Callback$onUpdateTemperatureList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Callback) obj);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.Callback callback) {
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao2;
                    com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao3;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$this$ktxRunOnBgSingle");
                    java.util.List<com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity> list = array;
                    if (list == null) {
                        qcTemperatureDao = temperatureRepository.temperatureDao;
                        java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                        java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil().getY_M_D();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil().y_M_D");
                        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity> queryTemperatureListByFlag = qcTemperatureDao.queryTemperatureListByFlag(deviceAddressNoClear, y_m_d, 1);
                        if (queryTemperatureListByFlag != null) {
                            qcTemperatureDao2 = temperatureRepository.temperatureDao;
                            qcTemperatureDao2.deleteList(kotlin.jvm.internal.TypeIntrinsics.asMutableList(queryTemperatureListByFlag));
                        }
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                        return;
                    }
                    if (list.size() > 0) {
                        java.util.List<com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity> list2 = array;
                        com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository temperatureRepository2 = temperatureRepository;
                        for (com.oudmon.ble.base.communication.dfu_temperature.TemperatureOnceEntity temperatureOnceEntity : list2) {
                            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(temperatureOnceEntity.mTime, true);
                            java.lang.String deviceAddressNoClear2 = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                            java.lang.String y_m_d2 = dateUtil.getY_M_D();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "date.y_M_D");
                            com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity bodyTemperatureEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity(deviceAddressNoClear2, y_m_d2, dateUtil.getZeroTime(), temperatureOnceEntity.mValue, dateUtil.getTodayMin(), false, 1, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                            qcTemperatureDao3 = temperatureRepository2.temperatureDao;
                            qcTemperatureDao3.insert(bodyTemperatureEntity);
                        }
                        org.greenrobot.eventbus.EventBus.getDefault().post(new com.qcwireless.qcwatch.base.event.ManualRefreshEvent());
                    }
                }
            });
        }
    }

    public final java.lang.Object updateTemperatureDetailToServer(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$updateTemperatureDetailToServer$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$updateTemperatureDetailToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$updateTemperatureDetailToServer$4(null));
    }

    public final java.lang.Object downTemperatureFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$downTemperatureFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$downTemperatureFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$downTemperatureFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository$downTemperatureFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.TemperatureDownResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.TemperatureDownResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.TemperatureDownResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcTemperatureDao qcTemperatureDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.TemperatureDownResp temperatureDownResp : isSuccess) {
                            java.util.Iterator<java.lang.Float> it = temperatureDownResp.getTemperatures().iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                int i2 = i + 1;
                                float floatValue = it.next().floatValue();
                                if (floatValue > 32.0f) {
                                    com.qcwireless.qc_utils.date.DateUtil parse = com.qcwireless.qc_utils.date.DateUtil.parse(temperatureDownResp.getDateStr(), com.qcwireless.qc_utils.date.DateUtil.DateFormater.dFyyyyMMdd);
                                    java.lang.String deviceAddress = temperatureDownResp.getDeviceAddress();
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(deviceAddress);
                                    com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity bodyTemperatureEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.BodyTemperatureEntity(deviceAddress, temperatureDownResp.getDateStr(), parse.getZeroTime(), floatValue, i, true, 0, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                                    try {
                                        qcTemperatureDao = com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.this.temperatureDao;
                                        qcTemperatureDao.insert(bodyTemperatureEntity);
                                    } catch (java.lang.Exception e) {
                                        e = e;
                                        e.printStackTrace();
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                                i = i2;
                            }
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* compiled from: TemperatureRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/TemperatureRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.TemperatureRepository.getInstance$delegate.getValue();
        }
    }
}
