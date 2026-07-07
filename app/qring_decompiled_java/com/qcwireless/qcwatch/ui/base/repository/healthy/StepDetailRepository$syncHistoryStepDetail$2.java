package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: StepDetailRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$2", f = "StepDetailRepository.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class StepDetailRepository$syncHistoryStepDetail$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, ? extends java.lang.Integer>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $deviceAddress;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepDetailRepository$syncHistoryStepDetail$2(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository, java.lang.String str, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$2> continuation) {
        super(2, continuation);
        this.this$0 = stepDetailRepository;
        this.$deviceAddress = str;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> stepDetailRepository$syncHistoryStepDetail$2 = new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$2(this.this$0, this.$deviceAddress, continuation);
        stepDetailRepository$syncHistoryStepDetail$2.L$0 = obj;
        return stepDetailRepository$syncHistoryStepDetail$2;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, java.lang.Integer>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.qcwireless.qcwatch.ui.base.repository.dao.QcStepDetailDao qcStepDetailDao;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
            for (int i2 = 1; i2 < 7; i2++) {
                dateUtil.addDay(-1);
                concurrentHashMap4 = this.this$0.historyDate;
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                concurrentHashMap4.put(y_m_d, kotlin.coroutines.jvm.internal.Boxing.boxInt(i2));
            }
            qcStepDetailDao = this.this$0.stepDetailDao;
            java.util.List<com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail> queryLastSyncDate = qcStepDetailDao.queryLastSyncDate(this.$deviceAddress);
            if (queryLastSyncDate != null) {
                for (com.qcwireless.qcwatch.ui.base.repository.entity.StepDetail stepDetail : queryLastSyncDate) {
                    if (new com.qcwireless.qc_utils.date.DateUtil(stepDetail.getLastSyncTime(), true).isToday()) {
                        concurrentHashMap3 = this.this$0.historyDate;
                        concurrentHashMap3.remove(stepDetail.getDateStr());
                        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "exists data remove date:" + stepDetail.getDateStr());
                    }
                }
            }
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, "sync history step detail");
            concurrentHashMap = this.this$0.historyDate;
            com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, concurrentHashMap);
            concurrentHashMap2 = this.this$0.historyDate;
            this.label = 1;
            if (flowCollector.emit(concurrentHashMap2, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
