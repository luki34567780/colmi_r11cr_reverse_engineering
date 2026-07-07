package com.qcwireless.qcwatch.ui.base.repository.device;

/* compiled from: OTARepository.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/qcwireless/qcwatch/ui/base/repository/mine/NetState;", "Ljava/util/ArrayList;", "Lcom/qcwireless/qcwatch/ui/base/bean/response/device/DeviceMissFileResp;", "Lkotlin/collections/ArrayList;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$getDeviceMissFileFromServer$4", f = "OTARepository.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/dex/classes2.dex */
final class OTARepository$getDeviceMissFileFromServer$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.ArrayList<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp>>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;

    OTARepository$getDeviceMissFileFromServer$4(kotlin.coroutines.Continuation<? super com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$getDeviceMissFileFromServer$4> continuation) {
        super(3, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.qcwireless.qcwatch.ui.base.repository.mine.NetState<java.util.ArrayList<com.qcwireless.qcwatch.ui.base.bean.response.device.DeviceMissFileResp>>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$getDeviceMissFileFromServer$4 oTARepository$getDeviceMissFileFromServer$4 = new com.qcwireless.qcwatch.ui.base.repository.device.OTARepository$getDeviceMissFileFromServer$4(continuation);
        oTARepository$getDeviceMissFileFromServer$4.L$0 = flowCollector;
        return oTARepository$getDeviceMissFileFromServer$4.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((kotlinx.coroutines.flow.FlowCollector) this.L$0).emit(new com.qcwireless.qcwatch.ui.base.repository.mine.NetState(false, null, com.qcwireless.qcwatch.ui.base.api.RetCodeValue.ErrorCode_0, false, 11, null), (kotlin.coroutines.Continuation) this) == coroutine_suspended) {
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
