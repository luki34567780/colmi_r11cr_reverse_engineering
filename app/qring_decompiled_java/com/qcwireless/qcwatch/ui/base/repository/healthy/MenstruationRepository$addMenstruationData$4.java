package com.qcwireless.qcwatch.ui.base.repository.healthy;

/* compiled from: MenstruationRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "", "t", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$4", f = "MenstruationRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class MenstruationRepository$addMenstruationData$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, ? extends java.lang.Integer>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;

    MenstruationRepository$addMenstruationData$4(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$4> continuation) {
        super(3, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.Map<java.lang.String, java.lang.Integer>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$4 menstruationRepository$addMenstruationData$4 = new com.qcwireless.qcwatch.ui.base.repository.healthy.MenstruationRepository$addMenstruationData$4(continuation);
        menstruationRepository$addMenstruationData$4.L$0 = th;
        return menstruationRepository$addMenstruationData$4.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ((java.lang.Throwable) this.L$0).printStackTrace();
        com.iwown.awlog.AwLog.i(com.iwown.awlog.Author.HeZhiYuan, kotlin.Unit.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
