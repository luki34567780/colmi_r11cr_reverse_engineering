package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastBloodPressureItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodPressureChartHomeView$BpDataBean;", "e", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem$queryLastBloodPressure$3", f = "LastBloodPressureItem.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LastBloodPressureItem$queryLastBloodPressure$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;

    LastBloodPressureItem$queryLastBloodPressure$3(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem$queryLastBloodPressure$3> continuation) {
        super(3, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem$queryLastBloodPressure$3 lastBloodPressureItem$queryLastBloodPressure$3 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem$queryLastBloodPressure$3(continuation);
        lastBloodPressureItem$queryLastBloodPressure$3.L$0 = th;
        return lastBloodPressureItem$queryLastBloodPressure$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ((java.lang.Throwable) this.L$0).printStackTrace();
        return kotlin.Unit.INSTANCE;
    }
}
