package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastSleepItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/home/sleep/bean/SleepViewBean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem$calcLastSleep$1", f = "LastSleepItem.kt", i = {}, l = {31, 33, 58, 62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LastSleepItem$calcLastSleep$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    LastSleepItem$calcLastSleep$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem$calcLastSleep$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> lastSleepItem$calcLastSleep$1 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastSleepItem$calcLastSleep$1(continuation);
        lastSleepItem$calcLastSleep$1.L$0 = obj;
        return lastSleepItem$calcLastSleep$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            if (com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getNewSleepProtocol()) {
                if (com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance().queryLastSleepNewProtocol() != null) {
                    this.label = 1;
                    if (flowCollector.emit(com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance().querySleepNewProtocol(new com.qcwireless.qc_utils.date.DateUtil(r3.getEt(), true)), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if (flowCollector.emit(new com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean(null, 0, 0, 0, 0, 0L, 0L, com.google.android.gms.internal.fitness.zzab.zzh, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail queryLastSleep = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance().queryLastSleep();
                if (queryLastSleep != null) {
                    com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(com.qcwireless.qc_utils.date.DateUtil.String2Date("yyyy-MM-dd", queryLastSleep.getDateStr()));
                    com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository getInstance = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance();
                    java.lang.String y_m_d = dateUtil.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "dateUtil.y_M_D");
                    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate = getInstance.querySleepByDate(y_m_d);
                    com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(dateUtil.getUnixTimestamp(), true);
                    dateUtil2.addDay(-1);
                    com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository getInstance2 = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance();
                    java.lang.String y_m_d2 = dateUtil2.getY_M_D();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d2, "yesDate.y_M_D");
                    com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail querySleepByDate2 = getInstance2.querySleepByDate(y_m_d2);
                    if (querySleepByDate2 == null) {
                        querySleepByDate2 = new com.qcwireless.qcwatch.ui.base.repository.entity.SleepDetail(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), "", 900, "", "", false, new com.qcwireless.qc_utils.date.DateUtil().getUnixTimestamp());
                    }
                    if (querySleepByDate != null) {
                        com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean calcSleepViewData = com.qcwireless.qcwatch.ui.base.repository.healthy.SleepDetailRepository.INSTANCE.getGetInstance().calcSleepViewData(querySleepByDate, querySleepByDate2);
                        if (calcSleepViewData.getTotalSleep() > 0) {
                            this.label = 3;
                            if (flowCollector.emit(calcSleepViewData, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    this.label = 4;
                    if (flowCollector.emit(new com.qcwireless.qcwatch.ui.home.sleep.bean.SleepViewBean(null, 0, 0, 0, 0, 0L, 0L, com.google.android.gms.internal.fitness.zzab.zzh, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
