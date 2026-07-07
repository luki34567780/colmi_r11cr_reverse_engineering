package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: SportPlusRepository.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u001a\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u001cJ\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0 0\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;", "", "()V", "sportPlusDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcSportPlusDetailDao;", "downSportDetailFromServer", "", "uid", "", "lastSyncId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryByTypeAndStartTime", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/SportPlusDetail;", "type", "", "startTime", "queryLastSportDate", "queryLastSportPlus", "Lcom/qcwireless/qcwatch/ui/home/sport/bean/HomeSportDetail;", "querySportByDate", "start", "Lcom/qcwireless/qc_utils/date/DateUtil;", "end", "querySportPlus", "", "Lcom/qcwireless/qcwatch/ui/home/sport/bean/SportDetail;", "syncTodaySportPlus", "result", "Lcom/qcwireless/qcwatch/ui/base/repository/base/BaseDeviceResult;", "Lcom/oudmon/ble/base/communication/sport/SportPlusEntity;", "updateSportDetailToServer", "Lkotlinx/coroutines/flow/Flow;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class SportPlusRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository m563invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao sportPlusDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcSportPlusDao();

    public final void syncTodaySportPlus(final com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult<java.util.List<com.oudmon.ble.base.communication.sport.SportPlusEntity>> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        final com.oudmon.ble.base.communication.sport.SportPlusHandle sportPlusHandle = new com.oudmon.ble.base.communication.sport.SportPlusHandle();
        sportPlusHandle.init(new com.oudmon.ble.base.communication.sport.SportPlusHandle.IOpResult() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$$ExternalSyntheticLambda0
            @Override // com.oudmon.ble.base.communication.sport.SportPlusHandle.IOpResult
            public final void onSummary(int i, java.util.List list) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.m562syncTodaySportPlus$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.this, result, i, list);
            }
        });
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$syncTodaySportPlus$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao qcSportPlusDetailDao;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPlusRepository, "$this$ktxRunOnBgSingle");
                qcSportPlusDetailDao = sportPlusRepository.sportPlusDao;
                com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryLastSyncDate = qcSportPlusDetailDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
                if (queryLastSyncDate == null) {
                    com.oudmon.ble.base.communication.sport.SportPlusHandle.this.cmdSummary(0);
                } else {
                    com.oudmon.ble.base.communication.sport.SportPlusHandle.this.cmdSummary((int) new com.qcwireless.qc_utils.date.DateUtil(queryLastSyncDate.getStartTime(), true).getUnixTimestamp());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncTodaySportPlus$lambda-0, reason: not valid java name */
    public static final void m562syncTodaySportPlus$lambda0(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository, com.qcwireless.qcwatch.ui.base.repository.base.BaseDeviceResult baseDeviceResult, int i, java.util.List list) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPlusRepository, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseDeviceResult, "$result");
        if (i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.oudmon.ble.base.communication.sport.SportPlusEntity sportPlusEntity = (com.oudmon.ble.base.communication.sport.SportPlusEntity) it.next();
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault());
                simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("Asia/Shanghai"));
                java.util.List<com.oudmon.ble.base.communication.sport.SportLocation> list2 = sportPlusEntity.mLocations;
                kotlin.text.StringsKt.clear(sb);
                java.util.Iterator<com.oudmon.ble.base.communication.sport.SportLocation> it2 = list2.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().mRateReal);
                    sb.append(",");
                }
                if (sb.length() > 0) {
                    str = sb.substring(0, sb.length() - 1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "rates.substring(0, rates.length - 1)");
                } else {
                    str = "";
                }
                java.lang.String deviceAddressNoClear = com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear();
                java.lang.String format = simpleDateFormat.format(new java.util.Date(sportPlusEntity.mStartTime * 1000));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "sdf.format(Date(item.mStartTime.toLong() * 1000))");
                final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(deviceAddressNoClear, format, sportPlusEntity.mStartTime, sportPlusEntity.mSportType, sportPlusEntity.mDuration, sportPlusEntity.mDistance, sportPlusEntity.mCalories, sportPlusEntity.steps, str, sportPlusEntity.mRateAvg, false);
                com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(sportPlusRepository, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$syncTodaySportPlus$1$1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository sportPlusRepository2) {
                        com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao qcSportPlusDetailDao;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sportPlusRepository2, "$this$ktxRunOnBgSingle");
                        qcSportPlusDetailDao = sportPlusRepository2.sportPlusDao;
                        qcSportPlusDetailDao.insert(com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail.this);
                    }
                });
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "mutableList");
            baseDeviceResult.result(0, list);
        }
    }

    public final java.util.List<com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail> querySportPlus(com.qcwireless.qc_utils.date.DateUtil start, com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail : this.sportPlusDao.querySportPlusByStartTime(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), start.getZeroTime(), (end.getZeroTime() + 86400) - 1)) {
            int[] stringToIntArray = com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.stringToIntArray(sportPlusDetail.getRateValue());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int length = stringToIntArray.length;
            for (int i = 0; i < length; i++) {
                arrayList2.add(new com.qcwireless.qcwatch.ui.home.sport.bean.HeartDetail(sportPlusDetail.getStartTime() + (i * 60), stringToIntArray[i]));
            }
            arrayList.add(new com.qcwireless.qcwatch.ui.home.sport.bean.SportDetail(sportPlusDetail.getSportType(), sportPlusDetail.getSteps(), sportPlusDetail.getStartTime(), sportPlusDetail.getDuration(), sportPlusDetail.getCalories(), sportPlusDetail.getDistance(), arrayList2));
        }
        return arrayList;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail querySportByDate(com.qcwireless.qc_utils.date.DateUtil start, com.qcwireless.qc_utils.date.DateUtil end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(end, "end");
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail> querySportPlusByStartTime = this.sportPlusDao.querySportPlusByStartTime(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), start.getZeroTime(), (end.getZeroTime() + 86400) - 1);
        if (!querySportPlusByStartTime.isEmpty()) {
            return querySportPlusByStartTime.get(0);
        }
        return null;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryLastSportDate() {
        return this.sportPlusDao.queryLastSyncDate(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryByTypeAndStartTime(int type, long startTime) {
        return this.sportPlusDao.querySportByStartTimeAndType(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), type, startTime);
    }

    public final com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail queryLastSportPlus() {
        com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail queryByAddressOrderByStartTime = this.sportPlusDao.queryByAddressOrderByStartTime(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear());
        if (queryByAddressOrderByStartTime != null) {
            return new com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail(queryByAddressOrderByStartTime.getSportType(), queryByAddressOrderByStartTime.getDistance(), queryByAddressOrderByStartTime.getCalories(), com.qcwireless.qcwatch.base.utils.QcDateUtil.INSTANCE.getGetInstance().localDateFormatSport(new com.qcwireless.qc_utils.date.DateUtil(queryByAddressOrderByStartTime.getStartTime(), true)), queryByAddressOrderByStartTime.getRateValue(), queryByAddressOrderByStartTime.getDuration(), queryByAddressOrderByStartTime.getStartTime(), queryByAddressOrderByStartTime.getAvgRate());
        }
        return new com.qcwireless.qcwatch.ui.home.sport.bean.HomeSportDetail(0, 0.0f, 0.0f, "", "", 0, 0L, 0);
    }

    public final java.lang.Object updateSportDetailToServer(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$updateSportDetailToServer$2(this, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$updateSportDetailToServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$updateSportDetailToServer$4(null));
    }

    public final java.lang.Object downSportDetailFromServer(long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$downSportDetailFromServer$2(j, j2, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$downSportDetailFromServer$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$downSportDetailFromServer$4(null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository$downSportDetailFromServer$5
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SportDetailResp>>) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SportDetailResp>> netState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.util.List<com.qcwireless.qcwatch.ui.base.bean.response.healthy.SportDetailResp> isSuccess;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcSportPlusDetailDao qcSportPlusDetailDao;
                if (netState.getRetCode() == 0 && (isSuccess = netState.isSuccess()) != null) {
                    try {
                        for (com.qcwireless.qcwatch.ui.base.bean.response.healthy.SportDetailResp sportDetailResp : isSuccess) {
                            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(sportDetailResp.getStartTime(), true);
                            if (java.lang.String.valueOf(sportDetailResp.getStartTime()).length() == 13) {
                                dateUtil = new com.qcwireless.qc_utils.date.DateUtil(sportDetailResp.getStartTime(), false);
                            }
                            java.lang.String deviceId = sportDetailResp.getDeviceId();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(deviceId);
                            java.lang.String y_m_d = dateUtil.getY_M_D();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                            long unixTimestamp = dateUtil.getUnixTimestamp();
                            int rawType = sportDetailResp.getRawType();
                            int duration = (int) sportDetailResp.getDuration();
                            float distance = sportDetailResp.getDistance();
                            float calorie = sportDetailResp.getCalorie();
                            int step = sportDetailResp.getStep();
                            java.util.List<java.lang.Integer> heartrates = sportDetailResp.getHeartrates();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(heartrates);
                            com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail sportPlusDetail = new com.qcwireless.qcwatch.ui.base.repository.entity.SportPlusDetail(deviceId, y_m_d, unixTimestamp, rawType, duration, distance, calorie, step, com.qcwireless.qcwatch.ui.base.util.StringUtilsKt.intListToString(heartrates), sportDetailResp.getMRateAvg(), true);
                            try {
                                qcSportPlusDetailDao = com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.this.sportPlusDao;
                                qcSportPlusDetailDao.insert(sportPlusDetail);
                            } catch (java.lang.Exception e) {
                                e = e;
                                e.printStackTrace();
                                return kotlin.Unit.INSTANCE;
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

    /* compiled from: SportPlusRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/SportPlusRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.SportPlusRepository.getInstance$delegate.getValue();
        }
    }
}
