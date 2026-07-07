package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastMenstruationItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem$queryTodayStatus$1", f = "LastMenstruationItem.kt", i = {0}, l = {23, 23}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: /tmp/dex/classes2.dex */
final class LastMenstruationItem$queryTodayStatus$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LastMenstruationItem$queryTodayStatus$1(com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem lastMenstruationItem, kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem$queryTodayStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = lastMenstruationItem;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> lastMenstruationItem$queryTodayStatus$1 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem$queryTodayStatus$1(this.this$0, continuation);
        lastMenstruationItem$queryTodayStatus$1.L$0 = obj;
        return lastMenstruationItem$queryTodayStatus$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Integer> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository.INSTANCE.getGetInstance().addMenstruationData(new com.qcwireless.qc_utils.date.DateUtil(), (kotlin.coroutines.Continuation) this);
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
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem lastMenstruationItem = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (((kotlinx.coroutines.flow.Flow) obj).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem$queryTodayStatus$1.1
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                return emit((java.util.Map<java.lang.String, java.lang.Integer>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
            }

            public final java.lang.Object emit(java.util.Map<java.lang.String, java.lang.Integer> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Integer num = map.get(com.qcwireless.qcwatch.ui.home.healthy.bean.LastMenstruationItem.this.getDateStr());
                java.lang.Object emit = flowCollector.emit(kotlin.coroutines.jvm.internal.Boxing.boxInt(num != null ? num.intValue() : 4), continuation);
                return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
            }
        }, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
