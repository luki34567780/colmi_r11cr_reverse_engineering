package com.qcwireless.qcwatch.ui.home.menstruation;

/* compiled from: MenstruationViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel$execToDevice$1", f = "MenstruationViewModel.kt", i = {}, l = {74, 75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MenstruationViewModel$execToDevice$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MenstruationViewModel$execToDevice$1(com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel menstruationViewModel, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel$execToDevice$1> continuation) {
        super(2, continuation);
        this.this$0 = menstruationViewModel;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel$execToDevice$1(this.this$0, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            menstruationRepository = this.this$0.repository;
            this.label = 1;
            obj = menstruationRepository.getMenstruationSetting(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear(), (kotlin.coroutines.Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel menstruationViewModel = this.this$0;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel$execToDevice$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(com.qcwireless.qcwatch.ui.home.menstruation.bean.MenstruationBean menstruationBean, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository menstruationRepository2;
                if (menstruationBean != null) {
                    menstruationRepository2 = com.qcwireless.qcwatch.ui.home.menstruation.MenstruationViewModel.this.repository;
                    com.qcwireless.qcwatch.ui.base.repository.entity.MenstruationEntity queryMaxStartTime = menstruationRepository2.queryMaxStartTime();
                    if (queryMaxStartTime != null) {
                        com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil(queryMaxStartTime.getStartTime(), true);
                        com.qcwireless.qc_utils.date.DateUtil dateUtil2 = new com.qcwireless.qc_utils.date.DateUtil(queryMaxStartTime.getEndTime(), true);
                        int daysBetweenMe = new com.qcwireless.qc_utils.date.DateUtil().daysBetweenMe(dateUtil);
                        int daysBetweenMe2 = new com.qcwireless.qc_utils.date.DateUtil().daysBetweenMe(dateUtil2);
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "-----" + menstruationBean.getMenstruationAlarm());
                        com.oudmon.ble.base.communication.CommandHandle.getInstance().executeReqCmdNoCallback(new com.oudmon.ble.base.communication.req.MenstruationReq(true, menstruationBean.getDuring(), menstruationBean.getCycle(), daysBetweenMe, daysBetweenMe2, menstruationBean.getMenstruationAlarm(), menstruationBean.getAlarm1(), menstruationBean.getAlarm2(), menstruationBean.getAlarmMin() / 60, menstruationBean.getAlarmMin() % 60));
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
