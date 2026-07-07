package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastBloodSugarItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/entity/AppBloodSugarEntity;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodSugarItem$queryLastBloodSugar$1", f = "LastBloodSugarItem.kt", i = {}, l = {25, 27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LastBloodSugarItem$queryLastBloodSugar$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    LastBloodSugarItem$queryLastBloodSugar$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodSugarItem$queryLastBloodSugar$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> lastBloodSugarItem$queryLastBloodSugar$1 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodSugarItem$queryLastBloodSugar$1(continuation);
        lastBloodSugarItem$queryLastBloodSugar$1.L$0 = obj;
        return lastBloodSugarItem$queryLastBloodSugar$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity queryAppSugarLast = com.qcwireless.qcwatch.ui.base.repository.healthy.BloodSugarRepository.INSTANCE.getGetInstance().queryAppSugarLast();
            if (queryAppSugarLast != null) {
                this.label = 1;
                if (flowCollector.emit(queryAppSugarLast, (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.label = 2;
                if (flowCollector.emit(new com.qcwireless.qcwatch.ui.base.repository.entity.AppBloodSugarEntity("aa:bb:cc", "2020", 0, 0), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return kotlin.Unit.INSTANCE;
    }
}
