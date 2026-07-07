package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: StepDetailRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "", "t", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$3", f = "StepDetailRepository.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class StepDetailRepository$syncHistoryStepDetail$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, ? extends java.lang.Integer>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepDetailRepository$syncHistoryStepDetail$3(com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository stepDetailRepository, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$3> continuation) {
        super(3, continuation);
        this.this$0 = stepDetailRepository;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, java.lang.Integer>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$3 stepDetailRepository$syncHistoryStepDetail$3 = new com.qcwireless.qcwatch.ui.base.repository.healthy.StepDetailRepository$syncHistoryStepDetail$3(this.this$0, continuation);
        stepDetailRepository$syncHistoryStepDetail$3.L$0 = flowCollector;
        stepDetailRepository$syncHistoryStepDetail$3.L$1 = th;
        return stepDetailRepository$syncHistoryStepDetail$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            ((java.lang.Throwable) this.L$1).printStackTrace();
            com.qcwireless.qc_utils.date.DateUtil dateUtil = new com.qcwireless.qc_utils.date.DateUtil();
            for (int i2 = 1; i2 < 7; i2++) {
                dateUtil.addDay(-1);
                concurrentHashMap2 = this.this$0.historyDate;
                java.lang.String y_m_d = dateUtil.getY_M_D();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y_m_d, "date.y_M_D");
                concurrentHashMap2.put(y_m_d, kotlin.coroutines.jvm.internal.Boxing.boxInt(i2));
            }
            concurrentHashMap = this.this$0.historyDate;
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(concurrentHashMap, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
