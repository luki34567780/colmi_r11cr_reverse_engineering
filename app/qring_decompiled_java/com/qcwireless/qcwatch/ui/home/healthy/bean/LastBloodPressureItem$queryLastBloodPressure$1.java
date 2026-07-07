package com.qcwireless.qcwatch.ui.home.healthy.bean;

/* compiled from: LastBloodPressureItem.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/qcwireless/qcwatch/ui/base/view/QBloodPressureChartHomeView$BpDataBean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem$queryLastBloodPressure$1", f = "LastBloodPressureItem.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class LastBloodPressureItem$queryLastBloodPressure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    LastBloodPressureItem$queryLastBloodPressure$1(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem$queryLastBloodPressure$1> continuation) {
        super(2, continuation);
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit> lastBloodPressureItem$queryLastBloodPressure$1 = new com.qcwireless.qcwatch.ui.home.healthy.bean.LastBloodPressureItem$queryLastBloodPressure$1(continuation);
        lastBloodPressureItem$queryLastBloodPressure$1.L$0 = obj;
        return lastBloodPressureItem$queryLastBloodPressure$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.qcwireless.qcwatch.ui.base.view.QBloodPressureChartHomeView.BpDataBean>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((kotlinx.coroutines.flow.FlowCollector) this.L$0).emit(com.qcwireless.qcwatch.ui.base.repository.healthy.BloodPressureRepository.INSTANCE.getGetInstance().queryLastBpValue(com.qcwireless.qcwatch.base.pref.UserConfig.INSTANCE.getInstance().getDeviceAddressNoClear()), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
