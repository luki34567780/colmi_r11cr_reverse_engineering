package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: MenstruationRepository.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J!\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\b2\u0006\u0010\u001c\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00192\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bJ\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0019J\b\u0010$\u001a\u0004\u0018\u00010\u001aJ\b\u0010%\u001a\u00020\u0012H\u0002J,\u0010&\u001a\u00020\u00142\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0(2\u0006\u0010)\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/MenstruationRepository;", "", "()V", "qcDeviceSettingDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcDeviceSettingDao;", "qcMenstruationDao", "Lcom/qcwireless/qcwatch/ui/base/repository/dao/QcMenstruationDao;", "addMenstruationData", "Lkotlinx/coroutines/flow/Flow;", "", "", "", "d", "Lcom/qcwireless/qc_utils/date/DateUtil;", "(Lcom/qcwireless/qc_utils/date/DateUtil;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "check", "bean", "Lcom/qcwireless/qcwatch/ui/home/menstruation/bean/MenstruationBean;", "addMenstruationFromLastTime", "", "addViewData", "showData", "", "list", "", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/MenstruationEntity;", "getMenstruationSetting", "mac", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOne", "during", "loadMonthData", "year", "month", "loadPreData", "queryMaxStartTime", "queryMenstruationSetting", "showCurrMonth", "map", "", "lastAuntDate", "Companion", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MenstruationRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository.Companion INSTANCE = new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository.Companion(null);
    private static final kotlin.Lazy<com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository> getInstance$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, new kotlin.jvm.functions.Function0<com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$Companion$getInstance$2
        /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository m553invoke() {
            return new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository();
        }
    });
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcDeviceSettingDao();
    private final com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao qcMenstruationDao = com.qcwireless.qcwatch.ui.base.repository.dao.QcDatabase.INSTANCE.getDatabase(com.qcwireless.qcwatch.QCApplication.INSTANCE.getCONTEXT()).qcMenstruationDao();

    public final java.lang.Object getMenstruationSetting(java.lang.String str, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean>> continuation) {
        final kotlinx.coroutines.flow.Flow flow = kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$2(this, str, null));
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(new kotlinx.coroutines.flow.Flow<com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = flow.collect(new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1$2", f = "MenstruationRepository.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= com.bumptech.glide.request.target.Target.SIZE_ORIGINAL;
                        return com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1.AnonymousClass2.this.emit(null, (kotlin.coroutines.Continuation) this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L14
                        r0 = r7
                        com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1$2$1 r0 = (com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r7 = r0.label
                        int r7 = r7 - r2
                        r0.label = r7
                        goto L19
                    L14:
                        com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1$2$1 r0 = new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L19:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L65
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r0
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity r6 = (com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity) r6
                        java.lang.String r6 = r6.getContent()
                        com.qcwireless.qcwatch.base.utils.MoshiUtils r2 = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE
                        com.squareup.moshi.Moshi r2 = r2.getMoshiBuild()
                        com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$lambda-0$$inlined$fromJson$1 r4 = new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$lambda-0$$inlined$fromJson$1
                        r4.<init>()
                        java.lang.reflect.Type r4 = r4.getType()
                        com.squareup.moshi.JsonAdapter r2 = r2.adapter(r4)
                        java.lang.String r4 = "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)"
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
                        java.lang.Object r6 = r2.fromJson(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L65
                        return r1
                    L65:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        }, new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$4(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$getMenstruationSetting$5(this, str, null));
    }

    public final boolean addMenstruationData(com.qcwireless.qc_utils.date.DateUtil d, boolean check, com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean bean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "d");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bean, "bean");
        int year = d.getYear();
        int month = d.getMonth();
        long zeroTime = d.getZeroTime();
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> queryMenstruationByYearAndMonth = this.qcMenstruationDao.queryMenstruationByYearAndMonth(year, month);
        if (!queryMenstruationByYearAndMonth.isEmpty()) {
            for (com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity menstruationEntity : queryMenstruationByYearAndMonth) {
                long endTime = menstruationEntity.getEndTime();
                long startTime = menstruationEntity.getStartTime();
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(endTime, true);
                dateUtil.addDay(10);
                if (zeroTime < startTime) {
                    if (check) {
                        menstruationEntity.setStartTime(zeroTime);
                        this.qcMenstruationDao.insert(menstruationEntity);
                    }
                    return true;
                }
                if (startTime <= zeroTime && zeroTime <= endTime) {
                    if (check) {
                        menstruationEntity.setEndTime(zeroTime);
                        this.qcMenstruationDao.insert(menstruationEntity);
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, menstruationEntity);
                    }
                    return false;
                }
                if (zeroTime > endTime && zeroTime <= dateUtil.getZeroTime()) {
                    if (check) {
                        menstruationEntity.setEndTime(zeroTime);
                        this.qcMenstruationDao.insert(menstruationEntity);
                    }
                    return false;
                }
                if (zeroTime > dateUtil.getZeroTime()) {
                    if (queryMenstruationByYearAndMonth.size() <= 1) {
                        insertOne(d, bean.getDuring(), check);
                        return true;
                    }
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "continue");
                } else {
                    com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "else");
                }
            }
            return true;
        }
        insertOne(d, bean.getDuring(), check);
        return true;
    }

    private final void insertOne(com.qcwireless.qc_utils.date.DateUtil d, int during, boolean check) {
        if (check) {
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(d.getUnixTimestamp(), true);
            dateUtil.addDay(during - 1);
            java.lang.String yyyyMMDate = d.getYyyyMMDate();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yyyyMMDate, "d.yyyyMMDate");
            com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity menstruationEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity(yyyyMMDate, d.getYear(), d.getMonth(), d.getZeroTime(), dateUtil.getZeroTime(), during);
            this.qcMenstruationDao.insert(menstruationEntity);
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, menstruationEntity);
        }
    }

    public final void addMenstruationFromLastTime(final com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean bean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bean, "bean");
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(bean.getLastTime(), true);
        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(bean.getLastTime(), true);
        dateUtil2.addDay(-(bean.getDuring() - 1));
        java.lang.String yyyyMMDate = dateUtil2.getYyyyMMDate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(yyyyMMDate, "dStart.yyyyMMDate");
        final com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity menstruationEntity = new com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity(yyyyMMDate, dateUtil2.getYear(), dateUtil2.getMonth(), dateUtil2.getZeroTime(), dateUtil.getZeroTime(), bean.getDuring());
        com.qcwireless.qcwatch.base.ktx.ThreadExtKt.ktxRunOnBgSingle(this, new kotlin.jvm.functions.Function1<com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository, kotlin.Unit>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationFromLastTime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository) {
                com.qcwireless.qcwatch.ui.base.repository.dao.QcDeviceSettingDao qcDeviceSettingDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao qcMenstruationDao;
                com.qcwireless.qcwatch.ui.base.repository.dao.QcMenstruationDao qcMenstruationDao2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menstruationRepository, "$this$ktxRunOnBgSingle");
                qcDeviceSettingDao = menstruationRepository.qcDeviceSettingDao;
                qcDeviceSettingDao.insert(new com.qcwireless.qcwatch.ui.base.repository.entity.DeviceSettingEntity(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.MenstruationSetting, com.qcwireless.qcwatch.base.utils.MoshiUtilsKt.toJson(com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean.this)));
                com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, java.lang.Boolean.valueOf(com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean.this.getMenstruationSwitch()));
                qcMenstruationDao = menstruationRepository.qcMenstruationDao;
                qcMenstruationDao.deleteAll();
                qcMenstruationDao2 = menstruationRepository.qcMenstruationDao;
                qcMenstruationDao2.insert(menstruationEntity);
            }
        });
    }

    public final java.util.List<com.qcwireless.qc_utils.date.DateUtil> loadMonthData(int year, int month) {
        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(year, month, 1);
        dateUtil.addMonth(1);
        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(year, month, 1);
        dateUtil2.addMonth(-1);
        com.qcwireless.qc_utils.date.DateUtil dateUtil3 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getZeroTime(), true);
        com.qcwireless.qc_utils.date.DateUtil dateUtil4 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil2.getZeroTime(), true);
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> queryMenstruationByYearAndMonth = this.qcMenstruationDao.queryMenstruationByYearAndMonth(year, month);
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> queryMenstruationByYearAndMonth2 = this.qcMenstruationDao.queryMenstruationByYearAndMonth(dateUtil3.getYear(), dateUtil3.getMonth());
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> queryMenstruationByYearAndMonth3 = this.qcMenstruationDao.queryMenstruationByYearAndMonth(dateUtil4.getYear(), dateUtil4.getMonth());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        addViewData(arrayList, queryMenstruationByYearAndMonth);
        addViewData(arrayList, queryMenstruationByYearAndMonth2);
        addViewData(arrayList, queryMenstruationByYearAndMonth3);
        return arrayList;
    }

    private final void addViewData(java.util.List<com.qcwireless.qc_utils.date.DateUtil> showData, java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> list) {
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity menstruationEntity = list.get(i);
            long startTime = menstruationEntity.getStartTime();
            long endTime = menstruationEntity.getEndTime();
            if (startTime == endTime) {
                this.qcMenstruationDao.delete(menstruationEntity);
                return;
            }
            int abs = (int) java.lang.Math.abs((endTime - startTime) / 86400);
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(startTime, true);
            showData.add(new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getZeroTime(), true));
            for (int i2 = 0; i2 < abs; i2++) {
                dateUtil.addDay(1);
                showData.add(new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getZeroTime(), true));
            }
        }
    }

    public final java.util.List<com.qcwireless.qc_utils.date.DateUtil> loadPreData() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity> queryAll = this.qcMenstruationDao.queryAll();
        if (!queryAll.isEmpty()) {
            int size = queryAll.size();
            for (int i = 0; i < size; i++) {
                com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(queryAll.get(i).getStartTime(), true);
                dateUtil.addDay(-19);
                for (int i2 = 0; i2 < 10; i2++) {
                    arrayList.add(new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getZeroTime(), true));
                    dateUtil.addDay(1);
                }
            }
        }
        return arrayList;
    }

    public final com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity queryMaxStartTime() {
        return this.qcMenstruationDao.queryMaxByStartTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean queryMenstruationSetting() {
        java.lang.String content = this.qcDeviceSettingDao.queryByMacAndAction(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), com.qcwireless.qcwatch.ui.base.repository.base.DeviceSettingAction.MenstruationSetting).getContent();
        com.squareup.moshi.JsonAdapter adapter = com.qcwireless.qcwatch.base.utils.MoshiUtils.INSTANCE.getMoshiBuild().adapter(new com.qcwireless.qcwatch.base.utils.TypeToken<com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean>() { // from class: com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$queryMenstruationSetting$$inlined$fromJson$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapter, "moshiBuild.adapter(objec…: TypeToken<T>() {}.type)");
        com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean = (com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean) adapter.fromJson(content);
        return menstruationBean == null ? new com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean(false, 0, 0, 0L, false, 0, 0, 0, 255, null) : menstruationBean;
    }

    public final java.lang.Object addMenstruationData(com.qcwireless.qc_utils.date.DateUtil dateUtil, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.Map<java.lang.String, java.lang.Integer>>> continuation) {
        return kotlinx.coroutines.flow.FlowKt.catch(kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.onStart(kotlinx.coroutines.flow.FlowKt.flow(new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$2(this, dateUtil, null)), new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$3(null)), kotlinx.coroutines.Dispatchers.getIO()), new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$4(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCurrMonth(java.util.Map<java.lang.String, java.lang.Integer> map, com.qcwireless.qc_utils.date.DateUtil lastAuntDate, com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean bean) {
        int cycle = bean.getCycle();
        int during = bean.getDuring();
        for (int i = 0; i < 12; i++) {
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(lastAuntDate.getTimestamp(), false);
            dateUtil.addDay(cycle * i);
            dateUtil.addDay(-19);
            for (int i2 = 0; i2 < 10; i2++) {
                java.lang.String y_m_d = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getYear(), dateUtil.getMonth(), dateUtil.getDay()).getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "DateUtil(d2.year, d2.month, d2.day).y_M_D");
                map.put(y_m_d, 1);
                dateUtil.addDay(1);
            }
        }
        int i3 = 0;
        while (i3 < 12) {
            com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(lastAuntDate.getTimestamp(), false);
            i3++;
            dateUtil2.addDay(cycle * i3);
            for (int i4 = 0; i4 < during; i4++) {
                new com.qcwireless.qc_utils.date.DateUtil().setDay(1);
                java.lang.String y_m_d2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil2.getYear(), dateUtil2.getMonth(), dateUtil2.getDay()).getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "DateUtil(d1.year, d1.month, d1.day).y_M_D");
                map.put(y_m_d2, 2);
                dateUtil2.addDay(1);
            }
        }
    }

    /* compiled from: MenstruationRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/qcwireless/qcwatch/ui/base/repository/healthy/MenstruationRepository$Companion;", "", "()V", "getInstance", "Lcom/qcwireless/qcwatch/ui/base/repository/healthy/MenstruationRepository;", "getGetInstance", "()Lcom/qcwireless/qcwatch/ui/base/repository/healthy/MenstruationRepository;", "getInstance$delegate", "Lkotlin/Lazy;", "app_championRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository getGetInstance() {
            return (com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository) com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository.getInstance$delegate.getValue();
        }
    }
}
